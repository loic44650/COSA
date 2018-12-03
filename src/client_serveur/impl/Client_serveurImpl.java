/**
 */
package client_serveur.impl;

import client_serveur.Client;
import client_serveur.Client_serveur;
import client_serveur.Client_serveurPackage;
import client_serveur.RPC;
import client_serveur.Serveur_Comp;

import cosa.impl.ConfigurationImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client serveur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Client_serveurImpl#getClient <em>Client</em>}</li>
 *   <li>{@link client_serveur.impl.Client_serveurImpl#getRpc <em>Rpc</em>}</li>
 *   <li>{@link client_serveur.impl.Client_serveurImpl#getServeur <em>Serveur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Client_serveurImpl extends ConfigurationImpl implements Client_serveur {
	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected EList<Client> client;

	/**
	 * The cached value of the '{@link #getRpc() <em>Rpc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpc()
	 * @generated
	 * @ordered
	 */
	protected EList<RPC> rpc;

	/**
	 * The cached value of the '{@link #getServeur() <em>Serveur</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServeur()
	 * @generated
	 * @ordered
	 */
	protected EList<Serveur_Comp> serveur;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Client_serveurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.CLIENT_SERVEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Client> getClient() {
		if (client == null) {
			client = new EObjectContainmentEList<Client>(Client.class, this, Client_serveurPackage.CLIENT_SERVEUR__CLIENT);
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RPC> getRpc() {
		if (rpc == null) {
			rpc = new EObjectContainmentEList<RPC>(RPC.class, this, Client_serveurPackage.CLIENT_SERVEUR__RPC);
		}
		return rpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Serveur_Comp> getServeur() {
		if (serveur == null) {
			serveur = new EObjectContainmentEList<Serveur_Comp>(Serveur_Comp.class, this, Client_serveurPackage.CLIENT_SERVEUR__SERVEUR);
		}
		return serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.CLIENT_SERVEUR__CLIENT:
				return ((InternalEList<?>)getClient()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.CLIENT_SERVEUR__RPC:
				return ((InternalEList<?>)getRpc()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.CLIENT_SERVEUR__SERVEUR:
				return ((InternalEList<?>)getServeur()).basicRemove(otherEnd, msgs);
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
			case Client_serveurPackage.CLIENT_SERVEUR__CLIENT:
				return getClient();
			case Client_serveurPackage.CLIENT_SERVEUR__RPC:
				return getRpc();
			case Client_serveurPackage.CLIENT_SERVEUR__SERVEUR:
				return getServeur();
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
			case Client_serveurPackage.CLIENT_SERVEUR__CLIENT:
				getClient().clear();
				getClient().addAll((Collection<? extends Client>)newValue);
				return;
			case Client_serveurPackage.CLIENT_SERVEUR__RPC:
				getRpc().clear();
				getRpc().addAll((Collection<? extends RPC>)newValue);
				return;
			case Client_serveurPackage.CLIENT_SERVEUR__SERVEUR:
				getServeur().clear();
				getServeur().addAll((Collection<? extends Serveur_Comp>)newValue);
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
			case Client_serveurPackage.CLIENT_SERVEUR__CLIENT:
				getClient().clear();
				return;
			case Client_serveurPackage.CLIENT_SERVEUR__RPC:
				getRpc().clear();
				return;
			case Client_serveurPackage.CLIENT_SERVEUR__SERVEUR:
				getServeur().clear();
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
			case Client_serveurPackage.CLIENT_SERVEUR__CLIENT:
				return client != null && !client.isEmpty();
			case Client_serveurPackage.CLIENT_SERVEUR__RPC:
				return rpc != null && !rpc.isEmpty();
			case Client_serveurPackage.CLIENT_SERVEUR__SERVEUR:
				return serveur != null && !serveur.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Client_serveurImpl
