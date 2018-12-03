/**
 */
package client_serveur;

import cosa.Connecteur;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alpha</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Alpha#getInterface_alpha <em>Interface alpha</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getAlpha()
 * @model
 * @generated
 */
public interface Alpha extends Connecteur {
	/**
	 * Returns the value of the '<em><b>Interface alpha</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Interface_Alpha}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface alpha</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface alpha</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getAlpha_Interface_alpha()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface_Alpha> getInterface_alpha();

} // Alpha
