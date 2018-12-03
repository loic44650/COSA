/**
 */
package client_serveur.impl;

import client_serveur.Client_serveurPackage;
import client_serveur.Interface_Client;
import client_serveur.Port_Fourni_Client;
import client_serveur.Port_Requis_Client;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Interface_ClientImpl#getPort_fourni_client <em>Port fourni client</em>}</li>
 *   <li>{@link client_serveur.impl.Interface_ClientImpl#getPort_requis_client <em>Port requis client</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Interface_ClientImpl extends MinimalEObjectImpl.Container implements Interface_Client {
	/**
	 * The cached value of the '{@link #getPort_fourni_client() <em>Port fourni client</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_fourni_client()
	 * @generated
	 * @ordered
	 */
	protected EList<Port_Fourni_Client> port_fourni_client;

	/**
	 * The cached value of the '{@link #getPort_requis_client() <em>Port requis client</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_requis_client()
	 * @generated
	 * @ordered
	 */
	protected EList<Port_Requis_Client> port_requis_client;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Interface_ClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.INTERFACE_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port_Fourni_Client> getPort_fourni_client() {
		if (port_fourni_client == null) {
			port_fourni_client = new EObjectContainmentEList<Port_Fourni_Client>(Port_Fourni_Client.class, this, Client_serveurPackage.INTERFACE_CLIENT__PORT_FOURNI_CLIENT);
		}
		return port_fourni_client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port_Requis_Client> getPort_requis_client() {
		if (port_requis_client == null) {
			port_requis_client = new EObjectContainmentEList<Port_Requis_Client>(Port_Requis_Client.class, this, Client_serveurPackage.INTERFACE_CLIENT__PORT_REQUIS_CLIENT);
		}
		return port_requis_client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.INTERFACE_CLIENT__PORT_FOURNI_CLIENT:
				return ((InternalEList<?>)getPort_fourni_client()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.INTERFACE_CLIENT__PORT_REQUIS_CLIENT:
				return ((InternalEList<?>)getPort_requis_client()).basicRemove(otherEnd, msgs);
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
			case Client_serveurPackage.INTERFACE_CLIENT__PORT_FOURNI_CLIENT:
				return getPort_fourni_client();
			case Client_serveurPackage.INTERFACE_CLIENT__PORT_REQUIS_CLIENT:
				return getPort_requis_client();
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
			case Client_serveurPackage.INTERFACE_CLIENT__PORT_FOURNI_CLIENT:
				getPort_fourni_client().clear();
				getPort_fourni_client().addAll((Collection<? extends Port_Fourni_Client>)newValue);
				return;
			case Client_serveurPackage.INTERFACE_CLIENT__PORT_REQUIS_CLIENT:
				getPort_requis_client().clear();
				getPort_requis_client().addAll((Collection<? extends Port_Requis_Client>)newValue);
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
			case Client_serveurPackage.INTERFACE_CLIENT__PORT_FOURNI_CLIENT:
				getPort_fourni_client().clear();
				return;
			case Client_serveurPackage.INTERFACE_CLIENT__PORT_REQUIS_CLIENT:
				getPort_requis_client().clear();
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
			case Client_serveurPackage.INTERFACE_CLIENT__PORT_FOURNI_CLIENT:
				return port_fourni_client != null && !port_fourni_client.isEmpty();
			case Client_serveurPackage.INTERFACE_CLIENT__PORT_REQUIS_CLIENT:
				return port_requis_client != null && !port_requis_client.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Interface_ClientImpl
