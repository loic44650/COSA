/**
 */
package client_serveur;

import cosa.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Serveur Comp CM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Port_Serveur_Comp_CM#getBinding_serveur_comp_cm <em>Binding serveur comp cm</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getPort_Serveur_Comp_CM()
 * @model
 * @generated
 */
public interface Port_Serveur_Comp_CM extends Port {
	/**
	 * Returns the value of the '<em><b>Binding serveur comp cm</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Binding_Serveur_Comp_CM#getPort_serveur_comp_cm <em>Port serveur comp cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding serveur comp cm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding serveur comp cm</em>' reference.
	 * @see #setBinding_serveur_comp_cm(Binding_Serveur_Comp_CM)
	 * @see client_serveur.Client_serveurPackage#getPort_Serveur_Comp_CM_Binding_serveur_comp_cm()
	 * @see client_serveur.Binding_Serveur_Comp_CM#getPort_serveur_comp_cm
	 * @model opposite="port_serveur_comp_cm"
	 * @generated
	 */
	Binding_Serveur_Comp_CM getBinding_serveur_comp_cm();

	/**
	 * Sets the value of the '{@link client_serveur.Port_Serveur_Comp_CM#getBinding_serveur_comp_cm <em>Binding serveur comp cm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding serveur comp cm</em>' reference.
	 * @see #getBinding_serveur_comp_cm()
	 * @generated
	 */
	void setBinding_serveur_comp_cm(Binding_Serveur_Comp_CM value);

} // Port_Serveur_Comp_CM
