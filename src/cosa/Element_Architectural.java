/**
 */
package cosa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Architectural</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosa.Element_Architectural#getInterface <em>Interface</em>}</li>
 *   <li>{@link cosa.Element_Architectural#getProprietes <em>Proprietes</em>}</li>
 *   <li>{@link cosa.Element_Architectural#getContraintes <em>Contraintes</em>}</li>
 *   <li>{@link cosa.Element_Architectural#getElement_architectural <em>Element architectural</em>}</li>
 * </ul>
 *
 * @see cosa.CosaPackage#getElement_Architectural()
 * @model
 * @generated
 */
public interface Element_Architectural extends EObject {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference list.
	 * The list contents are of type {@link cosa.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference list.
	 * @see cosa.CosaPackage#getElement_Architectural_Interface()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface> getInterface();

	/**
	 * Returns the value of the '<em><b>Proprietes</b></em>' containment reference list.
	 * The list contents are of type {@link cosa.Proprietes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proprietes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proprietes</em>' containment reference list.
	 * @see cosa.CosaPackage#getElement_Architectural_Proprietes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Proprietes> getProprietes();

	/**
	 * Returns the value of the '<em><b>Contraintes</b></em>' containment reference list.
	 * The list contents are of type {@link cosa.Contraintes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contraintes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contraintes</em>' containment reference list.
	 * @see cosa.CosaPackage#getElement_Architectural_Contraintes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contraintes> getContraintes();

	/**
	 * Returns the value of the '<em><b>Element architectural</b></em>' containment reference list.
	 * The list contents are of type {@link cosa.Element_Architectural}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element architectural</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element architectural</em>' containment reference list.
	 * @see cosa.CosaPackage#getElement_Architectural_Element_architectural()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element_Architectural> getElement_architectural();

} // Element_Architectural
