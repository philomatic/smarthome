/**
 */
package org.eclipse.smarthome.core.location;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.smarthome.core.location.DiscreteLocation#getAdjacentLocations <em>Adjacent Locations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.smarthome.core.location.LocationPackage#getDiscreteLocation()
 * @model
 * @generated
 */
public interface DiscreteLocation extends Location {
	/**
	 * Returns the value of the '<em><b>Adjacent Locations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.smarthome.core.location.DiscreteLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adjacent Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjacent Locations</em>' reference list.
	 * @see org.eclipse.smarthome.core.location.LocationPackage#getDiscreteLocation_AdjacentLocations()
	 * @model
	 * @generated
	 */
	EList<DiscreteLocation> getAdjacentLocations();

} // DiscreteLocation
