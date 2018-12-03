/**
 */
package client_serveur.impl;

import client_serveur.Binding_Serveur_Comp_CM;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_CM_Serveur_Comp;

import cosa.impl.PortImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port CM Serveur Comp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Port_CM_Serveur_CompImpl#getBinding_serveur_comp_cm <em>Binding serveur comp cm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Port_CM_Serveur_CompImpl extends PortImpl implements Port_CM_Serveur_Comp {
	/**
	 * The cached value of the '{@link #getBinding_serveur_comp_cm() <em>Binding serveur comp cm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding_serveur_comp_cm()
	 * @generated
	 * @ordered
	 */
	protected Binding_Serveur_Comp_CM binding_serveur_comp_cm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Port_CM_Serveur_CompImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.PORT_CM_SERVEUR_COMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding_Serveur_Comp_CM getBinding_serveur_comp_cm() {
		if (binding_serveur_comp_cm != null && binding_serveur_comp_cm.eIsProxy()) {
			InternalEObject oldBinding_serveur_comp_cm = (InternalEObject)binding_serveur_comp_cm;
			binding_serveur_comp_cm = (Binding_Serveur_Comp_CM)eResolveProxy(oldBinding_serveur_comp_cm);
			if (binding_serveur_comp_cm != oldBinding_serveur_comp_cm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.PORT_CM_SERVEUR_COMP__BINDING_SERVEUR_COMP_CM, oldBinding_serveur_comp_cm, binding_serveur_comp_cm));
			}
		}
		return binding_serveur_comp_cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding_Serveur_Comp_CM basicGetBinding_serveur_comp_cm() {
		return binding_serveur_comp_cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinding_serveur_comp_cm(Binding_Serveur_Comp_CM newBinding_serveur_comp_cm, NotificationChain msgs) {
		Binding_Serveur_Comp_CM oldBinding_serveur_comp_cm = binding_serveur_comp_cm;
		binding_serveur_comp_cm = newBinding_serveur_comp_cm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.PORT_CM_SERVEUR_COMP__BINDING_SERVEUR_COMP_CM, oldBinding_serveur_comp_cm, newBinding_serveur_comp_cm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding_serveur_comp_cm(Binding_Serveur_Comp_CM newBinding_serveur_comp_cm) {
		if (newBinding_serveur_comp_cm != binding_serveur_comp_cm) {
			NotificationChain msgs = null;
			if (binding_serveur_comp_cm != null)
				msgs = ((InternalEObject)binding_serveur_comp_cm).eInverseRemove(this, Client_serveurPackage.BINDING_SERVEUR_COMP_CM__PORT_CM_SERVEUR_COMP, Binding_Serveur_Comp_CM.class, msgs);
			if (newBinding_serveur_comp_cm != null)
				msgs = ((InternalEObject)newBinding_serveur_comp_cm).eInverseAdd(this, Client_serveurPackage.BINDING_SERVEUR_COMP_CM__PORT_CM_SERVEUR_COMP, Binding_Serveur_Comp_CM.class, msgs);
			msgs = basicSetBinding_serveur_comp_cm(newBinding_serveur_comp_cm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.PORT_CM_SERVEUR_COMP__BINDING_SERVEUR_COMP_CM, newBinding_serveur_comp_cm, newBinding_serveur_comp_cm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.PORT_CM_SERVEUR_COMP__BINDING_SERVEUR_COMP_CM:
				if (binding_serveur_comp_cm != null)
					msgs = ((InternalEObject)binding_serveur_comp_cm).eInverseRemove(this, Client_serveurPackage.BINDING_SERVEUR_COMP_CM__PORT_CM_SERVEUR_COMP, Binding_Serveur_Comp_CM.class, msgs);
				return basicSetBinding_serveur_comp_cm((Binding_Serveur_Comp_CM)otherEnd, msgs);
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
			case Client_serveurPackage.PORT_CM_SERVEUR_COMP__BINDING_SERVEUR_COMP_CM:
				return basicSetBinding_serveur_comp_cm(null, msgs);
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
			case Client_serveurPackage.PORT_CM_SERVEUR_COMP__BINDING_SERVEUR_COMP_CM:
				if (resolve) return getBinding_serveur_comp_cm();
				return basicGetBinding_serveur_comp_cm();
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
			case Client_serveurPackage.PORT_CM_SERVEUR_COMP__BINDING_SERVEUR_COMP_CM:
				setBinding_serveur_comp_cm((Binding_Serveur_Comp_CM)newValue);
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
			case Client_serveurPackage.PORT_CM_SERVEUR_COMP__BINDING_SERVEUR_COMP_CM:
				setBinding_serveur_comp_cm((Binding_Serveur_Comp_CM)null);
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
			case Client_serveurPackage.PORT_CM_SERVEUR_COMP__BINDING_SERVEUR_COMP_CM:
				return binding_serveur_comp_cm != null;
		}
		return super.eIsSet(featureID);
	}

} //Port_CM_Serveur_CompImpl
