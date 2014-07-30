/**
 */
package org.eclipse.smarthome.core.location.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.smarthome.core.library.types.DateTimeType;
import org.eclipse.smarthome.core.location.Location;
import org.eclipse.smarthome.core.location.LocationPackage;
import org.eclipse.smarthome.core.thing.Thing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.smarthome.core.location.impl.LocationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.smarthome.core.location.impl.LocationImpl#getSubLocations <em>Sub Locations</em>}</li>
 *   <li>{@link org.eclipse.smarthome.core.location.impl.LocationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smarthome.core.location.impl.LocationImpl#getContainedThings <em>Contained Things</em>}</li>
 *   <li>{@link org.eclipse.smarthome.core.location.impl.LocationImpl#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LocationImpl extends MinimalEObjectImpl.Container implements Location {
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
	 * The cached value of the '{@link #getContainedThings() <em>Contained Things</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedThings()
	 * @generated
	 * @ordered
	 */
	protected EList<Thing> containedThings;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Date time = TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocationPackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getParent() {
		if (eContainerFeatureID() != LocationPackage.LOCATION__PARENT) return null;
		return (Location)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Location newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, LocationPackage.LOCATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Location newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != LocationPackage.LOCATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, LocationPackage.LOCATION__SUB_LOCATIONS, Location.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.LOCATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getSubLocations() {
		if (subLocations == null) {
			subLocations = new EObjectContainmentWithInverseEList<Location>(Location.class, this, LocationPackage.LOCATION__SUB_LOCATIONS, LocationPackage.LOCATION__PARENT);
		}
		return subLocations;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.LOCATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Thing> getContainedThings() {
		if (containedThings == null) {
			containedThings = new EDataTypeUniqueEList<Thing>(Thing.class, this, LocationPackage.LOCATION__CONTAINED_THINGS);
		}
		return containedThings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(Date newTime) {
		Date oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.LOCATION__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String fullStringRepresentation() {
		
		StringBuffer sb = new StringBuffer("Location: ");
		sb.append(toString());
		sb.append(" ");
		sb.append(listContainedSubjects());
		sb.append(" ");
		sb.append(printTime());
		
		return sb.toString();
	}

	private String printTime() {
		StringBuffer sb = new StringBuffer("(Time: ");
		
		if (getTime() == null){
			sb.append("<never>");
		}else{
			sb.append(DateTimeType.DATE_FORMATTER.format(getTime()));
		}
		
		sb.append(")");
		
		return sb.toString();
	}

	private String listContainedSubjects() {
		
		StringBuffer sb = new StringBuffer("(Subjects: ");
		
		if (containedThings.isEmpty()){
			sb.append("<none>");
		}
		
		for (Iterator<Thing> iterator = containedThings.iterator(); iterator.hasNext();) {
			Thing thing = (Thing) iterator.next();
			
			sb.append(thing.getUID().getId());
			
			if (iterator.hasNext()){
				sb.append(", ");
			}
		}
		
		sb.append(")");
		return sb.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LocationPackage.LOCATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Location)otherEnd, msgs);
			case LocationPackage.LOCATION__SUB_LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubLocations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LocationPackage.LOCATION__PARENT:
				return basicSetParent(null, msgs);
			case LocationPackage.LOCATION__SUB_LOCATIONS:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case LocationPackage.LOCATION__PARENT:
				return eInternalContainer().eInverseRemove(this, LocationPackage.LOCATION__SUB_LOCATIONS, Location.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LocationPackage.LOCATION__PARENT:
				return getParent();
			case LocationPackage.LOCATION__SUB_LOCATIONS:
				return getSubLocations();
			case LocationPackage.LOCATION__NAME:
				return getName();
			case LocationPackage.LOCATION__CONTAINED_THINGS:
				return getContainedThings();
			case LocationPackage.LOCATION__TIME:
				return getTime();
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
			case LocationPackage.LOCATION__PARENT:
				setParent((Location)newValue);
				return;
			case LocationPackage.LOCATION__SUB_LOCATIONS:
				getSubLocations().clear();
				getSubLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case LocationPackage.LOCATION__NAME:
				setName((String)newValue);
				return;
			case LocationPackage.LOCATION__CONTAINED_THINGS:
				getContainedThings().clear();
				getContainedThings().addAll((Collection<? extends Thing>)newValue);
				return;
			case LocationPackage.LOCATION__TIME:
				setTime((Date)newValue);
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
			case LocationPackage.LOCATION__PARENT:
				setParent((Location)null);
				return;
			case LocationPackage.LOCATION__SUB_LOCATIONS:
				getSubLocations().clear();
				return;
			case LocationPackage.LOCATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LocationPackage.LOCATION__CONTAINED_THINGS:
				getContainedThings().clear();
				return;
			case LocationPackage.LOCATION__TIME:
				setTime(TIME_EDEFAULT);
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
			case LocationPackage.LOCATION__PARENT:
				return getParent() != null;
			case LocationPackage.LOCATION__SUB_LOCATIONS:
				return subLocations != null && !subLocations.isEmpty();
			case LocationPackage.LOCATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LocationPackage.LOCATION__CONTAINED_THINGS:
				return containedThings != null && !containedThings.isEmpty();
			case LocationPackage.LOCATION__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LocationPackage.LOCATION___FULL_STRING_REPRESENTATION:
				return fullStringRepresentation();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer();
		if (getParent() != null) {
			result.append(getParent().toString());
			result.append(" / ");
		}
		result.append(name);
		
		return result.toString();
	}
} //LocationImpl
