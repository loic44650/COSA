/**
 */
package client_serveur.impl;

import client_serveur.Attachement_Serveur_RPC;
import client_serveur.Client_serveurPackage;
import client_serveur.Port_Fourni_Serveur;

import cosa.impl.Port_FourniImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Fourni Serveur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link client_serveur.impl.Port_Fourni_ServeurImpl#getAttachement_serveur_rpc <em>Attachement serveur rpc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Port_Fourni_ServeurImpl extends Port_FourniImpl implements Port_Fourni_Serveur {
	/**
	 * The cached value of the '{@link #getAttachement_serveur_rpc() <em>Attachement serveur rpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachement_serveur_rpc()
	 * @generated
	 * @ordered
	 */
	protected Attachement_Serveur_RPC attachement_serveur_rpc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Port_Fourni_ServeurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Client_serveurPackage.Literals.PORT_FOURNI_SERVEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachement_Serveur_RPC getAttachement_serveur_rpc() {
		if (attachement_serveur_rpc != null && attachement_serveur_rpc.eIsProxy()) {
			InternalEObject oldAttachement_serveur_rpc = (InternalEObject)attachement_serveur_rpc;
			attachement_serveur_rpc = (Attachement_Serveur_RPC)eResolveProxy(oldAttachement_serveur_rpc);
			if (attachement_serveur_rpc != oldAttachement_serveur_rpc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Client_serveurPackage.PORT_FOURNI_SERVEUR__ATTACHEMENT_SERVEUR_RPC, oldAttachement_serveur_rpc, attachement_serveur_rpc));
			}
		}
		return attachement_serveur_rpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachement_Serveur_RPC basicGetAttachement_serveur_rpc() {
		return attachement_serveur_rpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachement_serveur_rpc(Attachement_Serveur_RPC newAttachement_serveur_rpc, NotificationChain msgs) {
		Attachement_Serveur_RPC oldAttachement_serveur_rpc = attachement_serveur_rpc;
		attachement_serveur_rpc = newAttachement_serveur_rpc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Client_serveurPackage.PORT_FOURNI_SERVEUR__ATTACHEMENT_SERVEUR_RPC, oldAttachement_serveur_rpc, newAttachement_serveur_rpc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachement_serveur_rpc(Attachement_Serveur_RPC newAttachement_serveur_rpc) {
		if (newAttachement_serveur_rpc != attachement_serveur_rpc) {
			NotificationChain msgs = null;
			if (attachement_serveur_rpc != null)
				msgs = ((InternalEObject)attachement_serveur_rpc).eInverseRemove(this, Client_serveurPackage.ATTACHEMENT_SERVEUR_RPC__PORT_FOURNI_SERVEUR, Attachement_Serveur_RPC.class, msgs);
			if (newAttachement_serveur_rpc != null)
				msgs = ((InternalEObject)newAttachement_serveur_rpc).eInverseAdd(this, Client_serveurPackage.ATTACHEMENT_SERVEUR_RPC__PORT_FOURNI_SERVEUR, Attachement_Serveur_RPC.class, msgs);
			msgs = basicSetAttachement_serveur_rpc(newAttachement_serveur_rpc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Client_serveurPackage.PORT_FOURNI_SERVEUR__ATTACHEMENT_SERVEUR_RPC, newAttachement_serveur_rpc, newAttachement_serveur_rpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Client_serveurPackage.PORT_FOURNI_SERVEUR__ATTACHEMENT_SERVEUR_RPC:
				if (attachement_serveur_rpc != null)
					msgs = ((InternalEObject)attachement_serveur_rpc).eInverseRemove(this, Client_serveurPackage.ATTACHEMENT_SERVEUR_RPC__PORT_FOURNI_SERVEUR, Attachement_Serveur_RPC.class, msgs);
				return basicSetAttachement_serveur_rpc((Attachement_Serveur_RPC)otherEnd, msgs);
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
			case Client_serveurPackage.PORT_FOURNI_SERVEUR__ATTACHEMENT_SERVEUR_RPC:
				return basicSetAttachement_serveur_rpc(null, msgs);
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
			case Client_serveurPackage.PORT_FOURNI_SERVEUR__ATTACHEMENT_SERVEUR_RPC:
				if (resolve) return getAttachement_serveur_rpc();
				return basicGetAttachement_serveur_rpc();
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
			case Client_serveurPackage.PORT_FOURNI_SERVEUR__ATTACHEMENT_SERVEUR_RPC:
				setAttachement_serveur_rpc((Attachement_Serveur_RPC)newValue);
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
			case Client_serveurPackage.PORT_FOURNI_SERVEUR__ATTACHEMENT_SERVEUR_RPC:
				setAttachement_serveur_rpc((Attachement_Serveur_RPC)null);
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
			case Client_serveurPackage.PORT_FOURNI_SERVEUR__ATTACHEMENT_SERVEUR_RPC:
				return attachement_serveur_rpc != null;
		}
		return super.eIsSet(featureID);
	}

} //Port_Fourni_ServeurImpl
