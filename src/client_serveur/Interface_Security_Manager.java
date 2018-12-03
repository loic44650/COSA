/**
 */
package client_serveur;

import cosa.Interface_Composant;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Security Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Interface_Security_Manager#getPort_fourni_sm_beta <em>Port fourni sm beta</em>}</li>
 *   <li>{@link client_serveur.Interface_Security_Manager#getPort_requis_beta_sm <em>Port requis beta sm</em>}</li>
 *   <li>{@link client_serveur.Interface_Security_Manager#getPort_fourni_sm_alpha <em>Port fourni sm alpha</em>}</li>
 *   <li>{@link client_serveur.Interface_Security_Manager#getPort_requis_alpha_sm <em>Port requis alpha sm</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getInterface_Security_Manager()
 * @model
 * @generated
 */
public interface Interface_Security_Manager extends Interface_Composant {
	/**
	 * Returns the value of the '<em><b>Port fourni sm beta</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Port_Fourni_SM_Beta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port fourni sm beta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port fourni sm beta</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Security_Manager_Port_fourni_sm_beta()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port_Fourni_SM_Beta> getPort_fourni_sm_beta();

	/**
	 * Returns the value of the '<em><b>Port requis beta sm</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Port_Requis_Beta_SM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port requis beta sm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port requis beta sm</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Security_Manager_Port_requis_beta_sm()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port_Requis_Beta_SM> getPort_requis_beta_sm();

	/**
	 * Returns the value of the '<em><b>Port fourni sm alpha</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Port_Fourni_SM_Alpha}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port fourni sm alpha</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port fourni sm alpha</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Security_Manager_Port_fourni_sm_alpha()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port_Fourni_SM_Alpha> getPort_fourni_sm_alpha();

	/**
	 * Returns the value of the '<em><b>Port requis alpha sm</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Port_Requis_Alpha_SM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port requis alpha sm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port requis alpha sm</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Security_Manager_Port_requis_alpha_sm()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port_Requis_Alpha_SM> getPort_requis_alpha_sm();

} // Interface_Security_Manager
