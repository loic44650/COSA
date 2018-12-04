/**
 */
package client_serveur.impl;

import client_serveur.Attachment_Client_RPC;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_Fourni_Client;

import cosa.impl.Port_FourniImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Fourni Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Port_Fourni_ClientImpl#getAttachment_client_rpc <em>Attachment client rpc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Port_Fourni_ClientImpl extends Port_FourniImpl implements Port_Fourni_Client {
	/**
	 * The cached value of the '{@link #getAttachment_client_rpc() <em>Attachment client rpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_client_rpc()
	 * @generated
	 * @ordered
	 */
	protected Attachment_Client_RPC attachment_client_rpc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Port_Fourni_ClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.PORT_FOURNI_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Client_RPC getAttachment_client_rpc() {
		if (attachment_client_rpc != null && attachment_client_rpc.eIsProxy()) {
			InternalEObject oldAttachment_client_rpc = (InternalEObject)attachment_client_rpc;
			attachment_client_rpc = (Attachment_Client_RPC)eResolveProxy(oldAttachment_client_rpc);
			if (attachment_client_rpc != oldAttachment_client_rpc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.PORT_FOURNI_CLIENT__ATTACHMENT_CLIENT_RPC, oldAttachment_client_rpc, attachment_client_rpc));
			}
		}
		return attachment_client_rpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Client_RPC basicGetAttachment_client_rpc() {
		return attachment_client_rpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachment_client_rpc(Attachment_Client_RPC newAttachment_client_rpc, NotificationChain msgs) {
		Attachment_Client_RPC oldAttachment_client_rpc = attachment_client_rpc;
		attachment_client_rpc = newAttachment_client_rpc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.PORT_FOURNI_CLIENT__ATTACHMENT_CLIENT_RPC, oldAttachment_client_rpc, newAttachment_client_rpc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_client_rpc(Attachment_Client_RPC newAttachment_client_rpc) {
		if (newAttachment_client_rpc != attachment_client_rpc) {
			NotificationChain msgs = null;
			if (attachment_client_rpc != null)
				msgs = ((InternalEObject)attachment_client_rpc).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_CLIENT_RPC__PORT_FOURNI_CLIENT, Attachment_Client_RPC.class, msgs);
			if (newAttachment_client_rpc != null)
				msgs = ((InternalEObject)newAttachment_client_rpc).eInverseAdd(this, Client_serveurPackage.ATTACHMENT_CLIENT_RPC__PORT_FOURNI_CLIENT, Attachment_Client_RPC.class, msgs);
			msgs = basicSetAttachment_client_rpc(newAttachment_client_rpc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.PORT_FOURNI_CLIENT__ATTACHMENT_CLIENT_RPC, newAttachment_client_rpc, newAttachment_client_rpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.PORT_FOURNI_CLIENT__ATTACHMENT_CLIENT_RPC:
				if (attachment_client_rpc != null)
					msgs = ((InternalEObject)attachment_client_rpc).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_CLIENT_RPC__PORT_FOURNI_CLIENT, Attachment_Client_RPC.class, msgs);
				return basicSetAttachment_client_rpc((Attachment_Client_RPC)otherEnd, msgs);
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
			case Client_serveurPackage.PORT_FOURNI_CLIENT__ATTACHMENT_CLIENT_RPC:
				return basicSetAttachment_client_rpc(null, msgs);
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
			case Client_serveurPackage.PORT_FOURNI_CLIENT__ATTACHMENT_CLIENT_RPC:
				if (resolve) return getAttachment_client_rpc();
				return basicGetAttachment_client_rpc();
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
			case Client_serveurPackage.PORT_FOURNI_CLIENT__ATTACHMENT_CLIENT_RPC:
				setAttachment_client_rpc((Attachment_Client_RPC)newValue);
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
			case Client_serveurPackage.PORT_FOURNI_CLIENT__ATTACHMENT_CLIENT_RPC:
				setAttachment_client_rpc((Attachment_Client_RPC)null);
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
			case Client_serveurPackage.PORT_FOURNI_CLIENT__ATTACHMENT_CLIENT_RPC:
				return attachment_client_rpc != null;
		}
		return super.eIsSet(featureID);
	}

} //Port_Fourni_ClientImpl
