/**
 */
package client_serveur.impl;

import client_serveur.Attachment_Alpha_CM;
import client_serveur.Client_serveurPackage;
import client_serveur.Role_Fourni_Alpha_CM;

import cosa.impl.Role_FourniImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Fourni Alpha CM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Role_Fourni_Alpha_CMImpl#getAttachment_alpha_cm <em>Attachment alpha cm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Role_Fourni_Alpha_CMImpl extends Role_FourniImpl implements Role_Fourni_Alpha_CM {
	/**
	 * The cached value of the '{@link #getAttachment_alpha_cm() <em>Attachment alpha cm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_alpha_cm()
	 * @generated
	 * @ordered
	 */
	protected Attachment_Alpha_CM attachment_alpha_cm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Role_Fourni_Alpha_CMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.ROLE_FOURNI_ALPHA_CM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Alpha_CM getAttachment_alpha_cm() {
		if (attachment_alpha_cm != null && attachment_alpha_cm.eIsProxy()) {
			InternalEObject oldAttachment_alpha_cm = (InternalEObject)attachment_alpha_cm;
			attachment_alpha_cm = (Attachment_Alpha_CM)eResolveProxy(oldAttachment_alpha_cm);
			if (attachment_alpha_cm != oldAttachment_alpha_cm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ROLE_FOURNI_ALPHA_CM__ATTACHMENT_ALPHA_CM, oldAttachment_alpha_cm, attachment_alpha_cm));
			}
		}
		return attachment_alpha_cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Alpha_CM basicGetAttachment_alpha_cm() {
		return attachment_alpha_cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachment_alpha_cm(Attachment_Alpha_CM newAttachment_alpha_cm, NotificationChain msgs) {
		Attachment_Alpha_CM oldAttachment_alpha_cm = attachment_alpha_cm;
		attachment_alpha_cm = newAttachment_alpha_cm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ROLE_FOURNI_ALPHA_CM__ATTACHMENT_ALPHA_CM, oldAttachment_alpha_cm, newAttachment_alpha_cm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_alpha_cm(Attachment_Alpha_CM newAttachment_alpha_cm) {
		if (newAttachment_alpha_cm != attachment_alpha_cm) {
			NotificationChain msgs = null;
			if (attachment_alpha_cm != null)
				msgs = ((InternalEObject)attachment_alpha_cm).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_ALPHA_CM__ROLE_FOURNI_ALPHA_CM, Attachment_Alpha_CM.class, msgs);
			if (newAttachment_alpha_cm != null)
				msgs = ((InternalEObject)newAttachment_alpha_cm).eInverseAdd(this, Client_serveurPackage.ATTACHMENT_ALPHA_CM__ROLE_FOURNI_ALPHA_CM, Attachment_Alpha_CM.class, msgs);
			msgs = basicSetAttachment_alpha_cm(newAttachment_alpha_cm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ROLE_FOURNI_ALPHA_CM__ATTACHMENT_ALPHA_CM, newAttachment_alpha_cm, newAttachment_alpha_cm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.ROLE_FOURNI_ALPHA_CM__ATTACHMENT_ALPHA_CM:
				if (attachment_alpha_cm != null)
					msgs = ((InternalEObject)attachment_alpha_cm).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_ALPHA_CM__ROLE_FOURNI_ALPHA_CM, Attachment_Alpha_CM.class, msgs);
				return basicSetAttachment_alpha_cm((Attachment_Alpha_CM)otherEnd, msgs);
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
			case Client_serveurPackage.ROLE_FOURNI_ALPHA_CM__ATTACHMENT_ALPHA_CM:
				return basicSetAttachment_alpha_cm(null, msgs);
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
			case Client_serveurPackage.ROLE_FOURNI_ALPHA_CM__ATTACHMENT_ALPHA_CM:
				if (resolve) return getAttachment_alpha_cm();
				return basicGetAttachment_alpha_cm();
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
			case Client_serveurPackage.ROLE_FOURNI_ALPHA_CM__ATTACHMENT_ALPHA_CM:
				setAttachment_alpha_cm((Attachment_Alpha_CM)newValue);
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
			case Client_serveurPackage.ROLE_FOURNI_ALPHA_CM__ATTACHMENT_ALPHA_CM:
				setAttachment_alpha_cm((Attachment_Alpha_CM)null);
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
			case Client_serveurPackage.ROLE_FOURNI_ALPHA_CM__ATTACHMENT_ALPHA_CM:
				return attachment_alpha_cm != null;
		}
		return super.eIsSet(featureID);
	}

} //Role_Fourni_Alpha_CMImpl
