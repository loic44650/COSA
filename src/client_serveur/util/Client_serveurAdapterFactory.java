/**
 */
package client_serveur.util;

import client_serveur.*;

import cosa.Attachment;
import cosa.Binding;
import cosa.Composant;
import cosa.Configuration;
import cosa.Connecteur;
import cosa.Element_Architectural;
import cosa.Interface;
import cosa.Interface_Composant;
import cosa.Interface_Connecteur;
import cosa.Port;
import cosa.Port_Fourni;
import cosa.Port_Requis;
import cosa.Role;
import cosa.Role_Fourni;
import cosa.Role_Requis;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see client_serveur.Client_serveurPackage
 * @generated
 */
public class Client_serveurAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Client_serveurPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client_serveurAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Client_serveurPackage.eINSTANCE;
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
	protected Client_serveurSwitch<Adapter> modelSwitch =
		new Client_serveurSwitch<Adapter>() {
			@Override
			public Adapter caseClient(Client object) {
				return createClientAdapter();
			}
			@Override
			public Adapter caseRPC(RPC object) {
				return createRPCAdapter();
			}
			@Override
			public Adapter caseClient_serveur(Client_serveur object) {
				return createClient_serveurAdapter();
			}
			@Override
			public Adapter caseInterface_Client(Interface_Client object) {
				return createInterface_ClientAdapter();
			}
			@Override
			public Adapter caseInterface_RPC(Interface_RPC object) {
				return createInterface_RPCAdapter();
			}
			@Override
			public Adapter caseDataBase(DataBase object) {
				return createDataBaseAdapter();
			}
			@Override
			public Adapter caseInterface_DataBase(Interface_DataBase object) {
				return createInterface_DataBaseAdapter();
			}
			@Override
			public Adapter caseServeur_Comp(Serveur_Comp object) {
				return createServeur_CompAdapter();
			}
			@Override
			public Adapter caseInterface_Serveur_Comp(Interface_Serveur_Comp object) {
				return createInterface_Serveur_CompAdapter();
			}
			@Override
			public Adapter caseServeur_Conf(Serveur_Conf object) {
				return createServeur_ConfAdapter();
			}
			@Override
			public Adapter casePort_Requis_Serveur(Port_Requis_Serveur object) {
				return createPort_Requis_ServeurAdapter();
			}
			@Override
			public Adapter casePort_Fourni_Serveur(Port_Fourni_Serveur object) {
				return createPort_Fourni_ServeurAdapter();
			}
			@Override
			public Adapter caseRole_Requis_RPC_Client(Role_Requis_RPC_Client object) {
				return createRole_Requis_RPC_ClientAdapter();
			}
			@Override
			public Adapter caseRole_Fourni_RPC_Client(Role_Fourni_RPC_Client object) {
				return createRole_Fourni_RPC_ClientAdapter();
			}
			@Override
			public Adapter casePort_Requis_Client(Port_Requis_Client object) {
				return createPort_Requis_ClientAdapter();
			}
			@Override
			public Adapter casePort_Fourni_Client(Port_Fourni_Client object) {
				return createPort_Fourni_ClientAdapter();
			}
			@Override
			public Adapter caseAttachment_Client_RPC(Attachment_Client_RPC object) {
				return createAttachment_Client_RPCAdapter();
			}
			@Override
			public Adapter caseAttachment_RPC_Client(Attachment_RPC_Client object) {
				return createAttachment_RPC_ClientAdapter();
			}
			@Override
			public Adapter caseRole_Requis_RPC_Serveur(Role_Requis_RPC_Serveur object) {
				return createRole_Requis_RPC_ServeurAdapter();
			}
			@Override
			public Adapter caseRole_Fourni_RPC_Serveur(Role_Fourni_RPC_Serveur object) {
				return createRole_Fourni_RPC_ServeurAdapter();
			}
			@Override
			public Adapter caseAttachment_RPC_Serveur(Attachment_RPC_Serveur object) {
				return createAttachment_RPC_ServeurAdapter();
			}
			@Override
			public Adapter caseAttachement_Serveur_RPC(Attachement_Serveur_RPC object) {
				return createAttachement_Serveur_RPCAdapter();
			}
			@Override
			public Adapter caseSecurity_Manager(Security_Manager object) {
				return createSecurity_ManagerAdapter();
			}
			@Override
			public Adapter caseConnection_Manager(Connection_Manager object) {
				return createConnection_ManagerAdapter();
			}
			@Override
			public Adapter caseInterface_Connection_Manager(Interface_Connection_Manager object) {
				return createInterface_Connection_ManagerAdapter();
			}
			@Override
			public Adapter caseInterface_Security_Manager(Interface_Security_Manager object) {
				return createInterface_Security_ManagerAdapter();
			}
			@Override
			public Adapter casePort_Requis_Alpha_CM(Port_Requis_Alpha_CM object) {
				return createPort_Requis_Alpha_CMAdapter();
			}
			@Override
			public Adapter casePort_Fourni_CM_Alpha(Port_Fourni_CM_Alpha object) {
				return createPort_Fourni_CM_AlphaAdapter();
			}
			@Override
			public Adapter casePort_Fourni_CM_Gamma(Port_Fourni_CM_Gamma object) {
				return createPort_Fourni_CM_GammaAdapter();
			}
			@Override
			public Adapter casePort_Requis_Gamma_CM(Port_Requis_Gamma_CM object) {
				return createPort_Requis_Gamma_CMAdapter();
			}
			@Override
			public Adapter casePort_Fourni_DB_Gamma(Port_Fourni_DB_Gamma object) {
				return createPort_Fourni_DB_GammaAdapter();
			}
			@Override
			public Adapter casePort_Requis_Gamma_DB(Port_Requis_Gamma_DB object) {
				return createPort_Requis_Gamma_DBAdapter();
			}
			@Override
			public Adapter casePort_Fourni_DB_Beta(Port_Fourni_DB_Beta object) {
				return createPort_Fourni_DB_BetaAdapter();
			}
			@Override
			public Adapter casePort_Requis_Beta_DB(Port_Requis_Beta_DB object) {
				return createPort_Requis_Beta_DBAdapter();
			}
			@Override
			public Adapter casePort_Fourni_SM_Alpha(Port_Fourni_SM_Alpha object) {
				return createPort_Fourni_SM_AlphaAdapter();
			}
			@Override
			public Adapter casePort_Requis_Alpha_SM(Port_Requis_Alpha_SM object) {
				return createPort_Requis_Alpha_SMAdapter();
			}
			@Override
			public Adapter casePort_Fourni_SM_Beta(Port_Fourni_SM_Beta object) {
				return createPort_Fourni_SM_BetaAdapter();
			}
			@Override
			public Adapter casePort_Requis_Beta_SM(Port_Requis_Beta_SM object) {
				return createPort_Requis_Beta_SMAdapter();
			}
			@Override
			public Adapter caseBeta(Beta object) {
				return createBetaAdapter();
			}
			@Override
			public Adapter caseAlpha(Alpha object) {
				return createAlphaAdapter();
			}
			@Override
			public Adapter caseGamma(Gamma object) {
				return createGammaAdapter();
			}
			@Override
			public Adapter caseInterface_Beta(Interface_Beta object) {
				return createInterface_BetaAdapter();
			}
			@Override
			public Adapter caseInterface_Alpha(Interface_Alpha object) {
				return createInterface_AlphaAdapter();
			}
			@Override
			public Adapter caseInterface_Gamma(Interface_Gamma object) {
				return createInterface_GammaAdapter();
			}
			@Override
			public Adapter caseRole_Requis_SM_Beta(Role_Requis_SM_Beta object) {
				return createRole_Requis_SM_BetaAdapter();
			}
			@Override
			public Adapter caseRole_Fourni_Beta_SM(Role_Fourni_Beta_SM object) {
				return createRole_Fourni_Beta_SMAdapter();
			}
			@Override
			public Adapter caseRole_Requis_DB_Beta(Role_Requis_DB_Beta object) {
				return createRole_Requis_DB_BetaAdapter();
			}
			@Override
			public Adapter caseRole_Fourni_Beta_DB(Role_Fourni_Beta_DB object) {
				return createRole_Fourni_Beta_DBAdapter();
			}
			@Override
			public Adapter caseRole_Fourni_Gamma_CM(Role_Fourni_Gamma_CM object) {
				return createRole_Fourni_Gamma_CMAdapter();
			}
			@Override
			public Adapter caseRole_Requis_CM_Gamma(Role_Requis_CM_Gamma object) {
				return createRole_Requis_CM_GammaAdapter();
			}
			@Override
			public Adapter caseRole_Requis_DB_Gamma(Role_Requis_DB_Gamma object) {
				return createRole_Requis_DB_GammaAdapter();
			}
			@Override
			public Adapter caseRole_Fourni_Gamma_DB(Role_Fourni_Gamma_DB object) {
				return createRole_Fourni_Gamma_DBAdapter();
			}
			@Override
			public Adapter caseRole_Requis_SM_Alpha(Role_Requis_SM_Alpha object) {
				return createRole_Requis_SM_AlphaAdapter();
			}
			@Override
			public Adapter caseRole_Fourni_Alpha_SM(Role_Fourni_Alpha_SM object) {
				return createRole_Fourni_Alpha_SMAdapter();
			}
			@Override
			public Adapter caseRole_Requis_CM_Alpha(Role_Requis_CM_Alpha object) {
				return createRole_Requis_CM_AlphaAdapter();
			}
			@Override
			public Adapter caseRole_Fourni_Alpha_CM(Role_Fourni_Alpha_CM object) {
				return createRole_Fourni_Alpha_CMAdapter();
			}
			@Override
			public Adapter caseAttachment_SM_Alpha(Attachment_SM_Alpha object) {
				return createAttachment_SM_AlphaAdapter();
			}
			@Override
			public Adapter caseAttachment_Alpha_SM(Attachment_Alpha_SM object) {
				return createAttachment_Alpha_SMAdapter();
			}
			@Override
			public Adapter caseAttachment_CM_Alpha(Attachment_CM_Alpha object) {
				return createAttachment_CM_AlphaAdapter();
			}
			@Override
			public Adapter caseAttachment_Alpha_CM(Attachment_Alpha_CM object) {
				return createAttachment_Alpha_CMAdapter();
			}
			@Override
			public Adapter caseAttachment_SM_Beta(Attachment_SM_Beta object) {
				return createAttachment_SM_BetaAdapter();
			}
			@Override
			public Adapter caseAttachment_Beta_SM(Attachment_Beta_SM object) {
				return createAttachment_Beta_SMAdapter();
			}
			@Override
			public Adapter caseAttachment_DB_Beta(Attachment_DB_Beta object) {
				return createAttachment_DB_BetaAdapter();
			}
			@Override
			public Adapter caseAttachment_Beta_DB(Attachment_Beta_DB object) {
				return createAttachment_Beta_DBAdapter();
			}
			@Override
			public Adapter caseAttachment_CM_Gamma(Attachment_CM_Gamma object) {
				return createAttachment_CM_GammaAdapter();
			}
			@Override
			public Adapter caseAttachment_Gamma_CM(Attachment_Gamma_CM object) {
				return createAttachment_Gamma_CMAdapter();
			}
			@Override
			public Adapter caseAttachment_DB_Gamma(Attachment_DB_Gamma object) {
				return createAttachment_DB_GammaAdapter();
			}
			@Override
			public Adapter caseAttachment_Gamma_DB(Attachment_Gamma_DB object) {
				return createAttachment_Gamma_DBAdapter();
			}
			@Override
			public Adapter casePort_Serveur_Comp_Serveur_Comf(Port_Serveur_Comp_Serveur_Comf object) {
				return createPort_Serveur_Comp_Serveur_ComfAdapter();
			}
			@Override
			public Adapter caseInterface_Serveur_Conf(Interface_Serveur_Conf object) {
				return createInterface_Serveur_ConfAdapter();
			}
			@Override
			public Adapter casePort_Serveur_Conf_Serveur_Comp(Port_Serveur_Conf_Serveur_Comp object) {
				return createPort_Serveur_Conf_Serveur_CompAdapter();
			}
			@Override
			public Adapter caseBinding_Serveur_Comp_Serveur_Conf(Binding_Serveur_Comp_Serveur_Conf object) {
				return createBinding_Serveur_Comp_Serveur_ConfAdapter();
			}
			@Override
			public Adapter casePort_CM_Serveur_Comp(Port_CM_Serveur_Comp object) {
				return createPort_CM_Serveur_CompAdapter();
			}
			@Override
			public Adapter casePort_Serveur_Comp_CM(Port_Serveur_Comp_CM object) {
				return createPort_Serveur_Comp_CMAdapter();
			}
			@Override
			public Adapter caseBinding_Serveur_Comp_CM(Binding_Serveur_Comp_CM object) {
				return createBinding_Serveur_Comp_CMAdapter();
			}
			@Override
			public Adapter caseElement_Architectural(Element_Architectural object) {
				return createElement_ArchitecturalAdapter();
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
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseInterface_Connecteur(Interface_Connecteur object) {
				return createInterface_ConnecteurAdapter();
			}
			@Override
			public Adapter caseInterface_Composant(Interface_Composant object) {
				return createInterface_ComposantAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
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
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseRole_Requis(Role_Requis object) {
				return createRole_RequisAdapter();
			}
			@Override
			public Adapter caseRole_Fourni(Role_Fourni object) {
				return createRole_FourniAdapter();
			}
			@Override
			public Adapter caseAttachment(Attachment object) {
				return createAttachmentAdapter();
			}
			@Override
			public Adapter caseBinding(Binding object) {
				return createBindingAdapter();
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
	 * Creates a new adapter for an object of class '{@link client_serveur.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Client
	 * @generated
	 */
	public Adapter createClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.RPC <em>RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.RPC
	 * @generated
	 */
	public Adapter createRPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Client_serveur <em>Client serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Client_serveur
	 * @generated
	 */
	public Adapter createClient_serveurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Interface_Client <em>Interface Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Interface_Client
	 * @generated
	 */
	public Adapter createInterface_ClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Interface_RPC <em>Interface RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Interface_RPC
	 * @generated
	 */
	public Adapter createInterface_RPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.DataBase <em>Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.DataBase
	 * @generated
	 */
	public Adapter createDataBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Interface_DataBase <em>Interface Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Interface_DataBase
	 * @generated
	 */
	public Adapter createInterface_DataBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Serveur_Comp <em>Serveur Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Serveur_Comp
	 * @generated
	 */
	public Adapter createServeur_CompAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Interface_Serveur_Comp <em>Interface Serveur Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Interface_Serveur_Comp
	 * @generated
	 */
	public Adapter createInterface_Serveur_CompAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Serveur_Conf <em>Serveur Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Serveur_Conf
	 * @generated
	 */
	public Adapter createServeur_ConfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Port_Requis_Serveur <em>Port Requis Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Port_Requis_Serveur
	 * @generated
	 */
	public Adapter createPort_Requis_ServeurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Port_Fourni_Serveur <em>Port Fourni Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Port_Fourni_Serveur
	 * @generated
	 */
	public Adapter createPort_Fourni_ServeurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Role_Requis_RPC_Client <em>Role Requis RPC Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Role_Requis_RPC_Client
	 * @generated
	 */
	public Adapter createRole_Requis_RPC_ClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Role_Fourni_RPC_Client <em>Role Fourni RPC Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Role_Fourni_RPC_Client
	 * @generated
	 */
	public Adapter createRole_Fourni_RPC_ClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Port_Requis_Client <em>Port Requis Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Port_Requis_Client
	 * @generated
	 */
	public Adapter createPort_Requis_ClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Port_Fourni_Client <em>Port Fourni Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Port_Fourni_Client
	 * @generated
	 */
	public Adapter createPort_Fourni_ClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Attachment_Client_RPC <em>Attachment Client RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Attachment_Client_RPC
	 * @generated
	 */
	public Adapter createAttachment_Client_RPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Attachment_RPC_Client <em>Attachment RPC Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Attachment_RPC_Client
	 * @generated
	 */
	public Adapter createAttachment_RPC_ClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Role_Requis_RPC_Serveur <em>Role Requis RPC Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Role_Requis_RPC_Serveur
	 * @generated
	 */
	public Adapter createRole_Requis_RPC_ServeurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Role_Fourni_RPC_Serveur <em>Role Fourni RPC Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Role_Fourni_RPC_Serveur
	 * @generated
	 */
	public Adapter createRole_Fourni_RPC_ServeurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Attachment_RPC_Serveur <em>Attachment RPC Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Attachment_RPC_Serveur
	 * @generated
	 */
	public Adapter createAttachment_RPC_ServeurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Attachement_Serveur_RPC <em>Attachement Serveur RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Attachement_Serveur_RPC
	 * @generated
	 */
	public Adapter createAttachement_Serveur_RPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Security_Manager <em>Security Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Security_Manager
	 * @generated
	 */
	public Adapter createSecurity_ManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Connection_Manager <em>Connection Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Connection_Manager
	 * @generated
	 */
	public Adapter createConnection_ManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Interface_Connection_Manager <em>Interface Connection Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Interface_Connection_Manager
	 * @generated
	 */
	public Adapter createInterface_Connection_ManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Interface_Security_Manager <em>Interface Security Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Interface_Security_Manager
	 * @generated
	 */
	public Adapter createInterface_Security_ManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Port_Requis_Alpha_CM <em>Port Requis Alpha CM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Port_Requis_Alpha_CM
	 * @generated
	 */
	public Adapter createPort_Requis_Alpha_CMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Port_Fourni_CM_Alpha <em>Port Fourni CM Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Port_Fourni_CM_Alpha
	 * @generated
	 */
	public Adapter createPort_Fourni_CM_AlphaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Port_Fourni_CM_Gamma <em>Port Fourni CM Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Port_Fourni_CM_Gamma
	 * @generated
	 */
	public Adapter createPort_Fourni_CM_GammaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Port_Requis_Gamma_CM <em>Port Requis Gamma CM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Port_Requis_Gamma_CM
	 * @generated
	 */
	public Adapter createPort_Requis_Gamma_CMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Port_Fourni_DB_Gamma <em>Port Fourni DB Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Port_Fourni_DB_Gamma
	 * @generated
	 */
	public Adapter createPort_Fourni_DB_GammaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Port_Requis_Gamma_DB <em>Port Requis Gamma DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Port_Requis_Gamma_DB
	 * @generated
	 */
	public Adapter createPort_Requis_Gamma_DBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Port_Fourni_DB_Beta <em>Port Fourni DB Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Port_Fourni_DB_Beta
	 * @generated
	 */
	public Adapter createPort_Fourni_DB_BetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Port_Requis_Beta_DB <em>Port Requis Beta DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Port_Requis_Beta_DB
	 * @generated
	 */
	public Adapter createPort_Requis_Beta_DBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Port_Fourni_SM_Alpha <em>Port Fourni SM Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Port_Fourni_SM_Alpha
	 * @generated
	 */
	public Adapter createPort_Fourni_SM_AlphaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Port_Requis_Alpha_SM <em>Port Requis Alpha SM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Port_Requis_Alpha_SM
	 * @generated
	 */
	public Adapter createPort_Requis_Alpha_SMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Port_Fourni_SM_Beta <em>Port Fourni SM Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Port_Fourni_SM_Beta
	 * @generated
	 */
	public Adapter createPort_Fourni_SM_BetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Port_Requis_Beta_SM <em>Port Requis Beta SM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Port_Requis_Beta_SM
	 * @generated
	 */
	public Adapter createPort_Requis_Beta_SMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Beta <em>Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Beta
	 * @generated
	 */
	public Adapter createBetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Alpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Alpha
	 * @generated
	 */
	public Adapter createAlphaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Gamma <em>Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Gamma
	 * @generated
	 */
	public Adapter createGammaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Interface_Beta <em>Interface Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Interface_Beta
	 * @generated
	 */
	public Adapter createInterface_BetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Interface_Alpha <em>Interface Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Interface_Alpha
	 * @generated
	 */
	public Adapter createInterface_AlphaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Interface_Gamma <em>Interface Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Interface_Gamma
	 * @generated
	 */
	public Adapter createInterface_GammaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Role_Requis_SM_Beta <em>Role Requis SM Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Role_Requis_SM_Beta
	 * @generated
	 */
	public Adapter createRole_Requis_SM_BetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Role_Fourni_Beta_SM <em>Role Fourni Beta SM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Role_Fourni_Beta_SM
	 * @generated
	 */
	public Adapter createRole_Fourni_Beta_SMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Role_Requis_DB_Beta <em>Role Requis DB Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Role_Requis_DB_Beta
	 * @generated
	 */
	public Adapter createRole_Requis_DB_BetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Role_Fourni_Beta_DB <em>Role Fourni Beta DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Role_Fourni_Beta_DB
	 * @generated
	 */
	public Adapter createRole_Fourni_Beta_DBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Role_Fourni_Gamma_CM <em>Role Fourni Gamma CM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Role_Fourni_Gamma_CM
	 * @generated
	 */
	public Adapter createRole_Fourni_Gamma_CMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Role_Requis_CM_Gamma <em>Role Requis CM Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Role_Requis_CM_Gamma
	 * @generated
	 */
	public Adapter createRole_Requis_CM_GammaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Role_Requis_DB_Gamma <em>Role Requis DB Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Role_Requis_DB_Gamma
	 * @generated
	 */
	public Adapter createRole_Requis_DB_GammaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Role_Fourni_Gamma_DB <em>Role Fourni Gamma DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Role_Fourni_Gamma_DB
	 * @generated
	 */
	public Adapter createRole_Fourni_Gamma_DBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Role_Requis_SM_Alpha <em>Role Requis SM Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Role_Requis_SM_Alpha
	 * @generated
	 */
	public Adapter createRole_Requis_SM_AlphaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Role_Fourni_Alpha_SM <em>Role Fourni Alpha SM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Role_Fourni_Alpha_SM
	 * @generated
	 */
	public Adapter createRole_Fourni_Alpha_SMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Role_Requis_CM_Alpha <em>Role Requis CM Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Role_Requis_CM_Alpha
	 * @generated
	 */
	public Adapter createRole_Requis_CM_AlphaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Role_Fourni_Alpha_CM <em>Role Fourni Alpha CM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Role_Fourni_Alpha_CM
	 * @generated
	 */
	public Adapter createRole_Fourni_Alpha_CMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Attachment_SM_Alpha <em>Attachment SM Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Attachment_SM_Alpha
	 * @generated
	 */
	public Adapter createAttachment_SM_AlphaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Attachment_Alpha_SM <em>Attachment Alpha SM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Attachment_Alpha_SM
	 * @generated
	 */
	public Adapter createAttachment_Alpha_SMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Attachment_CM_Alpha <em>Attachment CM Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Attachment_CM_Alpha
	 * @generated
	 */
	public Adapter createAttachment_CM_AlphaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Attachment_Alpha_CM <em>Attachment Alpha CM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Attachment_Alpha_CM
	 * @generated
	 */
	public Adapter createAttachment_Alpha_CMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Attachment_SM_Beta <em>Attachment SM Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Attachment_SM_Beta
	 * @generated
	 */
	public Adapter createAttachment_SM_BetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Attachment_Beta_SM <em>Attachment Beta SM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Attachment_Beta_SM
	 * @generated
	 */
	public Adapter createAttachment_Beta_SMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Attachment_DB_Beta <em>Attachment DB Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Attachment_DB_Beta
	 * @generated
	 */
	public Adapter createAttachment_DB_BetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Attachment_Beta_DB <em>Attachment Beta DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Attachment_Beta_DB
	 * @generated
	 */
	public Adapter createAttachment_Beta_DBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Attachment_CM_Gamma <em>Attachment CM Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Attachment_CM_Gamma
	 * @generated
	 */
	public Adapter createAttachment_CM_GammaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Attachment_Gamma_CM <em>Attachment Gamma CM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Attachment_Gamma_CM
	 * @generated
	 */
	public Adapter createAttachment_Gamma_CMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Attachment_DB_Gamma <em>Attachment DB Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Attachment_DB_Gamma
	 * @generated
	 */
	public Adapter createAttachment_DB_GammaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Attachment_Gamma_DB <em>Attachment Gamma DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Attachment_Gamma_DB
	 * @generated
	 */
	public Adapter createAttachment_Gamma_DBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Port_Serveur_Comp_Serveur_Comf <em>Port Serveur Comp Serveur Comf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Port_Serveur_Comp_Serveur_Comf
	 * @generated
	 */
	public Adapter createPort_Serveur_Comp_Serveur_ComfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Interface_Serveur_Conf <em>Interface Serveur Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Interface_Serveur_Conf
	 * @generated
	 */
	public Adapter createInterface_Serveur_ConfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Port_Serveur_Conf_Serveur_Comp <em>Port Serveur Conf Serveur Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Port_Serveur_Conf_Serveur_Comp
	 * @generated
	 */
	public Adapter createPort_Serveur_Conf_Serveur_CompAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Binding_Serveur_Comp_Serveur_Conf <em>Binding Serveur Comp Serveur Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Binding_Serveur_Comp_Serveur_Conf
	 * @generated
	 */
	public Adapter createBinding_Serveur_Comp_Serveur_ConfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Port_CM_Serveur_Comp <em>Port CM Serveur Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Port_CM_Serveur_Comp
	 * @generated
	 */
	public Adapter createPort_CM_Serveur_CompAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Port_Serveur_Comp_CM <em>Port Serveur Comp CM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Port_Serveur_Comp_CM
	 * @generated
	 */
	public Adapter createPort_Serveur_Comp_CMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link client_serveur.Binding_Serveur_Comp_CM <em>Binding Serveur Comp CM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see client_serveur.Binding_Serveur_Comp_CM
	 * @generated
	 */
	public Adapter createBinding_Serveur_Comp_CMAdapter() {
		return null;
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

} //Client_serveurAdapterFactory
