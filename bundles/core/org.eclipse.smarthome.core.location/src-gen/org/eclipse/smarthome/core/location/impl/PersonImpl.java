/**
 */
package org.eclipse.smarthome.core.location.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.smarthome.core.location.LocationPackage;
import org.eclipse.smarthome.core.location.Person;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class PersonImpl extends LocatableItemImpl implements Person {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocationPackage.Literals.PERSON;
	}

} //PersonImpl
