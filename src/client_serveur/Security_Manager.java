/**
 */
package client_serveur;

import cosa.Composant;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Security_Manager#getInterface_security_manager <em>Interface security manager</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getSecurity_Manager()
 * @model
 * @generated
 */
public interface Security_Manager extends Composant {
	/**
	 * Returns the value of the '<em><b>Interface security manager</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Interface_Security_Manager}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface security manager</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface security manager</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getSecurity_Manager_Interface_security_manager()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface_Security_Manager> getInterface_security_manager();

} // Security_Manager
