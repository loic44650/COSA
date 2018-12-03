/**
 */
package client_serveur.impl;

import client_serveur.Attachment_Gamma_DB;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_Requis_Gamma_DB;
import client_serveur.Role_Fourni_Gamma_DB;

import cosa.impl.AttachmentImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment Gamma DB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Attachment_Gamma_DBImpl#getRole_fourni_gamma_db <em>Role fourni gamma db</em>}</li>
 *   <li>{@link client_serveur.impl.Attachment_Gamma_DBImpl#getPort_requis_gamma_db <em>Port requis gamma db</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Attachment_Gamma_DBImpl extends AttachmentImpl implements Attachment_Gamma_DB {
	/**
	 * The cached value of the '{@link #getRole_fourni_gamma_db() <em>Role fourni gamma db</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_fourni_gamma_db()
	 * @generated
	 * @ordered
	 */
	protected Role_Fourni_Gamma_DB role_fourni_gamma_db;

	/**
	 * The cached value of the '{@link #getPort_requis_gamma_db() <em>Port requis gamma db</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_requis_gamma_db()
	 * @generated
	 * @ordered
	 */
	protected Port_Requis_Gamma_DB port_requis_gamma_db;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attachment_Gamma_DBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.ATTACHMENT_GAMMA_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Fourni_Gamma_DB getRole_fourni_gamma_db() {
		if (role_fourni_gamma_db != null && role_fourni_gamma_db.eIsProxy()) {
			InternalEObject oldRole_fourni_gamma_db = (InternalEObject)role_fourni_gamma_db;
			role_fourni_gamma_db = (Role_Fourni_Gamma_DB)eResolveProxy(oldRole_fourni_gamma_db);
			if (role_fourni_gamma_db != oldRole_fourni_gamma_db) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ATTACHMENT_GAMMA_DB__ROLE_FOURNI_GAMMA_DB, oldRole_fourni_gamma_db, role_fourni_gamma_db));
			}
		}
		return role_fourni_gamma_db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Fourni_Gamma_DB basicGetRole_fourni_gamma_db() {
		return role_fourni_gamma_db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole_fourni_gamma_db(Role_Fourni_Gamma_DB newRole_fourni_gamma_db, NotificationChain msgs) {
		Role_Fourni_Gamma_DB oldRole_fourni_gamma_db = role_fourni_gamma_db;
		role_fourni_gamma_db = newRole_fourni_gamma_db;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_GAMMA_DB__ROLE_FOURNI_GAMMA_DB, oldRole_fourni_gamma_db, newRole_fourni_gamma_db);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole_fourni_gamma_db(Role_Fourni_Gamma_DB newRole_fourni_gamma_db) {
		if (newRole_fourni_gamma_db != role_fourni_gamma_db) {
			NotificationChain msgs = null;
			if (role_fourni_gamma_db != null)
				msgs = ((InternalEObject)role_fourni_gamma_db).eInverseRemove(this, Client_serveurPackage.ROLE_FOURNI_GAMMA_DB__ATTACHMENT_GAMMA_DB, Role_Fourni_Gamma_DB.class, msgs);
			if (newRole_fourni_gamma_db != null)
				msgs = ((InternalEObject)newRole_fourni_gamma_db).eInverseAdd(this, Client_serveurPackage.ROLE_FOURNI_GAMMA_DB__ATTACHMENT_GAMMA_DB, Role_Fourni_Gamma_DB.class, msgs);
			msgs = basicSetRole_fourni_gamma_db(newRole_fourni_gamma_db, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_GAMMA_DB__ROLE_FOURNI_GAMMA_DB, newRole_fourni_gamma_db, newRole_fourni_gamma_db));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Requis_Gamma_DB getPort_requis_gamma_db() {
		if (port_requis_gamma_db != null && port_requis_gamma_db.eIsProxy()) {
			InternalEObject oldPort_requis_gamma_db = (InternalEObject)port_requis_gamma_db;
			port_requis_gamma_db = (Port_Requis_Gamma_DB)eResolveProxy(oldPort_requis_gamma_db);
			if (port_requis_gamma_db != oldPort_requis_gamma_db) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ATTACHMENT_GAMMA_DB__PORT_REQUIS_GAMMA_DB, oldPort_requis_gamma_db, port_requis_gamma_db));
			}
		}
		return port_requis_gamma_db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Requis_Gamma_DB basicGetPort_requis_gamma_db() {
		return port_requis_gamma_db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort_requis_gamma_db(Port_Requis_Gamma_DB newPort_requis_gamma_db, NotificationChain msgs) {
		Port_Requis_Gamma_DB oldPort_requis_gamma_db = port_requis_gamma_db;
		port_requis_gamma_db = newPort_requis_gamma_db;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_GAMMA_DB__PORT_REQUIS_GAMMA_DB, oldPort_requis_gamma_db, newPort_requis_gamma_db);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_requis_gamma_db(Port_Requis_Gamma_DB newPort_requis_gamma_db) {
		if (newPort_requis_gamma_db != port_requis_gamma_db) {
			NotificationChain msgs = null;
			if (port_requis_gamma_db != null)
				msgs = ((InternalEObject)port_requis_gamma_db).eInverseRemove(this, Client_serveurPackage.PORT_REQUIS_GAMMA_DB__ATTACHMENT_GAMMA_DB, Port_Requis_Gamma_DB.class, msgs);
			if (newPort_requis_gamma_db != null)
				msgs = ((InternalEObject)newPort_requis_gamma_db).eInverseAdd(this, Client_serveurPackage.PORT_REQUIS_GAMMA_DB__ATTACHMENT_GAMMA_DB, Port_Requis_Gamma_DB.class, msgs);
			msgs = basicSetPort_requis_gamma_db(newPort_requis_gamma_db, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_GAMMA_DB__PORT_REQUIS_GAMMA_DB, newPort_requis_gamma_db, newPort_requis_gamma_db));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.ATTACHMENT_GAMMA_DB__ROLE_FOURNI_GAMMA_DB:
				if (role_fourni_gamma_db != null)
					msgs = ((InternalEObject)role_fourni_gamma_db).eInverseRemove(this, Client_serveurPackage.ROLE_FOURNI_GAMMA_DB__ATTACHMENT_GAMMA_DB, Role_Fourni_Gamma_DB.class, msgs);
				return basicSetRole_fourni_gamma_db((Role_Fourni_Gamma_DB)otherEnd, msgs);
			case Client_serveurPackage.ATTACHMENT_GAMMA_DB__PORT_REQUIS_GAMMA_DB:
				if (port_requis_gamma_db != null)
					msgs = ((InternalEObject)port_requis_gamma_db).eInverseRemove(this, Client_serveurPackage.PORT_REQUIS_GAMMA_DB__ATTACHMENT_GAMMA_DB, Port_Requis_Gamma_DB.class, msgs);
				return basicSetPort_requis_gamma_db((Port_Requis_Gamma_DB)otherEnd, msgs);
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
			case Client_serveurPackage.ATTACHMENT_GAMMA_DB__ROLE_FOURNI_GAMMA_DB:
				return basicSetRole_fourni_gamma_db(null, msgs);
			case Client_serveurPackage.ATTACHMENT_GAMMA_DB__PORT_REQUIS_GAMMA_DB:
				return basicSetPort_requis_gamma_db(null, msgs);
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
			case Client_serveurPackage.ATTACHMENT_GAMMA_DB__ROLE_FOURNI_GAMMA_DB:
				if (resolve) return getRole_fourni_gamma_db();
				return basicGetRole_fourni_gamma_db();
			case Client_serveurPackage.ATTACHMENT_GAMMA_DB__PORT_REQUIS_GAMMA_DB:
				if (resolve) return getPort_requis_gamma_db();
				return basicGetPort_requis_gamma_db();
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
			case Client_serveurPackage.ATTACHMENT_GAMMA_DB__ROLE_FOURNI_GAMMA_DB:
				setRole_fourni_gamma_db((Role_Fourni_Gamma_DB)newValue);
				return;
			case Client_serveurPackage.ATTACHMENT_GAMMA_DB__PORT_REQUIS_GAMMA_DB:
				setPort_requis_gamma_db((Port_Requis_Gamma_DB)newValue);
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
			case Client_serveurPackage.ATTACHMENT_GAMMA_DB__ROLE_FOURNI_GAMMA_DB:
				setRole_fourni_gamma_db((Role_Fourni_Gamma_DB)null);
				return;
			case Client_serveurPackage.ATTACHMENT_GAMMA_DB__PORT_REQUIS_GAMMA_DB:
				setPort_requis_gamma_db((Port_Requis_Gamma_DB)null);
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
			case Client_serveurPackage.ATTACHMENT_GAMMA_DB__ROLE_FOURNI_GAMMA_DB:
				return role_fourni_gamma_db != null;
			case Client_serveurPackage.ATTACHMENT_GAMMA_DB__PORT_REQUIS_GAMMA_DB:
				return port_requis_gamma_db != null;
		}
		return super.eIsSet(featureID);
	}

} //Attachment_Gamma_DBImpl
