/**
 */
package client_serveur.impl;

import client_serveur.Attachment_Gamma_CM;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_Requis_Gamma_CM;
import client_serveur.Role_Fourni_Gamma_CM;

import cosa.impl.AttachmentImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment Gamma CM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Attachment_Gamma_CMImpl#getRole_fourni_gamma_cm <em>Role fourni gamma cm</em>}</li>
 *   <li>{@link client_serveur.impl.Attachment_Gamma_CMImpl#getPort_requis_gamma_cm <em>Port requis gamma cm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Attachment_Gamma_CMImpl extends AttachmentImpl implements Attachment_Gamma_CM {
	/**
	 * The cached value of the '{@link #getRole_fourni_gamma_cm() <em>Role fourni gamma cm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_fourni_gamma_cm()
	 * @generated
	 * @ordered
	 */
	protected Role_Fourni_Gamma_CM role_fourni_gamma_cm;

	/**
	 * The cached value of the '{@link #getPort_requis_gamma_cm() <em>Port requis gamma cm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_requis_gamma_cm()
	 * @generated
	 * @ordered
	 */
	protected Port_Requis_Gamma_CM port_requis_gamma_cm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attachment_Gamma_CMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.ATTACHMENT_GAMMA_CM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Fourni_Gamma_CM getRole_fourni_gamma_cm() {
		if (role_fourni_gamma_cm != null && role_fourni_gamma_cm.eIsProxy()) {
			InternalEObject oldRole_fourni_gamma_cm = (InternalEObject)role_fourni_gamma_cm;
			role_fourni_gamma_cm = (Role_Fourni_Gamma_CM)eResolveProxy(oldRole_fourni_gamma_cm);
			if (role_fourni_gamma_cm != oldRole_fourni_gamma_cm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ATTACHMENT_GAMMA_CM__ROLE_FOURNI_GAMMA_CM, oldRole_fourni_gamma_cm, role_fourni_gamma_cm));
			}
		}
		return role_fourni_gamma_cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Fourni_Gamma_CM basicGetRole_fourni_gamma_cm() {
		return role_fourni_gamma_cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole_fourni_gamma_cm(Role_Fourni_Gamma_CM newRole_fourni_gamma_cm, NotificationChain msgs) {
		Role_Fourni_Gamma_CM oldRole_fourni_gamma_cm = role_fourni_gamma_cm;
		role_fourni_gamma_cm = newRole_fourni_gamma_cm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_GAMMA_CM__ROLE_FOURNI_GAMMA_CM, oldRole_fourni_gamma_cm, newRole_fourni_gamma_cm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole_fourni_gamma_cm(Role_Fourni_Gamma_CM newRole_fourni_gamma_cm) {
		if (newRole_fourni_gamma_cm != role_fourni_gamma_cm) {
			NotificationChain msgs = null;
			if (role_fourni_gamma_cm != null)
				msgs = ((InternalEObject)role_fourni_gamma_cm).eInverseRemove(this, Client_serveurPackage.ROLE_FOURNI_GAMMA_CM__ATTACHMENT_GAMMA_CM, Role_Fourni_Gamma_CM.class, msgs);
			if (newRole_fourni_gamma_cm != null)
				msgs = ((InternalEObject)newRole_fourni_gamma_cm).eInverseAdd(this, Client_serveurPackage.ROLE_FOURNI_GAMMA_CM__ATTACHMENT_GAMMA_CM, Role_Fourni_Gamma_CM.class, msgs);
			msgs = basicSetRole_fourni_gamma_cm(newRole_fourni_gamma_cm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_GAMMA_CM__ROLE_FOURNI_GAMMA_CM, newRole_fourni_gamma_cm, newRole_fourni_gamma_cm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Requis_Gamma_CM getPort_requis_gamma_cm() {
		if (port_requis_gamma_cm != null && port_requis_gamma_cm.eIsProxy()) {
			InternalEObject oldPort_requis_gamma_cm = (InternalEObject)port_requis_gamma_cm;
			port_requis_gamma_cm = (Port_Requis_Gamma_CM)eResolveProxy(oldPort_requis_gamma_cm);
			if (port_requis_gamma_cm != oldPort_requis_gamma_cm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ATTACHMENT_GAMMA_CM__PORT_REQUIS_GAMMA_CM, oldPort_requis_gamma_cm, port_requis_gamma_cm));
			}
		}
		return port_requis_gamma_cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Requis_Gamma_CM basicGetPort_requis_gamma_cm() {
		return port_requis_gamma_cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort_requis_gamma_cm(Port_Requis_Gamma_CM newPort_requis_gamma_cm, NotificationChain msgs) {
		Port_Requis_Gamma_CM oldPort_requis_gamma_cm = port_requis_gamma_cm;
		port_requis_gamma_cm = newPort_requis_gamma_cm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_GAMMA_CM__PORT_REQUIS_GAMMA_CM, oldPort_requis_gamma_cm, newPort_requis_gamma_cm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_requis_gamma_cm(Port_Requis_Gamma_CM newPort_requis_gamma_cm) {
		if (newPort_requis_gamma_cm != port_requis_gamma_cm) {
			NotificationChain msgs = null;
			if (port_requis_gamma_cm != null)
				msgs = ((InternalEObject)port_requis_gamma_cm).eInverseRemove(this, Client_serveurPackage.PORT_REQUIS_GAMMA_CM__ATTACHMENT_GAMMA_CM, Port_Requis_Gamma_CM.class, msgs);
			if (newPort_requis_gamma_cm != null)
				msgs = ((InternalEObject)newPort_requis_gamma_cm).eInverseAdd(this, Client_serveurPackage.PORT_REQUIS_GAMMA_CM__ATTACHMENT_GAMMA_CM, Port_Requis_Gamma_CM.class, msgs);
			msgs = basicSetPort_requis_gamma_cm(newPort_requis_gamma_cm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_GAMMA_CM__PORT_REQUIS_GAMMA_CM, newPort_requis_gamma_cm, newPort_requis_gamma_cm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.ATTACHMENT_GAMMA_CM__ROLE_FOURNI_GAMMA_CM:
				if (role_fourni_gamma_cm != null)
					msgs = ((InternalEObject)role_fourni_gamma_cm).eInverseRemove(this, Client_serveurPackage.ROLE_FOURNI_GAMMA_CM__ATTACHMENT_GAMMA_CM, Role_Fourni_Gamma_CM.class, msgs);
				return basicSetRole_fourni_gamma_cm((Role_Fourni_Gamma_CM)otherEnd, msgs);
			case Client_serveurPackage.ATTACHMENT_GAMMA_CM__PORT_REQUIS_GAMMA_CM:
				if (port_requis_gamma_cm != null)
					msgs = ((InternalEObject)port_requis_gamma_cm).eInverseRemove(this, Client_serveurPackage.PORT_REQUIS_GAMMA_CM__ATTACHMENT_GAMMA_CM, Port_Requis_Gamma_CM.class, msgs);
				return basicSetPort_requis_gamma_cm((Port_Requis_Gamma_CM)otherEnd, msgs);
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
			case Client_serveurPackage.ATTACHMENT_GAMMA_CM__ROLE_FOURNI_GAMMA_CM:
				return basicSetRole_fourni_gamma_cm(null, msgs);
			case Client_serveurPackage.ATTACHMENT_GAMMA_CM__PORT_REQUIS_GAMMA_CM:
				return basicSetPort_requis_gamma_cm(null, msgs);
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
			case Client_serveurPackage.ATTACHMENT_GAMMA_CM__ROLE_FOURNI_GAMMA_CM:
				if (resolve) return getRole_fourni_gamma_cm();
				return basicGetRole_fourni_gamma_cm();
			case Client_serveurPackage.ATTACHMENT_GAMMA_CM__PORT_REQUIS_GAMMA_CM:
				if (resolve) return getPort_requis_gamma_cm();
				return basicGetPort_requis_gamma_cm();
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
			case Client_serveurPackage.ATTACHMENT_GAMMA_CM__ROLE_FOURNI_GAMMA_CM:
				setRole_fourni_gamma_cm((Role_Fourni_Gamma_CM)newValue);
				return;
			case Client_serveurPackage.ATTACHMENT_GAMMA_CM__PORT_REQUIS_GAMMA_CM:
				setPort_requis_gamma_cm((Port_Requis_Gamma_CM)newValue);
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
			case Client_serveurPackage.ATTACHMENT_GAMMA_CM__ROLE_FOURNI_GAMMA_CM:
				setRole_fourni_gamma_cm((Role_Fourni_Gamma_CM)null);
				return;
			case Client_serveurPackage.ATTACHMENT_GAMMA_CM__PORT_REQUIS_GAMMA_CM:
				setPort_requis_gamma_cm((Port_Requis_Gamma_CM)null);
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
			case Client_serveurPackage.ATTACHMENT_GAMMA_CM__ROLE_FOURNI_GAMMA_CM:
				return role_fourni_gamma_cm != null;
			case Client_serveurPackage.ATTACHMENT_GAMMA_CM__PORT_REQUIS_GAMMA_CM:
				return port_requis_gamma_cm != null;
		}
		return super.eIsSet(featureID);
	}

} //Attachment_Gamma_CMImpl
