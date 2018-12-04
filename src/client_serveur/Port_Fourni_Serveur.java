/**
 */
package client_serveur;

import cosa.Port_Fourni;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Fourni Serveur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Port_Fourni_Serveur#getAttachment_serveur_rpc <em>Attachment serveur rpc</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getPort_Fourni_Serveur()
 * @model
 * @generated
 */
public interface Port_Fourni_Serveur extends Port_Fourni {
	/**
	 * Returns the value of the '<em><b>Attachment serveur rpc</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Attachment_Serveur_RPC#getPort_fourni_serveur <em>Port fourni serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment serveur rpc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment serveur rpc</em>' reference.
	 * @see #setAttachment_serveur_rpc(Attachment_Serveur_RPC)
	 * @see client_serveur.Client_serveurPackage#getPort_Fourni_Serveur_Attachment_serveur_rpc()
	 * @see client_serveur.Attachment_Serveur_RPC#getPort_fourni_serveur
	 * @model opposite="port_fourni_serveur"
	 * @generated
	 */
	Attachment_Serveur_RPC getAttachment_serveur_rpc();

	/**
	 * Sets the value of the '{@link client_serveur.Port_Fourni_Serveur#getAttachment_serveur_rpc <em>Attachment serveur rpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment serveur rpc</em>' reference.
	 * @see #getAttachment_serveur_rpc()
	 * @generated
	 */
	void setAttachment_serveur_rpc(Attachment_Serveur_RPC value);

} // Port_Fourni_Serveur
