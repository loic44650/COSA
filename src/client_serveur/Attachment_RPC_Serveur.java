/**
 */
package client_serveur;

import cosa.Attachment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment RPC Serveur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Attachment_RPC_Serveur#getRole_fourni_rpc_serveur <em>Role fourni rpc serveur</em>}</li>
 *   <li>{@link client_serveur.Attachment_RPC_Serveur#getPort_requis_serveur <em>Port requis serveur</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getAttachment_RPC_Serveur()
 * @model
 * @generated
 */
public interface Attachment_RPC_Serveur extends Attachment {
	/**
	 * Returns the value of the '<em><b>Role fourni rpc serveur</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Role_Fourni_RPC_Serveur#getAttachment_rpc_serveur <em>Attachment rpc serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role fourni rpc serveur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role fourni rpc serveur</em>' reference.
	 * @see #setRole_fourni_rpc_serveur(Role_Fourni_RPC_Serveur)
	 * @see client_serveur.Client_serveurPackage#getAttachment_RPC_Serveur_Role_fourni_rpc_serveur()
	 * @see client_serveur.Role_Fourni_RPC_Serveur#getAttachment_rpc_serveur
	 * @model opposite="attachment_rpc_serveur"
	 * @generated
	 */
	Role_Fourni_RPC_Serveur getRole_fourni_rpc_serveur();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_RPC_Serveur#getRole_fourni_rpc_serveur <em>Role fourni rpc serveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role fourni rpc serveur</em>' reference.
	 * @see #getRole_fourni_rpc_serveur()
	 * @generated
	 */
	void setRole_fourni_rpc_serveur(Role_Fourni_RPC_Serveur value);

	/**
	 * Returns the value of the '<em><b>Port requis serveur</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Port_Requis_Serveur#getAttachment_rpc_serveur <em>Attachment rpc serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port requis serveur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port requis serveur</em>' reference.
	 * @see #setPort_requis_serveur(Port_Requis_Serveur)
	 * @see client_serveur.Client_serveurPackage#getAttachment_RPC_Serveur_Port_requis_serveur()
	 * @see client_serveur.Port_Requis_Serveur#getAttachment_rpc_serveur
	 * @model opposite="attachment_rpc_serveur"
	 * @generated
	 */
	Port_Requis_Serveur getPort_requis_serveur();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_RPC_Serveur#getPort_requis_serveur <em>Port requis serveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port requis serveur</em>' reference.
	 * @see #getPort_requis_serveur()
	 * @generated
	 */
	void setPort_requis_serveur(Port_Requis_Serveur value);

} // Attachment_RPC_Serveur
