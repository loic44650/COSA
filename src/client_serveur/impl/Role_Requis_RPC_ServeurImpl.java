/**
 */
package client_serveur.impl;

import client_serveur.Attachment_Serveur_RPC;
import client_serveur.Client_serveurPackage;
import client_serveur.Role_Requis_RPC_Serveur;

import cosa.impl.Role_RequisImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Requis RPC Serveur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Role_Requis_RPC_ServeurImpl#getAttachment_serveur_rpc <em>Attachment serveur rpc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Role_Requis_RPC_ServeurImpl extends Role_RequisImpl implements Role_Requis_RPC_Serveur {
	/**
	 * The cached value of the '{@link #getAttachment_serveur_rpc() <em>Attachment serveur rpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_serveur_rpc()
	 * @generated
	 * @ordered
	 */
	protected Attachment_Serveur_RPC attachment_serveur_rpc;

	String response;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Role_Requis_RPC_ServeurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.ROLE_REQUIS_RPC_SERVEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Serveur_RPC getAttachment_serveur_rpc() {
		if (attachment_serveur_rpc != null && attachment_serveur_rpc.eIsProxy()) {
			InternalEObject oldAttachment_serveur_rpc = (InternalEObject)attachment_serveur_rpc;
			attachment_serveur_rpc = (Attachment_Serveur_RPC)eResolveProxy(oldAttachment_serveur_rpc);
			if (attachment_serveur_rpc != oldAttachment_serveur_rpc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ROLE_REQUIS_RPC_SERVEUR__ATTACHMENT_SERVEUR_RPC, oldAttachment_serveur_rpc, attachment_serveur_rpc));
			}
		}
		return attachment_serveur_rpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Serveur_RPC basicGetAttachment_serveur_rpc() {
		return attachment_serveur_rpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachment_serveur_rpc(Attachment_Serveur_RPC newAttachment_serveur_rpc, NotificationChain msgs) {
		Attachment_Serveur_RPC oldAttachment_serveur_rpc = attachment_serveur_rpc;
		attachment_serveur_rpc = newAttachment_serveur_rpc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ROLE_REQUIS_RPC_SERVEUR__ATTACHMENT_SERVEUR_RPC, oldAttachment_serveur_rpc, newAttachment_serveur_rpc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_serveur_rpc(Attachment_Serveur_RPC newAttachment_serveur_rpc) {
		if (newAttachment_serveur_rpc != attachment_serveur_rpc) {
			NotificationChain msgs = null;
			if (attachment_serveur_rpc != null)
				msgs = ((InternalEObject)attachment_serveur_rpc).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_SERVEUR_RPC__ROLE_REQUIS_RPC_SERVEUR, Attachment_Serveur_RPC.class, msgs);
			if (newAttachment_serveur_rpc != null)
				msgs = ((InternalEObject)newAttachment_serveur_rpc).eInverseAdd(this, Client_serveurPackage.ATTACHMENT_SERVEUR_RPC__ROLE_REQUIS_RPC_SERVEUR, Attachment_Serveur_RPC.class, msgs);
			msgs = basicSetAttachment_serveur_rpc(newAttachment_serveur_rpc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ROLE_REQUIS_RPC_SERVEUR__ATTACHMENT_SERVEUR_RPC, newAttachment_serveur_rpc, newAttachment_serveur_rpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.ROLE_REQUIS_RPC_SERVEUR__ATTACHMENT_SERVEUR_RPC:
				if (attachment_serveur_rpc != null)
					msgs = ((InternalEObject)attachment_serveur_rpc).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_SERVEUR_RPC__ROLE_REQUIS_RPC_SERVEUR, Attachment_Serveur_RPC.class, msgs);
				return basicSetAttachment_serveur_rpc((Attachment_Serveur_RPC)otherEnd, msgs);
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
			case Client_serveurPackage.ROLE_REQUIS_RPC_SERVEUR__ATTACHMENT_SERVEUR_RPC:
				return basicSetAttachment_serveur_rpc(null, msgs);
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
			case Client_serveurPackage.ROLE_REQUIS_RPC_SERVEUR__ATTACHMENT_SERVEUR_RPC:
				if (resolve) return getAttachment_serveur_rpc();
				return basicGetAttachment_serveur_rpc();
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
			case Client_serveurPackage.ROLE_REQUIS_RPC_SERVEUR__ATTACHMENT_SERVEUR_RPC:
				setAttachment_serveur_rpc((Attachment_Serveur_RPC)newValue);
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
			case Client_serveurPackage.ROLE_REQUIS_RPC_SERVEUR__ATTACHMENT_SERVEUR_RPC:
				setAttachment_serveur_rpc((Attachment_Serveur_RPC)null);
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
			case Client_serveurPackage.ROLE_REQUIS_RPC_SERVEUR__ATTACHMENT_SERVEUR_RPC:
				return attachment_serveur_rpc != null;
		}
		return super.eIsSet(featureID);
	}

	public void sendResponse(String response) {
		this.response = response;
	}
	public String getResponse() {
		return this.response;
	}

} //Role_Requis_RPC_ServeurImpl
