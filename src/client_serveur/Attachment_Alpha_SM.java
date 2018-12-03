/**
 */
package client_serveur;

import cosa.Attachment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment Alpha SM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Attachment_Alpha_SM#getPort_requis_alpha_sm <em>Port requis alpha sm</em>}</li>
 *   <li>{@link client_serveur.Attachment_Alpha_SM#getRole_fourni_alpha_sm <em>Role fourni alpha sm</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getAttachment_Alpha_SM()
 * @model
 * @generated
 */
public interface Attachment_Alpha_SM extends Attachment {
	/**
	 * Returns the value of the '<em><b>Port requis alpha sm</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Port_Requis_Alpha_SM#getAttachment_alpha_sm <em>Attachment alpha sm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port requis alpha sm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port requis alpha sm</em>' reference.
	 * @see #setPort_requis_alpha_sm(Port_Requis_Alpha_SM)
	 * @see client_serveur.Client_serveurPackage#getAttachment_Alpha_SM_Port_requis_alpha_sm()
	 * @see client_serveur.Port_Requis_Alpha_SM#getAttachment_alpha_sm
	 * @model opposite="attachment_alpha_sm"
	 * @generated
	 */
	Port_Requis_Alpha_SM getPort_requis_alpha_sm();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_Alpha_SM#getPort_requis_alpha_sm <em>Port requis alpha sm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port requis alpha sm</em>' reference.
	 * @see #getPort_requis_alpha_sm()
	 * @generated
	 */
	void setPort_requis_alpha_sm(Port_Requis_Alpha_SM value);

	/**
	 * Returns the value of the '<em><b>Role fourni alpha sm</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Role_Fourni_Alpha_SM#getAttachment_alpha_sm <em>Attachment alpha sm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role fourni alpha sm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role fourni alpha sm</em>' reference.
	 * @see #setRole_fourni_alpha_sm(Role_Fourni_Alpha_SM)
	 * @see client_serveur.Client_serveurPackage#getAttachment_Alpha_SM_Role_fourni_alpha_sm()
	 * @see client_serveur.Role_Fourni_Alpha_SM#getAttachment_alpha_sm
	 * @model opposite="attachment_alpha_sm"
	 * @generated
	 */
	Role_Fourni_Alpha_SM getRole_fourni_alpha_sm();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_Alpha_SM#getRole_fourni_alpha_sm <em>Role fourni alpha sm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role fourni alpha sm</em>' reference.
	 * @see #getRole_fourni_alpha_sm()
	 * @generated
	 */
	void setRole_fourni_alpha_sm(Role_Fourni_Alpha_SM value);

} // Attachment_Alpha_SM
