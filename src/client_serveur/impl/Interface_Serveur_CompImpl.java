/**
 */
package client_serveur.impl;

import client_serveur.Client_serveurPackage;
import client_serveur.Interface_Serveur_Comp;
import client_serveur.Port_Fourni_Serveur;
import client_serveur.Port_Requis_Serveur;
import client_serveur.Port_Serveur_Comp_CM;
import client_serveur.Port_Serveur_Comp_Serveur_Comf;

import cosa.impl.Interface_ComposantImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Serveur Comp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Interface_Serveur_CompImpl#getPort_requis_serveur <em>Port requis serveur</em>}</li>
 *   <li>{@link client_serveur.impl.Interface_Serveur_CompImpl#getPort_fourni_serveur <em>Port fourni serveur</em>}</li>
 *   <li>{@link client_serveur.impl.Interface_Serveur_CompImpl#getPort_serveur_comp_serveur_comf <em>Port serveur comp serveur comf</em>}</li>
 *   <li>{@link client_serveur.impl.Interface_Serveur_CompImpl#getPort_serveur_comp_cm <em>Port serveur comp cm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Interface_Serveur_CompImpl extends Interface_ComposantImpl implements Interface_Serveur_Comp {
	/**
	 * The cached value of the '{@link #getPort_requis_serveur() <em>Port requis serveur</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_requis_serveur()
	 * @generated
	 * @ordered
	 */
	protected EList<Port_Requis_Serveur> port_requis_serveur;

	/**
	 * The cached value of the '{@link #getPort_fourni_serveur() <em>Port fourni serveur</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_fourni_serveur()
	 * @generated
	 * @ordered
	 */
	protected EList<Port_Fourni_Serveur> port_fourni_serveur;

	/**
	 * The cached value of the '{@link #getPort_serveur_comp_serveur_comf() <em>Port serveur comp serveur comf</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_serveur_comp_serveur_comf()
	 * @generated
	 * @ordered
	 */
	protected EList<Port_Serveur_Comp_Serveur_Comf> port_serveur_comp_serveur_comf;

	/**
	 * The cached value of the '{@link #getPort_serveur_comp_cm() <em>Port serveur comp cm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_serveur_comp_cm()
	 * @generated
	 * @ordered
	 */
	protected EList<Port_Serveur_Comp_CM> port_serveur_comp_cm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Interface_Serveur_CompImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.INTERFACE_SERVEUR_COMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port_Requis_Serveur> getPort_requis_serveur() {
		if (port_requis_serveur == null) {
			port_requis_serveur = new EObjectContainmentEList<Port_Requis_Serveur>(Port_Requis_Serveur.class, this, Client_serveurPackage.INTERFACE_SERVEUR_COMP__PORT_REQUIS_SERVEUR);
		}
		return port_requis_serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port_Fourni_Serveur> getPort_fourni_serveur() {
		if (port_fourni_serveur == null) {
			port_fourni_serveur = new EObjectContainmentEList<Port_Fourni_Serveur>(Port_Fourni_Serveur.class, this, Client_serveurPackage.INTERFACE_SERVEUR_COMP__PORT_FOURNI_SERVEUR);
		}
		return port_fourni_serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port_Serveur_Comp_Serveur_Comf> getPort_serveur_comp_serveur_comf() {
		if (port_serveur_comp_serveur_comf == null) {
			port_serveur_comp_serveur_comf = new EObjectContainmentEList<Port_Serveur_Comp_Serveur_Comf>(Port_Serveur_Comp_Serveur_Comf.class, this, Client_serveurPackage.INTERFACE_SERVEUR_COMP__PORT_SERVEUR_COMP_SERVEUR_COMF);
		}
		return port_serveur_comp_serveur_comf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port_Serveur_Comp_CM> getPort_serveur_comp_cm() {
		if (port_serveur_comp_cm == null) {
			port_serveur_comp_cm = new EObjectContainmentEList<Port_Serveur_Comp_CM>(Port_Serveur_Comp_CM.class, this, Client_serveurPackage.INTERFACE_SERVEUR_COMP__PORT_SERVEUR_COMP_CM);
		}
		return port_serveur_comp_cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.INTERFACE_SERVEUR_COMP__PORT_REQUIS_SERVEUR:
				return ((InternalEList<?>)getPort_requis_serveur()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.INTERFACE_SERVEUR_COMP__PORT_FOURNI_SERVEUR:
				return ((InternalEList<?>)getPort_fourni_serveur()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.INTERFACE_SERVEUR_COMP__PORT_SERVEUR_COMP_SERVEUR_COMF:
				return ((InternalEList<?>)getPort_serveur_comp_serveur_comf()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.INTERFACE_SERVEUR_COMP__PORT_SERVEUR_COMP_CM:
				return ((InternalEList<?>)getPort_serveur_comp_cm()).basicRemove(otherEnd, msgs);
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
			case Client_serveurPackage.INTERFACE_SERVEUR_COMP__PORT_REQUIS_SERVEUR:
				return getPort_requis_serveur();
			case Client_serveurPackage.INTERFACE_SERVEUR_COMP__PORT_FOURNI_SERVEUR:
				return getPort_fourni_serveur();
			case Client_serveurPackage.INTERFACE_SERVEUR_COMP__PORT_SERVEUR_COMP_SERVEUR_COMF:
				return getPort_serveur_comp_serveur_comf();
			case Client_serveurPackage.INTERFACE_SERVEUR_COMP__PORT_SERVEUR_COMP_CM:
				return getPort_serveur_comp_cm();
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
			case Client_serveurPackage.INTERFACE_SERVEUR_COMP__PORT_REQUIS_SERVEUR:
				getPort_requis_serveur().clear();
				getPort_requis_serveur().addAll((Collection<? extends Port_Requis_Serveur>)newValue);
				return;
			case Client_serveurPackage.INTERFACE_SERVEUR_COMP__PORT_FOURNI_SERVEUR:
				getPort_fourni_serveur().clear();
				getPort_fourni_serveur().addAll((Collection<? extends Port_Fourni_Serveur>)newValue);
				return;
			case Client_serveurPackage.INTERFACE_SERVEUR_COMP__PORT_SERVEUR_COMP_SERVEUR_COMF:
				getPort_serveur_comp_serveur_comf().clear();
				getPort_serveur_comp_serveur_comf().addAll((Collection<? extends Port_Serveur_Comp_Serveur_Comf>)newValue);
				return;
			case Client_serveurPackage.INTERFACE_SERVEUR_COMP__PORT_SERVEUR_COMP_CM:
				getPort_serveur_comp_cm().clear();
				getPort_serveur_comp_cm().addAll((Collection<? extends Port_Serveur_Comp_CM>)newValue);
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
			case Client_serveurPackage.INTERFACE_SERVEUR_COMP__PORT_REQUIS_SERVEUR:
				getPort_requis_serveur().clear();
				return;
			case Client_serveurPackage.INTERFACE_SERVEUR_COMP__PORT_FOURNI_SERVEUR:
				getPort_fourni_serveur().clear();
				return;
			case Client_serveurPackage.INTERFACE_SERVEUR_COMP__PORT_SERVEUR_COMP_SERVEUR_COMF:
				getPort_serveur_comp_serveur_comf().clear();
				return;
			case Client_serveurPackage.INTERFACE_SERVEUR_COMP__PORT_SERVEUR_COMP_CM:
				getPort_serveur_comp_cm().clear();
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
			case Client_serveurPackage.INTERFACE_SERVEUR_COMP__PORT_REQUIS_SERVEUR:
				return port_requis_serveur != null && !port_requis_serveur.isEmpty();
			case Client_serveurPackage.INTERFACE_SERVEUR_COMP__PORT_FOURNI_SERVEUR:
				return port_fourni_serveur != null && !port_fourni_serveur.isEmpty();
			case Client_serveurPackage.INTERFACE_SERVEUR_COMP__PORT_SERVEUR_COMP_SERVEUR_COMF:
				return port_serveur_comp_serveur_comf != null && !port_serveur_comp_serveur_comf.isEmpty();
			case Client_serveurPackage.INTERFACE_SERVEUR_COMP__PORT_SERVEUR_COMP_CM:
				return port_serveur_comp_cm != null && !port_serveur_comp_cm.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public void notif() {
		String message = ((Port_Requis_ServeurImpl) port_requis_serveur.get(0)).getRequest();
		((Port_Serveur_Comp_Serveur_ComfImpl) port_serveur_comp_serveur_comf.get(0)).sendRequest(message);
		
		message = ((Port_Serveur_Comp_Serveur_ComfImpl) port_serveur_comp_serveur_comf.get(0)).getResponse();
		((Port_Fourni_ServeurImpl) port_fourni_serveur.get(0)).sendResponse(message);
	}

} //Interface_Serveur_CompImpl
