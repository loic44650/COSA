/**
 */
package client_serveur.impl;

import client_serveur.Attachment_DB_Gamma;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_Fourni_DB_Gamma;
import client_serveur.Role_Requis_DB_Gamma;

import cosa.impl.AttachmentImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment DB Gamma</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Attachment_DB_GammaImpl#getRole_requis_db_gamma <em>Role requis db gamma</em>}</li>
 *   <li>{@link client_serveur.impl.Attachment_DB_GammaImpl#getPort_fourni_db_gamma <em>Port fourni db gamma</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Attachment_DB_GammaImpl extends AttachmentImpl implements Attachment_DB_Gamma {
	/**
	 * The cached value of the '{@link #getRole_requis_db_gamma() <em>Role requis db gamma</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_requis_db_gamma()
	 * @generated
	 * @ordered
	 */
	protected Role_Requis_DB_Gamma role_requis_db_gamma;

	/**
	 * The cached value of the '{@link #getPort_fourni_db_gamma() <em>Port fourni db gamma</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_fourni_db_gamma()
	 * @generated
	 * @ordered
	 */
	protected Port_Fourni_DB_Gamma port_fourni_db_gamma;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attachment_DB_GammaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.ATTACHMENT_DB_GAMMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Requis_DB_Gamma getRole_requis_db_gamma() {
		if (role_requis_db_gamma != null && role_requis_db_gamma.eIsProxy()) {
			InternalEObject oldRole_requis_db_gamma = (InternalEObject)role_requis_db_gamma;
			role_requis_db_gamma = (Role_Requis_DB_Gamma)eResolveProxy(oldRole_requis_db_gamma);
			if (role_requis_db_gamma != oldRole_requis_db_gamma) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ATTACHMENT_DB_GAMMA__ROLE_REQUIS_DB_GAMMA, oldRole_requis_db_gamma, role_requis_db_gamma));
			}
		}
		return role_requis_db_gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Requis_DB_Gamma basicGetRole_requis_db_gamma() {
		return role_requis_db_gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole_requis_db_gamma(Role_Requis_DB_Gamma newRole_requis_db_gamma, NotificationChain msgs) {
		Role_Requis_DB_Gamma oldRole_requis_db_gamma = role_requis_db_gamma;
		role_requis_db_gamma = newRole_requis_db_gamma;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_DB_GAMMA__ROLE_REQUIS_DB_GAMMA, oldRole_requis_db_gamma, newRole_requis_db_gamma);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole_requis_db_gamma(Role_Requis_DB_Gamma newRole_requis_db_gamma) {
		if (newRole_requis_db_gamma != role_requis_db_gamma) {
			NotificationChain msgs = null;
			if (role_requis_db_gamma != null)
				msgs = ((InternalEObject)role_requis_db_gamma).eInverseRemove(this, Client_serveurPackage.ROLE_REQUIS_DB_GAMMA__ATTACHMENT_DB_GAMMA, Role_Requis_DB_Gamma.class, msgs);
			if (newRole_requis_db_gamma != null)
				msgs = ((InternalEObject)newRole_requis_db_gamma).eInverseAdd(this, Client_serveurPackage.ROLE_REQUIS_DB_GAMMA__ATTACHMENT_DB_GAMMA, Role_Requis_DB_Gamma.class, msgs);
			msgs = basicSetRole_requis_db_gamma(newRole_requis_db_gamma, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_DB_GAMMA__ROLE_REQUIS_DB_GAMMA, newRole_requis_db_gamma, newRole_requis_db_gamma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Fourni_DB_Gamma getPort_fourni_db_gamma() {
		if (port_fourni_db_gamma != null && port_fourni_db_gamma.eIsProxy()) {
			InternalEObject oldPort_fourni_db_gamma = (InternalEObject)port_fourni_db_gamma;
			port_fourni_db_gamma = (Port_Fourni_DB_Gamma)eResolveProxy(oldPort_fourni_db_gamma);
			if (port_fourni_db_gamma != oldPort_fourni_db_gamma) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.ATTACHMENT_DB_GAMMA__PORT_FOURNI_DB_GAMMA, oldPort_fourni_db_gamma, port_fourni_db_gamma));
			}
		}
		return port_fourni_db_gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Fourni_DB_Gamma basicGetPort_fourni_db_gamma() {
		return port_fourni_db_gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort_fourni_db_gamma(Port_Fourni_DB_Gamma newPort_fourni_db_gamma, NotificationChain msgs) {
		Port_Fourni_DB_Gamma oldPort_fourni_db_gamma = port_fourni_db_gamma;
		port_fourni_db_gamma = newPort_fourni_db_gamma;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_DB_GAMMA__PORT_FOURNI_DB_GAMMA, oldPort_fourni_db_gamma, newPort_fourni_db_gamma);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_fourni_db_gamma(Port_Fourni_DB_Gamma newPort_fourni_db_gamma) {
		if (newPort_fourni_db_gamma != port_fourni_db_gamma) {
			NotificationChain msgs = null;
			if (port_fourni_db_gamma != null)
				msgs = ((InternalEObject)port_fourni_db_gamma).eInverseRemove(this, Client_serveurPackage.PORT_FOURNI_DB_GAMMA__ATTACHMENT_DB_GAMMA, Port_Fourni_DB_Gamma.class, msgs);
			if (newPort_fourni_db_gamma != null)
				msgs = ((InternalEObject)newPort_fourni_db_gamma).eInverseAdd(this, Client_serveurPackage.PORT_FOURNI_DB_GAMMA__ATTACHMENT_DB_GAMMA, Port_Fourni_DB_Gamma.class, msgs);
			msgs = basicSetPort_fourni_db_gamma(newPort_fourni_db_gamma, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.ATTACHMENT_DB_GAMMA__PORT_FOURNI_DB_GAMMA, newPort_fourni_db_gamma, newPort_fourni_db_gamma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.ATTACHMENT_DB_GAMMA__ROLE_REQUIS_DB_GAMMA:
				if (role_requis_db_gamma != null)
					msgs = ((InternalEObject)role_requis_db_gamma).eInverseRemove(this, Client_serveurPackage.ROLE_REQUIS_DB_GAMMA__ATTACHMENT_DB_GAMMA, Role_Requis_DB_Gamma.class, msgs);
				return basicSetRole_requis_db_gamma((Role_Requis_DB_Gamma)otherEnd, msgs);
			case Client_serveurPackage.ATTACHMENT_DB_GAMMA__PORT_FOURNI_DB_GAMMA:
				if (port_fourni_db_gamma != null)
					msgs = ((InternalEObject)port_fourni_db_gamma).eInverseRemove(this, Client_serveurPackage.PORT_FOURNI_DB_GAMMA__ATTACHMENT_DB_GAMMA, Port_Fourni_DB_Gamma.class, msgs);
				return basicSetPort_fourni_db_gamma((Port_Fourni_DB_Gamma)otherEnd, msgs);
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
			case Client_serveurPackage.ATTACHMENT_DB_GAMMA__ROLE_REQUIS_DB_GAMMA:
				return basicSetRole_requis_db_gamma(null, msgs);
			case Client_serveurPackage.ATTACHMENT_DB_GAMMA__PORT_FOURNI_DB_GAMMA:
				return basicSetPort_fourni_db_gamma(null, msgs);
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
			case Client_serveurPackage.ATTACHMENT_DB_GAMMA__ROLE_REQUIS_DB_GAMMA:
				if (resolve) return getRole_requis_db_gamma();
				return basicGetRole_requis_db_gamma();
			case Client_serveurPackage.ATTACHMENT_DB_GAMMA__PORT_FOURNI_DB_GAMMA:
				if (resolve) return getPort_fourni_db_gamma();
				return basicGetPort_fourni_db_gamma();
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
			case Client_serveurPackage.ATTACHMENT_DB_GAMMA__ROLE_REQUIS_DB_GAMMA:
				setRole_requis_db_gamma((Role_Requis_DB_Gamma)newValue);
				return;
			case Client_serveurPackage.ATTACHMENT_DB_GAMMA__PORT_FOURNI_DB_GAMMA:
				setPort_fourni_db_gamma((Port_Fourni_DB_Gamma)newValue);
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
			case Client_serveurPackage.ATTACHMENT_DB_GAMMA__ROLE_REQUIS_DB_GAMMA:
				setRole_requis_db_gamma((Role_Requis_DB_Gamma)null);
				return;
			case Client_serveurPackage.ATTACHMENT_DB_GAMMA__PORT_FOURNI_DB_GAMMA:
				setPort_fourni_db_gamma((Port_Fourni_DB_Gamma)null);
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
			case Client_serveurPackage.ATTACHMENT_DB_GAMMA__ROLE_REQUIS_DB_GAMMA:
				return role_requis_db_gamma != null;
			case Client_serveurPackage.ATTACHMENT_DB_GAMMA__PORT_FOURNI_DB_GAMMA:
				return port_fourni_db_gamma != null;
		}
		return super.eIsSet(featureID);
	}

} //Attachment_DB_GammaImpl
