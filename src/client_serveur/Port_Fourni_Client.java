/**
 */
package client_serveur;

import cosa.Port_Fourni;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Fourni Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Port_Fourni_Client#getAttachment_client_rpc <em>Attachment client rpc</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getPort_Fourni_Client()
 * @model
 * @generated
 */
public interface Port_Fourni_Client extends Port_Fourni {
	/**
	 * Returns the value of the '<em><b>Attachment client rpc</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Attachment_Client_RPC#getPort_fourni_client <em>Port fourni client</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment client rpc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment client rpc</em>' reference.
	 * @see #setAttachment_client_rpc(Attachment_Client_RPC)
	 * @see client_serveur.Client_serveurPackage#getPort_Fourni_Client_Attachment_client_rpc()
	 * @see client_serveur.Attachment_Client_RPC#getPort_fourni_client
	 * @model opposite="port_fourni_client"
	 * @generated
	 */
	Attachment_Client_RPC getAttachment_client_rpc();

	/**
	 * Sets the value of the '{@link client_serveur.Port_Fourni_Client#getAttachment_client_rpc <em>Attachment client rpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment client rpc</em>' reference.
	 * @see #getAttachment_client_rpc()
	 * @generated
	 */
	void setAttachment_client_rpc(Attachment_Client_RPC value);

} // Port_Fourni_Client
