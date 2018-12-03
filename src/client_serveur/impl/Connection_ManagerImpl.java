/**
 */
package client_serveur.impl;

import client_serveur.Client_serveurPackage;
import client_serveur.Connection_Manager;
import client_serveur.Interface_Connection_Manager;

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
 * An implementation of the model object '<em><b>Connection Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Connection_ManagerImpl#getInterface_connection_manager <em>Interface connection manager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Connection_ManagerImpl extends ComposantImpl implements Connection_Manager {
	/**
	 * The cached value of the '{@link #getInterface_connection_manager() <em>Interface connection manager</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface_connection_manager()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface_Connection_Manager> interface_connection_manager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Connection_ManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.CONNECTION_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface_Connection_Manager> getInterface_connection_manager() {
		if (interface_connection_manager == null) {
			interface_connection_manager = new EObjectContainmentEList<Interface_Connection_Manager>(Interface_Connection_Manager.class, this, Client_serveurPackage.CONNECTION_MANAGER__INTERFACE_CONNECTION_MANAGER);
		}
		return interface_connection_manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.CONNECTION_MANAGER__INTERFACE_CONNECTION_MANAGER:
				return ((InternalEList<?>)getInterface_connection_manager()).basicRemove(otherEnd, msgs);
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
			case Client_serveurPackage.CONNECTION_MANAGER__INTERFACE_CONNECTION_MANAGER:
				return getInterface_connection_manager();
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
			case Client_serveurPackage.CONNECTION_MANAGER__INTERFACE_CONNECTION_MANAGER:
				getInterface_connection_manager().clear();
				getInterface_connection_manager().addAll((Collection<? extends Interface_Connection_Manager>)newValue);
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
			case Client_serveurPackage.CONNECTION_MANAGER__INTERFACE_CONNECTION_MANAGER:
				getInterface_connection_manager().clear();
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
			case Client_serveurPackage.CONNECTION_MANAGER__INTERFACE_CONNECTION_MANAGER:
				return interface_connection_manager != null && !interface_connection_manager.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Connection_ManagerImpl
