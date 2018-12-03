/**
 */
package client_serveur.impl;

import client_serveur.Client_serveurPackage;
import client_serveur.Interface_Security_Manager;
import client_serveur.Port_Fourni_SM_Alpha;
import client_serveur.Port_Fourni_SM_Beta;
import client_serveur.Port_Requis_Alpha_SM;
import client_serveur.Port_Requis_Beta_SM;

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
 * An implementation of the model object '<em><b>Interface Security Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Interface_Security_ManagerImpl#getPort_fourni_sm_beta <em>Port fourni sm beta</em>}</li>
 *   <li>{@link client_serveur.impl.Interface_Security_ManagerImpl#getPort_requis_beta_sm <em>Port requis beta sm</em>}</li>
 *   <li>{@link client_serveur.impl.Interface_Security_ManagerImpl#getPort_fourni_sm_alpha <em>Port fourni sm alpha</em>}</li>
 *   <li>{@link client_serveur.impl.Interface_Security_ManagerImpl#getPort_requis_alpha_sm <em>Port requis alpha sm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Interface_Security_ManagerImpl extends Interface_ComposantImpl implements Interface_Security_Manager {
	/**
	 * The cached value of the '{@link #getPort_fourni_sm_beta() <em>Port fourni sm beta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_fourni_sm_beta()
	 * @generated
	 * @ordered
	 */
	protected EList<Port_Fourni_SM_Beta> port_fourni_sm_beta;

	/**
	 * The cached value of the '{@link #getPort_requis_beta_sm() <em>Port requis beta sm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_requis_beta_sm()
	 * @generated
	 * @ordered
	 */
	protected EList<Port_Requis_Beta_SM> port_requis_beta_sm;

	/**
	 * The cached value of the '{@link #getPort_fourni_sm_alpha() <em>Port fourni sm alpha</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_fourni_sm_alpha()
	 * @generated
	 * @ordered
	 */
	protected EList<Port_Fourni_SM_Alpha> port_fourni_sm_alpha;

	/**
	 * The cached value of the '{@link #getPort_requis_alpha_sm() <em>Port requis alpha sm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_requis_alpha_sm()
	 * @generated
	 * @ordered
	 */
	protected EList<Port_Requis_Alpha_SM> port_requis_alpha_sm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Interface_Security_ManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.INTERFACE_SECURITY_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port_Fourni_SM_Beta> getPort_fourni_sm_beta() {
		if (port_fourni_sm_beta == null) {
			port_fourni_sm_beta = new EObjectContainmentEList<Port_Fourni_SM_Beta>(Port_Fourni_SM_Beta.class, this, Client_serveurPackage.INTERFACE_SECURITY_MANAGER__PORT_FOURNI_SM_BETA);
		}
		return port_fourni_sm_beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port_Requis_Beta_SM> getPort_requis_beta_sm() {
		if (port_requis_beta_sm == null) {
			port_requis_beta_sm = new EObjectContainmentEList<Port_Requis_Beta_SM>(Port_Requis_Beta_SM.class, this, Client_serveurPackage.INTERFACE_SECURITY_MANAGER__PORT_REQUIS_BETA_SM);
		}
		return port_requis_beta_sm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port_Fourni_SM_Alpha> getPort_fourni_sm_alpha() {
		if (port_fourni_sm_alpha == null) {
			port_fourni_sm_alpha = new EObjectContainmentEList<Port_Fourni_SM_Alpha>(Port_Fourni_SM_Alpha.class, this, Client_serveurPackage.INTERFACE_SECURITY_MANAGER__PORT_FOURNI_SM_ALPHA);
		}
		return port_fourni_sm_alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port_Requis_Alpha_SM> getPort_requis_alpha_sm() {
		if (port_requis_alpha_sm == null) {
			port_requis_alpha_sm = new EObjectContainmentEList<Port_Requis_Alpha_SM>(Port_Requis_Alpha_SM.class, this, Client_serveurPackage.INTERFACE_SECURITY_MANAGER__PORT_REQUIS_ALPHA_SM);
		}
		return port_requis_alpha_sm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.INTERFACE_SECURITY_MANAGER__PORT_FOURNI_SM_BETA:
				return ((InternalEList<?>)getPort_fourni_sm_beta()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.INTERFACE_SECURITY_MANAGER__PORT_REQUIS_BETA_SM:
				return ((InternalEList<?>)getPort_requis_beta_sm()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.INTERFACE_SECURITY_MANAGER__PORT_FOURNI_SM_ALPHA:
				return ((InternalEList<?>)getPort_fourni_sm_alpha()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.INTERFACE_SECURITY_MANAGER__PORT_REQUIS_ALPHA_SM:
				return ((InternalEList<?>)getPort_requis_alpha_sm()).basicRemove(otherEnd, msgs);
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
			case Client_serveurPackage.INTERFACE_SECURITY_MANAGER__PORT_FOURNI_SM_BETA:
				return getPort_fourni_sm_beta();
			case Client_serveurPackage.INTERFACE_SECURITY_MANAGER__PORT_REQUIS_BETA_SM:
				return getPort_requis_beta_sm();
			case Client_serveurPackage.INTERFACE_SECURITY_MANAGER__PORT_FOURNI_SM_ALPHA:
				return getPort_fourni_sm_alpha();
			case Client_serveurPackage.INTERFACE_SECURITY_MANAGER__PORT_REQUIS_ALPHA_SM:
				return getPort_requis_alpha_sm();
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
			case Client_serveurPackage.INTERFACE_SECURITY_MANAGER__PORT_FOURNI_SM_BETA:
				getPort_fourni_sm_beta().clear();
				getPort_fourni_sm_beta().addAll((Collection<? extends Port_Fourni_SM_Beta>)newValue);
				return;
			case Client_serveurPackage.INTERFACE_SECURITY_MANAGER__PORT_REQUIS_BETA_SM:
				getPort_requis_beta_sm().clear();
				getPort_requis_beta_sm().addAll((Collection<? extends Port_Requis_Beta_SM>)newValue);
				return;
			case Client_serveurPackage.INTERFACE_SECURITY_MANAGER__PORT_FOURNI_SM_ALPHA:
				getPort_fourni_sm_alpha().clear();
				getPort_fourni_sm_alpha().addAll((Collection<? extends Port_Fourni_SM_Alpha>)newValue);
				return;
			case Client_serveurPackage.INTERFACE_SECURITY_MANAGER__PORT_REQUIS_ALPHA_SM:
				getPort_requis_alpha_sm().clear();
				getPort_requis_alpha_sm().addAll((Collection<? extends Port_Requis_Alpha_SM>)newValue);
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
			case Client_serveurPackage.INTERFACE_SECURITY_MANAGER__PORT_FOURNI_SM_BETA:
				getPort_fourni_sm_beta().clear();
				return;
			case Client_serveurPackage.INTERFACE_SECURITY_MANAGER__PORT_REQUIS_BETA_SM:
				getPort_requis_beta_sm().clear();
				return;
			case Client_serveurPackage.INTERFACE_SECURITY_MANAGER__PORT_FOURNI_SM_ALPHA:
				getPort_fourni_sm_alpha().clear();
				return;
			case Client_serveurPackage.INTERFACE_SECURITY_MANAGER__PORT_REQUIS_ALPHA_SM:
				getPort_requis_alpha_sm().clear();
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
			case Client_serveurPackage.INTERFACE_SECURITY_MANAGER__PORT_FOURNI_SM_BETA:
				return port_fourni_sm_beta != null && !port_fourni_sm_beta.isEmpty();
			case Client_serveurPackage.INTERFACE_SECURITY_MANAGER__PORT_REQUIS_BETA_SM:
				return port_requis_beta_sm != null && !port_requis_beta_sm.isEmpty();
			case Client_serveurPackage.INTERFACE_SECURITY_MANAGER__PORT_FOURNI_SM_ALPHA:
				return port_fourni_sm_alpha != null && !port_fourni_sm_alpha.isEmpty();
			case Client_serveurPackage.INTERFACE_SECURITY_MANAGER__PORT_REQUIS_ALPHA_SM:
				return port_requis_alpha_sm != null && !port_requis_alpha_sm.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Interface_Security_ManagerImpl
