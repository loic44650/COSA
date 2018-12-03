/**
 */
package client_serveur;

import cosa.Interface_Connecteur;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Beta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Interface_Beta#getRole_fourni_beta_sm <em>Role fourni beta sm</em>}</li>
 *   <li>{@link client_serveur.Interface_Beta#getRole_requis_sm_beta <em>Role requis sm beta</em>}</li>
 *   <li>{@link client_serveur.Interface_Beta#getRole_requis_db_beta <em>Role requis db beta</em>}</li>
 *   <li>{@link client_serveur.Interface_Beta#getRole_fourni_beta_db <em>Role fourni beta db</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getInterface_Beta()
 * @model
 * @generated
 */
public interface Interface_Beta extends Interface_Connecteur {
	/**
	 * Returns the value of the '<em><b>Role fourni beta sm</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Role_Fourni_Beta_SM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role fourni beta sm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role fourni beta sm</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Beta_Role_fourni_beta_sm()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role_Fourni_Beta_SM> getRole_fourni_beta_sm();

	/**
	 * Returns the value of the '<em><b>Role requis sm beta</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Role_Requis_SM_Beta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role requis sm beta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role requis sm beta</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Beta_Role_requis_sm_beta()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role_Requis_SM_Beta> getRole_requis_sm_beta();

	/**
	 * Returns the value of the '<em><b>Role requis db beta</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Role_Requis_DB_Beta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role requis db beta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role requis db beta</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Beta_Role_requis_db_beta()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role_Requis_DB_Beta> getRole_requis_db_beta();

	/**
	 * Returns the value of the '<em><b>Role fourni beta db</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Role_Fourni_Beta_DB}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role fourni beta db</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role fourni beta db</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Beta_Role_fourni_beta_db()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role_Fourni_Beta_DB> getRole_fourni_beta_db();

} // Interface_Beta
