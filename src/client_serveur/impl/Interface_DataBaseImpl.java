/**
 */
package client_serveur.impl;

import client_serveur.Client_serveurPackage;
import client_serveur.Interface_DataBase;
import client_serveur.Port_Fourni_DB_Beta;
import client_serveur.Port_Fourni_DB_Gamma;
import client_serveur.Port_Requis_Beta_DB;
import client_serveur.Port_Requis_Gamma_DB;

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
 * An implementation of the model object '<em><b>Interface Data Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Interface_DataBaseImpl#getPort_fourni_db_gamma <em>Port fourni db gamma</em>}</li>
 *   <li>{@link client_serveur.impl.Interface_DataBaseImpl#getPort_requis_gamma_db <em>Port requis gamma db</em>}</li>
 *   <li>{@link client_serveur.impl.Interface_DataBaseImpl#getPort_fourni_db_beta <em>Port fourni db beta</em>}</li>
 *   <li>{@link client_serveur.impl.Interface_DataBaseImpl#getPort_requis_beta_db <em>Port requis beta db</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Interface_DataBaseImpl extends Interface_ComposantImpl implements Interface_DataBase {
	/**
	 * The cached value of the '{@link #getPort_fourni_db_gamma() <em>Port fourni db gamma</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_fourni_db_gamma()
	 * @generated
	 * @ordered
	 */
	protected EList<Port_Fourni_DB_Gamma> port_fourni_db_gamma;

	/**
	 * The cached value of the '{@link #getPort_requis_gamma_db() <em>Port requis gamma db</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_requis_gamma_db()
	 * @generated
	 * @ordered
	 */
	protected EList<Port_Requis_Gamma_DB> port_requis_gamma_db;

	/**
	 * The cached value of the '{@link #getPort_fourni_db_beta() <em>Port fourni db beta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_fourni_db_beta()
	 * @generated
	 * @ordered
	 */
	protected EList<Port_Fourni_DB_Beta> port_fourni_db_beta;

	/**
	 * The cached value of the '{@link #getPort_requis_beta_db() <em>Port requis beta db</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_requis_beta_db()
	 * @generated
	 * @ordered
	 */
	protected EList<Port_Requis_Beta_DB> port_requis_beta_db;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Interface_DataBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.INTERFACE_DATA_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port_Fourni_DB_Gamma> getPort_fourni_db_gamma() {
		if (port_fourni_db_gamma == null) {
			port_fourni_db_gamma = new EObjectContainmentEList<Port_Fourni_DB_Gamma>(Port_Fourni_DB_Gamma.class, this, Client_serveurPackage.INTERFACE_DATA_BASE__PORT_FOURNI_DB_GAMMA);
		}
		return port_fourni_db_gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port_Requis_Gamma_DB> getPort_requis_gamma_db() {
		if (port_requis_gamma_db == null) {
			port_requis_gamma_db = new EObjectContainmentEList<Port_Requis_Gamma_DB>(Port_Requis_Gamma_DB.class, this, Client_serveurPackage.INTERFACE_DATA_BASE__PORT_REQUIS_GAMMA_DB);
		}
		return port_requis_gamma_db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port_Fourni_DB_Beta> getPort_fourni_db_beta() {
		if (port_fourni_db_beta == null) {
			port_fourni_db_beta = new EObjectContainmentEList<Port_Fourni_DB_Beta>(Port_Fourni_DB_Beta.class, this, Client_serveurPackage.INTERFACE_DATA_BASE__PORT_FOURNI_DB_BETA);
		}
		return port_fourni_db_beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port_Requis_Beta_DB> getPort_requis_beta_db() {
		if (port_requis_beta_db == null) {
			port_requis_beta_db = new EObjectContainmentEList<Port_Requis_Beta_DB>(Port_Requis_Beta_DB.class, this, Client_serveurPackage.INTERFACE_DATA_BASE__PORT_REQUIS_BETA_DB);
		}
		return port_requis_beta_db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.INTERFACE_DATA_BASE__PORT_FOURNI_DB_GAMMA:
				return ((InternalEList<?>)getPort_fourni_db_gamma()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.INTERFACE_DATA_BASE__PORT_REQUIS_GAMMA_DB:
				return ((InternalEList<?>)getPort_requis_gamma_db()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.INTERFACE_DATA_BASE__PORT_FOURNI_DB_BETA:
				return ((InternalEList<?>)getPort_fourni_db_beta()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.INTERFACE_DATA_BASE__PORT_REQUIS_BETA_DB:
				return ((InternalEList<?>)getPort_requis_beta_db()).basicRemove(otherEnd, msgs);
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
			case Client_serveurPackage.INTERFACE_DATA_BASE__PORT_FOURNI_DB_GAMMA:
				return getPort_fourni_db_gamma();
			case Client_serveurPackage.INTERFACE_DATA_BASE__PORT_REQUIS_GAMMA_DB:
				return getPort_requis_gamma_db();
			case Client_serveurPackage.INTERFACE_DATA_BASE__PORT_FOURNI_DB_BETA:
				return getPort_fourni_db_beta();
			case Client_serveurPackage.INTERFACE_DATA_BASE__PORT_REQUIS_BETA_DB:
				return getPort_requis_beta_db();
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
			case Client_serveurPackage.INTERFACE_DATA_BASE__PORT_FOURNI_DB_GAMMA:
				getPort_fourni_db_gamma().clear();
				getPort_fourni_db_gamma().addAll((Collection<? extends Port_Fourni_DB_Gamma>)newValue);
				return;
			case Client_serveurPackage.INTERFACE_DATA_BASE__PORT_REQUIS_GAMMA_DB:
				getPort_requis_gamma_db().clear();
				getPort_requis_gamma_db().addAll((Collection<? extends Port_Requis_Gamma_DB>)newValue);
				return;
			case Client_serveurPackage.INTERFACE_DATA_BASE__PORT_FOURNI_DB_BETA:
				getPort_fourni_db_beta().clear();
				getPort_fourni_db_beta().addAll((Collection<? extends Port_Fourni_DB_Beta>)newValue);
				return;
			case Client_serveurPackage.INTERFACE_DATA_BASE__PORT_REQUIS_BETA_DB:
				getPort_requis_beta_db().clear();
				getPort_requis_beta_db().addAll((Collection<? extends Port_Requis_Beta_DB>)newValue);
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
			case Client_serveurPackage.INTERFACE_DATA_BASE__PORT_FOURNI_DB_GAMMA:
				getPort_fourni_db_gamma().clear();
				return;
			case Client_serveurPackage.INTERFACE_DATA_BASE__PORT_REQUIS_GAMMA_DB:
				getPort_requis_gamma_db().clear();
				return;
			case Client_serveurPackage.INTERFACE_DATA_BASE__PORT_FOURNI_DB_BETA:
				getPort_fourni_db_beta().clear();
				return;
			case Client_serveurPackage.INTERFACE_DATA_BASE__PORT_REQUIS_BETA_DB:
				getPort_requis_beta_db().clear();
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
			case Client_serveurPackage.INTERFACE_DATA_BASE__PORT_FOURNI_DB_GAMMA:
				return port_fourni_db_gamma != null && !port_fourni_db_gamma.isEmpty();
			case Client_serveurPackage.INTERFACE_DATA_BASE__PORT_REQUIS_GAMMA_DB:
				return port_requis_gamma_db != null && !port_requis_gamma_db.isEmpty();
			case Client_serveurPackage.INTERFACE_DATA_BASE__PORT_FOURNI_DB_BETA:
				return port_fourni_db_beta != null && !port_fourni_db_beta.isEmpty();
			case Client_serveurPackage.INTERFACE_DATA_BASE__PORT_REQUIS_BETA_DB:
				return port_requis_beta_db != null && !port_requis_beta_db.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Interface_DataBaseImpl
