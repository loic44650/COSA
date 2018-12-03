/**
 */
package cosa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosa.Binding#getPort_conf <em>Port conf</em>}</li>
 *   <li>{@link cosa.Binding#getPort_comp <em>Port comp</em>}</li>
 * </ul>
 *
 * @see cosa.CosaPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject {
	/**
	 * Returns the value of the '<em><b>Port conf</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cosa.Port#getBinding_conf <em>Binding conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port conf</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port conf</em>' reference.
	 * @see #setPort_conf(Port)
	 * @see cosa.CosaPackage#getBinding_Port_conf()
	 * @see cosa.Port#getBinding_conf
	 * @model opposite="binding_conf"
	 * @generated
	 */
	Port getPort_conf();

	/**
	 * Sets the value of the '{@link cosa.Binding#getPort_conf <em>Port conf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port conf</em>' reference.
	 * @see #getPort_conf()
	 * @generated
	 */
	void setPort_conf(Port value);

	/**
	 * Returns the value of the '<em><b>Port comp</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cosa.Port#getBinding_comp <em>Binding comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port comp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port comp</em>' reference.
	 * @see #setPort_comp(Port)
	 * @see cosa.CosaPackage#getBinding_Port_comp()
	 * @see cosa.Port#getBinding_comp
	 * @model opposite="binding_comp"
	 * @generated
	 */
	Port getPort_comp();

	/**
	 * Sets the value of the '{@link cosa.Binding#getPort_comp <em>Port comp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port comp</em>' reference.
	 * @see #getPort_comp()
	 * @generated
	 */
	void setPort_comp(Port value);

} // Binding
