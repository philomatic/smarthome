/**
 */
package org.eclipse.smarthome.core.location;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignable Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.smarthome.core.location.AssignableProvider#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.smarthome.core.location.LocationPackage#getAssignableProvider()
 * @model
 * @generated
 */
public interface AssignableProvider extends LocationProvider {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(LocatableItem)
	 * @see org.eclipse.smarthome.core.location.LocationPackage#getAssignableProvider_Owner()
	 * @model
	 * @generated
	 */
	LocatableItem getOwner();

	/**
	 * Sets the value of the '{@link org.eclipse.smarthome.core.location.AssignableProvider#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(LocatableItem value);

} // AssignableProvider
