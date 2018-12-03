/**
 */
package client_serveur.impl;

import client_serveur.Attachment_Gamma_DB;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_Requis_Gamma_DB;

import cosa.impl.Port_RequisImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Requis Gamma DB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Port_Requis_Gamma_DBImpl#getAttachment_gamma_db <em>Attachment gamma db</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Port_Requis_Gamma_DBImpl extends Port_RequisImpl implements Port_Requis_Gamma_DB {
	/**
	 * The cached value of the '{@link #getAttachment_gamma_db() <em>Attachment gamma db</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_gamma_db()
	 * @generated
	 * @ordered
	 */
	protected Attachment_Gamma_DB attachment_gamma_db;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Port_Requis_Gamma_DBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.PORT_REQUIS_GAMMA_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Gamma_DB getAttachment_gamma_db() {
		if (attachment_gamma_db != null && attachment_gamma_db.eIsProxy()) {
			InternalEObject oldAttachment_gamma_db = (InternalEObject)attachment_gamma_db;
			attachment_gamma_db = (Attachment_Gamma_DB)eResolveProxy(oldAttachment_gamma_db);
			if (attachment_gamma_db != oldAttachment_gamma_db) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.PORT_REQUIS_GAMMA_DB__ATTACHMENT_GAMMA_DB, oldAttachment_gamma_db, attachment_gamma_db));
			}
		}
		return attachment_gamma_db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Gamma_DB basicGetAttachment_gamma_db() {
		return attachment_gamma_db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachment_gamma_db(Attachment_Gamma_DB newAttachment_gamma_db, NotificationChain msgs) {
		Attachment_Gamma_DB oldAttachment_gamma_db = attachment_gamma_db;
		attachment_gamma_db = newAttachment_gamma_db;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.PORT_REQUIS_GAMMA_DB__ATTACHMENT_GAMMA_DB, oldAttachment_gamma_db, newAttachment_gamma_db);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_gamma_db(Attachment_Gamma_DB newAttachment_gamma_db) {
		if (newAttachment_gamma_db != attachment_gamma_db) {
			NotificationChain msgs = null;
			if (attachment_gamma_db != null)
				msgs = ((InternalEObject)attachment_gamma_db).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_GAMMA_DB__PORT_REQUIS_GAMMA_DB, Attachment_Gamma_DB.class, msgs);
			if (newAttachment_gamma_db != null)
				msgs = ((InternalEObject)newAttachment_gamma_db).eInverseAdd(this, Client_serveurPackage.ATTACHMENT_GAMMA_DB__PORT_REQUIS_GAMMA_DB, Attachment_Gamma_DB.class, msgs);
			msgs = basicSetAttachment_gamma_db(newAttachment_gamma_db, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.PORT_REQUIS_GAMMA_DB__ATTACHMENT_GAMMA_DB, newAttachment_gamma_db, newAttachment_gamma_db));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.PORT_REQUIS_GAMMA_DB__ATTACHMENT_GAMMA_DB:
				if (attachment_gamma_db != null)
					msgs = ((InternalEObject)attachment_gamma_db).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_GAMMA_DB__PORT_REQUIS_GAMMA_DB, Attachment_Gamma_DB.class, msgs);
				return basicSetAttachment_gamma_db((Attachment_Gamma_DB)otherEnd, msgs);
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
			case Client_serveurPackage.PORT_REQUIS_GAMMA_DB__ATTACHMENT_GAMMA_DB:
				return basicSetAttachment_gamma_db(null, msgs);
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
			case Client_serveurPackage.PORT_REQUIS_GAMMA_DB__ATTACHMENT_GAMMA_DB:
				if (resolve) return getAttachment_gamma_db();
				return basicGetAttachment_gamma_db();
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
			case Client_serveurPackage.PORT_REQUIS_GAMMA_DB__ATTACHMENT_GAMMA_DB:
				setAttachment_gamma_db((Attachment_Gamma_DB)newValue);
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
			case Client_serveurPackage.PORT_REQUIS_GAMMA_DB__ATTACHMENT_GAMMA_DB:
				setAttachment_gamma_db((Attachment_Gamma_DB)null);
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
			case Client_serveurPackage.PORT_REQUIS_GAMMA_DB__ATTACHMENT_GAMMA_DB:
				return attachment_gamma_db != null;
		}
		return super.eIsSet(featureID);
	}

} //Port_Requis_Gamma_DBImpl
