/**
 */
package org.eclipse.smarthome.core.location.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.smarthome.core.items.Item;

import org.eclipse.smarthome.core.location.AssignableProvider;
import org.eclipse.smarthome.core.location.ContinuousLocation;
import org.eclipse.smarthome.core.location.DiscreteLocation;
import org.eclipse.smarthome.core.location.GeoLocation;
import org.eclipse.smarthome.core.location.LocatableItem;
import org.eclipse.smarthome.core.location.Location;
import org.eclipse.smarthome.core.location.LocationFactory;
import org.eclipse.smarthome.core.location.LocationPackage;
import org.eclipse.smarthome.core.location.LocationProvider;
import org.eclipse.smarthome.core.location.Person;
import org.eclipse.smarthome.core.location.RoomPosition;

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
	private EClass personEClass = null;

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
	private EClass locationProviderEClass = null;

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
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locatableItemEClass = null;

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
	public EClass getPerson() {
		return personEClass;
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
	public EReference getLocation_ContainedSubjects() {
		return (EReference)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Time() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getLocationProvider_Name() {
		return (EAttribute)locationProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocationProvider__ProvideLocations() {
		return locationProviderEClass.getEOperations().get(0);
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
	public EReference getAssignableProvider_Owner() {
		return (EReference)assignableProviderEClass.getEStructuralFeatures().get(0);
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
	public EReference getDiscreteLocation_SubLocations() {
		return (EReference)discreteLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteLocation_AdjacentLocations() {
		return (EReference)discreteLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscreteLocation_Name() {
		return (EAttribute)discreteLocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocatableItem() {
		return locatableItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocatableItem_Location() {
		return (EReference)locatableItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocatableItem_AssignedProviders() {
		return (EReference)locatableItemEClass.getEStructuralFeatures().get(1);
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
		personEClass = createEClass(PERSON);

		locationEClass = createEClass(LOCATION);
		createEReference(locationEClass, LOCATION__CONTAINED_SUBJECTS);
		createEAttribute(locationEClass, LOCATION__TIME);

		locationProviderEClass = createEClass(LOCATION_PROVIDER);
		createEAttribute(locationProviderEClass, LOCATION_PROVIDER__NAME);
		createEOperation(locationProviderEClass, LOCATION_PROVIDER___PROVIDE_LOCATIONS);

		assignableProviderEClass = createEClass(ASSIGNABLE_PROVIDER);
		createEReference(assignableProviderEClass, ASSIGNABLE_PROVIDER__OWNER);

		roomPositionEClass = createEClass(ROOM_POSITION);

		continuousLocationEClass = createEClass(CONTINUOUS_LOCATION);
		createEAttribute(continuousLocationEClass, CONTINUOUS_LOCATION__ACCURACY);
		createEAttribute(continuousLocationEClass, CONTINUOUS_LOCATION__X);
		createEAttribute(continuousLocationEClass, CONTINUOUS_LOCATION__Y);
		createEAttribute(continuousLocationEClass, CONTINUOUS_LOCATION__Z);

		discreteLocationEClass = createEClass(DISCRETE_LOCATION);
		createEReference(discreteLocationEClass, DISCRETE_LOCATION__SUB_LOCATIONS);
		createEReference(discreteLocationEClass, DISCRETE_LOCATION__ADJACENT_LOCATIONS);
		createEAttribute(discreteLocationEClass, DISCRETE_LOCATION__NAME);

		itemEClass = createEClass(ITEM);

		locatableItemEClass = createEClass(LOCATABLE_ITEM);
		createEReference(locatableItemEClass, LOCATABLE_ITEM__LOCATION);
		createEReference(locatableItemEClass, LOCATABLE_ITEM__ASSIGNED_PROVIDERS);

		stateEClass = createEClass(STATE);

		geoLocationEClass = createEClass(GEO_LOCATION);
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
		personEClass.getESuperTypes().add(this.getLocatableItem());
		locationEClass.getESuperTypes().add(this.getState());
		assignableProviderEClass.getESuperTypes().add(this.getLocationProvider());
		roomPositionEClass.getESuperTypes().add(this.getContinuousLocation());
		continuousLocationEClass.getESuperTypes().add(this.getLocation());
		discreteLocationEClass.getESuperTypes().add(this.getLocation());
		locatableItemEClass.getESuperTypes().add(this.getItem());
		geoLocationEClass.getESuperTypes().add(this.getContinuousLocation());

		// Initialize classes, features, and operations; add parameters
		initEClass(personEClass, Person.class, "Person", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locationEClass, Location.class, "Location", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocation_ContainedSubjects(), this.getLocatableItem(), null, "containedSubjects", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Time(), ecorePackage.getEDate(), "time", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationProviderEClass, LocationProvider.class, "LocationProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocationProvider_Name(), ecorePackage.getEString(), "name", null, 0, 1, LocationProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLocationProvider__ProvideLocations(), this.getLocation(), "provideLocations", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(assignableProviderEClass, AssignableProvider.class, "AssignableProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignableProvider_Owner(), this.getLocatableItem(), null, "owner", null, 0, 1, AssignableProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomPositionEClass, RoomPosition.class, "RoomPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(continuousLocationEClass, ContinuousLocation.class, "ContinuousLocation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContinuousLocation_Accuracy(), ecorePackage.getEFloat(), "accuracy", null, 0, 1, ContinuousLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContinuousLocation_X(), ecorePackage.getEDouble(), "x", null, 0, 1, ContinuousLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContinuousLocation_Y(), ecorePackage.getEDouble(), "y", null, 0, 1, ContinuousLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContinuousLocation_Z(), ecorePackage.getEDouble(), "z", null, 0, 1, ContinuousLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discreteLocationEClass, DiscreteLocation.class, "DiscreteLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscreteLocation_SubLocations(), this.getLocation(), null, "subLocations", null, 0, -1, DiscreteLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscreteLocation_AdjacentLocations(), this.getDiscreteLocation(), null, "adjacentLocations", null, 0, -1, DiscreteLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscreteLocation_Name(), ecorePackage.getEString(), "name", null, 0, 1, DiscreteLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(locatableItemEClass, LocatableItem.class, "LocatableItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocatableItem_Location(), this.getLocation(), null, "location", null, 0, 1, LocatableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocatableItem_AssignedProviders(), this.getAssignableProvider(), null, "assignedProviders", null, 0, -1, LocatableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(geoLocationEClass, GeoLocation.class, "GeoLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //LocationPackageImpl
