/**
 */
package cosa.impl;

import cosa.CosaPackage;
import cosa.Interface_Connecteur;
import cosa.Role;
import cosa.Service_Connecteur;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Connecteur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosa.impl.Service_ConnecteurImpl#getInterface_connecteur <em>Interface connecteur</em>}</li>
 *   <li>{@link cosa.impl.Service_ConnecteurImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Service_ConnecteurImpl extends Interface_ConnecteurImpl implements Service_Connecteur {
	/**
	 * The cached value of the '{@link #getInterface_connecteur() <em>Interface connecteur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface_connecteur()
	 * @generated
	 * @ordered
	 */
	protected Interface_Connecteur interface_connecteur;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> role;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Service_ConnecteurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaPackage.Literals.SERVICE_CONNECTEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface_Connecteur getInterface_connecteur() {
		if (interface_connecteur != null && interface_connecteur.eIsProxy()) {
			InternalEObject oldInterface_connecteur = (InternalEObject)interface_connecteur;
			interface_connecteur = (Interface_Connecteur)eResolveProxy(oldInterface_connecteur);
			if (interface_connecteur != oldInterface_connecteur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CosaPackage.SERVICE_CONNECTEUR__INTERFACE_CONNECTEUR, oldInterface_connecteur, interface_connecteur));
			}
		}
		return interface_connecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface_Connecteur basicGetInterface_connecteur() {
		return interface_connecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface_connecteur(Interface_Connecteur newInterface_connecteur) {
		Interface_Connecteur oldInterface_connecteur = interface_connecteur;
		interface_connecteur = newInterface_connecteur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaPackage.SERVICE_CONNECTEUR__INTERFACE_CONNECTEUR, oldInterface_connecteur, interface_connecteur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRole() {
		if (role == null) {
			role = new EObjectResolvingEList<Role>(Role.class, this, CosaPackage.SERVICE_CONNECTEUR__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CosaPackage.SERVICE_CONNECTEUR__INTERFACE_CONNECTEUR:
				if (resolve) return getInterface_connecteur();
				return basicGetInterface_connecteur();
			case CosaPackage.SERVICE_CONNECTEUR__ROLE:
				return getRole();
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
			case CosaPackage.SERVICE_CONNECTEUR__INTERFACE_CONNECTEUR:
				setInterface_connecteur((Interface_Connecteur)newValue);
				return;
			case CosaPackage.SERVICE_CONNECTEUR__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends Role>)newValue);
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
			case CosaPackage.SERVICE_CONNECTEUR__INTERFACE_CONNECTEUR:
				setInterface_connecteur((Interface_Connecteur)null);
				return;
			case CosaPackage.SERVICE_CONNECTEUR__ROLE:
				getRole().clear();
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
			case CosaPackage.SERVICE_CONNECTEUR__INTERFACE_CONNECTEUR:
				return interface_connecteur != null;
			case CosaPackage.SERVICE_CONNECTEUR__ROLE:
				return role != null && !role.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Service_ConnecteurImpl
