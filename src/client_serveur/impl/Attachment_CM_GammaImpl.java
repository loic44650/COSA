/**
 */
package client_serveur.impl;

import client_serveur.Attachment_CM_Gamma;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_Fourni_CM_Gamma;
import client_serveur.Role_Requis_CM_Gamma;

import cosa.impl.AttachmentImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment CM Gamma</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Attachment_CM_GammaImpl#getRole_requis_cm_gamma <em>Role requis cm gamma</em>}</li>
 *   <li>{@link client_serveur.impl.Attachment_CM_GammaImpl#getPort_fourni_cm_gamma <em>Port fourni cm gamma</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Attachment_CM_GammaImpl extends AttachmentImpl implements Attachment_CM_Gamma {
	/**
	 * The cached value of the '{@link #getRole_requis_cm_gamma() <em>Role requis cm gamma</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_requis_cm_gamma()
	 * @generated
	 * @ordered
	 */
	protected Role_Requis_CM_Gamma role_requis_cm_gamma;

	/**
	 * The cached value of the '{@link #getPort_fourni_cm_gamma() <em>Port fourni cm gamma</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_fourni_cm_gamma()
	 * @generated
	 * @ordered
	 */
	protected Port_Fourni_CM_Gamma port_fourni_cm_gamma;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attachment_CM_GammaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.ATTACHMENT_CM_GAMMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Requis_CM_Gamma getRole_requis_cm_gamma() {
		if (role_requis_cm_gamma != null && role_requis_cm_gamma.eIsProxy()) {
			InternalEObject oldRole_requis_cm_gamma = (InternalEObject)role_requis_cm_gamma;
			role_requis_cm_gamma = (Role_Requis_CM_Gamma)eResolveProxy(oldRole_requis_cm_gamma);
			if (role_requis_cm_gamma != oldRole_requis_cm_gamma) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ATTACHMENT_CM_GAMMA__ROLE_REQUIS_CM_GAMMA, oldRole_requis_cm_gamma, role_requis_cm_gamma));
			}
		}
		return role_requis_cm_gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Requis_CM_Gamma basicGetRole_requis_cm_gamma() {
		return role_requis_cm_gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole_requis_cm_gamma(Role_Requis_CM_Gamma newRole_requis_cm_gamma, NotificationChain msgs) {
		Role_Requis_CM_Gamma oldRole_requis_cm_gamma = role_requis_cm_gamma;
		role_requis_cm_gamma = newRole_requis_cm_gamma;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_CM_GAMMA__ROLE_REQUIS_CM_GAMMA, oldRole_requis_cm_gamma, newRole_requis_cm_gamma);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole_requis_cm_gamma(Role_Requis_CM_Gamma newRole_requis_cm_gamma) {
		if (newRole_requis_cm_gamma != role_requis_cm_gamma) {
			NotificationChain msgs = null;
			if (role_requis_cm_gamma != null)
				msgs = ((InternalEObject)role_requis_cm_gamma).eInverseRemove(this, Client_serveurPackage.ROLE_REQUIS_CM_GAMMA__ATTACHMENT_CM_GAMMA, Role_Requis_CM_Gamma.class, msgs);
			if (newRole_requis_cm_gamma != null)
				msgs = ((InternalEObject)newRole_requis_cm_gamma).eInverseAdd(this, Client_serveurPackage.ROLE_REQUIS_CM_GAMMA__ATTACHMENT_CM_GAMMA, Role_Requis_CM_Gamma.class, msgs);
			msgs = basicSetRole_requis_cm_gamma(newRole_requis_cm_gamma, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_CM_GAMMA__ROLE_REQUIS_CM_GAMMA, newRole_requis_cm_gamma, newRole_requis_cm_gamma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Fourni_CM_Gamma getPort_fourni_cm_gamma() {
		if (port_fourni_cm_gamma != null && port_fourni_cm_gamma.eIsProxy()) {
			InternalEObject oldPort_fourni_cm_gamma = (InternalEObject)port_fourni_cm_gamma;
			port_fourni_cm_gamma = (Port_Fourni_CM_Gamma)eResolveProxy(oldPort_fourni_cm_gamma);
			if (port_fourni_cm_gamma != oldPort_fourni_cm_gamma) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ATTACHMENT_CM_GAMMA__PORT_FOURNI_CM_GAMMA, oldPort_fourni_cm_gamma, port_fourni_cm_gamma));
			}
		}
		return port_fourni_cm_gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Fourni_CM_Gamma basicGetPort_fourni_cm_gamma() {
		return port_fourni_cm_gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort_fourni_cm_gamma(Port_Fourni_CM_Gamma newPort_fourni_cm_gamma, NotificationChain msgs) {
		Port_Fourni_CM_Gamma oldPort_fourni_cm_gamma = port_fourni_cm_gamma;
		port_fourni_cm_gamma = newPort_fourni_cm_gamma;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_CM_GAMMA__PORT_FOURNI_CM_GAMMA, oldPort_fourni_cm_gamma, newPort_fourni_cm_gamma);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_fourni_cm_gamma(Port_Fourni_CM_Gamma newPort_fourni_cm_gamma) {
		if (newPort_fourni_cm_gamma != port_fourni_cm_gamma) {
			NotificationChain msgs = null;
			if (port_fourni_cm_gamma != null)
				msgs = ((InternalEObject)port_fourni_cm_gamma).eInverseRemove(this, Client_serveurPackage.PORT_FOURNI_CM_GAMMA__ATTACHMENT_CM_GAMMA, Port_Fourni_CM_Gamma.class, msgs);
			if (newPort_fourni_cm_gamma != null)
				msgs = ((InternalEObject)newPort_fourni_cm_gamma).eInverseAdd(this, Client_serveurPackage.PORT_FOURNI_CM_GAMMA__ATTACHMENT_CM_GAMMA, Port_Fourni_CM_Gamma.class, msgs);
			msgs = basicSetPort_fourni_cm_gamma(newPort_fourni_cm_gamma, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_CM_GAMMA__PORT_FOURNI_CM_GAMMA, newPort_fourni_cm_gamma, newPort_fourni_cm_gamma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.ATTACHMENT_CM_GAMMA__ROLE_REQUIS_CM_GAMMA:
				if (role_requis_cm_gamma != null)
					msgs = ((InternalEObject)role_requis_cm_gamma).eInverseRemove(this, Client_serveurPackage.ROLE_REQUIS_CM_GAMMA__ATTACHMENT_CM_GAMMA, Role_Requis_CM_Gamma.class, msgs);
				return basicSetRole_requis_cm_gamma((Role_Requis_CM_Gamma)otherEnd, msgs);
			case Client_serveurPackage.ATTACHMENT_CM_GAMMA__PORT_FOURNI_CM_GAMMA:
				if (port_fourni_cm_gamma != null)
					msgs = ((InternalEObject)port_fourni_cm_gamma).eInverseRemove(this, Client_serveurPackage.PORT_FOURNI_CM_GAMMA__ATTACHMENT_CM_GAMMA, Port_Fourni_CM_Gamma.class, msgs);
				return basicSetPort_fourni_cm_gamma((Port_Fourni_CM_Gamma)otherEnd, msgs);
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
			case Client_serveurPackage.ATTACHMENT_CM_GAMMA__ROLE_REQUIS_CM_GAMMA:
				return basicSetRole_requis_cm_gamma(null, msgs);
			case Client_serveurPackage.ATTACHMENT_CM_GAMMA__PORT_FOURNI_CM_GAMMA:
				return basicSetPort_fourni_cm_gamma(null, msgs);
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
			case Client_serveurPackage.ATTACHMENT_CM_GAMMA__ROLE_REQUIS_CM_GAMMA:
				if (resolve) return getRole_requis_cm_gamma();
				return basicGetRole_requis_cm_gamma();
			case Client_serveurPackage.ATTACHMENT_CM_GAMMA__PORT_FOURNI_CM_GAMMA:
				if (resolve) return getPort_fourni_cm_gamma();
				return basicGetPort_fourni_cm_gamma();
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
			case Client_serveurPackage.ATTACHMENT_CM_GAMMA__ROLE_REQUIS_CM_GAMMA:
				setRole_requis_cm_gamma((Role_Requis_CM_Gamma)newValue);
				return;
			case Client_serveurPackage.ATTACHMENT_CM_GAMMA__PORT_FOURNI_CM_GAMMA:
				setPort_fourni_cm_gamma((Port_Fourni_CM_Gamma)newValue);
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
			case Client_serveurPackage.ATTACHMENT_CM_GAMMA__ROLE_REQUIS_CM_GAMMA:
				setRole_requis_cm_gamma((Role_Requis_CM_Gamma)null);
				return;
			case Client_serveurPackage.ATTACHMENT_CM_GAMMA__PORT_FOURNI_CM_GAMMA:
				setPort_fourni_cm_gamma((Port_Fourni_CM_Gamma)null);
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
			case Client_serveurPackage.ATTACHMENT_CM_GAMMA__ROLE_REQUIS_CM_GAMMA:
				return role_requis_cm_gamma != null;
			case Client_serveurPackage.ATTACHMENT_CM_GAMMA__PORT_FOURNI_CM_GAMMA:
				return port_fourni_cm_gamma != null;
		}
		return super.eIsSet(featureID);
	}

} //Attachment_CM_GammaImpl
