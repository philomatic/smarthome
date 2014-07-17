/**
 */
package org.eclipse.smarthome.core.location.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.smarthome.core.location.DiscreteLocation;
import org.eclipse.smarthome.core.location.Location;
import org.eclipse.smarthome.core.location.LocationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.smarthome.core.location.impl.DiscreteLocationImpl#getSubLocations <em>Sub Locations</em>}</li>
 *   <li>{@link org.eclipse.smarthome.core.location.impl.DiscreteLocationImpl#getAdjacentLocations <em>Adjacent Locations</em>}</li>
 *   <li>{@link org.eclipse.smarthome.core.location.impl.DiscreteLocationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscreteLocationImpl extends LocationImpl implements DiscreteLocation {
	/**
	 * The cached value of the '{@link #getSubLocations() <em>Sub Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> subLocations;

	/**
	 * The cached value of the '{@link #getAdjacentLocations() <em>Adjacent Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjacentLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<DiscreteLocation> adjacentLocations;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteLocationImpl() {
		super();
		createAdjacentLocationsUpdater();
	}

	/**
	 * @generated NOT
	 */
	private void createAdjacentLocationsUpdater() {
		Adapter adapter = new AdapterImpl(){
			@SuppressWarnings("unchecked")
			@Override
			public void notifyChanged(Notification msg) {
				super.notifyChanged(msg);
				if (msg.getFeature().equals(LocationPackage.eINSTANCE.getDiscreteLocation_AdjacentLocations())){
					switch (msg.getEventType()) {
					
					case Notification.ADD:{
						DiscreteLocation newLocation = (DiscreteLocation) msg.getNewValue();
						updateNewLocation(newLocation);
						break;
					}
					case Notification.REMOVE:{
						DiscreteLocation oldLocation = (DiscreteLocation) msg.getOldValue();
						updateOldLocation(oldLocation);
						break;
					}
					case Notification.ADD_MANY:{
						Object newValue = msg.getNewValue();
						for (DiscreteLocation newLocation : (Iterable<DiscreteLocation>)newValue) {
							updateNewLocation(newLocation);
						}
						break;
					}
					case Notification.REMOVE_MANY:{
						for (DiscreteLocation oldLocation : (Iterable<DiscreteLocation>)msg.getOldValue()) {
							updateOldLocation(oldLocation);
						}
						break;
					}
					default:
						break;
					}
				}
			}
		};
		this.eAdapters().add(adapter);
	}
	
	/**
	 * 
	 * @generated NOT
	 */
	protected void updateOldLocation(DiscreteLocation oldLocation) {
		EList<DiscreteLocation> oldLocationAdjacents = oldLocation.getAdjacentLocations();
		if (oldLocationAdjacents.contains(this))
		oldLocationAdjacents.remove(this);
	}

	/**
	 * 
	 * @generated NOT
	 */
	private void updateNewLocation(DiscreteLocation newLocation) {
		EList<DiscreteLocation> newLocationAdjacents = newLocation.getAdjacentLocations();
		if (!newLocationAdjacents.contains(this))
		newLocationAdjacents.add(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocationPackage.Literals.DISCRETE_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getSubLocations() {
		if (subLocations == null) {
			subLocations = new EObjectContainmentEList<Location>(Location.class, this, LocationPackage.DISCRETE_LOCATION__SUB_LOCATIONS);
		}
		return subLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiscreteLocation> getAdjacentLocations() {
		if (adjacentLocations == null) {
			adjacentLocations = new EObjectResolvingEList<DiscreteLocation>(DiscreteLocation.class, this, LocationPackage.DISCRETE_LOCATION__ADJACENT_LOCATIONS);
		}
		return adjacentLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.DISCRETE_LOCATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LocationPackage.DISCRETE_LOCATION__SUB_LOCATIONS:
				return ((InternalEList<?>)getSubLocations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LocationPackage.DISCRETE_LOCATION__SUB_LOCATIONS:
				return getSubLocations();
			case LocationPackage.DISCRETE_LOCATION__ADJACENT_LOCATIONS:
				return getAdjacentLocations();
			case LocationPackage.DISCRETE_LOCATION__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LocationPackage.DISCRETE_LOCATION__SUB_LOCATIONS:
				getSubLocations().clear();
				getSubLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case LocationPackage.DISCRETE_LOCATION__ADJACENT_LOCATIONS:
				getAdjacentLocations().clear();
				getAdjacentLocations().addAll((Collection<? extends DiscreteLocation>)newValue);
				return;
			case LocationPackage.DISCRETE_LOCATION__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LocationPackage.DISCRETE_LOCATION__SUB_LOCATIONS:
				getSubLocations().clear();
				return;
			case LocationPackage.DISCRETE_LOCATION__ADJACENT_LOCATIONS:
				getAdjacentLocations().clear();
				return;
			case LocationPackage.DISCRETE_LOCATION__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LocationPackage.DISCRETE_LOCATION__SUB_LOCATIONS:
				return subLocations != null && !subLocations.isEmpty();
			case LocationPackage.DISCRETE_LOCATION__ADJACENT_LOCATIONS:
				return adjacentLocations != null && !adjacentLocations.isEmpty();
			case LocationPackage.DISCRETE_LOCATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String format(String pattern) {
		return String.format(pattern, name);
	}

} //DiscreteLocationImpl
