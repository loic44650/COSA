/**
 */
package cosa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosa.Attachment#getRole <em>Role</em>}</li>
 *   <li>{@link cosa.Attachment#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see cosa.CosaPackage#getAttachment()
 * @model
 * @generated
 */
public interface Attachment extends EObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cosa.Role#getAttachment_conn <em>Attachment conn</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see cosa.CosaPackage#getAttachment_Role()
	 * @see cosa.Role#getAttachment_conn
	 * @model opposite="attachment_conn"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link cosa.Attachment#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cosa.Port#getAttachment_comp <em>Attachment comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(Port)
	 * @see cosa.CosaPackage#getAttachment_Port()
	 * @see cosa.Port#getAttachment_comp
	 * @model opposite="attachment_comp"
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link cosa.Attachment#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

	

} // Attachment
