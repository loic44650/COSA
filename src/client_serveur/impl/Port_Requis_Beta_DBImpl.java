/**
 */
package client_serveur.impl;

import client_serveur.Attachment_Beta_DB;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_Requis_Beta_DB;

import cosa.impl.Port_RequisImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Requis Beta DB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Port_Requis_Beta_DBImpl#getAttachment_beta_db <em>Attachment beta db</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Port_Requis_Beta_DBImpl extends Port_RequisImpl implements Port_Requis_Beta_DB {
	/**
	 * The cached value of the '{@link #getAttachment_beta_db() <em>Attachment beta db</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_beta_db()
	 * @generated
	 * @ordered
	 */
	protected Attachment_Beta_DB attachment_beta_db;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Port_Requis_Beta_DBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.PORT_REQUIS_BETA_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Beta_DB getAttachment_beta_db() {
		if (attachment_beta_db != null && attachment_beta_db.eIsProxy()) {
			InternalEObject oldAttachment_beta_db = (InternalEObject)attachment_beta_db;
			attachment_beta_db = (Attachment_Beta_DB)eResolveProxy(oldAttachment_beta_db);
			if (attachment_beta_db != oldAttachment_beta_db) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.PORT_REQUIS_BETA_DB__ATTACHMENT_BETA_DB, oldAttachment_beta_db, attachment_beta_db));
			}
		}
		return attachment_beta_db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Beta_DB basicGetAttachment_beta_db() {
		return attachment_beta_db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachment_beta_db(Attachment_Beta_DB newAttachment_beta_db, NotificationChain msgs) {
		Attachment_Beta_DB oldAttachment_beta_db = attachment_beta_db;
		attachment_beta_db = newAttachment_beta_db;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.PORT_REQUIS_BETA_DB__ATTACHMENT_BETA_DB, oldAttachment_beta_db, newAttachment_beta_db);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_beta_db(Attachment_Beta_DB newAttachment_beta_db) {
		if (newAttachment_beta_db != attachment_beta_db) {
			NotificationChain msgs = null;
			if (attachment_beta_db != null)
				msgs = ((InternalEObject)attachment_beta_db).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_BETA_DB__PORT_REQUIS_BETA_DB, Attachment_Beta_DB.class, msgs);
			if (newAttachment_beta_db != null)
				msgs = ((InternalEObject)newAttachment_beta_db).eInverseAdd(this, Client_serveurPackage.ATTACHMENT_BETA_DB__PORT_REQUIS_BETA_DB, Attachment_Beta_DB.class, msgs);
			msgs = basicSetAttachment_beta_db(newAttachment_beta_db, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.PORT_REQUIS_BETA_DB__ATTACHMENT_BETA_DB, newAttachment_beta_db, newAttachment_beta_db));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.PORT_REQUIS_BETA_DB__ATTACHMENT_BETA_DB:
				if (attachment_beta_db != null)
					msgs = ((InternalEObject)attachment_beta_db).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_BETA_DB__PORT_REQUIS_BETA_DB, Attachment_Beta_DB.class, msgs);
				return basicSetAttachment_beta_db((Attachment_Beta_DB)otherEnd, msgs);
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
			case Client_serveurPackage.PORT_REQUIS_BETA_DB__ATTACHMENT_BETA_DB:
				return basicSetAttachment_beta_db(null, msgs);
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
			case Client_serveurPackage.PORT_REQUIS_BETA_DB__ATTACHMENT_BETA_DB:
				if (resolve) return getAttachment_beta_db();
				return basicGetAttachment_beta_db();
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
			case Client_serveurPackage.PORT_REQUIS_BETA_DB__ATTACHMENT_BETA_DB:
				setAttachment_beta_db((Attachment_Beta_DB)newValue);
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
			case Client_serveurPackage.PORT_REQUIS_BETA_DB__ATTACHMENT_BETA_DB:
				setAttachment_beta_db((Attachment_Beta_DB)null);
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
			case Client_serveurPackage.PORT_REQUIS_BETA_DB__ATTACHMENT_BETA_DB:
				return attachment_beta_db != null;
		}
		return super.eIsSet(featureID);
	}

} //Port_Requis_Beta_DBImpl
