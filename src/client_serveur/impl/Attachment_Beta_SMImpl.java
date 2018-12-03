/**
 */
package client_serveur.impl;

import client_serveur.Attachment_Beta_SM;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_Requis_Beta_SM;
import client_serveur.Role_Fourni_Beta_SM;

import cosa.impl.AttachmentImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment Beta SM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Attachment_Beta_SMImpl#getPort_requis_beta_sm <em>Port requis beta sm</em>}</li>
 *   <li>{@link client_serveur.impl.Attachment_Beta_SMImpl#getRole_fourni_beta_sm <em>Role fourni beta sm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Attachment_Beta_SMImpl extends AttachmentImpl implements Attachment_Beta_SM {
	/**
	 * The cached value of the '{@link #getPort_requis_beta_sm() <em>Port requis beta sm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_requis_beta_sm()
	 * @generated
	 * @ordered
	 */
	protected Port_Requis_Beta_SM port_requis_beta_sm;

	/**
	 * The cached value of the '{@link #getRole_fourni_beta_sm() <em>Role fourni beta sm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_fourni_beta_sm()
	 * @generated
	 * @ordered
	 */
	protected Role_Fourni_Beta_SM role_fourni_beta_sm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attachment_Beta_SMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.ATTACHMENT_BETA_SM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Requis_Beta_SM getPort_requis_beta_sm() {
		if (port_requis_beta_sm != null && port_requis_beta_sm.eIsProxy()) {
			InternalEObject oldPort_requis_beta_sm = (InternalEObject)port_requis_beta_sm;
			port_requis_beta_sm = (Port_Requis_Beta_SM)eResolveProxy(oldPort_requis_beta_sm);
			if (port_requis_beta_sm != oldPort_requis_beta_sm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ATTACHMENT_BETA_SM__PORT_REQUIS_BETA_SM, oldPort_requis_beta_sm, port_requis_beta_sm));
			}
		}
		return port_requis_beta_sm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Requis_Beta_SM basicGetPort_requis_beta_sm() {
		return port_requis_beta_sm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort_requis_beta_sm(Port_Requis_Beta_SM newPort_requis_beta_sm, NotificationChain msgs) {
		Port_Requis_Beta_SM oldPort_requis_beta_sm = port_requis_beta_sm;
		port_requis_beta_sm = newPort_requis_beta_sm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_BETA_SM__PORT_REQUIS_BETA_SM, oldPort_requis_beta_sm, newPort_requis_beta_sm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_requis_beta_sm(Port_Requis_Beta_SM newPort_requis_beta_sm) {
		if (newPort_requis_beta_sm != port_requis_beta_sm) {
			NotificationChain msgs = null;
			if (port_requis_beta_sm != null)
				msgs = ((InternalEObject)port_requis_beta_sm).eInverseRemove(this, Client_serveurPackage.PORT_REQUIS_BETA_SM__ATTACHMENT_BETA_SM, Port_Requis_Beta_SM.class, msgs);
			if (newPort_requis_beta_sm != null)
				msgs = ((InternalEObject)newPort_requis_beta_sm).eInverseAdd(this, Client_serveurPackage.PORT_REQUIS_BETA_SM__ATTACHMENT_BETA_SM, Port_Requis_Beta_SM.class, msgs);
			msgs = basicSetPort_requis_beta_sm(newPort_requis_beta_sm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_BETA_SM__PORT_REQUIS_BETA_SM, newPort_requis_beta_sm, newPort_requis_beta_sm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Fourni_Beta_SM getRole_fourni_beta_sm() {
		if (role_fourni_beta_sm != null && role_fourni_beta_sm.eIsProxy()) {
			InternalEObject oldRole_fourni_beta_sm = (InternalEObject)role_fourni_beta_sm;
			role_fourni_beta_sm = (Role_Fourni_Beta_SM)eResolveProxy(oldRole_fourni_beta_sm);
			if (role_fourni_beta_sm != oldRole_fourni_beta_sm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ATTACHMENT_BETA_SM__ROLE_FOURNI_BETA_SM, oldRole_fourni_beta_sm, role_fourni_beta_sm));
			}
		}
		return role_fourni_beta_sm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Fourni_Beta_SM basicGetRole_fourni_beta_sm() {
		return role_fourni_beta_sm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole_fourni_beta_sm(Role_Fourni_Beta_SM newRole_fourni_beta_sm, NotificationChain msgs) {
		Role_Fourni_Beta_SM oldRole_fourni_beta_sm = role_fourni_beta_sm;
		role_fourni_beta_sm = newRole_fourni_beta_sm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_BETA_SM__ROLE_FOURNI_BETA_SM, oldRole_fourni_beta_sm, newRole_fourni_beta_sm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole_fourni_beta_sm(Role_Fourni_Beta_SM newRole_fourni_beta_sm) {
		if (newRole_fourni_beta_sm != role_fourni_beta_sm) {
			NotificationChain msgs = null;
			if (role_fourni_beta_sm != null)
				msgs = ((InternalEObject)role_fourni_beta_sm).eInverseRemove(this, Client_serveurPackage.ROLE_FOURNI_BETA_SM__ATTACHMENT_BETA_SM, Role_Fourni_Beta_SM.class, msgs);
			if (newRole_fourni_beta_sm != null)
				msgs = ((InternalEObject)newRole_fourni_beta_sm).eInverseAdd(this, Client_serveurPackage.ROLE_FOURNI_BETA_SM__ATTACHMENT_BETA_SM, Role_Fourni_Beta_SM.class, msgs);
			msgs = basicSetRole_fourni_beta_sm(newRole_fourni_beta_sm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_BETA_SM__ROLE_FOURNI_BETA_SM, newRole_fourni_beta_sm, newRole_fourni_beta_sm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.ATTACHMENT_BETA_SM__PORT_REQUIS_BETA_SM:
				if (port_requis_beta_sm != null)
					msgs = ((InternalEObject)port_requis_beta_sm).eInverseRemove(this, Client_serveurPackage.PORT_REQUIS_BETA_SM__ATTACHMENT_BETA_SM, Port_Requis_Beta_SM.class, msgs);
				return basicSetPort_requis_beta_sm((Port_Requis_Beta_SM)otherEnd, msgs);
			case Client_serveurPackage.ATTACHMENT_BETA_SM__ROLE_FOURNI_BETA_SM:
				if (role_fourni_beta_sm != null)
					msgs = ((InternalEObject)role_fourni_beta_sm).eInverseRemove(this, Client_serveurPackage.ROLE_FOURNI_BETA_SM__ATTACHMENT_BETA_SM, Role_Fourni_Beta_SM.class, msgs);
				return basicSetRole_fourni_beta_sm((Role_Fourni_Beta_SM)otherEnd, msgs);
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
			case Client_serveurPackage.ATTACHMENT_BETA_SM__PORT_REQUIS_BETA_SM:
				return basicSetPort_requis_beta_sm(null, msgs);
			case Client_serveurPackage.ATTACHMENT_BETA_SM__ROLE_FOURNI_BETA_SM:
				return basicSetRole_fourni_beta_sm(null, msgs);
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
			case Client_serveurPackage.ATTACHMENT_BETA_SM__PORT_REQUIS_BETA_SM:
				if (resolve) return getPort_requis_beta_sm();
				return basicGetPort_requis_beta_sm();
			case Client_serveurPackage.ATTACHMENT_BETA_SM__ROLE_FOURNI_BETA_SM:
				if (resolve) return getRole_fourni_beta_sm();
				return basicGetRole_fourni_beta_sm();
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
			case Client_serveurPackage.ATTACHMENT_BETA_SM__PORT_REQUIS_BETA_SM:
				setPort_requis_beta_sm((Port_Requis_Beta_SM)newValue);
				return;
			case Client_serveurPackage.ATTACHMENT_BETA_SM__ROLE_FOURNI_BETA_SM:
				setRole_fourni_beta_sm((Role_Fourni_Beta_SM)newValue);
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
			case Client_serveurPackage.ATTACHMENT_BETA_SM__PORT_REQUIS_BETA_SM:
				setPort_requis_beta_sm((Port_Requis_Beta_SM)null);
				return;
			case Client_serveurPackage.ATTACHMENT_BETA_SM__ROLE_FOURNI_BETA_SM:
				setRole_fourni_beta_sm((Role_Fourni_Beta_SM)null);
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
			case Client_serveurPackage.ATTACHMENT_BETA_SM__PORT_REQUIS_BETA_SM:
				return port_requis_beta_sm != null;
			case Client_serveurPackage.ATTACHMENT_BETA_SM__ROLE_FOURNI_BETA_SM:
				return role_fourni_beta_sm != null;
		}
		return super.eIsSet(featureID);
	}

} //Attachment_Beta_SMImpl
