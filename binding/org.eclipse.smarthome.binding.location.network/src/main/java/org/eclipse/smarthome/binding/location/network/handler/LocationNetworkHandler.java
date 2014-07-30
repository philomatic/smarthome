/**
 * Copyright (c) 2014 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.binding.location.network.handler;

import static org.eclipse.smarthome.binding.location.network.LocationNetworkBindingConstants.CHANNEL_PING;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.smarthome.binding.location.LocationBindingConstants;
import org.eclipse.smarthome.core.library.types.OnOffType;
import org.eclipse.smarthome.core.location.AssignableProvider;
import org.eclipse.smarthome.core.location.Location;
import org.eclipse.smarthome.core.location.LocationListener;
import org.eclipse.smarthome.core.thing.ChannelUID;
import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.thing.ThingRegistryChangeListener;
import org.eclipse.smarthome.core.thing.ThingTypeUID;
import org.eclipse.smarthome.core.thing.ThingUID;
import org.eclipse.smarthome.core.thing.binding.BaseThingHandler;
import org.eclipse.smarthome.core.types.Command;
import org.eclipse.smarthome.core.types.State;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * The {@link LocationNetworkHandler} is responsible for handling commands,
 * which are sent to one of the channels.
 * 
 * @author Patrick Gottschaemmer - Initial contribution
 */
public class LocationNetworkHandler extends BaseThingHandler implements
		AssignableProvider {

	// dependencies on location binding
	private static ThingTypeUID LOCATION_BINDING_TYPE_USER = LocationBindingConstants.THING_TYPE_USER;

	private Location currentLocation;

	private Logger logger = LoggerFactory
			.getLogger(LocationNetworkHandler.class);
	private Map<LocationListener, Location> listeners = Maps.newHashMap();
	private Thing owner;
	private String[] locationArray;

	public LocationNetworkHandler(Thing thing) {
		super(thing);
	}

	@Override
	public void handleCommand(ChannelUID channelUID, Command command) {
		if (channelUID.getId().equals(CHANNEL_PING)) {
		}
	}

	@Override
	public void initialize() {
		// set locationArray
		String locationConfig = (String) getConfig().get("location");
		locationArray = StringUtils.split(locationConfig, "/");

		final String owner = (String) getThing().getConfiguration().get("owner");

		// check if user is already known
		Optional<Thing> userThing = Optional.fromNullable(thingRegistry
				.getByUID(new ThingUID(LOCATION_BINDING_TYPE_USER, owner)));

		if (userThing.isPresent()) {
			setOwner(userThing.get());
		}

		// register for new users
		thingRegistry.addThingRegistryChangeListener(new ThingRegistryChangeListener() {

					@Override
					public void thingRemoved(Thing thing) {

						if (thing.getUID().getId().equals(owner))
							setOwner(null);
					}

					@Override
					public void thingAdded(Thing thing) {
						if (thing.getUID().getId().equals(owner)) {
							setOwner(thing);
						}
					}
				});
	}

	@Override
	public void handleUpdate(ChannelUID channelUID, State newState) {
					
		Date time = new Date();
		for (LocationListener listener : listeners.keySet()) {
			// create a new instance of location model
			Location root = EcoreUtil.copy(listeners.get(listener));
			
			// is the Listener interested in this model?
			Optional<Location> location = findLocationInModel(locationArray, root);
			
			// set found location as root for ourselves
			if (location.isPresent()){
				root = location.get();
				root.setTime(time);
				
				if (newState.equals(OnOffType.ON)){
					root.getContainedThings().add(getOwner());			
				}
				listener.locationUpdate(Lists.newArrayList(root), this);
				currentLocation = root;
			}
		}
	}

	private Optional<Location> findLocationInModel(String[] locationArray,
			Location root) {

		if (!(locationArray[0].equals(root.getName()))) {
			return Optional.absent();
		}

		Location current = root;
		for (int i = 1; i < locationArray.length; i++) {
			String locationString = locationArray[i];

			for (Location location : current.getSubLocations()) {
				if (location.getName().equals(locationString)) {
					current = location;
					break;
				}
			}

		}
		return Optional.of(current);
	}

	@Override
	public boolean register(LocationListener listener, Location rootLocation) {
		listeners.put(listener, rootLocation);
		return true;
	}

	@Override
	public boolean unregister(LocationListener listener) {
		listeners.remove(listener);
		return true;
	}

	@Override
	public Thing getOwner() {
		return owner;
	}

	@Override
	public void setOwner(Thing value) {
		this.owner = value;

	}

	/**
	 * Note: refresh value is ignored currently.
	 */
	@Override
	public List<Location> provideLocations(boolean refresh) {
		return Lists.newArrayList(currentLocation);
	}
	
	@Override
	public boolean isAssignable() {
		return true;
	}

	@Override
	public AssignableProvider asAssignableProvider() {
		if (isAssignable()){
			return (AssignableProvider) this;
		}
		return null;
	}
}
