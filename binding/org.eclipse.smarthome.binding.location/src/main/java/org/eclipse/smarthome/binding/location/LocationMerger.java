package org.eclipse.smarthome.binding.location;

import java.util.Date;
import java.util.List;

import org.eclipse.smarthome.core.location.Location;

import com.google.common.base.Optional;

public interface LocationMerger {
	
	void setLocationModel(Location model);
	
	void addLocationEvent(Location location);
	void setLocationEvents(List<Location> locations);
	boolean removeLocationEvent(Location location);
	
	/**
	 * Merge the locations to an update location model, based on the added Location events.
	 * 
	 * Always return the root of the Location model!
	 * 
	 * The merge algorithm can decide if there is a significant update computable or not.
	 * 
	 * @return The root of the merged Location model, Optional.absent() if no update is available.
	 */
	Optional<Location> mergeLocations();
	
	/**
	 * Merge the Location models in location events between the two dates.
	 * 
	 * 
	 * @param from {@code null} will be treated as "no from boundary"
	 * @param to {@code null} will be treated as "no to boundary"
	 */
	Optional<Location> mergeLocationsFromTo(Date from, Date to);

}
