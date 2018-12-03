/**
 */
package client_serveur;

import cosa.Role_Fourni;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Fourni Gamma DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Role_Fourni_Gamma_DB#getAttachment_gamma_db <em>Attachment gamma db</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getRole_Fourni_Gamma_DB()
 * @model
 * @generated
 */
public interface Role_Fourni_Gamma_DB extends Role_Fourni {
	/**
	 * Returns the value of the '<em><b>Attachment gamma db</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Attachment_Gamma_DB#getRole_fourni_gamma_db <em>Role fourni gamma db</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment gamma db</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment gamma db</em>' reference.
	 * @see #setAttachment_gamma_db(Attachment_Gamma_DB)
	 * @see client_serveur.Client_serveurPackage#getRole_Fourni_Gamma_DB_Attachment_gamma_db()
	 * @see client_serveur.Attachment_Gamma_DB#getRole_fourni_gamma_db
	 * @model opposite="role_fourni_gamma_db"
	 * @generated
	 */
	Attachment_Gamma_DB getAttachment_gamma_db();

	/**
	 * Sets the value of the '{@link client_serveur.Role_Fourni_Gamma_DB#getAttachment_gamma_db <em>Attachment gamma db</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment gamma db</em>' reference.
	 * @see #getAttachment_gamma_db()
	 * @generated
	 */
	void setAttachment_gamma_db(Attachment_Gamma_DB value);

} // Role_Fourni_Gamma_DB
