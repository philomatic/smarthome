/**
 */
package org.eclipse.smarthome.core.location;

import org.eclipse.emf.ecore.EFactory;


/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smarthome.core.location.LocationPackage
 * @generated
 */
public interface LocationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LocationFactory eINSTANCE = org.eclipse.smarthome.core.location.impl.LocationFactoryImpl.init();
	/**
	 * Returns a new object of class '<em>Room Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Position</em>'.
	 * @generated
	 */
	RoomPosition createRoomPosition();

	/**
	 * Returns a new object of class '<em>Discrete Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discrete Location</em>'.
	 * @generated
	 */
	DiscreteLocation createDiscreteLocation();

	/**
	 * Returns a new object of class '<em>Geo Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geo Location</em>'.
	 * @generated
	 */
	GeoLocation createGeoLocation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LocationPackage getLocationPackage();

} //LocationFactory
