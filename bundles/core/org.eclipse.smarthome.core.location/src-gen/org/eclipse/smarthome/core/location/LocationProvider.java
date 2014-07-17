/**
 */
package org.eclipse.smarthome.core.location;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.smarthome.core.location.LocationProvider#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.smarthome.core.location.LocationPackage#getLocationProvider()
 * @model
 * @generated
 */
public interface LocationProvider extends EObject {
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
	 * @see org.eclipse.smarthome.core.location.LocationPackage#getLocationProvider_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.smarthome.core.location.LocationProvider#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * there could be multiple locations, e.g. for a capfloor recognizing multiple subjects
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<Location> provideLocations();

} // LocationProvider
