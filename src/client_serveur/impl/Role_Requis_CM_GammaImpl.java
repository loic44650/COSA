/**
 */
package client_serveur.impl;

import client_serveur.Attachment_CM_Gamma;
import client_serveur.Client_serveurPackage;
import client_serveur.Role_Requis_CM_Gamma;

import cosa.impl.Role_RequisImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Requis CM Gamma</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Role_Requis_CM_GammaImpl#getAttachment_cm_gamma <em>Attachment cm gamma</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Role_Requis_CM_GammaImpl extends Role_RequisImpl implements Role_Requis_CM_Gamma {
	/**
	 * The cached value of the '{@link #getAttachment_cm_gamma() <em>Attachment cm gamma</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_cm_gamma()
	 * @generated
	 * @ordered
	 */
	protected Attachment_CM_Gamma attachment_cm_gamma;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Role_Requis_CM_GammaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.ROLE_REQUIS_CM_GAMMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_CM_Gamma getAttachment_cm_gamma() {
		if (attachment_cm_gamma != null && attachment_cm_gamma.eIsProxy()) {
			InternalEObject oldAttachment_cm_gamma = (InternalEObject)attachment_cm_gamma;
			attachment_cm_gamma = (Attachment_CM_Gamma)eResolveProxy(oldAttachment_cm_gamma);
			if (attachment_cm_gamma != oldAttachment_cm_gamma) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ROLE_REQUIS_CM_GAMMA__ATTACHMENT_CM_GAMMA, oldAttachment_cm_gamma, attachment_cm_gamma));
			}
		}
		return attachment_cm_gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_CM_Gamma basicGetAttachment_cm_gamma() {
		return attachment_cm_gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachment_cm_gamma(Attachment_CM_Gamma newAttachment_cm_gamma, NotificationChain msgs) {
		Attachment_CM_Gamma oldAttachment_cm_gamma = attachment_cm_gamma;
		attachment_cm_gamma = newAttachment_cm_gamma;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ROLE_REQUIS_CM_GAMMA__ATTACHMENT_CM_GAMMA, oldAttachment_cm_gamma, newAttachment_cm_gamma);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_cm_gamma(Attachment_CM_Gamma newAttachment_cm_gamma) {
		if (newAttachment_cm_gamma != attachment_cm_gamma) {
			NotificationChain msgs = null;
			if (attachment_cm_gamma != null)
				msgs = ((InternalEObject)attachment_cm_gamma).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_CM_GAMMA__ROLE_REQUIS_CM_GAMMA, Attachment_CM_Gamma.class, msgs);
			if (newAttachment_cm_gamma != null)
				msgs = ((InternalEObject)newAttachment_cm_gamma).eInverseAdd(this, Client_serveurPackage.ATTACHMENT_CM_GAMMA__ROLE_REQUIS_CM_GAMMA, Attachment_CM_Gamma.class, msgs);
			msgs = basicSetAttachment_cm_gamma(newAttachment_cm_gamma, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ROLE_REQUIS_CM_GAMMA__ATTACHMENT_CM_GAMMA, newAttachment_cm_gamma, newAttachment_cm_gamma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.ROLE_REQUIS_CM_GAMMA__ATTACHMENT_CM_GAMMA:
				if (attachment_cm_gamma != null)
					msgs = ((InternalEObject)attachment_cm_gamma).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_CM_GAMMA__ROLE_REQUIS_CM_GAMMA, Attachment_CM_Gamma.class, msgs);
				return basicSetAttachment_cm_gamma((Attachment_CM_Gamma)otherEnd, msgs);
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
			case Client_serveurPackage.ROLE_REQUIS_CM_GAMMA__ATTACHMENT_CM_GAMMA:
				return basicSetAttachment_cm_gamma(null, msgs);
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
			case Client_serveurPackage.ROLE_REQUIS_CM_GAMMA__ATTACHMENT_CM_GAMMA:
				if (resolve) return getAttachment_cm_gamma();
				return basicGetAttachment_cm_gamma();
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
			case Client_serveurPackage.ROLE_REQUIS_CM_GAMMA__ATTACHMENT_CM_GAMMA:
				setAttachment_cm_gamma((Attachment_CM_Gamma)newValue);
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
			case Client_serveurPackage.ROLE_REQUIS_CM_GAMMA__ATTACHMENT_CM_GAMMA:
				setAttachment_cm_gamma((Attachment_CM_Gamma)null);
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
			case Client_serveurPackage.ROLE_REQUIS_CM_GAMMA__ATTACHMENT_CM_GAMMA:
				return attachment_cm_gamma != null;
		}
		return super.eIsSet(featureID);
	}

} //Role_Requis_CM_GammaImpl
