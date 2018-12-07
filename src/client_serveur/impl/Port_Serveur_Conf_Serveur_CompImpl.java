/**
 */
package client_serveur.impl;

import client_serveur.Binding_Serveur_Comp_Serveur_Conf;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_Serveur_Conf_Serveur_Comp;

import cosa.impl.PortImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Serveur Conf Serveur Comp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Port_Serveur_Conf_Serveur_CompImpl#getBinding_serveur_comp_serveur_conf <em>Binding serveur comp serveur conf</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Port_Serveur_Conf_Serveur_CompImpl extends PortImpl implements Port_Serveur_Conf_Serveur_Comp {
	/**
	 * The cached value of the '{@link #getBinding_serveur_comp_serveur_conf() <em>Binding serveur comp serveur conf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding_serveur_comp_serveur_conf()
	 * @generated
	 * @ordered
	 */
	protected Binding_Serveur_Comp_Serveur_Conf binding_serveur_comp_serveur_conf;

	String request;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Port_Serveur_Conf_Serveur_CompImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.PORT_SERVEUR_CONF_SERVEUR_COMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding_Serveur_Comp_Serveur_Conf getBinding_serveur_comp_serveur_conf() {
		if (binding_serveur_comp_serveur_conf != null && binding_serveur_comp_serveur_conf.eIsProxy()) {
			InternalEObject oldBinding_serveur_comp_serveur_conf = (InternalEObject)binding_serveur_comp_serveur_conf;
			binding_serveur_comp_serveur_conf = (Binding_Serveur_Comp_Serveur_Conf)eResolveProxy(oldBinding_serveur_comp_serveur_conf);
			if (binding_serveur_comp_serveur_conf != oldBinding_serveur_comp_serveur_conf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.PORT_SERVEUR_CONF_SERVEUR_COMP__BINDING_SERVEUR_COMP_SERVEUR_CONF, oldBinding_serveur_comp_serveur_conf, binding_serveur_comp_serveur_conf));
			}
		}
		return binding_serveur_comp_serveur_conf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding_Serveur_Comp_Serveur_Conf basicGetBinding_serveur_comp_serveur_conf() {
		return binding_serveur_comp_serveur_conf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinding_serveur_comp_serveur_conf(Binding_Serveur_Comp_Serveur_Conf newBinding_serveur_comp_serveur_conf, NotificationChain msgs) {
		Binding_Serveur_Comp_Serveur_Conf oldBinding_serveur_comp_serveur_conf = binding_serveur_comp_serveur_conf;
		binding_serveur_comp_serveur_conf = newBinding_serveur_comp_serveur_conf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.PORT_SERVEUR_CONF_SERVEUR_COMP__BINDING_SERVEUR_COMP_SERVEUR_CONF, oldBinding_serveur_comp_serveur_conf, newBinding_serveur_comp_serveur_conf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding_serveur_comp_serveur_conf(Binding_Serveur_Comp_Serveur_Conf newBinding_serveur_comp_serveur_conf) {
		if (newBinding_serveur_comp_serveur_conf != binding_serveur_comp_serveur_conf) {
			NotificationChain msgs = null;
			if (binding_serveur_comp_serveur_conf != null)
				msgs = ((InternalEObject)binding_serveur_comp_serveur_conf).eInverseRemove(this, Client_serveurPackage.BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_SERVEUR_CONF_SERVEUR_COMP, Binding_Serveur_Comp_Serveur_Conf.class, msgs);
			if (newBinding_serveur_comp_serveur_conf != null)
				msgs = ((InternalEObject)newBinding_serveur_comp_serveur_conf).eInverseAdd(this, Client_serveurPackage.BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_SERVEUR_CONF_SERVEUR_COMP, Binding_Serveur_Comp_Serveur_Conf.class, msgs);
			msgs = basicSetBinding_serveur_comp_serveur_conf(newBinding_serveur_comp_serveur_conf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.PORT_SERVEUR_CONF_SERVEUR_COMP__BINDING_SERVEUR_COMP_SERVEUR_CONF, newBinding_serveur_comp_serveur_conf, newBinding_serveur_comp_serveur_conf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.PORT_SERVEUR_CONF_SERVEUR_COMP__BINDING_SERVEUR_COMP_SERVEUR_CONF:
				if (binding_serveur_comp_serveur_conf != null)
					msgs = ((InternalEObject)binding_serveur_comp_serveur_conf).eInverseRemove(this, Client_serveurPackage.BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_SERVEUR_CONF_SERVEUR_COMP, Binding_Serveur_Comp_Serveur_Conf.class, msgs);
				return basicSetBinding_serveur_comp_serveur_conf((Binding_Serveur_Comp_Serveur_Conf)otherEnd, msgs);
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
			case Client_serveurPackage.PORT_SERVEUR_CONF_SERVEUR_COMP__BINDING_SERVEUR_COMP_SERVEUR_CONF:
				return basicSetBinding_serveur_comp_serveur_conf(null, msgs);
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
			case Client_serveurPackage.PORT_SERVEUR_CONF_SERVEUR_COMP__BINDING_SERVEUR_COMP_SERVEUR_CONF:
				if (resolve) return getBinding_serveur_comp_serveur_conf();
				return basicGetBinding_serveur_comp_serveur_conf();
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
			case Client_serveurPackage.PORT_SERVEUR_CONF_SERVEUR_COMP__BINDING_SERVEUR_COMP_SERVEUR_CONF:
				setBinding_serveur_comp_serveur_conf((Binding_Serveur_Comp_Serveur_Conf)newValue);
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
			case Client_serveurPackage.PORT_SERVEUR_CONF_SERVEUR_COMP__BINDING_SERVEUR_COMP_SERVEUR_CONF:
				setBinding_serveur_comp_serveur_conf((Binding_Serveur_Comp_Serveur_Conf)null);
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
			case Client_serveurPackage.PORT_SERVEUR_CONF_SERVEUR_COMP__BINDING_SERVEUR_COMP_SERVEUR_CONF:
				return binding_serveur_comp_serveur_conf != null;
		}
		return super.eIsSet(featureID);
	}

	public void sendRequest(String request) {
		this.request = request;
	}

	public void sendResponse(String response) {
		((Binding_Serveur_Comp_Serveur_ConfImpl) binding_serveur_comp_serveur_conf).sendResponse(response);
		
	}

	public String getRequest() {
		return this.request;
	}

} //Port_Serveur_Conf_Serveur_CompImpl
