/**
 */
package client_serveur.impl;

import client_serveur.Attachment_Alpha_SM;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_Requis_Alpha_SM;
import client_serveur.Role_Fourni_Alpha_SM;

import cosa.impl.AttachmentImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment Alpha SM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Attachment_Alpha_SMImpl#getPort_requis_alpha_sm <em>Port requis alpha sm</em>}</li>
 *   <li>{@link client_serveur.impl.Attachment_Alpha_SMImpl#getRole_fourni_alpha_sm <em>Role fourni alpha sm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Attachment_Alpha_SMImpl extends AttachmentImpl implements Attachment_Alpha_SM {
	/**
	 * The cached value of the '{@link #getPort_requis_alpha_sm() <em>Port requis alpha sm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_requis_alpha_sm()
	 * @generated
	 * @ordered
	 */
	protected Port_Requis_Alpha_SM port_requis_alpha_sm;

	/**
	 * The cached value of the '{@link #getRole_fourni_alpha_sm() <em>Role fourni alpha sm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_fourni_alpha_sm()
	 * @generated
	 * @ordered
	 */
	protected Role_Fourni_Alpha_SM role_fourni_alpha_sm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attachment_Alpha_SMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.ATTACHMENT_ALPHA_SM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Requis_Alpha_SM getPort_requis_alpha_sm() {
		if (port_requis_alpha_sm != null && port_requis_alpha_sm.eIsProxy()) {
			InternalEObject oldPort_requis_alpha_sm = (InternalEObject)port_requis_alpha_sm;
			port_requis_alpha_sm = (Port_Requis_Alpha_SM)eResolveProxy(oldPort_requis_alpha_sm);
			if (port_requis_alpha_sm != oldPort_requis_alpha_sm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ATTACHMENT_ALPHA_SM__PORT_REQUIS_ALPHA_SM, oldPort_requis_alpha_sm, port_requis_alpha_sm));
			}
		}
		return port_requis_alpha_sm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Requis_Alpha_SM basicGetPort_requis_alpha_sm() {
		return port_requis_alpha_sm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort_requis_alpha_sm(Port_Requis_Alpha_SM newPort_requis_alpha_sm, NotificationChain msgs) {
		Port_Requis_Alpha_SM oldPort_requis_alpha_sm = port_requis_alpha_sm;
		port_requis_alpha_sm = newPort_requis_alpha_sm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_ALPHA_SM__PORT_REQUIS_ALPHA_SM, oldPort_requis_alpha_sm, newPort_requis_alpha_sm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_requis_alpha_sm(Port_Requis_Alpha_SM newPort_requis_alpha_sm) {
		if (newPort_requis_alpha_sm != port_requis_alpha_sm) {
			NotificationChain msgs = null;
			if (port_requis_alpha_sm != null)
				msgs = ((InternalEObject)port_requis_alpha_sm).eInverseRemove(this, Client_serveurPackage.PORT_REQUIS_ALPHA_SM__ATTACHMENT_ALPHA_SM, Port_Requis_Alpha_SM.class, msgs);
			if (newPort_requis_alpha_sm != null)
				msgs = ((InternalEObject)newPort_requis_alpha_sm).eInverseAdd(this, Client_serveurPackage.PORT_REQUIS_ALPHA_SM__ATTACHMENT_ALPHA_SM, Port_Requis_Alpha_SM.class, msgs);
			msgs = basicSetPort_requis_alpha_sm(newPort_requis_alpha_sm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_ALPHA_SM__PORT_REQUIS_ALPHA_SM, newPort_requis_alpha_sm, newPort_requis_alpha_sm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Fourni_Alpha_SM getRole_fourni_alpha_sm() {
		if (role_fourni_alpha_sm != null && role_fourni_alpha_sm.eIsProxy()) {
			InternalEObject oldRole_fourni_alpha_sm = (InternalEObject)role_fourni_alpha_sm;
			role_fourni_alpha_sm = (Role_Fourni_Alpha_SM)eResolveProxy(oldRole_fourni_alpha_sm);
			if (role_fourni_alpha_sm != oldRole_fourni_alpha_sm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ATTACHMENT_ALPHA_SM__ROLE_FOURNI_ALPHA_SM, oldRole_fourni_alpha_sm, role_fourni_alpha_sm));
			}
		}
		return role_fourni_alpha_sm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Fourni_Alpha_SM basicGetRole_fourni_alpha_sm() {
		return role_fourni_alpha_sm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole_fourni_alpha_sm(Role_Fourni_Alpha_SM newRole_fourni_alpha_sm, NotificationChain msgs) {
		Role_Fourni_Alpha_SM oldRole_fourni_alpha_sm = role_fourni_alpha_sm;
		role_fourni_alpha_sm = newRole_fourni_alpha_sm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_ALPHA_SM__ROLE_FOURNI_ALPHA_SM, oldRole_fourni_alpha_sm, newRole_fourni_alpha_sm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole_fourni_alpha_sm(Role_Fourni_Alpha_SM newRole_fourni_alpha_sm) {
		if (newRole_fourni_alpha_sm != role_fourni_alpha_sm) {
			NotificationChain msgs = null;
			if (role_fourni_alpha_sm != null)
				msgs = ((InternalEObject)role_fourni_alpha_sm).eInverseRemove(this, Client_serveurPackage.ROLE_FOURNI_ALPHA_SM__ATTACHMENT_ALPHA_SM, Role_Fourni_Alpha_SM.class, msgs);
			if (newRole_fourni_alpha_sm != null)
				msgs = ((InternalEObject)newRole_fourni_alpha_sm).eInverseAdd(this, Client_serveurPackage.ROLE_FOURNI_ALPHA_SM__ATTACHMENT_ALPHA_SM, Role_Fourni_Alpha_SM.class, msgs);
			msgs = basicSetRole_fourni_alpha_sm(newRole_fourni_alpha_sm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_ALPHA_SM__ROLE_FOURNI_ALPHA_SM, newRole_fourni_alpha_sm, newRole_fourni_alpha_sm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.ATTACHMENT_ALPHA_SM__PORT_REQUIS_ALPHA_SM:
				if (port_requis_alpha_sm != null)
					msgs = ((InternalEObject)port_requis_alpha_sm).eInverseRemove(this, Client_serveurPackage.PORT_REQUIS_ALPHA_SM__ATTACHMENT_ALPHA_SM, Port_Requis_Alpha_SM.class, msgs);
				return basicSetPort_requis_alpha_sm((Port_Requis_Alpha_SM)otherEnd, msgs);
			case Client_serveurPackage.ATTACHMENT_ALPHA_SM__ROLE_FOURNI_ALPHA_SM:
				if (role_fourni_alpha_sm != null)
					msgs = ((InternalEObject)role_fourni_alpha_sm).eInverseRemove(this, Client_serveurPackage.ROLE_FOURNI_ALPHA_SM__ATTACHMENT_ALPHA_SM, Role_Fourni_Alpha_SM.class, msgs);
				return basicSetRole_fourni_alpha_sm((Role_Fourni_Alpha_SM)otherEnd, msgs);
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
			case Client_serveurPackage.ATTACHMENT_ALPHA_SM__PORT_REQUIS_ALPHA_SM:
				return basicSetPort_requis_alpha_sm(null, msgs);
			case Client_serveurPackage.ATTACHMENT_ALPHA_SM__ROLE_FOURNI_ALPHA_SM:
				return basicSetRole_fourni_alpha_sm(null, msgs);
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
			case Client_serveurPackage.ATTACHMENT_ALPHA_SM__PORT_REQUIS_ALPHA_SM:
				if (resolve) return getPort_requis_alpha_sm();
				return basicGetPort_requis_alpha_sm();
			case Client_serveurPackage.ATTACHMENT_ALPHA_SM__ROLE_FOURNI_ALPHA_SM:
				if (resolve) return getRole_fourni_alpha_sm();
				return basicGetRole_fourni_alpha_sm();
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
			case Client_serveurPackage.ATTACHMENT_ALPHA_SM__PORT_REQUIS_ALPHA_SM:
				setPort_requis_alpha_sm((Port_Requis_Alpha_SM)newValue);
				return;
			case Client_serveurPackage.ATTACHMENT_ALPHA_SM__ROLE_FOURNI_ALPHA_SM:
				setRole_fourni_alpha_sm((Role_Fourni_Alpha_SM)newValue);
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
			case Client_serveurPackage.ATTACHMENT_ALPHA_SM__PORT_REQUIS_ALPHA_SM:
				setPort_requis_alpha_sm((Port_Requis_Alpha_SM)null);
				return;
			case Client_serveurPackage.ATTACHMENT_ALPHA_SM__ROLE_FOURNI_ALPHA_SM:
				setRole_fourni_alpha_sm((Role_Fourni_Alpha_SM)null);
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
			case Client_serveurPackage.ATTACHMENT_ALPHA_SM__PORT_REQUIS_ALPHA_SM:
				return port_requis_alpha_sm != null;
			case Client_serveurPackage.ATTACHMENT_ALPHA_SM__ROLE_FOURNI_ALPHA_SM:
				return role_fourni_alpha_sm != null;
		}
		return super.eIsSet(featureID);
	}

} //Attachment_Alpha_SMImpl
