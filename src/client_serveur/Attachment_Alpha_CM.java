/**
 */
package client_serveur;

import cosa.Attachment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment Alpha CM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Attachment_Alpha_CM#getPort_requis_alpha_cm <em>Port requis alpha cm</em>}</li>
 *   <li>{@link client_serveur.Attachment_Alpha_CM#getRole_fourni_alpha_cm <em>Role fourni alpha cm</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getAttachment_Alpha_CM()
 * @model
 * @generated
 */
public interface Attachment_Alpha_CM extends Attachment {
	/**
	 * Returns the value of the '<em><b>Port requis alpha cm</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Port_Requis_Alpha_CM#getAttachment_alpha_cm <em>Attachment alpha cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port requis alpha cm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port requis alpha cm</em>' reference.
	 * @see #setPort_requis_alpha_cm(Port_Requis_Alpha_CM)
	 * @see client_serveur.Client_serveurPackage#getAttachment_Alpha_CM_Port_requis_alpha_cm()
	 * @see client_serveur.Port_Requis_Alpha_CM#getAttachment_alpha_cm
	 * @model opposite="attachment_alpha_cm"
	 * @generated
	 */
	Port_Requis_Alpha_CM getPort_requis_alpha_cm();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_Alpha_CM#getPort_requis_alpha_cm <em>Port requis alpha cm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port requis alpha cm</em>' reference.
	 * @see #getPort_requis_alpha_cm()
	 * @generated
	 */
	void setPort_requis_alpha_cm(Port_Requis_Alpha_CM value);

	/**
	 * Returns the value of the '<em><b>Role fourni alpha cm</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Role_Fourni_Alpha_CM#getAttachment_alpha_cm <em>Attachment alpha cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role fourni alpha cm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role fourni alpha cm</em>' reference.
	 * @see #setRole_fourni_alpha_cm(Role_Fourni_Alpha_CM)
	 * @see client_serveur.Client_serveurPackage#getAttachment_Alpha_CM_Role_fourni_alpha_cm()
	 * @see client_serveur.Role_Fourni_Alpha_CM#getAttachment_alpha_cm
	 * @model opposite="attachment_alpha_cm"
	 * @generated
	 */
	Role_Fourni_Alpha_CM getRole_fourni_alpha_cm();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_Alpha_CM#getRole_fourni_alpha_cm <em>Role fourni alpha cm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role fourni alpha cm</em>' reference.
	 * @see #getRole_fourni_alpha_cm()
	 * @generated
	 */
	void setRole_fourni_alpha_cm(Role_Fourni_Alpha_CM value);

} // Attachment_Alpha_CM
