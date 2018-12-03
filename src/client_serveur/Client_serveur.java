/**
 */
package client_serveur;

import cosa.Configuration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client serveur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Client_serveur#getClient <em>Client</em>}</li>
 *   <li>{@link client_serveur.Client_serveur#getRpc <em>Rpc</em>}</li>
 *   <li>{@link client_serveur.Client_serveur#getServeur <em>Serveur</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getClient_serveur()
 * @model
 * @generated
 */
public interface Client_serveur extends Configuration {
	/**
	 * Returns the value of the '<em><b>Client</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Client}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getClient_serveur_Client()
	 * @model containment="true"
	 * @generated
	 */
	EList<Client> getClient();

	/**
	 * Returns the value of the '<em><b>Rpc</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.RPC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rpc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpc</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getClient_serveur_Rpc()
	 * @model containment="true"
	 * @generated
	 */
	EList<RPC> getRpc();

	/**
	 * Returns the value of the '<em><b>Serveur</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Serveur_Comp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serveur</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serveur</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getClient_serveur_Serveur()
	 * @model containment="true"
	 * @generated
	 */
	EList<Serveur_Comp> getServeur();

} // Client_serveur
