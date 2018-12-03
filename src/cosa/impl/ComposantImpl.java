/**
 */
package cosa.impl;

import cosa.Composant;
import cosa.CosaPackage;
import cosa.Interface_Composant;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosa.impl.ComposantImpl#getInterface_composant <em>Interface composant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComposantImpl extends Element_ArchitecturalImpl implements Composant {
	/**
	 * The cached value of the '{@link #getInterface_composant() <em>Interface composant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface_composant()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface_Composant> interface_composant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaPackage.Literals.COMPOSANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface_Composant> getInterface_composant() {
		if (interface_composant == null) {
			interface_composant = new EObjectContainmentEList<Interface_Composant>(Interface_Composant.class, this, CosaPackage.COMPOSANT__INTERFACE_COMPOSANT);
		}
		return interface_composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CosaPackage.COMPOSANT__INTERFACE_COMPOSANT:
				return ((InternalEList<?>)getInterface_composant()).basicRemove(otherEnd, msgs);
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
			case CosaPackage.COMPOSANT__INTERFACE_COMPOSANT:
				return getInterface_composant();
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
			case CosaPackage.COMPOSANT__INTERFACE_COMPOSANT:
				getInterface_composant().clear();
				getInterface_composant().addAll((Collection<? extends Interface_Composant>)newValue);
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
			case CosaPackage.COMPOSANT__INTERFACE_COMPOSANT:
				getInterface_composant().clear();
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
			case CosaPackage.COMPOSANT__INTERFACE_COMPOSANT:
				return interface_composant != null && !interface_composant.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComposantImpl
