/**
 */
package client_serveur;

import cosa.Attachment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment SM Beta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Attachment_SM_Beta#getPort_fourni_sm_beta <em>Port fourni sm beta</em>}</li>
 *   <li>{@link client_serveur.Attachment_SM_Beta#getRole_requis_sm_beta <em>Role requis sm beta</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getAttachment_SM_Beta()
 * @model
 * @generated
 */
public interface Attachment_SM_Beta extends Attachment {
	/**
	 * Returns the value of the '<em><b>Port fourni sm beta</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Port_Fourni_SM_Beta#getAttachment_sm_beta <em>Attachment sm beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port fourni sm beta</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port fourni sm beta</em>' reference.
	 * @see #setPort_fourni_sm_beta(Port_Fourni_SM_Beta)
	 * @see client_serveur.Client_serveurPackage#getAttachment_SM_Beta_Port_fourni_sm_beta()
	 * @see client_serveur.Port_Fourni_SM_Beta#getAttachment_sm_beta
	 * @model opposite="attachment_sm_beta"
	 * @generated
	 */
	Port_Fourni_SM_Beta getPort_fourni_sm_beta();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_SM_Beta#getPort_fourni_sm_beta <em>Port fourni sm beta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port fourni sm beta</em>' reference.
	 * @see #getPort_fourni_sm_beta()
	 * @generated
	 */
	void setPort_fourni_sm_beta(Port_Fourni_SM_Beta value);

	/**
	 * Returns the value of the '<em><b>Role requis sm beta</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Role_Requis_SM_Beta#getAttachment_sm_beta <em>Attachment sm beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role requis sm beta</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role requis sm beta</em>' reference.
	 * @see #setRole_requis_sm_beta(Role_Requis_SM_Beta)
	 * @see client_serveur.Client_serveurPackage#getAttachment_SM_Beta_Role_requis_sm_beta()
	 * @see client_serveur.Role_Requis_SM_Beta#getAttachment_sm_beta
	 * @model opposite="attachment_sm_beta"
	 * @generated
	 */
	Role_Requis_SM_Beta getRole_requis_sm_beta();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_SM_Beta#getRole_requis_sm_beta <em>Role requis sm beta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role requis sm beta</em>' reference.
	 * @see #getRole_requis_sm_beta()
	 * @generated
	 */
	void setRole_requis_sm_beta(Role_Requis_SM_Beta value);

} // Attachment_SM_Beta
