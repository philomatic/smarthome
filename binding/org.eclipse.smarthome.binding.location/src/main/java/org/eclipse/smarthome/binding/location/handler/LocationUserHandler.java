package org.eclipse.smarthome.binding.location.handler;

import org.eclipse.smarthome.core.location.Location;
import org.eclipse.smarthome.core.thing.ChannelUID;
import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.thing.binding.BaseThingHandler;
import org.eclipse.smarthome.core.types.Command;
import org.eclipse.smarthome.core.types.State;

public class LocationUserHandler extends BaseThingHandler {

	public LocationUserHandler(Thing thing) {
		super(thing);
	}

	@Override
	public void handleUpdate(ChannelUID channelUID, State newState) {
		if (newState instanceof Location){
			updateState(channelUID, newState);
		}
	}
	
	

	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleCommand(ChannelUID channelUID, Command command) {
		// TODO Auto-generated method stub
		
	}

}
