/**
 */
package client_serveur.impl;

import client_serveur.Client_serveurPackage;
import client_serveur.Interface_Alpha;
import client_serveur.Role_Fourni_Alpha_CM;
import client_serveur.Role_Fourni_Alpha_SM;
import client_serveur.Role_Requis_CM_Alpha;
import client_serveur.Role_Requis_SM_Alpha;

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
 * An implementation of the model object '<em><b>Interface Alpha</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Interface_AlphaImpl#getRole_fourni_alpha_sm <em>Role fourni alpha sm</em>}</li>
 *   <li>{@link client_serveur.impl.Interface_AlphaImpl#getRole_requis_sm_alpha <em>Role requis sm alpha</em>}</li>
 *   <li>{@link client_serveur.impl.Interface_AlphaImpl#getRole_requis_cm_alpha <em>Role requis cm alpha</em>}</li>
 *   <li>{@link client_serveur.impl.Interface_AlphaImpl#getRole_fourni_alpha_cm <em>Role fourni alpha cm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Interface_AlphaImpl extends Interface_ConnecteurImpl implements Interface_Alpha {
	/**
	 * The cached value of the '{@link #getRole_fourni_alpha_sm() <em>Role fourni alpha sm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_fourni_alpha_sm()
	 * @generated
	 * @ordered
	 */
	protected EList<Role_Fourni_Alpha_SM> role_fourni_alpha_sm;

	/**
	 * The cached value of the '{@link #getRole_requis_sm_alpha() <em>Role requis sm alpha</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_requis_sm_alpha()
	 * @generated
	 * @ordered
	 */
	protected EList<Role_Requis_SM_Alpha> role_requis_sm_alpha;

	/**
	 * The cached value of the '{@link #getRole_requis_cm_alpha() <em>Role requis cm alpha</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_requis_cm_alpha()
	 * @generated
	 * @ordered
	 */
	protected EList<Role_Requis_CM_Alpha> role_requis_cm_alpha;

	/**
	 * The cached value of the '{@link #getRole_fourni_alpha_cm() <em>Role fourni alpha cm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_fourni_alpha_cm()
	 * @generated
	 * @ordered
	 */
	protected EList<Role_Fourni_Alpha_CM> role_fourni_alpha_cm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Interface_AlphaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.INTERFACE_ALPHA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role_Fourni_Alpha_SM> getRole_fourni_alpha_sm() {
		if (role_fourni_alpha_sm == null) {
			role_fourni_alpha_sm = new EObjectContainmentEList<Role_Fourni_Alpha_SM>(Role_Fourni_Alpha_SM.class, this, Client_serveurPackage.INTERFACE_ALPHA__ROLE_FOURNI_ALPHA_SM);
		}
		return role_fourni_alpha_sm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role_Requis_SM_Alpha> getRole_requis_sm_alpha() {
		if (role_requis_sm_alpha == null) {
			role_requis_sm_alpha = new EObjectContainmentEList<Role_Requis_SM_Alpha>(Role_Requis_SM_Alpha.class, this, Client_serveurPackage.INTERFACE_ALPHA__ROLE_REQUIS_SM_ALPHA);
		}
		return role_requis_sm_alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role_Requis_CM_Alpha> getRole_requis_cm_alpha() {
		if (role_requis_cm_alpha == null) {
			role_requis_cm_alpha = new EObjectContainmentEList<Role_Requis_CM_Alpha>(Role_Requis_CM_Alpha.class, this, Client_serveurPackage.INTERFACE_ALPHA__ROLE_REQUIS_CM_ALPHA);
		}
		return role_requis_cm_alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role_Fourni_Alpha_CM> getRole_fourni_alpha_cm() {
		if (role_fourni_alpha_cm == null) {
			role_fourni_alpha_cm = new EObjectContainmentEList<Role_Fourni_Alpha_CM>(Role_Fourni_Alpha_CM.class, this, Client_serveurPackage.INTERFACE_ALPHA__ROLE_FOURNI_ALPHA_CM);
		}
		return role_fourni_alpha_cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.INTERFACE_ALPHA__ROLE_FOURNI_ALPHA_SM:
				return ((InternalEList<?>)getRole_fourni_alpha_sm()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.INTERFACE_ALPHA__ROLE_REQUIS_SM_ALPHA:
				return ((InternalEList<?>)getRole_requis_sm_alpha()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.INTERFACE_ALPHA__ROLE_REQUIS_CM_ALPHA:
				return ((InternalEList<?>)getRole_requis_cm_alpha()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.INTERFACE_ALPHA__ROLE_FOURNI_ALPHA_CM:
				return ((InternalEList<?>)getRole_fourni_alpha_cm()).basicRemove(otherEnd, msgs);
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
			case Client_serveurPackage.INTERFACE_ALPHA__ROLE_FOURNI_ALPHA_SM:
				return getRole_fourni_alpha_sm();
			case Client_serveurPackage.INTERFACE_ALPHA__ROLE_REQUIS_SM_ALPHA:
				return getRole_requis_sm_alpha();
			case Client_serveurPackage.INTERFACE_ALPHA__ROLE_REQUIS_CM_ALPHA:
				return getRole_requis_cm_alpha();
			case Client_serveurPackage.INTERFACE_ALPHA__ROLE_FOURNI_ALPHA_CM:
				return getRole_fourni_alpha_cm();
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
			case Client_serveurPackage.INTERFACE_ALPHA__ROLE_FOURNI_ALPHA_SM:
				getRole_fourni_alpha_sm().clear();
				getRole_fourni_alpha_sm().addAll((Collection<? extends Role_Fourni_Alpha_SM>)newValue);
				return;
			case Client_serveurPackage.INTERFACE_ALPHA__ROLE_REQUIS_SM_ALPHA:
				getRole_requis_sm_alpha().clear();
				getRole_requis_sm_alpha().addAll((Collection<? extends Role_Requis_SM_Alpha>)newValue);
				return;
			case Client_serveurPackage.INTERFACE_ALPHA__ROLE_REQUIS_CM_ALPHA:
				getRole_requis_cm_alpha().clear();
				getRole_requis_cm_alpha().addAll((Collection<? extends Role_Requis_CM_Alpha>)newValue);
				return;
			case Client_serveurPackage.INTERFACE_ALPHA__ROLE_FOURNI_ALPHA_CM:
				getRole_fourni_alpha_cm().clear();
				getRole_fourni_alpha_cm().addAll((Collection<? extends Role_Fourni_Alpha_CM>)newValue);
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
			case Client_serveurPackage.INTERFACE_ALPHA__ROLE_FOURNI_ALPHA_SM:
				getRole_fourni_alpha_sm().clear();
				return;
			case Client_serveurPackage.INTERFACE_ALPHA__ROLE_REQUIS_SM_ALPHA:
				getRole_requis_sm_alpha().clear();
				return;
			case Client_serveurPackage.INTERFACE_ALPHA__ROLE_REQUIS_CM_ALPHA:
				getRole_requis_cm_alpha().clear();
				return;
			case Client_serveurPackage.INTERFACE_ALPHA__ROLE_FOURNI_ALPHA_CM:
				getRole_fourni_alpha_cm().clear();
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
			case Client_serveurPackage.INTERFACE_ALPHA__ROLE_FOURNI_ALPHA_SM:
				return role_fourni_alpha_sm != null && !role_fourni_alpha_sm.isEmpty();
			case Client_serveurPackage.INTERFACE_ALPHA__ROLE_REQUIS_SM_ALPHA:
				return role_requis_sm_alpha != null && !role_requis_sm_alpha.isEmpty();
			case Client_serveurPackage.INTERFACE_ALPHA__ROLE_REQUIS_CM_ALPHA:
				return role_requis_cm_alpha != null && !role_requis_cm_alpha.isEmpty();
			case Client_serveurPackage.INTERFACE_ALPHA__ROLE_FOURNI_ALPHA_CM:
				return role_fourni_alpha_cm != null && !role_fourni_alpha_cm.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Interface_AlphaImpl
