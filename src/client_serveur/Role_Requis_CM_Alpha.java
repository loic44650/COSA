/**
 */
package client_serveur;

import cosa.Role_Requis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Requis CM Alpha</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Role_Requis_CM_Alpha#getAttachment_cm_alpha <em>Attachment cm alpha</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getRole_Requis_CM_Alpha()
 * @model
 * @generated
 */
public interface Role_Requis_CM_Alpha extends Role_Requis {
	/**
	 * Returns the value of the '<em><b>Attachment cm alpha</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Attachment_CM_Alpha#getRole_requis_cm_alpha <em>Role requis cm alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment cm alpha</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment cm alpha</em>' reference.
	 * @see #setAttachment_cm_alpha(Attachment_CM_Alpha)
	 * @see client_serveur.Client_serveurPackage#getRole_Requis_CM_Alpha_Attachment_cm_alpha()
	 * @see client_serveur.Attachment_CM_Alpha#getRole_requis_cm_alpha
	 * @model opposite="role_requis_cm_alpha"
	 * @generated
	 */
	Attachment_CM_Alpha getAttachment_cm_alpha();

	/**
	 * Sets the value of the '{@link client_serveur.Role_Requis_CM_Alpha#getAttachment_cm_alpha <em>Attachment cm alpha</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment cm alpha</em>' reference.
	 * @see #getAttachment_cm_alpha()
	 * @generated
	 */
	void setAttachment_cm_alpha(Attachment_CM_Alpha value);

} // Role_Requis_CM_Alpha
