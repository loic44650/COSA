/**
 */
package client_serveur;

import cosa.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port CM Serveur Comp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Port_CM_Serveur_Comp#getBinding_serveur_comp_cm <em>Binding serveur comp cm</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getPort_CM_Serveur_Comp()
 * @model
 * @generated
 */
public interface Port_CM_Serveur_Comp extends Port {
	/**
	 * Returns the value of the '<em><b>Binding serveur comp cm</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Binding_Serveur_Comp_CM#getPort_cm_serveur_comp <em>Port cm serveur comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding serveur comp cm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding serveur comp cm</em>' reference.
	 * @see #setBinding_serveur_comp_cm(Binding_Serveur_Comp_CM)
	 * @see client_serveur.Client_serveurPackage#getPort_CM_Serveur_Comp_Binding_serveur_comp_cm()
	 * @see client_serveur.Binding_Serveur_Comp_CM#getPort_cm_serveur_comp
	 * @model opposite="port_cm_serveur_comp"
	 * @generated
	 */
	Binding_Serveur_Comp_CM getBinding_serveur_comp_cm();

	/**
	 * Sets the value of the '{@link client_serveur.Port_CM_Serveur_Comp#getBinding_serveur_comp_cm <em>Binding serveur comp cm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding serveur comp cm</em>' reference.
	 * @see #getBinding_serveur_comp_cm()
	 * @generated
	 */
	void setBinding_serveur_comp_cm(Binding_Serveur_Comp_CM value);

} // Port_CM_Serveur_Comp
