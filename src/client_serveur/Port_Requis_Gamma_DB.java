/**
 */
package client_serveur;

import cosa.Port_Requis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Requis Gamma DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Port_Requis_Gamma_DB#getAttachment_gamma_db <em>Attachment gamma db</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getPort_Requis_Gamma_DB()
 * @model
 * @generated
 */
public interface Port_Requis_Gamma_DB extends Port_Requis {
	/**
	 * Returns the value of the '<em><b>Attachment gamma db</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Attachment_Gamma_DB#getPort_requis_gamma_db <em>Port requis gamma db</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment gamma db</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment gamma db</em>' reference.
	 * @see #setAttachment_gamma_db(Attachment_Gamma_DB)
	 * @see client_serveur.Client_serveurPackage#getPort_Requis_Gamma_DB_Attachment_gamma_db()
	 * @see client_serveur.Attachment_Gamma_DB#getPort_requis_gamma_db
	 * @model opposite="port_requis_gamma_db"
	 * @generated
	 */
	Attachment_Gamma_DB getAttachment_gamma_db();

	/**
	 * Sets the value of the '{@link client_serveur.Port_Requis_Gamma_DB#getAttachment_gamma_db <em>Attachment gamma db</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment gamma db</em>' reference.
	 * @see #getAttachment_gamma_db()
	 * @generated
	 */
	void setAttachment_gamma_db(Attachment_Gamma_DB value);

} // Port_Requis_Gamma_DB
