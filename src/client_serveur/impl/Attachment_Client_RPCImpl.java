/**
 */
package client_serveur.impl;

import client_serveur.Attachment_Client_RPC;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_Fourni_Client;
import client_serveur.Role_Requis_RPC_Client;

import cosa.impl.AttachmentImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment Client RPC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Attachment_Client_RPCImpl#getPort_fourni_client <em>Port fourni client</em>}</li>
 *   <li>{@link client_serveur.impl.Attachment_Client_RPCImpl#getRole_requis_rpc_client <em>Role requis rpc client</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Attachment_Client_RPCImpl extends AttachmentImpl implements Attachment_Client_RPC {
	/**
	 * The cached value of the '{@link #getPort_fourni_client() <em>Port fourni client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_fourni_client()
	 * @generated
	 * @ordered
	 */
	protected Port_Fourni_Client port_fourni_client;

	/**
	 * The cached value of the '{@link #getRole_requis_rpc_client() <em>Role requis rpc client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_requis_rpc_client()
	 * @generated
	 * @ordered
	 */
	protected Role_Requis_RPC_Client role_requis_rpc_client;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attachment_Client_RPCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.ATTACHMENT_CLIENT_RPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Fourni_Client getPort_fourni_client() {
		if (port_fourni_client != null && port_fourni_client.eIsProxy()) {
			InternalEObject oldPort_fourni_client = (InternalEObject)port_fourni_client;
			port_fourni_client = (Port_Fourni_Client)eResolveProxy(oldPort_fourni_client);
			if (port_fourni_client != oldPort_fourni_client) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ATTACHMENT_CLIENT_RPC__PORT_FOURNI_CLIENT, oldPort_fourni_client, port_fourni_client));
			}
		}
		return port_fourni_client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Fourni_Client basicGetPort_fourni_client() {
		return port_fourni_client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort_fourni_client(Port_Fourni_Client newPort_fourni_client, NotificationChain msgs) {
		Port_Fourni_Client oldPort_fourni_client = port_fourni_client;
		port_fourni_client = newPort_fourni_client;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_CLIENT_RPC__PORT_FOURNI_CLIENT, oldPort_fourni_client, newPort_fourni_client);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_fourni_client(Port_Fourni_Client newPort_fourni_client) {
		if (newPort_fourni_client != port_fourni_client) {
			NotificationChain msgs = null;
			if (port_fourni_client != null)
				msgs = ((InternalEObject)port_fourni_client).eInverseRemove(this, Client_serveurPackage.PORT_FOURNI_CLIENT__ATTACHMENT_CLIENT_RPC, Port_Fourni_Client.class, msgs);
			if (newPort_fourni_client != null)
				msgs = ((InternalEObject)newPort_fourni_client).eInverseAdd(this, Client_serveurPackage.PORT_FOURNI_CLIENT__ATTACHMENT_CLIENT_RPC, Port_Fourni_Client.class, msgs);
			msgs = basicSetPort_fourni_client(newPort_fourni_client, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_CLIENT_RPC__PORT_FOURNI_CLIENT, newPort_fourni_client, newPort_fourni_client));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Requis_RPC_Client getRole_requis_rpc_client() {
		if (role_requis_rpc_client != null && role_requis_rpc_client.eIsProxy()) {
			InternalEObject oldRole_requis_rpc_client = (InternalEObject)role_requis_rpc_client;
			role_requis_rpc_client = (Role_Requis_RPC_Client)eResolveProxy(oldRole_requis_rpc_client);
			if (role_requis_rpc_client != oldRole_requis_rpc_client) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ATTACHMENT_CLIENT_RPC__ROLE_REQUIS_RPC_CLIENT, oldRole_requis_rpc_client, role_requis_rpc_client));
			}
		}
		return role_requis_rpc_client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Requis_RPC_Client basicGetRole_requis_rpc_client() {
		return role_requis_rpc_client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole_requis_rpc_client(Role_Requis_RPC_Client newRole_requis_rpc_client, NotificationChain msgs) {
		Role_Requis_RPC_Client oldRole_requis_rpc_client = role_requis_rpc_client;
		role_requis_rpc_client = newRole_requis_rpc_client;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_CLIENT_RPC__ROLE_REQUIS_RPC_CLIENT, oldRole_requis_rpc_client, newRole_requis_rpc_client);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole_requis_rpc_client(Role_Requis_RPC_Client newRole_requis_rpc_client) {
		if (newRole_requis_rpc_client != role_requis_rpc_client) {
			NotificationChain msgs = null;
			if (role_requis_rpc_client != null)
				msgs = ((InternalEObject)role_requis_rpc_client).eInverseRemove(this, Client_serveurPackage.ROLE_REQUIS_RPC_CLIENT__ATTACHMENT_CLIENT_RPC, Role_Requis_RPC_Client.class, msgs);
			if (newRole_requis_rpc_client != null)
				msgs = ((InternalEObject)newRole_requis_rpc_client).eInverseAdd(this, Client_serveurPackage.ROLE_REQUIS_RPC_CLIENT__ATTACHMENT_CLIENT_RPC, Role_Requis_RPC_Client.class, msgs);
			msgs = basicSetRole_requis_rpc_client(newRole_requis_rpc_client, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_CLIENT_RPC__ROLE_REQUIS_RPC_CLIENT, newRole_requis_rpc_client, newRole_requis_rpc_client));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.ATTACHMENT_CLIENT_RPC__PORT_FOURNI_CLIENT:
				if (port_fourni_client != null)
					msgs = ((InternalEObject)port_fourni_client).eInverseRemove(this, Client_serveurPackage.PORT_FOURNI_CLIENT__ATTACHMENT_CLIENT_RPC, Port_Fourni_Client.class, msgs);
				return basicSetPort_fourni_client((Port_Fourni_Client)otherEnd, msgs);
			case Client_serveurPackage.ATTACHMENT_CLIENT_RPC__ROLE_REQUIS_RPC_CLIENT:
				if (role_requis_rpc_client != null)
					msgs = ((InternalEObject)role_requis_rpc_client).eInverseRemove(this, Client_serveurPackage.ROLE_REQUIS_RPC_CLIENT__ATTACHMENT_CLIENT_RPC, Role_Requis_RPC_Client.class, msgs);
				return basicSetRole_requis_rpc_client((Role_Requis_RPC_Client)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.ATTACHMENT_CLIENT_RPC__PORT_FOURNI_CLIENT:
				return basicSetPort_fourni_client(null, msgs);
			case Client_serveurPackage.ATTACHMENT_CLIENT_RPC__ROLE_REQUIS_RPC_CLIENT:
				return basicSetRole_requis_rpc_client(null, msgs);
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
			case Client_serveurPackage.ATTACHMENT_CLIENT_RPC__PORT_FOURNI_CLIENT:
				if (resolve) return getPort_fourni_client();
				return basicGetPort_fourni_client();
			case Client_serveurPackage.ATTACHMENT_CLIENT_RPC__ROLE_REQUIS_RPC_CLIENT:
				if (resolve) return getRole_requis_rpc_client();
				return basicGetRole_requis_rpc_client();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Client_serveurPackage.ATTACHMENT_CLIENT_RPC__PORT_FOURNI_CLIENT:
				setPort_fourni_client((Port_Fourni_Client)newValue);
				return;
			case Client_serveurPackage.ATTACHMENT_CLIENT_RPC__ROLE_REQUIS_RPC_CLIENT:
				setRole_requis_rpc_client((Role_Requis_RPC_Client)newValue);
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
			case Client_serveurPackage.ATTACHMENT_CLIENT_RPC__PORT_FOURNI_CLIENT:
				setPort_fourni_client((Port_Fourni_Client)null);
				return;
			case Client_serveurPackage.ATTACHMENT_CLIENT_RPC__ROLE_REQUIS_RPC_CLIENT:
				setRole_requis_rpc_client((Role_Requis_RPC_Client)null);
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
			case Client_serveurPackage.ATTACHMENT_CLIENT_RPC__PORT_FOURNI_CLIENT:
				return port_fourni_client != null;
			case Client_serveurPackage.ATTACHMENT_CLIENT_RPC__ROLE_REQUIS_RPC_CLIENT:
				return role_requis_rpc_client != null;
		}
		return super.eIsSet(featureID);
	}
	
	public void sendRequest(String request) {
		System.out.println("AttachmentClientRPC --> ");
		((Role_Requis_RPC_ClientImpl) role_requis_rpc_client).sendRequest(request);
	}

} //Attachment_Client_RPCImpl
