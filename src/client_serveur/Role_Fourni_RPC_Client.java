/**
 */
package client_serveur;

import cosa.Role_Fourni;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Fourni RPC Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Role_Fourni_RPC_Client#getAttachment_rpc_client <em>Attachment rpc client</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getRole_Fourni_RPC_Client()
 * @model
 * @generated
 */
public interface Role_Fourni_RPC_Client extends Role_Fourni {
	/**
	 * Returns the value of the '<em><b>Attachment rpc client</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Attachment_RPC_Client#getRole_fourni_rpc_client <em>Role fourni rpc client</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment rpc client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment rpc client</em>' reference.
	 * @see #setAttachment_rpc_client(Attachment_RPC_Client)
	 * @see client_serveur.Client_serveurPackage#getRole_Fourni_RPC_Client_Attachment_rpc_client()
	 * @see client_serveur.Attachment_RPC_Client#getRole_fourni_rpc_client
	 * @model opposite="role_fourni_rpc_client"
	 * @generated
	 */
	Attachment_RPC_Client getAttachment_rpc_client();

	/**
	 * Sets the value of the '{@link client_serveur.Role_Fourni_RPC_Client#getAttachment_rpc_client <em>Attachment rpc client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment rpc client</em>' reference.
	 * @see #getAttachment_rpc_client()
	 * @generated
	 */
	void setAttachment_rpc_client(Attachment_RPC_Client value);

} // Role_Fourni_RPC_Client
