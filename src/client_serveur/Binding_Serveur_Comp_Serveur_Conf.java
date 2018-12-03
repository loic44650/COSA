/**
 */
package client_serveur;

import cosa.Binding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Serveur Comp Serveur Conf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Binding_Serveur_Comp_Serveur_Conf#getPort_serveur_conf_serveur_comp <em>Port serveur conf serveur comp</em>}</li>
 *   <li>{@link client_serveur.Binding_Serveur_Comp_Serveur_Conf#getPort_serveur_comp_serveur_comf <em>Port serveur comp serveur comf</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getBinding_Serveur_Comp_Serveur_Conf()
 * @model
 * @generated
 */
public interface Binding_Serveur_Comp_Serveur_Conf extends Binding {
	/**
	 * Returns the value of the '<em><b>Port serveur conf serveur comp</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Port_Serveur_Conf_Serveur_Comp#getBinding_serveur_comp_serveur_conf <em>Binding serveur comp serveur conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port serveur conf serveur comp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port serveur conf serveur comp</em>' reference.
	 * @see #setPort_serveur_conf_serveur_comp(Port_Serveur_Conf_Serveur_Comp)
	 * @see client_serveur.Client_serveurPackage#getBinding_Serveur_Comp_Serveur_Conf_Port_serveur_conf_serveur_comp()
	 * @see client_serveur.Port_Serveur_Conf_Serveur_Comp#getBinding_serveur_comp_serveur_conf
	 * @model opposite="binding_serveur_comp_serveur_conf"
	 * @generated
	 */
	Port_Serveur_Conf_Serveur_Comp getPort_serveur_conf_serveur_comp();

	/**
	 * Sets the value of the '{@link client_serveur.Binding_Serveur_Comp_Serveur_Conf#getPort_serveur_conf_serveur_comp <em>Port serveur conf serveur comp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port serveur conf serveur comp</em>' reference.
	 * @see #getPort_serveur_conf_serveur_comp()
	 * @generated
	 */
	void setPort_serveur_conf_serveur_comp(Port_Serveur_Conf_Serveur_Comp value);

	/**
	 * Returns the value of the '<em><b>Port serveur comp serveur comf</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Port_Serveur_Comp_Serveur_Comf#getBinding_serveur_comp_serveur_conf <em>Binding serveur comp serveur conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port serveur comp serveur comf</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port serveur comp serveur comf</em>' reference.
	 * @see #setPort_serveur_comp_serveur_comf(Port_Serveur_Comp_Serveur_Comf)
	 * @see client_serveur.Client_serveurPackage#getBinding_Serveur_Comp_Serveur_Conf_Port_serveur_comp_serveur_comf()
	 * @see client_serveur.Port_Serveur_Comp_Serveur_Comf#getBinding_serveur_comp_serveur_conf
	 * @model opposite="binding_serveur_comp_serveur_conf"
	 * @generated
	 */
	Port_Serveur_Comp_Serveur_Comf getPort_serveur_comp_serveur_comf();

	/**
	 * Sets the value of the '{@link client_serveur.Binding_Serveur_Comp_Serveur_Conf#getPort_serveur_comp_serveur_comf <em>Port serveur comp serveur comf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port serveur comp serveur comf</em>' reference.
	 * @see #getPort_serveur_comp_serveur_comf()
	 * @generated
	 */
	void setPort_serveur_comp_serveur_comf(Port_Serveur_Comp_Serveur_Comf value);

} // Binding_Serveur_Comp_Serveur_Conf
