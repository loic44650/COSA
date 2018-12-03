/**
 */
package client_serveur;

import cosa.Port_Requis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Requis Alpha CM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Port_Requis_Alpha_CM#getAttachment_alpha_cm <em>Attachment alpha cm</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getPort_Requis_Alpha_CM()
 * @model
 * @generated
 */
public interface Port_Requis_Alpha_CM extends Port_Requis {
	/**
	 * Returns the value of the '<em><b>Attachment alpha cm</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Attachment_Alpha_CM#getPort_requis_alpha_cm <em>Port requis alpha cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment alpha cm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment alpha cm</em>' reference.
	 * @see #setAttachment_alpha_cm(Attachment_Alpha_CM)
	 * @see client_serveur.Client_serveurPackage#getPort_Requis_Alpha_CM_Attachment_alpha_cm()
	 * @see client_serveur.Attachment_Alpha_CM#getPort_requis_alpha_cm
	 * @model opposite="port_requis_alpha_cm"
	 * @generated
	 */
	Attachment_Alpha_CM getAttachment_alpha_cm();

	/**
	 * Sets the value of the '{@link client_serveur.Port_Requis_Alpha_CM#getAttachment_alpha_cm <em>Attachment alpha cm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment alpha cm</em>' reference.
	 * @see #getAttachment_alpha_cm()
	 * @generated
	 */
	void setAttachment_alpha_cm(Attachment_Alpha_CM value);

} // Port_Requis_Alpha_CM
