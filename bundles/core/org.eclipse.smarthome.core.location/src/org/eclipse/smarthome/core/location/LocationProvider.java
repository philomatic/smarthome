/**
 */
package org.eclipse.smarthome.core.location;

import java.util.List;

public interface LocationProvider {

	/**
	 * Provide the locations of recognized objects.
	 * If multiple subjects are recognized, then a Location child node for each subject should be returned.
	 * Not a single root (resp. parent) node containing multiple subjects!
	 * 
	 * E.g. for a sensitive floor system in a corridor, one (continuous) child location of corridor for each subject should be returned.
	 * 
	 * @param refresh If {@code true}, then the Location Provider should try to receive new locations by polling its hardware system.
	 * For {@code false}, the last known locations (of a single point in time) can be returned.
	 * 
	 * @return The list of provided child locations, discrete or continuous. 
	 */
	List<Location> provideLocations(boolean refresh);

	/**
	 * Given a model root Location, register a LocationListener for new location events in this Location model. 
	 * 
	 * @param listener
	 * @param rootLocation The root location of the given location model for this LocationListener
	 * @return {@code true} if this LocationListener was successfully registered with the given rootLocation, {@code false} otherwise
	 */
	boolean register(LocationListener listener, final Location rootLocation);

	/**
	 * Unregister the given LocationListener
	 * 
	 * @param listener The LocationListener to be unregistered
	 * @return {@code true} if this listener was successfully unregistered, {@code false} otherwise.
	 * 
	 */		 
	boolean unregister(LocationListener listener);
	
	/**
	 * 
	 * @return Whether this LocationProvider is an instance of AssignableProvider
	 * and has a {@code Thing} owner.
	 */
	boolean isAssignable();
	
	/**
	 * Always check {@code isAssignable()} first!
	 * 
	 * @return Returns this provider as the subclass {@code Assignable Provider}.
	 * If {@code isAssignable()==false}, {@code null} will be returned
	 */
	AssignableProvider asAssignableProvider();

} // LocationProvider
