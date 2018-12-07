/**
 */
package cosa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosa.Role#getAttachment_conn <em>Attachment conn</em>}</li>
 * </ul>
 *
 * @see cosa.CosaPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends Interface_Connecteur {
	/**
	 * Returns the value of the '<em><b>Attachment conn</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cosa.Attachment#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment conn</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment conn</em>' reference.
	 * @see #setAttachment_conn(Attachment)
	 * @see cosa.CosaPackage#getRole_Attachment_conn()
	 * @see cosa.Attachment#getRole
	 * @model opposite="role"
	 * @generated
	 */
	Attachment getAttachment_conn();

	/**
	 * Sets the value of the '{@link cosa.Role#getAttachment_conn <em>Attachment conn</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment conn</em>' reference.
	 * @see #getAttachment_conn()
	 * @generated
	 */
	void setAttachment_conn(Attachment value);

} // Role
