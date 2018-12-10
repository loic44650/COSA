/**
 */
package client_serveur.impl;

import client_serveur.Client_serveurPackage;
import client_serveur.Interface_RPC;
import client_serveur.Role_Fourni_RPC_Client;
import client_serveur.Role_Fourni_RPC_Serveur;
import client_serveur.Role_Requis_RPC_Client;
import client_serveur.Role_Requis_RPC_Serveur;

import cosa.impl.Interface_ConnecteurImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface RPC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Interface_RPCImpl#getRole_fourni_rpc_client <em>Role fourni rpc client</em>}</li>
 *   <li>{@link client_serveur.impl.Interface_RPCImpl#getRole_requis_rpc_client <em>Role requis rpc client</em>}</li>
 *   <li>{@link client_serveur.impl.Interface_RPCImpl#getRole_fourni_rpc_serveur <em>Role fourni rpc serveur</em>}</li>
 *   <li>{@link client_serveur.impl.Interface_RPCImpl#getRole_requis_rpc_serveur <em>Role requis rpc serveur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Interface_RPCImpl extends Interface_ConnecteurImpl implements Interface_RPC {
	/**
	 * The cached value of the '{@link #getRole_fourni_rpc_client() <em>Role fourni rpc client</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_fourni_rpc_client()
	 * @generated
	 * @ordered
	 */
	protected EList<Role_Fourni_RPC_Client> role_fourni_rpc_client;

	/**
	 * The cached value of the '{@link #getRole_requis_rpc_client() <em>Role requis rpc client</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_requis_rpc_client()
	 * @generated
	 * @ordered
	 */
	protected EList<Role_Requis_RPC_Client> role_requis_rpc_client;

	/**
	 * The cached value of the '{@link #getRole_fourni_rpc_serveur() <em>Role fourni rpc serveur</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_fourni_rpc_serveur()
	 * @generated
	 * @ordered
	 */
	protected EList<Role_Fourni_RPC_Serveur> role_fourni_rpc_serveur;

	/**
	 * The cached value of the '{@link #getRole_requis_rpc_serveur() <em>Role requis rpc serveur</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_requis_rpc_serveur()
	 * @generated
	 * @ordered
	 */
	protected EList<Role_Requis_RPC_Serveur> role_requis_rpc_serveur;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Interface_RPCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.INTERFACE_RPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role_Fourni_RPC_Client> getRole_fourni_rpc_client() {
		if (role_fourni_rpc_client == null) {
			role_fourni_rpc_client = new EObjectContainmentEList<Role_Fourni_RPC_Client>(Role_Fourni_RPC_Client.class, this, Client_serveurPackage.INTERFACE_RPC__ROLE_FOURNI_RPC_CLIENT);
		}
		return role_fourni_rpc_client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role_Requis_RPC_Client> getRole_requis_rpc_client() {
		if (role_requis_rpc_client == null) {
			role_requis_rpc_client = new EObjectContainmentEList<Role_Requis_RPC_Client>(Role_Requis_RPC_Client.class, this, Client_serveurPackage.INTERFACE_RPC__ROLE_REQUIS_RPC_CLIENT);
		}
		return role_requis_rpc_client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role_Fourni_RPC_Serveur> getRole_fourni_rpc_serveur() {
		if (role_fourni_rpc_serveur == null) {
			role_fourni_rpc_serveur = new EObjectContainmentEList<Role_Fourni_RPC_Serveur>(Role_Fourni_RPC_Serveur.class, this, Client_serveurPackage.INTERFACE_RPC__ROLE_FOURNI_RPC_SERVEUR);
		}
		return role_fourni_rpc_serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role_Requis_RPC_Serveur> getRole_requis_rpc_serveur() {
		if (role_requis_rpc_serveur == null) {
			role_requis_rpc_serveur = new EObjectContainmentEList<Role_Requis_RPC_Serveur>(Role_Requis_RPC_Serveur.class, this, Client_serveurPackage.INTERFACE_RPC__ROLE_REQUIS_RPC_SERVEUR);
		}
		return role_requis_rpc_serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.INTERFACE_RPC__ROLE_FOURNI_RPC_CLIENT:
				return ((InternalEList<?>)getRole_fourni_rpc_client()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.INTERFACE_RPC__ROLE_REQUIS_RPC_CLIENT:
				return ((InternalEList<?>)getRole_requis_rpc_client()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.INTERFACE_RPC__ROLE_FOURNI_RPC_SERVEUR:
				return ((InternalEList<?>)getRole_fourni_rpc_serveur()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.INTERFACE_RPC__ROLE_REQUIS_RPC_SERVEUR:
				return ((InternalEList<?>)getRole_requis_rpc_serveur()).basicRemove(otherEnd, msgs);
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
			case Client_serveurPackage.INTERFACE_RPC__ROLE_FOURNI_RPC_CLIENT:
				return getRole_fourni_rpc_client();
			case Client_serveurPackage.INTERFACE_RPC__ROLE_REQUIS_RPC_CLIENT:
				return getRole_requis_rpc_client();
			case Client_serveurPackage.INTERFACE_RPC__ROLE_FOURNI_RPC_SERVEUR:
				return getRole_fourni_rpc_serveur();
			case Client_serveurPackage.INTERFACE_RPC__ROLE_REQUIS_RPC_SERVEUR:
				return getRole_requis_rpc_serveur();
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
			case Client_serveurPackage.INTERFACE_RPC__ROLE_FOURNI_RPC_CLIENT:
				getRole_fourni_rpc_client().clear();
				getRole_fourni_rpc_client().addAll((Collection<? extends Role_Fourni_RPC_Client>)newValue);
				return;
			case Client_serveurPackage.INTERFACE_RPC__ROLE_REQUIS_RPC_CLIENT:
				getRole_requis_rpc_client().clear();
				getRole_requis_rpc_client().addAll((Collection<? extends Role_Requis_RPC_Client>)newValue);
				return;
			case Client_serveurPackage.INTERFACE_RPC__ROLE_FOURNI_RPC_SERVEUR:
				getRole_fourni_rpc_serveur().clear();
				getRole_fourni_rpc_serveur().addAll((Collection<? extends Role_Fourni_RPC_Serveur>)newValue);
				return;
			case Client_serveurPackage.INTERFACE_RPC__ROLE_REQUIS_RPC_SERVEUR:
				getRole_requis_rpc_serveur().clear();
				getRole_requis_rpc_serveur().addAll((Collection<? extends Role_Requis_RPC_Serveur>)newValue);
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
			case Client_serveurPackage.INTERFACE_RPC__ROLE_FOURNI_RPC_CLIENT:
				getRole_fourni_rpc_client().clear();
				return;
			case Client_serveurPackage.INTERFACE_RPC__ROLE_REQUIS_RPC_CLIENT:
				getRole_requis_rpc_client().clear();
				return;
			case Client_serveurPackage.INTERFACE_RPC__ROLE_FOURNI_RPC_SERVEUR:
				getRole_fourni_rpc_serveur().clear();
				return;
			case Client_serveurPackage.INTERFACE_RPC__ROLE_REQUIS_RPC_SERVEUR:
				getRole_requis_rpc_serveur().clear();
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
			case Client_serveurPackage.INTERFACE_RPC__ROLE_FOURNI_RPC_CLIENT:
				return role_fourni_rpc_client != null && !role_fourni_rpc_client.isEmpty();
			case Client_serveurPackage.INTERFACE_RPC__ROLE_REQUIS_RPC_CLIENT:
				return role_requis_rpc_client != null && !role_requis_rpc_client.isEmpty();
			case Client_serveurPackage.INTERFACE_RPC__ROLE_FOURNI_RPC_SERVEUR:
				return role_fourni_rpc_serveur != null && !role_fourni_rpc_serveur.isEmpty();
			case Client_serveurPackage.INTERFACE_RPC__ROLE_REQUIS_RPC_SERVEUR:
				return role_requis_rpc_serveur != null && !role_requis_rpc_serveur.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	public void notif() {
		// from Client to Serveur
		String message = ((Role_Requis_RPC_ClientImpl) role_requis_rpc_client.get(0)).getRequest();
		if(message!=null)
			((Role_Fourni_RPC_ServeurImpl) role_fourni_rpc_serveur.get(0)).sendRequest(message);
		
		// from Serveur to Client
		
		message = ((Role_Requis_RPC_ServeurImpl) role_requis_rpc_serveur.get(0)).getResponse();
		if(message!=null)
			((Role_Fourni_RPC_ClientImpl) role_fourni_rpc_client.get(0)).sendResponse(message);
	}

} //Interface_RPCImpl
