/**
 */
package client_serveur.impl;

import client_serveur.Attachment_Alpha_CM;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_Requis_Alpha_CM;
import client_serveur.Role_Fourni_Alpha_CM;

import cosa.impl.AttachmentImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment Alpha CM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Attachment_Alpha_CMImpl#getPort_requis_alpha_cm <em>Port requis alpha cm</em>}</li>
 *   <li>{@link client_serveur.impl.Attachment_Alpha_CMImpl#getRole_fourni_alpha_cm <em>Role fourni alpha cm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Attachment_Alpha_CMImpl extends AttachmentImpl implements Attachment_Alpha_CM {
	/**
	 * The cached value of the '{@link #getPort_requis_alpha_cm() <em>Port requis alpha cm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_requis_alpha_cm()
	 * @generated
	 * @ordered
	 */
	protected Port_Requis_Alpha_CM port_requis_alpha_cm;

	/**
	 * The cached value of the '{@link #getRole_fourni_alpha_cm() <em>Role fourni alpha cm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_fourni_alpha_cm()
	 * @generated
	 * @ordered
	 */
	protected Role_Fourni_Alpha_CM role_fourni_alpha_cm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attachment_Alpha_CMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.ATTACHMENT_ALPHA_CM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Requis_Alpha_CM getPort_requis_alpha_cm() {
		if (port_requis_alpha_cm != null && port_requis_alpha_cm.eIsProxy()) {
			InternalEObject oldPort_requis_alpha_cm = (InternalEObject)port_requis_alpha_cm;
			port_requis_alpha_cm = (Port_Requis_Alpha_CM)eResolveProxy(oldPort_requis_alpha_cm);
			if (port_requis_alpha_cm != oldPort_requis_alpha_cm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ATTACHMENT_ALPHA_CM__PORT_REQUIS_ALPHA_CM, oldPort_requis_alpha_cm, port_requis_alpha_cm));
			}
		}
		return port_requis_alpha_cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Requis_Alpha_CM basicGetPort_requis_alpha_cm() {
		return port_requis_alpha_cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort_requis_alpha_cm(Port_Requis_Alpha_CM newPort_requis_alpha_cm, NotificationChain msgs) {
		Port_Requis_Alpha_CM oldPort_requis_alpha_cm = port_requis_alpha_cm;
		port_requis_alpha_cm = newPort_requis_alpha_cm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_ALPHA_CM__PORT_REQUIS_ALPHA_CM, oldPort_requis_alpha_cm, newPort_requis_alpha_cm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_requis_alpha_cm(Port_Requis_Alpha_CM newPort_requis_alpha_cm) {
		if (newPort_requis_alpha_cm != port_requis_alpha_cm) {
			NotificationChain msgs = null;
			if (port_requis_alpha_cm != null)
				msgs = ((InternalEObject)port_requis_alpha_cm).eInverseRemove(this, Client_serveurPackage.PORT_REQUIS_ALPHA_CM__ATTACHMENT_ALPHA_CM, Port_Requis_Alpha_CM.class, msgs);
			if (newPort_requis_alpha_cm != null)
				msgs = ((InternalEObject)newPort_requis_alpha_cm).eInverseAdd(this, Client_serveurPackage.PORT_REQUIS_ALPHA_CM__ATTACHMENT_ALPHA_CM, Port_Requis_Alpha_CM.class, msgs);
			msgs = basicSetPort_requis_alpha_cm(newPort_requis_alpha_cm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_ALPHA_CM__PORT_REQUIS_ALPHA_CM, newPort_requis_alpha_cm, newPort_requis_alpha_cm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Fourni_Alpha_CM getRole_fourni_alpha_cm() {
		if (role_fourni_alpha_cm != null && role_fourni_alpha_cm.eIsProxy()) {
			InternalEObject oldRole_fourni_alpha_cm = (InternalEObject)role_fourni_alpha_cm;
			role_fourni_alpha_cm = (Role_Fourni_Alpha_CM)eResolveProxy(oldRole_fourni_alpha_cm);
			if (role_fourni_alpha_cm != oldRole_fourni_alpha_cm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ATTACHMENT_ALPHA_CM__ROLE_FOURNI_ALPHA_CM, oldRole_fourni_alpha_cm, role_fourni_alpha_cm));
			}
		}
		return role_fourni_alpha_cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Fourni_Alpha_CM basicGetRole_fourni_alpha_cm() {
		return role_fourni_alpha_cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole_fourni_alpha_cm(Role_Fourni_Alpha_CM newRole_fourni_alpha_cm, NotificationChain msgs) {
		Role_Fourni_Alpha_CM oldRole_fourni_alpha_cm = role_fourni_alpha_cm;
		role_fourni_alpha_cm = newRole_fourni_alpha_cm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_ALPHA_CM__ROLE_FOURNI_ALPHA_CM, oldRole_fourni_alpha_cm, newRole_fourni_alpha_cm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole_fourni_alpha_cm(Role_Fourni_Alpha_CM newRole_fourni_alpha_cm) {
		if (newRole_fourni_alpha_cm != role_fourni_alpha_cm) {
			NotificationChain msgs = null;
			if (role_fourni_alpha_cm != null)
				msgs = ((InternalEObject)role_fourni_alpha_cm).eInverseRemove(this, Client_serveurPackage.ROLE_FOURNI_ALPHA_CM__ATTACHMENT_ALPHA_CM, Role_Fourni_Alpha_CM.class, msgs);
			if (newRole_fourni_alpha_cm != null)
				msgs = ((InternalEObject)newRole_fourni_alpha_cm).eInverseAdd(this, Client_serveurPackage.ROLE_FOURNI_ALPHA_CM__ATTACHMENT_ALPHA_CM, Role_Fourni_Alpha_CM.class, msgs);
			msgs = basicSetRole_fourni_alpha_cm(newRole_fourni_alpha_cm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_ALPHA_CM__ROLE_FOURNI_ALPHA_CM, newRole_fourni_alpha_cm, newRole_fourni_alpha_cm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.ATTACHMENT_ALPHA_CM__PORT_REQUIS_ALPHA_CM:
				if (port_requis_alpha_cm != null)
					msgs = ((InternalEObject)port_requis_alpha_cm).eInverseRemove(this, Client_serveurPackage.PORT_REQUIS_ALPHA_CM__ATTACHMENT_ALPHA_CM, Port_Requis_Alpha_CM.class, msgs);
				return basicSetPort_requis_alpha_cm((Port_Requis_Alpha_CM)otherEnd, msgs);
			case Client_serveurPackage.ATTACHMENT_ALPHA_CM__ROLE_FOURNI_ALPHA_CM:
				if (role_fourni_alpha_cm != null)
					msgs = ((InternalEObject)role_fourni_alpha_cm).eInverseRemove(this, Client_serveurPackage.ROLE_FOURNI_ALPHA_CM__ATTACHMENT_ALPHA_CM, Role_Fourni_Alpha_CM.class, msgs);
				return basicSetRole_fourni_alpha_cm((Role_Fourni_Alpha_CM)otherEnd, msgs);
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
			case Client_serveurPackage.ATTACHMENT_ALPHA_CM__PORT_REQUIS_ALPHA_CM:
				return basicSetPort_requis_alpha_cm(null, msgs);
			case Client_serveurPackage.ATTACHMENT_ALPHA_CM__ROLE_FOURNI_ALPHA_CM:
				return basicSetRole_fourni_alpha_cm(null, msgs);
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
			case Client_serveurPackage.ATTACHMENT_ALPHA_CM__PORT_REQUIS_ALPHA_CM:
				if (resolve) return getPort_requis_alpha_cm();
				return basicGetPort_requis_alpha_cm();
			case Client_serveurPackage.ATTACHMENT_ALPHA_CM__ROLE_FOURNI_ALPHA_CM:
				if (resolve) return getRole_fourni_alpha_cm();
				return basicGetRole_fourni_alpha_cm();
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
			case Client_serveurPackage.ATTACHMENT_ALPHA_CM__PORT_REQUIS_ALPHA_CM:
				setPort_requis_alpha_cm((Port_Requis_Alpha_CM)newValue);
				return;
			case Client_serveurPackage.ATTACHMENT_ALPHA_CM__ROLE_FOURNI_ALPHA_CM:
				setRole_fourni_alpha_cm((Role_Fourni_Alpha_CM)newValue);
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
			case Client_serveurPackage.ATTACHMENT_ALPHA_CM__PORT_REQUIS_ALPHA_CM:
				setPort_requis_alpha_cm((Port_Requis_Alpha_CM)null);
				return;
			case Client_serveurPackage.ATTACHMENT_ALPHA_CM__ROLE_FOURNI_ALPHA_CM:
				setRole_fourni_alpha_cm((Role_Fourni_Alpha_CM)null);
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
			case Client_serveurPackage.ATTACHMENT_ALPHA_CM__PORT_REQUIS_ALPHA_CM:
				return port_requis_alpha_cm != null;
			case Client_serveurPackage.ATTACHMENT_ALPHA_CM__ROLE_FOURNI_ALPHA_CM:
				return role_fourni_alpha_cm != null;
		}
		return super.eIsSet(featureID);
	}

} //Attachment_Alpha_CMImpl
