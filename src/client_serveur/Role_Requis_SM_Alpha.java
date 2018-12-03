/**
 */
package client_serveur;

import cosa.Role_Requis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Requis SM Alpha</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Role_Requis_SM_Alpha#getAttachment_sm_alpha <em>Attachment sm alpha</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getRole_Requis_SM_Alpha()
 * @model
 * @generated
 */
public interface Role_Requis_SM_Alpha extends Role_Requis {
	/**
	 * Returns the value of the '<em><b>Attachment sm alpha</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Attachment_SM_Alpha#getRole_requis_sm_alpha <em>Role requis sm alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment sm alpha</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment sm alpha</em>' reference.
	 * @see #setAttachment_sm_alpha(Attachment_SM_Alpha)
	 * @see client_serveur.Client_serveurPackage#getRole_Requis_SM_Alpha_Attachment_sm_alpha()
	 * @see client_serveur.Attachment_SM_Alpha#getRole_requis_sm_alpha
	 * @model opposite="role_requis_sm_alpha"
	 * @generated
	 */
	Attachment_SM_Alpha getAttachment_sm_alpha();

	/**
	 * Sets the value of the '{@link client_serveur.Role_Requis_SM_Alpha#getAttachment_sm_alpha <em>Attachment sm alpha</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment sm alpha</em>' reference.
	 * @see #getAttachment_sm_alpha()
	 * @generated
	 */
	void setAttachment_sm_alpha(Attachment_SM_Alpha value);

} // Role_Requis_SM_Alpha
