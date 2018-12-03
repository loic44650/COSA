/**
 */
package client_serveur.impl;

import client_serveur.Attachment_DB_Gamma;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_Fourni_DB_Gamma;

import cosa.impl.Port_FourniImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Fourni DB Gamma</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Port_Fourni_DB_GammaImpl#getAttachment_db_gamma <em>Attachment db gamma</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Port_Fourni_DB_GammaImpl extends Port_FourniImpl implements Port_Fourni_DB_Gamma {
	/**
	 * The cached value of the '{@link #getAttachment_db_gamma() <em>Attachment db gamma</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_db_gamma()
	 * @generated
	 * @ordered
	 */
	protected Attachment_DB_Gamma attachment_db_gamma;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Port_Fourni_DB_GammaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.PORT_FOURNI_DB_GAMMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_DB_Gamma getAttachment_db_gamma() {
		if (attachment_db_gamma != null && attachment_db_gamma.eIsProxy()) {
			InternalEObject oldAttachment_db_gamma = (InternalEObject)attachment_db_gamma;
			attachment_db_gamma = (Attachment_DB_Gamma)eResolveProxy(oldAttachment_db_gamma);
			if (attachment_db_gamma != oldAttachment_db_gamma) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.PORT_FOURNI_DB_GAMMA__ATTACHMENT_DB_GAMMA, oldAttachment_db_gamma, attachment_db_gamma));
			}
		}
		return attachment_db_gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_DB_Gamma basicGetAttachment_db_gamma() {
		return attachment_db_gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachment_db_gamma(Attachment_DB_Gamma newAttachment_db_gamma, NotificationChain msgs) {
		Attachment_DB_Gamma oldAttachment_db_gamma = attachment_db_gamma;
		attachment_db_gamma = newAttachment_db_gamma;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.PORT_FOURNI_DB_GAMMA__ATTACHMENT_DB_GAMMA, oldAttachment_db_gamma, newAttachment_db_gamma);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_db_gamma(Attachment_DB_Gamma newAttachment_db_gamma) {
		if (newAttachment_db_gamma != attachment_db_gamma) {
			NotificationChain msgs = null;
			if (attachment_db_gamma != null)
				msgs = ((InternalEObject)attachment_db_gamma).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_DB_GAMMA__PORT_FOURNI_DB_GAMMA, Attachment_DB_Gamma.class, msgs);
			if (newAttachment_db_gamma != null)
				msgs = ((InternalEObject)newAttachment_db_gamma).eInverseAdd(this, Client_serveurPackage.ATTACHMENT_DB_GAMMA__PORT_FOURNI_DB_GAMMA, Attachment_DB_Gamma.class, msgs);
			msgs = basicSetAttachment_db_gamma(newAttachment_db_gamma, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.PORT_FOURNI_DB_GAMMA__ATTACHMENT_DB_GAMMA, newAttachment_db_gamma, newAttachment_db_gamma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.PORT_FOURNI_DB_GAMMA__ATTACHMENT_DB_GAMMA:
				if (attachment_db_gamma != null)
					msgs = ((InternalEObject)attachment_db_gamma).eInverseRemove(this, Client_serveurPackage.ATTACHMENT_DB_GAMMA__PORT_FOURNI_DB_GAMMA, Attachment_DB_Gamma.class, msgs);
				return basicSetAttachment_db_gamma((Attachment_DB_Gamma)otherEnd, msgs);
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
			case Client_serveurPackage.PORT_FOURNI_DB_GAMMA__ATTACHMENT_DB_GAMMA:
				return basicSetAttachment_db_gamma(null, msgs);
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
			case Client_serveurPackage.PORT_FOURNI_DB_GAMMA__ATTACHMENT_DB_GAMMA:
				if (resolve) return getAttachment_db_gamma();
				return basicGetAttachment_db_gamma();
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
			case Client_serveurPackage.PORT_FOURNI_DB_GAMMA__ATTACHMENT_DB_GAMMA:
				setAttachment_db_gamma((Attachment_DB_Gamma)newValue);
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
			case Client_serveurPackage.PORT_FOURNI_DB_GAMMA__ATTACHMENT_DB_GAMMA:
				setAttachment_db_gamma((Attachment_DB_Gamma)null);
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
			case Client_serveurPackage.PORT_FOURNI_DB_GAMMA__ATTACHMENT_DB_GAMMA:
				return attachment_db_gamma != null;
		}
		return super.eIsSet(featureID);
	}

} //Port_Fourni_DB_GammaImpl
