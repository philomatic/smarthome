/**
 */
package org.eclipse.smarthome.core.location;

import java.util.List;

public interface LocationListener {
	
	/**
	 * Call this method for new location updates on the LocationListener.
	 * 
	 * 
	 * @param newLocations If multiple subjects are recognized, then a Location child node for each subject should be existens in th.
	 * Not a single root (resp. parent) node containing multiple subjects!
	 * @param provider The provider which provided the given locations. This is important for location merge algorithms, e.g. if the provider is assignable or not.
	 */
	void locationUpdate(List<Location> newLocations, LocationProvider provider);

} // LocationListener
