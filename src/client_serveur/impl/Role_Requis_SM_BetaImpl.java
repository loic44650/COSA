/**
 */
package client_serveur.impl;

import client_serveur.Attachment_SM_Beta;
import client_serveur.Client_serveurPackage;
import client_serveur.Role_Requis_SM_Beta;

import cosa.impl.Role_RequisImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Requis SM Beta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Role_Requis_SM_BetaImpl#getAttachment_sm_beta <em>Attachment sm beta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Role_Requis_SM_BetaImpl extends Role_RequisImpl implements Role_Requis_SM_Beta {
	/**
	 * The cached value of the '{@link #getAttachment_sm_beta() <em>Attachment sm beta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_sm_beta()
	 * @generated
	 * @ordered
	 */
	protected Attachment_SM_Beta attachment_sm_beta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Role_Requis_SM_BetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.ROLE_REQUIS_SM_BETA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_SM_Beta getAttachment_sm_beta() {
		if (attachment_sm_beta != null && attachment_sm_beta.eIsProxy()) {
			InternalEObject oldAttachment_sm_beta = (InternalEObject)attachment_sm_beta;
			attachment_sm_beta = (Attachment_SM_Beta)eResolveProxy(oldAttachment_sm_beta);
			if (attachment_sm_beta != oldAttachment_sm_beta) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ROLE_REQUIS_SM_BETA__ATTACHMENT_SM_BETA, oldAttachment_sm_beta, attachment_sm_beta));
			}
		}
		return attachment_sm_beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_SM_Beta basicGetAttachment_sm_beta() {
		return attachment_sm_beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachment_sm_beta(Attachment_SM_Beta newAttachment_sm_beta, NotificationChain msgs) {
		Attachment_SM_Beta oldAttachment_sm_beta = attachment_sm_beta;
		attachment_sm_beta = newAttachment_sm_beta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ROLE_REQUIS_SM_BETA__ATTACHMENT_SM_BETA, oldAttachment_sm_beta, newAttachment_sm_beta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_sm_beta(Attachment_SM_Beta newAttachment_sm_beta) {
		if (newAttachment_sm_beta != attachment_sm_beta) {
			NotificationChain msgs = null;
			if (attachment_sm_beta != null)
				msgs = ((InternalEObject)attachment_sm_beta).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_SM_BETA__ROLE_REQUIS_SM_BETA, Attachment_SM_Beta.class, msgs);
			if (newAttachment_sm_beta != null)
				msgs = ((InternalEObject)newAttachment_sm_beta).eInverseAdd(this, Client_serveurPackage.ATTACHMENT_SM_BETA__ROLE_REQUIS_SM_BETA, Attachment_SM_Beta.class, msgs);
			msgs = basicSetAttachment_sm_beta(newAttachment_sm_beta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ROLE_REQUIS_SM_BETA__ATTACHMENT_SM_BETA, newAttachment_sm_beta, newAttachment_sm_beta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.ROLE_REQUIS_SM_BETA__ATTACHMENT_SM_BETA:
				if (attachment_sm_beta != null)
					msgs = ((InternalEObject)attachment_sm_beta).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_SM_BETA__ROLE_REQUIS_SM_BETA, Attachment_SM_Beta.class, msgs);
				return basicSetAttachment_sm_beta((Attachment_SM_Beta)otherEnd, msgs);
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
			case Client_serveurPackage.ROLE_REQUIS_SM_BETA__ATTACHMENT_SM_BETA:
				return basicSetAttachment_sm_beta(null, msgs);
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
			case Client_serveurPackage.ROLE_REQUIS_SM_BETA__ATTACHMENT_SM_BETA:
				if (resolve) return getAttachment_sm_beta();
				return basicGetAttachment_sm_beta();
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
			case Client_serveurPackage.ROLE_REQUIS_SM_BETA__ATTACHMENT_SM_BETA:
				setAttachment_sm_beta((Attachment_SM_Beta)newValue);
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
			case Client_serveurPackage.ROLE_REQUIS_SM_BETA__ATTACHMENT_SM_BETA:
				setAttachment_sm_beta((Attachment_SM_Beta)null);
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
			case Client_serveurPackage.ROLE_REQUIS_SM_BETA__ATTACHMENT_SM_BETA:
				return attachment_sm_beta != null;
		}
		return super.eIsSet(featureID);
	}

} //Role_Requis_SM_BetaImpl
