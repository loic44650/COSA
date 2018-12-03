/**
 */
package client_serveur;

import cosa.Attachment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment Client RPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Attachment_Client_RPC#getPort_fourni_client <em>Port fourni client</em>}</li>
 *   <li>{@link client_serveur.Attachment_Client_RPC#getRole_requis_rpc_client <em>Role requis rpc client</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getAttachment_Client_RPC()
 * @model
 * @generated
 */
public interface Attachment_Client_RPC extends Attachment {

	/**
	 * Returns the value of the '<em><b>Port fourni client</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Port_Fourni_Client#getAttachment_client_rpc <em>Attachment client rpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port fourni client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port fourni client</em>' reference.
	 * @see #setPort_fourni_client(Port_Fourni_Client)
	 * @see client_serveur.Client_serveurPackage#getAttachment_Client_RPC_Port_fourni_client()
	 * @see client_serveur.Port_Fourni_Client#getAttachment_client_rpc
	 * @model opposite="attachment_client_rpc"
	 * @generated
	 */
	Port_Fourni_Client getPort_fourni_client();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_Client_RPC#getPort_fourni_client <em>Port fourni client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port fourni client</em>' reference.
	 * @see #getPort_fourni_client()
	 * @generated
	 */
	void setPort_fourni_client(Port_Fourni_Client value);

	/**
	 * Returns the value of the '<em><b>Role requis rpc client</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Role_Requis_RPC_Client#getAttachment_client_rpc <em>Attachment client rpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role requis rpc client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role requis rpc client</em>' reference.
	 * @see #setRole_requis_rpc_client(Role_Requis_RPC_Client)
	 * @see client_serveur.Client_serveurPackage#getAttachment_Client_RPC_Role_requis_rpc_client()
	 * @see client_serveur.Role_Requis_RPC_Client#getAttachment_client_rpc
	 * @model opposite="attachment_client_rpc"
	 * @generated
	 */
	Role_Requis_RPC_Client getRole_requis_rpc_client();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_Client_RPC#getRole_requis_rpc_client <em>Role requis rpc client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role requis rpc client</em>' reference.
	 * @see #getRole_requis_rpc_client()
	 * @generated
	 */
	void setRole_requis_rpc_client(Role_Requis_RPC_Client value);
} // Attachment_Client_RPC
