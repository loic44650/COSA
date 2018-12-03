/**
 */
package client_serveur;

import cosa.Role_Requis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Requis DB Beta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Role_Requis_DB_Beta#getAttachment_db_beta <em>Attachment db beta</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getRole_Requis_DB_Beta()
 * @model
 * @generated
 */
public interface Role_Requis_DB_Beta extends Role_Requis {
	/**
	 * Returns the value of the '<em><b>Attachment db beta</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Attachment_DB_Beta#getRole_requis_db_beta <em>Role requis db beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment db beta</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment db beta</em>' reference.
	 * @see #setAttachment_db_beta(Attachment_DB_Beta)
	 * @see client_serveur.Client_serveurPackage#getRole_Requis_DB_Beta_Attachment_db_beta()
	 * @see client_serveur.Attachment_DB_Beta#getRole_requis_db_beta
	 * @model opposite="role_requis_db_beta"
	 * @generated
	 */
	Attachment_DB_Beta getAttachment_db_beta();

	/**
	 * Sets the value of the '{@link client_serveur.Role_Requis_DB_Beta#getAttachment_db_beta <em>Attachment db beta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment db beta</em>' reference.
	 * @see #getAttachment_db_beta()
	 * @generated
	 */
	void setAttachment_db_beta(Attachment_DB_Beta value);

} // Role_Requis_DB_Beta
