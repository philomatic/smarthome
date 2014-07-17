/**
 */
package org.eclipse.smarthome.core.location.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.smarthome.core.location.AssignableProvider;
import org.eclipse.smarthome.core.location.LocatableItem;
import org.eclipse.smarthome.core.location.Location;
import org.eclipse.smarthome.core.location.LocationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Locatable Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.smarthome.core.location.impl.LocatableItemImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.smarthome.core.location.impl.LocatableItemImpl#getAssignedProviders <em>Assigned Providers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LocatableItemImpl extends MinimalEObjectImpl.Container implements LocatableItem {
	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The cached value of the '{@link #getAssignedProviders() <em>Assigned Providers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedProviders()
	 * @generated
	 * @ordered
	 */
	protected EList<AssignableProvider> assignedProviders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocatableItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocationPackage.Literals.LOCATABLE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LocationPackage.LOCATABLE_ITEM__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.LOCATABLE_ITEM__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssignableProvider> getAssignedProviders() {
		if (assignedProviders == null) {
			assignedProviders = new EObjectResolvingEList<AssignableProvider>(AssignableProvider.class, this, LocationPackage.LOCATABLE_ITEM__ASSIGNED_PROVIDERS);
		}
		return assignedProviders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LocationPackage.LOCATABLE_ITEM__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case LocationPackage.LOCATABLE_ITEM__ASSIGNED_PROVIDERS:
				return getAssignedProviders();
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
			case LocationPackage.LOCATABLE_ITEM__LOCATION:
				setLocation((Location)newValue);
				return;
			case LocationPackage.LOCATABLE_ITEM__ASSIGNED_PROVIDERS:
				getAssignedProviders().clear();
				getAssignedProviders().addAll((Collection<? extends AssignableProvider>)newValue);
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
			case LocationPackage.LOCATABLE_ITEM__LOCATION:
				setLocation((Location)null);
				return;
			case LocationPackage.LOCATABLE_ITEM__ASSIGNED_PROVIDERS:
				getAssignedProviders().clear();
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
			case LocationPackage.LOCATABLE_ITEM__LOCATION:
				return location != null;
			case LocationPackage.LOCATABLE_ITEM__ASSIGNED_PROVIDERS:
				return assignedProviders != null && !assignedProviders.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LocatableItemImpl
