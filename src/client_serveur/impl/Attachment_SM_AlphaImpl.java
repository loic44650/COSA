/**
 */
package client_serveur.impl;

import client_serveur.Attachment_SM_Alpha;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_Fourni_SM_Alpha;
import client_serveur.Role_Requis_SM_Alpha;

import cosa.impl.AttachmentImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment SM Alpha</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Attachment_SM_AlphaImpl#getPort_fourni_sm_alpha <em>Port fourni sm alpha</em>}</li>
 *   <li>{@link client_serveur.impl.Attachment_SM_AlphaImpl#getRole_requis_sm_alpha <em>Role requis sm alpha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Attachment_SM_AlphaImpl extends AttachmentImpl implements Attachment_SM_Alpha {
	/**
	 * The cached value of the '{@link #getPort_fourni_sm_alpha() <em>Port fourni sm alpha</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_fourni_sm_alpha()
	 * @generated
	 * @ordered
	 */
	protected Port_Fourni_SM_Alpha port_fourni_sm_alpha;

	/**
	 * The cached value of the '{@link #getRole_requis_sm_alpha() <em>Role requis sm alpha</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_requis_sm_alpha()
	 * @generated
	 * @ordered
	 */
	protected Role_Requis_SM_Alpha role_requis_sm_alpha;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attachment_SM_AlphaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.ATTACHMENT_SM_ALPHA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Fourni_SM_Alpha getPort_fourni_sm_alpha() {
		if (port_fourni_sm_alpha != null && port_fourni_sm_alpha.eIsProxy()) {
			InternalEObject oldPort_fourni_sm_alpha = (InternalEObject)port_fourni_sm_alpha;
			port_fourni_sm_alpha = (Port_Fourni_SM_Alpha)eResolveProxy(oldPort_fourni_sm_alpha);
			if (port_fourni_sm_alpha != oldPort_fourni_sm_alpha) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ATTACHMENT_SM_ALPHA__PORT_FOURNI_SM_ALPHA, oldPort_fourni_sm_alpha, port_fourni_sm_alpha));
			}
		}
		return port_fourni_sm_alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Fourni_SM_Alpha basicGetPort_fourni_sm_alpha() {
		return port_fourni_sm_alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort_fourni_sm_alpha(Port_Fourni_SM_Alpha newPort_fourni_sm_alpha, NotificationChain msgs) {
		Port_Fourni_SM_Alpha oldPort_fourni_sm_alpha = port_fourni_sm_alpha;
		port_fourni_sm_alpha = newPort_fourni_sm_alpha;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_SM_ALPHA__PORT_FOURNI_SM_ALPHA, oldPort_fourni_sm_alpha, newPort_fourni_sm_alpha);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_fourni_sm_alpha(Port_Fourni_SM_Alpha newPort_fourni_sm_alpha) {
		if (newPort_fourni_sm_alpha != port_fourni_sm_alpha) {
			NotificationChain msgs = null;
			if (port_fourni_sm_alpha != null)
				msgs = ((InternalEObject)port_fourni_sm_alpha).eInverseRemove(this, Client_serveurPackage.PORT_FOURNI_SM_ALPHA__ATTACHMENT_SM_ALPHA, Port_Fourni_SM_Alpha.class, msgs);
			if (newPort_fourni_sm_alpha != null)
				msgs = ((InternalEObject)newPort_fourni_sm_alpha).eInverseAdd(this, Client_serveurPackage.PORT_FOURNI_SM_ALPHA__ATTACHMENT_SM_ALPHA, Port_Fourni_SM_Alpha.class, msgs);
			msgs = basicSetPort_fourni_sm_alpha(newPort_fourni_sm_alpha, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_SM_ALPHA__PORT_FOURNI_SM_ALPHA, newPort_fourni_sm_alpha, newPort_fourni_sm_alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Requis_SM_Alpha getRole_requis_sm_alpha() {
		if (role_requis_sm_alpha != null && role_requis_sm_alpha.eIsProxy()) {
			InternalEObject oldRole_requis_sm_alpha = (InternalEObject)role_requis_sm_alpha;
			role_requis_sm_alpha = (Role_Requis_SM_Alpha)eResolveProxy(oldRole_requis_sm_alpha);
			if (role_requis_sm_alpha != oldRole_requis_sm_alpha) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ATTACHMENT_SM_ALPHA__ROLE_REQUIS_SM_ALPHA, oldRole_requis_sm_alpha, role_requis_sm_alpha));
			}
		}
		return role_requis_sm_alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Requis_SM_Alpha basicGetRole_requis_sm_alpha() {
		return role_requis_sm_alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole_requis_sm_alpha(Role_Requis_SM_Alpha newRole_requis_sm_alpha, NotificationChain msgs) {
		Role_Requis_SM_Alpha oldRole_requis_sm_alpha = role_requis_sm_alpha;
		role_requis_sm_alpha = newRole_requis_sm_alpha;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_SM_ALPHA__ROLE_REQUIS_SM_ALPHA, oldRole_requis_sm_alpha, newRole_requis_sm_alpha);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole_requis_sm_alpha(Role_Requis_SM_Alpha newRole_requis_sm_alpha) {
		if (newRole_requis_sm_alpha != role_requis_sm_alpha) {
			NotificationChain msgs = null;
			if (role_requis_sm_alpha != null)
				msgs = ((InternalEObject)role_requis_sm_alpha).eInverseRemove(this, Client_serveurPackage.ROLE_REQUIS_SM_ALPHA__ATTACHMENT_SM_ALPHA, Role_Requis_SM_Alpha.class, msgs);
			if (newRole_requis_sm_alpha != null)
				msgs = ((InternalEObject)newRole_requis_sm_alpha).eInverseAdd(this, Client_serveurPackage.ROLE_REQUIS_SM_ALPHA__ATTACHMENT_SM_ALPHA, Role_Requis_SM_Alpha.class, msgs);
			msgs = basicSetRole_requis_sm_alpha(newRole_requis_sm_alpha, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_SM_ALPHA__ROLE_REQUIS_SM_ALPHA, newRole_requis_sm_alpha, newRole_requis_sm_alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.ATTACHMENT_SM_ALPHA__PORT_FOURNI_SM_ALPHA:
				if (port_fourni_sm_alpha != null)
					msgs = ((InternalEObject)port_fourni_sm_alpha).eInverseRemove(this, Client_serveurPackage.PORT_FOURNI_SM_ALPHA__ATTACHMENT_SM_ALPHA, Port_Fourni_SM_Alpha.class, msgs);
				return basicSetPort_fourni_sm_alpha((Port_Fourni_SM_Alpha)otherEnd, msgs);
			case Client_serveurPackage.ATTACHMENT_SM_ALPHA__ROLE_REQUIS_SM_ALPHA:
				if (role_requis_sm_alpha != null)
					msgs = ((InternalEObject)role_requis_sm_alpha).eInverseRemove(this, Client_serveurPackage.ROLE_REQUIS_SM_ALPHA__ATTACHMENT_SM_ALPHA, Role_Requis_SM_Alpha.class, msgs);
				return basicSetRole_requis_sm_alpha((Role_Requis_SM_Alpha)otherEnd, msgs);
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
			case Client_serveurPackage.ATTACHMENT_SM_ALPHA__PORT_FOURNI_SM_ALPHA:
				return basicSetPort_fourni_sm_alpha(null, msgs);
			case Client_serveurPackage.ATTACHMENT_SM_ALPHA__ROLE_REQUIS_SM_ALPHA:
				return basicSetRole_requis_sm_alpha(null, msgs);
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
			case Client_serveurPackage.ATTACHMENT_SM_ALPHA__PORT_FOURNI_SM_ALPHA:
				if (resolve) return getPort_fourni_sm_alpha();
				return basicGetPort_fourni_sm_alpha();
			case Client_serveurPackage.ATTACHMENT_SM_ALPHA__ROLE_REQUIS_SM_ALPHA:
				if (resolve) return getRole_requis_sm_alpha();
				return basicGetRole_requis_sm_alpha();
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
			case Client_serveurPackage.ATTACHMENT_SM_ALPHA__PORT_FOURNI_SM_ALPHA:
				setPort_fourni_sm_alpha((Port_Fourni_SM_Alpha)newValue);
				return;
			case Client_serveurPackage.ATTACHMENT_SM_ALPHA__ROLE_REQUIS_SM_ALPHA:
				setRole_requis_sm_alpha((Role_Requis_SM_Alpha)newValue);
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
			case Client_serveurPackage.ATTACHMENT_SM_ALPHA__PORT_FOURNI_SM_ALPHA:
				setPort_fourni_sm_alpha((Port_Fourni_SM_Alpha)null);
				return;
			case Client_serveurPackage.ATTACHMENT_SM_ALPHA__ROLE_REQUIS_SM_ALPHA:
				setRole_requis_sm_alpha((Role_Requis_SM_Alpha)null);
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
			case Client_serveurPackage.ATTACHMENT_SM_ALPHA__PORT_FOURNI_SM_ALPHA:
				return port_fourni_sm_alpha != null;
			case Client_serveurPackage.ATTACHMENT_SM_ALPHA__ROLE_REQUIS_SM_ALPHA:
				return role_requis_sm_alpha != null;
		}
		return super.eIsSet(featureID);
	}

} //Attachment_SM_AlphaImpl
