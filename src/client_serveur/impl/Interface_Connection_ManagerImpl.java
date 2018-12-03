/**
 */
package client_serveur.impl;

import client_serveur.Client_serveurPackage;
import client_serveur.Interface_Connection_Manager;
import client_serveur.Port_CM_Serveur_Comp;
import client_serveur.Port_Fourni_CM_Alpha;
import client_serveur.Port_Fourni_CM_Gamma;
import client_serveur.Port_Requis_Alpha_CM;
import client_serveur.Port_Requis_Gamma_CM;

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
 * An implementation of the model object '<em><b>Interface Connection Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Interface_Connection_ManagerImpl#getPort_fourni_cm_gamma <em>Port fourni cm gamma</em>}</li>
 *   <li>{@link client_serveur.impl.Interface_Connection_ManagerImpl#getPort_requis_gamma_cm <em>Port requis gamma cm</em>}</li>
 *   <li>{@link client_serveur.impl.Interface_Connection_ManagerImpl#getPort_fourni_cm_alpha <em>Port fourni cm alpha</em>}</li>
 *   <li>{@link client_serveur.impl.Interface_Connection_ManagerImpl#getPort_requis_alpha_cm <em>Port requis alpha cm</em>}</li>
 *   <li>{@link client_serveur.impl.Interface_Connection_ManagerImpl#getPort_cm_serveur_comp <em>Port cm serveur comp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Interface_Connection_ManagerImpl extends Interface_ComposantImpl implements Interface_Connection_Manager {
	/**
	 * The cached value of the '{@link #getPort_fourni_cm_gamma() <em>Port fourni cm gamma</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_fourni_cm_gamma()
	 * @generated
	 * @ordered
	 */
	protected EList<Port_Fourni_CM_Gamma> port_fourni_cm_gamma;

	/**
	 * The cached value of the '{@link #getPort_requis_gamma_cm() <em>Port requis gamma cm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_requis_gamma_cm()
	 * @generated
	 * @ordered
	 */
	protected EList<Port_Requis_Gamma_CM> port_requis_gamma_cm;

	/**
	 * The cached value of the '{@link #getPort_fourni_cm_alpha() <em>Port fourni cm alpha</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_fourni_cm_alpha()
	 * @generated
	 * @ordered
	 */
	protected EList<Port_Fourni_CM_Alpha> port_fourni_cm_alpha;

	/**
	 * The cached value of the '{@link #getPort_requis_alpha_cm() <em>Port requis alpha cm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_requis_alpha_cm()
	 * @generated
	 * @ordered
	 */
	protected EList<Port_Requis_Alpha_CM> port_requis_alpha_cm;

	/**
	 * The cached value of the '{@link #getPort_cm_serveur_comp() <em>Port cm serveur comp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_cm_serveur_comp()
	 * @generated
	 * @ordered
	 */
	protected EList<Port_CM_Serveur_Comp> port_cm_serveur_comp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Interface_Connection_ManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.INTERFACE_CONNECTION_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port_Fourni_CM_Gamma> getPort_fourni_cm_gamma() {
		if (port_fourni_cm_gamma == null) {
			port_fourni_cm_gamma = new EObjectContainmentEList<Port_Fourni_CM_Gamma>(Port_Fourni_CM_Gamma.class, this, Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_FOURNI_CM_GAMMA);
		}
		return port_fourni_cm_gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port_Requis_Gamma_CM> getPort_requis_gamma_cm() {
		if (port_requis_gamma_cm == null) {
			port_requis_gamma_cm = new EObjectContainmentEList<Port_Requis_Gamma_CM>(Port_Requis_Gamma_CM.class, this, Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_REQUIS_GAMMA_CM);
		}
		return port_requis_gamma_cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port_Fourni_CM_Alpha> getPort_fourni_cm_alpha() {
		if (port_fourni_cm_alpha == null) {
			port_fourni_cm_alpha = new EObjectContainmentEList<Port_Fourni_CM_Alpha>(Port_Fourni_CM_Alpha.class, this, Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_FOURNI_CM_ALPHA);
		}
		return port_fourni_cm_alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port_Requis_Alpha_CM> getPort_requis_alpha_cm() {
		if (port_requis_alpha_cm == null) {
			port_requis_alpha_cm = new EObjectContainmentEList<Port_Requis_Alpha_CM>(Port_Requis_Alpha_CM.class, this, Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_REQUIS_ALPHA_CM);
		}
		return port_requis_alpha_cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port_CM_Serveur_Comp> getPort_cm_serveur_comp() {
		if (port_cm_serveur_comp == null) {
			port_cm_serveur_comp = new EObjectContainmentEList<Port_CM_Serveur_Comp>(Port_CM_Serveur_Comp.class, this, Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_CM_SERVEUR_COMP);
		}
		return port_cm_serveur_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_FOURNI_CM_GAMMA:
				return ((InternalEList<?>)getPort_fourni_cm_gamma()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_REQUIS_GAMMA_CM:
				return ((InternalEList<?>)getPort_requis_gamma_cm()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_FOURNI_CM_ALPHA:
				return ((InternalEList<?>)getPort_fourni_cm_alpha()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_REQUIS_ALPHA_CM:
				return ((InternalEList<?>)getPort_requis_alpha_cm()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_CM_SERVEUR_COMP:
				return ((InternalEList<?>)getPort_cm_serveur_comp()).basicRemove(otherEnd, msgs);
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
			case Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_FOURNI_CM_GAMMA:
				return getPort_fourni_cm_gamma();
			case Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_REQUIS_GAMMA_CM:
				return getPort_requis_gamma_cm();
			case Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_FOURNI_CM_ALPHA:
				return getPort_fourni_cm_alpha();
			case Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_REQUIS_ALPHA_CM:
				return getPort_requis_alpha_cm();
			case Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_CM_SERVEUR_COMP:
				return getPort_cm_serveur_comp();
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
			case Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_FOURNI_CM_GAMMA:
				getPort_fourni_cm_gamma().clear();
				getPort_fourni_cm_gamma().addAll((Collection<? extends Port_Fourni_CM_Gamma>)newValue);
				return;
			case Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_REQUIS_GAMMA_CM:
				getPort_requis_gamma_cm().clear();
				getPort_requis_gamma_cm().addAll((Collection<? extends Port_Requis_Gamma_CM>)newValue);
				return;
			case Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_FOURNI_CM_ALPHA:
				getPort_fourni_cm_alpha().clear();
				getPort_fourni_cm_alpha().addAll((Collection<? extends Port_Fourni_CM_Alpha>)newValue);
				return;
			case Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_REQUIS_ALPHA_CM:
				getPort_requis_alpha_cm().clear();
				getPort_requis_alpha_cm().addAll((Collection<? extends Port_Requis_Alpha_CM>)newValue);
				return;
			case Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_CM_SERVEUR_COMP:
				getPort_cm_serveur_comp().clear();
				getPort_cm_serveur_comp().addAll((Collection<? extends Port_CM_Serveur_Comp>)newValue);
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
			case Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_FOURNI_CM_GAMMA:
				getPort_fourni_cm_gamma().clear();
				return;
			case Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_REQUIS_GAMMA_CM:
				getPort_requis_gamma_cm().clear();
				return;
			case Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_FOURNI_CM_ALPHA:
				getPort_fourni_cm_alpha().clear();
				return;
			case Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_REQUIS_ALPHA_CM:
				getPort_requis_alpha_cm().clear();
				return;
			case Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_CM_SERVEUR_COMP:
				getPort_cm_serveur_comp().clear();
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
			case Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_FOURNI_CM_GAMMA:
				return port_fourni_cm_gamma != null && !port_fourni_cm_gamma.isEmpty();
			case Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_REQUIS_GAMMA_CM:
				return port_requis_gamma_cm != null && !port_requis_gamma_cm.isEmpty();
			case Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_FOURNI_CM_ALPHA:
				return port_fourni_cm_alpha != null && !port_fourni_cm_alpha.isEmpty();
			case Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_REQUIS_ALPHA_CM:
				return port_requis_alpha_cm != null && !port_requis_alpha_cm.isEmpty();
			case Client_serveurPackage.INTERFACE_CONNECTION_MANAGER__PORT_CM_SERVEUR_COMP:
				return port_cm_serveur_comp != null && !port_cm_serveur_comp.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Interface_Connection_ManagerImpl
