/**
 */
package cosa.impl;

import cosa.Attachment;
import cosa.CosaPackage;
import cosa.Role;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosa.impl.RoleImpl#getAttachment_conn <em>Attachment conn</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleImpl extends Interface_ConnecteurImpl implements Role {
	/**
	 * The cached value of the '{@link #getAttachment_conn() <em>Attachment conn</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_conn()
	 * @generated
	 * @ordered
	 */
	protected Attachment attachment_conn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	private String request;
	
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getAttachment_conn() {
		if (attachment_conn != null && attachment_conn.eIsProxy()) {
			InternalEObject oldAttachment_conn = (InternalEObject)attachment_conn;
			attachment_conn = (Attachment)eResolveProxy(oldAttachment_conn);
			if (attachment_conn != oldAttachment_conn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CosaPackage.ROLE__ATTACHMENT_CONN, oldAttachment_conn, attachment_conn));
			}
		}
		return attachment_conn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment basicGetAttachment_conn() {
		return attachment_conn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachment_conn(Attachment newAttachment_conn, NotificationChain msgs) {
		Attachment oldAttachment_conn = attachment_conn;
		attachment_conn = newAttachment_conn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaPackage.ROLE__ATTACHMENT_CONN, oldAttachment_conn, newAttachment_conn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_conn(Attachment newAttachment_conn) {
		if (newAttachment_conn != attachment_conn) {
			NotificationChain msgs = null;
			if (attachment_conn != null)
				msgs = ((InternalEObject)attachment_conn).eInverseRemove(this, CosaPackage.ATTACHMENT__ROLE, Attachment.class, msgs);
			if (newAttachment_conn != null)
				msgs = ((InternalEObject)newAttachment_conn).eInverseAdd(this, CosaPackage.ATTACHMENT__ROLE, Attachment.class, msgs);
			msgs = basicSetAttachment_conn(newAttachment_conn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaPackage.ROLE__ATTACHMENT_CONN, newAttachment_conn, newAttachment_conn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CosaPackage.ROLE__ATTACHMENT_CONN:
				if (attachment_conn != null)
					msgs = ((InternalEObject)attachment_conn).eInverseRemove(this, CosaPackage.ATTACHMENT__ROLE, Attachment.class, msgs);
				return basicSetAttachment_conn((Attachment)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CosaPackage.ROLE__ATTACHMENT_CONN:
				return basicSetAttachment_conn(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CosaPackage.ROLE__ATTACHMENT_CONN:
				if (resolve) return getAttachment_conn();
				return basicGetAttachment_conn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CosaPackage.ROLE__ATTACHMENT_CONN:
				setAttachment_conn((Attachment)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CosaPackage.ROLE__ATTACHMENT_CONN:
				setAttachment_conn((Attachment)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CosaPackage.ROLE__ATTACHMENT_CONN:
				return attachment_conn != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void update() {
		request = attachment_conn.getRequest();
	}
	
	public String getRequest() {
		return request;
	}

} //RoleImpl
