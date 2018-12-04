/**
 */
package client_serveur.impl;

import client_serveur.Attachment_Serveur_RPC;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_Fourni_Serveur;
import client_serveur.Role_Requis_RPC_Serveur;

import cosa.impl.AttachmentImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment Serveur RPC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Attachment_Serveur_RPCImpl#getPort_fourni_serveur <em>Port fourni serveur</em>}</li>
 *   <li>{@link client_serveur.impl.Attachment_Serveur_RPCImpl#getRole_requis_rpc_serveur <em>Role requis rpc serveur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Attachment_Serveur_RPCImpl extends AttachmentImpl implements Attachment_Serveur_RPC {
	/**
	 * The cached value of the '{@link #getPort_fourni_serveur() <em>Port fourni serveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_fourni_serveur()
	 * @generated
	 * @ordered
	 */
	protected Port_Fourni_Serveur port_fourni_serveur;

	/**
	 * The cached value of the '{@link #getRole_requis_rpc_serveur() <em>Role requis rpc serveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_requis_rpc_serveur()
	 * @generated
	 * @ordered
	 */
	protected Role_Requis_RPC_Serveur role_requis_rpc_serveur;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attachment_Serveur_RPCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.ATTACHMENT_SERVEUR_RPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Fourni_Serveur getPort_fourni_serveur() {
		if (port_fourni_serveur != null && port_fourni_serveur.eIsProxy()) {
			InternalEObject oldPort_fourni_serveur = (InternalEObject)port_fourni_serveur;
			port_fourni_serveur = (Port_Fourni_Serveur)eResolveProxy(oldPort_fourni_serveur);
			if (port_fourni_serveur != oldPort_fourni_serveur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ATTACHMENT_SERVEUR_RPC__PORT_FOURNI_SERVEUR, oldPort_fourni_serveur, port_fourni_serveur));
			}
		}
		return port_fourni_serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Fourni_Serveur basicGetPort_fourni_serveur() {
		return port_fourni_serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort_fourni_serveur(Port_Fourni_Serveur newPort_fourni_serveur, NotificationChain msgs) {
		Port_Fourni_Serveur oldPort_fourni_serveur = port_fourni_serveur;
		port_fourni_serveur = newPort_fourni_serveur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_SERVEUR_RPC__PORT_FOURNI_SERVEUR, oldPort_fourni_serveur, newPort_fourni_serveur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_fourni_serveur(Port_Fourni_Serveur newPort_fourni_serveur) {
		if (newPort_fourni_serveur != port_fourni_serveur) {
			NotificationChain msgs = null;
			if (port_fourni_serveur != null)
				msgs = ((InternalEObject)port_fourni_serveur).eInverseRemove(this, Client_serveurPackage.PORT_FOURNI_SERVEUR__ATTACHMENT_SERVEUR_RPC, Port_Fourni_Serveur.class, msgs);
			if (newPort_fourni_serveur != null)
				msgs = ((InternalEObject)newPort_fourni_serveur).eInverseAdd(this, Client_serveurPackage.PORT_FOURNI_SERVEUR__ATTACHMENT_SERVEUR_RPC, Port_Fourni_Serveur.class, msgs);
			msgs = basicSetPort_fourni_serveur(newPort_fourni_serveur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_SERVEUR_RPC__PORT_FOURNI_SERVEUR, newPort_fourni_serveur, newPort_fourni_serveur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Requis_RPC_Serveur getRole_requis_rpc_serveur() {
		if (role_requis_rpc_serveur != null && role_requis_rpc_serveur.eIsProxy()) {
			InternalEObject oldRole_requis_rpc_serveur = (InternalEObject)role_requis_rpc_serveur;
			role_requis_rpc_serveur = (Role_Requis_RPC_Serveur)eResolveProxy(oldRole_requis_rpc_serveur);
			if (role_requis_rpc_serveur != oldRole_requis_rpc_serveur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ATTACHMENT_SERVEUR_RPC__ROLE_REQUIS_RPC_SERVEUR, oldRole_requis_rpc_serveur, role_requis_rpc_serveur));
			}
		}
		return role_requis_rpc_serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Requis_RPC_Serveur basicGetRole_requis_rpc_serveur() {
		return role_requis_rpc_serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole_requis_rpc_serveur(Role_Requis_RPC_Serveur newRole_requis_rpc_serveur, NotificationChain msgs) {
		Role_Requis_RPC_Serveur oldRole_requis_rpc_serveur = role_requis_rpc_serveur;
		role_requis_rpc_serveur = newRole_requis_rpc_serveur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_SERVEUR_RPC__ROLE_REQUIS_RPC_SERVEUR, oldRole_requis_rpc_serveur, newRole_requis_rpc_serveur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole_requis_rpc_serveur(Role_Requis_RPC_Serveur newRole_requis_rpc_serveur) {
		if (newRole_requis_rpc_serveur != role_requis_rpc_serveur) {
			NotificationChain msgs = null;
			if (role_requis_rpc_serveur != null)
				msgs = ((InternalEObject)role_requis_rpc_serveur).eInverseRemove(this, Client_serveurPackage.ROLE_REQUIS_RPC_SERVEUR__ATTACHMENT_SERVEUR_RPC, Role_Requis_RPC_Serveur.class, msgs);
			if (newRole_requis_rpc_serveur != null)
				msgs = ((InternalEObject)newRole_requis_rpc_serveur).eInverseAdd(this, Client_serveurPackage.ROLE_REQUIS_RPC_SERVEUR__ATTACHMENT_SERVEUR_RPC, Role_Requis_RPC_Serveur.class, msgs);
			msgs = basicSetRole_requis_rpc_serveur(newRole_requis_rpc_serveur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_SERVEUR_RPC__ROLE_REQUIS_RPC_SERVEUR, newRole_requis_rpc_serveur, newRole_requis_rpc_serveur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.ATTACHMENT_SERVEUR_RPC__PORT_FOURNI_SERVEUR:
				if (port_fourni_serveur != null)
					msgs = ((InternalEObject)port_fourni_serveur).eInverseRemove(this, Client_serveurPackage.PORT_FOURNI_SERVEUR__ATTACHMENT_SERVEUR_RPC, Port_Fourni_Serveur.class, msgs);
				return basicSetPort_fourni_serveur((Port_Fourni_Serveur)otherEnd, msgs);
			case Client_serveurPackage.ATTACHMENT_SERVEUR_RPC__ROLE_REQUIS_RPC_SERVEUR:
				if (role_requis_rpc_serveur != null)
					msgs = ((InternalEObject)role_requis_rpc_serveur).eInverseRemove(this, Client_serveurPackage.ROLE_REQUIS_RPC_SERVEUR__ATTACHMENT_SERVEUR_RPC, Role_Requis_RPC_Serveur.class, msgs);
				return basicSetRole_requis_rpc_serveur((Role_Requis_RPC_Serveur)otherEnd, msgs);
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
			case Client_serveurPackage.ATTACHMENT_SERVEUR_RPC__PORT_FOURNI_SERVEUR:
				return basicSetPort_fourni_serveur(null, msgs);
			case Client_serveurPackage.ATTACHMENT_SERVEUR_RPC__ROLE_REQUIS_RPC_SERVEUR:
				return basicSetRole_requis_rpc_serveur(null, msgs);
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
			case Client_serveurPackage.ATTACHMENT_SERVEUR_RPC__PORT_FOURNI_SERVEUR:
				if (resolve) return getPort_fourni_serveur();
				return basicGetPort_fourni_serveur();
			case Client_serveurPackage.ATTACHMENT_SERVEUR_RPC__ROLE_REQUIS_RPC_SERVEUR:
				if (resolve) return getRole_requis_rpc_serveur();
				return basicGetRole_requis_rpc_serveur();
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
			case Client_serveurPackage.ATTACHMENT_SERVEUR_RPC__PORT_FOURNI_SERVEUR:
				setPort_fourni_serveur((Port_Fourni_Serveur)newValue);
				return;
			case Client_serveurPackage.ATTACHMENT_SERVEUR_RPC__ROLE_REQUIS_RPC_SERVEUR:
				setRole_requis_rpc_serveur((Role_Requis_RPC_Serveur)newValue);
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
			case Client_serveurPackage.ATTACHMENT_SERVEUR_RPC__PORT_FOURNI_SERVEUR:
				setPort_fourni_serveur((Port_Fourni_Serveur)null);
				return;
			case Client_serveurPackage.ATTACHMENT_SERVEUR_RPC__ROLE_REQUIS_RPC_SERVEUR:
				setRole_requis_rpc_serveur((Role_Requis_RPC_Serveur)null);
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
			case Client_serveurPackage.ATTACHMENT_SERVEUR_RPC__PORT_FOURNI_SERVEUR:
				return port_fourni_serveur != null;
			case Client_serveurPackage.ATTACHMENT_SERVEUR_RPC__ROLE_REQUIS_RPC_SERVEUR:
				return role_requis_rpc_serveur != null;
		}
		return super.eIsSet(featureID);
	}

} //Attachment_Serveur_RPCImpl
