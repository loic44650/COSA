/**
 */
package client_serveur.impl;

import client_serveur.Client_serveurPackage;
import client_serveur.DataBase;
import client_serveur.Interface_DataBase;

import cosa.impl.ComposantImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.DataBaseImpl#getInterface_database <em>Interface database</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataBaseImpl extends ComposantImpl implements DataBase {
	/**
	 * The cached value of the '{@link #getInterface_database() <em>Interface database</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface_database()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface_DataBase> interface_database;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.DATA_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface_DataBase> getInterface_database() {
		if (interface_database == null) {
			interface_database = new EObjectContainmentEList<Interface_DataBase>(Interface_DataBase.class, this, Client_serveurPackage.DATA_BASE__INTERFACE_DATABASE);
		}
		return interface_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.DATA_BASE__INTERFACE_DATABASE:
				return ((InternalEList<?>)getInterface_database()).basicRemove(otherEnd, msgs);
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
			case Client_serveurPackage.DATA_BASE__INTERFACE_DATABASE:
				return getInterface_database();
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
			case Client_serveurPackage.DATA_BASE__INTERFACE_DATABASE:
				getInterface_database().clear();
				getInterface_database().addAll((Collection<? extends Interface_DataBase>)newValue);
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
			case Client_serveurPackage.DATA_BASE__INTERFACE_DATABASE:
				getInterface_database().clear();
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
			case Client_serveurPackage.DATA_BASE__INTERFACE_DATABASE:
				return interface_database != null && !interface_database.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataBaseImpl
