/**
 */
package client_serveur;

import cosa.Attachment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment DB Beta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Attachment_DB_Beta#getPort_fourni_db_beta <em>Port fourni db beta</em>}</li>
 *   <li>{@link client_serveur.Attachment_DB_Beta#getRole_requis_db_beta <em>Role requis db beta</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getAttachment_DB_Beta()
 * @model
 * @generated
 */
public interface Attachment_DB_Beta extends Attachment {
	/**
	 * Returns the value of the '<em><b>Port fourni db beta</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Port_Fourni_DB_Beta#getAttachment_db_beta <em>Attachment db beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port fourni db beta</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port fourni db beta</em>' reference.
	 * @see #setPort_fourni_db_beta(Port_Fourni_DB_Beta)
	 * @see client_serveur.Client_serveurPackage#getAttachment_DB_Beta_Port_fourni_db_beta()
	 * @see client_serveur.Port_Fourni_DB_Beta#getAttachment_db_beta
	 * @model opposite="attachment_db_beta"
	 * @generated
	 */
	Port_Fourni_DB_Beta getPort_fourni_db_beta();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_DB_Beta#getPort_fourni_db_beta <em>Port fourni db beta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port fourni db beta</em>' reference.
	 * @see #getPort_fourni_db_beta()
	 * @generated
	 */
	void setPort_fourni_db_beta(Port_Fourni_DB_Beta value);

	/**
	 * Returns the value of the '<em><b>Role requis db beta</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Role_Requis_DB_Beta#getAttachment_db_beta <em>Attachment db beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role requis db beta</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role requis db beta</em>' reference.
	 * @see #setRole_requis_db_beta(Role_Requis_DB_Beta)
	 * @see client_serveur.Client_serveurPackage#getAttachment_DB_Beta_Role_requis_db_beta()
	 * @see client_serveur.Role_Requis_DB_Beta#getAttachment_db_beta
	 * @model opposite="attachment_db_beta"
	 * @generated
	 */
	Role_Requis_DB_Beta getRole_requis_db_beta();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_DB_Beta#getRole_requis_db_beta <em>Role requis db beta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role requis db beta</em>' reference.
	 * @see #getRole_requis_db_beta()
	 * @generated
	 */
	void setRole_requis_db_beta(Role_Requis_DB_Beta value);

} // Attachment_DB_Beta
