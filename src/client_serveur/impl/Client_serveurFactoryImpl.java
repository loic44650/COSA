/**
 */
package client_serveur.impl;

import client_serveur.*;

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
public class Client_serveurFactoryImpl extends EFactoryImpl implements Client_serveurFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Client_serveurFactory init() {
		try {
			Client_serveurFactory theClient_serveurFactory = (Client_serveurFactory)EPackage.Registry.INSTANCE.getEFactory(Client_serveurPackage.eNS_URI);
			if (theClient_serveurFactory != null) {
				return theClient_serveurFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Client_serveurFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client_serveurFactoryImpl() {
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
			case Client_serveurPackage.CLIENT: return createClient();
			case Client_serveurPackage.RPC: return createRPC();
			case Client_serveurPackage.CLIENT_SERVEUR: return createClient_serveur();
			case Client_serveurPackage.INTERFACE_CLIENT: return createInterface_Client();
			case Client_serveurPackage.INTERFACE_RPC: return createInterface_RPC();
			case Client_serveurPackage.DATA_BASE: return createDataBase();
			case Client_serveurPackage.INTERFACE_DATA_BASE: return createInterface_DataBase();
			case Client_serveurPackage.SERVEUR_COMP: return createServeur_Comp();
			case Client_serveurPackage.INTERFACE_SERVEUR_COMP: return createInterface_Serveur_Comp();
			case Client_serveurPackage.SERVEUR_CONF: return createServeur_Conf();
			case Client_serveurPackage.PORT_REQUIS_SERVEUR: return createPort_Requis_Serveur();
			case Client_serveurPackage.PORT_FOURNI_SERVEUR: return createPort_Fourni_Serveur();
			case Client_serveurPackage.ROLE_REQUIS_RPC_CLIENT: return createRole_Requis_RPC_Client();
			case Client_serveurPackage.ROLE_FOURNI_RPC_CLIENT: return createRole_Fourni_RPC_Client();
			case Client_serveurPackage.PORT_REQUIS_CLIENT: return createPort_Requis_Client();
			case Client_serveurPackage.PORT_FOURNI_CLIENT: return createPort_Fourni_Client();
			case Client_serveurPackage.ATTACHMENT_CLIENT_RPC: return createAttachment_Client_RPC();
			case Client_serveurPackage.ATTACHMENT_RPC_CLIENT: return createAttachment_RPC_Client();
			case Client_serveurPackage.ROLE_REQUIS_RPC_SERVEUR: return createRole_Requis_RPC_Serveur();
			case Client_serveurPackage.ROLE_FOURNI_RPC_SERVEUR: return createRole_Fourni_RPC_Serveur();
			case Client_serveurPackage.ATTACHMENT_RPC_SERVEUR: return createAttachment_RPC_Serveur();
			case Client_serveurPackage.ATTACHMENT_SERVEUR_RPC: return createAttachment_Serveur_RPC();
			case Client_serveurPackage.SECURITY_MANAGER: return createSecurity_Manager();
			case Client_serveurPackage.CONNECTION_MANAGER: return createConnection_Manager();
			case Client_serveurPackage.INTERFACE_CONNECTION_MANAGER: return createInterface_Connection_Manager();
			case Client_serveurPackage.INTERFACE_SECURITY_MANAGER: return createInterface_Security_Manager();
			case Client_serveurPackage.PORT_REQUIS_ALPHA_CM: return createPort_Requis_Alpha_CM();
			case Client_serveurPackage.PORT_FOURNI_CM_ALPHA: return createPort_Fourni_CM_Alpha();
			case Client_serveurPackage.PORT_FOURNI_CM_GAMMA: return createPort_Fourni_CM_Gamma();
			case Client_serveurPackage.PORT_REQUIS_GAMMA_CM: return createPort_Requis_Gamma_CM();
			case Client_serveurPackage.PORT_FOURNI_DB_GAMMA: return createPort_Fourni_DB_Gamma();
			case Client_serveurPackage.PORT_REQUIS_GAMMA_DB: return createPort_Requis_Gamma_DB();
			case Client_serveurPackage.PORT_FOURNI_DB_BETA: return createPort_Fourni_DB_Beta();
			case Client_serveurPackage.PORT_REQUIS_BETA_DB: return createPort_Requis_Beta_DB();
			case Client_serveurPackage.PORT_FOURNI_SM_ALPHA: return createPort_Fourni_SM_Alpha();
			case Client_serveurPackage.PORT_REQUIS_ALPHA_SM: return createPort_Requis_Alpha_SM();
			case Client_serveurPackage.PORT_FOURNI_SM_BETA: return createPort_Fourni_SM_Beta();
			case Client_serveurPackage.PORT_REQUIS_BETA_SM: return createPort_Requis_Beta_SM();
			case Client_serveurPackage.BETA: return createBeta();
			case Client_serveurPackage.ALPHA: return createAlpha();
			case Client_serveurPackage.GAMMA: return createGamma();
			case Client_serveurPackage.INTERFACE_BETA: return createInterface_Beta();
			case Client_serveurPackage.INTERFACE_ALPHA: return createInterface_Alpha();
			case Client_serveurPackage.INTERFACE_GAMMA: return createInterface_Gamma();
			case Client_serveurPackage.ROLE_REQUIS_SM_BETA: return createRole_Requis_SM_Beta();
			case Client_serveurPackage.ROLE_FOURNI_BETA_SM: return createRole_Fourni_Beta_SM();
			case Client_serveurPackage.ROLE_REQUIS_DB_BETA: return createRole_Requis_DB_Beta();
			case Client_serveurPackage.ROLE_FOURNI_BETA_DB: return createRole_Fourni_Beta_DB();
			case Client_serveurPackage.ROLE_FOURNI_GAMMA_CM: return createRole_Fourni_Gamma_CM();
			case Client_serveurPackage.ROLE_REQUIS_CM_GAMMA: return createRole_Requis_CM_Gamma();
			case Client_serveurPackage.ROLE_REQUIS_DB_GAMMA: return createRole_Requis_DB_Gamma();
			case Client_serveurPackage.ROLE_FOURNI_GAMMA_DB: return createRole_Fourni_Gamma_DB();
			case Client_serveurPackage.ROLE_REQUIS_SM_ALPHA: return createRole_Requis_SM_Alpha();
			case Client_serveurPackage.ROLE_FOURNI_ALPHA_SM: return createRole_Fourni_Alpha_SM();
			case Client_serveurPackage.ROLE_REQUIS_CM_ALPHA: return createRole_Requis_CM_Alpha();
			case Client_serveurPackage.ROLE_FOURNI_ALPHA_CM: return createRole_Fourni_Alpha_CM();
			case Client_serveurPackage.ATTACHMENT_SM_ALPHA: return createAttachment_SM_Alpha();
			case Client_serveurPackage.ATTACHMENT_ALPHA_SM: return createAttachment_Alpha_SM();
			case Client_serveurPackage.ATTACHMENT_CM_ALPHA: return createAttachment_CM_Alpha();
			case Client_serveurPackage.ATTACHMENT_ALPHA_CM: return createAttachment_Alpha_CM();
			case Client_serveurPackage.ATTACHMENT_SM_BETA: return createAttachment_SM_Beta();
			case Client_serveurPackage.ATTACHMENT_BETA_SM: return createAttachment_Beta_SM();
			case Client_serveurPackage.ATTACHMENT_DB_BETA: return createAttachment_DB_Beta();
			case Client_serveurPackage.ATTACHMENT_BETA_DB: return createAttachment_Beta_DB();
			case Client_serveurPackage.ATTACHMENT_CM_GAMMA: return createAttachment_CM_Gamma();
			case Client_serveurPackage.ATTACHMENT_GAMMA_CM: return createAttachment_Gamma_CM();
			case Client_serveurPackage.ATTACHMENT_DB_GAMMA: return createAttachment_DB_Gamma();
			case Client_serveurPackage.ATTACHMENT_GAMMA_DB: return createAttachment_Gamma_DB();
			case Client_serveurPackage.PORT_SERVEUR_COMP_SERVEUR_COMF: return createPort_Serveur_Comp_Serveur_Comf();
			case Client_serveurPackage.INTERFACE_SERVEUR_CONF: return createInterface_Serveur_Conf();
			case Client_serveurPackage.PORT_SERVEUR_CONF_SERVEUR_COMP: return createPort_Serveur_Conf_Serveur_Comp();
			case Client_serveurPackage.BINDING_SERVEUR_COMP_SERVEUR_CONF: return createBinding_Serveur_Comp_Serveur_Conf();
			case Client_serveurPackage.PORT_CM_SERVEUR_COMP: return createPort_CM_Serveur_Comp();
			case Client_serveurPackage.PORT_SERVEUR_COMP_CM: return createPort_Serveur_Comp_CM();
			case Client_serveurPackage.BINDING_SERVEUR_COMP_CM: return createBinding_Serveur_Comp_CM();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client createClient() {
		ClientImpl client = new ClientImpl();
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPC createRPC() {
		RPCImpl rpc = new RPCImpl();
		return rpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client_serveur createClient_serveur() {
		Client_serveurImpl client_serveur = new Client_serveurImpl();
		return client_serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface_Client createInterface_Client() {
		Interface_ClientImpl interface_Client = new Interface_ClientImpl();
		return interface_Client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface_RPC createInterface_RPC() {
		Interface_RPCImpl interface_RPC = new Interface_RPCImpl();
		return interface_RPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBase createDataBase() {
		DataBaseImpl dataBase = new DataBaseImpl();
		return dataBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface_DataBase createInterface_DataBase() {
		Interface_DataBaseImpl interface_DataBase = new Interface_DataBaseImpl();
		return interface_DataBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Serveur_Comp createServeur_Comp() {
		Serveur_CompImpl serveur_Comp = new Serveur_CompImpl();
		return serveur_Comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface_Serveur_Comp createInterface_Serveur_Comp() {
		Interface_Serveur_CompImpl interface_Serveur_Comp = new Interface_Serveur_CompImpl();
		return interface_Serveur_Comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Serveur_Conf createServeur_Conf() {
		Serveur_ConfImpl serveur_Conf = new Serveur_ConfImpl();
		return serveur_Conf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Requis_Serveur createPort_Requis_Serveur() {
		Port_Requis_ServeurImpl port_Requis_Serveur = new Port_Requis_ServeurImpl();
		return port_Requis_Serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Fourni_Serveur createPort_Fourni_Serveur() {
		Port_Fourni_ServeurImpl port_Fourni_Serveur = new Port_Fourni_ServeurImpl();
		return port_Fourni_Serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Requis_RPC_Client createRole_Requis_RPC_Client() {
		Role_Requis_RPC_ClientImpl role_Requis_RPC_Client = new Role_Requis_RPC_ClientImpl();
		return role_Requis_RPC_Client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Fourni_RPC_Client createRole_Fourni_RPC_Client() {
		Role_Fourni_RPC_ClientImpl role_Fourni_RPC_Client = new Role_Fourni_RPC_ClientImpl();
		return role_Fourni_RPC_Client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Requis_Client createPort_Requis_Client() {
		Port_Requis_ClientImpl port_Requis_Client = new Port_Requis_ClientImpl();
		return port_Requis_Client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Fourni_Client createPort_Fourni_Client() {
		Port_Fourni_ClientImpl port_Fourni_Client = new Port_Fourni_ClientImpl();
		return port_Fourni_Client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Client_RPC createAttachment_Client_RPC() {
		Attachment_Client_RPCImpl attachment_Client_RPC = new Attachment_Client_RPCImpl();
		return attachment_Client_RPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_RPC_Client createAttachment_RPC_Client() {
		Attachment_RPC_ClientImpl attachment_RPC_Client = new Attachment_RPC_ClientImpl();
		return attachment_RPC_Client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Requis_RPC_Serveur createRole_Requis_RPC_Serveur() {
		Role_Requis_RPC_ServeurImpl role_Requis_RPC_Serveur = new Role_Requis_RPC_ServeurImpl();
		return role_Requis_RPC_Serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Fourni_RPC_Serveur createRole_Fourni_RPC_Serveur() {
		Role_Fourni_RPC_ServeurImpl role_Fourni_RPC_Serveur = new Role_Fourni_RPC_ServeurImpl();
		return role_Fourni_RPC_Serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_RPC_Serveur createAttachment_RPC_Serveur() {
		Attachment_RPC_ServeurImpl attachment_RPC_Serveur = new Attachment_RPC_ServeurImpl();
		return attachment_RPC_Serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Serveur_RPC createAttachment_Serveur_RPC() {
		Attachment_Serveur_RPCImpl attachment_Serveur_RPC = new Attachment_Serveur_RPCImpl();
		return attachment_Serveur_RPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security_Manager createSecurity_Manager() {
		Security_ManagerImpl security_Manager = new Security_ManagerImpl();
		return security_Manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection_Manager createConnection_Manager() {
		Connection_ManagerImpl connection_Manager = new Connection_ManagerImpl();
		return connection_Manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface_Connection_Manager createInterface_Connection_Manager() {
		Interface_Connection_ManagerImpl interface_Connection_Manager = new Interface_Connection_ManagerImpl();
		return interface_Connection_Manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface_Security_Manager createInterface_Security_Manager() {
		Interface_Security_ManagerImpl interface_Security_Manager = new Interface_Security_ManagerImpl();
		return interface_Security_Manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Requis_Alpha_CM createPort_Requis_Alpha_CM() {
		Port_Requis_Alpha_CMImpl port_Requis_Alpha_CM = new Port_Requis_Alpha_CMImpl();
		return port_Requis_Alpha_CM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Fourni_CM_Alpha createPort_Fourni_CM_Alpha() {
		Port_Fourni_CM_AlphaImpl port_Fourni_CM_Alpha = new Port_Fourni_CM_AlphaImpl();
		return port_Fourni_CM_Alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Fourni_CM_Gamma createPort_Fourni_CM_Gamma() {
		Port_Fourni_CM_GammaImpl port_Fourni_CM_Gamma = new Port_Fourni_CM_GammaImpl();
		return port_Fourni_CM_Gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Requis_Gamma_CM createPort_Requis_Gamma_CM() {
		Port_Requis_Gamma_CMImpl port_Requis_Gamma_CM = new Port_Requis_Gamma_CMImpl();
		return port_Requis_Gamma_CM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Fourni_DB_Gamma createPort_Fourni_DB_Gamma() {
		Port_Fourni_DB_GammaImpl port_Fourni_DB_Gamma = new Port_Fourni_DB_GammaImpl();
		return port_Fourni_DB_Gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Requis_Gamma_DB createPort_Requis_Gamma_DB() {
		Port_Requis_Gamma_DBImpl port_Requis_Gamma_DB = new Port_Requis_Gamma_DBImpl();
		return port_Requis_Gamma_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Fourni_DB_Beta createPort_Fourni_DB_Beta() {
		Port_Fourni_DB_BetaImpl port_Fourni_DB_Beta = new Port_Fourni_DB_BetaImpl();
		return port_Fourni_DB_Beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Requis_Beta_DB createPort_Requis_Beta_DB() {
		Port_Requis_Beta_DBImpl port_Requis_Beta_DB = new Port_Requis_Beta_DBImpl();
		return port_Requis_Beta_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Fourni_SM_Alpha createPort_Fourni_SM_Alpha() {
		Port_Fourni_SM_AlphaImpl port_Fourni_SM_Alpha = new Port_Fourni_SM_AlphaImpl();
		return port_Fourni_SM_Alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Requis_Alpha_SM createPort_Requis_Alpha_SM() {
		Port_Requis_Alpha_SMImpl port_Requis_Alpha_SM = new Port_Requis_Alpha_SMImpl();
		return port_Requis_Alpha_SM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Fourni_SM_Beta createPort_Fourni_SM_Beta() {
		Port_Fourni_SM_BetaImpl port_Fourni_SM_Beta = new Port_Fourni_SM_BetaImpl();
		return port_Fourni_SM_Beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Requis_Beta_SM createPort_Requis_Beta_SM() {
		Port_Requis_Beta_SMImpl port_Requis_Beta_SM = new Port_Requis_Beta_SMImpl();
		return port_Requis_Beta_SM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Beta createBeta() {
		BetaImpl beta = new BetaImpl();
		return beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alpha createAlpha() {
		AlphaImpl alpha = new AlphaImpl();
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gamma createGamma() {
		GammaImpl gamma = new GammaImpl();
		return gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface_Beta createInterface_Beta() {
		Interface_BetaImpl interface_Beta = new Interface_BetaImpl();
		return interface_Beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface_Alpha createInterface_Alpha() {
		Interface_AlphaImpl interface_Alpha = new Interface_AlphaImpl();
		return interface_Alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface_Gamma createInterface_Gamma() {
		Interface_GammaImpl interface_Gamma = new Interface_GammaImpl();
		return interface_Gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Requis_SM_Beta createRole_Requis_SM_Beta() {
		Role_Requis_SM_BetaImpl role_Requis_SM_Beta = new Role_Requis_SM_BetaImpl();
		return role_Requis_SM_Beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Fourni_Beta_SM createRole_Fourni_Beta_SM() {
		Role_Fourni_Beta_SMImpl role_Fourni_Beta_SM = new Role_Fourni_Beta_SMImpl();
		return role_Fourni_Beta_SM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Requis_DB_Beta createRole_Requis_DB_Beta() {
		Role_Requis_DB_BetaImpl role_Requis_DB_Beta = new Role_Requis_DB_BetaImpl();
		return role_Requis_DB_Beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Fourni_Beta_DB createRole_Fourni_Beta_DB() {
		Role_Fourni_Beta_DBImpl role_Fourni_Beta_DB = new Role_Fourni_Beta_DBImpl();
		return role_Fourni_Beta_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Fourni_Gamma_CM createRole_Fourni_Gamma_CM() {
		Role_Fourni_Gamma_CMImpl role_Fourni_Gamma_CM = new Role_Fourni_Gamma_CMImpl();
		return role_Fourni_Gamma_CM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Requis_CM_Gamma createRole_Requis_CM_Gamma() {
		Role_Requis_CM_GammaImpl role_Requis_CM_Gamma = new Role_Requis_CM_GammaImpl();
		return role_Requis_CM_Gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Requis_DB_Gamma createRole_Requis_DB_Gamma() {
		Role_Requis_DB_GammaImpl role_Requis_DB_Gamma = new Role_Requis_DB_GammaImpl();
		return role_Requis_DB_Gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Fourni_Gamma_DB createRole_Fourni_Gamma_DB() {
		Role_Fourni_Gamma_DBImpl role_Fourni_Gamma_DB = new Role_Fourni_Gamma_DBImpl();
		return role_Fourni_Gamma_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Requis_SM_Alpha createRole_Requis_SM_Alpha() {
		Role_Requis_SM_AlphaImpl role_Requis_SM_Alpha = new Role_Requis_SM_AlphaImpl();
		return role_Requis_SM_Alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Fourni_Alpha_SM createRole_Fourni_Alpha_SM() {
		Role_Fourni_Alpha_SMImpl role_Fourni_Alpha_SM = new Role_Fourni_Alpha_SMImpl();
		return role_Fourni_Alpha_SM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Requis_CM_Alpha createRole_Requis_CM_Alpha() {
		Role_Requis_CM_AlphaImpl role_Requis_CM_Alpha = new Role_Requis_CM_AlphaImpl();
		return role_Requis_CM_Alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Fourni_Alpha_CM createRole_Fourni_Alpha_CM() {
		Role_Fourni_Alpha_CMImpl role_Fourni_Alpha_CM = new Role_Fourni_Alpha_CMImpl();
		return role_Fourni_Alpha_CM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_SM_Alpha createAttachment_SM_Alpha() {
		Attachment_SM_AlphaImpl attachment_SM_Alpha = new Attachment_SM_AlphaImpl();
		return attachment_SM_Alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Alpha_SM createAttachment_Alpha_SM() {
		Attachment_Alpha_SMImpl attachment_Alpha_SM = new Attachment_Alpha_SMImpl();
		return attachment_Alpha_SM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_CM_Alpha createAttachment_CM_Alpha() {
		Attachment_CM_AlphaImpl attachment_CM_Alpha = new Attachment_CM_AlphaImpl();
		return attachment_CM_Alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Alpha_CM createAttachment_Alpha_CM() {
		Attachment_Alpha_CMImpl attachment_Alpha_CM = new Attachment_Alpha_CMImpl();
		return attachment_Alpha_CM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_SM_Beta createAttachment_SM_Beta() {
		Attachment_SM_BetaImpl attachment_SM_Beta = new Attachment_SM_BetaImpl();
		return attachment_SM_Beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Beta_SM createAttachment_Beta_SM() {
		Attachment_Beta_SMImpl attachment_Beta_SM = new Attachment_Beta_SMImpl();
		return attachment_Beta_SM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_DB_Beta createAttachment_DB_Beta() {
		Attachment_DB_BetaImpl attachment_DB_Beta = new Attachment_DB_BetaImpl();
		return attachment_DB_Beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Beta_DB createAttachment_Beta_DB() {
		Attachment_Beta_DBImpl attachment_Beta_DB = new Attachment_Beta_DBImpl();
		return attachment_Beta_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_CM_Gamma createAttachment_CM_Gamma() {
		Attachment_CM_GammaImpl attachment_CM_Gamma = new Attachment_CM_GammaImpl();
		return attachment_CM_Gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Gamma_CM createAttachment_Gamma_CM() {
		Attachment_Gamma_CMImpl attachment_Gamma_CM = new Attachment_Gamma_CMImpl();
		return attachment_Gamma_CM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_DB_Gamma createAttachment_DB_Gamma() {
		Attachment_DB_GammaImpl attachment_DB_Gamma = new Attachment_DB_GammaImpl();
		return attachment_DB_Gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Gamma_DB createAttachment_Gamma_DB() {
		Attachment_Gamma_DBImpl attachment_Gamma_DB = new Attachment_Gamma_DBImpl();
		return attachment_Gamma_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Serveur_Comp_Serveur_Comf createPort_Serveur_Comp_Serveur_Comf() {
		Port_Serveur_Comp_Serveur_ComfImpl port_Serveur_Comp_Serveur_Comf = new Port_Serveur_Comp_Serveur_ComfImpl();
		return port_Serveur_Comp_Serveur_Comf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface_Serveur_Conf createInterface_Serveur_Conf() {
		Interface_Serveur_ConfImpl interface_Serveur_Conf = new Interface_Serveur_ConfImpl();
		return interface_Serveur_Conf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Serveur_Conf_Serveur_Comp createPort_Serveur_Conf_Serveur_Comp() {
		Port_Serveur_Conf_Serveur_CompImpl port_Serveur_Conf_Serveur_Comp = new Port_Serveur_Conf_Serveur_CompImpl();
		return port_Serveur_Conf_Serveur_Comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding_Serveur_Comp_Serveur_Conf createBinding_Serveur_Comp_Serveur_Conf() {
		Binding_Serveur_Comp_Serveur_ConfImpl binding_Serveur_Comp_Serveur_Conf = new Binding_Serveur_Comp_Serveur_ConfImpl();
		return binding_Serveur_Comp_Serveur_Conf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_CM_Serveur_Comp createPort_CM_Serveur_Comp() {
		Port_CM_Serveur_CompImpl port_CM_Serveur_Comp = new Port_CM_Serveur_CompImpl();
		return port_CM_Serveur_Comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Serveur_Comp_CM createPort_Serveur_Comp_CM() {
		Port_Serveur_Comp_CMImpl port_Serveur_Comp_CM = new Port_Serveur_Comp_CMImpl();
		return port_Serveur_Comp_CM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding_Serveur_Comp_CM createBinding_Serveur_Comp_CM() {
		Binding_Serveur_Comp_CMImpl binding_Serveur_Comp_CM = new Binding_Serveur_Comp_CMImpl();
		return binding_Serveur_Comp_CM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client_serveurPackage getClient_serveurPackage() {
		return (Client_serveurPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Client_serveurPackage getPackage() {
		return Client_serveurPackage.eINSTANCE;
	}

} //Client_serveurFactoryImpl
