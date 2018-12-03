/**
 */
package client_serveur.impl;

import client_serveur.Attachment_Alpha_SM;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_Requis_Alpha_SM;

import cosa.impl.Port_RequisImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Requis Alpha SM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Port_Requis_Alpha_SMImpl#getAttachment_alpha_sm <em>Attachment alpha sm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Port_Requis_Alpha_SMImpl extends Port_RequisImpl implements Port_Requis_Alpha_SM {
	/**
	 * The cached value of the '{@link #getAttachment_alpha_sm() <em>Attachment alpha sm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_alpha_sm()
	 * @generated
	 * @ordered
	 */
	protected Attachment_Alpha_SM attachment_alpha_sm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Port_Requis_Alpha_SMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.PORT_REQUIS_ALPHA_SM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Alpha_SM getAttachment_alpha_sm() {
		if (attachment_alpha_sm != null && attachment_alpha_sm.eIsProxy()) {
			InternalEObject oldAttachment_alpha_sm = (InternalEObject)attachment_alpha_sm;
			attachment_alpha_sm = (Attachment_Alpha_SM)eResolveProxy(oldAttachment_alpha_sm);
			if (attachment_alpha_sm != oldAttachment_alpha_sm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.PORT_REQUIS_ALPHA_SM__ATTACHMENT_ALPHA_SM, oldAttachment_alpha_sm, attachment_alpha_sm));
			}
		}
		return attachment_alpha_sm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Alpha_SM basicGetAttachment_alpha_sm() {
		return attachment_alpha_sm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachment_alpha_sm(Attachment_Alpha_SM newAttachment_alpha_sm, NotificationChain msgs) {
		Attachment_Alpha_SM oldAttachment_alpha_sm = attachment_alpha_sm;
		attachment_alpha_sm = newAttachment_alpha_sm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.PORT_REQUIS_ALPHA_SM__ATTACHMENT_ALPHA_SM, oldAttachment_alpha_sm, newAttachment_alpha_sm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_alpha_sm(Attachment_Alpha_SM newAttachment_alpha_sm) {
		if (newAttachment_alpha_sm != attachment_alpha_sm) {
			NotificationChain msgs = null;
			if (attachment_alpha_sm != null)
				msgs = ((InternalEObject)attachment_alpha_sm).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_ALPHA_SM__PORT_REQUIS_ALPHA_SM, Attachment_Alpha_SM.class, msgs);
			if (newAttachment_alpha_sm != null)
				msgs = ((InternalEObject)newAttachment_alpha_sm).eInverseAdd(this, Client_serveurPackage.ATTACHMENT_ALPHA_SM__PORT_REQUIS_ALPHA_SM, Attachment_Alpha_SM.class, msgs);
			msgs = basicSetAttachment_alpha_sm(newAttachment_alpha_sm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.PORT_REQUIS_ALPHA_SM__ATTACHMENT_ALPHA_SM, newAttachment_alpha_sm, newAttachment_alpha_sm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.PORT_REQUIS_ALPHA_SM__ATTACHMENT_ALPHA_SM:
				if (attachment_alpha_sm != null)
					msgs = ((InternalEObject)attachment_alpha_sm).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_ALPHA_SM__PORT_REQUIS_ALPHA_SM, Attachment_Alpha_SM.class, msgs);
				return basicSetAttachment_alpha_sm((Attachment_Alpha_SM)otherEnd, msgs);
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
			case Client_serveurPackage.PORT_REQUIS_ALPHA_SM__ATTACHMENT_ALPHA_SM:
				return basicSetAttachment_alpha_sm(null, msgs);
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
			case Client_serveurPackage.PORT_REQUIS_ALPHA_SM__ATTACHMENT_ALPHA_SM:
				if (resolve) return getAttachment_alpha_sm();
				return basicGetAttachment_alpha_sm();
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
			case Client_serveurPackage.PORT_REQUIS_ALPHA_SM__ATTACHMENT_ALPHA_SM:
				setAttachment_alpha_sm((Attachment_Alpha_SM)newValue);
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
			case Client_serveurPackage.PORT_REQUIS_ALPHA_SM__ATTACHMENT_ALPHA_SM:
				setAttachment_alpha_sm((Attachment_Alpha_SM)null);
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
			case Client_serveurPackage.PORT_REQUIS_ALPHA_SM__ATTACHMENT_ALPHA_SM:
				return attachment_alpha_sm != null;
		}
		return super.eIsSet(featureID);
	}

} //Port_Requis_Alpha_SMImpl
