/**
 */
package client_serveur;

import cosa.Port_Fourni;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Fourni DB Gamma</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Port_Fourni_DB_Gamma#getAttachment_db_gamma <em>Attachment db gamma</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getPort_Fourni_DB_Gamma()
 * @model
 * @generated
 */
public interface Port_Fourni_DB_Gamma extends Port_Fourni {
	/**
	 * Returns the value of the '<em><b>Attachment db gamma</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Attachment_DB_Gamma#getPort_fourni_db_gamma <em>Port fourni db gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment db gamma</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment db gamma</em>' reference.
	 * @see #setAttachment_db_gamma(Attachment_DB_Gamma)
	 * @see client_serveur.Client_serveurPackage#getPort_Fourni_DB_Gamma_Attachment_db_gamma()
	 * @see client_serveur.Attachment_DB_Gamma#getPort_fourni_db_gamma
	 * @model opposite="port_fourni_db_gamma"
	 * @generated
	 */
	Attachment_DB_Gamma getAttachment_db_gamma();

	/**
	 * Sets the value of the '{@link client_serveur.Port_Fourni_DB_Gamma#getAttachment_db_gamma <em>Attachment db gamma</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment db gamma</em>' reference.
	 * @see #getAttachment_db_gamma()
	 * @generated
	 */
	void setAttachment_db_gamma(Attachment_DB_Gamma value);

} // Port_Fourni_DB_Gamma
