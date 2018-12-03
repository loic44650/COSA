/**
 */
package client_serveur;

import cosa.Port_Requis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Requis Gamma CM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Port_Requis_Gamma_CM#getAttachment_gamma_cm <em>Attachment gamma cm</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getPort_Requis_Gamma_CM()
 * @model
 * @generated
 */
public interface Port_Requis_Gamma_CM extends Port_Requis {
	/**
	 * Returns the value of the '<em><b>Attachment gamma cm</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Attachment_Gamma_CM#getPort_requis_gamma_cm <em>Port requis gamma cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment gamma cm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment gamma cm</em>' reference.
	 * @see #setAttachment_gamma_cm(Attachment_Gamma_CM)
	 * @see client_serveur.Client_serveurPackage#getPort_Requis_Gamma_CM_Attachment_gamma_cm()
	 * @see client_serveur.Attachment_Gamma_CM#getPort_requis_gamma_cm
	 * @model opposite="port_requis_gamma_cm"
	 * @generated
	 */
	Attachment_Gamma_CM getAttachment_gamma_cm();

	/**
	 * Sets the value of the '{@link client_serveur.Port_Requis_Gamma_CM#getAttachment_gamma_cm <em>Attachment gamma cm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment gamma cm</em>' reference.
	 * @see #getAttachment_gamma_cm()
	 * @generated
	 */
	void setAttachment_gamma_cm(Attachment_Gamma_CM value);

} // Port_Requis_Gamma_CM
