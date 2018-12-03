/**
 */
package client_serveur;

import cosa.Connecteur;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Beta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Beta#getInterface_beta <em>Interface beta</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getBeta()
 * @model
 * @generated
 */
public interface Beta extends Connecteur {
	/**
	 * Returns the value of the '<em><b>Interface beta</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Interface_Beta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface beta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface beta</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getBeta_Interface_beta()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface_Beta> getInterface_beta();

} // Beta
