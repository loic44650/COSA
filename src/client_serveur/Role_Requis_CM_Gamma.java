/**
 */
package client_serveur;

import cosa.Role_Requis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Requis CM Gamma</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Role_Requis_CM_Gamma#getAttachment_cm_gamma <em>Attachment cm gamma</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getRole_Requis_CM_Gamma()
 * @model
 * @generated
 */
public interface Role_Requis_CM_Gamma extends Role_Requis {
	/**
	 * Returns the value of the '<em><b>Attachment cm gamma</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Attachment_CM_Gamma#getRole_requis_cm_gamma <em>Role requis cm gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment cm gamma</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment cm gamma</em>' reference.
	 * @see #setAttachment_cm_gamma(Attachment_CM_Gamma)
	 * @see client_serveur.Client_serveurPackage#getRole_Requis_CM_Gamma_Attachment_cm_gamma()
	 * @see client_serveur.Attachment_CM_Gamma#getRole_requis_cm_gamma
	 * @model opposite="role_requis_cm_gamma"
	 * @generated
	 */
	Attachment_CM_Gamma getAttachment_cm_gamma();

	/**
	 * Sets the value of the '{@link client_serveur.Role_Requis_CM_Gamma#getAttachment_cm_gamma <em>Attachment cm gamma</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment cm gamma</em>' reference.
	 * @see #getAttachment_cm_gamma()
	 * @generated
	 */
	void setAttachment_cm_gamma(Attachment_CM_Gamma value);

} // Role_Requis_CM_Gamma
