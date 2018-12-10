/**
 */
package client_serveur.impl;

import client_serveur.Attachment_RPC_Serveur;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_Requis_Serveur;
import client_serveur.Role_Fourni_RPC_Serveur;

import cosa.impl.AttachmentImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment RPC Serveur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Attachment_RPC_ServeurImpl#getRole_fourni_rpc_serveur <em>Role fourni rpc serveur</em>}</li>
 *   <li>{@link client_serveur.impl.Attachment_RPC_ServeurImpl#getPort_requis_serveur <em>Port requis serveur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Attachment_RPC_ServeurImpl extends AttachmentImpl implements Attachment_RPC_Serveur {
	/**
	 * The cached value of the '{@link #getRole_fourni_rpc_serveur() <em>Role fourni rpc serveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_fourni_rpc_serveur()
	 * @generated
	 * @ordered
	 */
	protected Role_Fourni_RPC_Serveur role_fourni_rpc_serveur;

	/**
	 * The cached value of the '{@link #getPort_requis_serveur() <em>Port requis serveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_requis_serveur()
	 * @generated
	 * @ordered
	 */
	protected Port_Requis_Serveur port_requis_serveur;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attachment_RPC_ServeurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.ATTACHMENT_RPC_SERVEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Fourni_RPC_Serveur getRole_fourni_rpc_serveur() {
		if (role_fourni_rpc_serveur != null && role_fourni_rpc_serveur.eIsProxy()) {
			InternalEObject oldRole_fourni_rpc_serveur = (InternalEObject)role_fourni_rpc_serveur;
			role_fourni_rpc_serveur = (Role_Fourni_RPC_Serveur)eResolveProxy(oldRole_fourni_rpc_serveur);
			if (role_fourni_rpc_serveur != oldRole_fourni_rpc_serveur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ATTACHMENT_RPC_SERVEUR__ROLE_FOURNI_RPC_SERVEUR, oldRole_fourni_rpc_serveur, role_fourni_rpc_serveur));
			}
		}
		return role_fourni_rpc_serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Fourni_RPC_Serveur basicGetRole_fourni_rpc_serveur() {
		return role_fourni_rpc_serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole_fourni_rpc_serveur(Role_Fourni_RPC_Serveur newRole_fourni_rpc_serveur, NotificationChain msgs) {
		Role_Fourni_RPC_Serveur oldRole_fourni_rpc_serveur = role_fourni_rpc_serveur;
		role_fourni_rpc_serveur = newRole_fourni_rpc_serveur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_RPC_SERVEUR__ROLE_FOURNI_RPC_SERVEUR, oldRole_fourni_rpc_serveur, newRole_fourni_rpc_serveur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole_fourni_rpc_serveur(Role_Fourni_RPC_Serveur newRole_fourni_rpc_serveur) {
		if (newRole_fourni_rpc_serveur != role_fourni_rpc_serveur) {
			NotificationChain msgs = null;
			if (role_fourni_rpc_serveur != null)
				msgs = ((InternalEObject)role_fourni_rpc_serveur).eInverseRemove(this, Client_serveurPackage.ROLE_FOURNI_RPC_SERVEUR__ATTACHMENT_RPC_SERVEUR, Role_Fourni_RPC_Serveur.class, msgs);
			if (newRole_fourni_rpc_serveur != null)
				msgs = ((InternalEObject)newRole_fourni_rpc_serveur).eInverseAdd(this, Client_serveurPackage.ROLE_FOURNI_RPC_SERVEUR__ATTACHMENT_RPC_SERVEUR, Role_Fourni_RPC_Serveur.class, msgs);
			msgs = basicSetRole_fourni_rpc_serveur(newRole_fourni_rpc_serveur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_RPC_SERVEUR__ROLE_FOURNI_RPC_SERVEUR, newRole_fourni_rpc_serveur, newRole_fourni_rpc_serveur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Requis_Serveur getPort_requis_serveur() {
		if (port_requis_serveur != null && port_requis_serveur.eIsProxy()) {
			InternalEObject oldPort_requis_serveur = (InternalEObject)port_requis_serveur;
			port_requis_serveur = (Port_Requis_Serveur)eResolveProxy(oldPort_requis_serveur);
			if (port_requis_serveur != oldPort_requis_serveur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ATTACHMENT_RPC_SERVEUR__PORT_REQUIS_SERVEUR, oldPort_requis_serveur, port_requis_serveur));
			}
		}
		return port_requis_serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Requis_Serveur basicGetPort_requis_serveur() {
		return port_requis_serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort_requis_serveur(Port_Requis_Serveur newPort_requis_serveur, NotificationChain msgs) {
		Port_Requis_Serveur oldPort_requis_serveur = port_requis_serveur;
		port_requis_serveur = newPort_requis_serveur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_RPC_SERVEUR__PORT_REQUIS_SERVEUR, oldPort_requis_serveur, newPort_requis_serveur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_requis_serveur(Port_Requis_Serveur newPort_requis_serveur) {
		if (newPort_requis_serveur != port_requis_serveur) {
			NotificationChain msgs = null;
			if (port_requis_serveur != null)
				msgs = ((InternalEObject)port_requis_serveur).eInverseRemove(this, Client_serveurPackage.PORT_REQUIS_SERVEUR__ATTACHMENT_RPC_SERVEUR, Port_Requis_Serveur.class, msgs);
			if (newPort_requis_serveur != null)
				msgs = ((InternalEObject)newPort_requis_serveur).eInverseAdd(this, Client_serveurPackage.PORT_REQUIS_SERVEUR__ATTACHMENT_RPC_SERVEUR, Port_Requis_Serveur.class, msgs);
			msgs = basicSetPort_requis_serveur(newPort_requis_serveur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_RPC_SERVEUR__PORT_REQUIS_SERVEUR, newPort_requis_serveur, newPort_requis_serveur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.ATTACHMENT_RPC_SERVEUR__ROLE_FOURNI_RPC_SERVEUR:
				if (role_fourni_rpc_serveur != null)
					msgs = ((InternalEObject)role_fourni_rpc_serveur).eInverseRemove(this, Client_serveurPackage.ROLE_FOURNI_RPC_SERVEUR__ATTACHMENT_RPC_SERVEUR, Role_Fourni_RPC_Serveur.class, msgs);
				return basicSetRole_fourni_rpc_serveur((Role_Fourni_RPC_Serveur)otherEnd, msgs);
			case Client_serveurPackage.ATTACHMENT_RPC_SERVEUR__PORT_REQUIS_SERVEUR:
				if (port_requis_serveur != null)
					msgs = ((InternalEObject)port_requis_serveur).eInverseRemove(this, Client_serveurPackage.PORT_REQUIS_SERVEUR__ATTACHMENT_RPC_SERVEUR, Port_Requis_Serveur.class, msgs);
				return basicSetPort_requis_serveur((Port_Requis_Serveur)otherEnd, msgs);
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
			case Client_serveurPackage.ATTACHMENT_RPC_SERVEUR__ROLE_FOURNI_RPC_SERVEUR:
				return basicSetRole_fourni_rpc_serveur(null, msgs);
			case Client_serveurPackage.ATTACHMENT_RPC_SERVEUR__PORT_REQUIS_SERVEUR:
				return basicSetPort_requis_serveur(null, msgs);
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
			case Client_serveurPackage.ATTACHMENT_RPC_SERVEUR__ROLE_FOURNI_RPC_SERVEUR:
				if (resolve) return getRole_fourni_rpc_serveur();
				return basicGetRole_fourni_rpc_serveur();
			case Client_serveurPackage.ATTACHMENT_RPC_SERVEUR__PORT_REQUIS_SERVEUR:
				if (resolve) return getPort_requis_serveur();
				return basicGetPort_requis_serveur();
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
			case Client_serveurPackage.ATTACHMENT_RPC_SERVEUR__ROLE_FOURNI_RPC_SERVEUR:
				setRole_fourni_rpc_serveur((Role_Fourni_RPC_Serveur)newValue);
				return;
			case Client_serveurPackage.ATTACHMENT_RPC_SERVEUR__PORT_REQUIS_SERVEUR:
				setPort_requis_serveur((Port_Requis_Serveur)newValue);
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
			case Client_serveurPackage.ATTACHMENT_RPC_SERVEUR__ROLE_FOURNI_RPC_SERVEUR:
				setRole_fourni_rpc_serveur((Role_Fourni_RPC_Serveur)null);
				return;
			case Client_serveurPackage.ATTACHMENT_RPC_SERVEUR__PORT_REQUIS_SERVEUR:
				setPort_requis_serveur((Port_Requis_Serveur)null);
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
			case Client_serveurPackage.ATTACHMENT_RPC_SERVEUR__ROLE_FOURNI_RPC_SERVEUR:
				return role_fourni_rpc_serveur != null;
			case Client_serveurPackage.ATTACHMENT_RPC_SERVEUR__PORT_REQUIS_SERVEUR:
				return port_requis_serveur != null;
		}
		return super.eIsSet(featureID);
	}

	public void sendRequest(String message) {
		System.out.println("AttachmentRPCServeur --> ");
		((Port_Requis_ServeurImpl) port_requis_serveur).sendRequest(message);
	}

} //Attachment_RPC_ServeurImpl
