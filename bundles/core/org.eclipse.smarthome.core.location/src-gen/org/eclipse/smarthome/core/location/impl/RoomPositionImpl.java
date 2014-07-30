/**
 */
package org.eclipse.smarthome.core.location.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.smarthome.core.location.LocationPackage;
import org.eclipse.smarthome.core.location.RoomPosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RoomPositionImpl extends ContinuousLocationImpl implements RoomPosition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomPositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocationPackage.Literals.ROOM_POSITION;
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public String format(String pattern){
		return String.format(pattern, toString());
	}

} //RoomPositionImpl
