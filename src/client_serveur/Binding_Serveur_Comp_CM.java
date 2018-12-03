/**
 */
package client_serveur;

import cosa.Binding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Serveur Comp CM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Binding_Serveur_Comp_CM#getPort_cm_serveur_comp <em>Port cm serveur comp</em>}</li>
 *   <li>{@link client_serveur.Binding_Serveur_Comp_CM#getPort_serveur_comp_cm <em>Port serveur comp cm</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getBinding_Serveur_Comp_CM()
 * @model
 * @generated
 */
public interface Binding_Serveur_Comp_CM extends Binding {
	/**
	 * Returns the value of the '<em><b>Port cm serveur comp</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Port_CM_Serveur_Comp#getBinding_serveur_comp_cm <em>Binding serveur comp cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port cm serveur comp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port cm serveur comp</em>' reference.
	 * @see #setPort_cm_serveur_comp(Port_CM_Serveur_Comp)
	 * @see client_serveur.Client_serveurPackage#getBinding_Serveur_Comp_CM_Port_cm_serveur_comp()
	 * @see client_serveur.Port_CM_Serveur_Comp#getBinding_serveur_comp_cm
	 * @model opposite="binding_serveur_comp_cm"
	 * @generated
	 */
	Port_CM_Serveur_Comp getPort_cm_serveur_comp();

	/**
	 * Sets the value of the '{@link client_serveur.Binding_Serveur_Comp_CM#getPort_cm_serveur_comp <em>Port cm serveur comp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port cm serveur comp</em>' reference.
	 * @see #getPort_cm_serveur_comp()
	 * @generated
	 */
	void setPort_cm_serveur_comp(Port_CM_Serveur_Comp value);

	/**
	 * Returns the value of the '<em><b>Port serveur comp cm</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Port_Serveur_Comp_CM#getBinding_serveur_comp_cm <em>Binding serveur comp cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port serveur comp cm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port serveur comp cm</em>' reference.
	 * @see #setPort_serveur_comp_cm(Port_Serveur_Comp_CM)
	 * @see client_serveur.Client_serveurPackage#getBinding_Serveur_Comp_CM_Port_serveur_comp_cm()
	 * @see client_serveur.Port_Serveur_Comp_CM#getBinding_serveur_comp_cm
	 * @model opposite="binding_serveur_comp_cm"
	 * @generated
	 */
	Port_Serveur_Comp_CM getPort_serveur_comp_cm();

	/**
	 * Sets the value of the '{@link client_serveur.Binding_Serveur_Comp_CM#getPort_serveur_comp_cm <em>Port serveur comp cm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port serveur comp cm</em>' reference.
	 * @see #getPort_serveur_comp_cm()
	 * @generated
	 */
	void setPort_serveur_comp_cm(Port_Serveur_Comp_CM value);

} // Binding_Serveur_Comp_CM
