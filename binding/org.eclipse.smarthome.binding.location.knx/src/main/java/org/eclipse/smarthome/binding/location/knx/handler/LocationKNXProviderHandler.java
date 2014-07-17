/**
 * Copyright (c) 2014 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.binding.location.knx.handler;

import static org.eclipse.smarthome.binding.location.knx.LocationKNXBindingConstants.CHANNEL_SWITCH;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.smarthome.core.library.types.DateTimeType;
import org.eclipse.smarthome.core.location.AssignableProvider;
import org.eclipse.smarthome.core.location.Location;
import org.eclipse.smarthome.core.location.LocationListener;
import org.eclipse.smarthome.core.location.LocationProvider;
import org.eclipse.smarthome.core.thing.ChannelUID;
import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.thing.binding.BaseThingHandler;
import org.eclipse.smarthome.core.types.Command;
import org.eclipse.smarthome.core.types.State;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * The {@link LocationKNXProviderHandler} is responsible for handling commands,
 * which are sent to one of the channels.
 * 
 * @author Patrick Gottschaemmer - Initial contribution
 */
public class LocationKNXProviderHandler extends BaseThingHandler implements LocationProvider {

	private Logger logger = LoggerFactory
			.getLogger(LocationKNXProviderHandler.class);
	private Map<LocationListener, Location> listeners = Maps.newHashMap();
	private String[] locationArray;
	private Location lastKnownLocation;

	public LocationKNXProviderHandler(Thing thing) {
		super(thing);
	}

	@Override
	public void initialize() {
		String locationConfig = (String) getConfig().get("location");
		locationArray = StringUtils.split(locationConfig, "/");
	}
	
	@Override
    public void handleUpdate(ChannelUID channelUID, State newState) {
		
		if (newState instanceof DateTimeType){
			DateTimeType dateTime = (DateTimeType) newState;
		
		for (LocationListener listener : listeners.keySet()) {
			// create a new instance of location model
			Location root = EcoreUtil.copy(listeners.get(listener));
			
			// is the Listener interested in this model?
			Optional<Location> location = findLocationInModel(locationArray, root);
			
			// set found location as root for ourselves
			if (location.isPresent()){
				root = location.get();
				root.setTime(dateTime.getCalendar().getTime());
				
				listener.locationUpdate(Lists.newArrayList(root), this);
				
				// set last known location
				lastKnownLocation = root;
			}
		}
		}else{
			logger.debug("State {} is not supported for channel: {}", newState, channelUID.getId());
		}
    }

	private Optional<Location> findLocationInModel(String[] locationArray, Location root) {
		
		if (!(locationArray[0].equals(root.getName()))){
			return Optional.absent();
		}
		
		Location current = root;
		for (int i = 1; i < locationArray.length; i++) {
			String locationString = locationArray[i];
			
			for (Location location : current.getSubLocations()) {
				if (location.getName().equals(locationString)){
					current = location;
					break;
				}
			}
			
		}
		return Optional.of(current);
	}

	@Override
	public void handleCommand(ChannelUID channelUID, Command command) {
		if (channelUID.getId().equals(CHANNEL_SWITCH)) {
		}
	}

	@Override
	public List<Location> provideLocations(boolean refresh) {
		return Lists.newArrayList(lastKnownLocation);
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
	public boolean isAssignable() {
		return false;
	}

	@Override
	public AssignableProvider asAssignableProvider() {
		if (isAssignable()){
			return (AssignableProvider) this;
		}
		return null;
	}
}
