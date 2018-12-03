/**
 */
package client_serveur.impl;

import client_serveur.Binding_Serveur_Comp_CM;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_CM_Serveur_Comp;
import client_serveur.Port_Serveur_Comp_CM;

import cosa.impl.BindingImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Serveur Comp CM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Binding_Serveur_Comp_CMImpl#getPort_cm_serveur_comp <em>Port cm serveur comp</em>}</li>
 *   <li>{@link client_serveur.impl.Binding_Serveur_Comp_CMImpl#getPort_serveur_comp_cm <em>Port serveur comp cm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Binding_Serveur_Comp_CMImpl extends BindingImpl implements Binding_Serveur_Comp_CM {
	/**
	 * The cached value of the '{@link #getPort_cm_serveur_comp() <em>Port cm serveur comp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_cm_serveur_comp()
	 * @generated
	 * @ordered
	 */
	protected Port_CM_Serveur_Comp port_cm_serveur_comp;

	/**
	 * The cached value of the '{@link #getPort_serveur_comp_cm() <em>Port serveur comp cm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_serveur_comp_cm()
	 * @generated
	 * @ordered
	 */
	protected Port_Serveur_Comp_CM port_serveur_comp_cm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Binding_Serveur_Comp_CMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.BINDING_SERVEUR_COMP_CM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_CM_Serveur_Comp getPort_cm_serveur_comp() {
		if (port_cm_serveur_comp != null && port_cm_serveur_comp.eIsProxy()) {
			InternalEObject oldPort_cm_serveur_comp = (InternalEObject)port_cm_serveur_comp;
			port_cm_serveur_comp = (Port_CM_Serveur_Comp)eResolveProxy(oldPort_cm_serveur_comp);
			if (port_cm_serveur_comp != oldPort_cm_serveur_comp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.BINDING_SERVEUR_COMP_CM__PORT_CM_SERVEUR_COMP, oldPort_cm_serveur_comp, port_cm_serveur_comp));
			}
		}
		return port_cm_serveur_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_CM_Serveur_Comp basicGetPort_cm_serveur_comp() {
		return port_cm_serveur_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort_cm_serveur_comp(Port_CM_Serveur_Comp newPort_cm_serveur_comp, NotificationChain msgs) {
		Port_CM_Serveur_Comp oldPort_cm_serveur_comp = port_cm_serveur_comp;
		port_cm_serveur_comp = newPort_cm_serveur_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.BINDING_SERVEUR_COMP_CM__PORT_CM_SERVEUR_COMP, oldPort_cm_serveur_comp, newPort_cm_serveur_comp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_cm_serveur_comp(Port_CM_Serveur_Comp newPort_cm_serveur_comp) {
		if (newPort_cm_serveur_comp != port_cm_serveur_comp) {
			NotificationChain msgs = null;
			if (port_cm_serveur_comp != null)
				msgs = ((InternalEObject)port_cm_serveur_comp).eInverseRemove(this, Client_serveurPackage.PORT_CM_SERVEUR_COMP__BINDING_SERVEUR_COMP_CM, Port_CM_Serveur_Comp.class, msgs);
			if (newPort_cm_serveur_comp != null)
				msgs = ((InternalEObject)newPort_cm_serveur_comp).eInverseAdd(this, Client_serveurPackage.PORT_CM_SERVEUR_COMP__BINDING_SERVEUR_COMP_CM, Port_CM_Serveur_Comp.class, msgs);
			msgs = basicSetPort_cm_serveur_comp(newPort_cm_serveur_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.BINDING_SERVEUR_COMP_CM__PORT_CM_SERVEUR_COMP, newPort_cm_serveur_comp, newPort_cm_serveur_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Serveur_Comp_CM getPort_serveur_comp_cm() {
		if (port_serveur_comp_cm != null && port_serveur_comp_cm.eIsProxy()) {
			InternalEObject oldPort_serveur_comp_cm = (InternalEObject)port_serveur_comp_cm;
			port_serveur_comp_cm = (Port_Serveur_Comp_CM)eResolveProxy(oldPort_serveur_comp_cm);
			if (port_serveur_comp_cm != oldPort_serveur_comp_cm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.BINDING_SERVEUR_COMP_CM__PORT_SERVEUR_COMP_CM, oldPort_serveur_comp_cm, port_serveur_comp_cm));
			}
		}
		return port_serveur_comp_cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Serveur_Comp_CM basicGetPort_serveur_comp_cm() {
		return port_serveur_comp_cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort_serveur_comp_cm(Port_Serveur_Comp_CM newPort_serveur_comp_cm, NotificationChain msgs) {
		Port_Serveur_Comp_CM oldPort_serveur_comp_cm = port_serveur_comp_cm;
		port_serveur_comp_cm = newPort_serveur_comp_cm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.BINDING_SERVEUR_COMP_CM__PORT_SERVEUR_COMP_CM, oldPort_serveur_comp_cm, newPort_serveur_comp_cm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_serveur_comp_cm(Port_Serveur_Comp_CM newPort_serveur_comp_cm) {
		if (newPort_serveur_comp_cm != port_serveur_comp_cm) {
			NotificationChain msgs = null;
			if (port_serveur_comp_cm != null)
				msgs = ((InternalEObject)port_serveur_comp_cm).eInverseRemove(this, Client_serveurPackage.PORT_SERVEUR_COMP_CM__BINDING_SERVEUR_COMP_CM, Port_Serveur_Comp_CM.class, msgs);
			if (newPort_serveur_comp_cm != null)
				msgs = ((InternalEObject)newPort_serveur_comp_cm).eInverseAdd(this, Client_serveurPackage.PORT_SERVEUR_COMP_CM__BINDING_SERVEUR_COMP_CM, Port_Serveur_Comp_CM.class, msgs);
			msgs = basicSetPort_serveur_comp_cm(newPort_serveur_comp_cm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.BINDING_SERVEUR_COMP_CM__PORT_SERVEUR_COMP_CM, newPort_serveur_comp_cm, newPort_serveur_comp_cm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.BINDING_SERVEUR_COMP_CM__PORT_CM_SERVEUR_COMP:
				if (port_cm_serveur_comp != null)
					msgs = ((InternalEObject)port_cm_serveur_comp).eInverseRemove(this, Client_serveurPackage.PORT_CM_SERVEUR_COMP__BINDING_SERVEUR_COMP_CM, Port_CM_Serveur_Comp.class, msgs);
				return basicSetPort_cm_serveur_comp((Port_CM_Serveur_Comp)otherEnd, msgs);
			case Client_serveurPackage.BINDING_SERVEUR_COMP_CM__PORT_SERVEUR_COMP_CM:
				if (port_serveur_comp_cm != null)
					msgs = ((InternalEObject)port_serveur_comp_cm).eInverseRemove(this, Client_serveurPackage.PORT_SERVEUR_COMP_CM__BINDING_SERVEUR_COMP_CM, Port_Serveur_Comp_CM.class, msgs);
				return basicSetPort_serveur_comp_cm((Port_Serveur_Comp_CM)otherEnd, msgs);
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
			case Client_serveurPackage.BINDING_SERVEUR_COMP_CM__PORT_CM_SERVEUR_COMP:
				return basicSetPort_cm_serveur_comp(null, msgs);
			case Client_serveurPackage.BINDING_SERVEUR_COMP_CM__PORT_SERVEUR_COMP_CM:
				return basicSetPort_serveur_comp_cm(null, msgs);
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
			case Client_serveurPackage.BINDING_SERVEUR_COMP_CM__PORT_CM_SERVEUR_COMP:
				if (resolve) return getPort_cm_serveur_comp();
				return basicGetPort_cm_serveur_comp();
			case Client_serveurPackage.BINDING_SERVEUR_COMP_CM__PORT_SERVEUR_COMP_CM:
				if (resolve) return getPort_serveur_comp_cm();
				return basicGetPort_serveur_comp_cm();
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
			case Client_serveurPackage.BINDING_SERVEUR_COMP_CM__PORT_CM_SERVEUR_COMP:
				setPort_cm_serveur_comp((Port_CM_Serveur_Comp)newValue);
				return;
			case Client_serveurPackage.BINDING_SERVEUR_COMP_CM__PORT_SERVEUR_COMP_CM:
				setPort_serveur_comp_cm((Port_Serveur_Comp_CM)newValue);
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
			case Client_serveurPackage.BINDING_SERVEUR_COMP_CM__PORT_CM_SERVEUR_COMP:
				setPort_cm_serveur_comp((Port_CM_Serveur_Comp)null);
				return;
			case Client_serveurPackage.BINDING_SERVEUR_COMP_CM__PORT_SERVEUR_COMP_CM:
				setPort_serveur_comp_cm((Port_Serveur_Comp_CM)null);
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
			case Client_serveurPackage.BINDING_SERVEUR_COMP_CM__PORT_CM_SERVEUR_COMP:
				return port_cm_serveur_comp != null;
			case Client_serveurPackage.BINDING_SERVEUR_COMP_CM__PORT_SERVEUR_COMP_CM:
				return port_serveur_comp_cm != null;
		}
		return super.eIsSet(featureID);
	}

} //Binding_Serveur_Comp_CMImpl
