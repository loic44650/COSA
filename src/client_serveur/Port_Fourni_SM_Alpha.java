/**
 */
package client_serveur;

import cosa.Port_Fourni;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Fourni SM Alpha</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Port_Fourni_SM_Alpha#getAttachment_sm_alpha <em>Attachment sm alpha</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getPort_Fourni_SM_Alpha()
 * @model
 * @generated
 */
public interface Port_Fourni_SM_Alpha extends Port_Fourni {
	/**
	 * Returns the value of the '<em><b>Attachment sm alpha</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Attachment_SM_Alpha#getPort_fourni_sm_alpha <em>Port fourni sm alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment sm alpha</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment sm alpha</em>' reference.
	 * @see #setAttachment_sm_alpha(Attachment_SM_Alpha)
	 * @see client_serveur.Client_serveurPackage#getPort_Fourni_SM_Alpha_Attachment_sm_alpha()
	 * @see client_serveur.Attachment_SM_Alpha#getPort_fourni_sm_alpha
	 * @model opposite="port_fourni_sm_alpha"
	 * @generated
	 */
	Attachment_SM_Alpha getAttachment_sm_alpha();

	/**
	 * Sets the value of the '{@link client_serveur.Port_Fourni_SM_Alpha#getAttachment_sm_alpha <em>Attachment sm alpha</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment sm alpha</em>' reference.
	 * @see #getAttachment_sm_alpha()
	 * @generated
	 */
	void setAttachment_sm_alpha(Attachment_SM_Alpha value);

} // Port_Fourni_SM_Alpha
