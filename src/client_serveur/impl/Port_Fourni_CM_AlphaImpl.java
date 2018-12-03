/**
 */
package client_serveur.impl;

import client_serveur.Attachment_CM_Alpha;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_Fourni_CM_Alpha;

import cosa.impl.Port_FourniImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Fourni CM Alpha</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Port_Fourni_CM_AlphaImpl#getAttachment_cm_alpha <em>Attachment cm alpha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Port_Fourni_CM_AlphaImpl extends Port_FourniImpl implements Port_Fourni_CM_Alpha {
	/**
	 * The cached value of the '{@link #getAttachment_cm_alpha() <em>Attachment cm alpha</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_cm_alpha()
	 * @generated
	 * @ordered
	 */
	protected Attachment_CM_Alpha attachment_cm_alpha;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Port_Fourni_CM_AlphaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.PORT_FOURNI_CM_ALPHA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_CM_Alpha getAttachment_cm_alpha() {
		if (attachment_cm_alpha != null && attachment_cm_alpha.eIsProxy()) {
			InternalEObject oldAttachment_cm_alpha = (InternalEObject)attachment_cm_alpha;
			attachment_cm_alpha = (Attachment_CM_Alpha)eResolveProxy(oldAttachment_cm_alpha);
			if (attachment_cm_alpha != oldAttachment_cm_alpha) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.PORT_FOURNI_CM_ALPHA__ATTACHMENT_CM_ALPHA, oldAttachment_cm_alpha, attachment_cm_alpha));
			}
		}
		return attachment_cm_alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_CM_Alpha basicGetAttachment_cm_alpha() {
		return attachment_cm_alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_cm_alpha(Attachment_CM_Alpha newAttachment_cm_alpha) {
		Attachment_CM_Alpha oldAttachment_cm_alpha = attachment_cm_alpha;
		attachment_cm_alpha = newAttachment_cm_alpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.PORT_FOURNI_CM_ALPHA__ATTACHMENT_CM_ALPHA, oldAttachment_cm_alpha, attachment_cm_alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Client_serveurPackage.PORT_FOURNI_CM_ALPHA__ATTACHMENT_CM_ALPHA:
				if (resolve) return getAttachment_cm_alpha();
				return basicGetAttachment_cm_alpha();
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
			case Client_serveurPackage.PORT_FOURNI_CM_ALPHA__ATTACHMENT_CM_ALPHA:
				setAttachment_cm_alpha((Attachment_CM_Alpha)newValue);
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
			case Client_serveurPackage.PORT_FOURNI_CM_ALPHA__ATTACHMENT_CM_ALPHA:
				setAttachment_cm_alpha((Attachment_CM_Alpha)null);
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
			case Client_serveurPackage.PORT_FOURNI_CM_ALPHA__ATTACHMENT_CM_ALPHA:
				return attachment_cm_alpha != null;
		}
		return super.eIsSet(featureID);
	}

} //Port_Fourni_CM_AlphaImpl
