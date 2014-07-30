/**
 */
package org.eclipse.smarthome.core.location;

import org.eclipse.smarthome.core.thing.Thing;

public interface AssignableProvider extends LocationProvider {

	Thing getOwner();

	void setOwner(Thing owner);

} // AssignableProvider
