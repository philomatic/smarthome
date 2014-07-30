/**
 */
package org.eclipse.smarthome.core.location;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.smarthome.core.thing.Thing;

import org.eclipse.smarthome.core.types.State;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.smarthome.core.location.Location#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.smarthome.core.location.Location#getSubLocations <em>Sub Locations</em>}</li>
 *   <li>{@link org.eclipse.smarthome.core.location.Location#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smarthome.core.location.Location#getContainedThings <em>Contained Things</em>}</li>
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
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.smarthome.core.location.Location#getSubLocations <em>Sub Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Location)
	 * @see org.eclipse.smarthome.core.location.LocationPackage#getLocation_Parent()
	 * @see org.eclipse.smarthome.core.location.Location#getSubLocations
	 * @model opposite="subLocations" transient="false"
	 * @generated
	 */
	Location getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.smarthome.core.location.Location#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Location value);

	/**
	 * Returns the value of the '<em><b>Sub Locations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smarthome.core.location.Location}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.smarthome.core.location.Location#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Locations</em>' containment reference list.
	 * @see org.eclipse.smarthome.core.location.LocationPackage#getLocation_SubLocations()
	 * @see org.eclipse.smarthome.core.location.Location#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Location> getSubLocations();

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
	 * @see org.eclipse.smarthome.core.location.LocationPackage#getLocation_Name()
	 * @model dataType="org.eclipse.smarthome.core.location.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.smarthome.core.location.Location#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contained Things</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.smarthome.core.thing.Thing}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Things</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Things</em>' attribute list.
	 * @see org.eclipse.smarthome.core.location.LocationPackage#getLocation_ContainedThings()
	 * @model dataType="org.eclipse.smarthome.core.location.Thing"
	 * @generated
	 */
	EList<Thing> getContainedThings();

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.smarthome.core.location.String" ordered="false"
	 * @generated
	 */
	String fullStringRepresentation();

} // Location
