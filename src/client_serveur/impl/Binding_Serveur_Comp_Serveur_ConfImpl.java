/**
 */
package client_serveur.impl;

import client_serveur.Binding_Serveur_Comp_Serveur_Conf;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_Serveur_Comp_Serveur_Comf;
import client_serveur.Port_Serveur_Conf_Serveur_Comp;

import cosa.impl.BindingImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Serveur Comp Serveur Conf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Binding_Serveur_Comp_Serveur_ConfImpl#getPort_serveur_conf_serveur_comp <em>Port serveur conf serveur comp</em>}</li>
 *   <li>{@link client_serveur.impl.Binding_Serveur_Comp_Serveur_ConfImpl#getPort_serveur_comp_serveur_comf <em>Port serveur comp serveur comf</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Binding_Serveur_Comp_Serveur_ConfImpl extends BindingImpl implements Binding_Serveur_Comp_Serveur_Conf {
	/**
	 * The cached value of the '{@link #getPort_serveur_conf_serveur_comp() <em>Port serveur conf serveur comp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_serveur_conf_serveur_comp()
	 * @generated
	 * @ordered
	 */
	protected Port_Serveur_Conf_Serveur_Comp port_serveur_conf_serveur_comp;

	/**
	 * The cached value of the '{@link #getPort_serveur_comp_serveur_comf() <em>Port serveur comp serveur comf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_serveur_comp_serveur_comf()
	 * @generated
	 * @ordered
	 */
	protected Port_Serveur_Comp_Serveur_Comf port_serveur_comp_serveur_comf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Binding_Serveur_Comp_Serveur_ConfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.BINDING_SERVEUR_COMP_SERVEUR_CONF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Serveur_Conf_Serveur_Comp getPort_serveur_conf_serveur_comp() {
		if (port_serveur_conf_serveur_comp != null && port_serveur_conf_serveur_comp.eIsProxy()) {
			InternalEObject oldPort_serveur_conf_serveur_comp = (InternalEObject)port_serveur_conf_serveur_comp;
			port_serveur_conf_serveur_comp = (Port_Serveur_Conf_Serveur_Comp)eResolveProxy(oldPort_serveur_conf_serveur_comp);
			if (port_serveur_conf_serveur_comp != oldPort_serveur_conf_serveur_comp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_SERVEUR_CONF_SERVEUR_COMP, oldPort_serveur_conf_serveur_comp, port_serveur_conf_serveur_comp));
			}
		}
		return port_serveur_conf_serveur_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Serveur_Conf_Serveur_Comp basicGetPort_serveur_conf_serveur_comp() {
		return port_serveur_conf_serveur_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort_serveur_conf_serveur_comp(Port_Serveur_Conf_Serveur_Comp newPort_serveur_conf_serveur_comp, NotificationChain msgs) {
		Port_Serveur_Conf_Serveur_Comp oldPort_serveur_conf_serveur_comp = port_serveur_conf_serveur_comp;
		port_serveur_conf_serveur_comp = newPort_serveur_conf_serveur_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_SERVEUR_CONF_SERVEUR_COMP, oldPort_serveur_conf_serveur_comp, newPort_serveur_conf_serveur_comp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_serveur_conf_serveur_comp(Port_Serveur_Conf_Serveur_Comp newPort_serveur_conf_serveur_comp) {
		if (newPort_serveur_conf_serveur_comp != port_serveur_conf_serveur_comp) {
			NotificationChain msgs = null;
			if (port_serveur_conf_serveur_comp != null)
				msgs = ((InternalEObject)port_serveur_conf_serveur_comp).eInverseRemove(this, Client_serveurPackage.PORT_SERVEUR_CONF_SERVEUR_COMP__BINDING_SERVEUR_COMP_SERVEUR_CONF, Port_Serveur_Conf_Serveur_Comp.class, msgs);
			if (newPort_serveur_conf_serveur_comp != null)
				msgs = ((InternalEObject)newPort_serveur_conf_serveur_comp).eInverseAdd(this, Client_serveurPackage.PORT_SERVEUR_CONF_SERVEUR_COMP__BINDING_SERVEUR_COMP_SERVEUR_CONF, Port_Serveur_Conf_Serveur_Comp.class, msgs);
			msgs = basicSetPort_serveur_conf_serveur_comp(newPort_serveur_conf_serveur_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_SERVEUR_CONF_SERVEUR_COMP, newPort_serveur_conf_serveur_comp, newPort_serveur_conf_serveur_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Serveur_Comp_Serveur_Comf getPort_serveur_comp_serveur_comf() {
		if (port_serveur_comp_serveur_comf != null && port_serveur_comp_serveur_comf.eIsProxy()) {
			InternalEObject oldPort_serveur_comp_serveur_comf = (InternalEObject)port_serveur_comp_serveur_comf;
			port_serveur_comp_serveur_comf = (Port_Serveur_Comp_Serveur_Comf)eResolveProxy(oldPort_serveur_comp_serveur_comf);
			if (port_serveur_comp_serveur_comf != oldPort_serveur_comp_serveur_comf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_SERVEUR_COMP_SERVEUR_COMF, oldPort_serveur_comp_serveur_comf, port_serveur_comp_serveur_comf));
			}
		}
		return port_serveur_comp_serveur_comf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Serveur_Comp_Serveur_Comf basicGetPort_serveur_comp_serveur_comf() {
		return port_serveur_comp_serveur_comf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort_serveur_comp_serveur_comf(Port_Serveur_Comp_Serveur_Comf newPort_serveur_comp_serveur_comf, NotificationChain msgs) {
		Port_Serveur_Comp_Serveur_Comf oldPort_serveur_comp_serveur_comf = port_serveur_comp_serveur_comf;
		port_serveur_comp_serveur_comf = newPort_serveur_comp_serveur_comf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_SERVEUR_COMP_SERVEUR_COMF, oldPort_serveur_comp_serveur_comf, newPort_serveur_comp_serveur_comf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_serveur_comp_serveur_comf(Port_Serveur_Comp_Serveur_Comf newPort_serveur_comp_serveur_comf) {
		if (newPort_serveur_comp_serveur_comf != port_serveur_comp_serveur_comf) {
			NotificationChain msgs = null;
			if (port_serveur_comp_serveur_comf != null)
				msgs = ((InternalEObject)port_serveur_comp_serveur_comf).eInverseRemove(this, Client_serveurPackage.PORT_SERVEUR_COMP_SERVEUR_COMF__BINDING_SERVEUR_COMP_SERVEUR_CONF, Port_Serveur_Comp_Serveur_Comf.class, msgs);
			if (newPort_serveur_comp_serveur_comf != null)
				msgs = ((InternalEObject)newPort_serveur_comp_serveur_comf).eInverseAdd(this, Client_serveurPackage.PORT_SERVEUR_COMP_SERVEUR_COMF__BINDING_SERVEUR_COMP_SERVEUR_CONF, Port_Serveur_Comp_Serveur_Comf.class, msgs);
			msgs = basicSetPort_serveur_comp_serveur_comf(newPort_serveur_comp_serveur_comf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_SERVEUR_COMP_SERVEUR_COMF, newPort_serveur_comp_serveur_comf, newPort_serveur_comp_serveur_comf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_SERVEUR_CONF_SERVEUR_COMP:
				if (port_serveur_conf_serveur_comp != null)
					msgs = ((InternalEObject)port_serveur_conf_serveur_comp).eInverseRemove(this, Client_serveurPackage.PORT_SERVEUR_CONF_SERVEUR_COMP__BINDING_SERVEUR_COMP_SERVEUR_CONF, Port_Serveur_Conf_Serveur_Comp.class, msgs);
				return basicSetPort_serveur_conf_serveur_comp((Port_Serveur_Conf_Serveur_Comp)otherEnd, msgs);
			case Client_serveurPackage.BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_SERVEUR_COMP_SERVEUR_COMF:
				if (port_serveur_comp_serveur_comf != null)
					msgs = ((InternalEObject)port_serveur_comp_serveur_comf).eInverseRemove(this, Client_serveurPackage.PORT_SERVEUR_COMP_SERVEUR_COMF__BINDING_SERVEUR_COMP_SERVEUR_CONF, Port_Serveur_Comp_Serveur_Comf.class, msgs);
				return basicSetPort_serveur_comp_serveur_comf((Port_Serveur_Comp_Serveur_Comf)otherEnd, msgs);
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
			case Client_serveurPackage.BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_SERVEUR_CONF_SERVEUR_COMP:
				return basicSetPort_serveur_conf_serveur_comp(null, msgs);
			case Client_serveurPackage.BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_SERVEUR_COMP_SERVEUR_COMF:
				return basicSetPort_serveur_comp_serveur_comf(null, msgs);
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
			case Client_serveurPackage.BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_SERVEUR_CONF_SERVEUR_COMP:
				if (resolve) return getPort_serveur_conf_serveur_comp();
				return basicGetPort_serveur_conf_serveur_comp();
			case Client_serveurPackage.BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_SERVEUR_COMP_SERVEUR_COMF:
				if (resolve) return getPort_serveur_comp_serveur_comf();
				return basicGetPort_serveur_comp_serveur_comf();
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
			case Client_serveurPackage.BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_SERVEUR_CONF_SERVEUR_COMP:
				setPort_serveur_conf_serveur_comp((Port_Serveur_Conf_Serveur_Comp)newValue);
				return;
			case Client_serveurPackage.BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_SERVEUR_COMP_SERVEUR_COMF:
				setPort_serveur_comp_serveur_comf((Port_Serveur_Comp_Serveur_Comf)newValue);
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
			case Client_serveurPackage.BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_SERVEUR_CONF_SERVEUR_COMP:
				setPort_serveur_conf_serveur_comp((Port_Serveur_Conf_Serveur_Comp)null);
				return;
			case Client_serveurPackage.BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_SERVEUR_COMP_SERVEUR_COMF:
				setPort_serveur_comp_serveur_comf((Port_Serveur_Comp_Serveur_Comf)null);
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
			case Client_serveurPackage.BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_SERVEUR_CONF_SERVEUR_COMP:
				return port_serveur_conf_serveur_comp != null;
			case Client_serveurPackage.BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_SERVEUR_COMP_SERVEUR_COMF:
				return port_serveur_comp_serveur_comf != null;
		}
		return super.eIsSet(featureID);
	}

} //Binding_Serveur_Comp_Serveur_ConfImpl
