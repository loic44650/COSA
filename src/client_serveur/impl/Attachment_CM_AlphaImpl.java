/**
 */
package client_serveur.impl;

import client_serveur.Attachment_CM_Alpha;
import client_serveur.Client_serveurPackage;
import client_serveur.Role_Requis_CM_Alpha;

import cosa.impl.AttachmentImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment CM Alpha</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Attachment_CM_AlphaImpl#getRole_requis_cm_alpha <em>Role requis cm alpha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Attachment_CM_AlphaImpl extends AttachmentImpl implements Attachment_CM_Alpha {
	/**
	 * The cached value of the '{@link #getRole_requis_cm_alpha() <em>Role requis cm alpha</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_requis_cm_alpha()
	 * @generated
	 * @ordered
	 */
	protected Role_Requis_CM_Alpha role_requis_cm_alpha;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attachment_CM_AlphaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.ATTACHMENT_CM_ALPHA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Requis_CM_Alpha getRole_requis_cm_alpha() {
		if (role_requis_cm_alpha != null && role_requis_cm_alpha.eIsProxy()) {
			InternalEObject oldRole_requis_cm_alpha = (InternalEObject)role_requis_cm_alpha;
			role_requis_cm_alpha = (Role_Requis_CM_Alpha)eResolveProxy(oldRole_requis_cm_alpha);
			if (role_requis_cm_alpha != oldRole_requis_cm_alpha) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ATTACHMENT_CM_ALPHA__ROLE_REQUIS_CM_ALPHA, oldRole_requis_cm_alpha, role_requis_cm_alpha));
			}
		}
		return role_requis_cm_alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Requis_CM_Alpha basicGetRole_requis_cm_alpha() {
		return role_requis_cm_alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole_requis_cm_alpha(Role_Requis_CM_Alpha newRole_requis_cm_alpha, NotificationChain msgs) {
		Role_Requis_CM_Alpha oldRole_requis_cm_alpha = role_requis_cm_alpha;
		role_requis_cm_alpha = newRole_requis_cm_alpha;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_CM_ALPHA__ROLE_REQUIS_CM_ALPHA, oldRole_requis_cm_alpha, newRole_requis_cm_alpha);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole_requis_cm_alpha(Role_Requis_CM_Alpha newRole_requis_cm_alpha) {
		if (newRole_requis_cm_alpha != role_requis_cm_alpha) {
			NotificationChain msgs = null;
			if (role_requis_cm_alpha != null)
				msgs = ((InternalEObject)role_requis_cm_alpha).eInverseRemove(this, Client_serveurPackage.ROLE_REQUIS_CM_ALPHA__ATTACHMENT_CM_ALPHA, Role_Requis_CM_Alpha.class, msgs);
			if (newRole_requis_cm_alpha != null)
				msgs = ((InternalEObject)newRole_requis_cm_alpha).eInverseAdd(this, Client_serveurPackage.ROLE_REQUIS_CM_ALPHA__ATTACHMENT_CM_ALPHA, Role_Requis_CM_Alpha.class, msgs);
			msgs = basicSetRole_requis_cm_alpha(newRole_requis_cm_alpha, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_CM_ALPHA__ROLE_REQUIS_CM_ALPHA, newRole_requis_cm_alpha, newRole_requis_cm_alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.ATTACHMENT_CM_ALPHA__ROLE_REQUIS_CM_ALPHA:
				if (role_requis_cm_alpha != null)
					msgs = ((InternalEObject)role_requis_cm_alpha).eInverseRemove(this, Client_serveurPackage.ROLE_REQUIS_CM_ALPHA__ATTACHMENT_CM_ALPHA, Role_Requis_CM_Alpha.class, msgs);
				return basicSetRole_requis_cm_alpha((Role_Requis_CM_Alpha)otherEnd, msgs);
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
			case Client_serveurPackage.ATTACHMENT_CM_ALPHA__ROLE_REQUIS_CM_ALPHA:
				return basicSetRole_requis_cm_alpha(null, msgs);
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
			case Client_serveurPackage.ATTACHMENT_CM_ALPHA__ROLE_REQUIS_CM_ALPHA:
				if (resolve) return getRole_requis_cm_alpha();
				return basicGetRole_requis_cm_alpha();
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
			case Client_serveurPackage.ATTACHMENT_CM_ALPHA__ROLE_REQUIS_CM_ALPHA:
				setRole_requis_cm_alpha((Role_Requis_CM_Alpha)newValue);
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
			case Client_serveurPackage.ATTACHMENT_CM_ALPHA__ROLE_REQUIS_CM_ALPHA:
				setRole_requis_cm_alpha((Role_Requis_CM_Alpha)null);
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
			case Client_serveurPackage.ATTACHMENT_CM_ALPHA__ROLE_REQUIS_CM_ALPHA:
				return role_requis_cm_alpha != null;
		}
		return super.eIsSet(featureID);
	}

} //Attachment_CM_AlphaImpl
