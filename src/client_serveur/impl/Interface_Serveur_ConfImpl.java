/**
 */
package client_serveur.impl;

import client_serveur.Client_serveurPackage;
import client_serveur.Interface_Serveur_Conf;
import client_serveur.Port_Serveur_Conf_Serveur_Comp;

import cosa.impl.Interface_ComposantImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Serveur Conf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Interface_Serveur_ConfImpl#getPort_serveur_conf_serveur_comp <em>Port serveur conf serveur comp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Interface_Serveur_ConfImpl extends Interface_ComposantImpl implements Interface_Serveur_Conf {
	/**
	 * The cached value of the '{@link #getPort_serveur_conf_serveur_comp() <em>Port serveur conf serveur comp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_serveur_conf_serveur_comp()
	 * @generated
	 * @ordered
	 */
	protected EList<Port_Serveur_Conf_Serveur_Comp> port_serveur_conf_serveur_comp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Interface_Serveur_ConfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.INTERFACE_SERVEUR_CONF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port_Serveur_Conf_Serveur_Comp> getPort_serveur_conf_serveur_comp() {
		if (port_serveur_conf_serveur_comp == null) {
			port_serveur_conf_serveur_comp = new EObjectContainmentEList<Port_Serveur_Conf_Serveur_Comp>(Port_Serveur_Conf_Serveur_Comp.class, this, Client_serveurPackage.INTERFACE_SERVEUR_CONF__PORT_SERVEUR_CONF_SERVEUR_COMP);
		}
		return port_serveur_conf_serveur_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.INTERFACE_SERVEUR_CONF__PORT_SERVEUR_CONF_SERVEUR_COMP:
				return ((InternalEList<?>)getPort_serveur_conf_serveur_comp()).basicRemove(otherEnd, msgs);
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
			case Client_serveurPackage.INTERFACE_SERVEUR_CONF__PORT_SERVEUR_CONF_SERVEUR_COMP:
				return getPort_serveur_conf_serveur_comp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Client_serveurPackage.INTERFACE_SERVEUR_CONF__PORT_SERVEUR_CONF_SERVEUR_COMP:
				getPort_serveur_conf_serveur_comp().clear();
				getPort_serveur_conf_serveur_comp().addAll((Collection<? extends Port_Serveur_Conf_Serveur_Comp>)newValue);
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
			case Client_serveurPackage.INTERFACE_SERVEUR_CONF__PORT_SERVEUR_CONF_SERVEUR_COMP:
				getPort_serveur_conf_serveur_comp().clear();
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
			case Client_serveurPackage.INTERFACE_SERVEUR_CONF__PORT_SERVEUR_CONF_SERVEUR_COMP:
				return port_serveur_conf_serveur_comp != null && !port_serveur_conf_serveur_comp.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Interface_Serveur_ConfImpl
