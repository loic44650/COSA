/**
 */
package client_serveur;

import cosa.Attachment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment CM Alpha</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Attachment_CM_Alpha#getRole_requis_cm_alpha <em>Role requis cm alpha</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getAttachment_CM_Alpha()
 * @model
 * @generated
 */
public interface Attachment_CM_Alpha extends Attachment {
	/**
	 * Returns the value of the '<em><b>Role requis cm alpha</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Role_Requis_CM_Alpha#getAttachment_cm_alpha <em>Attachment cm alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role requis cm alpha</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role requis cm alpha</em>' reference.
	 * @see #setRole_requis_cm_alpha(Role_Requis_CM_Alpha)
	 * @see client_serveur.Client_serveurPackage#getAttachment_CM_Alpha_Role_requis_cm_alpha()
	 * @see client_serveur.Role_Requis_CM_Alpha#getAttachment_cm_alpha
	 * @model opposite="attachment_cm_alpha"
	 * @generated
	 */
	Role_Requis_CM_Alpha getRole_requis_cm_alpha();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_CM_Alpha#getRole_requis_cm_alpha <em>Role requis cm alpha</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role requis cm alpha</em>' reference.
	 * @see #getRole_requis_cm_alpha()
	 * @generated
	 */
	void setRole_requis_cm_alpha(Role_Requis_CM_Alpha value);

} // Attachment_CM_Alpha
