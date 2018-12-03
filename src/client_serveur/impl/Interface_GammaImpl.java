/**
 */
package client_serveur.impl;

import client_serveur.Client_serveurPackage;
import client_serveur.Interface_Gamma;
import client_serveur.Role_Fourni_Gamma_CM;
import client_serveur.Role_Fourni_Gamma_DB;
import client_serveur.Role_Requis_CM_Gamma;
import client_serveur.Role_Requis_DB_Gamma;

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
 * An implementation of the model object '<em><b>Interface Gamma</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Interface_GammaImpl#getRole_requis_cm_gamma <em>Role requis cm gamma</em>}</li>
 *   <li>{@link client_serveur.impl.Interface_GammaImpl#getRole_fourni_gamma_cm <em>Role fourni gamma cm</em>}</li>
 *   <li>{@link client_serveur.impl.Interface_GammaImpl#getRole_requis_db_gamma <em>Role requis db gamma</em>}</li>
 *   <li>{@link client_serveur.impl.Interface_GammaImpl#getRole_fourni_gamma_db <em>Role fourni gamma db</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Interface_GammaImpl extends Interface_ConnecteurImpl implements Interface_Gamma {
	/**
	 * The cached value of the '{@link #getRole_requis_cm_gamma() <em>Role requis cm gamma</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_requis_cm_gamma()
	 * @generated
	 * @ordered
	 */
	protected EList<Role_Requis_CM_Gamma> role_requis_cm_gamma;

	/**
	 * The cached value of the '{@link #getRole_fourni_gamma_cm() <em>Role fourni gamma cm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_fourni_gamma_cm()
	 * @generated
	 * @ordered
	 */
	protected EList<Role_Fourni_Gamma_CM> role_fourni_gamma_cm;

	/**
	 * The cached value of the '{@link #getRole_requis_db_gamma() <em>Role requis db gamma</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_requis_db_gamma()
	 * @generated
	 * @ordered
	 */
	protected EList<Role_Requis_DB_Gamma> role_requis_db_gamma;

	/**
	 * The cached value of the '{@link #getRole_fourni_gamma_db() <em>Role fourni gamma db</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_fourni_gamma_db()
	 * @generated
	 * @ordered
	 */
	protected EList<Role_Fourni_Gamma_DB> role_fourni_gamma_db;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Interface_GammaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.INTERFACE_GAMMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role_Requis_CM_Gamma> getRole_requis_cm_gamma() {
		if (role_requis_cm_gamma == null) {
			role_requis_cm_gamma = new EObjectContainmentEList<Role_Requis_CM_Gamma>(Role_Requis_CM_Gamma.class, this, Client_serveurPackage.INTERFACE_GAMMA__ROLE_REQUIS_CM_GAMMA);
		}
		return role_requis_cm_gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role_Fourni_Gamma_CM> getRole_fourni_gamma_cm() {
		if (role_fourni_gamma_cm == null) {
			role_fourni_gamma_cm = new EObjectContainmentEList<Role_Fourni_Gamma_CM>(Role_Fourni_Gamma_CM.class, this, Client_serveurPackage.INTERFACE_GAMMA__ROLE_FOURNI_GAMMA_CM);
		}
		return role_fourni_gamma_cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role_Requis_DB_Gamma> getRole_requis_db_gamma() {
		if (role_requis_db_gamma == null) {
			role_requis_db_gamma = new EObjectContainmentEList<Role_Requis_DB_Gamma>(Role_Requis_DB_Gamma.class, this, Client_serveurPackage.INTERFACE_GAMMA__ROLE_REQUIS_DB_GAMMA);
		}
		return role_requis_db_gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role_Fourni_Gamma_DB> getRole_fourni_gamma_db() {
		if (role_fourni_gamma_db == null) {
			role_fourni_gamma_db = new EObjectContainmentEList<Role_Fourni_Gamma_DB>(Role_Fourni_Gamma_DB.class, this, Client_serveurPackage.INTERFACE_GAMMA__ROLE_FOURNI_GAMMA_DB);
		}
		return role_fourni_gamma_db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.INTERFACE_GAMMA__ROLE_REQUIS_CM_GAMMA:
				return ((InternalEList<?>)getRole_requis_cm_gamma()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.INTERFACE_GAMMA__ROLE_FOURNI_GAMMA_CM:
				return ((InternalEList<?>)getRole_fourni_gamma_cm()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.INTERFACE_GAMMA__ROLE_REQUIS_DB_GAMMA:
				return ((InternalEList<?>)getRole_requis_db_gamma()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.INTERFACE_GAMMA__ROLE_FOURNI_GAMMA_DB:
				return ((InternalEList<?>)getRole_fourni_gamma_db()).basicRemove(otherEnd, msgs);
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
			case Client_serveurPackage.INTERFACE_GAMMA__ROLE_REQUIS_CM_GAMMA:
				return getRole_requis_cm_gamma();
			case Client_serveurPackage.INTERFACE_GAMMA__ROLE_FOURNI_GAMMA_CM:
				return getRole_fourni_gamma_cm();
			case Client_serveurPackage.INTERFACE_GAMMA__ROLE_REQUIS_DB_GAMMA:
				return getRole_requis_db_gamma();
			case Client_serveurPackage.INTERFACE_GAMMA__ROLE_FOURNI_GAMMA_DB:
				return getRole_fourni_gamma_db();
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
			case Client_serveurPackage.INTERFACE_GAMMA__ROLE_REQUIS_CM_GAMMA:
				getRole_requis_cm_gamma().clear();
				getRole_requis_cm_gamma().addAll((Collection<? extends Role_Requis_CM_Gamma>)newValue);
				return;
			case Client_serveurPackage.INTERFACE_GAMMA__ROLE_FOURNI_GAMMA_CM:
				getRole_fourni_gamma_cm().clear();
				getRole_fourni_gamma_cm().addAll((Collection<? extends Role_Fourni_Gamma_CM>)newValue);
				return;
			case Client_serveurPackage.INTERFACE_GAMMA__ROLE_REQUIS_DB_GAMMA:
				getRole_requis_db_gamma().clear();
				getRole_requis_db_gamma().addAll((Collection<? extends Role_Requis_DB_Gamma>)newValue);
				return;
			case Client_serveurPackage.INTERFACE_GAMMA__ROLE_FOURNI_GAMMA_DB:
				getRole_fourni_gamma_db().clear();
				getRole_fourni_gamma_db().addAll((Collection<? extends Role_Fourni_Gamma_DB>)newValue);
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
			case Client_serveurPackage.INTERFACE_GAMMA__ROLE_REQUIS_CM_GAMMA:
				getRole_requis_cm_gamma().clear();
				return;
			case Client_serveurPackage.INTERFACE_GAMMA__ROLE_FOURNI_GAMMA_CM:
				getRole_fourni_gamma_cm().clear();
				return;
			case Client_serveurPackage.INTERFACE_GAMMA__ROLE_REQUIS_DB_GAMMA:
				getRole_requis_db_gamma().clear();
				return;
			case Client_serveurPackage.INTERFACE_GAMMA__ROLE_FOURNI_GAMMA_DB:
				getRole_fourni_gamma_db().clear();
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
			case Client_serveurPackage.INTERFACE_GAMMA__ROLE_REQUIS_CM_GAMMA:
				return role_requis_cm_gamma != null && !role_requis_cm_gamma.isEmpty();
			case Client_serveurPackage.INTERFACE_GAMMA__ROLE_FOURNI_GAMMA_CM:
				return role_fourni_gamma_cm != null && !role_fourni_gamma_cm.isEmpty();
			case Client_serveurPackage.INTERFACE_GAMMA__ROLE_REQUIS_DB_GAMMA:
				return role_requis_db_gamma != null && !role_requis_db_gamma.isEmpty();
			case Client_serveurPackage.INTERFACE_GAMMA__ROLE_FOURNI_GAMMA_DB:
				return role_fourni_gamma_db != null && !role_fourni_gamma_db.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Interface_GammaImpl
