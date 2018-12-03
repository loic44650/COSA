/**
 */
package client_serveur.impl;

import client_serveur.Attachment_SM_Alpha;
import client_serveur.Client_serveurPackage;
import client_serveur.Role_Requis_SM_Alpha;

import cosa.impl.Role_RequisImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Requis SM Alpha</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Role_Requis_SM_AlphaImpl#getAttachment_sm_alpha <em>Attachment sm alpha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Role_Requis_SM_AlphaImpl extends Role_RequisImpl implements Role_Requis_SM_Alpha {
	/**
	 * The cached value of the '{@link #getAttachment_sm_alpha() <em>Attachment sm alpha</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_sm_alpha()
	 * @generated
	 * @ordered
	 */
	protected Attachment_SM_Alpha attachment_sm_alpha;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Role_Requis_SM_AlphaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.ROLE_REQUIS_SM_ALPHA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_SM_Alpha getAttachment_sm_alpha() {
		if (attachment_sm_alpha != null && attachment_sm_alpha.eIsProxy()) {
			InternalEObject oldAttachment_sm_alpha = (InternalEObject)attachment_sm_alpha;
			attachment_sm_alpha = (Attachment_SM_Alpha)eResolveProxy(oldAttachment_sm_alpha);
			if (attachment_sm_alpha != oldAttachment_sm_alpha) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ROLE_REQUIS_SM_ALPHA__ATTACHMENT_SM_ALPHA, oldAttachment_sm_alpha, attachment_sm_alpha));
			}
		}
		return attachment_sm_alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_SM_Alpha basicGetAttachment_sm_alpha() {
		return attachment_sm_alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachment_sm_alpha(Attachment_SM_Alpha newAttachment_sm_alpha, NotificationChain msgs) {
		Attachment_SM_Alpha oldAttachment_sm_alpha = attachment_sm_alpha;
		attachment_sm_alpha = newAttachment_sm_alpha;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ROLE_REQUIS_SM_ALPHA__ATTACHMENT_SM_ALPHA, oldAttachment_sm_alpha, newAttachment_sm_alpha);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_sm_alpha(Attachment_SM_Alpha newAttachment_sm_alpha) {
		if (newAttachment_sm_alpha != attachment_sm_alpha) {
			NotificationChain msgs = null;
			if (attachment_sm_alpha != null)
				msgs = ((InternalEObject)attachment_sm_alpha).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_SM_ALPHA__ROLE_REQUIS_SM_ALPHA, Attachment_SM_Alpha.class, msgs);
			if (newAttachment_sm_alpha != null)
				msgs = ((InternalEObject)newAttachment_sm_alpha).eInverseAdd(this, Client_serveurPackage.ATTACHMENT_SM_ALPHA__ROLE_REQUIS_SM_ALPHA, Attachment_SM_Alpha.class, msgs);
			msgs = basicSetAttachment_sm_alpha(newAttachment_sm_alpha, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ROLE_REQUIS_SM_ALPHA__ATTACHMENT_SM_ALPHA, newAttachment_sm_alpha, newAttachment_sm_alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.ROLE_REQUIS_SM_ALPHA__ATTACHMENT_SM_ALPHA:
				if (attachment_sm_alpha != null)
					msgs = ((InternalEObject)attachment_sm_alpha).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_SM_ALPHA__ROLE_REQUIS_SM_ALPHA, Attachment_SM_Alpha.class, msgs);
				return basicSetAttachment_sm_alpha((Attachment_SM_Alpha)otherEnd, msgs);
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
			case Client_serveurPackage.ROLE_REQUIS_SM_ALPHA__ATTACHMENT_SM_ALPHA:
				return basicSetAttachment_sm_alpha(null, msgs);
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
			case Client_serveurPackage.ROLE_REQUIS_SM_ALPHA__ATTACHMENT_SM_ALPHA:
				if (resolve) return getAttachment_sm_alpha();
				return basicGetAttachment_sm_alpha();
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
			case Client_serveurPackage.ROLE_REQUIS_SM_ALPHA__ATTACHMENT_SM_ALPHA:
				setAttachment_sm_alpha((Attachment_SM_Alpha)newValue);
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
			case Client_serveurPackage.ROLE_REQUIS_SM_ALPHA__ATTACHMENT_SM_ALPHA:
				setAttachment_sm_alpha((Attachment_SM_Alpha)null);
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
			case Client_serveurPackage.ROLE_REQUIS_SM_ALPHA__ATTACHMENT_SM_ALPHA:
				return attachment_sm_alpha != null;
		}
		return super.eIsSet(featureID);
	}

} //Role_Requis_SM_AlphaImpl
