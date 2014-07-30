package org.eclipse.smarthome.core.location.items;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.smarthome.core.items.GenericItem;
import org.eclipse.smarthome.core.location.Location;
import org.eclipse.smarthome.core.location.impl.DiscreteLocationImpl;
import org.eclipse.smarthome.core.location.impl.LocationImpl;
import org.eclipse.smarthome.core.location.internal.LocationItemFactory;
import org.eclipse.smarthome.core.types.Command;
import org.eclipse.smarthome.core.types.State;
import org.eclipse.smarthome.core.types.UnDefType;

public class LocatableItem extends GenericItem {

	private static List<Class<? extends State>> acceptedDataTypes = new ArrayList<Class<? extends State>>();
	private static List<Class<? extends Command>> acceptedCommandTypes = new ArrayList<Class<? extends Command>>();

	static {
		acceptedDataTypes.add(Location.class);
		acceptedDataTypes.add(LocationImpl.class);
		acceptedDataTypes.add(UnDefType.class);
	}
	
	public LocatableItem(String name) {
		super(LocationItemFactory.ITEM_TYPE_LOCATABLE, name);
	}

	public List<Class<? extends State>> getAcceptedDataTypes() {
		return acceptedDataTypes;
	}

	public List<Class<? extends Command>> getAcceptedCommandTypes() {
		return acceptedCommandTypes;
	}

}
