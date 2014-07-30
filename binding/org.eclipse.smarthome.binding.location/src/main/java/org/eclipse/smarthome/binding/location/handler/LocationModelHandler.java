/**
 * Copyright (c) 2014 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.binding.location.handler;

import static org.eclipse.smarthome.binding.location.LocationBindingConstants.CHANNEL_LOCATABLE;
import static org.eclipse.smarthome.binding.location.LocationBindingConstants.CHANNEL_STATE;
import static org.eclipse.smarthome.binding.location.LocationBindingConstants.THING_TYPE_MODEL;
import static org.eclipse.smarthome.binding.location.LocationBindingConstants.THING_TYPE_USER;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.smarthome.binding.location.LocationMerger;
import org.eclipse.smarthome.config.core.Configuration;
import org.eclipse.smarthome.core.location.Location;
import org.eclipse.smarthome.core.location.LocationListener;
import org.eclipse.smarthome.core.location.LocationProvider;
import org.eclipse.smarthome.core.location.impl.LocationPackageImpl;
import org.eclipse.smarthome.core.location.states.LocationModelType;
import org.eclipse.smarthome.core.thing.ChannelUID;
import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.thing.ThingRegistryChangeListener;
import org.eclipse.smarthome.core.thing.binding.BaseThingHandler;
import org.eclipse.smarthome.core.thing.binding.ThingHandler;
import org.eclipse.smarthome.core.types.Command;
import org.eclipse.smarthome.core.types.UnDefType;
import org.osgi.util.tracker.ServiceTracker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

/**
 * The {@link LocationModelHandler} is responsible for handling commands, which are
 * sent to one of the channels.
 * 
 * @author Patrick Gottschaemmer - Initial contribution
 */
public class LocationModelHandler extends BaseThingHandler implements LocationListener {

    private static final Object LOCATION_MODEL_CONFIG = "locationModel";
	private Logger logger = LoggerFactory.getLogger(LocationModelHandler.class);
    private List<LocationProvider> providers = Lists.newLinkedList();
	private Location locationRoot;
	
	private List<Location> locationTimeSeries = Lists.newLinkedList();
	private ServiceTracker<LocationMerger, Object> tracker;
	
	public LocationModelHandler(Thing thing) {
		super(thing);
	}
	
	@Override
	public void initialize() {
		
		tracker = new ServiceTracker<>(bundleContext, LocationMerger.class, null);
		tracker.open();
		
		// load emf model
		Configuration config = getThing().getConfiguration();
		String locationFolder = new StringBuilder("conf")
									.append(File.separator)
									.append("locations")
									.toString();
		
		File locationModelPath = new File(locationFolder, (String) config.get(LOCATION_MODEL_CONFIG));
		locationRoot = loadEmfModel(locationModelPath);
		
		// add ourselves to existing location providers
		
		List<Thing> things = thingRegistry.getThings();
		
		for (Thing thing : things) {
			ThingHandler handler = thing.getHandler();
			if (handler instanceof LocationProvider){
				addLocationProvider((LocationProvider) handler);
			}
		}
		
		// register for new location providers
		
		thingRegistry.addThingRegistryChangeListener(new ThingRegistryChangeListener() {
			
			@Override
			public void thingRemoved(Thing thing) {
				ThingHandler handler = thing.getHandler();
				if (handler instanceof LocationProvider){
					removeLocationProvider((LocationProvider) handler);
				}
			}
			
			@Override
			public void thingAdded(Thing thing) {
				ThingHandler handler = thing.getHandler();
				if (handler instanceof LocationProvider){
					addLocationProvider((LocationProvider) handler);
				}
			}
		});
		
	}

	private Location loadEmfModel(File locationModel) {
		LocationPackageImpl.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		reg.getExtensionToFactoryMap().put("location",
				new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();

		Resource resource = resSet.getResource(
				URI.createFileURI(locationModel.toString()), true);

		return (Location) resource.getContents().get(0);
	}

	@Override
	public void handleCommand(ChannelUID channelUID, Command command) {
        if(channelUID.getId().equals(CHANNEL_STATE)) {
            // nothing to do here atm
        }
	}
	
	private void addLocationProvider(LocationProvider provider){
		providers.add(provider);
		provider.register(this, locationRoot);
	}
	
	private void removeLocationProvider(LocationProvider provider){
		provider.unregister(this);
		providers.remove(provider);
	}

	@Override
	public void locationUpdate(List<Location> newLocations, LocationProvider provider) {
		
		if (provider.isAssignable()){
			
			// highlander principle
			// a assigned provider can only provide one location at a time,
			// as a user can't be on two locations at same time!
			Location location = newLocations.get(0);
			locationTimeSeries.add(location);
		}else{
			
			// add all locations
			for (Location location : newLocations) {
				locationTimeSeries.add(location);
			}
		}
		
		// Call algorithm for location fusioning
		Optional<Location> update = callLocationMergeAlgorithm(newLocations);
		
		if (update.isPresent()){
			
			// first, check for all users if there is an location for them
			
			List<Thing> things = thingRegistry.getThings();
			List<Thing> remainUsers = Lists.newArrayList(Iterables.filter(things, new Predicate<Thing>() {

				@Override
				public boolean apply(Thing thing) {
					return thing.getThingTypeUID().equals(THING_TYPE_USER);
				}
			}));
			
			// check root location first for performance
			Location root = update.get();
			updateContainedThings(root, remainUsers);
			
			
			// check sublocations
			for (Iterator<EObject> iterator = root.eAllContents(); iterator
					.hasNext();) {
				Location location = (Location) iterator.next();
				updateContainedThings(location, remainUsers);
			}
			
			// set location to undefined for remaining users
			for (Thing thing : remainUsers) {
				ChannelUID channelUID = new ChannelUID(THING_TYPE_USER, thing.getUID().getId(), CHANNEL_LOCATABLE);
				updateState(channelUID, UnDefType.UNDEF);
			}
			
			// update location model state
			
			ChannelUID channelUID = new ChannelUID(THING_TYPE_MODEL, getThing().getUID().getId(), CHANNEL_STATE);
			updateState(channelUID, new LocationModelType(root));
		}
		
		
		
		// since the algortihm decided that there is no update, we won't fire anything and ignore this location event
		// however, the location event is memorized in locationEvents
		
	}

	private void updateContainedThings(Location update, List<Thing> remainUsers) {
		for (Thing thing : update.getContainedThings()) {
			updateContainedThing(update, thing);
			remainUsers.remove(thing);
		}
	}

	private void updateContainedThing(Location update, Thing thing) {
		ChannelUID channelUID = new ChannelUID(THING_TYPE_USER, thing.getUID().getId(), CHANNEL_LOCATABLE);
		thing.getHandler().handleUpdate(channelUID, update);
		
		// set Thing for parent locations
		while (update.getParent() != null) {
			update = update.getParent();
			update.getContainedThings().add(thing);
		}
	}

	private Optional<Location> callLocationMergeAlgorithm(List<Location> newLocations) {
		
		Optional<LocationMerger> merger = Optional.fromNullable((LocationMerger) tracker.getService());
		
		if (merger.isPresent()){
			
			LocationMerger locationMerger = merger.get();
			for (Location location : newLocations) {
				locationMerger.addLocationEvent(location);
			}
			
			return locationMerger.mergeLocations();
		}
		
		// no merger present? return last root location as model then
		
		Location loc = newLocations.get(newLocations.size() - 1);
		while (loc.getParent() != null) {
			loc = loc.getParent();
		}
		
		return Optional.of(loc);
	}
}
