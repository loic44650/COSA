/**
 */
package cosa.impl;

import cosa.Attachment;
import cosa.Binding;
import cosa.Composant;
import cosa.Configuration;
import cosa.Connecteur;
import cosa.CosaPackage;
import cosa.Interface_Composant;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosa.impl.ConfigurationImpl#getInterface_composant <em>Interface composant</em>}</li>
 *   <li>{@link cosa.impl.ConfigurationImpl#getConnecteur <em>Connecteur</em>}</li>
 *   <li>{@link cosa.impl.ConfigurationImpl#getComposant <em>Composant</em>}</li>
 *   <li>{@link cosa.impl.ConfigurationImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link cosa.impl.ConfigurationImpl#getAttachment <em>Attachment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends Element_ArchitecturalImpl implements Configuration {
	/**
	 * The cached value of the '{@link #getInterface_composant() <em>Interface composant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface_composant()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface_Composant> interface_composant;

	/**
	 * The cached value of the '{@link #getConnecteur() <em>Connecteur</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnecteur()
	 * @generated
	 * @ordered
	 */
	protected EList<Connecteur> connecteur;

	/**
	 * The cached value of the '{@link #getComposant() <em>Composant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposant()
	 * @generated
	 * @ordered
	 */
	protected EList<Composant> composant;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<Binding> binding;

	/**
	 * The cached value of the '{@link #getAttachment() <em>Attachment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> attachment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface_Composant> getInterface_composant() {
		if (interface_composant == null) {
			interface_composant = new EObjectContainmentEList<Interface_Composant>(Interface_Composant.class, this, CosaPackage.CONFIGURATION__INTERFACE_COMPOSANT);
		}
		return interface_composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connecteur> getConnecteur() {
		if (connecteur == null) {
			connecteur = new EObjectContainmentEList<Connecteur>(Connecteur.class, this, CosaPackage.CONFIGURATION__CONNECTEUR);
		}
		return connecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Composant> getComposant() {
		if (composant == null) {
			composant = new EObjectContainmentEList<Composant>(Composant.class, this, CosaPackage.CONFIGURATION__COMPOSANT);
		}
		return composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binding> getBinding() {
		if (binding == null) {
			binding = new EObjectContainmentEList<Binding>(Binding.class, this, CosaPackage.CONFIGURATION__BINDING);
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getAttachment() {
		if (attachment == null) {
			attachment = new EObjectContainmentEList<Attachment>(Attachment.class, this, CosaPackage.CONFIGURATION__ATTACHMENT);
		}
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CosaPackage.CONFIGURATION__INTERFACE_COMPOSANT:
				return ((InternalEList<?>)getInterface_composant()).basicRemove(otherEnd, msgs);
			case CosaPackage.CONFIGURATION__CONNECTEUR:
				return ((InternalEList<?>)getConnecteur()).basicRemove(otherEnd, msgs);
			case CosaPackage.CONFIGURATION__COMPOSANT:
				return ((InternalEList<?>)getComposant()).basicRemove(otherEnd, msgs);
			case CosaPackage.CONFIGURATION__BINDING:
				return ((InternalEList<?>)getBinding()).basicRemove(otherEnd, msgs);
			case CosaPackage.CONFIGURATION__ATTACHMENT:
				return ((InternalEList<?>)getAttachment()).basicRemove(otherEnd, msgs);
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
			case CosaPackage.CONFIGURATION__INTERFACE_COMPOSANT:
				return getInterface_composant();
			case CosaPackage.CONFIGURATION__CONNECTEUR:
				return getConnecteur();
			case CosaPackage.CONFIGURATION__COMPOSANT:
				return getComposant();
			case CosaPackage.CONFIGURATION__BINDING:
				return getBinding();
			case CosaPackage.CONFIGURATION__ATTACHMENT:
				return getAttachment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CosaPackage.CONFIGURATION__INTERFACE_COMPOSANT:
				getInterface_composant().clear();
				getInterface_composant().addAll((Collection<? extends Interface_Composant>)newValue);
				return;
			case CosaPackage.CONFIGURATION__CONNECTEUR:
				getConnecteur().clear();
				getConnecteur().addAll((Collection<? extends Connecteur>)newValue);
				return;
			case CosaPackage.CONFIGURATION__COMPOSANT:
				getComposant().clear();
				getComposant().addAll((Collection<? extends Composant>)newValue);
				return;
			case CosaPackage.CONFIGURATION__BINDING:
				getBinding().clear();
				getBinding().addAll((Collection<? extends Binding>)newValue);
				return;
			case CosaPackage.CONFIGURATION__ATTACHMENT:
				getAttachment().clear();
				getAttachment().addAll((Collection<? extends Attachment>)newValue);
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
			case CosaPackage.CONFIGURATION__INTERFACE_COMPOSANT:
				getInterface_composant().clear();
				return;
			case CosaPackage.CONFIGURATION__CONNECTEUR:
				getConnecteur().clear();
				return;
			case CosaPackage.CONFIGURATION__COMPOSANT:
				getComposant().clear();
				return;
			case CosaPackage.CONFIGURATION__BINDING:
				getBinding().clear();
				return;
			case CosaPackage.CONFIGURATION__ATTACHMENT:
				getAttachment().clear();
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
			case CosaPackage.CONFIGURATION__INTERFACE_COMPOSANT:
				return interface_composant != null && !interface_composant.isEmpty();
			case CosaPackage.CONFIGURATION__CONNECTEUR:
				return connecteur != null && !connecteur.isEmpty();
			case CosaPackage.CONFIGURATION__COMPOSANT:
				return composant != null && !composant.isEmpty();
			case CosaPackage.CONFIGURATION__BINDING:
				return binding != null && !binding.isEmpty();
			case CosaPackage.CONFIGURATION__ATTACHMENT:
				return attachment != null && !attachment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl
