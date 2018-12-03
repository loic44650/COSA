/**
 */
package client_serveur;

import cosa.Port_Fourni;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Fourni DB Beta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Port_Fourni_DB_Beta#getAttachment_db_beta <em>Attachment db beta</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getPort_Fourni_DB_Beta()
 * @model
 * @generated
 */
public interface Port_Fourni_DB_Beta extends Port_Fourni {
	/**
	 * Returns the value of the '<em><b>Attachment db beta</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Attachment_DB_Beta#getPort_fourni_db_beta <em>Port fourni db beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment db beta</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment db beta</em>' reference.
	 * @see #setAttachment_db_beta(Attachment_DB_Beta)
	 * @see client_serveur.Client_serveurPackage#getPort_Fourni_DB_Beta_Attachment_db_beta()
	 * @see client_serveur.Attachment_DB_Beta#getPort_fourni_db_beta
	 * @model opposite="port_fourni_db_beta"
	 * @generated
	 */
	Attachment_DB_Beta getAttachment_db_beta();

	/**
	 * Sets the value of the '{@link client_serveur.Port_Fourni_DB_Beta#getAttachment_db_beta <em>Attachment db beta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment db beta</em>' reference.
	 * @see #getAttachment_db_beta()
	 * @generated
	 */
	void setAttachment_db_beta(Attachment_DB_Beta value);

} // Port_Fourni_DB_Beta
