/**
 */
package client_serveur.impl;

import client_serveur.Attachment_RPC_Serveur;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_Requis_Serveur;

import cosa.impl.Port_RequisImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Requis Serveur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Port_Requis_ServeurImpl#getAttachment_rpc_serveur <em>Attachment rpc serveur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Port_Requis_ServeurImpl extends Port_RequisImpl implements Port_Requis_Serveur {
	/**
	 * The cached value of the '{@link #getAttachment_rpc_serveur() <em>Attachment rpc serveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_rpc_serveur()
	 * @generated
	 * @ordered
	 */
	protected Attachment_RPC_Serveur attachment_rpc_serveur;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Port_Requis_ServeurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.PORT_REQUIS_SERVEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_RPC_Serveur getAttachment_rpc_serveur() {
		if (attachment_rpc_serveur != null && attachment_rpc_serveur.eIsProxy()) {
			InternalEObject oldAttachment_rpc_serveur = (InternalEObject)attachment_rpc_serveur;
			attachment_rpc_serveur = (Attachment_RPC_Serveur)eResolveProxy(oldAttachment_rpc_serveur);
			if (attachment_rpc_serveur != oldAttachment_rpc_serveur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.PORT_REQUIS_SERVEUR__ATTACHMENT_RPC_SERVEUR, oldAttachment_rpc_serveur, attachment_rpc_serveur));
			}
		}
		return attachment_rpc_serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_RPC_Serveur basicGetAttachment_rpc_serveur() {
		return attachment_rpc_serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_rpc_serveur(Attachment_RPC_Serveur newAttachment_rpc_serveur) {
		Attachment_RPC_Serveur oldAttachment_rpc_serveur = attachment_rpc_serveur;
		attachment_rpc_serveur = newAttachment_rpc_serveur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.PORT_REQUIS_SERVEUR__ATTACHMENT_RPC_SERVEUR, oldAttachment_rpc_serveur, attachment_rpc_serveur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Client_serveurPackage.PORT_REQUIS_SERVEUR__ATTACHMENT_RPC_SERVEUR:
				if (resolve) return getAttachment_rpc_serveur();
				return basicGetAttachment_rpc_serveur();
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
			case Client_serveurPackage.PORT_REQUIS_SERVEUR__ATTACHMENT_RPC_SERVEUR:
				setAttachment_rpc_serveur((Attachment_RPC_Serveur)newValue);
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
			case Client_serveurPackage.PORT_REQUIS_SERVEUR__ATTACHMENT_RPC_SERVEUR:
				setAttachment_rpc_serveur((Attachment_RPC_Serveur)null);
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
			case Client_serveurPackage.PORT_REQUIS_SERVEUR__ATTACHMENT_RPC_SERVEUR:
				return attachment_rpc_serveur != null;
		}
		return super.eIsSet(featureID);
	}

} //Port_Requis_ServeurImpl
