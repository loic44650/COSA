/**
 */
package cosa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosa.Configuration#getInterface_composant <em>Interface composant</em>}</li>
 *   <li>{@link cosa.Configuration#getConnecteur <em>Connecteur</em>}</li>
 *   <li>{@link cosa.Configuration#getComposant <em>Composant</em>}</li>
 *   <li>{@link cosa.Configuration#getBinding <em>Binding</em>}</li>
 *   <li>{@link cosa.Configuration#getAttachment <em>Attachment</em>}</li>
 * </ul>
 *
 * @see cosa.CosaPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends Element_Architectural {
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
	 * @see cosa.CosaPackage#getConfiguration_Interface_composant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface_Composant> getInterface_composant();

	/**
	 * Returns the value of the '<em><b>Connecteur</b></em>' containment reference list.
	 * The list contents are of type {@link cosa.Connecteur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connecteur</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connecteur</em>' containment reference list.
	 * @see cosa.CosaPackage#getConfiguration_Connecteur()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connecteur> getConnecteur();

	/**
	 * Returns the value of the '<em><b>Composant</b></em>' containment reference list.
	 * The list contents are of type {@link cosa.Composant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composant</em>' containment reference list.
	 * @see cosa.CosaPackage#getConfiguration_Composant()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Composant> getComposant();

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference list.
	 * The list contents are of type {@link cosa.Binding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference list.
	 * @see cosa.CosaPackage#getConfiguration_Binding()
	 * @model containment="true"
	 * @generated
	 */
	EList<Binding> getBinding();

	/**
	 * Returns the value of the '<em><b>Attachment</b></em>' containment reference list.
	 * The list contents are of type {@link cosa.Attachment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment</em>' containment reference list.
	 * @see cosa.CosaPackage#getConfiguration_Attachment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attachment> getAttachment();

} // Configuration
