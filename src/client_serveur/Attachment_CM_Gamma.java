/**
 */
package client_serveur;

import cosa.Attachment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment CM Gamma</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Attachment_CM_Gamma#getRole_requis_cm_gamma <em>Role requis cm gamma</em>}</li>
 *   <li>{@link client_serveur.Attachment_CM_Gamma#getPort_fourni_cm_gamma <em>Port fourni cm gamma</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getAttachment_CM_Gamma()
 * @model
 * @generated
 */
public interface Attachment_CM_Gamma extends Attachment {
	/**
	 * Returns the value of the '<em><b>Role requis cm gamma</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Role_Requis_CM_Gamma#getAttachment_cm_gamma <em>Attachment cm gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role requis cm gamma</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role requis cm gamma</em>' reference.
	 * @see #setRole_requis_cm_gamma(Role_Requis_CM_Gamma)
	 * @see client_serveur.Client_serveurPackage#getAttachment_CM_Gamma_Role_requis_cm_gamma()
	 * @see client_serveur.Role_Requis_CM_Gamma#getAttachment_cm_gamma
	 * @model opposite="attachment_cm_gamma"
	 * @generated
	 */
	Role_Requis_CM_Gamma getRole_requis_cm_gamma();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_CM_Gamma#getRole_requis_cm_gamma <em>Role requis cm gamma</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role requis cm gamma</em>' reference.
	 * @see #getRole_requis_cm_gamma()
	 * @generated
	 */
	void setRole_requis_cm_gamma(Role_Requis_CM_Gamma value);

	/**
	 * Returns the value of the '<em><b>Port fourni cm gamma</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Port_Fourni_CM_Gamma#getAttachment_cm_gamma <em>Attachment cm gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port fourni cm gamma</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port fourni cm gamma</em>' reference.
	 * @see #setPort_fourni_cm_gamma(Port_Fourni_CM_Gamma)
	 * @see client_serveur.Client_serveurPackage#getAttachment_CM_Gamma_Port_fourni_cm_gamma()
	 * @see client_serveur.Port_Fourni_CM_Gamma#getAttachment_cm_gamma
	 * @model opposite="attachment_cm_gamma"
	 * @generated
	 */
	Port_Fourni_CM_Gamma getPort_fourni_cm_gamma();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_CM_Gamma#getPort_fourni_cm_gamma <em>Port fourni cm gamma</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port fourni cm gamma</em>' reference.
	 * @see #getPort_fourni_cm_gamma()
	 * @generated
	 */
	void setPort_fourni_cm_gamma(Port_Fourni_CM_Gamma value);

} // Attachment_CM_Gamma
