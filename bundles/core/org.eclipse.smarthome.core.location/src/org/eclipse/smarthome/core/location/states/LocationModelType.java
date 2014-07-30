package org.eclipse.smarthome.core.location.states;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.smarthome.core.location.Location;
import org.eclipse.smarthome.core.types.State;

public class LocationModelType implements State {
	
	
	private Location modelState;

	public LocationModelType(Location modelState) {
		this.modelState = modelState;
	}

	@Override
	public String format(String pattern) {
		StringBuffer sb = new StringBuffer("\n");
		sb.append(modelState.fullStringRepresentation());
		
		for (Iterator<EObject> iterator = modelState.eAllContents(); iterator
				.hasNext();) {
			Location location = (Location) iterator.next();
			sb.append("\n");
			sb.append(location.fullStringRepresentation());
		}
		return sb.toString();
	}
	
	@Override
	public String toString() {
		return format(null);
	}

}
