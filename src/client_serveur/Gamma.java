/**
 */
package client_serveur;

import cosa.Connecteur;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gamma</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Gamma#getInterface_gamma <em>Interface gamma</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getGamma()
 * @model
 * @generated
 */
public interface Gamma extends Connecteur {
	/**
	 * Returns the value of the '<em><b>Interface gamma</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Interface_Gamma}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface gamma</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface gamma</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getGamma_Interface_gamma()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface_Gamma> getInterface_gamma();

} // Gamma
