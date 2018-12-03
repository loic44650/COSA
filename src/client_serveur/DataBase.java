/**
 */
package client_serveur;

import cosa.Composant;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.DataBase#getInterface_database <em>Interface database</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getDataBase()
 * @model
 * @generated
 */
public interface DataBase extends Composant {
	/**
	 * Returns the value of the '<em><b>Interface database</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Interface_DataBase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface database</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface database</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getDataBase_Interface_database()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface_DataBase> getInterface_database();

} // DataBase
