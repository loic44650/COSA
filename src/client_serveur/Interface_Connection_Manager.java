/**
 */
package client_serveur;

import cosa.Interface_Composant;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Connection Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Interface_Connection_Manager#getPort_fourni_cm_gamma <em>Port fourni cm gamma</em>}</li>
 *   <li>{@link client_serveur.Interface_Connection_Manager#getPort_requis_gamma_cm <em>Port requis gamma cm</em>}</li>
 *   <li>{@link client_serveur.Interface_Connection_Manager#getPort_fourni_cm_alpha <em>Port fourni cm alpha</em>}</li>
 *   <li>{@link client_serveur.Interface_Connection_Manager#getPort_requis_alpha_cm <em>Port requis alpha cm</em>}</li>
 *   <li>{@link client_serveur.Interface_Connection_Manager#getPort_cm_serveur_comp <em>Port cm serveur comp</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getInterface_Connection_Manager()
 * @model
 * @generated
 */
public interface Interface_Connection_Manager extends Interface_Composant {
	/**
	 * Returns the value of the '<em><b>Port fourni cm gamma</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Port_Fourni_CM_Gamma}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port fourni cm gamma</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port fourni cm gamma</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Connection_Manager_Port_fourni_cm_gamma()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port_Fourni_CM_Gamma> getPort_fourni_cm_gamma();

	/**
	 * Returns the value of the '<em><b>Port requis gamma cm</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Port_Requis_Gamma_CM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port requis gamma cm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port requis gamma cm</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Connection_Manager_Port_requis_gamma_cm()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port_Requis_Gamma_CM> getPort_requis_gamma_cm();

	/**
	 * Returns the value of the '<em><b>Port fourni cm alpha</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Port_Fourni_CM_Alpha}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port fourni cm alpha</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port fourni cm alpha</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Connection_Manager_Port_fourni_cm_alpha()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port_Fourni_CM_Alpha> getPort_fourni_cm_alpha();

	/**
	 * Returns the value of the '<em><b>Port requis alpha cm</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Port_Requis_Alpha_CM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port requis alpha cm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port requis alpha cm</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Connection_Manager_Port_requis_alpha_cm()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port_Requis_Alpha_CM> getPort_requis_alpha_cm();

	/**
	 * Returns the value of the '<em><b>Port cm serveur comp</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Port_CM_Serveur_Comp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port cm serveur comp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port cm serveur comp</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Connection_Manager_Port_cm_serveur_comp()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port_CM_Serveur_Comp> getPort_cm_serveur_comp();

} // Interface_Connection_Manager
