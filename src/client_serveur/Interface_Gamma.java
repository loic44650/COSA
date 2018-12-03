/**
 */
package client_serveur;

import cosa.Interface_Connecteur;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Gamma</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Interface_Gamma#getRole_requis_cm_gamma <em>Role requis cm gamma</em>}</li>
 *   <li>{@link client_serveur.Interface_Gamma#getRole_fourni_gamma_cm <em>Role fourni gamma cm</em>}</li>
 *   <li>{@link client_serveur.Interface_Gamma#getRole_requis_db_gamma <em>Role requis db gamma</em>}</li>
 *   <li>{@link client_serveur.Interface_Gamma#getRole_fourni_gamma_db <em>Role fourni gamma db</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getInterface_Gamma()
 * @model
 * @generated
 */
public interface Interface_Gamma extends Interface_Connecteur {
	/**
	 * Returns the value of the '<em><b>Role requis cm gamma</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Role_Requis_CM_Gamma}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role requis cm gamma</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role requis cm gamma</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Gamma_Role_requis_cm_gamma()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role_Requis_CM_Gamma> getRole_requis_cm_gamma();

	/**
	 * Returns the value of the '<em><b>Role fourni gamma cm</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Role_Fourni_Gamma_CM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role fourni gamma cm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role fourni gamma cm</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Gamma_Role_fourni_gamma_cm()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role_Fourni_Gamma_CM> getRole_fourni_gamma_cm();

	/**
	 * Returns the value of the '<em><b>Role requis db gamma</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Role_Requis_DB_Gamma}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role requis db gamma</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role requis db gamma</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Gamma_Role_requis_db_gamma()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role_Requis_DB_Gamma> getRole_requis_db_gamma();

	/**
	 * Returns the value of the '<em><b>Role fourni gamma db</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Role_Fourni_Gamma_DB}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role fourni gamma db</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role fourni gamma db</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Gamma_Role_fourni_gamma_db()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role_Fourni_Gamma_DB> getRole_fourni_gamma_db();

} // Interface_Gamma
