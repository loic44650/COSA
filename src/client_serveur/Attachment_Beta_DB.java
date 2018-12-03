/**
 */
package client_serveur;

import cosa.Attachment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment Beta DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Attachment_Beta_DB#getPort_requis_beta_db <em>Port requis beta db</em>}</li>
 *   <li>{@link client_serveur.Attachment_Beta_DB#getRole_fourni_beta_db <em>Role fourni beta db</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getAttachment_Beta_DB()
 * @model
 * @generated
 */
public interface Attachment_Beta_DB extends Attachment {
	/**
	 * Returns the value of the '<em><b>Port requis beta db</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Port_Requis_Beta_DB#getAttachment_beta_db <em>Attachment beta db</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port requis beta db</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port requis beta db</em>' reference.
	 * @see #setPort_requis_beta_db(Port_Requis_Beta_DB)
	 * @see client_serveur.Client_serveurPackage#getAttachment_Beta_DB_Port_requis_beta_db()
	 * @see client_serveur.Port_Requis_Beta_DB#getAttachment_beta_db
	 * @model opposite="attachment_beta_db"
	 * @generated
	 */
	Port_Requis_Beta_DB getPort_requis_beta_db();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_Beta_DB#getPort_requis_beta_db <em>Port requis beta db</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port requis beta db</em>' reference.
	 * @see #getPort_requis_beta_db()
	 * @generated
	 */
	void setPort_requis_beta_db(Port_Requis_Beta_DB value);

	/**
	 * Returns the value of the '<em><b>Role fourni beta db</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Role_Fourni_Beta_DB#getAttachment_beta_db <em>Attachment beta db</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role fourni beta db</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role fourni beta db</em>' reference.
	 * @see #setRole_fourni_beta_db(Role_Fourni_Beta_DB)
	 * @see client_serveur.Client_serveurPackage#getAttachment_Beta_DB_Role_fourni_beta_db()
	 * @see client_serveur.Role_Fourni_Beta_DB#getAttachment_beta_db
	 * @model opposite="attachment_beta_db"
	 * @generated
	 */
	Role_Fourni_Beta_DB getRole_fourni_beta_db();

	/**
	 * Sets the value of the '{@link client_serveur.Attachment_Beta_DB#getRole_fourni_beta_db <em>Role fourni beta db</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role fourni beta db</em>' reference.
	 * @see #getRole_fourni_beta_db()
	 * @generated
	 */
	void setRole_fourni_beta_db(Role_Fourni_Beta_DB value);

} // Attachment_Beta_DB
