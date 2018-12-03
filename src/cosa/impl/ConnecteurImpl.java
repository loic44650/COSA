/**
 */
package cosa.impl;

import cosa.Connecteur;
import cosa.CosaPackage;
import cosa.Glu;
import cosa.Interface_Connecteur;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connecteur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosa.impl.ConnecteurImpl#getGlu <em>Glu</em>}</li>
 *   <li>{@link cosa.impl.ConnecteurImpl#getInterface_connecteur <em>Interface connecteur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnecteurImpl extends Element_ArchitecturalImpl implements Connecteur {
	/**
	 * The cached value of the '{@link #getGlu() <em>Glu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlu()
	 * @generated
	 * @ordered
	 */
	protected Glu glu;

	/**
	 * The cached value of the '{@link #getInterface_connecteur() <em>Interface connecteur</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface_connecteur()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface_Connecteur> interface_connecteur;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnecteurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaPackage.Literals.CONNECTEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glu getGlu() {
		return glu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlu(Glu newGlu, NotificationChain msgs) {
		Glu oldGlu = glu;
		glu = newGlu;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaPackage.CONNECTEUR__GLU, oldGlu, newGlu);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlu(Glu newGlu) {
		if (newGlu != glu) {
			NotificationChain msgs = null;
			if (glu != null)
				msgs = ((InternalEObject)glu).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaPackage.CONNECTEUR__GLU, null, msgs);
			if (newGlu != null)
				msgs = ((InternalEObject)newGlu).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaPackage.CONNECTEUR__GLU, null, msgs);
			msgs = basicSetGlu(newGlu, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaPackage.CONNECTEUR__GLU, newGlu, newGlu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface_Connecteur> getInterface_connecteur() {
		if (interface_connecteur == null) {
			interface_connecteur = new EObjectContainmentEList<Interface_Connecteur>(Interface_Connecteur.class, this, CosaPackage.CONNECTEUR__INTERFACE_CONNECTEUR);
		}
		return interface_connecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CosaPackage.CONNECTEUR__GLU:
				return basicSetGlu(null, msgs);
			case CosaPackage.CONNECTEUR__INTERFACE_CONNECTEUR:
				return ((InternalEList<?>)getInterface_connecteur()).basicRemove(otherEnd, msgs);
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
			case CosaPackage.CONNECTEUR__GLU:
				return getGlu();
			case CosaPackage.CONNECTEUR__INTERFACE_CONNECTEUR:
				return getInterface_connecteur();
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
			case CosaPackage.CONNECTEUR__GLU:
				setGlu((Glu)newValue);
				return;
			case CosaPackage.CONNECTEUR__INTERFACE_CONNECTEUR:
				getInterface_connecteur().clear();
				getInterface_connecteur().addAll((Collection<? extends Interface_Connecteur>)newValue);
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
			case CosaPackage.CONNECTEUR__GLU:
				setGlu((Glu)null);
				return;
			case CosaPackage.CONNECTEUR__INTERFACE_CONNECTEUR:
				getInterface_connecteur().clear();
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
			case CosaPackage.CONNECTEUR__GLU:
				return glu != null;
			case CosaPackage.CONNECTEUR__INTERFACE_CONNECTEUR:
				return interface_connecteur != null && !interface_connecteur.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnecteurImpl
