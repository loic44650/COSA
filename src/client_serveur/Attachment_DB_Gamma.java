/**
 */
package client_serveur;

import cosa.Attachment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment DB Gamma</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Attachment_DB_Gamma#getRole_requis_db_gamma <em>Role requis db gamma</em>}</li>
 *   <li>{@link client_serveur.Attachment_DB_Gamma#getPort_fourni_db_gamma <em>Port fourni db gamma</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getAttachment_DB_Gamma()
 * @model
 * @generated
 */
public interface Attachment_DB_Gamma extends Attachment {
	/**
	 * Returns the value of the '<em><b>Role requis db gamma</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Role_Requis_DB_Gamma#getAttachment_db_gamma <em>Attachment db gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role requis db gamma</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role requis db gamma</em>' reference.
	 * @see #setRole_requis_db_gamma(Role_Requis_DB_Gamma)
	 * @see client_serveur.Client_serveurPackage#getAttachment_DB_Gamma_Role_requis_db_gamma()
	 * @see client_serveur.Role_Requis_DB_Gamma#getAttachment_db_gamma
	 * @model opposite="attachment_db_gamma"
	 * @generated
	 */
	Role_Requis_DB_Gamma getRole_requis_db_gamma();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_DB_Gamma#getRole_requis_db_gamma <em>Role requis db gamma</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role requis db gamma</em>' reference.
	 * @see #getRole_requis_db_gamma()
	 * @generated
	 */
	void setRole_requis_db_gamma(Role_Requis_DB_Gamma value);

	/**
	 * Returns the value of the '<em><b>Port fourni db gamma</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Port_Fourni_DB_Gamma#getAttachment_db_gamma <em>Attachment db gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port fourni db gamma</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port fourni db gamma</em>' reference.
	 * @see #setPort_fourni_db_gamma(Port_Fourni_DB_Gamma)
	 * @see client_serveur.Client_serveurPackage#getAttachment_DB_Gamma_Port_fourni_db_gamma()
	 * @see client_serveur.Port_Fourni_DB_Gamma#getAttachment_db_gamma
	 * @model opposite="attachment_db_gamma"
	 * @generated
	 */
	Port_Fourni_DB_Gamma getPort_fourni_db_gamma();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_DB_Gamma#getPort_fourni_db_gamma <em>Port fourni db gamma</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port fourni db gamma</em>' reference.
	 * @see #getPort_fourni_db_gamma()
	 * @generated
	 */
	void setPort_fourni_db_gamma(Port_Fourni_DB_Gamma value);

} // Attachment_DB_Gamma
