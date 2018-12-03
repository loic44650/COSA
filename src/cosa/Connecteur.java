/**
 */
package cosa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connecteur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosa.Connecteur#getGlu <em>Glu</em>}</li>
 *   <li>{@link cosa.Connecteur#getInterface_connecteur <em>Interface connecteur</em>}</li>
 * </ul>
 *
 * @see cosa.CosaPackage#getConnecteur()
 * @model
 * @generated
 */
public interface Connecteur extends Element_Architectural {
	/**
	 * Returns the value of the '<em><b>Glu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glu</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glu</em>' containment reference.
	 * @see #setGlu(Glu)
	 * @see cosa.CosaPackage#getConnecteur_Glu()
	 * @model containment="true"
	 * @generated
	 */
	Glu getGlu();

	/**
	 * Sets the value of the '{@link cosa.Connecteur#getGlu <em>Glu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glu</em>' containment reference.
	 * @see #getGlu()
	 * @generated
	 */
	void setGlu(Glu value);

	/**
	 * Returns the value of the '<em><b>Interface connecteur</b></em>' containment reference list.
	 * The list contents are of type {@link cosa.Interface_Connecteur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface connecteur</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface connecteur</em>' containment reference list.
	 * @see cosa.CosaPackage#getConnecteur_Interface_connecteur()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Interface_Connecteur> getInterface_connecteur();

} // Connecteur
