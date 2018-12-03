/**
 */
package client_serveur;

import cosa.Role_Requis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Requis RPC Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Role_Requis_RPC_Client#getAttachment_client_rpc <em>Attachment client rpc</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getRole_Requis_RPC_Client()
 * @model
 * @generated
 */
public interface Role_Requis_RPC_Client extends Role_Requis {
	/**
	 * Returns the value of the '<em><b>Attachment client rpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment client rpc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment client rpc</em>' reference.
	 * @see #setAttachment_client_rpc(Attachment_Client_RPC)
	 * @see client_serveur.Client_serveurPackage#getRole_Requis_RPC_Client_Attachment_client_rpc()
	 * @model
	 * @generated
	 */
	Attachment_Client_RPC getAttachment_client_rpc();

	/**
	 * Sets the value of the '{@link client_serveur.Role_Requis_RPC_Client#getAttachment_client_rpc <em>Attachment client rpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment client rpc</em>' reference.
	 * @see #getAttachment_client_rpc()
	 * @generated
	 */
	void setAttachment_client_rpc(Attachment_Client_RPC value);

} // Role_Requis_RPC_Client
