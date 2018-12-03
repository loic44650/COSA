/**
 */
package client_serveur;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Interface_Client#getPort_fourni_client <em>Port fourni client</em>}</li>
 *   <li>{@link client_serveur.Interface_Client#getPort_requis_client <em>Port requis client</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getInterface_Client()
 * @model
 * @generated
 */
public interface Interface_Client extends EObject {
	/**
	 * Returns the value of the '<em><b>Port fourni client</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Port_Fourni_Client}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port fourni client</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port fourni client</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Client_Port_fourni_client()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port_Fourni_Client> getPort_fourni_client();

	/**
	 * Returns the value of the '<em><b>Port requis client</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Port_Requis_Client}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port requis client</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port requis client</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Client_Port_requis_client()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port_Requis_Client> getPort_requis_client();

} // Interface_Client
