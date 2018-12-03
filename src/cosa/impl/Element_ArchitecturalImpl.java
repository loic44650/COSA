/**
 */
package cosa.impl;

import cosa.Contraintes;
import cosa.CosaPackage;
import cosa.Element_Architectural;
import cosa.Interface;
import cosa.Proprietes;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Architectural</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosa.impl.Element_ArchitecturalImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link cosa.impl.Element_ArchitecturalImpl#getProprietes <em>Proprietes</em>}</li>
 *   <li>{@link cosa.impl.Element_ArchitecturalImpl#getContraintes <em>Contraintes</em>}</li>
 *   <li>{@link cosa.impl.Element_ArchitecturalImpl#getElement_architectural <em>Element architectural</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Element_ArchitecturalImpl extends MinimalEObjectImpl.Container implements Element_Architectural {
	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interface_;

	/**
	 * The cached value of the '{@link #getProprietes() <em>Proprietes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProprietes()
	 * @generated
	 * @ordered
	 */
	protected EList<Proprietes> proprietes;

	/**
	 * The cached value of the '{@link #getContraintes() <em>Contraintes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraintes()
	 * @generated
	 * @ordered
	 */
	protected EList<Contraintes> contraintes;

	/**
	 * The cached value of the '{@link #getElement_architectural() <em>Element architectural</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement_architectural()
	 * @generated
	 * @ordered
	 */
	protected EList<Element_Architectural> element_architectural;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Element_ArchitecturalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaPackage.Literals.ELEMENT_ARCHITECTURAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInterface() {
		if (interface_ == null) {
			interface_ = new EObjectContainmentEList<Interface>(Interface.class, this, CosaPackage.ELEMENT_ARCHITECTURAL__INTERFACE);
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Proprietes> getProprietes() {
		if (proprietes == null) {
			proprietes = new EObjectContainmentEList<Proprietes>(Proprietes.class, this, CosaPackage.ELEMENT_ARCHITECTURAL__PROPRIETES);
		}
		return proprietes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contraintes> getContraintes() {
		if (contraintes == null) {
			contraintes = new EObjectContainmentEList<Contraintes>(Contraintes.class, this, CosaPackage.ELEMENT_ARCHITECTURAL__CONTRAINTES);
		}
		return contraintes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element_Architectural> getElement_architectural() {
		if (element_architectural == null) {
			element_architectural = new EObjectContainmentEList<Element_Architectural>(Element_Architectural.class, this, CosaPackage.ELEMENT_ARCHITECTURAL__ELEMENT_ARCHITECTURAL);
		}
		return element_architectural;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CosaPackage.ELEMENT_ARCHITECTURAL__INTERFACE:
				return ((InternalEList<?>)getInterface()).basicRemove(otherEnd, msgs);
			case CosaPackage.ELEMENT_ARCHITECTURAL__PROPRIETES:
				return ((InternalEList<?>)getProprietes()).basicRemove(otherEnd, msgs);
			case CosaPackage.ELEMENT_ARCHITECTURAL__CONTRAINTES:
				return ((InternalEList<?>)getContraintes()).basicRemove(otherEnd, msgs);
			case CosaPackage.ELEMENT_ARCHITECTURAL__ELEMENT_ARCHITECTURAL:
				return ((InternalEList<?>)getElement_architectural()).basicRemove(otherEnd, msgs);
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
			case CosaPackage.ELEMENT_ARCHITECTURAL__INTERFACE:
				return getInterface();
			case CosaPackage.ELEMENT_ARCHITECTURAL__PROPRIETES:
				return getProprietes();
			case CosaPackage.ELEMENT_ARCHITECTURAL__CONTRAINTES:
				return getContraintes();
			case CosaPackage.ELEMENT_ARCHITECTURAL__ELEMENT_ARCHITECTURAL:
				return getElement_architectural();
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
			case CosaPackage.ELEMENT_ARCHITECTURAL__INTERFACE:
				getInterface().clear();
				getInterface().addAll((Collection<? extends Interface>)newValue);
				return;
			case CosaPackage.ELEMENT_ARCHITECTURAL__PROPRIETES:
				getProprietes().clear();
				getProprietes().addAll((Collection<? extends Proprietes>)newValue);
				return;
			case CosaPackage.ELEMENT_ARCHITECTURAL__CONTRAINTES:
				getContraintes().clear();
				getContraintes().addAll((Collection<? extends Contraintes>)newValue);
				return;
			case CosaPackage.ELEMENT_ARCHITECTURAL__ELEMENT_ARCHITECTURAL:
				getElement_architectural().clear();
				getElement_architectural().addAll((Collection<? extends Element_Architectural>)newValue);
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
			case CosaPackage.ELEMENT_ARCHITECTURAL__INTERFACE:
				getInterface().clear();
				return;
			case CosaPackage.ELEMENT_ARCHITECTURAL__PROPRIETES:
				getProprietes().clear();
				return;
			case CosaPackage.ELEMENT_ARCHITECTURAL__CONTRAINTES:
				getContraintes().clear();
				return;
			case CosaPackage.ELEMENT_ARCHITECTURAL__ELEMENT_ARCHITECTURAL:
				getElement_architectural().clear();
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
			case CosaPackage.ELEMENT_ARCHITECTURAL__INTERFACE:
				return interface_ != null && !interface_.isEmpty();
			case CosaPackage.ELEMENT_ARCHITECTURAL__PROPRIETES:
				return proprietes != null && !proprietes.isEmpty();
			case CosaPackage.ELEMENT_ARCHITECTURAL__CONTRAINTES:
				return contraintes != null && !contraintes.isEmpty();
			case CosaPackage.ELEMENT_ARCHITECTURAL__ELEMENT_ARCHITECTURAL:
				return element_architectural != null && !element_architectural.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Element_ArchitecturalImpl
