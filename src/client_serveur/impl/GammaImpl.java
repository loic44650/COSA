/**
 */
package client_serveur.impl;

import client_serveur.Client_serveurPackage;
import client_serveur.Gamma;
import client_serveur.Interface_Gamma;

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
 * An implementation of the model object '<em><b>Gamma</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.GammaImpl#getInterface_gamma <em>Interface gamma</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GammaImpl extends ConnecteurImpl implements Gamma {
	/**
	 * The cached value of the '{@link #getInterface_gamma() <em>Interface gamma</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface_gamma()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface_Gamma> interface_gamma;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GammaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.GAMMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface_Gamma> getInterface_gamma() {
		if (interface_gamma == null) {
			interface_gamma = new EObjectContainmentEList<Interface_Gamma>(Interface_Gamma.class, this, Client_serveurPackage.GAMMA__INTERFACE_GAMMA);
		}
		return interface_gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.GAMMA__INTERFACE_GAMMA:
				return ((InternalEList<?>)getInterface_gamma()).basicRemove(otherEnd, msgs);
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
			case Client_serveurPackage.GAMMA__INTERFACE_GAMMA:
				return getInterface_gamma();
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
			case Client_serveurPackage.GAMMA__INTERFACE_GAMMA:
				getInterface_gamma().clear();
				getInterface_gamma().addAll((Collection<? extends Interface_Gamma>)newValue);
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
			case Client_serveurPackage.GAMMA__INTERFACE_GAMMA:
				getInterface_gamma().clear();
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
			case Client_serveurPackage.GAMMA__INTERFACE_GAMMA:
				return interface_gamma != null && !interface_gamma.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GammaImpl
