/**
 */
package cosa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Connecteur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosa.Service_Connecteur#getInterface_connecteur <em>Interface connecteur</em>}</li>
 *   <li>{@link cosa.Service_Connecteur#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see cosa.CosaPackage#getService_Connecteur()
 * @model
 * @generated
 */
public interface Service_Connecteur extends Interface_Connecteur {
	/**
	 * Returns the value of the '<em><b>Interface connecteur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface connecteur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface connecteur</em>' reference.
	 * @see #setInterface_connecteur(Interface_Connecteur)
	 * @see cosa.CosaPackage#getService_Connecteur_Interface_connecteur()
	 * @model
	 * @generated
	 */
	Interface_Connecteur getInterface_connecteur();

	/**
	 * Sets the value of the '{@link cosa.Service_Connecteur#getInterface_connecteur <em>Interface connecteur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface connecteur</em>' reference.
	 * @see #getInterface_connecteur()
	 * @generated
	 */
	void setInterface_connecteur(Interface_Connecteur value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference list.
	 * The list contents are of type {@link cosa.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference list.
	 * @see cosa.CosaPackage#getService_Connecteur_Role()
	 * @model required="true"
	 * @generated
	 */
	EList<Role> getRole();

} // Service_Connecteur
