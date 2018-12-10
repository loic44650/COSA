/**
 */
package client_serveur.impl;

import client_serveur.Alpha;
import client_serveur.Beta;
import client_serveur.Client_serveurPackage;
import client_serveur.Connection_Manager;
import client_serveur.DataBase;
import client_serveur.Gamma;
import client_serveur.Interface_Serveur_Conf;
import client_serveur.Security_Manager;
import client_serveur.Serveur_Conf;

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
 * An implementation of the model object '<em><b>Serveur Conf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Serveur_ConfImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link client_serveur.impl.Serveur_ConfImpl#getSecurity_manager <em>Security manager</em>}</li>
 *   <li>{@link client_serveur.impl.Serveur_ConfImpl#getConnection_manager <em>Connection manager</em>}</li>
 *   <li>{@link client_serveur.impl.Serveur_ConfImpl#getGamma <em>Gamma</em>}</li>
 *   <li>{@link client_serveur.impl.Serveur_ConfImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link client_serveur.impl.Serveur_ConfImpl#getBeta <em>Beta</em>}</li>
 *   <li>{@link client_serveur.impl.Serveur_ConfImpl#getInterface_serveur_conf <em>Interface serveur conf</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Serveur_ConfImpl extends ConfigurationImpl implements Serveur_Conf {
	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected EList<DataBase> database;

	/**
	 * The cached value of the '{@link #getSecurity_manager() <em>Security manager</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity_manager()
	 * @generated
	 * @ordered
	 */
	protected EList<Security_Manager> security_manager;

	/**
	 * The cached value of the '{@link #getConnection_manager() <em>Connection manager</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection_manager()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection_Manager> connection_manager;

	/**
	 * The cached value of the '{@link #getGamma() <em>Gamma</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamma()
	 * @generated
	 * @ordered
	 */
	protected EList<Gamma> gamma;

	/**
	 * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected EList<Alpha> alpha;

	/**
	 * The cached value of the '{@link #getBeta() <em>Beta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeta()
	 * @generated
	 * @ordered
	 */
	protected EList<Beta> beta;

	/**
	 * The cached value of the '{@link #getInterface_serveur_conf() <em>Interface serveur conf</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface_serveur_conf()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface_Serveur_Conf> interface_serveur_conf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Serveur_ConfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.SERVEUR_CONF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataBase> getDatabase() {
		if (database == null) {
			database = new EObjectContainmentEList<DataBase>(DataBase.class, this, Client_serveurPackage.SERVEUR_CONF__DATABASE);
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Security_Manager> getSecurity_manager() {
		if (security_manager == null) {
			security_manager = new EObjectContainmentEList<Security_Manager>(Security_Manager.class, this, Client_serveurPackage.SERVEUR_CONF__SECURITY_MANAGER);
		}
		return security_manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection_Manager> getConnection_manager() {
		if (connection_manager == null) {
			connection_manager = new EObjectContainmentEList<Connection_Manager>(Connection_Manager.class, this, Client_serveurPackage.SERVEUR_CONF__CONNECTION_MANAGER);
		}
		return connection_manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gamma> getGamma() {
		if (gamma == null) {
			gamma = new EObjectContainmentEList<Gamma>(Gamma.class, this, Client_serveurPackage.SERVEUR_CONF__GAMMA);
		}
		return gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Alpha> getAlpha() {
		if (alpha == null) {
			alpha = new EObjectContainmentEList<Alpha>(Alpha.class, this, Client_serveurPackage.SERVEUR_CONF__ALPHA);
		}
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Beta> getBeta() {
		if (beta == null) {
			beta = new EObjectContainmentEList<Beta>(Beta.class, this, Client_serveurPackage.SERVEUR_CONF__BETA);
		}
		return beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface_Serveur_Conf> getInterface_serveur_conf() {
		if (interface_serveur_conf == null) {
			interface_serveur_conf = new EObjectContainmentEList<Interface_Serveur_Conf>(Interface_Serveur_Conf.class, this, Client_serveurPackage.SERVEUR_CONF__INTERFACE_SERVEUR_CONF);
		}
		return interface_serveur_conf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.SERVEUR_CONF__DATABASE:
				return ((InternalEList<?>)getDatabase()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.SERVEUR_CONF__SECURITY_MANAGER:
				return ((InternalEList<?>)getSecurity_manager()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.SERVEUR_CONF__CONNECTION_MANAGER:
				return ((InternalEList<?>)getConnection_manager()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.SERVEUR_CONF__GAMMA:
				return ((InternalEList<?>)getGamma()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.SERVEUR_CONF__ALPHA:
				return ((InternalEList<?>)getAlpha()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.SERVEUR_CONF__BETA:
				return ((InternalEList<?>)getBeta()).basicRemove(otherEnd, msgs);
			case Client_serveurPackage.SERVEUR_CONF__INTERFACE_SERVEUR_CONF:
				return ((InternalEList<?>)getInterface_serveur_conf()).basicRemove(otherEnd, msgs);
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
			case Client_serveurPackage.SERVEUR_CONF__DATABASE:
				return getDatabase();
			case Client_serveurPackage.SERVEUR_CONF__SECURITY_MANAGER:
				return getSecurity_manager();
			case Client_serveurPackage.SERVEUR_CONF__CONNECTION_MANAGER:
				return getConnection_manager();
			case Client_serveurPackage.SERVEUR_CONF__GAMMA:
				return getGamma();
			case Client_serveurPackage.SERVEUR_CONF__ALPHA:
				return getAlpha();
			case Client_serveurPackage.SERVEUR_CONF__BETA:
				return getBeta();
			case Client_serveurPackage.SERVEUR_CONF__INTERFACE_SERVEUR_CONF:
				return getInterface_serveur_conf();
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
			case Client_serveurPackage.SERVEUR_CONF__DATABASE:
				getDatabase().clear();
				getDatabase().addAll((Collection<? extends DataBase>)newValue);
				return;
			case Client_serveurPackage.SERVEUR_CONF__SECURITY_MANAGER:
				getSecurity_manager().clear();
				getSecurity_manager().addAll((Collection<? extends Security_Manager>)newValue);
				return;
			case Client_serveurPackage.SERVEUR_CONF__CONNECTION_MANAGER:
				getConnection_manager().clear();
				getConnection_manager().addAll((Collection<? extends Connection_Manager>)newValue);
				return;
			case Client_serveurPackage.SERVEUR_CONF__GAMMA:
				getGamma().clear();
				getGamma().addAll((Collection<? extends Gamma>)newValue);
				return;
			case Client_serveurPackage.SERVEUR_CONF__ALPHA:
				getAlpha().clear();
				getAlpha().addAll((Collection<? extends Alpha>)newValue);
				return;
			case Client_serveurPackage.SERVEUR_CONF__BETA:
				getBeta().clear();
				getBeta().addAll((Collection<? extends Beta>)newValue);
				return;
			case Client_serveurPackage.SERVEUR_CONF__INTERFACE_SERVEUR_CONF:
				getInterface_serveur_conf().clear();
				getInterface_serveur_conf().addAll((Collection<? extends Interface_Serveur_Conf>)newValue);
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
			case Client_serveurPackage.SERVEUR_CONF__DATABASE:
				getDatabase().clear();
				return;
			case Client_serveurPackage.SERVEUR_CONF__SECURITY_MANAGER:
				getSecurity_manager().clear();
				return;
			case Client_serveurPackage.SERVEUR_CONF__CONNECTION_MANAGER:
				getConnection_manager().clear();
				return;
			case Client_serveurPackage.SERVEUR_CONF__GAMMA:
				getGamma().clear();
				return;
			case Client_serveurPackage.SERVEUR_CONF__ALPHA:
				getAlpha().clear();
				return;
			case Client_serveurPackage.SERVEUR_CONF__BETA:
				getBeta().clear();
				return;
			case Client_serveurPackage.SERVEUR_CONF__INTERFACE_SERVEUR_CONF:
				getInterface_serveur_conf().clear();
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
			case Client_serveurPackage.SERVEUR_CONF__DATABASE:
				return database != null && !database.isEmpty();
			case Client_serveurPackage.SERVEUR_CONF__SECURITY_MANAGER:
				return security_manager != null && !security_manager.isEmpty();
			case Client_serveurPackage.SERVEUR_CONF__CONNECTION_MANAGER:
				return connection_manager != null && !connection_manager.isEmpty();
			case Client_serveurPackage.SERVEUR_CONF__GAMMA:
				return gamma != null && !gamma.isEmpty();
			case Client_serveurPackage.SERVEUR_CONF__ALPHA:
				return alpha != null && !alpha.isEmpty();
			case Client_serveurPackage.SERVEUR_CONF__BETA:
				return beta != null && !beta.isEmpty();
			case Client_serveurPackage.SERVEUR_CONF__INTERFACE_SERVEUR_CONF:
				return interface_serveur_conf != null && !interface_serveur_conf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public void notif() {
		String message = ((Port_Serveur_Conf_Serveur_CompImpl) interface_serveur_conf.get(0).getPort_serveur_conf_serveur_comp().get(0)).getRequest();
		if(message!=null)
			sendResponse(((DataBaseImpl) database.get(0)).getValue());
	}
	
	public void sendResponse(String response) {
		System.out.println("<-- ServeurConf");
		((Interface_Serveur_ConfImpl) interface_serveur_conf.get(0)).sendResponse(response);
	}

} //Serveur_ConfImpl
