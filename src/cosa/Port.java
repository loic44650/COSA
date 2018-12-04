/**
 */
package cosa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosa.Port#getAttachment_comp <em>Attachment comp</em>}</li>
 *   <li>{@link cosa.Port#getBinding_conf <em>Binding conf</em>}</li>
 *   <li>{@link cosa.Port#getBinding_comp <em>Binding comp</em>}</li>
 * </ul>
 *
 * @see cosa.CosaPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends Interface_Composant {
	/**
	 * Returns the value of the '<em><b>Attachment comp</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cosa.Attachment#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment comp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment comp</em>' reference.
	 * @see #setAttachment_comp(Attachment)
	 * @see cosa.CosaPackage#getPort_Attachment_comp()
	 * @see cosa.Attachment#getPort
	 * @model opposite="port"
	 * @generated
	 */
	Attachment getAttachment_comp();

	/**
	 * Sets the value of the '{@link cosa.Port#getAttachment_comp <em>Attachment comp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment comp</em>' reference.
	 * @see #getAttachment_comp()
	 * @generated
	 */
	void setAttachment_comp(Attachment value);

	/**
	 * Returns the value of the '<em><b>Binding conf</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cosa.Binding#getPort_conf <em>Port conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding conf</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding conf</em>' reference.
	 * @see #setBinding_conf(Binding)
	 * @see cosa.CosaPackage#getPort_Binding_conf()
	 * @see cosa.Binding#getPort_conf
	 * @model opposite="port_conf"
	 * @generated
	 */
	Binding getBinding_conf();

	/**
	 * Sets the value of the '{@link cosa.Port#getBinding_conf <em>Binding conf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding conf</em>' reference.
	 * @see #getBinding_conf()
	 * @generated
	 */
	void setBinding_conf(Binding value);

	/**
	 * Returns the value of the '<em><b>Binding comp</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cosa.Binding#getPort_comp <em>Port comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding comp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding comp</em>' reference.
	 * @see #setBinding_comp(Binding)
	 * @see cosa.CosaPackage#getPort_Binding_comp()
	 * @see cosa.Binding#getPort_comp
	 * @model opposite="port_comp"
	 * @generated
	 */
	Binding getBinding_comp();

	/**
	 * Sets the value of the '{@link cosa.Port#getBinding_comp <em>Binding comp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding comp</em>' reference.
	 * @see #getBinding_comp()
	 * @generated
	 */
	void setBinding_comp(Binding value);
	
	void update();

} // Port
