/**
 */
package cosa.impl;

import cosa.Attachment;
import cosa.Binding;
import cosa.CosaPackage;
import cosa.Port;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosa.impl.PortImpl#getAttachment_comp <em>Attachment comp</em>}</li>
 *   <li>{@link cosa.impl.PortImpl#getBinding_conf <em>Binding conf</em>}</li>
 *   <li>{@link cosa.impl.PortImpl#getBinding_comp <em>Binding comp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortImpl extends Interface_ComposantImpl implements Port {
	/**
	 * The cached value of the '{@link #getAttachment_comp() <em>Attachment comp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_comp()
	 * @generated
	 * @ordered
	 */
	protected Attachment attachment_comp;

	/**
	 * The cached value of the '{@link #getBinding_conf() <em>Binding conf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding_conf()
	 * @generated
	 * @ordered
	 */
	protected Binding binding_conf;

	/**
	 * The cached value of the '{@link #getBinding_comp() <em>Binding comp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding_comp()
	 * @generated
	 * @ordered
	 */
	protected Binding binding_comp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaPackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getAttachment_comp() {
		if (attachment_comp != null && attachment_comp.eIsProxy()) {
			InternalEObject oldAttachment_comp = (InternalEObject)attachment_comp;
			attachment_comp = (Attachment)eResolveProxy(oldAttachment_comp);
			if (attachment_comp != oldAttachment_comp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CosaPackage.PORT__ATTACHMENT_COMP, oldAttachment_comp, attachment_comp));
			}
		}
		return attachment_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment basicGetAttachment_comp() {
		return attachment_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachment_comp(Attachment newAttachment_comp, NotificationChain msgs) {
		Attachment oldAttachment_comp = attachment_comp;
		attachment_comp = newAttachment_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaPackage.PORT__ATTACHMENT_COMP, oldAttachment_comp, newAttachment_comp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_comp(Attachment newAttachment_comp) {
		if (newAttachment_comp != attachment_comp) {
			NotificationChain msgs = null;
			if (attachment_comp != null)
				msgs = ((InternalEObject)attachment_comp).eInverseRemove(this, CosaPackage.ATTACHMENT__PORT, Attachment.class, msgs);
			if (newAttachment_comp != null)
				msgs = ((InternalEObject)newAttachment_comp).eInverseAdd(this, CosaPackage.ATTACHMENT__PORT, Attachment.class, msgs);
			msgs = basicSetAttachment_comp(newAttachment_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaPackage.PORT__ATTACHMENT_COMP, newAttachment_comp, newAttachment_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding getBinding_conf() {
		if (binding_conf != null && binding_conf.eIsProxy()) {
			InternalEObject oldBinding_conf = (InternalEObject)binding_conf;
			binding_conf = (Binding)eResolveProxy(oldBinding_conf);
			if (binding_conf != oldBinding_conf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CosaPackage.PORT__BINDING_CONF, oldBinding_conf, binding_conf));
			}
		}
		return binding_conf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding basicGetBinding_conf() {
		return binding_conf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinding_conf(Binding newBinding_conf, NotificationChain msgs) {
		Binding oldBinding_conf = binding_conf;
		binding_conf = newBinding_conf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaPackage.PORT__BINDING_CONF, oldBinding_conf, newBinding_conf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding_conf(Binding newBinding_conf) {
		if (newBinding_conf != binding_conf) {
			NotificationChain msgs = null;
			if (binding_conf != null)
				msgs = ((InternalEObject)binding_conf).eInverseRemove(this, CosaPackage.BINDING__PORT_CONF, Binding.class, msgs);
			if (newBinding_conf != null)
				msgs = ((InternalEObject)newBinding_conf).eInverseAdd(this, CosaPackage.BINDING__PORT_CONF, Binding.class, msgs);
			msgs = basicSetBinding_conf(newBinding_conf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaPackage.PORT__BINDING_CONF, newBinding_conf, newBinding_conf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding getBinding_comp() {
		if (binding_comp != null && binding_comp.eIsProxy()) {
			InternalEObject oldBinding_comp = (InternalEObject)binding_comp;
			binding_comp = (Binding)eResolveProxy(oldBinding_comp);
			if (binding_comp != oldBinding_comp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CosaPackage.PORT__BINDING_COMP, oldBinding_comp, binding_comp));
			}
		}
		return binding_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding basicGetBinding_comp() {
		return binding_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinding_comp(Binding newBinding_comp, NotificationChain msgs) {
		Binding oldBinding_comp = binding_comp;
		binding_comp = newBinding_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaPackage.PORT__BINDING_COMP, oldBinding_comp, newBinding_comp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding_comp(Binding newBinding_comp) {
		if (newBinding_comp != binding_comp) {
			NotificationChain msgs = null;
			if (binding_comp != null)
				msgs = ((InternalEObject)binding_comp).eInverseRemove(this, CosaPackage.BINDING__PORT_COMP, Binding.class, msgs);
			if (newBinding_comp != null)
				msgs = ((InternalEObject)newBinding_comp).eInverseAdd(this, CosaPackage.BINDING__PORT_COMP, Binding.class, msgs);
			msgs = basicSetBinding_comp(newBinding_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaPackage.PORT__BINDING_COMP, newBinding_comp, newBinding_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CosaPackage.PORT__ATTACHMENT_COMP:
				if (attachment_comp != null)
					msgs = ((InternalEObject)attachment_comp).eInverseRemove(this, CosaPackage.ATTACHMENT__PORT, Attachment.class, msgs);
				return basicSetAttachment_comp((Attachment)otherEnd, msgs);
			case CosaPackage.PORT__BINDING_CONF:
				if (binding_conf != null)
					msgs = ((InternalEObject)binding_conf).eInverseRemove(this, CosaPackage.BINDING__PORT_CONF, Binding.class, msgs);
				return basicSetBinding_conf((Binding)otherEnd, msgs);
			case CosaPackage.PORT__BINDING_COMP:
				if (binding_comp != null)
					msgs = ((InternalEObject)binding_comp).eInverseRemove(this, CosaPackage.BINDING__PORT_COMP, Binding.class, msgs);
				return basicSetBinding_comp((Binding)otherEnd, msgs);
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
			case CosaPackage.PORT__ATTACHMENT_COMP:
				return basicSetAttachment_comp(null, msgs);
			case CosaPackage.PORT__BINDING_CONF:
				return basicSetBinding_conf(null, msgs);
			case CosaPackage.PORT__BINDING_COMP:
				return basicSetBinding_comp(null, msgs);
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
			case CosaPackage.PORT__ATTACHMENT_COMP:
				if (resolve) return getAttachment_comp();
				return basicGetAttachment_comp();
			case CosaPackage.PORT__BINDING_CONF:
				if (resolve) return getBinding_conf();
				return basicGetBinding_conf();
			case CosaPackage.PORT__BINDING_COMP:
				if (resolve) return getBinding_comp();
				return basicGetBinding_comp();
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
			case CosaPackage.PORT__ATTACHMENT_COMP:
				setAttachment_comp((Attachment)newValue);
				return;
			case CosaPackage.PORT__BINDING_CONF:
				setBinding_conf((Binding)newValue);
				return;
			case CosaPackage.PORT__BINDING_COMP:
				setBinding_comp((Binding)newValue);
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
			case CosaPackage.PORT__ATTACHMENT_COMP:
				setAttachment_comp((Attachment)null);
				return;
			case CosaPackage.PORT__BINDING_CONF:
				setBinding_conf((Binding)null);
				return;
			case CosaPackage.PORT__BINDING_COMP:
				setBinding_comp((Binding)null);
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
			case CosaPackage.PORT__ATTACHMENT_COMP:
				return attachment_comp != null;
			case CosaPackage.PORT__BINDING_CONF:
				return binding_conf != null;
			case CosaPackage.PORT__BINDING_COMP:
				return binding_comp != null;
		}
		return super.eIsSet(featureID);
	}

} //PortImpl
