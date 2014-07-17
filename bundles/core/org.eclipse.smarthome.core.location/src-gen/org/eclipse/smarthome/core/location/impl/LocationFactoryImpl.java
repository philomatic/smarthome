/**
 */
package org.eclipse.smarthome.core.location.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.smarthome.core.location.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocationFactoryImpl extends EFactoryImpl implements LocationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LocationFactory init() {
		try {
			LocationFactory theLocationFactory = (LocationFactory)EPackage.Registry.INSTANCE.getEFactory(LocationPackage.eNS_URI);
			if (theLocationFactory != null) {
				return theLocationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LocationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LocationPackage.LOCATION_PROVIDER: return createLocationProvider();
			case LocationPackage.ASSIGNABLE_PROVIDER: return createAssignableProvider();
			case LocationPackage.ROOM_POSITION: return createRoomPosition();
			case LocationPackage.DISCRETE_LOCATION: return createDiscreteLocation();
			case LocationPackage.GEO_LOCATION: return createGeoLocation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationProvider createLocationProvider() {
		LocationProviderImpl locationProvider = new LocationProviderImpl();
		return locationProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignableProvider createAssignableProvider() {
		AssignableProviderImpl assignableProvider = new AssignableProviderImpl();
		return assignableProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomPosition createRoomPosition() {
		RoomPositionImpl roomPosition = new RoomPositionImpl();
		return roomPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteLocation createDiscreteLocation() {
		DiscreteLocationImpl discreteLocation = new DiscreteLocationImpl();
		return discreteLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoLocation createGeoLocation() {
		GeoLocationImpl geoLocation = new GeoLocationImpl();
		return geoLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationPackage getLocationPackage() {
		return (LocationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LocationPackage getPackage() {
		return LocationPackage.eINSTANCE;
	}

} //LocationFactoryImpl
