/**
 */
package client_serveur;

import cosa.Role_Fourni;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Fourni Beta SM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Role_Fourni_Beta_SM#getAttachment_beta_sm <em>Attachment beta sm</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getRole_Fourni_Beta_SM()
 * @model
 * @generated
 */
public interface Role_Fourni_Beta_SM extends Role_Fourni {
	/**
	 * Returns the value of the '<em><b>Attachment beta sm</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Attachment_Beta_SM#getRole_fourni_beta_sm <em>Role fourni beta sm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment beta sm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment beta sm</em>' reference.
	 * @see #setAttachment_beta_sm(Attachment_Beta_SM)
	 * @see client_serveur.Client_serveurPackage#getRole_Fourni_Beta_SM_Attachment_beta_sm()
	 * @see client_serveur.Attachment_Beta_SM#getRole_fourni_beta_sm
	 * @model opposite="role_fourni_beta_sm"
	 * @generated
	 */
	Attachment_Beta_SM getAttachment_beta_sm();

	/**
	 * Sets the value of the '{@link client_serveur.Role_Fourni_Beta_SM#getAttachment_beta_sm <em>Attachment beta sm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment beta sm</em>' reference.
	 * @see #getAttachment_beta_sm()
	 * @generated
	 */
	void setAttachment_beta_sm(Attachment_Beta_SM value);

} // Role_Fourni_Beta_SM
