/**
 */
package client_serveur.impl;

import client_serveur.Attachment_RPC_Client;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_Requis_Client;
import client_serveur.Role_Fourni_RPC_Client;

import cosa.impl.AttachmentImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment RPC Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Attachment_RPC_ClientImpl#getPort_requis_client <em>Port requis client</em>}</li>
 *   <li>{@link client_serveur.impl.Attachment_RPC_ClientImpl#getRole_fourni_rpc_client <em>Role fourni rpc client</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Attachment_RPC_ClientImpl extends AttachmentImpl implements Attachment_RPC_Client {
	/**
	 * The cached value of the '{@link #getPort_requis_client() <em>Port requis client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_requis_client()
	 * @generated
	 * @ordered
	 */
	protected Port_Requis_Client port_requis_client;

	/**
	 * The cached value of the '{@link #getRole_fourni_rpc_client() <em>Role fourni rpc client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_fourni_rpc_client()
	 * @generated
	 * @ordered
	 */
	protected Role_Fourni_RPC_Client role_fourni_rpc_client;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attachment_RPC_ClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.ATTACHMENT_RPC_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Requis_Client getPort_requis_client() {
		if (port_requis_client != null && port_requis_client.eIsProxy()) {
			InternalEObject oldPort_requis_client = (InternalEObject)port_requis_client;
			port_requis_client = (Port_Requis_Client)eResolveProxy(oldPort_requis_client);
			if (port_requis_client != oldPort_requis_client) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ATTACHMENT_RPC_CLIENT__PORT_REQUIS_CLIENT, oldPort_requis_client, port_requis_client));
			}
		}
		return port_requis_client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Requis_Client basicGetPort_requis_client() {
		return port_requis_client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort_requis_client(Port_Requis_Client newPort_requis_client, NotificationChain msgs) {
		Port_Requis_Client oldPort_requis_client = port_requis_client;
		port_requis_client = newPort_requis_client;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_RPC_CLIENT__PORT_REQUIS_CLIENT, oldPort_requis_client, newPort_requis_client);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_requis_client(Port_Requis_Client newPort_requis_client) {
		if (newPort_requis_client != port_requis_client) {
			NotificationChain msgs = null;
			if (port_requis_client != null)
				msgs = ((InternalEObject)port_requis_client).eInverseRemove(this, Client_serveurPackage.PORT_REQUIS_CLIENT__ATTACHMENT_RPC_CLIENT, Port_Requis_Client.class, msgs);
			if (newPort_requis_client != null)
				msgs = ((InternalEObject)newPort_requis_client).eInverseAdd(this, Client_serveurPackage.PORT_REQUIS_CLIENT__ATTACHMENT_RPC_CLIENT, Port_Requis_Client.class, msgs);
			msgs = basicSetPort_requis_client(newPort_requis_client, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_RPC_CLIENT__PORT_REQUIS_CLIENT, newPort_requis_client, newPort_requis_client));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Fourni_RPC_Client getRole_fourni_rpc_client() {
		if (role_fourni_rpc_client != null && role_fourni_rpc_client.eIsProxy()) {
			InternalEObject oldRole_fourni_rpc_client = (InternalEObject)role_fourni_rpc_client;
			role_fourni_rpc_client = (Role_Fourni_RPC_Client)eResolveProxy(oldRole_fourni_rpc_client);
			if (role_fourni_rpc_client != oldRole_fourni_rpc_client) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ATTACHMENT_RPC_CLIENT__ROLE_FOURNI_RPC_CLIENT, oldRole_fourni_rpc_client, role_fourni_rpc_client));
			}
		}
		return role_fourni_rpc_client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Fourni_RPC_Client basicGetRole_fourni_rpc_client() {
		return role_fourni_rpc_client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole_fourni_rpc_client(Role_Fourni_RPC_Client newRole_fourni_rpc_client, NotificationChain msgs) {
		Role_Fourni_RPC_Client oldRole_fourni_rpc_client = role_fourni_rpc_client;
		role_fourni_rpc_client = newRole_fourni_rpc_client;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_RPC_CLIENT__ROLE_FOURNI_RPC_CLIENT, oldRole_fourni_rpc_client, newRole_fourni_rpc_client);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole_fourni_rpc_client(Role_Fourni_RPC_Client newRole_fourni_rpc_client) {
		if (newRole_fourni_rpc_client != role_fourni_rpc_client) {
			NotificationChain msgs = null;
			if (role_fourni_rpc_client != null)
				msgs = ((InternalEObject)role_fourni_rpc_client).eInverseRemove(this, Client_serveurPackage.ROLE_FOURNI_RPC_CLIENT__ATTACHMENT_RPC_CLIENT, Role_Fourni_RPC_Client.class, msgs);
			if (newRole_fourni_rpc_client != null)
				msgs = ((InternalEObject)newRole_fourni_rpc_client).eInverseAdd(this, Client_serveurPackage.ROLE_FOURNI_RPC_CLIENT__ATTACHMENT_RPC_CLIENT, Role_Fourni_RPC_Client.class, msgs);
			msgs = basicSetRole_fourni_rpc_client(newRole_fourni_rpc_client, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_RPC_CLIENT__ROLE_FOURNI_RPC_CLIENT, newRole_fourni_rpc_client, newRole_fourni_rpc_client));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.ATTACHMENT_RPC_CLIENT__PORT_REQUIS_CLIENT:
				if (port_requis_client != null)
					msgs = ((InternalEObject)port_requis_client).eInverseRemove(this, Client_serveurPackage.PORT_REQUIS_CLIENT__ATTACHMENT_RPC_CLIENT, Port_Requis_Client.class, msgs);
				return basicSetPort_requis_client((Port_Requis_Client)otherEnd, msgs);
			case Client_serveurPackage.ATTACHMENT_RPC_CLIENT__ROLE_FOURNI_RPC_CLIENT:
				if (role_fourni_rpc_client != null)
					msgs = ((InternalEObject)role_fourni_rpc_client).eInverseRemove(this, Client_serveurPackage.ROLE_FOURNI_RPC_CLIENT__ATTACHMENT_RPC_CLIENT, Role_Fourni_RPC_Client.class, msgs);
				return basicSetRole_fourni_rpc_client((Role_Fourni_RPC_Client)otherEnd, msgs);
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
			case Client_serveurPackage.ATTACHMENT_RPC_CLIENT__PORT_REQUIS_CLIENT:
				return basicSetPort_requis_client(null, msgs);
			case Client_serveurPackage.ATTACHMENT_RPC_CLIENT__ROLE_FOURNI_RPC_CLIENT:
				return basicSetRole_fourni_rpc_client(null, msgs);
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
			case Client_serveurPackage.ATTACHMENT_RPC_CLIENT__PORT_REQUIS_CLIENT:
				if (resolve) return getPort_requis_client();
				return basicGetPort_requis_client();
			case Client_serveurPackage.ATTACHMENT_RPC_CLIENT__ROLE_FOURNI_RPC_CLIENT:
				if (resolve) return getRole_fourni_rpc_client();
				return basicGetRole_fourni_rpc_client();
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
			case Client_serveurPackage.ATTACHMENT_RPC_CLIENT__PORT_REQUIS_CLIENT:
				setPort_requis_client((Port_Requis_Client)newValue);
				return;
			case Client_serveurPackage.ATTACHMENT_RPC_CLIENT__ROLE_FOURNI_RPC_CLIENT:
				setRole_fourni_rpc_client((Role_Fourni_RPC_Client)newValue);
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
			case Client_serveurPackage.ATTACHMENT_RPC_CLIENT__PORT_REQUIS_CLIENT:
				setPort_requis_client((Port_Requis_Client)null);
				return;
			case Client_serveurPackage.ATTACHMENT_RPC_CLIENT__ROLE_FOURNI_RPC_CLIENT:
				setRole_fourni_rpc_client((Role_Fourni_RPC_Client)null);
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
			case Client_serveurPackage.ATTACHMENT_RPC_CLIENT__PORT_REQUIS_CLIENT:
				return port_requis_client != null;
			case Client_serveurPackage.ATTACHMENT_RPC_CLIENT__ROLE_FOURNI_RPC_CLIENT:
				return role_fourni_rpc_client != null;
		}
		return super.eIsSet(featureID);
	}

	public void sendResponse(String response) {
		System.out.println("<-- AttachmentRPCCLient");
		((Port_Requis_ClientImpl) port_requis_client).sendResponse(response);
	}

} //Attachment_RPC_ClientImpl
