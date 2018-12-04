/**
 */
package client_serveur;

import cosa.Role_Requis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Requis RPC Serveur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Role_Requis_RPC_Serveur#getAttachment_serveur_rpc <em>Attachment serveur rpc</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getRole_Requis_RPC_Serveur()
 * @model
 * @generated
 */
public interface Role_Requis_RPC_Serveur extends Role_Requis {
	/**
	 * Returns the value of the '<em><b>Attachment serveur rpc</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Attachment_Serveur_RPC#getRole_requis_rpc_serveur <em>Role requis rpc serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment serveur rpc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment serveur rpc</em>' reference.
	 * @see #setAttachment_serveur_rpc(Attachment_Serveur_RPC)
	 * @see client_serveur.Client_serveurPackage#getRole_Requis_RPC_Serveur_Attachment_serveur_rpc()
	 * @see client_serveur.Attachment_Serveur_RPC#getRole_requis_rpc_serveur
	 * @model opposite="role_requis_rpc_serveur"
	 * @generated
	 */
	Attachment_Serveur_RPC getAttachment_serveur_rpc();

	/**
	 * Sets the value of the '{@link client_serveur.Role_Requis_RPC_Serveur#getAttachment_serveur_rpc <em>Attachment serveur rpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment serveur rpc</em>' reference.
	 * @see #getAttachment_serveur_rpc()
	 * @generated
	 */
	void setAttachment_serveur_rpc(Attachment_Serveur_RPC value);

} // Role_Requis_RPC_Serveur
