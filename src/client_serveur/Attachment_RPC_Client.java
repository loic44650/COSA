/**
 */
package client_serveur;

import cosa.Attachment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment RPC Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Attachment_RPC_Client#getPort_requis_client <em>Port requis client</em>}</li>
 *   <li>{@link client_serveur.Attachment_RPC_Client#getRole_fourni_rpc_client <em>Role fourni rpc client</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getAttachment_RPC_Client()
 * @model
 * @generated
 */
public interface Attachment_RPC_Client extends Attachment {
	/**
	 * Returns the value of the '<em><b>Port requis client</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Port_Requis_Client#getAttachment_rpc_client <em>Attachment rpc client</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port requis client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port requis client</em>' reference.
	 * @see #setPort_requis_client(Port_Requis_Client)
	 * @see client_serveur.Client_serveurPackage#getAttachment_RPC_Client_Port_requis_client()
	 * @see client_serveur.Port_Requis_Client#getAttachment_rpc_client
	 * @model opposite="attachment_rpc_client"
	 * @generated
	 */
	Port_Requis_Client getPort_requis_client();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_RPC_Client#getPort_requis_client <em>Port requis client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port requis client</em>' reference.
	 * @see #getPort_requis_client()
	 * @generated
	 */
	void setPort_requis_client(Port_Requis_Client value);

	/**
	 * Returns the value of the '<em><b>Role fourni rpc client</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Role_Fourni_RPC_Client#getAttachment_rpc_client <em>Attachment rpc client</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role fourni rpc client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role fourni rpc client</em>' reference.
	 * @see #setRole_fourni_rpc_client(Role_Fourni_RPC_Client)
	 * @see client_serveur.Client_serveurPackage#getAttachment_RPC_Client_Role_fourni_rpc_client()
	 * @see client_serveur.Role_Fourni_RPC_Client#getAttachment_rpc_client
	 * @model opposite="attachment_rpc_client"
	 * @generated
	 */
	Role_Fourni_RPC_Client getRole_fourni_rpc_client();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_RPC_Client#getRole_fourni_rpc_client <em>Role fourni rpc client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role fourni rpc client</em>' reference.
	 * @see #getRole_fourni_rpc_client()
	 * @generated
	 */
	void setRole_fourni_rpc_client(Role_Fourni_RPC_Client value);

} // Attachment_RPC_Client
