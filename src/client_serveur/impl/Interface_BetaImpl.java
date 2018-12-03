/**
 */
package client_serveur.impl;

import client_serveur.Client_serveurPackage;
import client_serveur.Interface_Beta;
import client_serveur.Role_Fourni_Beta_DB;
import client_serveur.Role_Fourni_Beta_SM;
import client_serveur.Role_Requis_DB_Beta;
import client_serveur.Role_Requis_SM_Beta;

import cosa.impl.Interface_ConnecteurImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Beta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Interface_BetaImpl#getRole_fourni_beta_sm <em>Role fourni beta sm</em>}</li>
 *   <li>{@link client_serveur.impl.Interface_BetaImpl#getRole_requis_sm_beta <em>Role requis sm beta</em>}</li>
 *   <li>{@link client_serveur.impl.Interface_BetaImpl#getRole_requis_db_beta <em>Role requis db beta</em>}</li>
 *   <li>{@link client_serveur.impl.Interface_BetaImpl#getRole_fourni_beta_db <em>Role fourni beta db</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Interface_BetaImpl extends Interface_ConnecteurImpl implements Interface_Beta {
	/**
	 * The cached value of the '{@link #getRole_fourni_beta_sm() <em>Role fourni beta sm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_fourni_beta_sm()
	 * @generated
	 * @ordered
	 */
	protected EList<Role_Fourni_Beta_SM> role_fourni_beta_sm;

	/**
	 * The cached value of the '{@link #getRole_requis_sm_beta() <em>Role requis sm beta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_requis_sm_beta()
	 * @generated
	 * @ordered
	 */
	protected EList<Role_Requis_SM_Beta> role_requis_sm_beta;

	/**
	 * The cached value of the '{@link #getRole_requis_db_beta() <em>Role requis db beta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_requis_db_beta()
	 * @generated
	 * @ordered
	 */
	protected EList<Role_Requis_DB_Beta> role_requis_db_beta;

	/**
	 * The cached value of the '{@link #getRole_fourni_beta_db() <em>Role fourni beta db</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_fourni_beta_db()
	 * @generated
	 * @ordered
	 */
	protected EList<Role_Fourni_Beta_DB> role_fourni_beta_db;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Interface_BetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.INTERFACE_BETA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role_Fourni_Beta_SM> getRole_fourni_beta_sm() {
		if (role_fourni_beta_sm == null) {
			role_fourni_beta_sm = new EObjectContainmentEList<Role_Fourni_Beta_SM>(Role_Fourni_Beta_SM.class, this, Client_serveurPackage.INTERFACE_BETA__ROLE_FOURNI_BETA_SM);
		}
		return role_fourni_beta_sm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role_Requis_SM_Beta> getRole_requis_sm_beta() {
		if (role_requis_sm_beta == null) {
			role_requis_sm_beta = new EObjectContainmentEList<Role_Requis_SM_Beta>(Role_Requis_SM_Beta.class, this, Client_serveurPackage.INTERFACE_BETA__ROLE_REQUIS_SM_BETA);
		}
		return role_requis_sm_beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role_Requis_DB_Beta> getRole_requis_db_beta() {
		if (role_requis_db_beta == null) {
			role_requis_db_beta = new EObjectContainmentEList<Role_Requis_DB_Beta>(Role_Requis_DB_Beta.class, this, Client_serveurPackage.INTERFACE_BETA__ROLE_REQUIS_DB_BETA);
		}
		return role_requis_db_beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role_Fourni_Beta_DB> getRole_fourni_beta_db() {
		if (role_fourni_beta_db == null) {
			role_fourni_beta_db = new EObjectContainmentEList<Role_Fourni_Beta_DB>(Role_Fourni_Beta_DB.class, this, Client_serveurPackage.INTERFACE_BETA__ROLE_FOURNI_BETA_DB);
		}
		return role_fourni_beta_db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.INTERFACE_BETA__ROLE_FOURNI_BETA_SM:
				return ((InternalEList<?>)getRole_fourni_beta_sm()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.INTERFACE_BETA__ROLE_REQUIS_SM_BETA:
				return ((InternalEList<?>)getRole_requis_sm_beta()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.INTERFACE_BETA__ROLE_REQUIS_DB_BETA:
				return ((InternalEList<?>)getRole_requis_db_beta()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.INTERFACE_BETA__ROLE_FOURNI_BETA_DB:
				return ((InternalEList<?>)getRole_fourni_beta_db()).basicRemove(otherEnd, msgs);
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
			case Client_serveurPackage.INTERFACE_BETA__ROLE_FOURNI_BETA_SM:
				return getRole_fourni_beta_sm();
			case Client_serveurPackage.INTERFACE_BETA__ROLE_REQUIS_SM_BETA:
				return getRole_requis_sm_beta();
			case Client_serveurPackage.INTERFACE_BETA__ROLE_REQUIS_DB_BETA:
				return getRole_requis_db_beta();
			case Client_serveurPackage.INTERFACE_BETA__ROLE_FOURNI_BETA_DB:
				return getRole_fourni_beta_db();
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
			case Client_serveurPackage.INTERFACE_BETA__ROLE_FOURNI_BETA_SM:
				getRole_fourni_beta_sm().clear();
				getRole_fourni_beta_sm().addAll((Collection<? extends Role_Fourni_Beta_SM>)newValue);
				return;
			case Client_serveurPackage.INTERFACE_BETA__ROLE_REQUIS_SM_BETA:
				getRole_requis_sm_beta().clear();
				getRole_requis_sm_beta().addAll((Collection<? extends Role_Requis_SM_Beta>)newValue);
				return;
			case Client_serveurPackage.INTERFACE_BETA__ROLE_REQUIS_DB_BETA:
				getRole_requis_db_beta().clear();
				getRole_requis_db_beta().addAll((Collection<? extends Role_Requis_DB_Beta>)newValue);
				return;
			case Client_serveurPackage.INTERFACE_BETA__ROLE_FOURNI_BETA_DB:
				getRole_fourni_beta_db().clear();
				getRole_fourni_beta_db().addAll((Collection<? extends Role_Fourni_Beta_DB>)newValue);
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
			case Client_serveurPackage.INTERFACE_BETA__ROLE_FOURNI_BETA_SM:
				getRole_fourni_beta_sm().clear();
				return;
			case Client_serveurPackage.INTERFACE_BETA__ROLE_REQUIS_SM_BETA:
				getRole_requis_sm_beta().clear();
				return;
			case Client_serveurPackage.INTERFACE_BETA__ROLE_REQUIS_DB_BETA:
				getRole_requis_db_beta().clear();
				return;
			case Client_serveurPackage.INTERFACE_BETA__ROLE_FOURNI_BETA_DB:
				getRole_fourni_beta_db().clear();
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
			case Client_serveurPackage.INTERFACE_BETA__ROLE_FOURNI_BETA_SM:
				return role_fourni_beta_sm != null && !role_fourni_beta_sm.isEmpty();
			case Client_serveurPackage.INTERFACE_BETA__ROLE_REQUIS_SM_BETA:
				return role_requis_sm_beta != null && !role_requis_sm_beta.isEmpty();
			case Client_serveurPackage.INTERFACE_BETA__ROLE_REQUIS_DB_BETA:
				return role_requis_db_beta != null && !role_requis_db_beta.isEmpty();
			case Client_serveurPackage.INTERFACE_BETA__ROLE_FOURNI_BETA_DB:
				return role_fourni_beta_db != null && !role_fourni_beta_db.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Interface_BetaImpl
