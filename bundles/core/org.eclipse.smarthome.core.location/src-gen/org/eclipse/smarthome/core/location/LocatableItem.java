/**
 */
package org.eclipse.smarthome.core.location;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.smarthome.core.items.Item;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Locatable Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.smarthome.core.location.LocatableItem#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.smarthome.core.location.LocatableItem#getAssignedProviders <em>Assigned Providers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.smarthome.core.location.LocationPackage#getLocatableItem()
 * @model abstract="true" superTypes="org.eclipse.smarthome.core.location.Item"
 * @generated
 */
public interface LocatableItem extends EObject, Item {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see org.eclipse.smarthome.core.location.LocationPackage#getLocatableItem_Location()
	 * @model
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.smarthome.core.location.LocatableItem#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Assigned Providers</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.smarthome.core.location.AssignableProvider}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Providers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Providers</em>' reference list.
	 * @see org.eclipse.smarthome.core.location.LocationPackage#getLocatableItem_AssignedProviders()
	 * @model
	 * @generated
	 */
	EList<AssignableProvider> getAssignedProviders();

} // LocatableItem
