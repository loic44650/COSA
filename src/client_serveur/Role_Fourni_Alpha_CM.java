/**
 */
package client_serveur;

import cosa.Role_Fourni;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Fourni Alpha CM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Role_Fourni_Alpha_CM#getAttachment_alpha_cm <em>Attachment alpha cm</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getRole_Fourni_Alpha_CM()
 * @model
 * @generated
 */
public interface Role_Fourni_Alpha_CM extends Role_Fourni {
	/**
	 * Returns the value of the '<em><b>Attachment alpha cm</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Attachment_Alpha_CM#getRole_fourni_alpha_cm <em>Role fourni alpha cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment alpha cm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment alpha cm</em>' reference.
	 * @see #setAttachment_alpha_cm(Attachment_Alpha_CM)
	 * @see client_serveur.Client_serveurPackage#getRole_Fourni_Alpha_CM_Attachment_alpha_cm()
	 * @see client_serveur.Attachment_Alpha_CM#getRole_fourni_alpha_cm
	 * @model opposite="role_fourni_alpha_cm"
	 * @generated
	 */
	Attachment_Alpha_CM getAttachment_alpha_cm();

	/**
	 * Sets the value of the '{@link client_serveur.Role_Fourni_Alpha_CM#getAttachment_alpha_cm <em>Attachment alpha cm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment alpha cm</em>' reference.
	 * @see #getAttachment_alpha_cm()
	 * @generated
	 */
	void setAttachment_alpha_cm(Attachment_Alpha_CM value);

} // Role_Fourni_Alpha_CM
