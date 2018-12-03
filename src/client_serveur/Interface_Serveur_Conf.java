/**
 */
package client_serveur;

import cosa.Interface_Composant;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Serveur Conf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Interface_Serveur_Conf#getPort_serveur_conf_serveur_comp <em>Port serveur conf serveur comp</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getInterface_Serveur_Conf()
 * @model
 * @generated
 */
public interface Interface_Serveur_Conf extends Interface_Composant {
	/**
	 * Returns the value of the '<em><b>Port serveur conf serveur comp</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Port_Serveur_Conf_Serveur_Comp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port serveur conf serveur comp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port serveur conf serveur comp</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Serveur_Conf_Port_serveur_conf_serveur_comp()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port_Serveur_Conf_Serveur_Comp> getPort_serveur_conf_serveur_comp();

} // Interface_Serveur_Conf
