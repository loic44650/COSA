/**
 */
package client_serveur;

import cosa.Attachment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment Beta SM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Attachment_Beta_SM#getPort_requis_beta_sm <em>Port requis beta sm</em>}</li>
 *   <li>{@link client_serveur.Attachment_Beta_SM#getRole_fourni_beta_sm <em>Role fourni beta sm</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getAttachment_Beta_SM()
 * @model
 * @generated
 */
public interface Attachment_Beta_SM extends Attachment {
	/**
	 * Returns the value of the '<em><b>Port requis beta sm</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Port_Requis_Beta_SM#getAttachment_beta_sm <em>Attachment beta sm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port requis beta sm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port requis beta sm</em>' reference.
	 * @see #setPort_requis_beta_sm(Port_Requis_Beta_SM)
	 * @see client_serveur.Client_serveurPackage#getAttachment_Beta_SM_Port_requis_beta_sm()
	 * @see client_serveur.Port_Requis_Beta_SM#getAttachment_beta_sm
	 * @model opposite="attachment_beta_sm"
	 * @generated
	 */
	Port_Requis_Beta_SM getPort_requis_beta_sm();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_Beta_SM#getPort_requis_beta_sm <em>Port requis beta sm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port requis beta sm</em>' reference.
	 * @see #getPort_requis_beta_sm()
	 * @generated
	 */
	void setPort_requis_beta_sm(Port_Requis_Beta_SM value);

	/**
	 * Returns the value of the '<em><b>Role fourni beta sm</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Role_Fourni_Beta_SM#getAttachment_beta_sm <em>Attachment beta sm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role fourni beta sm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role fourni beta sm</em>' reference.
	 * @see #setRole_fourni_beta_sm(Role_Fourni_Beta_SM)
	 * @see client_serveur.Client_serveurPackage#getAttachment_Beta_SM_Role_fourni_beta_sm()
	 * @see client_serveur.Role_Fourni_Beta_SM#getAttachment_beta_sm
	 * @model opposite="attachment_beta_sm"
	 * @generated
	 */
	Role_Fourni_Beta_SM getRole_fourni_beta_sm();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_Beta_SM#getRole_fourni_beta_sm <em>Role fourni beta sm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role fourni beta sm</em>' reference.
	 * @see #getRole_fourni_beta_sm()
	 * @generated
	 */
	void setRole_fourni_beta_sm(Role_Fourni_Beta_SM value);

} // Attachment_Beta_SM
