/**
 */
package client_serveur.impl;

import client_serveur.Attachment_Beta_SM;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_Requis_Beta_SM;

import cosa.impl.Port_RequisImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Requis Beta SM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Port_Requis_Beta_SMImpl#getAttachment_beta_sm <em>Attachment beta sm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Port_Requis_Beta_SMImpl extends Port_RequisImpl implements Port_Requis_Beta_SM {
	/**
	 * The cached value of the '{@link #getAttachment_beta_sm() <em>Attachment beta sm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_beta_sm()
	 * @generated
	 * @ordered
	 */
	protected Attachment_Beta_SM attachment_beta_sm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Port_Requis_Beta_SMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.PORT_REQUIS_BETA_SM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Beta_SM getAttachment_beta_sm() {
		if (attachment_beta_sm != null && attachment_beta_sm.eIsProxy()) {
			InternalEObject oldAttachment_beta_sm = (InternalEObject)attachment_beta_sm;
			attachment_beta_sm = (Attachment_Beta_SM)eResolveProxy(oldAttachment_beta_sm);
			if (attachment_beta_sm != oldAttachment_beta_sm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.PORT_REQUIS_BETA_SM__ATTACHMENT_BETA_SM, oldAttachment_beta_sm, attachment_beta_sm));
			}
		}
		return attachment_beta_sm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Beta_SM basicGetAttachment_beta_sm() {
		return attachment_beta_sm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachment_beta_sm(Attachment_Beta_SM newAttachment_beta_sm, NotificationChain msgs) {
		Attachment_Beta_SM oldAttachment_beta_sm = attachment_beta_sm;
		attachment_beta_sm = newAttachment_beta_sm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.PORT_REQUIS_BETA_SM__ATTACHMENT_BETA_SM, oldAttachment_beta_sm, newAttachment_beta_sm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_beta_sm(Attachment_Beta_SM newAttachment_beta_sm) {
		if (newAttachment_beta_sm != attachment_beta_sm) {
			NotificationChain msgs = null;
			if (attachment_beta_sm != null)
				msgs = ((InternalEObject)attachment_beta_sm).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_BETA_SM__PORT_REQUIS_BETA_SM, Attachment_Beta_SM.class, msgs);
			if (newAttachment_beta_sm != null)
				msgs = ((InternalEObject)newAttachment_beta_sm).eInverseAdd(this, Client_serveurPackage.ATTACHMENT_BETA_SM__PORT_REQUIS_BETA_SM, Attachment_Beta_SM.class, msgs);
			msgs = basicSetAttachment_beta_sm(newAttachment_beta_sm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.PORT_REQUIS_BETA_SM__ATTACHMENT_BETA_SM, newAttachment_beta_sm, newAttachment_beta_sm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.PORT_REQUIS_BETA_SM__ATTACHMENT_BETA_SM:
				if (attachment_beta_sm != null)
					msgs = ((InternalEObject)attachment_beta_sm).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_BETA_SM__PORT_REQUIS_BETA_SM, Attachment_Beta_SM.class, msgs);
				return basicSetAttachment_beta_sm((Attachment_Beta_SM)otherEnd, msgs);
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
			case Client_serveurPackage.PORT_REQUIS_BETA_SM__ATTACHMENT_BETA_SM:
				return basicSetAttachment_beta_sm(null, msgs);
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
			case Client_serveurPackage.PORT_REQUIS_BETA_SM__ATTACHMENT_BETA_SM:
				if (resolve) return getAttachment_beta_sm();
				return basicGetAttachment_beta_sm();
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
			case Client_serveurPackage.PORT_REQUIS_BETA_SM__ATTACHMENT_BETA_SM:
				setAttachment_beta_sm((Attachment_Beta_SM)newValue);
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
			case Client_serveurPackage.PORT_REQUIS_BETA_SM__ATTACHMENT_BETA_SM:
				setAttachment_beta_sm((Attachment_Beta_SM)null);
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
			case Client_serveurPackage.PORT_REQUIS_BETA_SM__ATTACHMENT_BETA_SM:
				return attachment_beta_sm != null;
		}
		return super.eIsSet(featureID);
	}

} //Port_Requis_Beta_SMImpl
