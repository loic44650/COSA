/**
 */
package client_serveur.impl;

import client_serveur.Attachment_Gamma_CM;
import client_serveur.Client_serveurPackage;
import client_serveur.Role_Fourni_Gamma_CM;

import cosa.impl.Role_FourniImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Fourni Gamma CM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Role_Fourni_Gamma_CMImpl#getAttachment_gamma_cm <em>Attachment gamma cm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Role_Fourni_Gamma_CMImpl extends Role_FourniImpl implements Role_Fourni_Gamma_CM {
	/**
	 * The cached value of the '{@link #getAttachment_gamma_cm() <em>Attachment gamma cm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_gamma_cm()
	 * @generated
	 * @ordered
	 */
	protected Attachment_Gamma_CM attachment_gamma_cm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Role_Fourni_Gamma_CMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.ROLE_FOURNI_GAMMA_CM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Gamma_CM getAttachment_gamma_cm() {
		if (attachment_gamma_cm != null && attachment_gamma_cm.eIsProxy()) {
			InternalEObject oldAttachment_gamma_cm = (InternalEObject)attachment_gamma_cm;
			attachment_gamma_cm = (Attachment_Gamma_CM)eResolveProxy(oldAttachment_gamma_cm);
			if (attachment_gamma_cm != oldAttachment_gamma_cm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ROLE_FOURNI_GAMMA_CM__ATTACHMENT_GAMMA_CM, oldAttachment_gamma_cm, attachment_gamma_cm));
			}
		}
		return attachment_gamma_cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Gamma_CM basicGetAttachment_gamma_cm() {
		return attachment_gamma_cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachment_gamma_cm(Attachment_Gamma_CM newAttachment_gamma_cm, NotificationChain msgs) {
		Attachment_Gamma_CM oldAttachment_gamma_cm = attachment_gamma_cm;
		attachment_gamma_cm = newAttachment_gamma_cm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ROLE_FOURNI_GAMMA_CM__ATTACHMENT_GAMMA_CM, oldAttachment_gamma_cm, newAttachment_gamma_cm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_gamma_cm(Attachment_Gamma_CM newAttachment_gamma_cm) {
		if (newAttachment_gamma_cm != attachment_gamma_cm) {
			NotificationChain msgs = null;
			if (attachment_gamma_cm != null)
				msgs = ((InternalEObject)attachment_gamma_cm).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_GAMMA_CM__ROLE_FOURNI_GAMMA_CM, Attachment_Gamma_CM.class, msgs);
			if (newAttachment_gamma_cm != null)
				msgs = ((InternalEObject)newAttachment_gamma_cm).eInverseAdd(this, Client_serveurPackage.ATTACHMENT_GAMMA_CM__ROLE_FOURNI_GAMMA_CM, Attachment_Gamma_CM.class, msgs);
			msgs = basicSetAttachment_gamma_cm(newAttachment_gamma_cm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ROLE_FOURNI_GAMMA_CM__ATTACHMENT_GAMMA_CM, newAttachment_gamma_cm, newAttachment_gamma_cm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.ROLE_FOURNI_GAMMA_CM__ATTACHMENT_GAMMA_CM:
				if (attachment_gamma_cm != null)
					msgs = ((InternalEObject)attachment_gamma_cm).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_GAMMA_CM__ROLE_FOURNI_GAMMA_CM, Attachment_Gamma_CM.class, msgs);
				return basicSetAttachment_gamma_cm((Attachment_Gamma_CM)otherEnd, msgs);
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
			case Client_serveurPackage.ROLE_FOURNI_GAMMA_CM__ATTACHMENT_GAMMA_CM:
				return basicSetAttachment_gamma_cm(null, msgs);
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
			case Client_serveurPackage.ROLE_FOURNI_GAMMA_CM__ATTACHMENT_GAMMA_CM:
				if (resolve) return getAttachment_gamma_cm();
				return basicGetAttachment_gamma_cm();
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
			case Client_serveurPackage.ROLE_FOURNI_GAMMA_CM__ATTACHMENT_GAMMA_CM:
				setAttachment_gamma_cm((Attachment_Gamma_CM)newValue);
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
			case Client_serveurPackage.ROLE_FOURNI_GAMMA_CM__ATTACHMENT_GAMMA_CM:
				setAttachment_gamma_cm((Attachment_Gamma_CM)null);
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
			case Client_serveurPackage.ROLE_FOURNI_GAMMA_CM__ATTACHMENT_GAMMA_CM:
				return attachment_gamma_cm != null;
		}
		return super.eIsSet(featureID);
	}

} //Role_Fourni_Gamma_CMImpl
