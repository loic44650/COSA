/**
 */
package client_serveur.impl;

import client_serveur.Alpha;
import client_serveur.Client_serveurPackage;
import client_serveur.Interface_Alpha;

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
 * An implementation of the model object '<em><b>Alpha</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.AlphaImpl#getInterface_alpha <em>Interface alpha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlphaImpl extends ConnecteurImpl implements Alpha {
	/**
	 * The cached value of the '{@link #getInterface_alpha() <em>Interface alpha</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface_alpha()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface_Alpha> interface_alpha;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlphaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.ALPHA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface_Alpha> getInterface_alpha() {
		if (interface_alpha == null) {
			interface_alpha = new EObjectContainmentEList<Interface_Alpha>(Interface_Alpha.class, this, Client_serveurPackage.ALPHA__INTERFACE_ALPHA);
		}
		return interface_alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.ALPHA__INTERFACE_ALPHA:
				return ((InternalEList<?>)getInterface_alpha()).basicRemove(otherEnd, msgs);
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
			case Client_serveurPackage.ALPHA__INTERFACE_ALPHA:
				return getInterface_alpha();
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
			case Client_serveurPackage.ALPHA__INTERFACE_ALPHA:
				getInterface_alpha().clear();
				getInterface_alpha().addAll((Collection<? extends Interface_Alpha>)newValue);
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
			case Client_serveurPackage.ALPHA__INTERFACE_ALPHA:
				getInterface_alpha().clear();
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
			case Client_serveurPackage.ALPHA__INTERFACE_ALPHA:
				return interface_alpha != null && !interface_alpha.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AlphaImpl
