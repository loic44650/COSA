/**
 */
package client_serveur;

import cosa.Port_Requis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Requis Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Port_Requis_Client#getAttachment_rpc_client <em>Attachment rpc client</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getPort_Requis_Client()
 * @model
 * @generated
 */
public interface Port_Requis_Client extends Port_Requis {
	/**
	 * Returns the value of the '<em><b>Attachment rpc client</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Attachment_RPC_Client#getPort_requis_client <em>Port requis client</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment rpc client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment rpc client</em>' reference.
	 * @see #setAttachment_rpc_client(Attachment_RPC_Client)
	 * @see client_serveur.Client_serveurPackage#getPort_Requis_Client_Attachment_rpc_client()
	 * @see client_serveur.Attachment_RPC_Client#getPort_requis_client
	 * @model opposite="port_requis_client"
	 * @generated
	 */
	Attachment_RPC_Client getAttachment_rpc_client();

	/**
	 * Sets the value of the '{@link client_serveur.Port_Requis_Client#getAttachment_rpc_client <em>Attachment rpc client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment rpc client</em>' reference.
	 * @see #getAttachment_rpc_client()
	 * @generated
	 */
	void setAttachment_rpc_client(Attachment_RPC_Client value);

} // Port_Requis_Client
