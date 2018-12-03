/**
 */
package client_serveur;

import cosa.Role_Requis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Requis SM Beta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Role_Requis_SM_Beta#getAttachment_sm_beta <em>Attachment sm beta</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getRole_Requis_SM_Beta()
 * @model
 * @generated
 */
public interface Role_Requis_SM_Beta extends Role_Requis {
	/**
	 * Returns the value of the '<em><b>Attachment sm beta</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Attachment_SM_Beta#getRole_requis_sm_beta <em>Role requis sm beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment sm beta</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment sm beta</em>' reference.
	 * @see #setAttachment_sm_beta(Attachment_SM_Beta)
	 * @see client_serveur.Client_serveurPackage#getRole_Requis_SM_Beta_Attachment_sm_beta()
	 * @see client_serveur.Attachment_SM_Beta#getRole_requis_sm_beta
	 * @model opposite="role_requis_sm_beta"
	 * @generated
	 */
	Attachment_SM_Beta getAttachment_sm_beta();

	/**
	 * Sets the value of the '{@link client_serveur.Role_Requis_SM_Beta#getAttachment_sm_beta <em>Attachment sm beta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment sm beta</em>' reference.
	 * @see #getAttachment_sm_beta()
	 * @generated
	 */
	void setAttachment_sm_beta(Attachment_SM_Beta value);

} // Role_Requis_SM_Beta
