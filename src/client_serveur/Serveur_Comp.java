/**
 */
package client_serveur;

import cosa.Composant;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serveur Comp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Serveur_Comp#getInterface_serveur_comp <em>Interface serveur comp</em>}</li>
 *   <li>{@link client_serveur.Serveur_Comp#getServeur_conf <em>Serveur conf</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getServeur_Comp()
 * @model
 * @generated
 */
public interface Serveur_Comp extends Composant {
	/**
	 * Returns the value of the '<em><b>Interface serveur comp</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Interface_Serveur_Comp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface serveur comp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface serveur comp</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getServeur_Comp_Interface_serveur_comp()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface_Serveur_Comp> getInterface_serveur_comp();

	/**
	 * Returns the value of the '<em><b>Serveur conf</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Serveur_Conf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serveur conf</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serveur conf</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getServeur_Comp_Serveur_conf()
	 * @model containment="true"
	 * @generated
	 */
	EList<Serveur_Conf> getServeur_conf();

} // Serveur_Comp
