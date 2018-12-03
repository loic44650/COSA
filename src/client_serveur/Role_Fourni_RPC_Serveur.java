/**
 */
package client_serveur;

import cosa.Role_Fourni;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Fourni RPC Serveur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Role_Fourni_RPC_Serveur#getAttachment_rpc_serveur <em>Attachment rpc serveur</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getRole_Fourni_RPC_Serveur()
 * @model
 * @generated
 */
public interface Role_Fourni_RPC_Serveur extends Role_Fourni {
	/**
	 * Returns the value of the '<em><b>Attachment rpc serveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment rpc serveur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment rpc serveur</em>' reference.
	 * @see #setAttachment_rpc_serveur(Attachment_RPC_Serveur)
	 * @see client_serveur.Client_serveurPackage#getRole_Fourni_RPC_Serveur_Attachment_rpc_serveur()
	 * @model
	 * @generated
	 */
	Attachment_RPC_Serveur getAttachment_rpc_serveur();

	/**
	 * Sets the value of the '{@link client_serveur.Role_Fourni_RPC_Serveur#getAttachment_rpc_serveur <em>Attachment rpc serveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment rpc serveur</em>' reference.
	 * @see #getAttachment_rpc_serveur()
	 * @generated
	 */
	void setAttachment_rpc_serveur(Attachment_RPC_Serveur value);

} // Role_Fourni_RPC_Serveur
