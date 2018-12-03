/**
 */
package client_serveur;

import cosa.Interface_Composant;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Serveur Comp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Interface_Serveur_Comp#getPort_requis_serveur <em>Port requis serveur</em>}</li>
 *   <li>{@link client_serveur.Interface_Serveur_Comp#getPort_fourni_serveur <em>Port fourni serveur</em>}</li>
 *   <li>{@link client_serveur.Interface_Serveur_Comp#getPort_serveur_comp_serveur_comf <em>Port serveur comp serveur comf</em>}</li>
 *   <li>{@link client_serveur.Interface_Serveur_Comp#getPort_serveur_comp_cm <em>Port serveur comp cm</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getInterface_Serveur_Comp()
 * @model
 * @generated
 */
public interface Interface_Serveur_Comp extends Interface_Composant {
	/**
	 * Returns the value of the '<em><b>Port requis serveur</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Port_Requis_Serveur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port requis serveur</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port requis serveur</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Serveur_Comp_Port_requis_serveur()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port_Requis_Serveur> getPort_requis_serveur();

	/**
	 * Returns the value of the '<em><b>Port fourni serveur</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Port_Fourni_Serveur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port fourni serveur</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port fourni serveur</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Serveur_Comp_Port_fourni_serveur()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port_Fourni_Serveur> getPort_fourni_serveur();

	/**
	 * Returns the value of the '<em><b>Port serveur comp serveur comf</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Port_Serveur_Comp_Serveur_Comf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port serveur comp serveur comf</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port serveur comp serveur comf</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Serveur_Comp_Port_serveur_comp_serveur_comf()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port_Serveur_Comp_Serveur_Comf> getPort_serveur_comp_serveur_comf();

	/**
	 * Returns the value of the '<em><b>Port serveur comp cm</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Port_Serveur_Comp_CM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port serveur comp cm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port serveur comp cm</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Serveur_Comp_Port_serveur_comp_cm()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port_Serveur_Comp_CM> getPort_serveur_comp_cm();

} // Interface_Serveur_Comp
