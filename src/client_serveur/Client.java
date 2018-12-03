/**
 */
package client_serveur;

import cosa.Composant;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Client#getInterface_client <em>Interface client</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getClient()
 * @model
 * @generated
 */
public interface Client extends Composant {
	/**
	 * Returns the value of the '<em><b>Interface client</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Interface_Client}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface client</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface client</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getClient_Interface_client()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface_Client> getInterface_client();

} // Client
