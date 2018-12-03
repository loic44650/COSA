/**
 */
package client_serveur;

import cosa.Interface_Connecteur;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Alpha</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.Interface_Alpha#getRole_fourni_alpha_sm <em>Role fourni alpha sm</em>}</li>
 *   <li>{@link client_serveur.Interface_Alpha#getRole_requis_sm_alpha <em>Role requis sm alpha</em>}</li>
 *   <li>{@link client_serveur.Interface_Alpha#getRole_requis_cm_alpha <em>Role requis cm alpha</em>}</li>
 *   <li>{@link client_serveur.Interface_Alpha#getRole_fourni_alpha_cm <em>Role fourni alpha cm</em>}</li>
 * </ul>
 *
 * @see client_serveur.Client_serveurPackage#getInterface_Alpha()
 * @model
 * @generated
 */
public interface Interface_Alpha extends Interface_Connecteur {
	/**
	 * Returns the value of the '<em><b>Role fourni alpha sm</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Role_Fourni_Alpha_SM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role fourni alpha sm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role fourni alpha sm</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Alpha_Role_fourni_alpha_sm()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role_Fourni_Alpha_SM> getRole_fourni_alpha_sm();

	/**
	 * Returns the value of the '<em><b>Role requis sm alpha</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Role_Requis_SM_Alpha}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role requis sm alpha</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role requis sm alpha</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Alpha_Role_requis_sm_alpha()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role_Requis_SM_Alpha> getRole_requis_sm_alpha();

	/**
	 * Returns the value of the '<em><b>Role requis cm alpha</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Role_Requis_CM_Alpha}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role requis cm alpha</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role requis cm alpha</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Alpha_Role_requis_cm_alpha()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role_Requis_CM_Alpha> getRole_requis_cm_alpha();

	/**
	 * Returns the value of the '<em><b>Role fourni alpha cm</b></em>' containment reference list.
	 * The list contents are of type {@link client_serveur.Role_Fourni_Alpha_CM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role fourni alpha cm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role fourni alpha cm</em>' containment reference list.
	 * @see client_serveur.Client_serveurPackage#getInterface_Alpha_Role_fourni_alpha_cm()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role_Fourni_Alpha_CM> getRole_fourni_alpha_cm();

} // Interface_Alpha
