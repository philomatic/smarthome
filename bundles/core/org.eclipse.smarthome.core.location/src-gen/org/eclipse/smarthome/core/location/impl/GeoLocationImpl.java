/**
 */
package org.eclipse.smarthome.core.location.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.smarthome.core.location.GeoLocation;
import org.eclipse.smarthome.core.location.LocationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geo Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GeoLocationImpl extends ContinuousLocationImpl implements GeoLocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeoLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocationPackage.Literals.GEO_LOCATION;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String format(String pattern) {
		return String.format(pattern, super.toString());
	}

} //GeoLocationImpl
