/**
 */
package client_serveur;

import cosa.Composant;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Connection_Manager#getInterface_connection_manager <em>Interface connection manager</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getConnection_Manager()
 * @model
 * @generated
 */
public interface Connection_Manager extends Composant {
	/**
	 * Returns the value of the '<em><b>Interface connection manager</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Interface_Connection_Manager}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface connection manager</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface connection manager</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getConnection_Manager_Interface_connection_manager()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface_Connection_Manager> getInterface_connection_manager();

} // Connection_Manager
