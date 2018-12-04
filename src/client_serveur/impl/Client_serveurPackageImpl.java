/**
 */
package client_serveur.impl;

import client_serveur.Alpha;
import client_serveur.Attachment_Alpha_CM;
import client_serveur.Attachment_Alpha_SM;
import client_serveur.Attachment_Beta_DB;
import client_serveur.Attachment_Beta_SM;
import client_serveur.Attachment_CM_Alpha;
import client_serveur.Attachment_CM_Gamma;
import client_serveur.Attachment_Client_RPC;
import client_serveur.Attachment_DB_Beta;
import client_serveur.Attachment_DB_Gamma;
import client_serveur.Attachment_Gamma_CM;
import client_serveur.Attachment_Gamma_DB;
import client_serveur.Attachment_RPC_Client;
import client_serveur.Attachment_RPC_Serveur;
import client_serveur.Attachment_SM_Alpha;
import client_serveur.Attachment_SM_Beta;
import client_serveur.Attachment_Serveur_RPC;
import client_serveur.Beta;
import client_serveur.Binding_Serveur_Comp_CM;
import client_serveur.Binding_Serveur_Comp_Serveur_Conf;
import client_serveur.Client;
import client_serveur.Client_serveur;
import client_serveur.Client_serveurFactory;
import client_serveur.Client_serveurPackage;
import client_serveur.Connection_Manager;
import client_serveur.DataBase;
import client_serveur.Gamma;
import client_serveur.Interface_Alpha;
import client_serveur.Interface_Beta;
import client_serveur.Interface_Client;
import client_serveur.Interface_Connection_Manager;
import client_serveur.Interface_DataBase;
import client_serveur.Interface_Gamma;
import client_serveur.Interface_RPC;
import client_serveur.Interface_Security_Manager;
import client_serveur.Interface_Serveur_Comp;
import client_serveur.Interface_Serveur_Conf;
import client_serveur.Port_CM_Serveur_Comp;
import client_serveur.Port_Fourni_CM_Alpha;
import client_serveur.Port_Fourni_CM_Gamma;
import client_serveur.Port_Fourni_Client;
import client_serveur.Port_Fourni_DB_Beta;
import client_serveur.Port_Fourni_DB_Gamma;
import client_serveur.Port_Fourni_SM_Alpha;
import client_serveur.Port_Fourni_SM_Beta;
import client_serveur.Port_Fourni_Serveur;
import client_serveur.Port_Requis_Alpha_CM;
import client_serveur.Port_Requis_Alpha_SM;
import client_serveur.Port_Requis_Beta_DB;
import client_serveur.Port_Requis_Beta_SM;
import client_serveur.Port_Requis_Client;
import client_serveur.Port_Requis_Gamma_CM;
import client_serveur.Port_Requis_Gamma_DB;
import client_serveur.Port_Requis_Serveur;
import client_serveur.Port_Serveur_Comp_CM;
import client_serveur.Port_Serveur_Comp_Serveur_Comf;
import client_serveur.Port_Serveur_Conf_Serveur_Comp;
import client_serveur.Role_Fourni_Alpha_CM;
import client_serveur.Role_Fourni_Alpha_SM;
import client_serveur.Role_Fourni_Beta_DB;
import client_serveur.Role_Fourni_Beta_SM;
import client_serveur.Role_Fourni_Gamma_CM;
import client_serveur.Role_Fourni_Gamma_DB;
import client_serveur.Role_Fourni_RPC_Client;
import client_serveur.Role_Fourni_RPC_Serveur;
import client_serveur.Role_Requis_CM_Alpha;
import client_serveur.Role_Requis_CM_Gamma;
import client_serveur.Role_Requis_DB_Beta;
import client_serveur.Role_Requis_DB_Gamma;
import client_serveur.Role_Requis_RPC_Client;
import client_serveur.Role_Requis_RPC_Serveur;
import client_serveur.Role_Requis_SM_Alpha;
import client_serveur.Role_Requis_SM_Beta;
import client_serveur.Security_Manager;
import client_serveur.Serveur_Comp;
import client_serveur.Serveur_Conf;

import cosa.CosaPackage;

import cosa.impl.CosaPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Client_serveurPackageImpl extends EPackageImpl implements Client_serveurPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass client_serveurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interface_ClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interface_RPCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interface_DataBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serveur_CompEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interface_Serveur_CompEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serveur_ConfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port_Requis_ServeurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port_Fourni_ServeurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass role_Requis_RPC_ClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass role_Fourni_RPC_ClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port_Requis_ClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port_Fourni_ClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_Client_RPCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_RPC_ClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass role_Requis_RPC_ServeurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass role_Fourni_RPC_ServeurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_RPC_ServeurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_Serveur_RPCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass security_ManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connection_ManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interface_Connection_ManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interface_Security_ManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port_Requis_Alpha_CMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port_Fourni_CM_AlphaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port_Fourni_CM_GammaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port_Requis_Gamma_CMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port_Fourni_DB_GammaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port_Requis_Gamma_DBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port_Fourni_DB_BetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port_Requis_Beta_DBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port_Fourni_SM_AlphaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port_Requis_Alpha_SMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port_Fourni_SM_BetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port_Requis_Beta_SMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass betaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gammaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interface_BetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interface_AlphaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interface_GammaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass role_Requis_SM_BetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass role_Fourni_Beta_SMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass role_Requis_DB_BetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass role_Fourni_Beta_DBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass role_Fourni_Gamma_CMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass role_Requis_CM_GammaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass role_Requis_DB_GammaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass role_Fourni_Gamma_DBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass role_Requis_SM_AlphaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass role_Fourni_Alpha_SMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass role_Requis_CM_AlphaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass role_Fourni_Alpha_CMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_SM_AlphaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_Alpha_SMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_CM_AlphaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_Alpha_CMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_SM_BetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_Beta_SMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_DB_BetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_Beta_DBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_CM_GammaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_Gamma_CMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_DB_GammaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_Gamma_DBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port_Serveur_Comp_Serveur_ComfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interface_Serveur_ConfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port_Serveur_Conf_Serveur_CompEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binding_Serveur_Comp_Serveur_ConfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port_CM_Serveur_CompEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port_Serveur_Comp_CMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binding_Serveur_Comp_CMEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see client_serveur.Client_serveurPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Client_serveurPackageImpl() {
		super(eNS_URI, Client_serveurFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Client_serveurPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Client_serveurPackage init() {
		if (isInited) return (Client_serveurPackage)EPackage.Registry.INSTANCE.getEPackage(Client_serveurPackage.eNS_URI);

		// Obtain or create and register package
		Client_serveurPackageImpl theClient_serveurPackage = (Client_serveurPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Client_serveurPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Client_serveurPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CosaPackageImpl theCosaPackage = (CosaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CosaPackage.eNS_URI) instanceof CosaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CosaPackage.eNS_URI) : CosaPackage.eINSTANCE);

		// Create package meta-data objects
		theClient_serveurPackage.createPackageContents();
		theCosaPackage.createPackageContents();

		// Initialize created meta-data
		theClient_serveurPackage.initializePackageContents();
		theCosaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theClient_serveurPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Client_serveurPackage.eNS_URI, theClient_serveurPackage);
		return theClient_serveurPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClient() {
		return clientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Interface_client() {
		return (EReference)clientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRPC() {
		return rpcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPC_Interface_rpc() {
		return (EReference)rpcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClient_serveur() {
		return client_serveurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_serveur_Client() {
		return (EReference)client_serveurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_serveur_Rpc() {
		return (EReference)client_serveurEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_serveur_Serveur() {
		return (EReference)client_serveurEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface_Client() {
		return interface_ClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Client_Port_fourni_client() {
		return (EReference)interface_ClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Client_Port_requis_client() {
		return (EReference)interface_ClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface_RPC() {
		return interface_RPCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_RPC_Role_fourni_rpc_client() {
		return (EReference)interface_RPCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_RPC_Role_requis_rpc_client() {
		return (EReference)interface_RPCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_RPC_Role_fourni_rpc_serveur() {
		return (EReference)interface_RPCEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_RPC_Role_requis_rpc_serveur() {
		return (EReference)interface_RPCEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataBase() {
		return dataBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBase_Interface_database() {
		return (EReference)dataBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface_DataBase() {
		return interface_DataBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_DataBase_Port_fourni_db_gamma() {
		return (EReference)interface_DataBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_DataBase_Port_requis_gamma_db() {
		return (EReference)interface_DataBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_DataBase_Port_fourni_db_beta() {
		return (EReference)interface_DataBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_DataBase_Port_requis_beta_db() {
		return (EReference)interface_DataBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServeur_Comp() {
		return serveur_CompEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeur_Comp_Interface_serveur_comp() {
		return (EReference)serveur_CompEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeur_Comp_Serveur_conf() {
		return (EReference)serveur_CompEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface_Serveur_Comp() {
		return interface_Serveur_CompEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Serveur_Comp_Port_requis_serveur() {
		return (EReference)interface_Serveur_CompEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Serveur_Comp_Port_fourni_serveur() {
		return (EReference)interface_Serveur_CompEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Serveur_Comp_Port_serveur_comp_serveur_comf() {
		return (EReference)interface_Serveur_CompEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Serveur_Comp_Port_serveur_comp_cm() {
		return (EReference)interface_Serveur_CompEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServeur_Conf() {
		return serveur_ConfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeur_Conf_Database() {
		return (EReference)serveur_ConfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeur_Conf_Security_manager() {
		return (EReference)serveur_ConfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeur_Conf_Connection_manager() {
		return (EReference)serveur_ConfEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeur_Conf_Gamma() {
		return (EReference)serveur_ConfEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeur_Conf_Alpha() {
		return (EReference)serveur_ConfEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeur_Conf_Beta() {
		return (EReference)serveur_ConfEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeur_Conf_Interface_serveur_conf() {
		return (EReference)serveur_ConfEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort_Requis_Serveur() {
		return port_Requis_ServeurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Requis_Serveur_Attachment_rpc_serveur() {
		return (EReference)port_Requis_ServeurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort_Fourni_Serveur() {
		return port_Fourni_ServeurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Fourni_Serveur_Attachment_serveur_rpc() {
		return (EReference)port_Fourni_ServeurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole_Requis_RPC_Client() {
		return role_Requis_RPC_ClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Requis_RPC_Client_Attachment_client_rpc() {
		return (EReference)role_Requis_RPC_ClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole_Fourni_RPC_Client() {
		return role_Fourni_RPC_ClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Fourni_RPC_Client_Attachment_rpc_client() {
		return (EReference)role_Fourni_RPC_ClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort_Requis_Client() {
		return port_Requis_ClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Requis_Client_Attachment_rpc_client() {
		return (EReference)port_Requis_ClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort_Fourni_Client() {
		return port_Fourni_ClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Fourni_Client_Attachment_client_rpc() {
		return (EReference)port_Fourni_ClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_Client_RPC() {
		return attachment_Client_RPCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Client_RPC_Port_fourni_client() {
		return (EReference)attachment_Client_RPCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Client_RPC_Role_requis_rpc_client() {
		return (EReference)attachment_Client_RPCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_RPC_Client() {
		return attachment_RPC_ClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_RPC_Client_Port_requis_client() {
		return (EReference)attachment_RPC_ClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_RPC_Client_Role_fourni_rpc_client() {
		return (EReference)attachment_RPC_ClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole_Requis_RPC_Serveur() {
		return role_Requis_RPC_ServeurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Requis_RPC_Serveur_Attachment_serveur_rpc() {
		return (EReference)role_Requis_RPC_ServeurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole_Fourni_RPC_Serveur() {
		return role_Fourni_RPC_ServeurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Fourni_RPC_Serveur_Attachment_rpc_serveur() {
		return (EReference)role_Fourni_RPC_ServeurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_RPC_Serveur() {
		return attachment_RPC_ServeurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_RPC_Serveur_Role_fourni_rpc_serveur() {
		return (EReference)attachment_RPC_ServeurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_RPC_Serveur_Port_requis_serveur() {
		return (EReference)attachment_RPC_ServeurEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_Serveur_RPC() {
		return attachment_Serveur_RPCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Serveur_RPC_Port_fourni_serveur() {
		return (EReference)attachment_Serveur_RPCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Serveur_RPC_Role_requis_rpc_serveur() {
		return (EReference)attachment_Serveur_RPCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurity_Manager() {
		return security_ManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurity_Manager_Interface_security_manager() {
		return (EReference)security_ManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection_Manager() {
		return connection_ManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Manager_Interface_connection_manager() {
		return (EReference)connection_ManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface_Connection_Manager() {
		return interface_Connection_ManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Connection_Manager_Port_fourni_cm_gamma() {
		return (EReference)interface_Connection_ManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Connection_Manager_Port_requis_gamma_cm() {
		return (EReference)interface_Connection_ManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Connection_Manager_Port_fourni_cm_alpha() {
		return (EReference)interface_Connection_ManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Connection_Manager_Port_requis_alpha_cm() {
		return (EReference)interface_Connection_ManagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Connection_Manager_Port_cm_serveur_comp() {
		return (EReference)interface_Connection_ManagerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface_Security_Manager() {
		return interface_Security_ManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Security_Manager_Port_fourni_sm_beta() {
		return (EReference)interface_Security_ManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Security_Manager_Port_requis_beta_sm() {
		return (EReference)interface_Security_ManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Security_Manager_Port_fourni_sm_alpha() {
		return (EReference)interface_Security_ManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Security_Manager_Port_requis_alpha_sm() {
		return (EReference)interface_Security_ManagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort_Requis_Alpha_CM() {
		return port_Requis_Alpha_CMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Requis_Alpha_CM_Attachment_alpha_cm() {
		return (EReference)port_Requis_Alpha_CMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort_Fourni_CM_Alpha() {
		return port_Fourni_CM_AlphaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Fourni_CM_Alpha_Attachment_cm_alpha() {
		return (EReference)port_Fourni_CM_AlphaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort_Fourni_CM_Gamma() {
		return port_Fourni_CM_GammaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Fourni_CM_Gamma_Attachment_cm_gamma() {
		return (EReference)port_Fourni_CM_GammaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort_Requis_Gamma_CM() {
		return port_Requis_Gamma_CMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Requis_Gamma_CM_Attachment_gamma_cm() {
		return (EReference)port_Requis_Gamma_CMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort_Fourni_DB_Gamma() {
		return port_Fourni_DB_GammaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Fourni_DB_Gamma_Attachment_db_gamma() {
		return (EReference)port_Fourni_DB_GammaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort_Requis_Gamma_DB() {
		return port_Requis_Gamma_DBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Requis_Gamma_DB_Attachment_gamma_db() {
		return (EReference)port_Requis_Gamma_DBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort_Fourni_DB_Beta() {
		return port_Fourni_DB_BetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Fourni_DB_Beta_Attachment_db_beta() {
		return (EReference)port_Fourni_DB_BetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort_Requis_Beta_DB() {
		return port_Requis_Beta_DBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Requis_Beta_DB_Attachment_beta_db() {
		return (EReference)port_Requis_Beta_DBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort_Fourni_SM_Alpha() {
		return port_Fourni_SM_AlphaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Fourni_SM_Alpha_Attachment_sm_alpha() {
		return (EReference)port_Fourni_SM_AlphaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort_Requis_Alpha_SM() {
		return port_Requis_Alpha_SMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Requis_Alpha_SM_Attachment_alpha_sm() {
		return (EReference)port_Requis_Alpha_SMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort_Fourni_SM_Beta() {
		return port_Fourni_SM_BetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Fourni_SM_Beta_Attachment_sm_beta() {
		return (EReference)port_Fourni_SM_BetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort_Requis_Beta_SM() {
		return port_Requis_Beta_SMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Requis_Beta_SM_Attachment_beta_sm() {
		return (EReference)port_Requis_Beta_SMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBeta() {
		return betaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeta_Interface_beta() {
		return (EReference)betaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlpha() {
		return alphaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlpha_Interface_alpha() {
		return (EReference)alphaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGamma() {
		return gammaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGamma_Interface_gamma() {
		return (EReference)gammaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface_Beta() {
		return interface_BetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Beta_Role_fourni_beta_sm() {
		return (EReference)interface_BetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Beta_Role_requis_sm_beta() {
		return (EReference)interface_BetaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Beta_Role_requis_db_beta() {
		return (EReference)interface_BetaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Beta_Role_fourni_beta_db() {
		return (EReference)interface_BetaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface_Alpha() {
		return interface_AlphaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Alpha_Role_fourni_alpha_sm() {
		return (EReference)interface_AlphaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Alpha_Role_requis_sm_alpha() {
		return (EReference)interface_AlphaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Alpha_Role_requis_cm_alpha() {
		return (EReference)interface_AlphaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Alpha_Role_fourni_alpha_cm() {
		return (EReference)interface_AlphaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface_Gamma() {
		return interface_GammaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Gamma_Role_requis_cm_gamma() {
		return (EReference)interface_GammaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Gamma_Role_fourni_gamma_cm() {
		return (EReference)interface_GammaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Gamma_Role_requis_db_gamma() {
		return (EReference)interface_GammaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Gamma_Role_fourni_gamma_db() {
		return (EReference)interface_GammaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole_Requis_SM_Beta() {
		return role_Requis_SM_BetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Requis_SM_Beta_Attachment_sm_beta() {
		return (EReference)role_Requis_SM_BetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole_Fourni_Beta_SM() {
		return role_Fourni_Beta_SMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Fourni_Beta_SM_Attachment_beta_sm() {
		return (EReference)role_Fourni_Beta_SMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole_Requis_DB_Beta() {
		return role_Requis_DB_BetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Requis_DB_Beta_Attachment_db_beta() {
		return (EReference)role_Requis_DB_BetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole_Fourni_Beta_DB() {
		return role_Fourni_Beta_DBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Fourni_Beta_DB_Attachment_beta_db() {
		return (EReference)role_Fourni_Beta_DBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole_Fourni_Gamma_CM() {
		return role_Fourni_Gamma_CMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Fourni_Gamma_CM_Attachment_gamma_cm() {
		return (EReference)role_Fourni_Gamma_CMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole_Requis_CM_Gamma() {
		return role_Requis_CM_GammaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Requis_CM_Gamma_Attachment_cm_gamma() {
		return (EReference)role_Requis_CM_GammaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole_Requis_DB_Gamma() {
		return role_Requis_DB_GammaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Requis_DB_Gamma_Attachment_db_gamma() {
		return (EReference)role_Requis_DB_GammaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole_Fourni_Gamma_DB() {
		return role_Fourni_Gamma_DBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Fourni_Gamma_DB_Attachment_gamma_db() {
		return (EReference)role_Fourni_Gamma_DBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole_Requis_SM_Alpha() {
		return role_Requis_SM_AlphaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Requis_SM_Alpha_Attachment_sm_alpha() {
		return (EReference)role_Requis_SM_AlphaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole_Fourni_Alpha_SM() {
		return role_Fourni_Alpha_SMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Fourni_Alpha_SM_Attachment_alpha_sm() {
		return (EReference)role_Fourni_Alpha_SMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole_Requis_CM_Alpha() {
		return role_Requis_CM_AlphaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Requis_CM_Alpha_Attachment_cm_alpha() {
		return (EReference)role_Requis_CM_AlphaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole_Fourni_Alpha_CM() {
		return role_Fourni_Alpha_CMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Fourni_Alpha_CM_Attachment_alpha_cm() {
		return (EReference)role_Fourni_Alpha_CMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_SM_Alpha() {
		return attachment_SM_AlphaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_SM_Alpha_Port_fourni_sm_alpha() {
		return (EReference)attachment_SM_AlphaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_SM_Alpha_Role_requis_sm_alpha() {
		return (EReference)attachment_SM_AlphaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_Alpha_SM() {
		return attachment_Alpha_SMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Alpha_SM_Port_requis_alpha_sm() {
		return (EReference)attachment_Alpha_SMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Alpha_SM_Role_fourni_alpha_sm() {
		return (EReference)attachment_Alpha_SMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_CM_Alpha() {
		return attachment_CM_AlphaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_CM_Alpha_Role_requis_cm_alpha() {
		return (EReference)attachment_CM_AlphaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_Alpha_CM() {
		return attachment_Alpha_CMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Alpha_CM_Port_requis_alpha_cm() {
		return (EReference)attachment_Alpha_CMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Alpha_CM_Role_fourni_alpha_cm() {
		return (EReference)attachment_Alpha_CMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_SM_Beta() {
		return attachment_SM_BetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_SM_Beta_Port_fourni_sm_beta() {
		return (EReference)attachment_SM_BetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_SM_Beta_Role_requis_sm_beta() {
		return (EReference)attachment_SM_BetaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_Beta_SM() {
		return attachment_Beta_SMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Beta_SM_Port_requis_beta_sm() {
		return (EReference)attachment_Beta_SMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Beta_SM_Role_fourni_beta_sm() {
		return (EReference)attachment_Beta_SMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_DB_Beta() {
		return attachment_DB_BetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_DB_Beta_Port_fourni_db_beta() {
		return (EReference)attachment_DB_BetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_DB_Beta_Role_requis_db_beta() {
		return (EReference)attachment_DB_BetaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_Beta_DB() {
		return attachment_Beta_DBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Beta_DB_Port_requis_beta_db() {
		return (EReference)attachment_Beta_DBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Beta_DB_Role_fourni_beta_db() {
		return (EReference)attachment_Beta_DBEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_CM_Gamma() {
		return attachment_CM_GammaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_CM_Gamma_Role_requis_cm_gamma() {
		return (EReference)attachment_CM_GammaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_CM_Gamma_Port_fourni_cm_gamma() {
		return (EReference)attachment_CM_GammaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_Gamma_CM() {
		return attachment_Gamma_CMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Gamma_CM_Role_fourni_gamma_cm() {
		return (EReference)attachment_Gamma_CMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Gamma_CM_Port_requis_gamma_cm() {
		return (EReference)attachment_Gamma_CMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_DB_Gamma() {
		return attachment_DB_GammaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_DB_Gamma_Role_requis_db_gamma() {
		return (EReference)attachment_DB_GammaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_DB_Gamma_Port_fourni_db_gamma() {
		return (EReference)attachment_DB_GammaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_Gamma_DB() {
		return attachment_Gamma_DBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Gamma_DB_Role_fourni_gamma_db() {
		return (EReference)attachment_Gamma_DBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Gamma_DB_Port_requis_gamma_db() {
		return (EReference)attachment_Gamma_DBEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort_Serveur_Comp_Serveur_Comf() {
		return port_Serveur_Comp_Serveur_ComfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Serveur_Comp_Serveur_Comf_Binding_serveur_comp_serveur_conf() {
		return (EReference)port_Serveur_Comp_Serveur_ComfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface_Serveur_Conf() {
		return interface_Serveur_ConfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Serveur_Conf_Port_serveur_conf_serveur_comp() {
		return (EReference)interface_Serveur_ConfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort_Serveur_Conf_Serveur_Comp() {
		return port_Serveur_Conf_Serveur_CompEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Serveur_Conf_Serveur_Comp_Binding_serveur_comp_serveur_conf() {
		return (EReference)port_Serveur_Conf_Serveur_CompEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinding_Serveur_Comp_Serveur_Conf() {
		return binding_Serveur_Comp_Serveur_ConfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinding_Serveur_Comp_Serveur_Conf_Port_serveur_conf_serveur_comp() {
		return (EReference)binding_Serveur_Comp_Serveur_ConfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinding_Serveur_Comp_Serveur_Conf_Port_serveur_comp_serveur_comf() {
		return (EReference)binding_Serveur_Comp_Serveur_ConfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort_CM_Serveur_Comp() {
		return port_CM_Serveur_CompEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_CM_Serveur_Comp_Binding_serveur_comp_cm() {
		return (EReference)port_CM_Serveur_CompEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort_Serveur_Comp_CM() {
		return port_Serveur_Comp_CMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Serveur_Comp_CM_Binding_serveur_comp_cm() {
		return (EReference)port_Serveur_Comp_CMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinding_Serveur_Comp_CM() {
		return binding_Serveur_Comp_CMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinding_Serveur_Comp_CM_Port_cm_serveur_comp() {
		return (EReference)binding_Serveur_Comp_CMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinding_Serveur_Comp_CM_Port_serveur_comp_cm() {
		return (EReference)binding_Serveur_Comp_CMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client_serveurFactory getClient_serveurFactory() {
		return (Client_serveurFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		clientEClass = createEClass(CLIENT);
		createEReference(clientEClass, CLIENT__INTERFACE_CLIENT);

		rpcEClass = createEClass(RPC);
		createEReference(rpcEClass, RPC__INTERFACE_RPC);

		client_serveurEClass = createEClass(CLIENT_SERVEUR);
		createEReference(client_serveurEClass, CLIENT_SERVEUR__CLIENT);
		createEReference(client_serveurEClass, CLIENT_SERVEUR__RPC);
		createEReference(client_serveurEClass, CLIENT_SERVEUR__SERVEUR);

		interface_ClientEClass = createEClass(INTERFACE_CLIENT);
		createEReference(interface_ClientEClass, INTERFACE_CLIENT__PORT_FOURNI_CLIENT);
		createEReference(interface_ClientEClass, INTERFACE_CLIENT__PORT_REQUIS_CLIENT);

		interface_RPCEClass = createEClass(INTERFACE_RPC);
		createEReference(interface_RPCEClass, INTERFACE_RPC__ROLE_FOURNI_RPC_CLIENT);
		createEReference(interface_RPCEClass, INTERFACE_RPC__ROLE_REQUIS_RPC_CLIENT);
		createEReference(interface_RPCEClass, INTERFACE_RPC__ROLE_FOURNI_RPC_SERVEUR);
		createEReference(interface_RPCEClass, INTERFACE_RPC__ROLE_REQUIS_RPC_SERVEUR);

		dataBaseEClass = createEClass(DATA_BASE);
		createEReference(dataBaseEClass, DATA_BASE__INTERFACE_DATABASE);

		interface_DataBaseEClass = createEClass(INTERFACE_DATA_BASE);
		createEReference(interface_DataBaseEClass, INTERFACE_DATA_BASE__PORT_FOURNI_DB_GAMMA);
		createEReference(interface_DataBaseEClass, INTERFACE_DATA_BASE__PORT_REQUIS_GAMMA_DB);
		createEReference(interface_DataBaseEClass, INTERFACE_DATA_BASE__PORT_FOURNI_DB_BETA);
		createEReference(interface_DataBaseEClass, INTERFACE_DATA_BASE__PORT_REQUIS_BETA_DB);

		serveur_CompEClass = createEClass(SERVEUR_COMP);
		createEReference(serveur_CompEClass, SERVEUR_COMP__INTERFACE_SERVEUR_COMP);
		createEReference(serveur_CompEClass, SERVEUR_COMP__SERVEUR_CONF);

		interface_Serveur_CompEClass = createEClass(INTERFACE_SERVEUR_COMP);
		createEReference(interface_Serveur_CompEClass, INTERFACE_SERVEUR_COMP__PORT_REQUIS_SERVEUR);
		createEReference(interface_Serveur_CompEClass, INTERFACE_SERVEUR_COMP__PORT_FOURNI_SERVEUR);
		createEReference(interface_Serveur_CompEClass, INTERFACE_SERVEUR_COMP__PORT_SERVEUR_COMP_SERVEUR_COMF);
		createEReference(interface_Serveur_CompEClass, INTERFACE_SERVEUR_COMP__PORT_SERVEUR_COMP_CM);

		serveur_ConfEClass = createEClass(SERVEUR_CONF);
		createEReference(serveur_ConfEClass, SERVEUR_CONF__DATABASE);
		createEReference(serveur_ConfEClass, SERVEUR_CONF__SECURITY_MANAGER);
		createEReference(serveur_ConfEClass, SERVEUR_CONF__CONNECTION_MANAGER);
		createEReference(serveur_ConfEClass, SERVEUR_CONF__GAMMA);
		createEReference(serveur_ConfEClass, SERVEUR_CONF__ALPHA);
		createEReference(serveur_ConfEClass, SERVEUR_CONF__BETA);
		createEReference(serveur_ConfEClass, SERVEUR_CONF__INTERFACE_SERVEUR_CONF);

		port_Requis_ServeurEClass = createEClass(PORT_REQUIS_SERVEUR);
		createEReference(port_Requis_ServeurEClass, PORT_REQUIS_SERVEUR__ATTACHMENT_RPC_SERVEUR);

		port_Fourni_ServeurEClass = createEClass(PORT_FOURNI_SERVEUR);
		createEReference(port_Fourni_ServeurEClass, PORT_FOURNI_SERVEUR__ATTACHMENT_SERVEUR_RPC);

		role_Requis_RPC_ClientEClass = createEClass(ROLE_REQUIS_RPC_CLIENT);
		createEReference(role_Requis_RPC_ClientEClass, ROLE_REQUIS_RPC_CLIENT__ATTACHMENT_CLIENT_RPC);

		role_Fourni_RPC_ClientEClass = createEClass(ROLE_FOURNI_RPC_CLIENT);
		createEReference(role_Fourni_RPC_ClientEClass, ROLE_FOURNI_RPC_CLIENT__ATTACHMENT_RPC_CLIENT);

		port_Requis_ClientEClass = createEClass(PORT_REQUIS_CLIENT);
		createEReference(port_Requis_ClientEClass, PORT_REQUIS_CLIENT__ATTACHMENT_RPC_CLIENT);

		port_Fourni_ClientEClass = createEClass(PORT_FOURNI_CLIENT);
		createEReference(port_Fourni_ClientEClass, PORT_FOURNI_CLIENT__ATTACHMENT_CLIENT_RPC);

		attachment_Client_RPCEClass = createEClass(ATTACHMENT_CLIENT_RPC);
		createEReference(attachment_Client_RPCEClass, ATTACHMENT_CLIENT_RPC__PORT_FOURNI_CLIENT);
		createEReference(attachment_Client_RPCEClass, ATTACHMENT_CLIENT_RPC__ROLE_REQUIS_RPC_CLIENT);

		attachment_RPC_ClientEClass = createEClass(ATTACHMENT_RPC_CLIENT);
		createEReference(attachment_RPC_ClientEClass, ATTACHMENT_RPC_CLIENT__PORT_REQUIS_CLIENT);
		createEReference(attachment_RPC_ClientEClass, ATTACHMENT_RPC_CLIENT__ROLE_FOURNI_RPC_CLIENT);

		role_Requis_RPC_ServeurEClass = createEClass(ROLE_REQUIS_RPC_SERVEUR);
		createEReference(role_Requis_RPC_ServeurEClass, ROLE_REQUIS_RPC_SERVEUR__ATTACHMENT_SERVEUR_RPC);

		role_Fourni_RPC_ServeurEClass = createEClass(ROLE_FOURNI_RPC_SERVEUR);
		createEReference(role_Fourni_RPC_ServeurEClass, ROLE_FOURNI_RPC_SERVEUR__ATTACHMENT_RPC_SERVEUR);

		attachment_RPC_ServeurEClass = createEClass(ATTACHMENT_RPC_SERVEUR);
		createEReference(attachment_RPC_ServeurEClass, ATTACHMENT_RPC_SERVEUR__ROLE_FOURNI_RPC_SERVEUR);
		createEReference(attachment_RPC_ServeurEClass, ATTACHMENT_RPC_SERVEUR__PORT_REQUIS_SERVEUR);

		attachment_Serveur_RPCEClass = createEClass(ATTACHMENT_SERVEUR_RPC);
		createEReference(attachment_Serveur_RPCEClass, ATTACHMENT_SERVEUR_RPC__PORT_FOURNI_SERVEUR);
		createEReference(attachment_Serveur_RPCEClass, ATTACHMENT_SERVEUR_RPC__ROLE_REQUIS_RPC_SERVEUR);

		security_ManagerEClass = createEClass(SECURITY_MANAGER);
		createEReference(security_ManagerEClass, SECURITY_MANAGER__INTERFACE_SECURITY_MANAGER);

		connection_ManagerEClass = createEClass(CONNECTION_MANAGER);
		createEReference(connection_ManagerEClass, CONNECTION_MANAGER__INTERFACE_CONNECTION_MANAGER);

		interface_Connection_ManagerEClass = createEClass(INTERFACE_CONNECTION_MANAGER);
		createEReference(interface_Connection_ManagerEClass, INTERFACE_CONNECTION_MANAGER__PORT_FOURNI_CM_GAMMA);
		createEReference(interface_Connection_ManagerEClass, INTERFACE_CONNECTION_MANAGER__PORT_REQUIS_GAMMA_CM);
		createEReference(interface_Connection_ManagerEClass, INTERFACE_CONNECTION_MANAGER__PORT_FOURNI_CM_ALPHA);
		createEReference(interface_Connection_ManagerEClass, INTERFACE_CONNECTION_MANAGER__PORT_REQUIS_ALPHA_CM);
		createEReference(interface_Connection_ManagerEClass, INTERFACE_CONNECTION_MANAGER__PORT_CM_SERVEUR_COMP);

		interface_Security_ManagerEClass = createEClass(INTERFACE_SECURITY_MANAGER);
		createEReference(interface_Security_ManagerEClass, INTERFACE_SECURITY_MANAGER__PORT_FOURNI_SM_BETA);
		createEReference(interface_Security_ManagerEClass, INTERFACE_SECURITY_MANAGER__PORT_REQUIS_BETA_SM);
		createEReference(interface_Security_ManagerEClass, INTERFACE_SECURITY_MANAGER__PORT_FOURNI_SM_ALPHA);
		createEReference(interface_Security_ManagerEClass, INTERFACE_SECURITY_MANAGER__PORT_REQUIS_ALPHA_SM);

		port_Requis_Alpha_CMEClass = createEClass(PORT_REQUIS_ALPHA_CM);
		createEReference(port_Requis_Alpha_CMEClass, PORT_REQUIS_ALPHA_CM__ATTACHMENT_ALPHA_CM);

		port_Fourni_CM_AlphaEClass = createEClass(PORT_FOURNI_CM_ALPHA);
		createEReference(port_Fourni_CM_AlphaEClass, PORT_FOURNI_CM_ALPHA__ATTACHMENT_CM_ALPHA);

		port_Fourni_CM_GammaEClass = createEClass(PORT_FOURNI_CM_GAMMA);
		createEReference(port_Fourni_CM_GammaEClass, PORT_FOURNI_CM_GAMMA__ATTACHMENT_CM_GAMMA);

		port_Requis_Gamma_CMEClass = createEClass(PORT_REQUIS_GAMMA_CM);
		createEReference(port_Requis_Gamma_CMEClass, PORT_REQUIS_GAMMA_CM__ATTACHMENT_GAMMA_CM);

		port_Fourni_DB_GammaEClass = createEClass(PORT_FOURNI_DB_GAMMA);
		createEReference(port_Fourni_DB_GammaEClass, PORT_FOURNI_DB_GAMMA__ATTACHMENT_DB_GAMMA);

		port_Requis_Gamma_DBEClass = createEClass(PORT_REQUIS_GAMMA_DB);
		createEReference(port_Requis_Gamma_DBEClass, PORT_REQUIS_GAMMA_DB__ATTACHMENT_GAMMA_DB);

		port_Fourni_DB_BetaEClass = createEClass(PORT_FOURNI_DB_BETA);
		createEReference(port_Fourni_DB_BetaEClass, PORT_FOURNI_DB_BETA__ATTACHMENT_DB_BETA);

		port_Requis_Beta_DBEClass = createEClass(PORT_REQUIS_BETA_DB);
		createEReference(port_Requis_Beta_DBEClass, PORT_REQUIS_BETA_DB__ATTACHMENT_BETA_DB);

		port_Fourni_SM_AlphaEClass = createEClass(PORT_FOURNI_SM_ALPHA);
		createEReference(port_Fourni_SM_AlphaEClass, PORT_FOURNI_SM_ALPHA__ATTACHMENT_SM_ALPHA);

		port_Requis_Alpha_SMEClass = createEClass(PORT_REQUIS_ALPHA_SM);
		createEReference(port_Requis_Alpha_SMEClass, PORT_REQUIS_ALPHA_SM__ATTACHMENT_ALPHA_SM);

		port_Fourni_SM_BetaEClass = createEClass(PORT_FOURNI_SM_BETA);
		createEReference(port_Fourni_SM_BetaEClass, PORT_FOURNI_SM_BETA__ATTACHMENT_SM_BETA);

		port_Requis_Beta_SMEClass = createEClass(PORT_REQUIS_BETA_SM);
		createEReference(port_Requis_Beta_SMEClass, PORT_REQUIS_BETA_SM__ATTACHMENT_BETA_SM);

		betaEClass = createEClass(BETA);
		createEReference(betaEClass, BETA__INTERFACE_BETA);

		alphaEClass = createEClass(ALPHA);
		createEReference(alphaEClass, ALPHA__INTERFACE_ALPHA);

		gammaEClass = createEClass(GAMMA);
		createEReference(gammaEClass, GAMMA__INTERFACE_GAMMA);

		interface_BetaEClass = createEClass(INTERFACE_BETA);
		createEReference(interface_BetaEClass, INTERFACE_BETA__ROLE_FOURNI_BETA_SM);
		createEReference(interface_BetaEClass, INTERFACE_BETA__ROLE_REQUIS_SM_BETA);
		createEReference(interface_BetaEClass, INTERFACE_BETA__ROLE_REQUIS_DB_BETA);
		createEReference(interface_BetaEClass, INTERFACE_BETA__ROLE_FOURNI_BETA_DB);

		interface_AlphaEClass = createEClass(INTERFACE_ALPHA);
		createEReference(interface_AlphaEClass, INTERFACE_ALPHA__ROLE_FOURNI_ALPHA_SM);
		createEReference(interface_AlphaEClass, INTERFACE_ALPHA__ROLE_REQUIS_SM_ALPHA);
		createEReference(interface_AlphaEClass, INTERFACE_ALPHA__ROLE_REQUIS_CM_ALPHA);
		createEReference(interface_AlphaEClass, INTERFACE_ALPHA__ROLE_FOURNI_ALPHA_CM);

		interface_GammaEClass = createEClass(INTERFACE_GAMMA);
		createEReference(interface_GammaEClass, INTERFACE_GAMMA__ROLE_REQUIS_CM_GAMMA);
		createEReference(interface_GammaEClass, INTERFACE_GAMMA__ROLE_FOURNI_GAMMA_CM);
		createEReference(interface_GammaEClass, INTERFACE_GAMMA__ROLE_REQUIS_DB_GAMMA);
		createEReference(interface_GammaEClass, INTERFACE_GAMMA__ROLE_FOURNI_GAMMA_DB);

		role_Requis_SM_BetaEClass = createEClass(ROLE_REQUIS_SM_BETA);
		createEReference(role_Requis_SM_BetaEClass, ROLE_REQUIS_SM_BETA__ATTACHMENT_SM_BETA);

		role_Fourni_Beta_SMEClass = createEClass(ROLE_FOURNI_BETA_SM);
		createEReference(role_Fourni_Beta_SMEClass, ROLE_FOURNI_BETA_SM__ATTACHMENT_BETA_SM);

		role_Requis_DB_BetaEClass = createEClass(ROLE_REQUIS_DB_BETA);
		createEReference(role_Requis_DB_BetaEClass, ROLE_REQUIS_DB_BETA__ATTACHMENT_DB_BETA);

		role_Fourni_Beta_DBEClass = createEClass(ROLE_FOURNI_BETA_DB);
		createEReference(role_Fourni_Beta_DBEClass, ROLE_FOURNI_BETA_DB__ATTACHMENT_BETA_DB);

		role_Fourni_Gamma_CMEClass = createEClass(ROLE_FOURNI_GAMMA_CM);
		createEReference(role_Fourni_Gamma_CMEClass, ROLE_FOURNI_GAMMA_CM__ATTACHMENT_GAMMA_CM);

		role_Requis_CM_GammaEClass = createEClass(ROLE_REQUIS_CM_GAMMA);
		createEReference(role_Requis_CM_GammaEClass, ROLE_REQUIS_CM_GAMMA__ATTACHMENT_CM_GAMMA);

		role_Requis_DB_GammaEClass = createEClass(ROLE_REQUIS_DB_GAMMA);
		createEReference(role_Requis_DB_GammaEClass, ROLE_REQUIS_DB_GAMMA__ATTACHMENT_DB_GAMMA);

		role_Fourni_Gamma_DBEClass = createEClass(ROLE_FOURNI_GAMMA_DB);
		createEReference(role_Fourni_Gamma_DBEClass, ROLE_FOURNI_GAMMA_DB__ATTACHMENT_GAMMA_DB);

		role_Requis_SM_AlphaEClass = createEClass(ROLE_REQUIS_SM_ALPHA);
		createEReference(role_Requis_SM_AlphaEClass, ROLE_REQUIS_SM_ALPHA__ATTACHMENT_SM_ALPHA);

		role_Fourni_Alpha_SMEClass = createEClass(ROLE_FOURNI_ALPHA_SM);
		createEReference(role_Fourni_Alpha_SMEClass, ROLE_FOURNI_ALPHA_SM__ATTACHMENT_ALPHA_SM);

		role_Requis_CM_AlphaEClass = createEClass(ROLE_REQUIS_CM_ALPHA);
		createEReference(role_Requis_CM_AlphaEClass, ROLE_REQUIS_CM_ALPHA__ATTACHMENT_CM_ALPHA);

		role_Fourni_Alpha_CMEClass = createEClass(ROLE_FOURNI_ALPHA_CM);
		createEReference(role_Fourni_Alpha_CMEClass, ROLE_FOURNI_ALPHA_CM__ATTACHMENT_ALPHA_CM);

		attachment_SM_AlphaEClass = createEClass(ATTACHMENT_SM_ALPHA);
		createEReference(attachment_SM_AlphaEClass, ATTACHMENT_SM_ALPHA__PORT_FOURNI_SM_ALPHA);
		createEReference(attachment_SM_AlphaEClass, ATTACHMENT_SM_ALPHA__ROLE_REQUIS_SM_ALPHA);

		attachment_Alpha_SMEClass = createEClass(ATTACHMENT_ALPHA_SM);
		createEReference(attachment_Alpha_SMEClass, ATTACHMENT_ALPHA_SM__PORT_REQUIS_ALPHA_SM);
		createEReference(attachment_Alpha_SMEClass, ATTACHMENT_ALPHA_SM__ROLE_FOURNI_ALPHA_SM);

		attachment_CM_AlphaEClass = createEClass(ATTACHMENT_CM_ALPHA);
		createEReference(attachment_CM_AlphaEClass, ATTACHMENT_CM_ALPHA__ROLE_REQUIS_CM_ALPHA);

		attachment_Alpha_CMEClass = createEClass(ATTACHMENT_ALPHA_CM);
		createEReference(attachment_Alpha_CMEClass, ATTACHMENT_ALPHA_CM__PORT_REQUIS_ALPHA_CM);
		createEReference(attachment_Alpha_CMEClass, ATTACHMENT_ALPHA_CM__ROLE_FOURNI_ALPHA_CM);

		attachment_SM_BetaEClass = createEClass(ATTACHMENT_SM_BETA);
		createEReference(attachment_SM_BetaEClass, ATTACHMENT_SM_BETA__PORT_FOURNI_SM_BETA);
		createEReference(attachment_SM_BetaEClass, ATTACHMENT_SM_BETA__ROLE_REQUIS_SM_BETA);

		attachment_Beta_SMEClass = createEClass(ATTACHMENT_BETA_SM);
		createEReference(attachment_Beta_SMEClass, ATTACHMENT_BETA_SM__PORT_REQUIS_BETA_SM);
		createEReference(attachment_Beta_SMEClass, ATTACHMENT_BETA_SM__ROLE_FOURNI_BETA_SM);

		attachment_DB_BetaEClass = createEClass(ATTACHMENT_DB_BETA);
		createEReference(attachment_DB_BetaEClass, ATTACHMENT_DB_BETA__PORT_FOURNI_DB_BETA);
		createEReference(attachment_DB_BetaEClass, ATTACHMENT_DB_BETA__ROLE_REQUIS_DB_BETA);

		attachment_Beta_DBEClass = createEClass(ATTACHMENT_BETA_DB);
		createEReference(attachment_Beta_DBEClass, ATTACHMENT_BETA_DB__PORT_REQUIS_BETA_DB);
		createEReference(attachment_Beta_DBEClass, ATTACHMENT_BETA_DB__ROLE_FOURNI_BETA_DB);

		attachment_CM_GammaEClass = createEClass(ATTACHMENT_CM_GAMMA);
		createEReference(attachment_CM_GammaEClass, ATTACHMENT_CM_GAMMA__ROLE_REQUIS_CM_GAMMA);
		createEReference(attachment_CM_GammaEClass, ATTACHMENT_CM_GAMMA__PORT_FOURNI_CM_GAMMA);

		attachment_Gamma_CMEClass = createEClass(ATTACHMENT_GAMMA_CM);
		createEReference(attachment_Gamma_CMEClass, ATTACHMENT_GAMMA_CM__ROLE_FOURNI_GAMMA_CM);
		createEReference(attachment_Gamma_CMEClass, ATTACHMENT_GAMMA_CM__PORT_REQUIS_GAMMA_CM);

		attachment_DB_GammaEClass = createEClass(ATTACHMENT_DB_GAMMA);
		createEReference(attachment_DB_GammaEClass, ATTACHMENT_DB_GAMMA__ROLE_REQUIS_DB_GAMMA);
		createEReference(attachment_DB_GammaEClass, ATTACHMENT_DB_GAMMA__PORT_FOURNI_DB_GAMMA);

		attachment_Gamma_DBEClass = createEClass(ATTACHMENT_GAMMA_DB);
		createEReference(attachment_Gamma_DBEClass, ATTACHMENT_GAMMA_DB__ROLE_FOURNI_GAMMA_DB);
		createEReference(attachment_Gamma_DBEClass, ATTACHMENT_GAMMA_DB__PORT_REQUIS_GAMMA_DB);

		port_Serveur_Comp_Serveur_ComfEClass = createEClass(PORT_SERVEUR_COMP_SERVEUR_COMF);
		createEReference(port_Serveur_Comp_Serveur_ComfEClass, PORT_SERVEUR_COMP_SERVEUR_COMF__BINDING_SERVEUR_COMP_SERVEUR_CONF);

		interface_Serveur_ConfEClass = createEClass(INTERFACE_SERVEUR_CONF);
		createEReference(interface_Serveur_ConfEClass, INTERFACE_SERVEUR_CONF__PORT_SERVEUR_CONF_SERVEUR_COMP);

		port_Serveur_Conf_Serveur_CompEClass = createEClass(PORT_SERVEUR_CONF_SERVEUR_COMP);
		createEReference(port_Serveur_Conf_Serveur_CompEClass, PORT_SERVEUR_CONF_SERVEUR_COMP__BINDING_SERVEUR_COMP_SERVEUR_CONF);

		binding_Serveur_Comp_Serveur_ConfEClass = createEClass(BINDING_SERVEUR_COMP_SERVEUR_CONF);
		createEReference(binding_Serveur_Comp_Serveur_ConfEClass, BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_SERVEUR_CONF_SERVEUR_COMP);
		createEReference(binding_Serveur_Comp_Serveur_ConfEClass, BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_SERVEUR_COMP_SERVEUR_COMF);

		port_CM_Serveur_CompEClass = createEClass(PORT_CM_SERVEUR_COMP);
		createEReference(port_CM_Serveur_CompEClass, PORT_CM_SERVEUR_COMP__BINDING_SERVEUR_COMP_CM);

		port_Serveur_Comp_CMEClass = createEClass(PORT_SERVEUR_COMP_CM);
		createEReference(port_Serveur_Comp_CMEClass, PORT_SERVEUR_COMP_CM__BINDING_SERVEUR_COMP_CM);

		binding_Serveur_Comp_CMEClass = createEClass(BINDING_SERVEUR_COMP_CM);
		createEReference(binding_Serveur_Comp_CMEClass, BINDING_SERVEUR_COMP_CM__PORT_CM_SERVEUR_COMP);
		createEReference(binding_Serveur_Comp_CMEClass, BINDING_SERVEUR_COMP_CM__PORT_SERVEUR_COMP_CM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CosaPackage theCosaPackage = (CosaPackage)EPackage.Registry.INSTANCE.getEPackage(CosaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		clientEClass.getESuperTypes().add(theCosaPackage.getComposant());
		rpcEClass.getESuperTypes().add(theCosaPackage.getConnecteur());
		client_serveurEClass.getESuperTypes().add(theCosaPackage.getConfiguration());
		interface_RPCEClass.getESuperTypes().add(theCosaPackage.getInterface_Connecteur());
		dataBaseEClass.getESuperTypes().add(theCosaPackage.getComposant());
		interface_DataBaseEClass.getESuperTypes().add(theCosaPackage.getInterface_Composant());
		serveur_CompEClass.getESuperTypes().add(theCosaPackage.getComposant());
		interface_Serveur_CompEClass.getESuperTypes().add(theCosaPackage.getInterface_Composant());
		serveur_ConfEClass.getESuperTypes().add(theCosaPackage.getConfiguration());
		port_Requis_ServeurEClass.getESuperTypes().add(theCosaPackage.getPort_Requis());
		port_Fourni_ServeurEClass.getESuperTypes().add(theCosaPackage.getPort_Fourni());
		role_Requis_RPC_ClientEClass.getESuperTypes().add(theCosaPackage.getRole_Requis());
		role_Fourni_RPC_ClientEClass.getESuperTypes().add(theCosaPackage.getRole_Fourni());
		port_Requis_ClientEClass.getESuperTypes().add(theCosaPackage.getPort_Requis());
		port_Fourni_ClientEClass.getESuperTypes().add(theCosaPackage.getPort_Fourni());
		attachment_Client_RPCEClass.getESuperTypes().add(theCosaPackage.getAttachment());
		attachment_RPC_ClientEClass.getESuperTypes().add(theCosaPackage.getAttachment());
		role_Requis_RPC_ServeurEClass.getESuperTypes().add(theCosaPackage.getRole_Requis());
		role_Fourni_RPC_ServeurEClass.getESuperTypes().add(theCosaPackage.getRole_Fourni());
		attachment_RPC_ServeurEClass.getESuperTypes().add(theCosaPackage.getAttachment());
		attachment_Serveur_RPCEClass.getESuperTypes().add(theCosaPackage.getAttachment());
		security_ManagerEClass.getESuperTypes().add(theCosaPackage.getComposant());
		connection_ManagerEClass.getESuperTypes().add(theCosaPackage.getComposant());
		interface_Connection_ManagerEClass.getESuperTypes().add(theCosaPackage.getInterface_Composant());
		interface_Security_ManagerEClass.getESuperTypes().add(theCosaPackage.getInterface_Composant());
		port_Requis_Alpha_CMEClass.getESuperTypes().add(theCosaPackage.getPort_Requis());
		port_Fourni_CM_AlphaEClass.getESuperTypes().add(theCosaPackage.getPort_Fourni());
		port_Fourni_CM_GammaEClass.getESuperTypes().add(theCosaPackage.getPort_Fourni());
		port_Requis_Gamma_CMEClass.getESuperTypes().add(theCosaPackage.getPort_Requis());
		port_Fourni_DB_GammaEClass.getESuperTypes().add(theCosaPackage.getPort_Fourni());
		port_Requis_Gamma_DBEClass.getESuperTypes().add(theCosaPackage.getPort_Requis());
		port_Fourni_DB_BetaEClass.getESuperTypes().add(theCosaPackage.getPort_Fourni());
		port_Requis_Beta_DBEClass.getESuperTypes().add(theCosaPackage.getPort_Requis());
		port_Fourni_SM_AlphaEClass.getESuperTypes().add(theCosaPackage.getPort_Fourni());
		port_Requis_Alpha_SMEClass.getESuperTypes().add(theCosaPackage.getPort_Requis());
		port_Fourni_SM_BetaEClass.getESuperTypes().add(theCosaPackage.getPort_Fourni());
		port_Requis_Beta_SMEClass.getESuperTypes().add(theCosaPackage.getPort_Requis());
		betaEClass.getESuperTypes().add(theCosaPackage.getConnecteur());
		alphaEClass.getESuperTypes().add(theCosaPackage.getConnecteur());
		gammaEClass.getESuperTypes().add(theCosaPackage.getConnecteur());
		interface_BetaEClass.getESuperTypes().add(theCosaPackage.getInterface_Connecteur());
		interface_AlphaEClass.getESuperTypes().add(theCosaPackage.getInterface_Connecteur());
		interface_GammaEClass.getESuperTypes().add(theCosaPackage.getInterface_Connecteur());
		role_Requis_SM_BetaEClass.getESuperTypes().add(theCosaPackage.getRole_Requis());
		role_Fourni_Beta_SMEClass.getESuperTypes().add(theCosaPackage.getRole_Fourni());
		role_Requis_DB_BetaEClass.getESuperTypes().add(theCosaPackage.getRole_Requis());
		role_Fourni_Beta_DBEClass.getESuperTypes().add(theCosaPackage.getRole_Fourni());
		role_Fourni_Gamma_CMEClass.getESuperTypes().add(theCosaPackage.getRole_Fourni());
		role_Requis_CM_GammaEClass.getESuperTypes().add(theCosaPackage.getRole_Requis());
		role_Requis_DB_GammaEClass.getESuperTypes().add(theCosaPackage.getRole_Requis());
		role_Fourni_Gamma_DBEClass.getESuperTypes().add(theCosaPackage.getRole_Fourni());
		role_Requis_SM_AlphaEClass.getESuperTypes().add(theCosaPackage.getRole_Requis());
		role_Fourni_Alpha_SMEClass.getESuperTypes().add(theCosaPackage.getRole_Fourni());
		role_Requis_CM_AlphaEClass.getESuperTypes().add(theCosaPackage.getRole_Requis());
		role_Fourni_Alpha_CMEClass.getESuperTypes().add(theCosaPackage.getRole_Fourni());
		attachment_SM_AlphaEClass.getESuperTypes().add(theCosaPackage.getAttachment());
		attachment_Alpha_SMEClass.getESuperTypes().add(theCosaPackage.getAttachment());
		attachment_CM_AlphaEClass.getESuperTypes().add(theCosaPackage.getAttachment());
		attachment_Alpha_CMEClass.getESuperTypes().add(theCosaPackage.getAttachment());
		attachment_SM_BetaEClass.getESuperTypes().add(theCosaPackage.getAttachment());
		attachment_Beta_SMEClass.getESuperTypes().add(theCosaPackage.getAttachment());
		attachment_DB_BetaEClass.getESuperTypes().add(theCosaPackage.getAttachment());
		attachment_Beta_DBEClass.getESuperTypes().add(theCosaPackage.getAttachment());
		attachment_CM_GammaEClass.getESuperTypes().add(theCosaPackage.getAttachment());
		attachment_Gamma_CMEClass.getESuperTypes().add(theCosaPackage.getAttachment());
		attachment_DB_GammaEClass.getESuperTypes().add(theCosaPackage.getAttachment());
		attachment_Gamma_DBEClass.getESuperTypes().add(theCosaPackage.getAttachment());
		port_Serveur_Comp_Serveur_ComfEClass.getESuperTypes().add(theCosaPackage.getPort());
		interface_Serveur_ConfEClass.getESuperTypes().add(theCosaPackage.getInterface_Composant());
		port_Serveur_Conf_Serveur_CompEClass.getESuperTypes().add(theCosaPackage.getPort());
		binding_Serveur_Comp_Serveur_ConfEClass.getESuperTypes().add(theCosaPackage.getBinding());
		port_CM_Serveur_CompEClass.getESuperTypes().add(theCosaPackage.getPort());
		port_Serveur_Comp_CMEClass.getESuperTypes().add(theCosaPackage.getPort());
		binding_Serveur_Comp_CMEClass.getESuperTypes().add(theCosaPackage.getBinding());

		// Initialize classes, features, and operations; add parameters
		initEClass(clientEClass, Client.class, "Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClient_Interface_client(), this.getInterface_Client(), null, "interface_client", null, 0, -1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rpcEClass, client_serveur.RPC.class, "RPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRPC_Interface_rpc(), this.getInterface_RPC(), null, "interface_rpc", null, 0, -1, client_serveur.RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(client_serveurEClass, Client_serveur.class, "Client_serveur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClient_serveur_Client(), this.getClient(), null, "client", null, 0, -1, Client_serveur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClient_serveur_Rpc(), this.getRPC(), null, "rpc", null, 0, -1, Client_serveur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClient_serveur_Serveur(), this.getServeur_Comp(), null, "serveur", null, 0, -1, Client_serveur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interface_ClientEClass, Interface_Client.class, "Interface_Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_Client_Port_fourni_client(), this.getPort_Fourni_Client(), null, "port_fourni_client", null, 0, -1, Interface_Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Client_Port_requis_client(), this.getPort_Requis_Client(), null, "port_requis_client", null, 0, -1, Interface_Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interface_RPCEClass, Interface_RPC.class, "Interface_RPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_RPC_Role_fourni_rpc_client(), this.getRole_Fourni_RPC_Client(), null, "role_fourni_rpc_client", null, 0, -1, Interface_RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_RPC_Role_requis_rpc_client(), this.getRole_Requis_RPC_Client(), null, "role_requis_rpc_client", null, 0, -1, Interface_RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_RPC_Role_fourni_rpc_serveur(), this.getRole_Fourni_RPC_Serveur(), null, "role_fourni_rpc_serveur", null, 0, -1, Interface_RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_RPC_Role_requis_rpc_serveur(), this.getRole_Requis_RPC_Serveur(), null, "role_requis_rpc_serveur", null, 0, -1, Interface_RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataBaseEClass, DataBase.class, "DataBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataBase_Interface_database(), this.getInterface_DataBase(), null, "interface_database", null, 0, -1, DataBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interface_DataBaseEClass, Interface_DataBase.class, "Interface_DataBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_DataBase_Port_fourni_db_gamma(), this.getPort_Fourni_DB_Gamma(), null, "port_fourni_db_gamma", null, 0, -1, Interface_DataBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_DataBase_Port_requis_gamma_db(), this.getPort_Requis_Gamma_DB(), null, "port_requis_gamma_db", null, 0, -1, Interface_DataBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_DataBase_Port_fourni_db_beta(), this.getPort_Fourni_DB_Beta(), null, "port_fourni_db_beta", null, 0, -1, Interface_DataBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_DataBase_Port_requis_beta_db(), this.getPort_Requis_Beta_DB(), null, "port_requis_beta_db", null, 0, -1, Interface_DataBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serveur_CompEClass, Serveur_Comp.class, "Serveur_Comp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServeur_Comp_Interface_serveur_comp(), this.getInterface_Serveur_Comp(), null, "interface_serveur_comp", null, 0, -1, Serveur_Comp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeur_Comp_Serveur_conf(), this.getServeur_Conf(), null, "serveur_conf", null, 0, -1, Serveur_Comp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interface_Serveur_CompEClass, Interface_Serveur_Comp.class, "Interface_Serveur_Comp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_Serveur_Comp_Port_requis_serveur(), this.getPort_Requis_Serveur(), null, "port_requis_serveur", null, 0, -1, Interface_Serveur_Comp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Serveur_Comp_Port_fourni_serveur(), this.getPort_Fourni_Serveur(), null, "port_fourni_serveur", null, 0, -1, Interface_Serveur_Comp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Serveur_Comp_Port_serveur_comp_serveur_comf(), this.getPort_Serveur_Comp_Serveur_Comf(), null, "port_serveur_comp_serveur_comf", null, 0, -1, Interface_Serveur_Comp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Serveur_Comp_Port_serveur_comp_cm(), this.getPort_Serveur_Comp_CM(), null, "port_serveur_comp_cm", null, 0, -1, Interface_Serveur_Comp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serveur_ConfEClass, Serveur_Conf.class, "Serveur_Conf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServeur_Conf_Database(), this.getDataBase(), null, "database", null, 0, -1, Serveur_Conf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeur_Conf_Security_manager(), this.getSecurity_Manager(), null, "security_manager", null, 0, -1, Serveur_Conf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeur_Conf_Connection_manager(), this.getConnection_Manager(), null, "connection_manager", null, 0, -1, Serveur_Conf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeur_Conf_Gamma(), this.getGamma(), null, "gamma", null, 0, -1, Serveur_Conf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeur_Conf_Alpha(), this.getAlpha(), null, "alpha", null, 0, -1, Serveur_Conf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeur_Conf_Beta(), this.getBeta(), null, "beta", null, 0, -1, Serveur_Conf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeur_Conf_Interface_serveur_conf(), this.getInterface_Serveur_Conf(), null, "interface_serveur_conf", null, 0, -1, Serveur_Conf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(port_Requis_ServeurEClass, Port_Requis_Serveur.class, "Port_Requis_Serveur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Requis_Serveur_Attachment_rpc_serveur(), this.getAttachment_RPC_Serveur(), this.getAttachment_RPC_Serveur_Port_requis_serveur(), "attachment_rpc_serveur", null, 0, 1, Port_Requis_Serveur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(port_Fourni_ServeurEClass, Port_Fourni_Serveur.class, "Port_Fourni_Serveur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Fourni_Serveur_Attachment_serveur_rpc(), this.getAttachment_Serveur_RPC(), this.getAttachment_Serveur_RPC_Port_fourni_serveur(), "attachment_serveur_rpc", null, 0, 1, Port_Fourni_Serveur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(role_Requis_RPC_ClientEClass, Role_Requis_RPC_Client.class, "Role_Requis_RPC_Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Requis_RPC_Client_Attachment_client_rpc(), this.getAttachment_Client_RPC(), this.getAttachment_Client_RPC_Role_requis_rpc_client(), "attachment_client_rpc", null, 0, 1, Role_Requis_RPC_Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(role_Fourni_RPC_ClientEClass, Role_Fourni_RPC_Client.class, "Role_Fourni_RPC_Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Fourni_RPC_Client_Attachment_rpc_client(), this.getAttachment_RPC_Client(), this.getAttachment_RPC_Client_Role_fourni_rpc_client(), "attachment_rpc_client", null, 0, 1, Role_Fourni_RPC_Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(port_Requis_ClientEClass, Port_Requis_Client.class, "Port_Requis_Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Requis_Client_Attachment_rpc_client(), this.getAttachment_RPC_Client(), this.getAttachment_RPC_Client_Port_requis_client(), "attachment_rpc_client", null, 0, 1, Port_Requis_Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(port_Fourni_ClientEClass, Port_Fourni_Client.class, "Port_Fourni_Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Fourni_Client_Attachment_client_rpc(), this.getAttachment_Client_RPC(), this.getAttachment_Client_RPC_Port_fourni_client(), "attachment_client_rpc", null, 0, 1, Port_Fourni_Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_Client_RPCEClass, Attachment_Client_RPC.class, "Attachment_Client_RPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachment_Client_RPC_Port_fourni_client(), this.getPort_Fourni_Client(), this.getPort_Fourni_Client_Attachment_client_rpc(), "port_fourni_client", null, 0, 1, Attachment_Client_RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Client_RPC_Role_requis_rpc_client(), this.getRole_Requis_RPC_Client(), this.getRole_Requis_RPC_Client_Attachment_client_rpc(), "role_requis_rpc_client", null, 0, 1, Attachment_Client_RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_RPC_ClientEClass, Attachment_RPC_Client.class, "Attachment_RPC_Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachment_RPC_Client_Port_requis_client(), this.getPort_Requis_Client(), this.getPort_Requis_Client_Attachment_rpc_client(), "port_requis_client", null, 0, 1, Attachment_RPC_Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_RPC_Client_Role_fourni_rpc_client(), this.getRole_Fourni_RPC_Client(), this.getRole_Fourni_RPC_Client_Attachment_rpc_client(), "role_fourni_rpc_client", null, 0, 1, Attachment_RPC_Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(role_Requis_RPC_ServeurEClass, Role_Requis_RPC_Serveur.class, "Role_Requis_RPC_Serveur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Requis_RPC_Serveur_Attachment_serveur_rpc(), this.getAttachment_Serveur_RPC(), this.getAttachment_Serveur_RPC_Role_requis_rpc_serveur(), "attachment_serveur_rpc", null, 0, 1, Role_Requis_RPC_Serveur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(role_Fourni_RPC_ServeurEClass, Role_Fourni_RPC_Serveur.class, "Role_Fourni_RPC_Serveur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Fourni_RPC_Serveur_Attachment_rpc_serveur(), this.getAttachment_RPC_Serveur(), this.getAttachment_RPC_Serveur_Role_fourni_rpc_serveur(), "attachment_rpc_serveur", null, 0, 1, Role_Fourni_RPC_Serveur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_RPC_ServeurEClass, Attachment_RPC_Serveur.class, "Attachment_RPC_Serveur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachment_RPC_Serveur_Role_fourni_rpc_serveur(), this.getRole_Fourni_RPC_Serveur(), this.getRole_Fourni_RPC_Serveur_Attachment_rpc_serveur(), "role_fourni_rpc_serveur", null, 0, 1, Attachment_RPC_Serveur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_RPC_Serveur_Port_requis_serveur(), this.getPort_Requis_Serveur(), this.getPort_Requis_Serveur_Attachment_rpc_serveur(), "port_requis_serveur", null, 0, 1, Attachment_RPC_Serveur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_Serveur_RPCEClass, Attachment_Serveur_RPC.class, "Attachment_Serveur_RPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachment_Serveur_RPC_Port_fourni_serveur(), this.getPort_Fourni_Serveur(), this.getPort_Fourni_Serveur_Attachment_serveur_rpc(), "port_fourni_serveur", null, 0, 1, Attachment_Serveur_RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Serveur_RPC_Role_requis_rpc_serveur(), this.getRole_Requis_RPC_Serveur(), this.getRole_Requis_RPC_Serveur_Attachment_serveur_rpc(), "role_requis_rpc_serveur", null, 0, 1, Attachment_Serveur_RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(security_ManagerEClass, Security_Manager.class, "Security_Manager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurity_Manager_Interface_security_manager(), this.getInterface_Security_Manager(), null, "interface_security_manager", null, 0, -1, Security_Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connection_ManagerEClass, Connection_Manager.class, "Connection_Manager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_Manager_Interface_connection_manager(), this.getInterface_Connection_Manager(), null, "interface_connection_manager", null, 0, -1, Connection_Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interface_Connection_ManagerEClass, Interface_Connection_Manager.class, "Interface_Connection_Manager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_Connection_Manager_Port_fourni_cm_gamma(), this.getPort_Fourni_CM_Gamma(), null, "port_fourni_cm_gamma", null, 0, -1, Interface_Connection_Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Connection_Manager_Port_requis_gamma_cm(), this.getPort_Requis_Gamma_CM(), null, "port_requis_gamma_cm", null, 0, -1, Interface_Connection_Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Connection_Manager_Port_fourni_cm_alpha(), this.getPort_Fourni_CM_Alpha(), null, "port_fourni_cm_alpha", null, 0, -1, Interface_Connection_Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Connection_Manager_Port_requis_alpha_cm(), this.getPort_Requis_Alpha_CM(), null, "port_requis_alpha_cm", null, 0, -1, Interface_Connection_Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Connection_Manager_Port_cm_serveur_comp(), this.getPort_CM_Serveur_Comp(), null, "port_cm_serveur_comp", null, 0, -1, Interface_Connection_Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interface_Security_ManagerEClass, Interface_Security_Manager.class, "Interface_Security_Manager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_Security_Manager_Port_fourni_sm_beta(), this.getPort_Fourni_SM_Beta(), null, "port_fourni_sm_beta", null, 0, -1, Interface_Security_Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Security_Manager_Port_requis_beta_sm(), this.getPort_Requis_Beta_SM(), null, "port_requis_beta_sm", null, 0, -1, Interface_Security_Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Security_Manager_Port_fourni_sm_alpha(), this.getPort_Fourni_SM_Alpha(), null, "port_fourni_sm_alpha", null, 0, -1, Interface_Security_Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Security_Manager_Port_requis_alpha_sm(), this.getPort_Requis_Alpha_SM(), null, "port_requis_alpha_sm", null, 0, -1, Interface_Security_Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(port_Requis_Alpha_CMEClass, Port_Requis_Alpha_CM.class, "Port_Requis_Alpha_CM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Requis_Alpha_CM_Attachment_alpha_cm(), this.getAttachment_Alpha_CM(), this.getAttachment_Alpha_CM_Port_requis_alpha_cm(), "attachment_alpha_cm", null, 0, 1, Port_Requis_Alpha_CM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(port_Fourni_CM_AlphaEClass, Port_Fourni_CM_Alpha.class, "Port_Fourni_CM_Alpha", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Fourni_CM_Alpha_Attachment_cm_alpha(), this.getAttachment_CM_Alpha(), null, "attachment_cm_alpha", null, 0, 1, Port_Fourni_CM_Alpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(port_Fourni_CM_GammaEClass, Port_Fourni_CM_Gamma.class, "Port_Fourni_CM_Gamma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Fourni_CM_Gamma_Attachment_cm_gamma(), this.getAttachment_CM_Gamma(), this.getAttachment_CM_Gamma_Port_fourni_cm_gamma(), "attachment_cm_gamma", null, 0, 1, Port_Fourni_CM_Gamma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(port_Requis_Gamma_CMEClass, Port_Requis_Gamma_CM.class, "Port_Requis_Gamma_CM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Requis_Gamma_CM_Attachment_gamma_cm(), this.getAttachment_Gamma_CM(), this.getAttachment_Gamma_CM_Port_requis_gamma_cm(), "attachment_gamma_cm", null, 0, 1, Port_Requis_Gamma_CM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(port_Fourni_DB_GammaEClass, Port_Fourni_DB_Gamma.class, "Port_Fourni_DB_Gamma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Fourni_DB_Gamma_Attachment_db_gamma(), this.getAttachment_DB_Gamma(), this.getAttachment_DB_Gamma_Port_fourni_db_gamma(), "attachment_db_gamma", null, 0, 1, Port_Fourni_DB_Gamma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(port_Requis_Gamma_DBEClass, Port_Requis_Gamma_DB.class, "Port_Requis_Gamma_DB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Requis_Gamma_DB_Attachment_gamma_db(), this.getAttachment_Gamma_DB(), this.getAttachment_Gamma_DB_Port_requis_gamma_db(), "attachment_gamma_db", null, 0, 1, Port_Requis_Gamma_DB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(port_Fourni_DB_BetaEClass, Port_Fourni_DB_Beta.class, "Port_Fourni_DB_Beta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Fourni_DB_Beta_Attachment_db_beta(), this.getAttachment_DB_Beta(), this.getAttachment_DB_Beta_Port_fourni_db_beta(), "attachment_db_beta", null, 0, 1, Port_Fourni_DB_Beta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(port_Requis_Beta_DBEClass, Port_Requis_Beta_DB.class, "Port_Requis_Beta_DB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Requis_Beta_DB_Attachment_beta_db(), this.getAttachment_Beta_DB(), this.getAttachment_Beta_DB_Port_requis_beta_db(), "attachment_beta_db", null, 0, 1, Port_Requis_Beta_DB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(port_Fourni_SM_AlphaEClass, Port_Fourni_SM_Alpha.class, "Port_Fourni_SM_Alpha", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Fourni_SM_Alpha_Attachment_sm_alpha(), this.getAttachment_SM_Alpha(), this.getAttachment_SM_Alpha_Port_fourni_sm_alpha(), "attachment_sm_alpha", null, 0, 1, Port_Fourni_SM_Alpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(port_Requis_Alpha_SMEClass, Port_Requis_Alpha_SM.class, "Port_Requis_Alpha_SM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Requis_Alpha_SM_Attachment_alpha_sm(), this.getAttachment_Alpha_SM(), this.getAttachment_Alpha_SM_Port_requis_alpha_sm(), "attachment_alpha_sm", null, 0, 1, Port_Requis_Alpha_SM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(port_Fourni_SM_BetaEClass, Port_Fourni_SM_Beta.class, "Port_Fourni_SM_Beta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Fourni_SM_Beta_Attachment_sm_beta(), this.getAttachment_SM_Beta(), this.getAttachment_SM_Beta_Port_fourni_sm_beta(), "attachment_sm_beta", null, 0, 1, Port_Fourni_SM_Beta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(port_Requis_Beta_SMEClass, Port_Requis_Beta_SM.class, "Port_Requis_Beta_SM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Requis_Beta_SM_Attachment_beta_sm(), this.getAttachment_Beta_SM(), this.getAttachment_Beta_SM_Port_requis_beta_sm(), "attachment_beta_sm", null, 0, 1, Port_Requis_Beta_SM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(betaEClass, Beta.class, "Beta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBeta_Interface_beta(), this.getInterface_Beta(), null, "interface_beta", null, 0, -1, Beta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alphaEClass, Alpha.class, "Alpha", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlpha_Interface_alpha(), this.getInterface_Alpha(), null, "interface_alpha", null, 0, -1, Alpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gammaEClass, Gamma.class, "Gamma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGamma_Interface_gamma(), this.getInterface_Gamma(), null, "interface_gamma", null, 0, -1, Gamma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interface_BetaEClass, Interface_Beta.class, "Interface_Beta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_Beta_Role_fourni_beta_sm(), this.getRole_Fourni_Beta_SM(), null, "role_fourni_beta_sm", null, 0, -1, Interface_Beta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Beta_Role_requis_sm_beta(), this.getRole_Requis_SM_Beta(), null, "role_requis_sm_beta", null, 0, -1, Interface_Beta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Beta_Role_requis_db_beta(), this.getRole_Requis_DB_Beta(), null, "role_requis_db_beta", null, 0, -1, Interface_Beta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Beta_Role_fourni_beta_db(), this.getRole_Fourni_Beta_DB(), null, "role_fourni_beta_db", null, 0, -1, Interface_Beta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interface_AlphaEClass, Interface_Alpha.class, "Interface_Alpha", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_Alpha_Role_fourni_alpha_sm(), this.getRole_Fourni_Alpha_SM(), null, "role_fourni_alpha_sm", null, 0, -1, Interface_Alpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Alpha_Role_requis_sm_alpha(), this.getRole_Requis_SM_Alpha(), null, "role_requis_sm_alpha", null, 0, -1, Interface_Alpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Alpha_Role_requis_cm_alpha(), this.getRole_Requis_CM_Alpha(), null, "role_requis_cm_alpha", null, 0, -1, Interface_Alpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Alpha_Role_fourni_alpha_cm(), this.getRole_Fourni_Alpha_CM(), null, "role_fourni_alpha_cm", null, 0, -1, Interface_Alpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interface_GammaEClass, Interface_Gamma.class, "Interface_Gamma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_Gamma_Role_requis_cm_gamma(), this.getRole_Requis_CM_Gamma(), null, "role_requis_cm_gamma", null, 0, -1, Interface_Gamma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Gamma_Role_fourni_gamma_cm(), this.getRole_Fourni_Gamma_CM(), null, "role_fourni_gamma_cm", null, 0, -1, Interface_Gamma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Gamma_Role_requis_db_gamma(), this.getRole_Requis_DB_Gamma(), null, "role_requis_db_gamma", null, 0, -1, Interface_Gamma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Gamma_Role_fourni_gamma_db(), this.getRole_Fourni_Gamma_DB(), null, "role_fourni_gamma_db", null, 0, -1, Interface_Gamma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(role_Requis_SM_BetaEClass, Role_Requis_SM_Beta.class, "Role_Requis_SM_Beta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Requis_SM_Beta_Attachment_sm_beta(), this.getAttachment_SM_Beta(), this.getAttachment_SM_Beta_Role_requis_sm_beta(), "attachment_sm_beta", null, 0, 1, Role_Requis_SM_Beta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(role_Fourni_Beta_SMEClass, Role_Fourni_Beta_SM.class, "Role_Fourni_Beta_SM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Fourni_Beta_SM_Attachment_beta_sm(), this.getAttachment_Beta_SM(), this.getAttachment_Beta_SM_Role_fourni_beta_sm(), "attachment_beta_sm", null, 0, 1, Role_Fourni_Beta_SM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(role_Requis_DB_BetaEClass, Role_Requis_DB_Beta.class, "Role_Requis_DB_Beta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Requis_DB_Beta_Attachment_db_beta(), this.getAttachment_DB_Beta(), this.getAttachment_DB_Beta_Role_requis_db_beta(), "attachment_db_beta", null, 0, 1, Role_Requis_DB_Beta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(role_Fourni_Beta_DBEClass, Role_Fourni_Beta_DB.class, "Role_Fourni_Beta_DB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Fourni_Beta_DB_Attachment_beta_db(), this.getAttachment_Beta_DB(), this.getAttachment_Beta_DB_Role_fourni_beta_db(), "attachment_beta_db", null, 0, 1, Role_Fourni_Beta_DB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(role_Fourni_Gamma_CMEClass, Role_Fourni_Gamma_CM.class, "Role_Fourni_Gamma_CM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Fourni_Gamma_CM_Attachment_gamma_cm(), this.getAttachment_Gamma_CM(), this.getAttachment_Gamma_CM_Role_fourni_gamma_cm(), "attachment_gamma_cm", null, 0, 1, Role_Fourni_Gamma_CM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(role_Requis_CM_GammaEClass, Role_Requis_CM_Gamma.class, "Role_Requis_CM_Gamma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Requis_CM_Gamma_Attachment_cm_gamma(), this.getAttachment_CM_Gamma(), this.getAttachment_CM_Gamma_Role_requis_cm_gamma(), "attachment_cm_gamma", null, 0, 1, Role_Requis_CM_Gamma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(role_Requis_DB_GammaEClass, Role_Requis_DB_Gamma.class, "Role_Requis_DB_Gamma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Requis_DB_Gamma_Attachment_db_gamma(), this.getAttachment_DB_Gamma(), this.getAttachment_DB_Gamma_Role_requis_db_gamma(), "attachment_db_gamma", null, 0, 1, Role_Requis_DB_Gamma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(role_Fourni_Gamma_DBEClass, Role_Fourni_Gamma_DB.class, "Role_Fourni_Gamma_DB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Fourni_Gamma_DB_Attachment_gamma_db(), this.getAttachment_Gamma_DB(), this.getAttachment_Gamma_DB_Role_fourni_gamma_db(), "attachment_gamma_db", null, 0, 1, Role_Fourni_Gamma_DB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(role_Requis_SM_AlphaEClass, Role_Requis_SM_Alpha.class, "Role_Requis_SM_Alpha", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Requis_SM_Alpha_Attachment_sm_alpha(), this.getAttachment_SM_Alpha(), this.getAttachment_SM_Alpha_Role_requis_sm_alpha(), "attachment_sm_alpha", null, 0, 1, Role_Requis_SM_Alpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(role_Fourni_Alpha_SMEClass, Role_Fourni_Alpha_SM.class, "Role_Fourni_Alpha_SM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Fourni_Alpha_SM_Attachment_alpha_sm(), this.getAttachment_Alpha_SM(), this.getAttachment_Alpha_SM_Role_fourni_alpha_sm(), "attachment_alpha_sm", null, 0, 1, Role_Fourni_Alpha_SM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(role_Requis_CM_AlphaEClass, Role_Requis_CM_Alpha.class, "Role_Requis_CM_Alpha", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Requis_CM_Alpha_Attachment_cm_alpha(), this.getAttachment_CM_Alpha(), this.getAttachment_CM_Alpha_Role_requis_cm_alpha(), "attachment_cm_alpha", null, 0, 1, Role_Requis_CM_Alpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(role_Fourni_Alpha_CMEClass, Role_Fourni_Alpha_CM.class, "Role_Fourni_Alpha_CM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Fourni_Alpha_CM_Attachment_alpha_cm(), this.getAttachment_Alpha_CM(), this.getAttachment_Alpha_CM_Role_fourni_alpha_cm(), "attachment_alpha_cm", null, 0, 1, Role_Fourni_Alpha_CM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_SM_AlphaEClass, Attachment_SM_Alpha.class, "Attachment_SM_Alpha", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachment_SM_Alpha_Port_fourni_sm_alpha(), this.getPort_Fourni_SM_Alpha(), this.getPort_Fourni_SM_Alpha_Attachment_sm_alpha(), "port_fourni_sm_alpha", null, 0, 1, Attachment_SM_Alpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_SM_Alpha_Role_requis_sm_alpha(), this.getRole_Requis_SM_Alpha(), this.getRole_Requis_SM_Alpha_Attachment_sm_alpha(), "role_requis_sm_alpha", null, 0, 1, Attachment_SM_Alpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_Alpha_SMEClass, Attachment_Alpha_SM.class, "Attachment_Alpha_SM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachment_Alpha_SM_Port_requis_alpha_sm(), this.getPort_Requis_Alpha_SM(), this.getPort_Requis_Alpha_SM_Attachment_alpha_sm(), "port_requis_alpha_sm", null, 0, 1, Attachment_Alpha_SM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Alpha_SM_Role_fourni_alpha_sm(), this.getRole_Fourni_Alpha_SM(), this.getRole_Fourni_Alpha_SM_Attachment_alpha_sm(), "role_fourni_alpha_sm", null, 0, 1, Attachment_Alpha_SM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_CM_AlphaEClass, Attachment_CM_Alpha.class, "Attachment_CM_Alpha", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachment_CM_Alpha_Role_requis_cm_alpha(), this.getRole_Requis_CM_Alpha(), this.getRole_Requis_CM_Alpha_Attachment_cm_alpha(), "role_requis_cm_alpha", null, 0, 1, Attachment_CM_Alpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_Alpha_CMEClass, Attachment_Alpha_CM.class, "Attachment_Alpha_CM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachment_Alpha_CM_Port_requis_alpha_cm(), this.getPort_Requis_Alpha_CM(), this.getPort_Requis_Alpha_CM_Attachment_alpha_cm(), "port_requis_alpha_cm", null, 0, 1, Attachment_Alpha_CM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Alpha_CM_Role_fourni_alpha_cm(), this.getRole_Fourni_Alpha_CM(), this.getRole_Fourni_Alpha_CM_Attachment_alpha_cm(), "role_fourni_alpha_cm", null, 0, 1, Attachment_Alpha_CM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_SM_BetaEClass, Attachment_SM_Beta.class, "Attachment_SM_Beta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachment_SM_Beta_Port_fourni_sm_beta(), this.getPort_Fourni_SM_Beta(), this.getPort_Fourni_SM_Beta_Attachment_sm_beta(), "port_fourni_sm_beta", null, 0, 1, Attachment_SM_Beta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_SM_Beta_Role_requis_sm_beta(), this.getRole_Requis_SM_Beta(), this.getRole_Requis_SM_Beta_Attachment_sm_beta(), "role_requis_sm_beta", null, 0, 1, Attachment_SM_Beta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_Beta_SMEClass, Attachment_Beta_SM.class, "Attachment_Beta_SM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachment_Beta_SM_Port_requis_beta_sm(), this.getPort_Requis_Beta_SM(), this.getPort_Requis_Beta_SM_Attachment_beta_sm(), "port_requis_beta_sm", null, 0, 1, Attachment_Beta_SM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Beta_SM_Role_fourni_beta_sm(), this.getRole_Fourni_Beta_SM(), this.getRole_Fourni_Beta_SM_Attachment_beta_sm(), "role_fourni_beta_sm", null, 0, 1, Attachment_Beta_SM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_DB_BetaEClass, Attachment_DB_Beta.class, "Attachment_DB_Beta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachment_DB_Beta_Port_fourni_db_beta(), this.getPort_Fourni_DB_Beta(), this.getPort_Fourni_DB_Beta_Attachment_db_beta(), "port_fourni_db_beta", null, 0, 1, Attachment_DB_Beta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_DB_Beta_Role_requis_db_beta(), this.getRole_Requis_DB_Beta(), this.getRole_Requis_DB_Beta_Attachment_db_beta(), "role_requis_db_beta", null, 0, 1, Attachment_DB_Beta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_Beta_DBEClass, Attachment_Beta_DB.class, "Attachment_Beta_DB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachment_Beta_DB_Port_requis_beta_db(), this.getPort_Requis_Beta_DB(), this.getPort_Requis_Beta_DB_Attachment_beta_db(), "port_requis_beta_db", null, 0, 1, Attachment_Beta_DB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Beta_DB_Role_fourni_beta_db(), this.getRole_Fourni_Beta_DB(), this.getRole_Fourni_Beta_DB_Attachment_beta_db(), "role_fourni_beta_db", null, 0, 1, Attachment_Beta_DB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_CM_GammaEClass, Attachment_CM_Gamma.class, "Attachment_CM_Gamma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachment_CM_Gamma_Role_requis_cm_gamma(), this.getRole_Requis_CM_Gamma(), this.getRole_Requis_CM_Gamma_Attachment_cm_gamma(), "role_requis_cm_gamma", null, 0, 1, Attachment_CM_Gamma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_CM_Gamma_Port_fourni_cm_gamma(), this.getPort_Fourni_CM_Gamma(), this.getPort_Fourni_CM_Gamma_Attachment_cm_gamma(), "port_fourni_cm_gamma", null, 0, 1, Attachment_CM_Gamma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_Gamma_CMEClass, Attachment_Gamma_CM.class, "Attachment_Gamma_CM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachment_Gamma_CM_Role_fourni_gamma_cm(), this.getRole_Fourni_Gamma_CM(), this.getRole_Fourni_Gamma_CM_Attachment_gamma_cm(), "role_fourni_gamma_cm", null, 0, 1, Attachment_Gamma_CM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Gamma_CM_Port_requis_gamma_cm(), this.getPort_Requis_Gamma_CM(), this.getPort_Requis_Gamma_CM_Attachment_gamma_cm(), "port_requis_gamma_cm", null, 0, 1, Attachment_Gamma_CM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_DB_GammaEClass, Attachment_DB_Gamma.class, "Attachment_DB_Gamma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachment_DB_Gamma_Role_requis_db_gamma(), this.getRole_Requis_DB_Gamma(), this.getRole_Requis_DB_Gamma_Attachment_db_gamma(), "role_requis_db_gamma", null, 0, 1, Attachment_DB_Gamma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_DB_Gamma_Port_fourni_db_gamma(), this.getPort_Fourni_DB_Gamma(), this.getPort_Fourni_DB_Gamma_Attachment_db_gamma(), "port_fourni_db_gamma", null, 0, 1, Attachment_DB_Gamma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_Gamma_DBEClass, Attachment_Gamma_DB.class, "Attachment_Gamma_DB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachment_Gamma_DB_Role_fourni_gamma_db(), this.getRole_Fourni_Gamma_DB(), this.getRole_Fourni_Gamma_DB_Attachment_gamma_db(), "role_fourni_gamma_db", null, 0, 1, Attachment_Gamma_DB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Gamma_DB_Port_requis_gamma_db(), this.getPort_Requis_Gamma_DB(), this.getPort_Requis_Gamma_DB_Attachment_gamma_db(), "port_requis_gamma_db", null, 0, 1, Attachment_Gamma_DB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(port_Serveur_Comp_Serveur_ComfEClass, Port_Serveur_Comp_Serveur_Comf.class, "Port_Serveur_Comp_Serveur_Comf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Serveur_Comp_Serveur_Comf_Binding_serveur_comp_serveur_conf(), this.getBinding_Serveur_Comp_Serveur_Conf(), this.getBinding_Serveur_Comp_Serveur_Conf_Port_serveur_comp_serveur_comf(), "binding_serveur_comp_serveur_conf", null, 0, 1, Port_Serveur_Comp_Serveur_Comf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interface_Serveur_ConfEClass, Interface_Serveur_Conf.class, "Interface_Serveur_Conf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_Serveur_Conf_Port_serveur_conf_serveur_comp(), this.getPort_Serveur_Conf_Serveur_Comp(), null, "port_serveur_conf_serveur_comp", null, 0, -1, Interface_Serveur_Conf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(port_Serveur_Conf_Serveur_CompEClass, Port_Serveur_Conf_Serveur_Comp.class, "Port_Serveur_Conf_Serveur_Comp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Serveur_Conf_Serveur_Comp_Binding_serveur_comp_serveur_conf(), this.getBinding_Serveur_Comp_Serveur_Conf(), this.getBinding_Serveur_Comp_Serveur_Conf_Port_serveur_conf_serveur_comp(), "binding_serveur_comp_serveur_conf", null, 0, 1, Port_Serveur_Conf_Serveur_Comp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binding_Serveur_Comp_Serveur_ConfEClass, Binding_Serveur_Comp_Serveur_Conf.class, "Binding_Serveur_Comp_Serveur_Conf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinding_Serveur_Comp_Serveur_Conf_Port_serveur_conf_serveur_comp(), this.getPort_Serveur_Conf_Serveur_Comp(), this.getPort_Serveur_Conf_Serveur_Comp_Binding_serveur_comp_serveur_conf(), "port_serveur_conf_serveur_comp", null, 0, 1, Binding_Serveur_Comp_Serveur_Conf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinding_Serveur_Comp_Serveur_Conf_Port_serveur_comp_serveur_comf(), this.getPort_Serveur_Comp_Serveur_Comf(), this.getPort_Serveur_Comp_Serveur_Comf_Binding_serveur_comp_serveur_conf(), "port_serveur_comp_serveur_comf", null, 0, 1, Binding_Serveur_Comp_Serveur_Conf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(port_CM_Serveur_CompEClass, Port_CM_Serveur_Comp.class, "Port_CM_Serveur_Comp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_CM_Serveur_Comp_Binding_serveur_comp_cm(), this.getBinding_Serveur_Comp_CM(), this.getBinding_Serveur_Comp_CM_Port_cm_serveur_comp(), "binding_serveur_comp_cm", null, 0, 1, Port_CM_Serveur_Comp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(port_Serveur_Comp_CMEClass, Port_Serveur_Comp_CM.class, "Port_Serveur_Comp_CM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Serveur_Comp_CM_Binding_serveur_comp_cm(), this.getBinding_Serveur_Comp_CM(), this.getBinding_Serveur_Comp_CM_Port_serveur_comp_cm(), "binding_serveur_comp_cm", null, 0, 1, Port_Serveur_Comp_CM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binding_Serveur_Comp_CMEClass, Binding_Serveur_Comp_CM.class, "Binding_Serveur_Comp_CM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinding_Serveur_Comp_CM_Port_cm_serveur_comp(), this.getPort_CM_Serveur_Comp(), this.getPort_CM_Serveur_Comp_Binding_serveur_comp_cm(), "port_cm_serveur_comp", null, 0, 1, Binding_Serveur_Comp_CM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinding_Serveur_Comp_CM_Port_serveur_comp_cm(), this.getPort_Serveur_Comp_CM(), this.getPort_Serveur_Comp_CM_Binding_serveur_comp_cm(), "port_serveur_comp_cm", null, 0, 1, Binding_Serveur_Comp_CM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Client_serveurPackageImpl
