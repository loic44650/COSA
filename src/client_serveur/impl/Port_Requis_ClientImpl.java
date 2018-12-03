/**
 */
package client_serveur.impl;

import client_serveur.Attachment_RPC_Client;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_Requis_Client;

import cosa.impl.Port_RequisImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Requis Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Port_Requis_ClientImpl#getAttachment_rpc_client <em>Attachment rpc client</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Port_Requis_ClientImpl extends Port_RequisImpl implements Port_Requis_Client {
	/**
	 * The cached value of the '{@link #getAttachment_rpc_client() <em>Attachment rpc client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_rpc_client()
	 * @generated
	 * @ordered
	 */
	protected Attachment_RPC_Client attachment_rpc_client;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Port_Requis_ClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.PORT_REQUIS_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_RPC_Client getAttachment_rpc_client() {
		if (attachment_rpc_client != null && attachment_rpc_client.eIsProxy()) {
			InternalEObject oldAttachment_rpc_client = (InternalEObject)attachment_rpc_client;
			attachment_rpc_client = (Attachment_RPC_Client)eResolveProxy(oldAttachment_rpc_client);
			if (attachment_rpc_client != oldAttachment_rpc_client) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.PORT_REQUIS_CLIENT__ATTACHMENT_RPC_CLIENT, oldAttachment_rpc_client, attachment_rpc_client));
			}
		}
		return attachment_rpc_client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_RPC_Client basicGetAttachment_rpc_client() {
		return attachment_rpc_client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachment_rpc_client(Attachment_RPC_Client newAttachment_rpc_client, NotificationChain msgs) {
		Attachment_RPC_Client oldAttachment_rpc_client = attachment_rpc_client;
		attachment_rpc_client = newAttachment_rpc_client;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.PORT_REQUIS_CLIENT__ATTACHMENT_RPC_CLIENT, oldAttachment_rpc_client, newAttachment_rpc_client);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_rpc_client(Attachment_RPC_Client newAttachment_rpc_client) {
		if (newAttachment_rpc_client != attachment_rpc_client) {
			NotificationChain msgs = null;
			if (attachment_rpc_client != null)
				msgs = ((InternalEObject)attachment_rpc_client).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_RPC_CLIENT__PORT_REQUIS_CLIENT, Attachment_RPC_Client.class, msgs);
			if (newAttachment_rpc_client != null)
				msgs = ((InternalEObject)newAttachment_rpc_client).eInverseAdd(this, Client_serveurPackage.ATTACHMENT_RPC_CLIENT__PORT_REQUIS_CLIENT, Attachment_RPC_Client.class, msgs);
			msgs = basicSetAttachment_rpc_client(newAttachment_rpc_client, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.PORT_REQUIS_CLIENT__ATTACHMENT_RPC_CLIENT, newAttachment_rpc_client, newAttachment_rpc_client));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.PORT_REQUIS_CLIENT__ATTACHMENT_RPC_CLIENT:
				if (attachment_rpc_client != null)
					msgs = ((InternalEObject)attachment_rpc_client).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_RPC_CLIENT__PORT_REQUIS_CLIENT, Attachment_RPC_Client.class, msgs);
				return basicSetAttachment_rpc_client((Attachment_RPC_Client)otherEnd, msgs);
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
			case Client_serveurPackage.PORT_REQUIS_CLIENT__ATTACHMENT_RPC_CLIENT:
				return basicSetAttachment_rpc_client(null, msgs);
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
			case Client_serveurPackage.PORT_REQUIS_CLIENT__ATTACHMENT_RPC_CLIENT:
				if (resolve) return getAttachment_rpc_client();
				return basicGetAttachment_rpc_client();
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
			case Client_serveurPackage.PORT_REQUIS_CLIENT__ATTACHMENT_RPC_CLIENT:
				setAttachment_rpc_client((Attachment_RPC_Client)newValue);
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
			case Client_serveurPackage.PORT_REQUIS_CLIENT__ATTACHMENT_RPC_CLIENT:
				setAttachment_rpc_client((Attachment_RPC_Client)null);
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
			case Client_serveurPackage.PORT_REQUIS_CLIENT__ATTACHMENT_RPC_CLIENT:
				return attachment_rpc_client != null;
		}
		return super.eIsSet(featureID);
	}

} //Port_Requis_ClientImpl
