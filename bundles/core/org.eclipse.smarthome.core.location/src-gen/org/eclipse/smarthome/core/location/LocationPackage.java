/**
 */
package org.eclipse.smarthome.core.location;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.smarthome.core.location.LocationFactory
 * @model kind="package"
 * @generated
 */
public interface LocationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "location";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://location/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "location";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LocationPackage eINSTANCE = org.eclipse.smarthome.core.location.impl.LocationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.smarthome.core.items.Item <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smarthome.core.items.Item
	 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 7;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smarthome.core.location.impl.LocatableItemImpl <em>Locatable Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smarthome.core.location.impl.LocatableItemImpl
	 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getLocatableItem()
	 * @generated
	 */
	int LOCATABLE_ITEM = 8;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATABLE_ITEM__LOCATION = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assigned Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATABLE_ITEM__ASSIGNED_PROVIDERS = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Locatable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATABLE_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Locatable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATABLE_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smarthome.core.location.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smarthome.core.location.impl.PersonImpl
	 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LOCATION = LOCATABLE_ITEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Assigned Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ASSIGNED_PROVIDERS = LOCATABLE_ITEM__ASSIGNED_PROVIDERS;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = LOCATABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = LOCATABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smarthome.core.types.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smarthome.core.types.State
	 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getState()
	 * @generated
	 */
	int STATE = 9;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smarthome.core.location.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smarthome.core.location.impl.LocationImpl
	 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Contained Subjects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CONTAINED_SUBJECTS = STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__TIME = STATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = STATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smarthome.core.location.impl.LocationProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smarthome.core.location.impl.LocationProviderImpl
	 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getLocationProvider()
	 * @generated
	 */
	int LOCATION_PROVIDER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_PROVIDER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_PROVIDER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Provide Locations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_PROVIDER___PROVIDE_LOCATIONS = 0;

	/**
	 * The number of operations of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_PROVIDER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.smarthome.core.location.impl.AssignableProviderImpl <em>Assignable Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smarthome.core.location.impl.AssignableProviderImpl
	 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getAssignableProvider()
	 * @generated
	 */
	int ASSIGNABLE_PROVIDER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNABLE_PROVIDER__NAME = LOCATION_PROVIDER__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNABLE_PROVIDER__OWNER = LOCATION_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assignable Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNABLE_PROVIDER_FEATURE_COUNT = LOCATION_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Provide Locations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNABLE_PROVIDER___PROVIDE_LOCATIONS = LOCATION_PROVIDER___PROVIDE_LOCATIONS;

	/**
	 * The number of operations of the '<em>Assignable Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNABLE_PROVIDER_OPERATION_COUNT = LOCATION_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smarthome.core.location.impl.ContinuousLocationImpl <em>Continuous Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smarthome.core.location.impl.ContinuousLocationImpl
	 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getContinuousLocation()
	 * @generated
	 */
	int CONTINUOUS_LOCATION = 5;

	/**
	 * The feature id for the '<em><b>Contained Subjects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_LOCATION__CONTAINED_SUBJECTS = LOCATION__CONTAINED_SUBJECTS;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_LOCATION__TIME = LOCATION__TIME;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_LOCATION__ACCURACY = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_LOCATION__X = LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_LOCATION__Y = LOCATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_LOCATION__Z = LOCATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Continuous Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_LOCATION_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Continuous Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_LOCATION_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smarthome.core.location.impl.RoomPositionImpl <em>Room Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smarthome.core.location.impl.RoomPositionImpl
	 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getRoomPosition()
	 * @generated
	 */
	int ROOM_POSITION = 4;

	/**
	 * The feature id for the '<em><b>Contained Subjects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_POSITION__CONTAINED_SUBJECTS = CONTINUOUS_LOCATION__CONTAINED_SUBJECTS;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_POSITION__TIME = CONTINUOUS_LOCATION__TIME;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_POSITION__ACCURACY = CONTINUOUS_LOCATION__ACCURACY;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_POSITION__X = CONTINUOUS_LOCATION__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_POSITION__Y = CONTINUOUS_LOCATION__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_POSITION__Z = CONTINUOUS_LOCATION__Z;

	/**
	 * The number of structural features of the '<em>Room Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_POSITION_FEATURE_COUNT = CONTINUOUS_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Room Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_POSITION_OPERATION_COUNT = CONTINUOUS_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smarthome.core.location.impl.DiscreteLocationImpl <em>Discrete Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smarthome.core.location.impl.DiscreteLocationImpl
	 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getDiscreteLocation()
	 * @generated
	 */
	int DISCRETE_LOCATION = 6;

	/**
	 * The feature id for the '<em><b>Contained Subjects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_LOCATION__CONTAINED_SUBJECTS = LOCATION__CONTAINED_SUBJECTS;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_LOCATION__TIME = LOCATION__TIME;

	/**
	 * The feature id for the '<em><b>Sub Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_LOCATION__SUB_LOCATIONS = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Adjacent Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_LOCATION__ADJACENT_LOCATIONS = LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_LOCATION__NAME = LOCATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Discrete Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_LOCATION_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Discrete Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_LOCATION_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smarthome.core.location.impl.GeoLocationImpl <em>Geo Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smarthome.core.location.impl.GeoLocationImpl
	 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getGeoLocation()
	 * @generated
	 */
	int GEO_LOCATION = 10;

	/**
	 * The feature id for the '<em><b>Contained Subjects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION__CONTAINED_SUBJECTS = CONTINUOUS_LOCATION__CONTAINED_SUBJECTS;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION__TIME = CONTINUOUS_LOCATION__TIME;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION__ACCURACY = CONTINUOUS_LOCATION__ACCURACY;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION__X = CONTINUOUS_LOCATION__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION__Y = CONTINUOUS_LOCATION__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION__Z = CONTINUOUS_LOCATION__Z;

	/**
	 * The number of structural features of the '<em>Geo Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION_FEATURE_COUNT = CONTINUOUS_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Geo Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION_OPERATION_COUNT = CONTINUOUS_LOCATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.smarthome.core.location.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see org.eclipse.smarthome.core.location.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smarthome.core.location.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see org.eclipse.smarthome.core.location.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.smarthome.core.location.Location#getContainedSubjects <em>Contained Subjects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained Subjects</em>'.
	 * @see org.eclipse.smarthome.core.location.Location#getContainedSubjects()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_ContainedSubjects();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smarthome.core.location.Location#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.eclipse.smarthome.core.location.Location#getTime()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Time();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smarthome.core.location.LocationProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see org.eclipse.smarthome.core.location.LocationProvider
	 * @generated
	 */
	EClass getLocationProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smarthome.core.location.LocationProvider#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smarthome.core.location.LocationProvider#getName()
	 * @see #getLocationProvider()
	 * @generated
	 */
	EAttribute getLocationProvider_Name();

	/**
	 * Returns the meta object for the '{@link org.eclipse.smarthome.core.location.LocationProvider#provideLocations() <em>Provide Locations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provide Locations</em>' operation.
	 * @see org.eclipse.smarthome.core.location.LocationProvider#provideLocations()
	 * @generated
	 */
	EOperation getLocationProvider__ProvideLocations();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smarthome.core.location.AssignableProvider <em>Assignable Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignable Provider</em>'.
	 * @see org.eclipse.smarthome.core.location.AssignableProvider
	 * @generated
	 */
	EClass getAssignableProvider();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smarthome.core.location.AssignableProvider#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see org.eclipse.smarthome.core.location.AssignableProvider#getOwner()
	 * @see #getAssignableProvider()
	 * @generated
	 */
	EReference getAssignableProvider_Owner();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smarthome.core.location.RoomPosition <em>Room Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Position</em>'.
	 * @see org.eclipse.smarthome.core.location.RoomPosition
	 * @generated
	 */
	EClass getRoomPosition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smarthome.core.location.ContinuousLocation <em>Continuous Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continuous Location</em>'.
	 * @see org.eclipse.smarthome.core.location.ContinuousLocation
	 * @generated
	 */
	EClass getContinuousLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smarthome.core.location.ContinuousLocation#getAccuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy</em>'.
	 * @see org.eclipse.smarthome.core.location.ContinuousLocation#getAccuracy()
	 * @see #getContinuousLocation()
	 * @generated
	 */
	EAttribute getContinuousLocation_Accuracy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smarthome.core.location.ContinuousLocation#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.eclipse.smarthome.core.location.ContinuousLocation#getX()
	 * @see #getContinuousLocation()
	 * @generated
	 */
	EAttribute getContinuousLocation_X();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smarthome.core.location.ContinuousLocation#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.eclipse.smarthome.core.location.ContinuousLocation#getY()
	 * @see #getContinuousLocation()
	 * @generated
	 */
	EAttribute getContinuousLocation_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smarthome.core.location.ContinuousLocation#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see org.eclipse.smarthome.core.location.ContinuousLocation#getZ()
	 * @see #getContinuousLocation()
	 * @generated
	 */
	EAttribute getContinuousLocation_Z();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smarthome.core.location.DiscreteLocation <em>Discrete Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Location</em>'.
	 * @see org.eclipse.smarthome.core.location.DiscreteLocation
	 * @generated
	 */
	EClass getDiscreteLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smarthome.core.location.DiscreteLocation#getSubLocations <em>Sub Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Locations</em>'.
	 * @see org.eclipse.smarthome.core.location.DiscreteLocation#getSubLocations()
	 * @see #getDiscreteLocation()
	 * @generated
	 */
	EReference getDiscreteLocation_SubLocations();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.smarthome.core.location.DiscreteLocation#getAdjacentLocations <em>Adjacent Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Adjacent Locations</em>'.
	 * @see org.eclipse.smarthome.core.location.DiscreteLocation#getAdjacentLocations()
	 * @see #getDiscreteLocation()
	 * @generated
	 */
	EReference getDiscreteLocation_AdjacentLocations();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smarthome.core.location.DiscreteLocation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smarthome.core.location.DiscreteLocation#getName()
	 * @see #getDiscreteLocation()
	 * @generated
	 */
	EAttribute getDiscreteLocation_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smarthome.core.items.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.eclipse.smarthome.core.items.Item
	 * @model instanceClass="org.eclipse.smarthome.core.items.Item"
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smarthome.core.location.LocatableItem <em>Locatable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locatable Item</em>'.
	 * @see org.eclipse.smarthome.core.location.LocatableItem
	 * @generated
	 */
	EClass getLocatableItem();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smarthome.core.location.LocatableItem#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see org.eclipse.smarthome.core.location.LocatableItem#getLocation()
	 * @see #getLocatableItem()
	 * @generated
	 */
	EReference getLocatableItem_Location();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.smarthome.core.location.LocatableItem#getAssignedProviders <em>Assigned Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assigned Providers</em>'.
	 * @see org.eclipse.smarthome.core.location.LocatableItem#getAssignedProviders()
	 * @see #getLocatableItem()
	 * @generated
	 */
	EReference getLocatableItem_AssignedProviders();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smarthome.core.types.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.eclipse.smarthome.core.types.State
	 * @model instanceClass="org.eclipse.smarthome.core.types.State"
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smarthome.core.location.GeoLocation <em>Geo Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geo Location</em>'.
	 * @see org.eclipse.smarthome.core.location.GeoLocation
	 * @generated
	 */
	EClass getGeoLocation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LocationFactory getLocationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.smarthome.core.location.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smarthome.core.location.impl.PersonImpl
		 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '{@link org.eclipse.smarthome.core.location.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smarthome.core.location.impl.LocationImpl
		 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Contained Subjects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__CONTAINED_SUBJECTS = eINSTANCE.getLocation_ContainedSubjects();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__TIME = eINSTANCE.getLocation_Time();

		/**
		 * The meta object literal for the '{@link org.eclipse.smarthome.core.location.impl.LocationProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smarthome.core.location.impl.LocationProviderImpl
		 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getLocationProvider()
		 * @generated
		 */
		EClass LOCATION_PROVIDER = eINSTANCE.getLocationProvider();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_PROVIDER__NAME = eINSTANCE.getLocationProvider_Name();

		/**
		 * The meta object literal for the '<em><b>Provide Locations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCATION_PROVIDER___PROVIDE_LOCATIONS = eINSTANCE.getLocationProvider__ProvideLocations();

		/**
		 * The meta object literal for the '{@link org.eclipse.smarthome.core.location.impl.AssignableProviderImpl <em>Assignable Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smarthome.core.location.impl.AssignableProviderImpl
		 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getAssignableProvider()
		 * @generated
		 */
		EClass ASSIGNABLE_PROVIDER = eINSTANCE.getAssignableProvider();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNABLE_PROVIDER__OWNER = eINSTANCE.getAssignableProvider_Owner();

		/**
		 * The meta object literal for the '{@link org.eclipse.smarthome.core.location.impl.RoomPositionImpl <em>Room Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smarthome.core.location.impl.RoomPositionImpl
		 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getRoomPosition()
		 * @generated
		 */
		EClass ROOM_POSITION = eINSTANCE.getRoomPosition();

		/**
		 * The meta object literal for the '{@link org.eclipse.smarthome.core.location.impl.ContinuousLocationImpl <em>Continuous Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smarthome.core.location.impl.ContinuousLocationImpl
		 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getContinuousLocation()
		 * @generated
		 */
		EClass CONTINUOUS_LOCATION = eINSTANCE.getContinuousLocation();

		/**
		 * The meta object literal for the '<em><b>Accuracy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTINUOUS_LOCATION__ACCURACY = eINSTANCE.getContinuousLocation_Accuracy();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTINUOUS_LOCATION__X = eINSTANCE.getContinuousLocation_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTINUOUS_LOCATION__Y = eINSTANCE.getContinuousLocation_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTINUOUS_LOCATION__Z = eINSTANCE.getContinuousLocation_Z();

		/**
		 * The meta object literal for the '{@link org.eclipse.smarthome.core.location.impl.DiscreteLocationImpl <em>Discrete Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smarthome.core.location.impl.DiscreteLocationImpl
		 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getDiscreteLocation()
		 * @generated
		 */
		EClass DISCRETE_LOCATION = eINSTANCE.getDiscreteLocation();

		/**
		 * The meta object literal for the '<em><b>Sub Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_LOCATION__SUB_LOCATIONS = eINSTANCE.getDiscreteLocation_SubLocations();

		/**
		 * The meta object literal for the '<em><b>Adjacent Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_LOCATION__ADJACENT_LOCATIONS = eINSTANCE.getDiscreteLocation_AdjacentLocations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_LOCATION__NAME = eINSTANCE.getDiscreteLocation_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.smarthome.core.items.Item <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smarthome.core.items.Item
		 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '{@link org.eclipse.smarthome.core.location.impl.LocatableItemImpl <em>Locatable Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smarthome.core.location.impl.LocatableItemImpl
		 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getLocatableItem()
		 * @generated
		 */
		EClass LOCATABLE_ITEM = eINSTANCE.getLocatableItem();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATABLE_ITEM__LOCATION = eINSTANCE.getLocatableItem_Location();

		/**
		 * The meta object literal for the '<em><b>Assigned Providers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATABLE_ITEM__ASSIGNED_PROVIDERS = eINSTANCE.getLocatableItem_AssignedProviders();

		/**
		 * The meta object literal for the '{@link org.eclipse.smarthome.core.types.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smarthome.core.types.State
		 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '{@link org.eclipse.smarthome.core.location.impl.GeoLocationImpl <em>Geo Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smarthome.core.location.impl.GeoLocationImpl
		 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getGeoLocation()
		 * @generated
		 */
		EClass GEO_LOCATION = eINSTANCE.getGeoLocation();

	}

} //LocationPackage
