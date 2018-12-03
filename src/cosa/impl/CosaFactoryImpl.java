/**
 */
package cosa.impl;

import cosa.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CosaFactoryImpl extends EFactoryImpl implements CosaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CosaFactory init() {
		try {
			CosaFactory theCosaFactory = (CosaFactory)EPackage.Registry.INSTANCE.getEFactory(CosaPackage.eNS_URI);
			if (theCosaFactory != null) {
				return theCosaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CosaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CosaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CosaPackage.ELEMENT_ARCHITECTURAL: return createElement_Architectural();
			case CosaPackage.CONTRAINTES: return createContraintes();
			case CosaPackage.PROPRIETES: return createProprietes();
			case CosaPackage.PROPRIETES_NON_FONCTIONNELLES: return createProprietes_Non_Fonctionnelles();
			case CosaPackage.CONFIGURATION: return createConfiguration();
			case CosaPackage.COMPOSANT: return createComposant();
			case CosaPackage.CONNECTEUR: return createConnecteur();
			case CosaPackage.INTERFACE: return createInterface();
			case CosaPackage.PROPRIETES_FONCTIONNELLES: return createProprietes_Fonctionnelles();
			case CosaPackage.SERVICE: return createService();
			case CosaPackage.ATTACHMENT: return createAttachment();
			case CosaPackage.ROLE: return createRole();
			case CosaPackage.BINDING: return createBinding();
			case CosaPackage.PORT: return createPort();
			case CosaPackage.GLU: return createGlu();
			case CosaPackage.INTERFACE_COMPOSANT: return createInterface_Composant();
			case CosaPackage.INTERFACE_CONNECTEUR: return createInterface_Connecteur();
			case CosaPackage.SERVICE_FOURNI: return createService_Fourni();
			case CosaPackage.SERVICE_REQUIS: return createService_Requis();
			case CosaPackage.ROLE_FOURNI: return createRole_Fourni();
			case CosaPackage.ROLE_REQUIS: return createRole_Requis();
			case CosaPackage.PORT_REQUIS: return createPort_Requis();
			case CosaPackage.PORT_FOURNI: return createPort_Fourni();
			case CosaPackage.SERVICE_CONNECTEUR: return createService_Connecteur();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element_Architectural createElement_Architectural() {
		Element_ArchitecturalImpl element_Architectural = new Element_ArchitecturalImpl();
		return element_Architectural;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contraintes createContraintes() {
		ContraintesImpl contraintes = new ContraintesImpl();
		return contraintes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proprietes createProprietes() {
		ProprietesImpl proprietes = new ProprietesImpl();
		return proprietes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proprietes_Non_Fonctionnelles createProprietes_Non_Fonctionnelles() {
		Proprietes_Non_FonctionnellesImpl proprietes_Non_Fonctionnelles = new Proprietes_Non_FonctionnellesImpl();
		return proprietes_Non_Fonctionnelles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composant createComposant() {
		ComposantImpl composant = new ComposantImpl();
		return composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connecteur createConnecteur() {
		ConnecteurImpl connecteur = new ConnecteurImpl();
		return connecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proprietes_Fonctionnelles createProprietes_Fonctionnelles() {
		Proprietes_FonctionnellesImpl proprietes_Fonctionnelles = new Proprietes_FonctionnellesImpl();
		return proprietes_Fonctionnelles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachment() {
		AttachmentImpl attachment = new AttachmentImpl();
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glu createGlu() {
		GluImpl glu = new GluImpl();
		return glu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface_Composant createInterface_Composant() {
		Interface_ComposantImpl interface_Composant = new Interface_ComposantImpl();
		return interface_Composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface_Connecteur createInterface_Connecteur() {
		Interface_ConnecteurImpl interface_Connecteur = new Interface_ConnecteurImpl();
		return interface_Connecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service_Fourni createService_Fourni() {
		Service_FourniImpl service_Fourni = new Service_FourniImpl();
		return service_Fourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service_Requis createService_Requis() {
		Service_RequisImpl service_Requis = new Service_RequisImpl();
		return service_Requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Fourni createRole_Fourni() {
		Role_FourniImpl role_Fourni = new Role_FourniImpl();
		return role_Fourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Requis createRole_Requis() {
		Role_RequisImpl role_Requis = new Role_RequisImpl();
		return role_Requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Requis createPort_Requis() {
		Port_RequisImpl port_Requis = new Port_RequisImpl();
		return port_Requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Fourni createPort_Fourni() {
		Port_FourniImpl port_Fourni = new Port_FourniImpl();
		return port_Fourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service_Connecteur createService_Connecteur() {
		Service_ConnecteurImpl service_Connecteur = new Service_ConnecteurImpl();
		return service_Connecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CosaPackage getCosaPackage() {
		return (CosaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CosaPackage getPackage() {
		return CosaPackage.eINSTANCE;
	}

} //CosaFactoryImpl
