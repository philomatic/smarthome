/**
 */
package org.eclipse.smarthome.core.location;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.smarthome.core.types.State;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.smarthome.core.location.Location#getContainedSubjects <em>Contained Subjects</em>}</li>
 *   <li>{@link org.eclipse.smarthome.core.location.Location#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.smarthome.core.location.LocationPackage#getLocation()
 * @model abstract="true" superTypes="org.eclipse.smarthome.core.location.State"
 * @generated
 */
public interface Location extends EObject, State {
	/**
	 * Returns the value of the '<em><b>Contained Subjects</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.smarthome.core.location.LocatableItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Subjects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Subjects</em>' reference list.
	 * @see org.eclipse.smarthome.core.location.LocationPackage#getLocation_ContainedSubjects()
	 * @model
	 * @generated
	 */
	EList<LocatableItem> getContainedSubjects();

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the time of this Location fix
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(Date)
	 * @see org.eclipse.smarthome.core.location.LocationPackage#getLocation_Time()
	 * @model
	 * @generated
	 */
	Date getTime();

	/**
	 * Sets the value of the '{@link org.eclipse.smarthome.core.location.Location#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Date value);

} // Location
