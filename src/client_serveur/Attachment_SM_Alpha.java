/**
 */
package client_serveur;

import cosa.Attachment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment SM Alpha</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Attachment_SM_Alpha#getPort_fourni_sm_alpha <em>Port fourni sm alpha</em>}</li>
 *   <li>{@link client_serveur.Attachment_SM_Alpha#getRole_requis_sm_alpha <em>Role requis sm alpha</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getAttachment_SM_Alpha()
 * @model
 * @generated
 */
public interface Attachment_SM_Alpha extends Attachment {
	/**
	 * Returns the value of the '<em><b>Port fourni sm alpha</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Port_Fourni_SM_Alpha#getAttachment_sm_alpha <em>Attachment sm alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port fourni sm alpha</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port fourni sm alpha</em>' reference.
	 * @see #setPort_fourni_sm_alpha(Port_Fourni_SM_Alpha)
	 * @see client_serveur.Client_serveurPackage#getAttachment_SM_Alpha_Port_fourni_sm_alpha()
	 * @see client_serveur.Port_Fourni_SM_Alpha#getAttachment_sm_alpha
	 * @model opposite="attachment_sm_alpha"
	 * @generated
	 */
	Port_Fourni_SM_Alpha getPort_fourni_sm_alpha();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_SM_Alpha#getPort_fourni_sm_alpha <em>Port fourni sm alpha</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port fourni sm alpha</em>' reference.
	 * @see #getPort_fourni_sm_alpha()
	 * @generated
	 */
	void setPort_fourni_sm_alpha(Port_Fourni_SM_Alpha value);

	/**
	 * Returns the value of the '<em><b>Role requis sm alpha</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Role_Requis_SM_Alpha#getAttachment_sm_alpha <em>Attachment sm alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role requis sm alpha</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role requis sm alpha</em>' reference.
	 * @see #setRole_requis_sm_alpha(Role_Requis_SM_Alpha)
	 * @see client_serveur.Client_serveurPackage#getAttachment_SM_Alpha_Role_requis_sm_alpha()
	 * @see client_serveur.Role_Requis_SM_Alpha#getAttachment_sm_alpha
	 * @model opposite="attachment_sm_alpha"
	 * @generated
	 */
	Role_Requis_SM_Alpha getRole_requis_sm_alpha();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_SM_Alpha#getRole_requis_sm_alpha <em>Role requis sm alpha</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role requis sm alpha</em>' reference.
	 * @see #getRole_requis_sm_alpha()
	 * @generated
	 */
	void setRole_requis_sm_alpha(Role_Requis_SM_Alpha value);

} // Attachment_SM_Alpha
