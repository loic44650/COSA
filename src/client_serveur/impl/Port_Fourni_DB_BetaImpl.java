/**
 */
package client_serveur.impl;

import client_serveur.Attachment_DB_Beta;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_Fourni_DB_Beta;

import cosa.impl.Port_FourniImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Fourni DB Beta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Port_Fourni_DB_BetaImpl#getAttachment_db_beta <em>Attachment db beta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Port_Fourni_DB_BetaImpl extends Port_FourniImpl implements Port_Fourni_DB_Beta {
	/**
	 * The cached value of the '{@link #getAttachment_db_beta() <em>Attachment db beta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_db_beta()
	 * @generated
	 * @ordered
	 */
	protected Attachment_DB_Beta attachment_db_beta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Port_Fourni_DB_BetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.PORT_FOURNI_DB_BETA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_DB_Beta getAttachment_db_beta() {
		if (attachment_db_beta != null && attachment_db_beta.eIsProxy()) {
			InternalEObject oldAttachment_db_beta = (InternalEObject)attachment_db_beta;
			attachment_db_beta = (Attachment_DB_Beta)eResolveProxy(oldAttachment_db_beta);
			if (attachment_db_beta != oldAttachment_db_beta) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.PORT_FOURNI_DB_BETA__ATTACHMENT_DB_BETA, oldAttachment_db_beta, attachment_db_beta));
			}
		}
		return attachment_db_beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_DB_Beta basicGetAttachment_db_beta() {
		return attachment_db_beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachment_db_beta(Attachment_DB_Beta newAttachment_db_beta, NotificationChain msgs) {
		Attachment_DB_Beta oldAttachment_db_beta = attachment_db_beta;
		attachment_db_beta = newAttachment_db_beta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.PORT_FOURNI_DB_BETA__ATTACHMENT_DB_BETA, oldAttachment_db_beta, newAttachment_db_beta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_db_beta(Attachment_DB_Beta newAttachment_db_beta) {
		if (newAttachment_db_beta != attachment_db_beta) {
			NotificationChain msgs = null;
			if (attachment_db_beta != null)
				msgs = ((InternalEObject)attachment_db_beta).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_DB_BETA__PORT_FOURNI_DB_BETA, Attachment_DB_Beta.class, msgs);
			if (newAttachment_db_beta != null)
				msgs = ((InternalEObject)newAttachment_db_beta).eInverseAdd(this, Client_serveurPackage.ATTACHMENT_DB_BETA__PORT_FOURNI_DB_BETA, Attachment_DB_Beta.class, msgs);
			msgs = basicSetAttachment_db_beta(newAttachment_db_beta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.PORT_FOURNI_DB_BETA__ATTACHMENT_DB_BETA, newAttachment_db_beta, newAttachment_db_beta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.PORT_FOURNI_DB_BETA__ATTACHMENT_DB_BETA:
				if (attachment_db_beta != null)
					msgs = ((InternalEObject)attachment_db_beta).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_DB_BETA__PORT_FOURNI_DB_BETA, Attachment_DB_Beta.class, msgs);
				return basicSetAttachment_db_beta((Attachment_DB_Beta)otherEnd, msgs);
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
			case Client_serveurPackage.PORT_FOURNI_DB_BETA__ATTACHMENT_DB_BETA:
				return basicSetAttachment_db_beta(null, msgs);
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
			case Client_serveurPackage.PORT_FOURNI_DB_BETA__ATTACHMENT_DB_BETA:
				if (resolve) return getAttachment_db_beta();
				return basicGetAttachment_db_beta();
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
			case Client_serveurPackage.PORT_FOURNI_DB_BETA__ATTACHMENT_DB_BETA:
				setAttachment_db_beta((Attachment_DB_Beta)newValue);
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
			case Client_serveurPackage.PORT_FOURNI_DB_BETA__ATTACHMENT_DB_BETA:
				setAttachment_db_beta((Attachment_DB_Beta)null);
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
			case Client_serveurPackage.PORT_FOURNI_DB_BETA__ATTACHMENT_DB_BETA:
				return attachment_db_beta != null;
		}
		return super.eIsSet(featureID);
	}

} //Port_Fourni_DB_BetaImpl
