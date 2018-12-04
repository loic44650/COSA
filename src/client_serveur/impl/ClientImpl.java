/**
 */
package client_serveur.impl;

import client_serveur.Client;
import client_serveur.Client_serveurPackage;
import client_serveur.Interface_Client;

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
 * An implementation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.ClientImpl#getInterface_client <em>Interface client</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientImpl extends ComposantImpl implements Client {
	/**
	 * The cached value of the '{@link #getInterface_client() <em>Interface client</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface_client()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface_Client> interface_client;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface_Client> getInterface_client() {
		if (interface_client == null) {
			interface_client = new EObjectContainmentEList<Interface_Client>(Interface_Client.class, this, Client_serveurPackage.CLIENT__INTERFACE_CLIENT);
		}
		return interface_client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.CLIENT__INTERFACE_CLIENT:
				return ((InternalEList<?>)getInterface_client()).basicRemove(otherEnd, msgs);
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
			case Client_serveurPackage.CLIENT__INTERFACE_CLIENT:
				return getInterface_client();
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
			case Client_serveurPackage.CLIENT__INTERFACE_CLIENT:
				getInterface_client().clear();
				getInterface_client().addAll((Collection<? extends Interface_Client>)newValue);
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
			case Client_serveurPackage.CLIENT__INTERFACE_CLIENT:
				getInterface_client().clear();
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
			case Client_serveurPackage.CLIENT__INTERFACE_CLIENT:
				return interface_client != null && !interface_client.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	public void sendRequest(String request) {
		interface_client.get(0).getPort_fourni_client().get(0).getAttachment_client_rpc().setRequest(request);
	}

} //ClientImpl
