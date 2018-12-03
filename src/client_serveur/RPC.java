/**
 */
package client_serveur;

import cosa.Connecteur;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.RPC#getInterface_rpc <em>Interface rpc</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getRPC()
 * @model
 * @generated
 */
public interface RPC extends Connecteur {
	/**
	 * Returns the value of the '<em><b>Interface rpc</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Interface_RPC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface rpc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface rpc</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getRPC_Interface_rpc()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface_RPC> getInterface_rpc();

} // RPC
