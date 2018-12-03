/**
 */
package client_serveur.impl;

import client_serveur.Client_serveurPackage;
import client_serveur.Interface_Serveur_Comp;
import client_serveur.Serveur_Comp;
import client_serveur.Serveur_Conf;

import cosa.impl.ComposantImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serveur Comp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Serveur_CompImpl#getInterface_serveur_comp <em>Interface serveur comp</em>}</li>
 *   <li>{@link client_serveur.impl.Serveur_CompImpl#getServeur_conf <em>Serveur conf</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Serveur_CompImpl extends ComposantImpl implements Serveur_Comp {
	/**
	 * The cached value of the '{@link #getInterface_serveur_comp() <em>Interface serveur comp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface_serveur_comp()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface_Serveur_Comp> interface_serveur_comp;

	/**
	 * The cached value of the '{@link #getServeur_conf() <em>Serveur conf</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServeur_conf()
	 * @generated
	 * @ordered
	 */
	protected EList<Serveur_Conf> serveur_conf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Serveur_CompImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.SERVEUR_COMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface_Serveur_Comp> getInterface_serveur_comp() {
		if (interface_serveur_comp == null) {
			interface_serveur_comp = new EObjectContainmentEList<Interface_Serveur_Comp>(Interface_Serveur_Comp.class, this, Client_serveurPackage.SERVEUR_COMP__INTERFACE_SERVEUR_COMP);
		}
		return interface_serveur_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Serveur_Conf> getServeur_conf() {
		if (serveur_conf == null) {
			serveur_conf = new EObjectContainmentEList<Serveur_Conf>(Serveur_Conf.class, this, Client_serveurPackage.SERVEUR_COMP__SERVEUR_CONF);
		}
		return serveur_conf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.SERVEUR_COMP__INTERFACE_SERVEUR_COMP:
				return ((InternalEList<?>)getInterface_serveur_comp()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.SERVEUR_COMP__SERVEUR_CONF:
				return ((InternalEList<?>)getServeur_conf()).basicRemove(otherEnd, msgs);
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
			case Client_serveurPackage.SERVEUR_COMP__INTERFACE_SERVEUR_COMP:
				return getInterface_serveur_comp();
			case Client_serveurPackage.SERVEUR_COMP__SERVEUR_CONF:
				return getServeur_conf();
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
			case Client_serveurPackage.SERVEUR_COMP__INTERFACE_SERVEUR_COMP:
				getInterface_serveur_comp().clear();
				getInterface_serveur_comp().addAll((Collection<? extends Interface_Serveur_Comp>)newValue);
				return;
			case Client_serveurPackage.SERVEUR_COMP__SERVEUR_CONF:
				getServeur_conf().clear();
				getServeur_conf().addAll((Collection<? extends Serveur_Conf>)newValue);
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
			case Client_serveurPackage.SERVEUR_COMP__INTERFACE_SERVEUR_COMP:
				getInterface_serveur_comp().clear();
				return;
			case Client_serveurPackage.SERVEUR_COMP__SERVEUR_CONF:
				getServeur_conf().clear();
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
			case Client_serveurPackage.SERVEUR_COMP__INTERFACE_SERVEUR_COMP:
				return interface_serveur_comp != null && !interface_serveur_comp.isEmpty();
			case Client_serveurPackage.SERVEUR_COMP__SERVEUR_CONF:
				return serveur_conf != null && !serveur_conf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Serveur_CompImpl
