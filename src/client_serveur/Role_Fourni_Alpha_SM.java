/**
 */
package client_serveur;

import cosa.Role_Fourni;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Fourni Alpha SM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Role_Fourni_Alpha_SM#getAttachment_alpha_sm <em>Attachment alpha sm</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getRole_Fourni_Alpha_SM()
 * @model
 * @generated
 */
public interface Role_Fourni_Alpha_SM extends Role_Fourni {
	/**
	 * Returns the value of the '<em><b>Attachment alpha sm</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Attachment_Alpha_SM#getRole_fourni_alpha_sm <em>Role fourni alpha sm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment alpha sm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment alpha sm</em>' reference.
	 * @see #setAttachment_alpha_sm(Attachment_Alpha_SM)
	 * @see client_serveur.Client_serveurPackage#getRole_Fourni_Alpha_SM_Attachment_alpha_sm()
	 * @see client_serveur.Attachment_Alpha_SM#getRole_fourni_alpha_sm
	 * @model opposite="role_fourni_alpha_sm"
	 * @generated
	 */
	Attachment_Alpha_SM getAttachment_alpha_sm();

	/**
	 * Sets the value of the '{@link client_serveur.Role_Fourni_Alpha_SM#getAttachment_alpha_sm <em>Attachment alpha sm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment alpha sm</em>' reference.
	 * @see #getAttachment_alpha_sm()
	 * @generated
	 */
	void setAttachment_alpha_sm(Attachment_Alpha_SM value);

} // Role_Fourni_Alpha_SM
