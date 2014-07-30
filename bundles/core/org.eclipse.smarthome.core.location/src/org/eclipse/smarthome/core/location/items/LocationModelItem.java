package org.eclipse.smarthome.core.location.items;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.smarthome.core.items.GenericItem;
import org.eclipse.smarthome.core.location.internal.LocationItemFactory;
import org.eclipse.smarthome.core.location.states.LocationModelType;
import org.eclipse.smarthome.core.types.Command;
import org.eclipse.smarthome.core.types.State;
import org.eclipse.smarthome.core.types.UnDefType;

public class LocationModelItem extends GenericItem {

	private static List<Class<? extends State>> acceptedDataTypes = new ArrayList<Class<? extends State>>();
	private static List<Class<? extends Command>> acceptedCommandTypes = new ArrayList<Class<? extends Command>>();
	
	static {
		acceptedDataTypes.add(LocationModelType.class);
		acceptedDataTypes.add(UnDefType.class);
	}
	
	public LocationModelItem(String name) {
		super(LocationItemFactory.ITEM_TYPE_LOCATION_MODEL, name);
	}
	
	public List<Class<? extends State>> getAcceptedDataTypes() {
		return acceptedDataTypes;
	}

	public List<Class<? extends Command>> getAcceptedCommandTypes() {
		return acceptedCommandTypes;
	}

}
