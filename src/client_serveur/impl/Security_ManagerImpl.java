/**
 */
package client_serveur.impl;

import client_serveur.Client_serveurPackage;
import client_serveur.Interface_Security_Manager;
import client_serveur.Security_Manager;

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
 * An implementation of the model object '<em><b>Security Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Security_ManagerImpl#getInterface_security_manager <em>Interface security manager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Security_ManagerImpl extends ComposantImpl implements Security_Manager {
	/**
	 * The cached value of the '{@link #getInterface_security_manager() <em>Interface security manager</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface_security_manager()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface_Security_Manager> interface_security_manager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Security_ManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.SECURITY_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface_Security_Manager> getInterface_security_manager() {
		if (interface_security_manager == null) {
			interface_security_manager = new EObjectContainmentEList<Interface_Security_Manager>(Interface_Security_Manager.class, this, Client_serveurPackage.SECURITY_MANAGER__INTERFACE_SECURITY_MANAGER);
		}
		return interface_security_manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.SECURITY_MANAGER__INTERFACE_SECURITY_MANAGER:
				return ((InternalEList<?>)getInterface_security_manager()).basicRemove(otherEnd, msgs);
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
			case Client_serveurPackage.SECURITY_MANAGER__INTERFACE_SECURITY_MANAGER:
				return getInterface_security_manager();
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
			case Client_serveurPackage.SECURITY_MANAGER__INTERFACE_SECURITY_MANAGER:
				getInterface_security_manager().clear();
				getInterface_security_manager().addAll((Collection<? extends Interface_Security_Manager>)newValue);
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
			case Client_serveurPackage.SECURITY_MANAGER__INTERFACE_SECURITY_MANAGER:
				getInterface_security_manager().clear();
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
			case Client_serveurPackage.SECURITY_MANAGER__INTERFACE_SECURITY_MANAGER:
				return interface_security_manager != null && !interface_security_manager.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Security_ManagerImpl
