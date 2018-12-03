/**
 */
package cosa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosa.Composant#getInterface_composant <em>Interface composant</em>}</li>
 * </ul>
 *
 * @see cosa.CosaPackage#getComposant()
 * @model
 * @generated
 */
public interface Composant extends Element_Architectural {
	/**
	 * Returns the value of the '<em><b>Interface composant</b></em>' containment reference list.
	 * The list contents are of type {@link cosa.Interface_Composant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface composant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface composant</em>' containment reference list.
	 * @see cosa.CosaPackage#getComposant_Interface_composant()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Interface_Composant> getInterface_composant();

} // Composant
