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
 *   <li>{@link org.eclipse.smarthome.core.location.DiscreteLocation#getSubLocations <em>Sub Locations</em>}</li>
 *   <li>{@link org.eclipse.smarthome.core.location.DiscreteLocation#getAdjacentLocations <em>Adjacent Locations</em>}</li>
 *   <li>{@link org.eclipse.smarthome.core.location.DiscreteLocation#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.smarthome.core.location.LocationPackage#getDiscreteLocation()
 * @model
 * @generated
 */
public interface DiscreteLocation extends Location {
	/**
	 * Returns the value of the '<em><b>Sub Locations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smarthome.core.location.Location}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Locations</em>' containment reference list.
	 * @see org.eclipse.smarthome.core.location.LocationPackage#getDiscreteLocation_SubLocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Location> getSubLocations();

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

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.smarthome.core.location.LocationPackage#getDiscreteLocation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.smarthome.core.location.DiscreteLocation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DiscreteLocation
