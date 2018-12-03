/**
 */
package client_serveur;

import cosa.Role_Requis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Requis DB Gamma</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Role_Requis_DB_Gamma#getAttachment_db_gamma <em>Attachment db gamma</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getRole_Requis_DB_Gamma()
 * @model
 * @generated
 */
public interface Role_Requis_DB_Gamma extends Role_Requis {
	/**
	 * Returns the value of the '<em><b>Attachment db gamma</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Attachment_DB_Gamma#getRole_requis_db_gamma <em>Role requis db gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment db gamma</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment db gamma</em>' reference.
	 * @see #setAttachment_db_gamma(Attachment_DB_Gamma)
	 * @see client_serveur.Client_serveurPackage#getRole_Requis_DB_Gamma_Attachment_db_gamma()
	 * @see client_serveur.Attachment_DB_Gamma#getRole_requis_db_gamma
	 * @model opposite="role_requis_db_gamma"
	 * @generated
	 */
	Attachment_DB_Gamma getAttachment_db_gamma();

	/**
	 * Sets the value of the '{@link client_serveur.Role_Requis_DB_Gamma#getAttachment_db_gamma <em>Attachment db gamma</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment db gamma</em>' reference.
	 * @see #getAttachment_db_gamma()
	 * @generated
	 */
	void setAttachment_db_gamma(Attachment_DB_Gamma value);

} // Role_Requis_DB_Gamma
