/**
 */
package client_serveur.impl;

import client_serveur.Beta;
import client_serveur.Client_serveurPackage;
import client_serveur.Interface_Beta;

import cosa.impl.ConnecteurImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Beta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.BetaImpl#getInterface_beta <em>Interface beta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BetaImpl extends ConnecteurImpl implements Beta {
	/**
	 * The cached value of the '{@link #getInterface_beta() <em>Interface beta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface_beta()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface_Beta> interface_beta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.BETA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface_Beta> getInterface_beta() {
		if (interface_beta == null) {
			interface_beta = new EObjectContainmentEList<Interface_Beta>(Interface_Beta.class, this, Client_serveurPackage.BETA__INTERFACE_BETA);
		}
		return interface_beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.BETA__INTERFACE_BETA:
				return ((InternalEList<?>)getInterface_beta()).basicRemove(otherEnd, msgs);
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
			case Client_serveurPackage.BETA__INTERFACE_BETA:
				return getInterface_beta();
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
			case Client_serveurPackage.BETA__INTERFACE_BETA:
				getInterface_beta().clear();
				getInterface_beta().addAll((Collection<? extends Interface_Beta>)newValue);
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
			case Client_serveurPackage.BETA__INTERFACE_BETA:
				getInterface_beta().clear();
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
			case Client_serveurPackage.BETA__INTERFACE_BETA:
				return interface_beta != null && !interface_beta.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BetaImpl
