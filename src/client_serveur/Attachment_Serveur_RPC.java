/**
 */
package client_serveur;

import cosa.Attachment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment Serveur RPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Attachment_Serveur_RPC#getPort_fourni_serveur <em>Port fourni serveur</em>}</li>
 *   <li>{@link client_serveur.Attachment_Serveur_RPC#getRole_requis_rpc_serveur <em>Role requis rpc serveur</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getAttachment_Serveur_RPC()
 * @model
 * @generated
 */
public interface Attachment_Serveur_RPC extends Attachment {
	/**
	 * Returns the value of the '<em><b>Port fourni serveur</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Port_Fourni_Serveur#getAttachment_serveur_rpc <em>Attachment serveur rpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port fourni serveur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port fourni serveur</em>' reference.
	 * @see #setPort_fourni_serveur(Port_Fourni_Serveur)
	 * @see client_serveur.Client_serveurPackage#getAttachment_Serveur_RPC_Port_fourni_serveur()
	 * @see client_serveur.Port_Fourni_Serveur#getAttachment_serveur_rpc
	 * @model opposite="attachment_serveur_rpc"
	 * @generated
	 */
	Port_Fourni_Serveur getPort_fourni_serveur();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_Serveur_RPC#getPort_fourni_serveur <em>Port fourni serveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port fourni serveur</em>' reference.
	 * @see #getPort_fourni_serveur()
	 * @generated
	 */
	void setPort_fourni_serveur(Port_Fourni_Serveur value);

	/**
	 * Returns the value of the '<em><b>Role requis rpc serveur</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Role_Requis_RPC_Serveur#getAttachment_serveur_rpc <em>Attachment serveur rpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role requis rpc serveur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role requis rpc serveur</em>' reference.
	 * @see #setRole_requis_rpc_serveur(Role_Requis_RPC_Serveur)
	 * @see client_serveur.Client_serveurPackage#getAttachment_Serveur_RPC_Role_requis_rpc_serveur()
	 * @see client_serveur.Role_Requis_RPC_Serveur#getAttachment_serveur_rpc
	 * @model opposite="attachment_serveur_rpc"
	 * @generated
	 */
	Role_Requis_RPC_Serveur getRole_requis_rpc_serveur();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_Serveur_RPC#getRole_requis_rpc_serveur <em>Role requis rpc serveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role requis rpc serveur</em>' reference.
	 * @see #getRole_requis_rpc_serveur()
	 * @generated
	 */
	void setRole_requis_rpc_serveur(Role_Requis_RPC_Serveur value);

} // Attachment_Serveur_RPC
