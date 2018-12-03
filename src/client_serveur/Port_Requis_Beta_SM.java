/**
 */
package client_serveur;

import cosa.Port_Requis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Requis Beta SM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Port_Requis_Beta_SM#getAttachment_beta_sm <em>Attachment beta sm</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getPort_Requis_Beta_SM()
 * @model
 * @generated
 */
public interface Port_Requis_Beta_SM extends Port_Requis {
	/**
	 * Returns the value of the '<em><b>Attachment beta sm</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Attachment_Beta_SM#getPort_requis_beta_sm <em>Port requis beta sm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment beta sm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment beta sm</em>' reference.
	 * @see #setAttachment_beta_sm(Attachment_Beta_SM)
	 * @see client_serveur.Client_serveurPackage#getPort_Requis_Beta_SM_Attachment_beta_sm()
	 * @see client_serveur.Attachment_Beta_SM#getPort_requis_beta_sm
	 * @model opposite="port_requis_beta_sm"
	 * @generated
	 */
	Attachment_Beta_SM getAttachment_beta_sm();

	/**
	 * Sets the value of the '{@link client_serveur.Port_Requis_Beta_SM#getAttachment_beta_sm <em>Attachment beta sm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment beta sm</em>' reference.
	 * @see #getAttachment_beta_sm()
	 * @generated
	 */
	void setAttachment_beta_sm(Attachment_Beta_SM value);

} // Port_Requis_Beta_SM
