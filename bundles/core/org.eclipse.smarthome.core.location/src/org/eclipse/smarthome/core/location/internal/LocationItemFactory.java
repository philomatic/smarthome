package org.eclipse.smarthome.core.location.internal;

import org.eclipse.smarthome.core.items.GenericItem;
import org.eclipse.smarthome.core.location.items.LocatableItem;
import org.eclipse.smarthome.core.location.items.LocationModelItem;

public class LocationItemFactory implements org.eclipse.smarthome.core.items.ItemFactory {
	
	public static final String ITEM_TYPE_LOCATABLE = "Locatable";
	public static final String ITEM_TYPE_LOCATION_MODEL = "LocationModel";

	/**
	 * @{inheritDoc}
	 */
	@Override
	public GenericItem createItem(String itemTypeName, String itemName) {
		if (itemTypeName.equals(ITEM_TYPE_LOCATABLE)){
			return new LocatableItem(itemName);
		} if(itemTypeName.equals(ITEM_TYPE_LOCATION_MODEL)){
			return new LocationModelItem(itemName);
		}
		else {
			return null;
		}
	}
	
	/**
	 * @{inheritDoc}
	 */
	@Override
	public String[] getSupportedItemTypes() {
		return new String[] { ITEM_TYPE_LOCATABLE, ITEM_TYPE_LOCATION_MODEL };
	}

}
