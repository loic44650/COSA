/**
 */
package client_serveur;

import cosa.Interface_Composant;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Data Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Interface_DataBase#getPort_fourni_db_gamma <em>Port fourni db gamma</em>}</li>
 *   <li>{@link client_serveur.Interface_DataBase#getPort_requis_gamma_db <em>Port requis gamma db</em>}</li>
 *   <li>{@link client_serveur.Interface_DataBase#getPort_fourni_db_beta <em>Port fourni db beta</em>}</li>
 *   <li>{@link client_serveur.Interface_DataBase#getPort_requis_beta_db <em>Port requis beta db</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getInterface_DataBase()
 * @model
 * @generated
 */
public interface Interface_DataBase extends Interface_Composant {
	/**
	 * Returns the value of the '<em><b>Port fourni db gamma</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Port_Fourni_DB_Gamma}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port fourni db gamma</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port fourni db gamma</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_DataBase_Port_fourni_db_gamma()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port_Fourni_DB_Gamma> getPort_fourni_db_gamma();

	/**
	 * Returns the value of the '<em><b>Port requis gamma db</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Port_Requis_Gamma_DB}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port requis gamma db</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port requis gamma db</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_DataBase_Port_requis_gamma_db()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port_Requis_Gamma_DB> getPort_requis_gamma_db();

	/**
	 * Returns the value of the '<em><b>Port fourni db beta</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Port_Fourni_DB_Beta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port fourni db beta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port fourni db beta</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_DataBase_Port_fourni_db_beta()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port_Fourni_DB_Beta> getPort_fourni_db_beta();

	/**
	 * Returns the value of the '<em><b>Port requis beta db</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Port_Requis_Beta_DB}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port requis beta db</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port requis beta db</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_DataBase_Port_requis_beta_db()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port_Requis_Beta_DB> getPort_requis_beta_db();

} // Interface_DataBase
