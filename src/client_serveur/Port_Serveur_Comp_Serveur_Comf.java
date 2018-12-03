/**
 */
package client_serveur;

import cosa.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Serveur Comp Serveur Comf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Port_Serveur_Comp_Serveur_Comf#getBinding_serveur_comp_serveur_conf <em>Binding serveur comp serveur conf</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getPort_Serveur_Comp_Serveur_Comf()
 * @model
 * @generated
 */
public interface Port_Serveur_Comp_Serveur_Comf extends Port {
	/**
	 * Returns the value of the '<em><b>Binding serveur comp serveur conf</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link client_serveur.Binding_Serveur_Comp_Serveur_Conf#getPort_serveur_comp_serveur_comf <em>Port serveur comp serveur comf</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding serveur comp serveur conf</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding serveur comp serveur conf</em>' reference.
	 * @see #setBinding_serveur_comp_serveur_conf(Binding_Serveur_Comp_Serveur_Conf)
	 * @see client_serveur.Client_serveurPackage#getPort_Serveur_Comp_Serveur_Comf_Binding_serveur_comp_serveur_conf()
	 * @see client_serveur.Binding_Serveur_Comp_Serveur_Conf#getPort_serveur_comp_serveur_comf
	 * @model opposite="port_serveur_comp_serveur_comf"
	 * @generated
	 */
	Binding_Serveur_Comp_Serveur_Conf getBinding_serveur_comp_serveur_conf();

	/**
	 * Sets the value of the '{@link client_serveur.Port_Serveur_Comp_Serveur_Comf#getBinding_serveur_comp_serveur_conf <em>Binding serveur comp serveur conf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding serveur comp serveur conf</em>' reference.
	 * @see #getBinding_serveur_comp_serveur_conf()
	 * @generated
	 */
	void setBinding_serveur_comp_serveur_conf(Binding_Serveur_Comp_Serveur_Conf value);

} // Port_Serveur_Comp_Serveur_Comf
