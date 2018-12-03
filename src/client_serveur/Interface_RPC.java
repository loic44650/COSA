/**
 */
package client_serveur;

import cosa.Interface_Connecteur;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface RPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Interface_RPC#getRole_fourni_rpc_client <em>Role fourni rpc client</em>}</li>
 *   <li>{@link client_serveur.Interface_RPC#getRole_requis_rpc_client <em>Role requis rpc client</em>}</li>
 *   <li>{@link client_serveur.Interface_RPC#getRole_fourni_rpc_serveur <em>Role fourni rpc serveur</em>}</li>
 *   <li>{@link client_serveur.Interface_RPC#getRole_requis_rpc_serveur <em>Role requis rpc serveur</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getInterface_RPC()
 * @model
 * @generated
 */
public interface Interface_RPC extends Interface_Connecteur {
	/**
	 * Returns the value of the '<em><b>Role fourni rpc client</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Role_Fourni_RPC_Client}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role fourni rpc client</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role fourni rpc client</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_RPC_Role_fourni_rpc_client()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role_Fourni_RPC_Client> getRole_fourni_rpc_client();

	/**
	 * Returns the value of the '<em><b>Role requis rpc client</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Role_Requis_RPC_Client}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role requis rpc client</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role requis rpc client</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_RPC_Role_requis_rpc_client()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role_Requis_RPC_Client> getRole_requis_rpc_client();

	/**
	 * Returns the value of the '<em><b>Role fourni rpc serveur</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Role_Fourni_RPC_Serveur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role fourni rpc serveur</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role fourni rpc serveur</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_RPC_Role_fourni_rpc_serveur()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role_Fourni_RPC_Serveur> getRole_fourni_rpc_serveur();

	/**
	 * Returns the value of the '<em><b>Role requis rpc serveur</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Role_Requis_RPC_Serveur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role requis rpc serveur</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role requis rpc serveur</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_RPC_Role_requis_rpc_serveur()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role_Requis_RPC_Serveur> getRole_requis_rpc_serveur();

} // Interface_RPC
