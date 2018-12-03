/**
 */
package client_serveur;

import cosa.Configuration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serveur Conf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Serveur_Conf#getDatabase <em>Database</em>}</li>
 *   <li>{@link client_serveur.Serveur_Conf#getSecurity_manager <em>Security manager</em>}</li>
 *   <li>{@link client_serveur.Serveur_Conf#getConnection_manager <em>Connection manager</em>}</li>
 *   <li>{@link client_serveur.Serveur_Conf#getGamma <em>Gamma</em>}</li>
 *   <li>{@link client_serveur.Serveur_Conf#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link client_serveur.Serveur_Conf#getBeta <em>Beta</em>}</li>
 *   <li>{@link client_serveur.Serveur_Conf#getInterface_serveur_conf <em>Interface serveur conf</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getServeur_Conf()
 * @model
 * @generated
 */
public interface Serveur_Conf extends Configuration {
	/**
	 * Returns the value of the '<em><b>Database</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.DataBase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getServeur_Conf_Database()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataBase> getDatabase();

	/**
	 * Returns the value of the '<em><b>Security manager</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Security_Manager}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security manager</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security manager</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getServeur_Conf_Security_manager()
	 * @model containment="true"
	 * @generated
	 */
	EList<Security_Manager> getSecurity_manager();

	/**
	 * Returns the value of the '<em><b>Connection manager</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Connection_Manager}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection manager</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection manager</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getServeur_Conf_Connection_manager()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection_Manager> getConnection_manager();

	/**
	 * Returns the value of the '<em><b>Gamma</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Gamma}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gamma</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gamma</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getServeur_Conf_Gamma()
	 * @model containment="true"
	 * @generated
	 */
	EList<Gamma> getGamma();

	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Alpha}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getServeur_Conf_Alpha()
	 * @model containment="true"
	 * @generated
	 */
	EList<Alpha> getAlpha();

	/**
	 * Returns the value of the '<em><b>Beta</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Beta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beta</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getServeur_Conf_Beta()
	 * @model containment="true"
	 * @generated
	 */
	EList<Beta> getBeta();

	/**
	 * Returns the value of the '<em><b>Interface serveur conf</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Interface_Serveur_Conf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface serveur conf</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface serveur conf</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getServeur_Conf_Interface_serveur_conf()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface_Serveur_Conf> getInterface_serveur_conf();

} // Serveur_Conf
