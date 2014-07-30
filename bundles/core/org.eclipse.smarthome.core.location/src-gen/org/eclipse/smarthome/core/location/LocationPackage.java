/**
 */
package org.eclipse.smarthome.core.location;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	 * The meta object id for the '{@link org.eclipse.smarthome.core.types.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smarthome.core.types.State
	 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getState()
	 * @generated
	 */
	int STATE = 5;

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
	int LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__PARENT = STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__SUB_LOCATIONS = STATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = STATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contained Things</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CONTAINED_THINGS = STATE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__TIME = STATE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = STATE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Full String Representation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___FULL_STRING_REPRESENTATION = STATE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = STATE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.smarthome.core.location.LocationProvider <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smarthome.core.location.LocationProvider
	 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getLocationProvider()
	 * @generated
	 */
	int LOCATION_PROVIDER = 8;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Provide Locations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_PROVIDER___PROVIDE_LOCATIONS__BOOLEAN = 0;

	/**
	 * The operation id for the '<em>Register</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_PROVIDER___REGISTER__LOCATIONLISTENER = 1;

	/**
	 * The operation id for the '<em>Unregister</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_PROVIDER___UNREGISTER__LOCATIONLISTENER = 2;

	/**
	 * The operation id for the '<em>Is Assignable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_PROVIDER___IS_ASSIGNABLE = 3;

	/**
	 * The operation id for the '<em>As Assignable Provider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_PROVIDER___AS_ASSIGNABLE_PROVIDER = 4;

	/**
	 * The number of operations of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_PROVIDER_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.smarthome.core.location.AssignableProvider <em>Assignable Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smarthome.core.location.AssignableProvider
	 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getAssignableProvider()
	 * @generated
	 */
	int ASSIGNABLE_PROVIDER = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
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
	int ASSIGNABLE_PROVIDER___PROVIDE_LOCATIONS__BOOLEAN = LOCATION_PROVIDER___PROVIDE_LOCATIONS__BOOLEAN;

	/**
	 * The operation id for the '<em>Register</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNABLE_PROVIDER___REGISTER__LOCATIONLISTENER = LOCATION_PROVIDER___REGISTER__LOCATIONLISTENER;

	/**
	 * The operation id for the '<em>Unregister</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNABLE_PROVIDER___UNREGISTER__LOCATIONLISTENER = LOCATION_PROVIDER___UNREGISTER__LOCATIONLISTENER;

	/**
	 * The operation id for the '<em>Is Assignable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNABLE_PROVIDER___IS_ASSIGNABLE = LOCATION_PROVIDER___IS_ASSIGNABLE;

	/**
	 * The operation id for the '<em>As Assignable Provider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNABLE_PROVIDER___AS_ASSIGNABLE_PROVIDER = LOCATION_PROVIDER___AS_ASSIGNABLE_PROVIDER;

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
	int CONTINUOUS_LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_LOCATION__PARENT = LOCATION__PARENT;

	/**
	 * The feature id for the '<em><b>Sub Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_LOCATION__SUB_LOCATIONS = LOCATION__SUB_LOCATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_LOCATION__NAME = LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Contained Things</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_LOCATION__CONTAINED_THINGS = LOCATION__CONTAINED_THINGS;

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
	 * The operation id for the '<em>Full String Representation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_LOCATION___FULL_STRING_REPRESENTATION = LOCATION___FULL_STRING_REPRESENTATION;

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
	int ROOM_POSITION = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_POSITION__PARENT = CONTINUOUS_LOCATION__PARENT;

	/**
	 * The feature id for the '<em><b>Sub Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_POSITION__SUB_LOCATIONS = CONTINUOUS_LOCATION__SUB_LOCATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_POSITION__NAME = CONTINUOUS_LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Contained Things</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_POSITION__CONTAINED_THINGS = CONTINUOUS_LOCATION__CONTAINED_THINGS;

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
	 * The operation id for the '<em>Full String Representation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_POSITION___FULL_STRING_REPRESENTATION = CONTINUOUS_LOCATION___FULL_STRING_REPRESENTATION;

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
	int DISCRETE_LOCATION = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_LOCATION__PARENT = LOCATION__PARENT;

	/**
	 * The feature id for the '<em><b>Sub Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_LOCATION__SUB_LOCATIONS = LOCATION__SUB_LOCATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_LOCATION__NAME = LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Contained Things</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_LOCATION__CONTAINED_THINGS = LOCATION__CONTAINED_THINGS;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_LOCATION__TIME = LOCATION__TIME;

	/**
	 * The feature id for the '<em><b>Adjacent Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_LOCATION__ADJACENT_LOCATIONS = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Discrete Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_LOCATION_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Full String Representation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_LOCATION___FULL_STRING_REPRESENTATION = LOCATION___FULL_STRING_REPRESENTATION;

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
	int GEO_LOCATION = 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION__PARENT = CONTINUOUS_LOCATION__PARENT;

	/**
	 * The feature id for the '<em><b>Sub Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION__SUB_LOCATIONS = CONTINUOUS_LOCATION__SUB_LOCATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION__NAME = CONTINUOUS_LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Contained Things</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION__CONTAINED_THINGS = CONTINUOUS_LOCATION__CONTAINED_THINGS;

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
	 * The operation id for the '<em>Full String Representation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION___FULL_STRING_REPRESENTATION = CONTINUOUS_LOCATION___FULL_STRING_REPRESENTATION;

	/**
	 * The number of operations of the '<em>Geo Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION_OPERATION_COUNT = CONTINUOUS_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smarthome.core.location.LocationListener <em>Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smarthome.core.location.LocationListener
	 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getLocationListener()
	 * @generated
	 */
	int LOCATION_LISTENER = 7;

	/**
	 * The number of structural features of the '<em>Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Location Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LISTENER___LOCATION_UPDATE__ELIST = 0;

	/**
	 * The number of operations of the '<em>Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_LISTENER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '<em>Thing</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smarthome.core.thing.Thing
	 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getThing()
	 * @generated
	 */
	int THING = 9;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getString()
	 * @generated
	 */
	int STRING = 10;

	/**
	 * The meta object id for the '<em>boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getboolean()
	 * @generated
	 */
	int BOOLEAN = 11;


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
	 * Returns the meta object for the container reference '{@link org.eclipse.smarthome.core.location.Location#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.smarthome.core.location.Location#getParent()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smarthome.core.location.Location#getSubLocations <em>Sub Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Locations</em>'.
	 * @see org.eclipse.smarthome.core.location.Location#getSubLocations()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_SubLocations();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smarthome.core.location.Location#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smarthome.core.location.Location#getName()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.smarthome.core.location.Location#getContainedThings <em>Contained Things</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Contained Things</em>'.
	 * @see org.eclipse.smarthome.core.location.Location#getContainedThings()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_ContainedThings();

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
	 * Returns the meta object for the '{@link org.eclipse.smarthome.core.location.Location#fullStringRepresentation() <em>Full String Representation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Full String Representation</em>' operation.
	 * @see org.eclipse.smarthome.core.location.Location#fullStringRepresentation()
	 * @generated
	 */
	EOperation getLocation__FullStringRepresentation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smarthome.core.location.AssignableProvider <em>Assignable Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignable Provider</em>'.
	 * @see org.eclipse.smarthome.core.location.AssignableProvider
	 * @model instanceClass="org.eclipse.smarthome.core.location.AssignableProvider" superTypes="org.eclipse.smarthome.core.location.LocationProvider"
	 * @generated
	 */
	EClass getAssignableProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smarthome.core.location.AssignableProvider#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see org.eclipse.smarthome.core.location.AssignableProvider#getOwner()
	 * @see #getAssignableProvider()
	 * @generated
	 */
	EAttribute getAssignableProvider_Owner();

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
	 * Returns the meta object for class '{@link org.eclipse.smarthome.core.location.LocationListener <em>Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Listener</em>'.
	 * @see org.eclipse.smarthome.core.location.LocationListener
	 * @model instanceClass="org.eclipse.smarthome.core.location.LocationListener"
	 * @generated
	 */
	EClass getLocationListener();

	/**
	 * Returns the meta object for the '{@link org.eclipse.smarthome.core.location.LocationListener#locationUpdate(org.eclipse.emf.common.util.EList) <em>Location Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Location Update</em>' operation.
	 * @see org.eclipse.smarthome.core.location.LocationListener#locationUpdate(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getLocationListener__LocationUpdate__EList();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smarthome.core.location.LocationProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see org.eclipse.smarthome.core.location.LocationProvider
	 * @model instanceClass="org.eclipse.smarthome.core.location.LocationProvider"
	 * @generated
	 */
	EClass getLocationProvider();

	/**
	 * Returns the meta object for the '{@link org.eclipse.smarthome.core.location.LocationProvider#provideLocations(boolean) <em>Provide Locations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provide Locations</em>' operation.
	 * @see org.eclipse.smarthome.core.location.LocationProvider#provideLocations(boolean)
	 * @generated
	 */
	EOperation getLocationProvider__ProvideLocations__boolean();

	/**
	 * Returns the meta object for the '{@link org.eclipse.smarthome.core.location.LocationProvider#register(org.eclipse.smarthome.core.location.LocationListener) <em>Register</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register</em>' operation.
	 * @see org.eclipse.smarthome.core.location.LocationProvider#register(org.eclipse.smarthome.core.location.LocationListener)
	 * @generated
	 */
	EOperation getLocationProvider__Register__LocationListener();

	/**
	 * Returns the meta object for the '{@link org.eclipse.smarthome.core.location.LocationProvider#unregister(org.eclipse.smarthome.core.location.LocationListener) <em>Unregister</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unregister</em>' operation.
	 * @see org.eclipse.smarthome.core.location.LocationProvider#unregister(org.eclipse.smarthome.core.location.LocationListener)
	 * @generated
	 */
	EOperation getLocationProvider__Unregister__LocationListener();

	/**
	 * Returns the meta object for the '{@link org.eclipse.smarthome.core.location.LocationProvider#isAssignable() <em>Is Assignable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Assignable</em>' operation.
	 * @see org.eclipse.smarthome.core.location.LocationProvider#isAssignable()
	 * @generated
	 */
	EOperation getLocationProvider__IsAssignable();

	/**
	 * Returns the meta object for the '{@link org.eclipse.smarthome.core.location.LocationProvider#asAssignableProvider() <em>As Assignable Provider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Assignable Provider</em>' operation.
	 * @see org.eclipse.smarthome.core.location.LocationProvider#asAssignableProvider()
	 * @generated
	 */
	EOperation getLocationProvider__AsAssignableProvider();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.smarthome.core.thing.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Thing</em>'.
	 * @see org.eclipse.smarthome.core.thing.Thing
	 * @model instanceClass="org.eclipse.smarthome.core.thing.Thing"
	 * @generated
	 */
	EDataType getThing();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the meta object for data type '<em>boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>boolean</em>'.
	 * @model instanceClass="boolean"
	 * @generated
	 */
	EDataType getboolean();

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
		 * The meta object literal for the '{@link org.eclipse.smarthome.core.location.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smarthome.core.location.impl.LocationImpl
		 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__PARENT = eINSTANCE.getLocation_Parent();

		/**
		 * The meta object literal for the '<em><b>Sub Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__SUB_LOCATIONS = eINSTANCE.getLocation_SubLocations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__NAME = eINSTANCE.getLocation_Name();

		/**
		 * The meta object literal for the '<em><b>Contained Things</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__CONTAINED_THINGS = eINSTANCE.getLocation_ContainedThings();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__TIME = eINSTANCE.getLocation_Time();

		/**
		 * The meta object literal for the '<em><b>Full String Representation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCATION___FULL_STRING_REPRESENTATION = eINSTANCE.getLocation__FullStringRepresentation();

		/**
		 * The meta object literal for the '{@link org.eclipse.smarthome.core.location.AssignableProvider <em>Assignable Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smarthome.core.location.AssignableProvider
		 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getAssignableProvider()
		 * @generated
		 */
		EClass ASSIGNABLE_PROVIDER = eINSTANCE.getAssignableProvider();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNABLE_PROVIDER__OWNER = eINSTANCE.getAssignableProvider_Owner();

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
		 * The meta object literal for the '<em><b>Adjacent Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_LOCATION__ADJACENT_LOCATIONS = eINSTANCE.getDiscreteLocation_AdjacentLocations();

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

		/**
		 * The meta object literal for the '{@link org.eclipse.smarthome.core.location.LocationListener <em>Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smarthome.core.location.LocationListener
		 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getLocationListener()
		 * @generated
		 */
		EClass LOCATION_LISTENER = eINSTANCE.getLocationListener();

		/**
		 * The meta object literal for the '<em><b>Location Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCATION_LISTENER___LOCATION_UPDATE__ELIST = eINSTANCE.getLocationListener__LocationUpdate__EList();

		/**
		 * The meta object literal for the '{@link org.eclipse.smarthome.core.location.LocationProvider <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smarthome.core.location.LocationProvider
		 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getLocationProvider()
		 * @generated
		 */
		EClass LOCATION_PROVIDER = eINSTANCE.getLocationProvider();

		/**
		 * The meta object literal for the '<em><b>Provide Locations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCATION_PROVIDER___PROVIDE_LOCATIONS__BOOLEAN = eINSTANCE.getLocationProvider__ProvideLocations__boolean();

		/**
		 * The meta object literal for the '<em><b>Register</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCATION_PROVIDER___REGISTER__LOCATIONLISTENER = eINSTANCE.getLocationProvider__Register__LocationListener();

		/**
		 * The meta object literal for the '<em><b>Unregister</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCATION_PROVIDER___UNREGISTER__LOCATIONLISTENER = eINSTANCE.getLocationProvider__Unregister__LocationListener();

		/**
		 * The meta object literal for the '<em><b>Is Assignable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCATION_PROVIDER___IS_ASSIGNABLE = eINSTANCE.getLocationProvider__IsAssignable();

		/**
		 * The meta object literal for the '<em><b>As Assignable Provider</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCATION_PROVIDER___AS_ASSIGNABLE_PROVIDER = eINSTANCE.getLocationProvider__AsAssignableProvider();

		/**
		 * The meta object literal for the '<em>Thing</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smarthome.core.thing.Thing
		 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getThing()
		 * @generated
		 */
		EDataType THING = eINSTANCE.getThing();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smarthome.core.location.impl.LocationPackageImpl#getboolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getboolean();

	}

} //LocationPackage
