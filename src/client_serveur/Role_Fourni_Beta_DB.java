/**
 */
package client_serveur;

import cosa.Role_Fourni;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Fourni Beta DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Role_Fourni_Beta_DB#getAttachment_beta_db <em>Attachment beta db</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getRole_Fourni_Beta_DB()
 * @model
 * @generated
 */
public interface Role_Fourni_Beta_DB extends Role_Fourni {
	/**
	 * Returns the value of the '<em><b>Attachment beta db</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Attachment_Beta_DB#getRole_fourni_beta_db <em>Role fourni beta db</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment beta db</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment beta db</em>' reference.
	 * @see #setAttachment_beta_db(Attachment_Beta_DB)
	 * @see client_serveur.Client_serveurPackage#getRole_Fourni_Beta_DB_Attachment_beta_db()
	 * @see client_serveur.Attachment_Beta_DB#getRole_fourni_beta_db
	 * @model opposite="role_fourni_beta_db"
	 * @generated
	 */
	Attachment_Beta_DB getAttachment_beta_db();

	/**
	 * Sets the value of the '{@link client_serveur.Role_Fourni_Beta_DB#getAttachment_beta_db <em>Attachment beta db</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment beta db</em>' reference.
	 * @see #getAttachment_beta_db()
	 * @generated
	 */
	void setAttachment_beta_db(Attachment_Beta_DB value);

} // Role_Fourni_Beta_DB
