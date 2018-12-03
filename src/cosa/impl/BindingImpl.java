/**
 */
package cosa.impl;

import cosa.Binding;
import cosa.CosaPackage;
import cosa.Port;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosa.impl.BindingImpl#getPort_conf <em>Port conf</em>}</li>
 *   <li>{@link cosa.impl.BindingImpl#getPort_comp <em>Port comp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingImpl extends MinimalEObjectImpl.Container implements Binding {
	/**
	 * The cached value of the '{@link #getPort_conf() <em>Port conf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_conf()
	 * @generated
	 * @ordered
	 */
	protected Port port_conf;

	/**
	 * The cached value of the '{@link #getPort_comp() <em>Port comp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_comp()
	 * @generated
	 * @ordered
	 */
	protected Port port_comp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaPackage.Literals.BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPort_conf() {
		if (port_conf != null && port_conf.eIsProxy()) {
			InternalEObject oldPort_conf = (InternalEObject)port_conf;
			port_conf = (Port)eResolveProxy(oldPort_conf);
			if (port_conf != oldPort_conf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CosaPackage.BINDING__PORT_CONF, oldPort_conf, port_conf));
			}
		}
		return port_conf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetPort_conf() {
		return port_conf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort_conf(Port newPort_conf, NotificationChain msgs) {
		Port oldPort_conf = port_conf;
		port_conf = newPort_conf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaPackage.BINDING__PORT_CONF, oldPort_conf, newPort_conf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_conf(Port newPort_conf) {
		if (newPort_conf != port_conf) {
			NotificationChain msgs = null;
			if (port_conf != null)
				msgs = ((InternalEObject)port_conf).eInverseRemove(this, CosaPackage.PORT__BINDING_CONF, Port.class, msgs);
			if (newPort_conf != null)
				msgs = ((InternalEObject)newPort_conf).eInverseAdd(this, CosaPackage.PORT__BINDING_CONF, Port.class, msgs);
			msgs = basicSetPort_conf(newPort_conf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaPackage.BINDING__PORT_CONF, newPort_conf, newPort_conf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPort_comp() {
		if (port_comp != null && port_comp.eIsProxy()) {
			InternalEObject oldPort_comp = (InternalEObject)port_comp;
			port_comp = (Port)eResolveProxy(oldPort_comp);
			if (port_comp != oldPort_comp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CosaPackage.BINDING__PORT_COMP, oldPort_comp, port_comp));
			}
		}
		return port_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetPort_comp() {
		return port_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort_comp(Port newPort_comp, NotificationChain msgs) {
		Port oldPort_comp = port_comp;
		port_comp = newPort_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaPackage.BINDING__PORT_COMP, oldPort_comp, newPort_comp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_comp(Port newPort_comp) {
		if (newPort_comp != port_comp) {
			NotificationChain msgs = null;
			if (port_comp != null)
				msgs = ((InternalEObject)port_comp).eInverseRemove(this, CosaPackage.PORT__BINDING_COMP, Port.class, msgs);
			if (newPort_comp != null)
				msgs = ((InternalEObject)newPort_comp).eInverseAdd(this, CosaPackage.PORT__BINDING_COMP, Port.class, msgs);
			msgs = basicSetPort_comp(newPort_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaPackage.BINDING__PORT_COMP, newPort_comp, newPort_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CosaPackage.BINDING__PORT_CONF:
				if (port_conf != null)
					msgs = ((InternalEObject)port_conf).eInverseRemove(this, CosaPackage.PORT__BINDING_CONF, Port.class, msgs);
				return basicSetPort_conf((Port)otherEnd, msgs);
			case CosaPackage.BINDING__PORT_COMP:
				if (port_comp != null)
					msgs = ((InternalEObject)port_comp).eInverseRemove(this, CosaPackage.PORT__BINDING_COMP, Port.class, msgs);
				return basicSetPort_comp((Port)otherEnd, msgs);
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
			case CosaPackage.BINDING__PORT_CONF:
				return basicSetPort_conf(null, msgs);
			case CosaPackage.BINDING__PORT_COMP:
				return basicSetPort_comp(null, msgs);
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
			case CosaPackage.BINDING__PORT_CONF:
				if (resolve) return getPort_conf();
				return basicGetPort_conf();
			case CosaPackage.BINDING__PORT_COMP:
				if (resolve) return getPort_comp();
				return basicGetPort_comp();
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
			case CosaPackage.BINDING__PORT_CONF:
				setPort_conf((Port)newValue);
				return;
			case CosaPackage.BINDING__PORT_COMP:
				setPort_comp((Port)newValue);
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
			case CosaPackage.BINDING__PORT_CONF:
				setPort_conf((Port)null);
				return;
			case CosaPackage.BINDING__PORT_COMP:
				setPort_comp((Port)null);
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
			case CosaPackage.BINDING__PORT_CONF:
				return port_conf != null;
			case CosaPackage.BINDING__PORT_COMP:
				return port_comp != null;
		}
		return super.eIsSet(featureID);
	}

} //BindingImpl
