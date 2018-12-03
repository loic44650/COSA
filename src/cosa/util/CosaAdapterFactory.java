/**
 */
package cosa.util;

import cosa.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cosa.CosaPackage
 * @generated
 */
public class CosaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CosaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CosaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CosaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CosaSwitch<Adapter> modelSwitch =
		new CosaSwitch<Adapter>() {
			@Override
			public Adapter caseElement_Architectural(Element_Architectural object) {
				return createElement_ArchitecturalAdapter();
			}
			@Override
			public Adapter caseContraintes(Contraintes object) {
				return createContraintesAdapter();
			}
			@Override
			public Adapter caseProprietes(Proprietes object) {
				return createProprietesAdapter();
			}
			@Override
			public Adapter caseProprietes_Non_Fonctionnelles(Proprietes_Non_Fonctionnelles object) {
				return createProprietes_Non_FonctionnellesAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseComposant(Composant object) {
				return createComposantAdapter();
			}
			@Override
			public Adapter caseConnecteur(Connecteur object) {
				return createConnecteurAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseProprietes_Fonctionnelles(Proprietes_Fonctionnelles object) {
				return createProprietes_FonctionnellesAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseAttachment(Attachment object) {
				return createAttachmentAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseBinding(Binding object) {
				return createBindingAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseGlu(Glu object) {
				return createGluAdapter();
			}
			@Override
			public Adapter caseInterface_Composant(Interface_Composant object) {
				return createInterface_ComposantAdapter();
			}
			@Override
			public Adapter caseInterface_Connecteur(Interface_Connecteur object) {
				return createInterface_ConnecteurAdapter();
			}
			@Override
			public Adapter caseService_Fourni(Service_Fourni object) {
				return createService_FourniAdapter();
			}
			@Override
			public Adapter caseService_Requis(Service_Requis object) {
				return createService_RequisAdapter();
			}
			@Override
			public Adapter caseRole_Fourni(Role_Fourni object) {
				return createRole_FourniAdapter();
			}
			@Override
			public Adapter caseRole_Requis(Role_Requis object) {
				return createRole_RequisAdapter();
			}
			@Override
			public Adapter casePort_Requis(Port_Requis object) {
				return createPort_RequisAdapter();
			}
			@Override
			public Adapter casePort_Fourni(Port_Fourni object) {
				return createPort_FourniAdapter();
			}
			@Override
			public Adapter caseService_Connecteur(Service_Connecteur object) {
				return createService_ConnecteurAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link cosa.Element_Architectural <em>Element Architectural</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Element_Architectural
	 * @generated
	 */
	public Adapter createElement_ArchitecturalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Contraintes <em>Contraintes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Contraintes
	 * @generated
	 */
	public Adapter createContraintesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Proprietes <em>Proprietes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Proprietes
	 * @generated
	 */
	public Adapter createProprietesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Proprietes_Non_Fonctionnelles <em>Proprietes Non Fonctionnelles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Proprietes_Non_Fonctionnelles
	 * @generated
	 */
	public Adapter createProprietes_Non_FonctionnellesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Composant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Composant
	 * @generated
	 */
	public Adapter createComposantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Connecteur <em>Connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Connecteur
	 * @generated
	 */
	public Adapter createConnecteurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Proprietes_Fonctionnelles <em>Proprietes Fonctionnelles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Proprietes_Fonctionnelles
	 * @generated
	 */
	public Adapter createProprietes_FonctionnellesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Attachment
	 * @generated
	 */
	public Adapter createAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Glu <em>Glu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Glu
	 * @generated
	 */
	public Adapter createGluAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Interface_Composant <em>Interface Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Interface_Composant
	 * @generated
	 */
	public Adapter createInterface_ComposantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Interface_Connecteur <em>Interface Connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Interface_Connecteur
	 * @generated
	 */
	public Adapter createInterface_ConnecteurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Service_Fourni <em>Service Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Service_Fourni
	 * @generated
	 */
	public Adapter createService_FourniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Service_Requis <em>Service Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Service_Requis
	 * @generated
	 */
	public Adapter createService_RequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Role_Fourni <em>Role Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Role_Fourni
	 * @generated
	 */
	public Adapter createRole_FourniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Role_Requis <em>Role Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Role_Requis
	 * @generated
	 */
	public Adapter createRole_RequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Port_Requis <em>Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Port_Requis
	 * @generated
	 */
	public Adapter createPort_RequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Port_Fourni <em>Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Port_Fourni
	 * @generated
	 */
	public Adapter createPort_FourniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Service_Connecteur <em>Service Connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Service_Connecteur
	 * @generated
	 */
	public Adapter createService_ConnecteurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CosaAdapterFactory
