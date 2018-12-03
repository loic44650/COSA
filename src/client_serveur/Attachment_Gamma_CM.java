/**
 */
package client_serveur;

import cosa.Attachment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment Gamma CM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Attachment_Gamma_CM#getRole_fourni_gamma_cm <em>Role fourni gamma cm</em>}</li>
 *   <li>{@link client_serveur.Attachment_Gamma_CM#getPort_requis_gamma_cm <em>Port requis gamma cm</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getAttachment_Gamma_CM()
 * @model
 * @generated
 */
public interface Attachment_Gamma_CM extends Attachment {
	/**
	 * Returns the value of the '<em><b>Role fourni gamma cm</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Role_Fourni_Gamma_CM#getAttachment_gamma_cm <em>Attachment gamma cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role fourni gamma cm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role fourni gamma cm</em>' reference.
	 * @see #setRole_fourni_gamma_cm(Role_Fourni_Gamma_CM)
	 * @see client_serveur.Client_serveurPackage#getAttachment_Gamma_CM_Role_fourni_gamma_cm()
	 * @see client_serveur.Role_Fourni_Gamma_CM#getAttachment_gamma_cm
	 * @model opposite="attachment_gamma_cm"
	 * @generated
	 */
	Role_Fourni_Gamma_CM getRole_fourni_gamma_cm();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_Gamma_CM#getRole_fourni_gamma_cm <em>Role fourni gamma cm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role fourni gamma cm</em>' reference.
	 * @see #getRole_fourni_gamma_cm()
	 * @generated
	 */
	void setRole_fourni_gamma_cm(Role_Fourni_Gamma_CM value);

	/**
	 * Returns the value of the '<em><b>Port requis gamma cm</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Port_Requis_Gamma_CM#getAttachment_gamma_cm <em>Attachment gamma cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port requis gamma cm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port requis gamma cm</em>' reference.
	 * @see #setPort_requis_gamma_cm(Port_Requis_Gamma_CM)
	 * @see client_serveur.Client_serveurPackage#getAttachment_Gamma_CM_Port_requis_gamma_cm()
	 * @see client_serveur.Port_Requis_Gamma_CM#getAttachment_gamma_cm
	 * @model opposite="attachment_gamma_cm"
	 * @generated
	 */
	Port_Requis_Gamma_CM getPort_requis_gamma_cm();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_Gamma_CM#getPort_requis_gamma_cm <em>Port requis gamma cm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port requis gamma cm</em>' reference.
	 * @see #getPort_requis_gamma_cm()
	 * @generated
	 */
	void setPort_requis_gamma_cm(Port_Requis_Gamma_CM value);

} // Attachment_Gamma_CM
