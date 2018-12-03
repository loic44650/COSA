/**
 */
package client_serveur.impl;

import client_serveur.Attachment_SM_Beta;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_Fourni_SM_Beta;
import client_serveur.Role_Requis_SM_Beta;

import cosa.impl.AttachmentImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment SM Beta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Attachment_SM_BetaImpl#getPort_fourni_sm_beta <em>Port fourni sm beta</em>}</li>
 *   <li>{@link client_serveur.impl.Attachment_SM_BetaImpl#getRole_requis_sm_beta <em>Role requis sm beta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Attachment_SM_BetaImpl extends AttachmentImpl implements Attachment_SM_Beta {
	/**
	 * The cached value of the '{@link #getPort_fourni_sm_beta() <em>Port fourni sm beta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_fourni_sm_beta()
	 * @generated
	 * @ordered
	 */
	protected Port_Fourni_SM_Beta port_fourni_sm_beta;

	/**
	 * The cached value of the '{@link #getRole_requis_sm_beta() <em>Role requis sm beta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_requis_sm_beta()
	 * @generated
	 * @ordered
	 */
	protected Role_Requis_SM_Beta role_requis_sm_beta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attachment_SM_BetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.ATTACHMENT_SM_BETA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Fourni_SM_Beta getPort_fourni_sm_beta() {
		if (port_fourni_sm_beta != null && port_fourni_sm_beta.eIsProxy()) {
			InternalEObject oldPort_fourni_sm_beta = (InternalEObject)port_fourni_sm_beta;
			port_fourni_sm_beta = (Port_Fourni_SM_Beta)eResolveProxy(oldPort_fourni_sm_beta);
			if (port_fourni_sm_beta != oldPort_fourni_sm_beta) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ATTACHMENT_SM_BETA__PORT_FOURNI_SM_BETA, oldPort_fourni_sm_beta, port_fourni_sm_beta));
			}
		}
		return port_fourni_sm_beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Fourni_SM_Beta basicGetPort_fourni_sm_beta() {
		return port_fourni_sm_beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort_fourni_sm_beta(Port_Fourni_SM_Beta newPort_fourni_sm_beta, NotificationChain msgs) {
		Port_Fourni_SM_Beta oldPort_fourni_sm_beta = port_fourni_sm_beta;
		port_fourni_sm_beta = newPort_fourni_sm_beta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_SM_BETA__PORT_FOURNI_SM_BETA, oldPort_fourni_sm_beta, newPort_fourni_sm_beta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_fourni_sm_beta(Port_Fourni_SM_Beta newPort_fourni_sm_beta) {
		if (newPort_fourni_sm_beta != port_fourni_sm_beta) {
			NotificationChain msgs = null;
			if (port_fourni_sm_beta != null)
				msgs = ((InternalEObject)port_fourni_sm_beta).eInverseRemove(this, Client_serveurPackage.PORT_FOURNI_SM_BETA__ATTACHMENT_SM_BETA, Port_Fourni_SM_Beta.class, msgs);
			if (newPort_fourni_sm_beta != null)
				msgs = ((InternalEObject)newPort_fourni_sm_beta).eInverseAdd(this, Client_serveurPackage.PORT_FOURNI_SM_BETA__ATTACHMENT_SM_BETA, Port_Fourni_SM_Beta.class, msgs);
			msgs = basicSetPort_fourni_sm_beta(newPort_fourni_sm_beta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_SM_BETA__PORT_FOURNI_SM_BETA, newPort_fourni_sm_beta, newPort_fourni_sm_beta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Requis_SM_Beta getRole_requis_sm_beta() {
		if (role_requis_sm_beta != null && role_requis_sm_beta.eIsProxy()) {
			InternalEObject oldRole_requis_sm_beta = (InternalEObject)role_requis_sm_beta;
			role_requis_sm_beta = (Role_Requis_SM_Beta)eResolveProxy(oldRole_requis_sm_beta);
			if (role_requis_sm_beta != oldRole_requis_sm_beta) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ATTACHMENT_SM_BETA__ROLE_REQUIS_SM_BETA, oldRole_requis_sm_beta, role_requis_sm_beta));
			}
		}
		return role_requis_sm_beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Requis_SM_Beta basicGetRole_requis_sm_beta() {
		return role_requis_sm_beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole_requis_sm_beta(Role_Requis_SM_Beta newRole_requis_sm_beta, NotificationChain msgs) {
		Role_Requis_SM_Beta oldRole_requis_sm_beta = role_requis_sm_beta;
		role_requis_sm_beta = newRole_requis_sm_beta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_SM_BETA__ROLE_REQUIS_SM_BETA, oldRole_requis_sm_beta, newRole_requis_sm_beta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole_requis_sm_beta(Role_Requis_SM_Beta newRole_requis_sm_beta) {
		if (newRole_requis_sm_beta != role_requis_sm_beta) {
			NotificationChain msgs = null;
			if (role_requis_sm_beta != null)
				msgs = ((InternalEObject)role_requis_sm_beta).eInverseRemove(this, Client_serveurPackage.ROLE_REQUIS_SM_BETA__ATTACHMENT_SM_BETA, Role_Requis_SM_Beta.class, msgs);
			if (newRole_requis_sm_beta != null)
				msgs = ((InternalEObject)newRole_requis_sm_beta).eInverseAdd(this, Client_serveurPackage.ROLE_REQUIS_SM_BETA__ATTACHMENT_SM_BETA, Role_Requis_SM_Beta.class, msgs);
			msgs = basicSetRole_requis_sm_beta(newRole_requis_sm_beta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_SM_BETA__ROLE_REQUIS_SM_BETA, newRole_requis_sm_beta, newRole_requis_sm_beta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.ATTACHMENT_SM_BETA__PORT_FOURNI_SM_BETA:
				if (port_fourni_sm_beta != null)
					msgs = ((InternalEObject)port_fourni_sm_beta).eInverseRemove(this, Client_serveurPackage.PORT_FOURNI_SM_BETA__ATTACHMENT_SM_BETA, Port_Fourni_SM_Beta.class, msgs);
				return basicSetPort_fourni_sm_beta((Port_Fourni_SM_Beta)otherEnd, msgs);
			case Client_serveurPackage.ATTACHMENT_SM_BETA__ROLE_REQUIS_SM_BETA:
				if (role_requis_sm_beta != null)
					msgs = ((InternalEObject)role_requis_sm_beta).eInverseRemove(this, Client_serveurPackage.ROLE_REQUIS_SM_BETA__ATTACHMENT_SM_BETA, Role_Requis_SM_Beta.class, msgs);
				return basicSetRole_requis_sm_beta((Role_Requis_SM_Beta)otherEnd, msgs);
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
			case Client_serveurPackage.ATTACHMENT_SM_BETA__PORT_FOURNI_SM_BETA:
				return basicSetPort_fourni_sm_beta(null, msgs);
			case Client_serveurPackage.ATTACHMENT_SM_BETA__ROLE_REQUIS_SM_BETA:
				return basicSetRole_requis_sm_beta(null, msgs);
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
			case Client_serveurPackage.ATTACHMENT_SM_BETA__PORT_FOURNI_SM_BETA:
				if (resolve) return getPort_fourni_sm_beta();
				return basicGetPort_fourni_sm_beta();
			case Client_serveurPackage.ATTACHMENT_SM_BETA__ROLE_REQUIS_SM_BETA:
				if (resolve) return getRole_requis_sm_beta();
				return basicGetRole_requis_sm_beta();
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
			case Client_serveurPackage.ATTACHMENT_SM_BETA__PORT_FOURNI_SM_BETA:
				setPort_fourni_sm_beta((Port_Fourni_SM_Beta)newValue);
				return;
			case Client_serveurPackage.ATTACHMENT_SM_BETA__ROLE_REQUIS_SM_BETA:
				setRole_requis_sm_beta((Role_Requis_SM_Beta)newValue);
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
			case Client_serveurPackage.ATTACHMENT_SM_BETA__PORT_FOURNI_SM_BETA:
				setPort_fourni_sm_beta((Port_Fourni_SM_Beta)null);
				return;
			case Client_serveurPackage.ATTACHMENT_SM_BETA__ROLE_REQUIS_SM_BETA:
				setRole_requis_sm_beta((Role_Requis_SM_Beta)null);
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
			case Client_serveurPackage.ATTACHMENT_SM_BETA__PORT_FOURNI_SM_BETA:
				return port_fourni_sm_beta != null;
			case Client_serveurPackage.ATTACHMENT_SM_BETA__ROLE_REQUIS_SM_BETA:
				return role_requis_sm_beta != null;
		}
		return super.eIsSet(featureID);
	}

} //Attachment_SM_BetaImpl
