/**
 */
package client_serveur;

import cosa.Attachment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment Gamma DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Attachment_Gamma_DB#getRole_fourni_gamma_db <em>Role fourni gamma db</em>}</li>
 *   <li>{@link client_serveur.Attachment_Gamma_DB#getPort_requis_gamma_db <em>Port requis gamma db</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getAttachment_Gamma_DB()
 * @model
 * @generated
 */
public interface Attachment_Gamma_DB extends Attachment {
	/**
	 * Returns the value of the '<em><b>Role fourni gamma db</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Role_Fourni_Gamma_DB#getAttachment_gamma_db <em>Attachment gamma db</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role fourni gamma db</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role fourni gamma db</em>' reference.
	 * @see #setRole_fourni_gamma_db(Role_Fourni_Gamma_DB)
	 * @see client_serveur.Client_serveurPackage#getAttachment_Gamma_DB_Role_fourni_gamma_db()
	 * @see client_serveur.Role_Fourni_Gamma_DB#getAttachment_gamma_db
	 * @model opposite="attachment_gamma_db"
	 * @generated
	 */
	Role_Fourni_Gamma_DB getRole_fourni_gamma_db();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_Gamma_DB#getRole_fourni_gamma_db <em>Role fourni gamma db</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role fourni gamma db</em>' reference.
	 * @see #getRole_fourni_gamma_db()
	 * @generated
	 */
	void setRole_fourni_gamma_db(Role_Fourni_Gamma_DB value);

	/**
	 * Returns the value of the '<em><b>Port requis gamma db</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Port_Requis_Gamma_DB#getAttachment_gamma_db <em>Attachment gamma db</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port requis gamma db</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port requis gamma db</em>' reference.
	 * @see #setPort_requis_gamma_db(Port_Requis_Gamma_DB)
	 * @see client_serveur.Client_serveurPackage#getAttachment_Gamma_DB_Port_requis_gamma_db()
	 * @see client_serveur.Port_Requis_Gamma_DB#getAttachment_gamma_db
	 * @model opposite="attachment_gamma_db"
	 * @generated
	 */
	Port_Requis_Gamma_DB getPort_requis_gamma_db();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_Gamma_DB#getPort_requis_gamma_db <em>Port requis gamma db</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port requis gamma db</em>' reference.
	 * @see #getPort_requis_gamma_db()
	 * @generated
	 */
	void setPort_requis_gamma_db(Port_Requis_Gamma_DB value);

} // Attachment_Gamma_DB
