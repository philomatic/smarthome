/**
 */
package org.eclipse.smarthome.core.location.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.smarthome.core.location.AssignableProvider;
import org.eclipse.smarthome.core.location.ContinuousLocation;
import org.eclipse.smarthome.core.location.DiscreteLocation;
import org.eclipse.smarthome.core.location.GeoLocation;
import org.eclipse.smarthome.core.location.Location;
import org.eclipse.smarthome.core.location.LocationFactory;
import org.eclipse.smarthome.core.location.LocationListener;
import org.eclipse.smarthome.core.location.LocationPackage;
import org.eclipse.smarthome.core.location.LocationProvider;
import org.eclipse.smarthome.core.location.RoomPosition;

import org.eclipse.smarthome.core.thing.Thing;

import org.eclipse.smarthome.core.types.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocationPackageImpl extends EPackageImpl implements LocationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignableProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geoLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType thingEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.smarthome.core.location.LocationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LocationPackageImpl() {
		super(eNS_URI, LocationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LocationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LocationPackage init() {
		if (isInited) return (LocationPackage)EPackage.Registry.INSTANCE.getEPackage(LocationPackage.eNS_URI);

		// Obtain or create and register package
		LocationPackageImpl theLocationPackage = (LocationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LocationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LocationPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theLocationPackage.createPackageContents();

		// Initialize created meta-data
		theLocationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLocationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LocationPackage.eNS_URI, theLocationPackage);
		return theLocationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Parent() {
		return (EReference)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_SubLocations() {
		return (EReference)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Name() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_ContainedThings() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Time() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__FullStringRepresentation() {
		return locationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignableProvider() {
		return assignableProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignableProvider_Owner() {
		return (EAttribute)assignableProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomPosition() {
		return roomPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuousLocation() {
		return continuousLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContinuousLocation_Accuracy() {
		return (EAttribute)continuousLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContinuousLocation_X() {
		return (EAttribute)continuousLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContinuousLocation_Y() {
		return (EAttribute)continuousLocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContinuousLocation_Z() {
		return (EAttribute)continuousLocationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscreteLocation() {
		return discreteLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteLocation_AdjacentLocations() {
		return (EReference)discreteLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeoLocation() {
		return geoLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationListener() {
		return locationListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocationListener__LocationUpdate__EList() {
		return locationListenerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationProvider() {
		return locationProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocationProvider__ProvideLocations__boolean() {
		return locationProviderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocationProvider__Register__LocationListener() {
		return locationProviderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocationProvider__Unregister__LocationListener() {
		return locationProviderEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocationProvider__IsAssignable() {
		return locationProviderEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocationProvider__AsAssignableProvider() {
		return locationProviderEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getThing() {
		return thingEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getboolean() {
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationFactory getLocationFactory() {
		return (LocationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		locationEClass = createEClass(LOCATION);
		createEReference(locationEClass, LOCATION__PARENT);
		createEReference(locationEClass, LOCATION__SUB_LOCATIONS);
		createEAttribute(locationEClass, LOCATION__NAME);
		createEAttribute(locationEClass, LOCATION__CONTAINED_THINGS);
		createEAttribute(locationEClass, LOCATION__TIME);
		createEOperation(locationEClass, LOCATION___FULL_STRING_REPRESENTATION);

		assignableProviderEClass = createEClass(ASSIGNABLE_PROVIDER);
		createEAttribute(assignableProviderEClass, ASSIGNABLE_PROVIDER__OWNER);

		roomPositionEClass = createEClass(ROOM_POSITION);

		continuousLocationEClass = createEClass(CONTINUOUS_LOCATION);
		createEAttribute(continuousLocationEClass, CONTINUOUS_LOCATION__ACCURACY);
		createEAttribute(continuousLocationEClass, CONTINUOUS_LOCATION__X);
		createEAttribute(continuousLocationEClass, CONTINUOUS_LOCATION__Y);
		createEAttribute(continuousLocationEClass, CONTINUOUS_LOCATION__Z);

		discreteLocationEClass = createEClass(DISCRETE_LOCATION);
		createEReference(discreteLocationEClass, DISCRETE_LOCATION__ADJACENT_LOCATIONS);

		stateEClass = createEClass(STATE);

		geoLocationEClass = createEClass(GEO_LOCATION);

		locationListenerEClass = createEClass(LOCATION_LISTENER);
		createEOperation(locationListenerEClass, LOCATION_LISTENER___LOCATION_UPDATE__ELIST);

		locationProviderEClass = createEClass(LOCATION_PROVIDER);
		createEOperation(locationProviderEClass, LOCATION_PROVIDER___PROVIDE_LOCATIONS__BOOLEAN);
		createEOperation(locationProviderEClass, LOCATION_PROVIDER___REGISTER__LOCATIONLISTENER);
		createEOperation(locationProviderEClass, LOCATION_PROVIDER___UNREGISTER__LOCATIONLISTENER);
		createEOperation(locationProviderEClass, LOCATION_PROVIDER___IS_ASSIGNABLE);
		createEOperation(locationProviderEClass, LOCATION_PROVIDER___AS_ASSIGNABLE_PROVIDER);

		// Create data types
		thingEDataType = createEDataType(THING);
		stringEDataType = createEDataType(STRING);
		booleanEDataType = createEDataType(BOOLEAN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		locationEClass.getESuperTypes().add(this.getState());
		assignableProviderEClass.getESuperTypes().add(this.getLocationProvider());
		roomPositionEClass.getESuperTypes().add(this.getContinuousLocation());
		continuousLocationEClass.getESuperTypes().add(this.getLocation());
		discreteLocationEClass.getESuperTypes().add(this.getLocation());
		geoLocationEClass.getESuperTypes().add(this.getContinuousLocation());

		// Initialize classes, features, and operations; add parameters
		initEClass(locationEClass, Location.class, "Location", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocation_Parent(), this.getLocation(), this.getLocation_SubLocations(), "parent", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_SubLocations(), this.getLocation(), this.getLocation_Parent(), "subLocations", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Name(), this.getString(), "name", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_ContainedThings(), this.getThing(), "containedThings", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Time(), ecorePackage.getEDate(), "time", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLocation__FullStringRepresentation(), this.getString(), "fullStringRepresentation", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(assignableProviderEClass, AssignableProvider.class, "AssignableProvider", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssignableProvider_Owner(), this.getThing(), "owner", null, 1, 1, AssignableProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomPositionEClass, RoomPosition.class, "RoomPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(continuousLocationEClass, ContinuousLocation.class, "ContinuousLocation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContinuousLocation_Accuracy(), ecorePackage.getEFloat(), "accuracy", "-1", 0, 1, ContinuousLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContinuousLocation_X(), ecorePackage.getEDouble(), "x", null, 0, 1, ContinuousLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContinuousLocation_Y(), ecorePackage.getEDouble(), "y", null, 0, 1, ContinuousLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContinuousLocation_Z(), ecorePackage.getEDouble(), "z", null, 0, 1, ContinuousLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discreteLocationEClass, DiscreteLocation.class, "DiscreteLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscreteLocation_AdjacentLocations(), this.getDiscreteLocation(), null, "adjacentLocations", null, 0, -1, DiscreteLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(geoLocationEClass, GeoLocation.class, "GeoLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locationListenerEClass, LocationListener.class, "LocationListener", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getLocationListener__LocationUpdate__EList(), null, "locationUpdate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLocation(), "newLocations", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(locationProviderEClass, LocationProvider.class, "LocationProvider", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getLocationProvider__ProvideLocations__boolean(), this.getLocation(), "provideLocations", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getboolean(), "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLocationProvider__Register__LocationListener(), null, "register", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLocationListener(), "listener", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLocationProvider__Unregister__LocationListener(), null, "unregister", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLocationListener(), "listener", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getLocationProvider__IsAssignable(), this.getboolean(), "isAssignable", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getLocationProvider__AsAssignableProvider(), this.getAssignableProvider(), "asAssignableProvider", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(thingEDataType, Thing.class, "Thing", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(booleanEDataType, boolean.class, "boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //LocationPackageImpl
