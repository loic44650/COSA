/**
 */
package client_serveur;

import cosa.CosaPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see client_serveur.Client_serveurFactory
 * @model kind="package"
 * @generated
 */
public interface Client_serveurPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "client_serveur";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/client_serveur";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Client_serveurPackage eINSTANCE = client_serveur.impl.Client_serveurPackageImpl.init();

	/**
	 * The meta object id for the '{@link client_serveur.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.ClientImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__INTERFACE = CosaPackage.COMPOSANT__INTERFACE;

	/**
	 * The feature id for the '<em><b>Proprietes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__PROPRIETES = CosaPackage.COMPOSANT__PROPRIETES;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__CONTRAINTES = CosaPackage.COMPOSANT__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Element architectural</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__ELEMENT_ARCHITECTURAL = CosaPackage.COMPOSANT__ELEMENT_ARCHITECTURAL;

	/**
	 * The feature id for the '<em><b>Interface composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__INTERFACE_COMPOSANT = CosaPackage.COMPOSANT__INTERFACE_COMPOSANT;

	/**
	 * The feature id for the '<em><b>Interface client</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__INTERFACE_CLIENT = CosaPackage.COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = CosaPackage.COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = CosaPackage.COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.RPCImpl <em>RPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.RPCImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getRPC()
	 * @generated
	 */
	int RPC = 1;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__INTERFACE = CosaPackage.CONNECTEUR__INTERFACE;

	/**
	 * The feature id for the '<em><b>Proprietes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__PROPRIETES = CosaPackage.CONNECTEUR__PROPRIETES;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__CONTRAINTES = CosaPackage.CONNECTEUR__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Element architectural</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__ELEMENT_ARCHITECTURAL = CosaPackage.CONNECTEUR__ELEMENT_ARCHITECTURAL;

	/**
	 * The feature id for the '<em><b>Glu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__GLU = CosaPackage.CONNECTEUR__GLU;

	/**
	 * The feature id for the '<em><b>Interface connecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__INTERFACE_CONNECTEUR = CosaPackage.CONNECTEUR__INTERFACE_CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Interface rpc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__INTERFACE_RPC = CosaPackage.CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_FEATURE_COUNT = CosaPackage.CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_OPERATION_COUNT = CosaPackage.CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Client_serveurImpl <em>Client serveur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Client_serveurImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getClient_serveur()
	 * @generated
	 */
	int CLIENT_SERVEUR = 2;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVEUR__INTERFACE = CosaPackage.CONFIGURATION__INTERFACE;

	/**
	 * The feature id for the '<em><b>Proprietes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVEUR__PROPRIETES = CosaPackage.CONFIGURATION__PROPRIETES;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVEUR__CONTRAINTES = CosaPackage.CONFIGURATION__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Element architectural</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVEUR__ELEMENT_ARCHITECTURAL = CosaPackage.CONFIGURATION__ELEMENT_ARCHITECTURAL;

	/**
	 * The feature id for the '<em><b>Interface composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVEUR__INTERFACE_COMPOSANT = CosaPackage.CONFIGURATION__INTERFACE_COMPOSANT;

	/**
	 * The feature id for the '<em><b>Connecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVEUR__CONNECTEUR = CosaPackage.CONFIGURATION__CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVEUR__COMPOSANT = CosaPackage.CONFIGURATION__COMPOSANT;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVEUR__BINDING = CosaPackage.CONFIGURATION__BINDING;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVEUR__ATTACHMENT = CosaPackage.CONFIGURATION__ATTACHMENT;

	/**
	 * The feature id for the '<em><b>Client</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVEUR__CLIENT = CosaPackage.CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rpc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVEUR__RPC = CosaPackage.CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Serveur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVEUR__SERVEUR = CosaPackage.CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Client serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVEUR_FEATURE_COUNT = CosaPackage.CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Client serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVEUR_OPERATION_COUNT = CosaPackage.CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Interface_ClientImpl <em>Interface Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Interface_ClientImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getInterface_Client()
	 * @generated
	 */
	int INTERFACE_CLIENT = 3;

	/**
	 * The feature id for the '<em><b>Port fourni client</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLIENT__PORT_FOURNI_CLIENT = 0;

	/**
	 * The feature id for the '<em><b>Port requis client</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLIENT__PORT_REQUIS_CLIENT = 1;

	/**
	 * The number of structural features of the '<em>Interface Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLIENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interface Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Interface_RPCImpl <em>Interface RPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Interface_RPCImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getInterface_RPC()
	 * @generated
	 */
	int INTERFACE_RPC = 4;

	/**
	 * The feature id for the '<em><b>Role fourni rpc client</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_RPC__ROLE_FOURNI_RPC_CLIENT = CosaPackage.INTERFACE_CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role requis rpc client</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_RPC__ROLE_REQUIS_RPC_CLIENT = CosaPackage.INTERFACE_CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role fourni rpc serveur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_RPC__ROLE_FOURNI_RPC_SERVEUR = CosaPackage.INTERFACE_CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role requis rpc serveur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_RPC__ROLE_REQUIS_RPC_SERVEUR = CosaPackage.INTERFACE_CONNECTEUR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interface RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_RPC_FEATURE_COUNT = CosaPackage.INTERFACE_CONNECTEUR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Interface RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_RPC_OPERATION_COUNT = CosaPackage.INTERFACE_CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.DataBaseImpl <em>Data Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.DataBaseImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getDataBase()
	 * @generated
	 */
	int DATA_BASE = 5;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__INTERFACE = CosaPackage.COMPOSANT__INTERFACE;

	/**
	 * The feature id for the '<em><b>Proprietes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__PROPRIETES = CosaPackage.COMPOSANT__PROPRIETES;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__CONTRAINTES = CosaPackage.COMPOSANT__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Element architectural</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__ELEMENT_ARCHITECTURAL = CosaPackage.COMPOSANT__ELEMENT_ARCHITECTURAL;

	/**
	 * The feature id for the '<em><b>Interface composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__INTERFACE_COMPOSANT = CosaPackage.COMPOSANT__INTERFACE_COMPOSANT;

	/**
	 * The feature id for the '<em><b>Interface database</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__INTERFACE_DATABASE = CosaPackage.COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_FEATURE_COUNT = CosaPackage.COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_OPERATION_COUNT = CosaPackage.COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Interface_DataBaseImpl <em>Interface Data Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Interface_DataBaseImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getInterface_DataBase()
	 * @generated
	 */
	int INTERFACE_DATA_BASE = 6;

	/**
	 * The feature id for the '<em><b>Port fourni db gamma</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DATA_BASE__PORT_FOURNI_DB_GAMMA = CosaPackage.INTERFACE_COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port requis gamma db</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DATA_BASE__PORT_REQUIS_GAMMA_DB = CosaPackage.INTERFACE_COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port fourni db beta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DATA_BASE__PORT_FOURNI_DB_BETA = CosaPackage.INTERFACE_COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Port requis beta db</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DATA_BASE__PORT_REQUIS_BETA_DB = CosaPackage.INTERFACE_COMPOSANT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interface Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DATA_BASE_FEATURE_COUNT = CosaPackage.INTERFACE_COMPOSANT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Interface Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DATA_BASE_OPERATION_COUNT = CosaPackage.INTERFACE_COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Serveur_CompImpl <em>Serveur Comp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Serveur_CompImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getServeur_Comp()
	 * @generated
	 */
	int SERVEUR_COMP = 7;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_COMP__INTERFACE = CosaPackage.COMPOSANT__INTERFACE;

	/**
	 * The feature id for the '<em><b>Proprietes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_COMP__PROPRIETES = CosaPackage.COMPOSANT__PROPRIETES;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_COMP__CONTRAINTES = CosaPackage.COMPOSANT__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Element architectural</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_COMP__ELEMENT_ARCHITECTURAL = CosaPackage.COMPOSANT__ELEMENT_ARCHITECTURAL;

	/**
	 * The feature id for the '<em><b>Interface composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_COMP__INTERFACE_COMPOSANT = CosaPackage.COMPOSANT__INTERFACE_COMPOSANT;

	/**
	 * The feature id for the '<em><b>Interface serveur comp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_COMP__INTERFACE_SERVEUR_COMP = CosaPackage.COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Serveur conf</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_COMP__SERVEUR_CONF = CosaPackage.COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Serveur Comp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_COMP_FEATURE_COUNT = CosaPackage.COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Serveur Comp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_COMP_OPERATION_COUNT = CosaPackage.COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Interface_Serveur_CompImpl <em>Interface Serveur Comp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Interface_Serveur_CompImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getInterface_Serveur_Comp()
	 * @generated
	 */
	int INTERFACE_SERVEUR_COMP = 8;

	/**
	 * The feature id for the '<em><b>Port requis serveur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SERVEUR_COMP__PORT_REQUIS_SERVEUR = CosaPackage.INTERFACE_COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port fourni serveur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SERVEUR_COMP__PORT_FOURNI_SERVEUR = CosaPackage.INTERFACE_COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port serveur comp serveur comf</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SERVEUR_COMP__PORT_SERVEUR_COMP_SERVEUR_COMF = CosaPackage.INTERFACE_COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Port serveur comp cm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SERVEUR_COMP__PORT_SERVEUR_COMP_CM = CosaPackage.INTERFACE_COMPOSANT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interface Serveur Comp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SERVEUR_COMP_FEATURE_COUNT = CosaPackage.INTERFACE_COMPOSANT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Interface Serveur Comp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SERVEUR_COMP_OPERATION_COUNT = CosaPackage.INTERFACE_COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Serveur_ConfImpl <em>Serveur Conf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Serveur_ConfImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getServeur_Conf()
	 * @generated
	 */
	int SERVEUR_CONF = 9;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_CONF__INTERFACE = CosaPackage.CONFIGURATION__INTERFACE;

	/**
	 * The feature id for the '<em><b>Proprietes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_CONF__PROPRIETES = CosaPackage.CONFIGURATION__PROPRIETES;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_CONF__CONTRAINTES = CosaPackage.CONFIGURATION__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Element architectural</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_CONF__ELEMENT_ARCHITECTURAL = CosaPackage.CONFIGURATION__ELEMENT_ARCHITECTURAL;

	/**
	 * The feature id for the '<em><b>Interface composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_CONF__INTERFACE_COMPOSANT = CosaPackage.CONFIGURATION__INTERFACE_COMPOSANT;

	/**
	 * The feature id for the '<em><b>Connecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_CONF__CONNECTEUR = CosaPackage.CONFIGURATION__CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_CONF__COMPOSANT = CosaPackage.CONFIGURATION__COMPOSANT;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_CONF__BINDING = CosaPackage.CONFIGURATION__BINDING;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_CONF__ATTACHMENT = CosaPackage.CONFIGURATION__ATTACHMENT;

	/**
	 * The feature id for the '<em><b>Database</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_CONF__DATABASE = CosaPackage.CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Security manager</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_CONF__SECURITY_MANAGER = CosaPackage.CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connection manager</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_CONF__CONNECTION_MANAGER = CosaPackage.CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gamma</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_CONF__GAMMA = CosaPackage.CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_CONF__ALPHA = CosaPackage.CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Beta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_CONF__BETA = CosaPackage.CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Interface serveur conf</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_CONF__INTERFACE_SERVEUR_CONF = CosaPackage.CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Serveur Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_CONF_FEATURE_COUNT = CosaPackage.CONFIGURATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Serveur Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_CONF_OPERATION_COUNT = CosaPackage.CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Port_Requis_ServeurImpl <em>Port Requis Serveur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Port_Requis_ServeurImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Requis_Serveur()
	 * @generated
	 */
	int PORT_REQUIS_SERVEUR = 10;

	/**
	 * The feature id for the '<em><b>Attachment comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_SERVEUR__ATTACHMENT_COMP = CosaPackage.PORT_REQUIS__ATTACHMENT_COMP;

	/**
	 * The feature id for the '<em><b>Binding conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_SERVEUR__BINDING_CONF = CosaPackage.PORT_REQUIS__BINDING_CONF;

	/**
	 * The feature id for the '<em><b>Binding comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_SERVEUR__BINDING_COMP = CosaPackage.PORT_REQUIS__BINDING_COMP;

	/**
	 * The feature id for the '<em><b>Attachment rpc serveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_SERVEUR__ATTACHMENT_RPC_SERVEUR = CosaPackage.PORT_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Requis Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_SERVEUR_FEATURE_COUNT = CosaPackage.PORT_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Requis Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_SERVEUR_OPERATION_COUNT = CosaPackage.PORT_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Port_Fourni_ServeurImpl <em>Port Fourni Serveur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Port_Fourni_ServeurImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Fourni_Serveur()
	 * @generated
	 */
	int PORT_FOURNI_SERVEUR = 11;

	/**
	 * The feature id for the '<em><b>Attachment comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_SERVEUR__ATTACHMENT_COMP = CosaPackage.PORT_FOURNI__ATTACHMENT_COMP;

	/**
	 * The feature id for the '<em><b>Binding conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_SERVEUR__BINDING_CONF = CosaPackage.PORT_FOURNI__BINDING_CONF;

	/**
	 * The feature id for the '<em><b>Binding comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_SERVEUR__BINDING_COMP = CosaPackage.PORT_FOURNI__BINDING_COMP;

	/**
	 * The feature id for the '<em><b>Attachement serveur rpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_SERVEUR__ATTACHEMENT_SERVEUR_RPC = CosaPackage.PORT_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Fourni Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_SERVEUR_FEATURE_COUNT = CosaPackage.PORT_FOURNI_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Fourni Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_SERVEUR_OPERATION_COUNT = CosaPackage.PORT_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Role_Requis_RPC_ClientImpl <em>Role Requis RPC Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Role_Requis_RPC_ClientImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Requis_RPC_Client()
	 * @generated
	 */
	int ROLE_REQUIS_RPC_CLIENT = 12;

	/**
	 * The feature id for the '<em><b>Attachment conn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_RPC_CLIENT__ATTACHMENT_CONN = CosaPackage.ROLE_REQUIS__ATTACHMENT_CONN;

	/**
	 * The feature id for the '<em><b>Attachment client rpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_RPC_CLIENT__ATTACHMENT_CLIENT_RPC = CosaPackage.ROLE_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Requis RPC Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_RPC_CLIENT_FEATURE_COUNT = CosaPackage.ROLE_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role Requis RPC Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_RPC_CLIENT_OPERATION_COUNT = CosaPackage.ROLE_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Role_Fourni_RPC_ClientImpl <em>Role Fourni RPC Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Role_Fourni_RPC_ClientImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Fourni_RPC_Client()
	 * @generated
	 */
	int ROLE_FOURNI_RPC_CLIENT = 13;

	/**
	 * The feature id for the '<em><b>Attachment conn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_RPC_CLIENT__ATTACHMENT_CONN = CosaPackage.ROLE_FOURNI__ATTACHMENT_CONN;

	/**
	 * The feature id for the '<em><b>Attachment rpc client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_RPC_CLIENT__ATTACHMENT_RPC_CLIENT = CosaPackage.ROLE_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Fourni RPC Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_RPC_CLIENT_FEATURE_COUNT = CosaPackage.ROLE_FOURNI_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role Fourni RPC Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_RPC_CLIENT_OPERATION_COUNT = CosaPackage.ROLE_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Port_Requis_ClientImpl <em>Port Requis Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Port_Requis_ClientImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Requis_Client()
	 * @generated
	 */
	int PORT_REQUIS_CLIENT = 14;

	/**
	 * The feature id for the '<em><b>Attachment comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_CLIENT__ATTACHMENT_COMP = CosaPackage.PORT_REQUIS__ATTACHMENT_COMP;

	/**
	 * The feature id for the '<em><b>Binding conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_CLIENT__BINDING_CONF = CosaPackage.PORT_REQUIS__BINDING_CONF;

	/**
	 * The feature id for the '<em><b>Binding comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_CLIENT__BINDING_COMP = CosaPackage.PORT_REQUIS__BINDING_COMP;

	/**
	 * The feature id for the '<em><b>Attachment rpc client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_CLIENT__ATTACHMENT_RPC_CLIENT = CosaPackage.PORT_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Requis Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_CLIENT_FEATURE_COUNT = CosaPackage.PORT_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Requis Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_CLIENT_OPERATION_COUNT = CosaPackage.PORT_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Port_Fourni_ClientImpl <em>Port Fourni Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Port_Fourni_ClientImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Fourni_Client()
	 * @generated
	 */
	int PORT_FOURNI_CLIENT = 15;

	/**
	 * The feature id for the '<em><b>Attachment comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_CLIENT__ATTACHMENT_COMP = CosaPackage.PORT_FOURNI__ATTACHMENT_COMP;

	/**
	 * The feature id for the '<em><b>Binding conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_CLIENT__BINDING_CONF = CosaPackage.PORT_FOURNI__BINDING_CONF;

	/**
	 * The feature id for the '<em><b>Binding comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_CLIENT__BINDING_COMP = CosaPackage.PORT_FOURNI__BINDING_COMP;

	/**
	 * The feature id for the '<em><b>Attachment client rpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_CLIENT__ATTACHMENT_CLIENT_RPC = CosaPackage.PORT_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Fourni Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_CLIENT_FEATURE_COUNT = CosaPackage.PORT_FOURNI_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Fourni Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_CLIENT_OPERATION_COUNT = CosaPackage.PORT_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Attachment_Client_RPCImpl <em>Attachment Client RPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Attachment_Client_RPCImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_Client_RPC()
	 * @generated
	 */
	int ATTACHMENT_CLIENT_RPC = 16;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CLIENT_RPC__ROLE = CosaPackage.ATTACHMENT__ROLE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CLIENT_RPC__PORT = CosaPackage.ATTACHMENT__PORT;

	/**
	 * The feature id for the '<em><b>Port fourni client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CLIENT_RPC__PORT_FOURNI_CLIENT = CosaPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role requis rpc client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CLIENT_RPC__ROLE_REQUIS_RPC_CLIENT = CosaPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment Client RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CLIENT_RPC_FEATURE_COUNT = CosaPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attachment Client RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CLIENT_RPC_OPERATION_COUNT = CosaPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Attachment_RPC_ClientImpl <em>Attachment RPC Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Attachment_RPC_ClientImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_RPC_Client()
	 * @generated
	 */
	int ATTACHMENT_RPC_CLIENT = 17;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_CLIENT__ROLE = CosaPackage.ATTACHMENT__ROLE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_CLIENT__PORT = CosaPackage.ATTACHMENT__PORT;

	/**
	 * The feature id for the '<em><b>Port requis client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_CLIENT__PORT_REQUIS_CLIENT = CosaPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role fourni rpc client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_CLIENT__ROLE_FOURNI_RPC_CLIENT = CosaPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment RPC Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_CLIENT_FEATURE_COUNT = CosaPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attachment RPC Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_CLIENT_OPERATION_COUNT = CosaPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Role_Requis_RPC_ServeurImpl <em>Role Requis RPC Serveur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Role_Requis_RPC_ServeurImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Requis_RPC_Serveur()
	 * @generated
	 */
	int ROLE_REQUIS_RPC_SERVEUR = 18;

	/**
	 * The feature id for the '<em><b>Attachment conn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_RPC_SERVEUR__ATTACHMENT_CONN = CosaPackage.ROLE_REQUIS__ATTACHMENT_CONN;

	/**
	 * The feature id for the '<em><b>Attachement serveur rpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_RPC_SERVEUR__ATTACHEMENT_SERVEUR_RPC = CosaPackage.ROLE_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Requis RPC Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_RPC_SERVEUR_FEATURE_COUNT = CosaPackage.ROLE_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role Requis RPC Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_RPC_SERVEUR_OPERATION_COUNT = CosaPackage.ROLE_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Role_Fourni_RPC_ServeurImpl <em>Role Fourni RPC Serveur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Role_Fourni_RPC_ServeurImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Fourni_RPC_Serveur()
	 * @generated
	 */
	int ROLE_FOURNI_RPC_SERVEUR = 19;

	/**
	 * The feature id for the '<em><b>Attachment conn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_RPC_SERVEUR__ATTACHMENT_CONN = CosaPackage.ROLE_FOURNI__ATTACHMENT_CONN;

	/**
	 * The feature id for the '<em><b>Attachment rpc serveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_RPC_SERVEUR__ATTACHMENT_RPC_SERVEUR = CosaPackage.ROLE_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Fourni RPC Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_RPC_SERVEUR_FEATURE_COUNT = CosaPackage.ROLE_FOURNI_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role Fourni RPC Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_RPC_SERVEUR_OPERATION_COUNT = CosaPackage.ROLE_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Attachment_RPC_ServeurImpl <em>Attachment RPC Serveur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Attachment_RPC_ServeurImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_RPC_Serveur()
	 * @generated
	 */
	int ATTACHMENT_RPC_SERVEUR = 20;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_SERVEUR__ROLE = CosaPackage.ATTACHMENT__ROLE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_SERVEUR__PORT = CosaPackage.ATTACHMENT__PORT;

	/**
	 * The feature id for the '<em><b>Role fourni rpc serveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_SERVEUR__ROLE_FOURNI_RPC_SERVEUR = CosaPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port requis serveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_SERVEUR__PORT_REQUIS_SERVEUR = CosaPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment RPC Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_SERVEUR_FEATURE_COUNT = CosaPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attachment RPC Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_SERVEUR_OPERATION_COUNT = CosaPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Attachement_Serveur_RPCImpl <em>Attachement Serveur RPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Attachement_Serveur_RPCImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachement_Serveur_RPC()
	 * @generated
	 */
	int ATTACHEMENT_SERVEUR_RPC = 21;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_SERVEUR_RPC__ROLE = CosaPackage.ATTACHMENT__ROLE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_SERVEUR_RPC__PORT = CosaPackage.ATTACHMENT__PORT;

	/**
	 * The feature id for the '<em><b>Role requis rpc serveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_SERVEUR_RPC__ROLE_REQUIS_RPC_SERVEUR = CosaPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port fourni serveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_SERVEUR_RPC__PORT_FOURNI_SERVEUR = CosaPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachement Serveur RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_SERVEUR_RPC_FEATURE_COUNT = CosaPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attachement Serveur RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_SERVEUR_RPC_OPERATION_COUNT = CosaPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Security_ManagerImpl <em>Security Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Security_ManagerImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getSecurity_Manager()
	 * @generated
	 */
	int SECURITY_MANAGER = 22;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER__INTERFACE = CosaPackage.COMPOSANT__INTERFACE;

	/**
	 * The feature id for the '<em><b>Proprietes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER__PROPRIETES = CosaPackage.COMPOSANT__PROPRIETES;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER__CONTRAINTES = CosaPackage.COMPOSANT__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Element architectural</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER__ELEMENT_ARCHITECTURAL = CosaPackage.COMPOSANT__ELEMENT_ARCHITECTURAL;

	/**
	 * The feature id for the '<em><b>Interface composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER__INTERFACE_COMPOSANT = CosaPackage.COMPOSANT__INTERFACE_COMPOSANT;

	/**
	 * The feature id for the '<em><b>Interface security manager</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER__INTERFACE_SECURITY_MANAGER = CosaPackage.COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Security Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER_FEATURE_COUNT = CosaPackage.COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Security Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER_OPERATION_COUNT = CosaPackage.COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Connection_ManagerImpl <em>Connection Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Connection_ManagerImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getConnection_Manager()
	 * @generated
	 */
	int CONNECTION_MANAGER = 23;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__INTERFACE = CosaPackage.COMPOSANT__INTERFACE;

	/**
	 * The feature id for the '<em><b>Proprietes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__PROPRIETES = CosaPackage.COMPOSANT__PROPRIETES;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__CONTRAINTES = CosaPackage.COMPOSANT__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Element architectural</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__ELEMENT_ARCHITECTURAL = CosaPackage.COMPOSANT__ELEMENT_ARCHITECTURAL;

	/**
	 * The feature id for the '<em><b>Interface composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__INTERFACE_COMPOSANT = CosaPackage.COMPOSANT__INTERFACE_COMPOSANT;

	/**
	 * The feature id for the '<em><b>Interface connection manager</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__INTERFACE_CONNECTION_MANAGER = CosaPackage.COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connection Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER_FEATURE_COUNT = CosaPackage.COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Connection Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER_OPERATION_COUNT = CosaPackage.COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Interface_Connection_ManagerImpl <em>Interface Connection Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Interface_Connection_ManagerImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getInterface_Connection_Manager()
	 * @generated
	 */
	int INTERFACE_CONNECTION_MANAGER = 24;

	/**
	 * The feature id for the '<em><b>Port fourni cm gamma</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTION_MANAGER__PORT_FOURNI_CM_GAMMA = CosaPackage.INTERFACE_COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port requis gamma cm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTION_MANAGER__PORT_REQUIS_GAMMA_CM = CosaPackage.INTERFACE_COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port fourni cm alpha</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTION_MANAGER__PORT_FOURNI_CM_ALPHA = CosaPackage.INTERFACE_COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Port requis alpha cm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTION_MANAGER__PORT_REQUIS_ALPHA_CM = CosaPackage.INTERFACE_COMPOSANT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Port cm serveur comp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTION_MANAGER__PORT_CM_SERVEUR_COMP = CosaPackage.INTERFACE_COMPOSANT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Interface Connection Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTION_MANAGER_FEATURE_COUNT = CosaPackage.INTERFACE_COMPOSANT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Interface Connection Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTION_MANAGER_OPERATION_COUNT = CosaPackage.INTERFACE_COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Interface_Security_ManagerImpl <em>Interface Security Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Interface_Security_ManagerImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getInterface_Security_Manager()
	 * @generated
	 */
	int INTERFACE_SECURITY_MANAGER = 25;

	/**
	 * The feature id for the '<em><b>Port fourni sm beta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SECURITY_MANAGER__PORT_FOURNI_SM_BETA = CosaPackage.INTERFACE_COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port requis beta sm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SECURITY_MANAGER__PORT_REQUIS_BETA_SM = CosaPackage.INTERFACE_COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port fourni sm alpha</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SECURITY_MANAGER__PORT_FOURNI_SM_ALPHA = CosaPackage.INTERFACE_COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Port requis alpha sm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SECURITY_MANAGER__PORT_REQUIS_ALPHA_SM = CosaPackage.INTERFACE_COMPOSANT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interface Security Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SECURITY_MANAGER_FEATURE_COUNT = CosaPackage.INTERFACE_COMPOSANT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Interface Security Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SECURITY_MANAGER_OPERATION_COUNT = CosaPackage.INTERFACE_COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Port_Requis_Alpha_CMImpl <em>Port Requis Alpha CM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Port_Requis_Alpha_CMImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Requis_Alpha_CM()
	 * @generated
	 */
	int PORT_REQUIS_ALPHA_CM = 26;

	/**
	 * The feature id for the '<em><b>Attachment comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_ALPHA_CM__ATTACHMENT_COMP = CosaPackage.PORT_REQUIS__ATTACHMENT_COMP;

	/**
	 * The feature id for the '<em><b>Binding conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_ALPHA_CM__BINDING_CONF = CosaPackage.PORT_REQUIS__BINDING_CONF;

	/**
	 * The feature id for the '<em><b>Binding comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_ALPHA_CM__BINDING_COMP = CosaPackage.PORT_REQUIS__BINDING_COMP;

	/**
	 * The feature id for the '<em><b>Attachment alpha cm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_ALPHA_CM__ATTACHMENT_ALPHA_CM = CosaPackage.PORT_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Requis Alpha CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_ALPHA_CM_FEATURE_COUNT = CosaPackage.PORT_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Requis Alpha CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_ALPHA_CM_OPERATION_COUNT = CosaPackage.PORT_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Port_Fourni_CM_AlphaImpl <em>Port Fourni CM Alpha</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Port_Fourni_CM_AlphaImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Fourni_CM_Alpha()
	 * @generated
	 */
	int PORT_FOURNI_CM_ALPHA = 27;

	/**
	 * The feature id for the '<em><b>Attachment comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_CM_ALPHA__ATTACHMENT_COMP = CosaPackage.PORT_FOURNI__ATTACHMENT_COMP;

	/**
	 * The feature id for the '<em><b>Binding conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_CM_ALPHA__BINDING_CONF = CosaPackage.PORT_FOURNI__BINDING_CONF;

	/**
	 * The feature id for the '<em><b>Binding comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_CM_ALPHA__BINDING_COMP = CosaPackage.PORT_FOURNI__BINDING_COMP;

	/**
	 * The feature id for the '<em><b>Attachment cm alpha</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_CM_ALPHA__ATTACHMENT_CM_ALPHA = CosaPackage.PORT_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Fourni CM Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_CM_ALPHA_FEATURE_COUNT = CosaPackage.PORT_FOURNI_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Fourni CM Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_CM_ALPHA_OPERATION_COUNT = CosaPackage.PORT_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Port_Fourni_CM_GammaImpl <em>Port Fourni CM Gamma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Port_Fourni_CM_GammaImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Fourni_CM_Gamma()
	 * @generated
	 */
	int PORT_FOURNI_CM_GAMMA = 28;

	/**
	 * The feature id for the '<em><b>Attachment comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_CM_GAMMA__ATTACHMENT_COMP = CosaPackage.PORT_FOURNI__ATTACHMENT_COMP;

	/**
	 * The feature id for the '<em><b>Binding conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_CM_GAMMA__BINDING_CONF = CosaPackage.PORT_FOURNI__BINDING_CONF;

	/**
	 * The feature id for the '<em><b>Binding comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_CM_GAMMA__BINDING_COMP = CosaPackage.PORT_FOURNI__BINDING_COMP;

	/**
	 * The feature id for the '<em><b>Attachment cm gamma</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_CM_GAMMA__ATTACHMENT_CM_GAMMA = CosaPackage.PORT_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Fourni CM Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_CM_GAMMA_FEATURE_COUNT = CosaPackage.PORT_FOURNI_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Fourni CM Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_CM_GAMMA_OPERATION_COUNT = CosaPackage.PORT_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Port_Requis_Gamma_CMImpl <em>Port Requis Gamma CM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Port_Requis_Gamma_CMImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Requis_Gamma_CM()
	 * @generated
	 */
	int PORT_REQUIS_GAMMA_CM = 29;

	/**
	 * The feature id for the '<em><b>Attachment comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_GAMMA_CM__ATTACHMENT_COMP = CosaPackage.PORT_REQUIS__ATTACHMENT_COMP;

	/**
	 * The feature id for the '<em><b>Binding conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_GAMMA_CM__BINDING_CONF = CosaPackage.PORT_REQUIS__BINDING_CONF;

	/**
	 * The feature id for the '<em><b>Binding comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_GAMMA_CM__BINDING_COMP = CosaPackage.PORT_REQUIS__BINDING_COMP;

	/**
	 * The feature id for the '<em><b>Attachment gamma cm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_GAMMA_CM__ATTACHMENT_GAMMA_CM = CosaPackage.PORT_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Requis Gamma CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_GAMMA_CM_FEATURE_COUNT = CosaPackage.PORT_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Requis Gamma CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_GAMMA_CM_OPERATION_COUNT = CosaPackage.PORT_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Port_Fourni_DB_GammaImpl <em>Port Fourni DB Gamma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Port_Fourni_DB_GammaImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Fourni_DB_Gamma()
	 * @generated
	 */
	int PORT_FOURNI_DB_GAMMA = 30;

	/**
	 * The feature id for the '<em><b>Attachment comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_DB_GAMMA__ATTACHMENT_COMP = CosaPackage.PORT_FOURNI__ATTACHMENT_COMP;

	/**
	 * The feature id for the '<em><b>Binding conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_DB_GAMMA__BINDING_CONF = CosaPackage.PORT_FOURNI__BINDING_CONF;

	/**
	 * The feature id for the '<em><b>Binding comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_DB_GAMMA__BINDING_COMP = CosaPackage.PORT_FOURNI__BINDING_COMP;

	/**
	 * The feature id for the '<em><b>Attachment db gamma</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_DB_GAMMA__ATTACHMENT_DB_GAMMA = CosaPackage.PORT_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Fourni DB Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_DB_GAMMA_FEATURE_COUNT = CosaPackage.PORT_FOURNI_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Fourni DB Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_DB_GAMMA_OPERATION_COUNT = CosaPackage.PORT_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Port_Requis_Gamma_DBImpl <em>Port Requis Gamma DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Port_Requis_Gamma_DBImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Requis_Gamma_DB()
	 * @generated
	 */
	int PORT_REQUIS_GAMMA_DB = 31;

	/**
	 * The feature id for the '<em><b>Attachment comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_GAMMA_DB__ATTACHMENT_COMP = CosaPackage.PORT_REQUIS__ATTACHMENT_COMP;

	/**
	 * The feature id for the '<em><b>Binding conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_GAMMA_DB__BINDING_CONF = CosaPackage.PORT_REQUIS__BINDING_CONF;

	/**
	 * The feature id for the '<em><b>Binding comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_GAMMA_DB__BINDING_COMP = CosaPackage.PORT_REQUIS__BINDING_COMP;

	/**
	 * The feature id for the '<em><b>Attachment gamma db</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_GAMMA_DB__ATTACHMENT_GAMMA_DB = CosaPackage.PORT_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Requis Gamma DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_GAMMA_DB_FEATURE_COUNT = CosaPackage.PORT_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Requis Gamma DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_GAMMA_DB_OPERATION_COUNT = CosaPackage.PORT_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Port_Fourni_DB_BetaImpl <em>Port Fourni DB Beta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Port_Fourni_DB_BetaImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Fourni_DB_Beta()
	 * @generated
	 */
	int PORT_FOURNI_DB_BETA = 32;

	/**
	 * The feature id for the '<em><b>Attachment comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_DB_BETA__ATTACHMENT_COMP = CosaPackage.PORT_FOURNI__ATTACHMENT_COMP;

	/**
	 * The feature id for the '<em><b>Binding conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_DB_BETA__BINDING_CONF = CosaPackage.PORT_FOURNI__BINDING_CONF;

	/**
	 * The feature id for the '<em><b>Binding comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_DB_BETA__BINDING_COMP = CosaPackage.PORT_FOURNI__BINDING_COMP;

	/**
	 * The feature id for the '<em><b>Attachment db beta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_DB_BETA__ATTACHMENT_DB_BETA = CosaPackage.PORT_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Fourni DB Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_DB_BETA_FEATURE_COUNT = CosaPackage.PORT_FOURNI_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Fourni DB Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_DB_BETA_OPERATION_COUNT = CosaPackage.PORT_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Port_Requis_Beta_DBImpl <em>Port Requis Beta DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Port_Requis_Beta_DBImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Requis_Beta_DB()
	 * @generated
	 */
	int PORT_REQUIS_BETA_DB = 33;

	/**
	 * The feature id for the '<em><b>Attachment comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_BETA_DB__ATTACHMENT_COMP = CosaPackage.PORT_REQUIS__ATTACHMENT_COMP;

	/**
	 * The feature id for the '<em><b>Binding conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_BETA_DB__BINDING_CONF = CosaPackage.PORT_REQUIS__BINDING_CONF;

	/**
	 * The feature id for the '<em><b>Binding comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_BETA_DB__BINDING_COMP = CosaPackage.PORT_REQUIS__BINDING_COMP;

	/**
	 * The feature id for the '<em><b>Attachment beta db</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_BETA_DB__ATTACHMENT_BETA_DB = CosaPackage.PORT_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Requis Beta DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_BETA_DB_FEATURE_COUNT = CosaPackage.PORT_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Requis Beta DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_BETA_DB_OPERATION_COUNT = CosaPackage.PORT_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Port_Fourni_SM_AlphaImpl <em>Port Fourni SM Alpha</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Port_Fourni_SM_AlphaImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Fourni_SM_Alpha()
	 * @generated
	 */
	int PORT_FOURNI_SM_ALPHA = 34;

	/**
	 * The feature id for the '<em><b>Attachment comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_SM_ALPHA__ATTACHMENT_COMP = CosaPackage.PORT_FOURNI__ATTACHMENT_COMP;

	/**
	 * The feature id for the '<em><b>Binding conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_SM_ALPHA__BINDING_CONF = CosaPackage.PORT_FOURNI__BINDING_CONF;

	/**
	 * The feature id for the '<em><b>Binding comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_SM_ALPHA__BINDING_COMP = CosaPackage.PORT_FOURNI__BINDING_COMP;

	/**
	 * The feature id for the '<em><b>Attachment sm alpha</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_SM_ALPHA__ATTACHMENT_SM_ALPHA = CosaPackage.PORT_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Fourni SM Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_SM_ALPHA_FEATURE_COUNT = CosaPackage.PORT_FOURNI_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Fourni SM Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_SM_ALPHA_OPERATION_COUNT = CosaPackage.PORT_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Port_Requis_Alpha_SMImpl <em>Port Requis Alpha SM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Port_Requis_Alpha_SMImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Requis_Alpha_SM()
	 * @generated
	 */
	int PORT_REQUIS_ALPHA_SM = 35;

	/**
	 * The feature id for the '<em><b>Attachment comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_ALPHA_SM__ATTACHMENT_COMP = CosaPackage.PORT_REQUIS__ATTACHMENT_COMP;

	/**
	 * The feature id for the '<em><b>Binding conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_ALPHA_SM__BINDING_CONF = CosaPackage.PORT_REQUIS__BINDING_CONF;

	/**
	 * The feature id for the '<em><b>Binding comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_ALPHA_SM__BINDING_COMP = CosaPackage.PORT_REQUIS__BINDING_COMP;

	/**
	 * The feature id for the '<em><b>Attachment alpha sm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_ALPHA_SM__ATTACHMENT_ALPHA_SM = CosaPackage.PORT_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Requis Alpha SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_ALPHA_SM_FEATURE_COUNT = CosaPackage.PORT_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Requis Alpha SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_ALPHA_SM_OPERATION_COUNT = CosaPackage.PORT_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Port_Fourni_SM_BetaImpl <em>Port Fourni SM Beta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Port_Fourni_SM_BetaImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Fourni_SM_Beta()
	 * @generated
	 */
	int PORT_FOURNI_SM_BETA = 36;

	/**
	 * The feature id for the '<em><b>Attachment comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_SM_BETA__ATTACHMENT_COMP = CosaPackage.PORT_FOURNI__ATTACHMENT_COMP;

	/**
	 * The feature id for the '<em><b>Binding conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_SM_BETA__BINDING_CONF = CosaPackage.PORT_FOURNI__BINDING_CONF;

	/**
	 * The feature id for the '<em><b>Binding comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_SM_BETA__BINDING_COMP = CosaPackage.PORT_FOURNI__BINDING_COMP;

	/**
	 * The feature id for the '<em><b>Attachment sm beta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_SM_BETA__ATTACHMENT_SM_BETA = CosaPackage.PORT_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Fourni SM Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_SM_BETA_FEATURE_COUNT = CosaPackage.PORT_FOURNI_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Fourni SM Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_SM_BETA_OPERATION_COUNT = CosaPackage.PORT_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Port_Requis_Beta_SMImpl <em>Port Requis Beta SM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Port_Requis_Beta_SMImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Requis_Beta_SM()
	 * @generated
	 */
	int PORT_REQUIS_BETA_SM = 37;

	/**
	 * The feature id for the '<em><b>Attachment comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_BETA_SM__ATTACHMENT_COMP = CosaPackage.PORT_REQUIS__ATTACHMENT_COMP;

	/**
	 * The feature id for the '<em><b>Binding conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_BETA_SM__BINDING_CONF = CosaPackage.PORT_REQUIS__BINDING_CONF;

	/**
	 * The feature id for the '<em><b>Binding comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_BETA_SM__BINDING_COMP = CosaPackage.PORT_REQUIS__BINDING_COMP;

	/**
	 * The feature id for the '<em><b>Attachment beta sm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_BETA_SM__ATTACHMENT_BETA_SM = CosaPackage.PORT_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Requis Beta SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_BETA_SM_FEATURE_COUNT = CosaPackage.PORT_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Requis Beta SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_BETA_SM_OPERATION_COUNT = CosaPackage.PORT_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.BetaImpl <em>Beta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.BetaImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getBeta()
	 * @generated
	 */
	int BETA = 38;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA__INTERFACE = CosaPackage.CONNECTEUR__INTERFACE;

	/**
	 * The feature id for the '<em><b>Proprietes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA__PROPRIETES = CosaPackage.CONNECTEUR__PROPRIETES;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA__CONTRAINTES = CosaPackage.CONNECTEUR__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Element architectural</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA__ELEMENT_ARCHITECTURAL = CosaPackage.CONNECTEUR__ELEMENT_ARCHITECTURAL;

	/**
	 * The feature id for the '<em><b>Glu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA__GLU = CosaPackage.CONNECTEUR__GLU;

	/**
	 * The feature id for the '<em><b>Interface connecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA__INTERFACE_CONNECTEUR = CosaPackage.CONNECTEUR__INTERFACE_CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Interface beta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA__INTERFACE_BETA = CosaPackage.CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA_FEATURE_COUNT = CosaPackage.CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETA_OPERATION_COUNT = CosaPackage.CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.AlphaImpl <em>Alpha</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.AlphaImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getAlpha()
	 * @generated
	 */
	int ALPHA = 39;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA__INTERFACE = CosaPackage.CONNECTEUR__INTERFACE;

	/**
	 * The feature id for the '<em><b>Proprietes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA__PROPRIETES = CosaPackage.CONNECTEUR__PROPRIETES;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA__CONTRAINTES = CosaPackage.CONNECTEUR__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Element architectural</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA__ELEMENT_ARCHITECTURAL = CosaPackage.CONNECTEUR__ELEMENT_ARCHITECTURAL;

	/**
	 * The feature id for the '<em><b>Glu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA__GLU = CosaPackage.CONNECTEUR__GLU;

	/**
	 * The feature id for the '<em><b>Interface connecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA__INTERFACE_CONNECTEUR = CosaPackage.CONNECTEUR__INTERFACE_CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Interface alpha</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA__INTERFACE_ALPHA = CosaPackage.CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_FEATURE_COUNT = CosaPackage.CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_OPERATION_COUNT = CosaPackage.CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.GammaImpl <em>Gamma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.GammaImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getGamma()
	 * @generated
	 */
	int GAMMA = 40;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA__INTERFACE = CosaPackage.CONNECTEUR__INTERFACE;

	/**
	 * The feature id for the '<em><b>Proprietes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA__PROPRIETES = CosaPackage.CONNECTEUR__PROPRIETES;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA__CONTRAINTES = CosaPackage.CONNECTEUR__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Element architectural</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA__ELEMENT_ARCHITECTURAL = CosaPackage.CONNECTEUR__ELEMENT_ARCHITECTURAL;

	/**
	 * The feature id for the '<em><b>Glu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA__GLU = CosaPackage.CONNECTEUR__GLU;

	/**
	 * The feature id for the '<em><b>Interface connecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA__INTERFACE_CONNECTEUR = CosaPackage.CONNECTEUR__INTERFACE_CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Interface gamma</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA__INTERFACE_GAMMA = CosaPackage.CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA_FEATURE_COUNT = CosaPackage.CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMMA_OPERATION_COUNT = CosaPackage.CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Interface_BetaImpl <em>Interface Beta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Interface_BetaImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getInterface_Beta()
	 * @generated
	 */
	int INTERFACE_BETA = 41;

	/**
	 * The feature id for the '<em><b>Role fourni beta sm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BETA__ROLE_FOURNI_BETA_SM = CosaPackage.INTERFACE_CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role requis sm beta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BETA__ROLE_REQUIS_SM_BETA = CosaPackage.INTERFACE_CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role requis db beta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BETA__ROLE_REQUIS_DB_BETA = CosaPackage.INTERFACE_CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role fourni beta db</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BETA__ROLE_FOURNI_BETA_DB = CosaPackage.INTERFACE_CONNECTEUR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interface Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BETA_FEATURE_COUNT = CosaPackage.INTERFACE_CONNECTEUR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Interface Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BETA_OPERATION_COUNT = CosaPackage.INTERFACE_CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Interface_AlphaImpl <em>Interface Alpha</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Interface_AlphaImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getInterface_Alpha()
	 * @generated
	 */
	int INTERFACE_ALPHA = 42;

	/**
	 * The feature id for the '<em><b>Role fourni alpha sm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ALPHA__ROLE_FOURNI_ALPHA_SM = CosaPackage.INTERFACE_CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role requis sm alpha</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ALPHA__ROLE_REQUIS_SM_ALPHA = CosaPackage.INTERFACE_CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role requis cm alpha</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ALPHA__ROLE_REQUIS_CM_ALPHA = CosaPackage.INTERFACE_CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role fourni alpha cm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ALPHA__ROLE_FOURNI_ALPHA_CM = CosaPackage.INTERFACE_CONNECTEUR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interface Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ALPHA_FEATURE_COUNT = CosaPackage.INTERFACE_CONNECTEUR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Interface Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ALPHA_OPERATION_COUNT = CosaPackage.INTERFACE_CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Interface_GammaImpl <em>Interface Gamma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Interface_GammaImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getInterface_Gamma()
	 * @generated
	 */
	int INTERFACE_GAMMA = 43;

	/**
	 * The feature id for the '<em><b>Role requis cm gamma</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_GAMMA__ROLE_REQUIS_CM_GAMMA = CosaPackage.INTERFACE_CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role fourni gamma cm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_GAMMA__ROLE_FOURNI_GAMMA_CM = CosaPackage.INTERFACE_CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role requis db gamma</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_GAMMA__ROLE_REQUIS_DB_GAMMA = CosaPackage.INTERFACE_CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role fourni gamma db</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_GAMMA__ROLE_FOURNI_GAMMA_DB = CosaPackage.INTERFACE_CONNECTEUR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interface Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_GAMMA_FEATURE_COUNT = CosaPackage.INTERFACE_CONNECTEUR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Interface Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_GAMMA_OPERATION_COUNT = CosaPackage.INTERFACE_CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Role_Requis_SM_BetaImpl <em>Role Requis SM Beta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Role_Requis_SM_BetaImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Requis_SM_Beta()
	 * @generated
	 */
	int ROLE_REQUIS_SM_BETA = 44;

	/**
	 * The feature id for the '<em><b>Attachment conn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_SM_BETA__ATTACHMENT_CONN = CosaPackage.ROLE_REQUIS__ATTACHMENT_CONN;

	/**
	 * The feature id for the '<em><b>Attachment sm beta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_SM_BETA__ATTACHMENT_SM_BETA = CosaPackage.ROLE_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Requis SM Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_SM_BETA_FEATURE_COUNT = CosaPackage.ROLE_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role Requis SM Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_SM_BETA_OPERATION_COUNT = CosaPackage.ROLE_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Role_Fourni_Beta_SMImpl <em>Role Fourni Beta SM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Role_Fourni_Beta_SMImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Fourni_Beta_SM()
	 * @generated
	 */
	int ROLE_FOURNI_BETA_SM = 45;

	/**
	 * The feature id for the '<em><b>Attachment conn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_BETA_SM__ATTACHMENT_CONN = CosaPackage.ROLE_FOURNI__ATTACHMENT_CONN;

	/**
	 * The feature id for the '<em><b>Attachment beta sm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_BETA_SM__ATTACHMENT_BETA_SM = CosaPackage.ROLE_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Fourni Beta SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_BETA_SM_FEATURE_COUNT = CosaPackage.ROLE_FOURNI_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role Fourni Beta SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_BETA_SM_OPERATION_COUNT = CosaPackage.ROLE_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Role_Requis_DB_BetaImpl <em>Role Requis DB Beta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Role_Requis_DB_BetaImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Requis_DB_Beta()
	 * @generated
	 */
	int ROLE_REQUIS_DB_BETA = 46;

	/**
	 * The feature id for the '<em><b>Attachment conn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_DB_BETA__ATTACHMENT_CONN = CosaPackage.ROLE_REQUIS__ATTACHMENT_CONN;

	/**
	 * The feature id for the '<em><b>Attachment db beta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_DB_BETA__ATTACHMENT_DB_BETA = CosaPackage.ROLE_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Requis DB Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_DB_BETA_FEATURE_COUNT = CosaPackage.ROLE_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role Requis DB Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_DB_BETA_OPERATION_COUNT = CosaPackage.ROLE_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Role_Fourni_Beta_DBImpl <em>Role Fourni Beta DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Role_Fourni_Beta_DBImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Fourni_Beta_DB()
	 * @generated
	 */
	int ROLE_FOURNI_BETA_DB = 47;

	/**
	 * The feature id for the '<em><b>Attachment conn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_BETA_DB__ATTACHMENT_CONN = CosaPackage.ROLE_FOURNI__ATTACHMENT_CONN;

	/**
	 * The feature id for the '<em><b>Attachment beta db</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_BETA_DB__ATTACHMENT_BETA_DB = CosaPackage.ROLE_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Fourni Beta DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_BETA_DB_FEATURE_COUNT = CosaPackage.ROLE_FOURNI_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role Fourni Beta DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_BETA_DB_OPERATION_COUNT = CosaPackage.ROLE_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Role_Fourni_Gamma_CMImpl <em>Role Fourni Gamma CM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Role_Fourni_Gamma_CMImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Fourni_Gamma_CM()
	 * @generated
	 */
	int ROLE_FOURNI_GAMMA_CM = 48;

	/**
	 * The feature id for the '<em><b>Attachment conn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_GAMMA_CM__ATTACHMENT_CONN = CosaPackage.ROLE_FOURNI__ATTACHMENT_CONN;

	/**
	 * The feature id for the '<em><b>Attachment gamma cm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_GAMMA_CM__ATTACHMENT_GAMMA_CM = CosaPackage.ROLE_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Fourni Gamma CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_GAMMA_CM_FEATURE_COUNT = CosaPackage.ROLE_FOURNI_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role Fourni Gamma CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_GAMMA_CM_OPERATION_COUNT = CosaPackage.ROLE_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Role_Requis_CM_GammaImpl <em>Role Requis CM Gamma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Role_Requis_CM_GammaImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Requis_CM_Gamma()
	 * @generated
	 */
	int ROLE_REQUIS_CM_GAMMA = 49;

	/**
	 * The feature id for the '<em><b>Attachment conn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_CM_GAMMA__ATTACHMENT_CONN = CosaPackage.ROLE_REQUIS__ATTACHMENT_CONN;

	/**
	 * The feature id for the '<em><b>Attachment cm gamma</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_CM_GAMMA__ATTACHMENT_CM_GAMMA = CosaPackage.ROLE_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Requis CM Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_CM_GAMMA_FEATURE_COUNT = CosaPackage.ROLE_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role Requis CM Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_CM_GAMMA_OPERATION_COUNT = CosaPackage.ROLE_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Role_Requis_DB_GammaImpl <em>Role Requis DB Gamma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Role_Requis_DB_GammaImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Requis_DB_Gamma()
	 * @generated
	 */
	int ROLE_REQUIS_DB_GAMMA = 50;

	/**
	 * The feature id for the '<em><b>Attachment conn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_DB_GAMMA__ATTACHMENT_CONN = CosaPackage.ROLE_REQUIS__ATTACHMENT_CONN;

	/**
	 * The feature id for the '<em><b>Attachment db gamma</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_DB_GAMMA__ATTACHMENT_DB_GAMMA = CosaPackage.ROLE_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Requis DB Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_DB_GAMMA_FEATURE_COUNT = CosaPackage.ROLE_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role Requis DB Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_DB_GAMMA_OPERATION_COUNT = CosaPackage.ROLE_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Role_Fourni_Gamma_DBImpl <em>Role Fourni Gamma DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Role_Fourni_Gamma_DBImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Fourni_Gamma_DB()
	 * @generated
	 */
	int ROLE_FOURNI_GAMMA_DB = 51;

	/**
	 * The feature id for the '<em><b>Attachment conn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_GAMMA_DB__ATTACHMENT_CONN = CosaPackage.ROLE_FOURNI__ATTACHMENT_CONN;

	/**
	 * The feature id for the '<em><b>Attachment gamma db</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_GAMMA_DB__ATTACHMENT_GAMMA_DB = CosaPackage.ROLE_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Fourni Gamma DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_GAMMA_DB_FEATURE_COUNT = CosaPackage.ROLE_FOURNI_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role Fourni Gamma DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_GAMMA_DB_OPERATION_COUNT = CosaPackage.ROLE_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Role_Requis_SM_AlphaImpl <em>Role Requis SM Alpha</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Role_Requis_SM_AlphaImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Requis_SM_Alpha()
	 * @generated
	 */
	int ROLE_REQUIS_SM_ALPHA = 52;

	/**
	 * The feature id for the '<em><b>Attachment conn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_SM_ALPHA__ATTACHMENT_CONN = CosaPackage.ROLE_REQUIS__ATTACHMENT_CONN;

	/**
	 * The feature id for the '<em><b>Attachment sm alpha</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_SM_ALPHA__ATTACHMENT_SM_ALPHA = CosaPackage.ROLE_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Requis SM Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_SM_ALPHA_FEATURE_COUNT = CosaPackage.ROLE_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role Requis SM Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_SM_ALPHA_OPERATION_COUNT = CosaPackage.ROLE_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Role_Fourni_Alpha_SMImpl <em>Role Fourni Alpha SM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Role_Fourni_Alpha_SMImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Fourni_Alpha_SM()
	 * @generated
	 */
	int ROLE_FOURNI_ALPHA_SM = 53;

	/**
	 * The feature id for the '<em><b>Attachment conn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_ALPHA_SM__ATTACHMENT_CONN = CosaPackage.ROLE_FOURNI__ATTACHMENT_CONN;

	/**
	 * The feature id for the '<em><b>Attachment alpha sm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_ALPHA_SM__ATTACHMENT_ALPHA_SM = CosaPackage.ROLE_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Fourni Alpha SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_ALPHA_SM_FEATURE_COUNT = CosaPackage.ROLE_FOURNI_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role Fourni Alpha SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_ALPHA_SM_OPERATION_COUNT = CosaPackage.ROLE_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Role_Requis_CM_AlphaImpl <em>Role Requis CM Alpha</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Role_Requis_CM_AlphaImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Requis_CM_Alpha()
	 * @generated
	 */
	int ROLE_REQUIS_CM_ALPHA = 54;

	/**
	 * The feature id for the '<em><b>Attachment conn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_CM_ALPHA__ATTACHMENT_CONN = CosaPackage.ROLE_REQUIS__ATTACHMENT_CONN;

	/**
	 * The feature id for the '<em><b>Attachment cm alpha</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_CM_ALPHA__ATTACHMENT_CM_ALPHA = CosaPackage.ROLE_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Requis CM Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_CM_ALPHA_FEATURE_COUNT = CosaPackage.ROLE_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role Requis CM Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_CM_ALPHA_OPERATION_COUNT = CosaPackage.ROLE_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Role_Fourni_Alpha_CMImpl <em>Role Fourni Alpha CM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Role_Fourni_Alpha_CMImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Fourni_Alpha_CM()
	 * @generated
	 */
	int ROLE_FOURNI_ALPHA_CM = 55;

	/**
	 * The feature id for the '<em><b>Attachment conn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_ALPHA_CM__ATTACHMENT_CONN = CosaPackage.ROLE_FOURNI__ATTACHMENT_CONN;

	/**
	 * The feature id for the '<em><b>Attachment alpha cm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_ALPHA_CM__ATTACHMENT_ALPHA_CM = CosaPackage.ROLE_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Fourni Alpha CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_ALPHA_CM_FEATURE_COUNT = CosaPackage.ROLE_FOURNI_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role Fourni Alpha CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_ALPHA_CM_OPERATION_COUNT = CosaPackage.ROLE_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Attachment_SM_AlphaImpl <em>Attachment SM Alpha</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Attachment_SM_AlphaImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_SM_Alpha()
	 * @generated
	 */
	int ATTACHMENT_SM_ALPHA = 56;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_ALPHA__ROLE = CosaPackage.ATTACHMENT__ROLE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_ALPHA__PORT = CosaPackage.ATTACHMENT__PORT;

	/**
	 * The feature id for the '<em><b>Port fourni sm alpha</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_ALPHA__PORT_FOURNI_SM_ALPHA = CosaPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role requis sm alpha</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_ALPHA__ROLE_REQUIS_SM_ALPHA = CosaPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment SM Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_ALPHA_FEATURE_COUNT = CosaPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attachment SM Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_ALPHA_OPERATION_COUNT = CosaPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Attachment_Alpha_SMImpl <em>Attachment Alpha SM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Attachment_Alpha_SMImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_Alpha_SM()
	 * @generated
	 */
	int ATTACHMENT_ALPHA_SM = 57;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_ALPHA_SM__ROLE = CosaPackage.ATTACHMENT__ROLE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_ALPHA_SM__PORT = CosaPackage.ATTACHMENT__PORT;

	/**
	 * The feature id for the '<em><b>Port requis alpha sm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_ALPHA_SM__PORT_REQUIS_ALPHA_SM = CosaPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role fourni alpha sm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_ALPHA_SM__ROLE_FOURNI_ALPHA_SM = CosaPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment Alpha SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_ALPHA_SM_FEATURE_COUNT = CosaPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attachment Alpha SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_ALPHA_SM_OPERATION_COUNT = CosaPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Attachment_CM_AlphaImpl <em>Attachment CM Alpha</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Attachment_CM_AlphaImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_CM_Alpha()
	 * @generated
	 */
	int ATTACHMENT_CM_ALPHA = 58;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CM_ALPHA__ROLE = CosaPackage.ATTACHMENT__ROLE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CM_ALPHA__PORT = CosaPackage.ATTACHMENT__PORT;

	/**
	 * The feature id for the '<em><b>Role requis cm alpha</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CM_ALPHA__ROLE_REQUIS_CM_ALPHA = CosaPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attachment CM Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CM_ALPHA_FEATURE_COUNT = CosaPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attachment CM Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CM_ALPHA_OPERATION_COUNT = CosaPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Attachment_Alpha_CMImpl <em>Attachment Alpha CM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Attachment_Alpha_CMImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_Alpha_CM()
	 * @generated
	 */
	int ATTACHMENT_ALPHA_CM = 59;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_ALPHA_CM__ROLE = CosaPackage.ATTACHMENT__ROLE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_ALPHA_CM__PORT = CosaPackage.ATTACHMENT__PORT;

	/**
	 * The feature id for the '<em><b>Port requis alpha cm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_ALPHA_CM__PORT_REQUIS_ALPHA_CM = CosaPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role fourni alpha cm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_ALPHA_CM__ROLE_FOURNI_ALPHA_CM = CosaPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment Alpha CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_ALPHA_CM_FEATURE_COUNT = CosaPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attachment Alpha CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_ALPHA_CM_OPERATION_COUNT = CosaPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Attachment_SM_BetaImpl <em>Attachment SM Beta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Attachment_SM_BetaImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_SM_Beta()
	 * @generated
	 */
	int ATTACHMENT_SM_BETA = 60;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_BETA__ROLE = CosaPackage.ATTACHMENT__ROLE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_BETA__PORT = CosaPackage.ATTACHMENT__PORT;

	/**
	 * The feature id for the '<em><b>Port fourni sm beta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_BETA__PORT_FOURNI_SM_BETA = CosaPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role requis sm beta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_BETA__ROLE_REQUIS_SM_BETA = CosaPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment SM Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_BETA_FEATURE_COUNT = CosaPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attachment SM Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_BETA_OPERATION_COUNT = CosaPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Attachment_Beta_SMImpl <em>Attachment Beta SM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Attachment_Beta_SMImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_Beta_SM()
	 * @generated
	 */
	int ATTACHMENT_BETA_SM = 61;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_BETA_SM__ROLE = CosaPackage.ATTACHMENT__ROLE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_BETA_SM__PORT = CosaPackage.ATTACHMENT__PORT;

	/**
	 * The feature id for the '<em><b>Port requis beta sm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_BETA_SM__PORT_REQUIS_BETA_SM = CosaPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role fourni beta sm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_BETA_SM__ROLE_FOURNI_BETA_SM = CosaPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment Beta SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_BETA_SM_FEATURE_COUNT = CosaPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attachment Beta SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_BETA_SM_OPERATION_COUNT = CosaPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Attachment_DB_BetaImpl <em>Attachment DB Beta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Attachment_DB_BetaImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_DB_Beta()
	 * @generated
	 */
	int ATTACHMENT_DB_BETA = 62;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_BETA__ROLE = CosaPackage.ATTACHMENT__ROLE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_BETA__PORT = CosaPackage.ATTACHMENT__PORT;

	/**
	 * The feature id for the '<em><b>Port fourni db beta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_BETA__PORT_FOURNI_DB_BETA = CosaPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role requis db beta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_BETA__ROLE_REQUIS_DB_BETA = CosaPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment DB Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_BETA_FEATURE_COUNT = CosaPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attachment DB Beta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_BETA_OPERATION_COUNT = CosaPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Attachment_Beta_DBImpl <em>Attachment Beta DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Attachment_Beta_DBImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_Beta_DB()
	 * @generated
	 */
	int ATTACHMENT_BETA_DB = 63;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_BETA_DB__ROLE = CosaPackage.ATTACHMENT__ROLE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_BETA_DB__PORT = CosaPackage.ATTACHMENT__PORT;

	/**
	 * The feature id for the '<em><b>Port requis beta db</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_BETA_DB__PORT_REQUIS_BETA_DB = CosaPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role fourni beta db</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_BETA_DB__ROLE_FOURNI_BETA_DB = CosaPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment Beta DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_BETA_DB_FEATURE_COUNT = CosaPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attachment Beta DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_BETA_DB_OPERATION_COUNT = CosaPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Attachment_CM_GammaImpl <em>Attachment CM Gamma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Attachment_CM_GammaImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_CM_Gamma()
	 * @generated
	 */
	int ATTACHMENT_CM_GAMMA = 64;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CM_GAMMA__ROLE = CosaPackage.ATTACHMENT__ROLE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CM_GAMMA__PORT = CosaPackage.ATTACHMENT__PORT;

	/**
	 * The feature id for the '<em><b>Role requis cm gamma</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CM_GAMMA__ROLE_REQUIS_CM_GAMMA = CosaPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port fourni cm gamma</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CM_GAMMA__PORT_FOURNI_CM_GAMMA = CosaPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment CM Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CM_GAMMA_FEATURE_COUNT = CosaPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attachment CM Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CM_GAMMA_OPERATION_COUNT = CosaPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Attachment_Gamma_CMImpl <em>Attachment Gamma CM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Attachment_Gamma_CMImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_Gamma_CM()
	 * @generated
	 */
	int ATTACHMENT_GAMMA_CM = 65;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_GAMMA_CM__ROLE = CosaPackage.ATTACHMENT__ROLE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_GAMMA_CM__PORT = CosaPackage.ATTACHMENT__PORT;

	/**
	 * The feature id for the '<em><b>Role fourni gamma cm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_GAMMA_CM__ROLE_FOURNI_GAMMA_CM = CosaPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port requis gamma cm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_GAMMA_CM__PORT_REQUIS_GAMMA_CM = CosaPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment Gamma CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_GAMMA_CM_FEATURE_COUNT = CosaPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attachment Gamma CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_GAMMA_CM_OPERATION_COUNT = CosaPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Attachment_DB_GammaImpl <em>Attachment DB Gamma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Attachment_DB_GammaImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_DB_Gamma()
	 * @generated
	 */
	int ATTACHMENT_DB_GAMMA = 66;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_GAMMA__ROLE = CosaPackage.ATTACHMENT__ROLE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_GAMMA__PORT = CosaPackage.ATTACHMENT__PORT;

	/**
	 * The feature id for the '<em><b>Role requis db gamma</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_GAMMA__ROLE_REQUIS_DB_GAMMA = CosaPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port fourni db gamma</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_GAMMA__PORT_FOURNI_DB_GAMMA = CosaPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment DB Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_GAMMA_FEATURE_COUNT = CosaPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attachment DB Gamma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_GAMMA_OPERATION_COUNT = CosaPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Attachment_Gamma_DBImpl <em>Attachment Gamma DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Attachment_Gamma_DBImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_Gamma_DB()
	 * @generated
	 */
	int ATTACHMENT_GAMMA_DB = 67;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_GAMMA_DB__ROLE = CosaPackage.ATTACHMENT__ROLE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_GAMMA_DB__PORT = CosaPackage.ATTACHMENT__PORT;

	/**
	 * The feature id for the '<em><b>Role fourni gamma db</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_GAMMA_DB__ROLE_FOURNI_GAMMA_DB = CosaPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port requis gamma db</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_GAMMA_DB__PORT_REQUIS_GAMMA_DB = CosaPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment Gamma DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_GAMMA_DB_FEATURE_COUNT = CosaPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attachment Gamma DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_GAMMA_DB_OPERATION_COUNT = CosaPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Port_Serveur_Comp_Serveur_ComfImpl <em>Port Serveur Comp Serveur Comf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Port_Serveur_Comp_Serveur_ComfImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Serveur_Comp_Serveur_Comf()
	 * @generated
	 */
	int PORT_SERVEUR_COMP_SERVEUR_COMF = 68;

	/**
	 * The feature id for the '<em><b>Attachment comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SERVEUR_COMP_SERVEUR_COMF__ATTACHMENT_COMP = CosaPackage.PORT__ATTACHMENT_COMP;

	/**
	 * The feature id for the '<em><b>Binding conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SERVEUR_COMP_SERVEUR_COMF__BINDING_CONF = CosaPackage.PORT__BINDING_CONF;

	/**
	 * The feature id for the '<em><b>Binding comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SERVEUR_COMP_SERVEUR_COMF__BINDING_COMP = CosaPackage.PORT__BINDING_COMP;

	/**
	 * The feature id for the '<em><b>Binding serveur comp serveur conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SERVEUR_COMP_SERVEUR_COMF__BINDING_SERVEUR_COMP_SERVEUR_CONF = CosaPackage.PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Serveur Comp Serveur Comf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SERVEUR_COMP_SERVEUR_COMF_FEATURE_COUNT = CosaPackage.PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Serveur Comp Serveur Comf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SERVEUR_COMP_SERVEUR_COMF_OPERATION_COUNT = CosaPackage.PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Interface_Serveur_ConfImpl <em>Interface Serveur Conf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Interface_Serveur_ConfImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getInterface_Serveur_Conf()
	 * @generated
	 */
	int INTERFACE_SERVEUR_CONF = 69;

	/**
	 * The feature id for the '<em><b>Port serveur conf serveur comp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SERVEUR_CONF__PORT_SERVEUR_CONF_SERVEUR_COMP = CosaPackage.INTERFACE_COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Serveur Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SERVEUR_CONF_FEATURE_COUNT = CosaPackage.INTERFACE_COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface Serveur Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SERVEUR_CONF_OPERATION_COUNT = CosaPackage.INTERFACE_COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Port_Serveur_Conf_Serveur_CompImpl <em>Port Serveur Conf Serveur Comp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Port_Serveur_Conf_Serveur_CompImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Serveur_Conf_Serveur_Comp()
	 * @generated
	 */
	int PORT_SERVEUR_CONF_SERVEUR_COMP = 70;

	/**
	 * The feature id for the '<em><b>Attachment comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SERVEUR_CONF_SERVEUR_COMP__ATTACHMENT_COMP = CosaPackage.PORT__ATTACHMENT_COMP;

	/**
	 * The feature id for the '<em><b>Binding conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SERVEUR_CONF_SERVEUR_COMP__BINDING_CONF = CosaPackage.PORT__BINDING_CONF;

	/**
	 * The feature id for the '<em><b>Binding comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SERVEUR_CONF_SERVEUR_COMP__BINDING_COMP = CosaPackage.PORT__BINDING_COMP;

	/**
	 * The feature id for the '<em><b>Binding serveur comp serveur conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SERVEUR_CONF_SERVEUR_COMP__BINDING_SERVEUR_COMP_SERVEUR_CONF = CosaPackage.PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Serveur Conf Serveur Comp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SERVEUR_CONF_SERVEUR_COMP_FEATURE_COUNT = CosaPackage.PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Serveur Conf Serveur Comp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SERVEUR_CONF_SERVEUR_COMP_OPERATION_COUNT = CosaPackage.PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Binding_Serveur_Comp_Serveur_ConfImpl <em>Binding Serveur Comp Serveur Conf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Binding_Serveur_Comp_Serveur_ConfImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getBinding_Serveur_Comp_Serveur_Conf()
	 * @generated
	 */
	int BINDING_SERVEUR_COMP_SERVEUR_CONF = 71;

	/**
	 * The feature id for the '<em><b>Port conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_CONF = CosaPackage.BINDING__PORT_CONF;

	/**
	 * The feature id for the '<em><b>Port comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_COMP = CosaPackage.BINDING__PORT_COMP;

	/**
	 * The feature id for the '<em><b>Port serveur conf serveur comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_SERVEUR_CONF_SERVEUR_COMP = CosaPackage.BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port serveur comp serveur comf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_SERVEUR_COMP_SERVEUR_COMF = CosaPackage.BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binding Serveur Comp Serveur Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVEUR_COMP_SERVEUR_CONF_FEATURE_COUNT = CosaPackage.BINDING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binding Serveur Comp Serveur Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVEUR_COMP_SERVEUR_CONF_OPERATION_COUNT = CosaPackage.BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Port_CM_Serveur_CompImpl <em>Port CM Serveur Comp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Port_CM_Serveur_CompImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_CM_Serveur_Comp()
	 * @generated
	 */
	int PORT_CM_SERVEUR_COMP = 72;

	/**
	 * The feature id for the '<em><b>Attachment comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CM_SERVEUR_COMP__ATTACHMENT_COMP = CosaPackage.PORT__ATTACHMENT_COMP;

	/**
	 * The feature id for the '<em><b>Binding conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CM_SERVEUR_COMP__BINDING_CONF = CosaPackage.PORT__BINDING_CONF;

	/**
	 * The feature id for the '<em><b>Binding comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CM_SERVEUR_COMP__BINDING_COMP = CosaPackage.PORT__BINDING_COMP;

	/**
	 * The feature id for the '<em><b>Binding serveur comp cm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CM_SERVEUR_COMP__BINDING_SERVEUR_COMP_CM = CosaPackage.PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port CM Serveur Comp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CM_SERVEUR_COMP_FEATURE_COUNT = CosaPackage.PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port CM Serveur Comp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CM_SERVEUR_COMP_OPERATION_COUNT = CosaPackage.PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Port_Serveur_Comp_CMImpl <em>Port Serveur Comp CM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Port_Serveur_Comp_CMImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Serveur_Comp_CM()
	 * @generated
	 */
	int PORT_SERVEUR_COMP_CM = 73;

	/**
	 * The feature id for the '<em><b>Attachment comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SERVEUR_COMP_CM__ATTACHMENT_COMP = CosaPackage.PORT__ATTACHMENT_COMP;

	/**
	 * The feature id for the '<em><b>Binding conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SERVEUR_COMP_CM__BINDING_CONF = CosaPackage.PORT__BINDING_CONF;

	/**
	 * The feature id for the '<em><b>Binding comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SERVEUR_COMP_CM__BINDING_COMP = CosaPackage.PORT__BINDING_COMP;

	/**
	 * The feature id for the '<em><b>Binding serveur comp cm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SERVEUR_COMP_CM__BINDING_SERVEUR_COMP_CM = CosaPackage.PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Serveur Comp CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SERVEUR_COMP_CM_FEATURE_COUNT = CosaPackage.PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Serveur Comp CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SERVEUR_COMP_CM_OPERATION_COUNT = CosaPackage.PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link client_serveur.impl.Binding_Serveur_Comp_CMImpl <em>Binding Serveur Comp CM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see client_serveur.impl.Binding_Serveur_Comp_CMImpl
	 * @see client_serveur.impl.Client_serveurPackageImpl#getBinding_Serveur_Comp_CM()
	 * @generated
	 */
	int BINDING_SERVEUR_COMP_CM = 74;

	/**
	 * The feature id for the '<em><b>Port conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVEUR_COMP_CM__PORT_CONF = CosaPackage.BINDING__PORT_CONF;

	/**
	 * The feature id for the '<em><b>Port comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVEUR_COMP_CM__PORT_COMP = CosaPackage.BINDING__PORT_COMP;

	/**
	 * The feature id for the '<em><b>Port cm serveur comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVEUR_COMP_CM__PORT_CM_SERVEUR_COMP = CosaPackage.BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port serveur comp cm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVEUR_COMP_CM__PORT_SERVEUR_COMP_CM = CosaPackage.BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binding Serveur Comp CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVEUR_COMP_CM_FEATURE_COUNT = CosaPackage.BINDING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binding Serveur Comp CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVEUR_COMP_CM_OPERATION_COUNT = CosaPackage.BINDING_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link client_serveur.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see client_serveur.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Client#getInterface_client <em>Interface client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface client</em>'.
	 * @see client_serveur.Client#getInterface_client()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Interface_client();

	/**
	 * Returns the meta object for class '{@link client_serveur.RPC <em>RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPC</em>'.
	 * @see client_serveur.RPC
	 * @generated
	 */
	EClass getRPC();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.RPC#getInterface_rpc <em>Interface rpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface rpc</em>'.
	 * @see client_serveur.RPC#getInterface_rpc()
	 * @see #getRPC()
	 * @generated
	 */
	EReference getRPC_Interface_rpc();

	/**
	 * Returns the meta object for class '{@link client_serveur.Client_serveur <em>Client serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client serveur</em>'.
	 * @see client_serveur.Client_serveur
	 * @generated
	 */
	EClass getClient_serveur();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Client_serveur#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Client</em>'.
	 * @see client_serveur.Client_serveur#getClient()
	 * @see #getClient_serveur()
	 * @generated
	 */
	EReference getClient_serveur_Client();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Client_serveur#getRpc <em>Rpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rpc</em>'.
	 * @see client_serveur.Client_serveur#getRpc()
	 * @see #getClient_serveur()
	 * @generated
	 */
	EReference getClient_serveur_Rpc();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Client_serveur#getServeur <em>Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Serveur</em>'.
	 * @see client_serveur.Client_serveur#getServeur()
	 * @see #getClient_serveur()
	 * @generated
	 */
	EReference getClient_serveur_Serveur();

	/**
	 * Returns the meta object for class '{@link client_serveur.Interface_Client <em>Interface Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Client</em>'.
	 * @see client_serveur.Interface_Client
	 * @generated
	 */
	EClass getInterface_Client();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Client#getPort_fourni_client <em>Port fourni client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port fourni client</em>'.
	 * @see client_serveur.Interface_Client#getPort_fourni_client()
	 * @see #getInterface_Client()
	 * @generated
	 */
	EReference getInterface_Client_Port_fourni_client();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Client#getPort_requis_client <em>Port requis client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port requis client</em>'.
	 * @see client_serveur.Interface_Client#getPort_requis_client()
	 * @see #getInterface_Client()
	 * @generated
	 */
	EReference getInterface_Client_Port_requis_client();

	/**
	 * Returns the meta object for class '{@link client_serveur.Interface_RPC <em>Interface RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface RPC</em>'.
	 * @see client_serveur.Interface_RPC
	 * @generated
	 */
	EClass getInterface_RPC();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_RPC#getRole_fourni_rpc_client <em>Role fourni rpc client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role fourni rpc client</em>'.
	 * @see client_serveur.Interface_RPC#getRole_fourni_rpc_client()
	 * @see #getInterface_RPC()
	 * @generated
	 */
	EReference getInterface_RPC_Role_fourni_rpc_client();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_RPC#getRole_requis_rpc_client <em>Role requis rpc client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role requis rpc client</em>'.
	 * @see client_serveur.Interface_RPC#getRole_requis_rpc_client()
	 * @see #getInterface_RPC()
	 * @generated
	 */
	EReference getInterface_RPC_Role_requis_rpc_client();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_RPC#getRole_fourni_rpc_serveur <em>Role fourni rpc serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role fourni rpc serveur</em>'.
	 * @see client_serveur.Interface_RPC#getRole_fourni_rpc_serveur()
	 * @see #getInterface_RPC()
	 * @generated
	 */
	EReference getInterface_RPC_Role_fourni_rpc_serveur();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_RPC#getRole_requis_rpc_serveur <em>Role requis rpc serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role requis rpc serveur</em>'.
	 * @see client_serveur.Interface_RPC#getRole_requis_rpc_serveur()
	 * @see #getInterface_RPC()
	 * @generated
	 */
	EReference getInterface_RPC_Role_requis_rpc_serveur();

	/**
	 * Returns the meta object for class '{@link client_serveur.DataBase <em>Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Base</em>'.
	 * @see client_serveur.DataBase
	 * @generated
	 */
	EClass getDataBase();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.DataBase#getInterface_database <em>Interface database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface database</em>'.
	 * @see client_serveur.DataBase#getInterface_database()
	 * @see #getDataBase()
	 * @generated
	 */
	EReference getDataBase_Interface_database();

	/**
	 * Returns the meta object for class '{@link client_serveur.Interface_DataBase <em>Interface Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Data Base</em>'.
	 * @see client_serveur.Interface_DataBase
	 * @generated
	 */
	EClass getInterface_DataBase();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_DataBase#getPort_fourni_db_gamma <em>Port fourni db gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port fourni db gamma</em>'.
	 * @see client_serveur.Interface_DataBase#getPort_fourni_db_gamma()
	 * @see #getInterface_DataBase()
	 * @generated
	 */
	EReference getInterface_DataBase_Port_fourni_db_gamma();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_DataBase#getPort_requis_gamma_db <em>Port requis gamma db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port requis gamma db</em>'.
	 * @see client_serveur.Interface_DataBase#getPort_requis_gamma_db()
	 * @see #getInterface_DataBase()
	 * @generated
	 */
	EReference getInterface_DataBase_Port_requis_gamma_db();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_DataBase#getPort_fourni_db_beta <em>Port fourni db beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port fourni db beta</em>'.
	 * @see client_serveur.Interface_DataBase#getPort_fourni_db_beta()
	 * @see #getInterface_DataBase()
	 * @generated
	 */
	EReference getInterface_DataBase_Port_fourni_db_beta();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_DataBase#getPort_requis_beta_db <em>Port requis beta db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port requis beta db</em>'.
	 * @see client_serveur.Interface_DataBase#getPort_requis_beta_db()
	 * @see #getInterface_DataBase()
	 * @generated
	 */
	EReference getInterface_DataBase_Port_requis_beta_db();

	/**
	 * Returns the meta object for class '{@link client_serveur.Serveur_Comp <em>Serveur Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serveur Comp</em>'.
	 * @see client_serveur.Serveur_Comp
	 * @generated
	 */
	EClass getServeur_Comp();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Serveur_Comp#getInterface_serveur_comp <em>Interface serveur comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface serveur comp</em>'.
	 * @see client_serveur.Serveur_Comp#getInterface_serveur_comp()
	 * @see #getServeur_Comp()
	 * @generated
	 */
	EReference getServeur_Comp_Interface_serveur_comp();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Serveur_Comp#getServeur_conf <em>Serveur conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Serveur conf</em>'.
	 * @see client_serveur.Serveur_Comp#getServeur_conf()
	 * @see #getServeur_Comp()
	 * @generated
	 */
	EReference getServeur_Comp_Serveur_conf();

	/**
	 * Returns the meta object for class '{@link client_serveur.Interface_Serveur_Comp <em>Interface Serveur Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Serveur Comp</em>'.
	 * @see client_serveur.Interface_Serveur_Comp
	 * @generated
	 */
	EClass getInterface_Serveur_Comp();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Serveur_Comp#getPort_requis_serveur <em>Port requis serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port requis serveur</em>'.
	 * @see client_serveur.Interface_Serveur_Comp#getPort_requis_serveur()
	 * @see #getInterface_Serveur_Comp()
	 * @generated
	 */
	EReference getInterface_Serveur_Comp_Port_requis_serveur();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Serveur_Comp#getPort_fourni_serveur <em>Port fourni serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port fourni serveur</em>'.
	 * @see client_serveur.Interface_Serveur_Comp#getPort_fourni_serveur()
	 * @see #getInterface_Serveur_Comp()
	 * @generated
	 */
	EReference getInterface_Serveur_Comp_Port_fourni_serveur();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Serveur_Comp#getPort_serveur_comp_serveur_comf <em>Port serveur comp serveur comf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port serveur comp serveur comf</em>'.
	 * @see client_serveur.Interface_Serveur_Comp#getPort_serveur_comp_serveur_comf()
	 * @see #getInterface_Serveur_Comp()
	 * @generated
	 */
	EReference getInterface_Serveur_Comp_Port_serveur_comp_serveur_comf();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Serveur_Comp#getPort_serveur_comp_cm <em>Port serveur comp cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port serveur comp cm</em>'.
	 * @see client_serveur.Interface_Serveur_Comp#getPort_serveur_comp_cm()
	 * @see #getInterface_Serveur_Comp()
	 * @generated
	 */
	EReference getInterface_Serveur_Comp_Port_serveur_comp_cm();

	/**
	 * Returns the meta object for class '{@link client_serveur.Serveur_Conf <em>Serveur Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serveur Conf</em>'.
	 * @see client_serveur.Serveur_Conf
	 * @generated
	 */
	EClass getServeur_Conf();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Serveur_Conf#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Database</em>'.
	 * @see client_serveur.Serveur_Conf#getDatabase()
	 * @see #getServeur_Conf()
	 * @generated
	 */
	EReference getServeur_Conf_Database();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Serveur_Conf#getSecurity_manager <em>Security manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security manager</em>'.
	 * @see client_serveur.Serveur_Conf#getSecurity_manager()
	 * @see #getServeur_Conf()
	 * @generated
	 */
	EReference getServeur_Conf_Security_manager();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Serveur_Conf#getConnection_manager <em>Connection manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection manager</em>'.
	 * @see client_serveur.Serveur_Conf#getConnection_manager()
	 * @see #getServeur_Conf()
	 * @generated
	 */
	EReference getServeur_Conf_Connection_manager();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Serveur_Conf#getGamma <em>Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gamma</em>'.
	 * @see client_serveur.Serveur_Conf#getGamma()
	 * @see #getServeur_Conf()
	 * @generated
	 */
	EReference getServeur_Conf_Gamma();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Serveur_Conf#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alpha</em>'.
	 * @see client_serveur.Serveur_Conf#getAlpha()
	 * @see #getServeur_Conf()
	 * @generated
	 */
	EReference getServeur_Conf_Alpha();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Serveur_Conf#getBeta <em>Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Beta</em>'.
	 * @see client_serveur.Serveur_Conf#getBeta()
	 * @see #getServeur_Conf()
	 * @generated
	 */
	EReference getServeur_Conf_Beta();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Serveur_Conf#getInterface_serveur_conf <em>Interface serveur conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface serveur conf</em>'.
	 * @see client_serveur.Serveur_Conf#getInterface_serveur_conf()
	 * @see #getServeur_Conf()
	 * @generated
	 */
	EReference getServeur_Conf_Interface_serveur_conf();

	/**
	 * Returns the meta object for class '{@link client_serveur.Port_Requis_Serveur <em>Port Requis Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Requis Serveur</em>'.
	 * @see client_serveur.Port_Requis_Serveur
	 * @generated
	 */
	EClass getPort_Requis_Serveur();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Port_Requis_Serveur#getAttachment_rpc_serveur <em>Attachment rpc serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment rpc serveur</em>'.
	 * @see client_serveur.Port_Requis_Serveur#getAttachment_rpc_serveur()
	 * @see #getPort_Requis_Serveur()
	 * @generated
	 */
	EReference getPort_Requis_Serveur_Attachment_rpc_serveur();

	/**
	 * Returns the meta object for class '{@link client_serveur.Port_Fourni_Serveur <em>Port Fourni Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Fourni Serveur</em>'.
	 * @see client_serveur.Port_Fourni_Serveur
	 * @generated
	 */
	EClass getPort_Fourni_Serveur();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Port_Fourni_Serveur#getAttachement_serveur_rpc <em>Attachement serveur rpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachement serveur rpc</em>'.
	 * @see client_serveur.Port_Fourni_Serveur#getAttachement_serveur_rpc()
	 * @see #getPort_Fourni_Serveur()
	 * @generated
	 */
	EReference getPort_Fourni_Serveur_Attachement_serveur_rpc();

	/**
	 * Returns the meta object for class '{@link client_serveur.Role_Requis_RPC_Client <em>Role Requis RPC Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Requis RPC Client</em>'.
	 * @see client_serveur.Role_Requis_RPC_Client
	 * @generated
	 */
	EClass getRole_Requis_RPC_Client();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Role_Requis_RPC_Client#getAttachment_client_rpc <em>Attachment client rpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment client rpc</em>'.
	 * @see client_serveur.Role_Requis_RPC_Client#getAttachment_client_rpc()
	 * @see #getRole_Requis_RPC_Client()
	 * @generated
	 */
	EReference getRole_Requis_RPC_Client_Attachment_client_rpc();

	/**
	 * Returns the meta object for class '{@link client_serveur.Role_Fourni_RPC_Client <em>Role Fourni RPC Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Fourni RPC Client</em>'.
	 * @see client_serveur.Role_Fourni_RPC_Client
	 * @generated
	 */
	EClass getRole_Fourni_RPC_Client();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Role_Fourni_RPC_Client#getAttachment_rpc_client <em>Attachment rpc client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment rpc client</em>'.
	 * @see client_serveur.Role_Fourni_RPC_Client#getAttachment_rpc_client()
	 * @see #getRole_Fourni_RPC_Client()
	 * @generated
	 */
	EReference getRole_Fourni_RPC_Client_Attachment_rpc_client();

	/**
	 * Returns the meta object for class '{@link client_serveur.Port_Requis_Client <em>Port Requis Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Requis Client</em>'.
	 * @see client_serveur.Port_Requis_Client
	 * @generated
	 */
	EClass getPort_Requis_Client();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Port_Requis_Client#getAttachment_rpc_client <em>Attachment rpc client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment rpc client</em>'.
	 * @see client_serveur.Port_Requis_Client#getAttachment_rpc_client()
	 * @see #getPort_Requis_Client()
	 * @generated
	 */
	EReference getPort_Requis_Client_Attachment_rpc_client();

	/**
	 * Returns the meta object for class '{@link client_serveur.Port_Fourni_Client <em>Port Fourni Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Fourni Client</em>'.
	 * @see client_serveur.Port_Fourni_Client
	 * @generated
	 */
	EClass getPort_Fourni_Client();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Port_Fourni_Client#getAttachment_client_rpc <em>Attachment client rpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment client rpc</em>'.
	 * @see client_serveur.Port_Fourni_Client#getAttachment_client_rpc()
	 * @see #getPort_Fourni_Client()
	 * @generated
	 */
	EReference getPort_Fourni_Client_Attachment_client_rpc();

	/**
	 * Returns the meta object for class '{@link client_serveur.Attachment_Client_RPC <em>Attachment Client RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment Client RPC</em>'.
	 * @see client_serveur.Attachment_Client_RPC
	 * @generated
	 */
	EClass getAttachment_Client_RPC();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_Client_RPC#getPort_fourni_client <em>Port fourni client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port fourni client</em>'.
	 * @see client_serveur.Attachment_Client_RPC#getPort_fourni_client()
	 * @see #getAttachment_Client_RPC()
	 * @generated
	 */
	EReference getAttachment_Client_RPC_Port_fourni_client();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_Client_RPC#getRole_requis_rpc_client <em>Role requis rpc client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role requis rpc client</em>'.
	 * @see client_serveur.Attachment_Client_RPC#getRole_requis_rpc_client()
	 * @see #getAttachment_Client_RPC()
	 * @generated
	 */
	EReference getAttachment_Client_RPC_Role_requis_rpc_client();

	/**
	 * Returns the meta object for class '{@link client_serveur.Attachment_RPC_Client <em>Attachment RPC Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment RPC Client</em>'.
	 * @see client_serveur.Attachment_RPC_Client
	 * @generated
	 */
	EClass getAttachment_RPC_Client();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_RPC_Client#getPort_requis_client <em>Port requis client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port requis client</em>'.
	 * @see client_serveur.Attachment_RPC_Client#getPort_requis_client()
	 * @see #getAttachment_RPC_Client()
	 * @generated
	 */
	EReference getAttachment_RPC_Client_Port_requis_client();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_RPC_Client#getRole_fourni_rpc_client <em>Role fourni rpc client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role fourni rpc client</em>'.
	 * @see client_serveur.Attachment_RPC_Client#getRole_fourni_rpc_client()
	 * @see #getAttachment_RPC_Client()
	 * @generated
	 */
	EReference getAttachment_RPC_Client_Role_fourni_rpc_client();

	/**
	 * Returns the meta object for class '{@link client_serveur.Role_Requis_RPC_Serveur <em>Role Requis RPC Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Requis RPC Serveur</em>'.
	 * @see client_serveur.Role_Requis_RPC_Serveur
	 * @generated
	 */
	EClass getRole_Requis_RPC_Serveur();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Role_Requis_RPC_Serveur#getAttachement_serveur_rpc <em>Attachement serveur rpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachement serveur rpc</em>'.
	 * @see client_serveur.Role_Requis_RPC_Serveur#getAttachement_serveur_rpc()
	 * @see #getRole_Requis_RPC_Serveur()
	 * @generated
	 */
	EReference getRole_Requis_RPC_Serveur_Attachement_serveur_rpc();

	/**
	 * Returns the meta object for class '{@link client_serveur.Role_Fourni_RPC_Serveur <em>Role Fourni RPC Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Fourni RPC Serveur</em>'.
	 * @see client_serveur.Role_Fourni_RPC_Serveur
	 * @generated
	 */
	EClass getRole_Fourni_RPC_Serveur();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Role_Fourni_RPC_Serveur#getAttachment_rpc_serveur <em>Attachment rpc serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment rpc serveur</em>'.
	 * @see client_serveur.Role_Fourni_RPC_Serveur#getAttachment_rpc_serveur()
	 * @see #getRole_Fourni_RPC_Serveur()
	 * @generated
	 */
	EReference getRole_Fourni_RPC_Serveur_Attachment_rpc_serveur();

	/**
	 * Returns the meta object for class '{@link client_serveur.Attachment_RPC_Serveur <em>Attachment RPC Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment RPC Serveur</em>'.
	 * @see client_serveur.Attachment_RPC_Serveur
	 * @generated
	 */
	EClass getAttachment_RPC_Serveur();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_RPC_Serveur#getRole_fourni_rpc_serveur <em>Role fourni rpc serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role fourni rpc serveur</em>'.
	 * @see client_serveur.Attachment_RPC_Serveur#getRole_fourni_rpc_serveur()
	 * @see #getAttachment_RPC_Serveur()
	 * @generated
	 */
	EReference getAttachment_RPC_Serveur_Role_fourni_rpc_serveur();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_RPC_Serveur#getPort_requis_serveur <em>Port requis serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port requis serveur</em>'.
	 * @see client_serveur.Attachment_RPC_Serveur#getPort_requis_serveur()
	 * @see #getAttachment_RPC_Serveur()
	 * @generated
	 */
	EReference getAttachment_RPC_Serveur_Port_requis_serveur();

	/**
	 * Returns the meta object for class '{@link client_serveur.Attachement_Serveur_RPC <em>Attachement Serveur RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachement Serveur RPC</em>'.
	 * @see client_serveur.Attachement_Serveur_RPC
	 * @generated
	 */
	EClass getAttachement_Serveur_RPC();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachement_Serveur_RPC#getRole_requis_rpc_serveur <em>Role requis rpc serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role requis rpc serveur</em>'.
	 * @see client_serveur.Attachement_Serveur_RPC#getRole_requis_rpc_serveur()
	 * @see #getAttachement_Serveur_RPC()
	 * @generated
	 */
	EReference getAttachement_Serveur_RPC_Role_requis_rpc_serveur();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachement_Serveur_RPC#getPort_fourni_serveur <em>Port fourni serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port fourni serveur</em>'.
	 * @see client_serveur.Attachement_Serveur_RPC#getPort_fourni_serveur()
	 * @see #getAttachement_Serveur_RPC()
	 * @generated
	 */
	EReference getAttachement_Serveur_RPC_Port_fourni_serveur();

	/**
	 * Returns the meta object for class '{@link client_serveur.Security_Manager <em>Security Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Manager</em>'.
	 * @see client_serveur.Security_Manager
	 * @generated
	 */
	EClass getSecurity_Manager();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Security_Manager#getInterface_security_manager <em>Interface security manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface security manager</em>'.
	 * @see client_serveur.Security_Manager#getInterface_security_manager()
	 * @see #getSecurity_Manager()
	 * @generated
	 */
	EReference getSecurity_Manager_Interface_security_manager();

	/**
	 * Returns the meta object for class '{@link client_serveur.Connection_Manager <em>Connection Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Manager</em>'.
	 * @see client_serveur.Connection_Manager
	 * @generated
	 */
	EClass getConnection_Manager();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Connection_Manager#getInterface_connection_manager <em>Interface connection manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface connection manager</em>'.
	 * @see client_serveur.Connection_Manager#getInterface_connection_manager()
	 * @see #getConnection_Manager()
	 * @generated
	 */
	EReference getConnection_Manager_Interface_connection_manager();

	/**
	 * Returns the meta object for class '{@link client_serveur.Interface_Connection_Manager <em>Interface Connection Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Connection Manager</em>'.
	 * @see client_serveur.Interface_Connection_Manager
	 * @generated
	 */
	EClass getInterface_Connection_Manager();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Connection_Manager#getPort_fourni_cm_gamma <em>Port fourni cm gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port fourni cm gamma</em>'.
	 * @see client_serveur.Interface_Connection_Manager#getPort_fourni_cm_gamma()
	 * @see #getInterface_Connection_Manager()
	 * @generated
	 */
	EReference getInterface_Connection_Manager_Port_fourni_cm_gamma();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Connection_Manager#getPort_requis_gamma_cm <em>Port requis gamma cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port requis gamma cm</em>'.
	 * @see client_serveur.Interface_Connection_Manager#getPort_requis_gamma_cm()
	 * @see #getInterface_Connection_Manager()
	 * @generated
	 */
	EReference getInterface_Connection_Manager_Port_requis_gamma_cm();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Connection_Manager#getPort_fourni_cm_alpha <em>Port fourni cm alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port fourni cm alpha</em>'.
	 * @see client_serveur.Interface_Connection_Manager#getPort_fourni_cm_alpha()
	 * @see #getInterface_Connection_Manager()
	 * @generated
	 */
	EReference getInterface_Connection_Manager_Port_fourni_cm_alpha();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Connection_Manager#getPort_requis_alpha_cm <em>Port requis alpha cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port requis alpha cm</em>'.
	 * @see client_serveur.Interface_Connection_Manager#getPort_requis_alpha_cm()
	 * @see #getInterface_Connection_Manager()
	 * @generated
	 */
	EReference getInterface_Connection_Manager_Port_requis_alpha_cm();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Connection_Manager#getPort_cm_serveur_comp <em>Port cm serveur comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port cm serveur comp</em>'.
	 * @see client_serveur.Interface_Connection_Manager#getPort_cm_serveur_comp()
	 * @see #getInterface_Connection_Manager()
	 * @generated
	 */
	EReference getInterface_Connection_Manager_Port_cm_serveur_comp();

	/**
	 * Returns the meta object for class '{@link client_serveur.Interface_Security_Manager <em>Interface Security Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Security Manager</em>'.
	 * @see client_serveur.Interface_Security_Manager
	 * @generated
	 */
	EClass getInterface_Security_Manager();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Security_Manager#getPort_fourni_sm_beta <em>Port fourni sm beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port fourni sm beta</em>'.
	 * @see client_serveur.Interface_Security_Manager#getPort_fourni_sm_beta()
	 * @see #getInterface_Security_Manager()
	 * @generated
	 */
	EReference getInterface_Security_Manager_Port_fourni_sm_beta();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Security_Manager#getPort_requis_beta_sm <em>Port requis beta sm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port requis beta sm</em>'.
	 * @see client_serveur.Interface_Security_Manager#getPort_requis_beta_sm()
	 * @see #getInterface_Security_Manager()
	 * @generated
	 */
	EReference getInterface_Security_Manager_Port_requis_beta_sm();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Security_Manager#getPort_fourni_sm_alpha <em>Port fourni sm alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port fourni sm alpha</em>'.
	 * @see client_serveur.Interface_Security_Manager#getPort_fourni_sm_alpha()
	 * @see #getInterface_Security_Manager()
	 * @generated
	 */
	EReference getInterface_Security_Manager_Port_fourni_sm_alpha();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Security_Manager#getPort_requis_alpha_sm <em>Port requis alpha sm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port requis alpha sm</em>'.
	 * @see client_serveur.Interface_Security_Manager#getPort_requis_alpha_sm()
	 * @see #getInterface_Security_Manager()
	 * @generated
	 */
	EReference getInterface_Security_Manager_Port_requis_alpha_sm();

	/**
	 * Returns the meta object for class '{@link client_serveur.Port_Requis_Alpha_CM <em>Port Requis Alpha CM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Requis Alpha CM</em>'.
	 * @see client_serveur.Port_Requis_Alpha_CM
	 * @generated
	 */
	EClass getPort_Requis_Alpha_CM();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Port_Requis_Alpha_CM#getAttachment_alpha_cm <em>Attachment alpha cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment alpha cm</em>'.
	 * @see client_serveur.Port_Requis_Alpha_CM#getAttachment_alpha_cm()
	 * @see #getPort_Requis_Alpha_CM()
	 * @generated
	 */
	EReference getPort_Requis_Alpha_CM_Attachment_alpha_cm();

	/**
	 * Returns the meta object for class '{@link client_serveur.Port_Fourni_CM_Alpha <em>Port Fourni CM Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Fourni CM Alpha</em>'.
	 * @see client_serveur.Port_Fourni_CM_Alpha
	 * @generated
	 */
	EClass getPort_Fourni_CM_Alpha();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Port_Fourni_CM_Alpha#getAttachment_cm_alpha <em>Attachment cm alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment cm alpha</em>'.
	 * @see client_serveur.Port_Fourni_CM_Alpha#getAttachment_cm_alpha()
	 * @see #getPort_Fourni_CM_Alpha()
	 * @generated
	 */
	EReference getPort_Fourni_CM_Alpha_Attachment_cm_alpha();

	/**
	 * Returns the meta object for class '{@link client_serveur.Port_Fourni_CM_Gamma <em>Port Fourni CM Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Fourni CM Gamma</em>'.
	 * @see client_serveur.Port_Fourni_CM_Gamma
	 * @generated
	 */
	EClass getPort_Fourni_CM_Gamma();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Port_Fourni_CM_Gamma#getAttachment_cm_gamma <em>Attachment cm gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment cm gamma</em>'.
	 * @see client_serveur.Port_Fourni_CM_Gamma#getAttachment_cm_gamma()
	 * @see #getPort_Fourni_CM_Gamma()
	 * @generated
	 */
	EReference getPort_Fourni_CM_Gamma_Attachment_cm_gamma();

	/**
	 * Returns the meta object for class '{@link client_serveur.Port_Requis_Gamma_CM <em>Port Requis Gamma CM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Requis Gamma CM</em>'.
	 * @see client_serveur.Port_Requis_Gamma_CM
	 * @generated
	 */
	EClass getPort_Requis_Gamma_CM();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Port_Requis_Gamma_CM#getAttachment_gamma_cm <em>Attachment gamma cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment gamma cm</em>'.
	 * @see client_serveur.Port_Requis_Gamma_CM#getAttachment_gamma_cm()
	 * @see #getPort_Requis_Gamma_CM()
	 * @generated
	 */
	EReference getPort_Requis_Gamma_CM_Attachment_gamma_cm();

	/**
	 * Returns the meta object for class '{@link client_serveur.Port_Fourni_DB_Gamma <em>Port Fourni DB Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Fourni DB Gamma</em>'.
	 * @see client_serveur.Port_Fourni_DB_Gamma
	 * @generated
	 */
	EClass getPort_Fourni_DB_Gamma();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Port_Fourni_DB_Gamma#getAttachment_db_gamma <em>Attachment db gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment db gamma</em>'.
	 * @see client_serveur.Port_Fourni_DB_Gamma#getAttachment_db_gamma()
	 * @see #getPort_Fourni_DB_Gamma()
	 * @generated
	 */
	EReference getPort_Fourni_DB_Gamma_Attachment_db_gamma();

	/**
	 * Returns the meta object for class '{@link client_serveur.Port_Requis_Gamma_DB <em>Port Requis Gamma DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Requis Gamma DB</em>'.
	 * @see client_serveur.Port_Requis_Gamma_DB
	 * @generated
	 */
	EClass getPort_Requis_Gamma_DB();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Port_Requis_Gamma_DB#getAttachment_gamma_db <em>Attachment gamma db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment gamma db</em>'.
	 * @see client_serveur.Port_Requis_Gamma_DB#getAttachment_gamma_db()
	 * @see #getPort_Requis_Gamma_DB()
	 * @generated
	 */
	EReference getPort_Requis_Gamma_DB_Attachment_gamma_db();

	/**
	 * Returns the meta object for class '{@link client_serveur.Port_Fourni_DB_Beta <em>Port Fourni DB Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Fourni DB Beta</em>'.
	 * @see client_serveur.Port_Fourni_DB_Beta
	 * @generated
	 */
	EClass getPort_Fourni_DB_Beta();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Port_Fourni_DB_Beta#getAttachment_db_beta <em>Attachment db beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment db beta</em>'.
	 * @see client_serveur.Port_Fourni_DB_Beta#getAttachment_db_beta()
	 * @see #getPort_Fourni_DB_Beta()
	 * @generated
	 */
	EReference getPort_Fourni_DB_Beta_Attachment_db_beta();

	/**
	 * Returns the meta object for class '{@link client_serveur.Port_Requis_Beta_DB <em>Port Requis Beta DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Requis Beta DB</em>'.
	 * @see client_serveur.Port_Requis_Beta_DB
	 * @generated
	 */
	EClass getPort_Requis_Beta_DB();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Port_Requis_Beta_DB#getAttachment_beta_db <em>Attachment beta db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment beta db</em>'.
	 * @see client_serveur.Port_Requis_Beta_DB#getAttachment_beta_db()
	 * @see #getPort_Requis_Beta_DB()
	 * @generated
	 */
	EReference getPort_Requis_Beta_DB_Attachment_beta_db();

	/**
	 * Returns the meta object for class '{@link client_serveur.Port_Fourni_SM_Alpha <em>Port Fourni SM Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Fourni SM Alpha</em>'.
	 * @see client_serveur.Port_Fourni_SM_Alpha
	 * @generated
	 */
	EClass getPort_Fourni_SM_Alpha();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Port_Fourni_SM_Alpha#getAttachment_sm_alpha <em>Attachment sm alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment sm alpha</em>'.
	 * @see client_serveur.Port_Fourni_SM_Alpha#getAttachment_sm_alpha()
	 * @see #getPort_Fourni_SM_Alpha()
	 * @generated
	 */
	EReference getPort_Fourni_SM_Alpha_Attachment_sm_alpha();

	/**
	 * Returns the meta object for class '{@link client_serveur.Port_Requis_Alpha_SM <em>Port Requis Alpha SM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Requis Alpha SM</em>'.
	 * @see client_serveur.Port_Requis_Alpha_SM
	 * @generated
	 */
	EClass getPort_Requis_Alpha_SM();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Port_Requis_Alpha_SM#getAttachment_alpha_sm <em>Attachment alpha sm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment alpha sm</em>'.
	 * @see client_serveur.Port_Requis_Alpha_SM#getAttachment_alpha_sm()
	 * @see #getPort_Requis_Alpha_SM()
	 * @generated
	 */
	EReference getPort_Requis_Alpha_SM_Attachment_alpha_sm();

	/**
	 * Returns the meta object for class '{@link client_serveur.Port_Fourni_SM_Beta <em>Port Fourni SM Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Fourni SM Beta</em>'.
	 * @see client_serveur.Port_Fourni_SM_Beta
	 * @generated
	 */
	EClass getPort_Fourni_SM_Beta();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Port_Fourni_SM_Beta#getAttachment_sm_beta <em>Attachment sm beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment sm beta</em>'.
	 * @see client_serveur.Port_Fourni_SM_Beta#getAttachment_sm_beta()
	 * @see #getPort_Fourni_SM_Beta()
	 * @generated
	 */
	EReference getPort_Fourni_SM_Beta_Attachment_sm_beta();

	/**
	 * Returns the meta object for class '{@link client_serveur.Port_Requis_Beta_SM <em>Port Requis Beta SM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Requis Beta SM</em>'.
	 * @see client_serveur.Port_Requis_Beta_SM
	 * @generated
	 */
	EClass getPort_Requis_Beta_SM();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Port_Requis_Beta_SM#getAttachment_beta_sm <em>Attachment beta sm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment beta sm</em>'.
	 * @see client_serveur.Port_Requis_Beta_SM#getAttachment_beta_sm()
	 * @see #getPort_Requis_Beta_SM()
	 * @generated
	 */
	EReference getPort_Requis_Beta_SM_Attachment_beta_sm();

	/**
	 * Returns the meta object for class '{@link client_serveur.Beta <em>Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beta</em>'.
	 * @see client_serveur.Beta
	 * @generated
	 */
	EClass getBeta();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Beta#getInterface_beta <em>Interface beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface beta</em>'.
	 * @see client_serveur.Beta#getInterface_beta()
	 * @see #getBeta()
	 * @generated
	 */
	EReference getBeta_Interface_beta();

	/**
	 * Returns the meta object for class '{@link client_serveur.Alpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alpha</em>'.
	 * @see client_serveur.Alpha
	 * @generated
	 */
	EClass getAlpha();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Alpha#getInterface_alpha <em>Interface alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface alpha</em>'.
	 * @see client_serveur.Alpha#getInterface_alpha()
	 * @see #getAlpha()
	 * @generated
	 */
	EReference getAlpha_Interface_alpha();

	/**
	 * Returns the meta object for class '{@link client_serveur.Gamma <em>Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gamma</em>'.
	 * @see client_serveur.Gamma
	 * @generated
	 */
	EClass getGamma();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Gamma#getInterface_gamma <em>Interface gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface gamma</em>'.
	 * @see client_serveur.Gamma#getInterface_gamma()
	 * @see #getGamma()
	 * @generated
	 */
	EReference getGamma_Interface_gamma();

	/**
	 * Returns the meta object for class '{@link client_serveur.Interface_Beta <em>Interface Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Beta</em>'.
	 * @see client_serveur.Interface_Beta
	 * @generated
	 */
	EClass getInterface_Beta();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Beta#getRole_fourni_beta_sm <em>Role fourni beta sm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role fourni beta sm</em>'.
	 * @see client_serveur.Interface_Beta#getRole_fourni_beta_sm()
	 * @see #getInterface_Beta()
	 * @generated
	 */
	EReference getInterface_Beta_Role_fourni_beta_sm();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Beta#getRole_requis_sm_beta <em>Role requis sm beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role requis sm beta</em>'.
	 * @see client_serveur.Interface_Beta#getRole_requis_sm_beta()
	 * @see #getInterface_Beta()
	 * @generated
	 */
	EReference getInterface_Beta_Role_requis_sm_beta();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Beta#getRole_requis_db_beta <em>Role requis db beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role requis db beta</em>'.
	 * @see client_serveur.Interface_Beta#getRole_requis_db_beta()
	 * @see #getInterface_Beta()
	 * @generated
	 */
	EReference getInterface_Beta_Role_requis_db_beta();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Beta#getRole_fourni_beta_db <em>Role fourni beta db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role fourni beta db</em>'.
	 * @see client_serveur.Interface_Beta#getRole_fourni_beta_db()
	 * @see #getInterface_Beta()
	 * @generated
	 */
	EReference getInterface_Beta_Role_fourni_beta_db();

	/**
	 * Returns the meta object for class '{@link client_serveur.Interface_Alpha <em>Interface Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Alpha</em>'.
	 * @see client_serveur.Interface_Alpha
	 * @generated
	 */
	EClass getInterface_Alpha();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Alpha#getRole_fourni_alpha_sm <em>Role fourni alpha sm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role fourni alpha sm</em>'.
	 * @see client_serveur.Interface_Alpha#getRole_fourni_alpha_sm()
	 * @see #getInterface_Alpha()
	 * @generated
	 */
	EReference getInterface_Alpha_Role_fourni_alpha_sm();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Alpha#getRole_requis_sm_alpha <em>Role requis sm alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role requis sm alpha</em>'.
	 * @see client_serveur.Interface_Alpha#getRole_requis_sm_alpha()
	 * @see #getInterface_Alpha()
	 * @generated
	 */
	EReference getInterface_Alpha_Role_requis_sm_alpha();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Alpha#getRole_requis_cm_alpha <em>Role requis cm alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role requis cm alpha</em>'.
	 * @see client_serveur.Interface_Alpha#getRole_requis_cm_alpha()
	 * @see #getInterface_Alpha()
	 * @generated
	 */
	EReference getInterface_Alpha_Role_requis_cm_alpha();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Alpha#getRole_fourni_alpha_cm <em>Role fourni alpha cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role fourni alpha cm</em>'.
	 * @see client_serveur.Interface_Alpha#getRole_fourni_alpha_cm()
	 * @see #getInterface_Alpha()
	 * @generated
	 */
	EReference getInterface_Alpha_Role_fourni_alpha_cm();

	/**
	 * Returns the meta object for class '{@link client_serveur.Interface_Gamma <em>Interface Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Gamma</em>'.
	 * @see client_serveur.Interface_Gamma
	 * @generated
	 */
	EClass getInterface_Gamma();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Gamma#getRole_requis_cm_gamma <em>Role requis cm gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role requis cm gamma</em>'.
	 * @see client_serveur.Interface_Gamma#getRole_requis_cm_gamma()
	 * @see #getInterface_Gamma()
	 * @generated
	 */
	EReference getInterface_Gamma_Role_requis_cm_gamma();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Gamma#getRole_fourni_gamma_cm <em>Role fourni gamma cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role fourni gamma cm</em>'.
	 * @see client_serveur.Interface_Gamma#getRole_fourni_gamma_cm()
	 * @see #getInterface_Gamma()
	 * @generated
	 */
	EReference getInterface_Gamma_Role_fourni_gamma_cm();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Gamma#getRole_requis_db_gamma <em>Role requis db gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role requis db gamma</em>'.
	 * @see client_serveur.Interface_Gamma#getRole_requis_db_gamma()
	 * @see #getInterface_Gamma()
	 * @generated
	 */
	EReference getInterface_Gamma_Role_requis_db_gamma();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Gamma#getRole_fourni_gamma_db <em>Role fourni gamma db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role fourni gamma db</em>'.
	 * @see client_serveur.Interface_Gamma#getRole_fourni_gamma_db()
	 * @see #getInterface_Gamma()
	 * @generated
	 */
	EReference getInterface_Gamma_Role_fourni_gamma_db();

	/**
	 * Returns the meta object for class '{@link client_serveur.Role_Requis_SM_Beta <em>Role Requis SM Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Requis SM Beta</em>'.
	 * @see client_serveur.Role_Requis_SM_Beta
	 * @generated
	 */
	EClass getRole_Requis_SM_Beta();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Role_Requis_SM_Beta#getAttachment_sm_beta <em>Attachment sm beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment sm beta</em>'.
	 * @see client_serveur.Role_Requis_SM_Beta#getAttachment_sm_beta()
	 * @see #getRole_Requis_SM_Beta()
	 * @generated
	 */
	EReference getRole_Requis_SM_Beta_Attachment_sm_beta();

	/**
	 * Returns the meta object for class '{@link client_serveur.Role_Fourni_Beta_SM <em>Role Fourni Beta SM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Fourni Beta SM</em>'.
	 * @see client_serveur.Role_Fourni_Beta_SM
	 * @generated
	 */
	EClass getRole_Fourni_Beta_SM();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Role_Fourni_Beta_SM#getAttachment_beta_sm <em>Attachment beta sm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment beta sm</em>'.
	 * @see client_serveur.Role_Fourni_Beta_SM#getAttachment_beta_sm()
	 * @see #getRole_Fourni_Beta_SM()
	 * @generated
	 */
	EReference getRole_Fourni_Beta_SM_Attachment_beta_sm();

	/**
	 * Returns the meta object for class '{@link client_serveur.Role_Requis_DB_Beta <em>Role Requis DB Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Requis DB Beta</em>'.
	 * @see client_serveur.Role_Requis_DB_Beta
	 * @generated
	 */
	EClass getRole_Requis_DB_Beta();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Role_Requis_DB_Beta#getAttachment_db_beta <em>Attachment db beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment db beta</em>'.
	 * @see client_serveur.Role_Requis_DB_Beta#getAttachment_db_beta()
	 * @see #getRole_Requis_DB_Beta()
	 * @generated
	 */
	EReference getRole_Requis_DB_Beta_Attachment_db_beta();

	/**
	 * Returns the meta object for class '{@link client_serveur.Role_Fourni_Beta_DB <em>Role Fourni Beta DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Fourni Beta DB</em>'.
	 * @see client_serveur.Role_Fourni_Beta_DB
	 * @generated
	 */
	EClass getRole_Fourni_Beta_DB();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Role_Fourni_Beta_DB#getAttachment_beta_db <em>Attachment beta db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment beta db</em>'.
	 * @see client_serveur.Role_Fourni_Beta_DB#getAttachment_beta_db()
	 * @see #getRole_Fourni_Beta_DB()
	 * @generated
	 */
	EReference getRole_Fourni_Beta_DB_Attachment_beta_db();

	/**
	 * Returns the meta object for class '{@link client_serveur.Role_Fourni_Gamma_CM <em>Role Fourni Gamma CM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Fourni Gamma CM</em>'.
	 * @see client_serveur.Role_Fourni_Gamma_CM
	 * @generated
	 */
	EClass getRole_Fourni_Gamma_CM();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Role_Fourni_Gamma_CM#getAttachment_gamma_cm <em>Attachment gamma cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment gamma cm</em>'.
	 * @see client_serveur.Role_Fourni_Gamma_CM#getAttachment_gamma_cm()
	 * @see #getRole_Fourni_Gamma_CM()
	 * @generated
	 */
	EReference getRole_Fourni_Gamma_CM_Attachment_gamma_cm();

	/**
	 * Returns the meta object for class '{@link client_serveur.Role_Requis_CM_Gamma <em>Role Requis CM Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Requis CM Gamma</em>'.
	 * @see client_serveur.Role_Requis_CM_Gamma
	 * @generated
	 */
	EClass getRole_Requis_CM_Gamma();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Role_Requis_CM_Gamma#getAttachment_cm_gamma <em>Attachment cm gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment cm gamma</em>'.
	 * @see client_serveur.Role_Requis_CM_Gamma#getAttachment_cm_gamma()
	 * @see #getRole_Requis_CM_Gamma()
	 * @generated
	 */
	EReference getRole_Requis_CM_Gamma_Attachment_cm_gamma();

	/**
	 * Returns the meta object for class '{@link client_serveur.Role_Requis_DB_Gamma <em>Role Requis DB Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Requis DB Gamma</em>'.
	 * @see client_serveur.Role_Requis_DB_Gamma
	 * @generated
	 */
	EClass getRole_Requis_DB_Gamma();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Role_Requis_DB_Gamma#getAttachment_db_gamma <em>Attachment db gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment db gamma</em>'.
	 * @see client_serveur.Role_Requis_DB_Gamma#getAttachment_db_gamma()
	 * @see #getRole_Requis_DB_Gamma()
	 * @generated
	 */
	EReference getRole_Requis_DB_Gamma_Attachment_db_gamma();

	/**
	 * Returns the meta object for class '{@link client_serveur.Role_Fourni_Gamma_DB <em>Role Fourni Gamma DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Fourni Gamma DB</em>'.
	 * @see client_serveur.Role_Fourni_Gamma_DB
	 * @generated
	 */
	EClass getRole_Fourni_Gamma_DB();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Role_Fourni_Gamma_DB#getAttachment_gamma_db <em>Attachment gamma db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment gamma db</em>'.
	 * @see client_serveur.Role_Fourni_Gamma_DB#getAttachment_gamma_db()
	 * @see #getRole_Fourni_Gamma_DB()
	 * @generated
	 */
	EReference getRole_Fourni_Gamma_DB_Attachment_gamma_db();

	/**
	 * Returns the meta object for class '{@link client_serveur.Role_Requis_SM_Alpha <em>Role Requis SM Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Requis SM Alpha</em>'.
	 * @see client_serveur.Role_Requis_SM_Alpha
	 * @generated
	 */
	EClass getRole_Requis_SM_Alpha();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Role_Requis_SM_Alpha#getAttachment_sm_alpha <em>Attachment sm alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment sm alpha</em>'.
	 * @see client_serveur.Role_Requis_SM_Alpha#getAttachment_sm_alpha()
	 * @see #getRole_Requis_SM_Alpha()
	 * @generated
	 */
	EReference getRole_Requis_SM_Alpha_Attachment_sm_alpha();

	/**
	 * Returns the meta object for class '{@link client_serveur.Role_Fourni_Alpha_SM <em>Role Fourni Alpha SM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Fourni Alpha SM</em>'.
	 * @see client_serveur.Role_Fourni_Alpha_SM
	 * @generated
	 */
	EClass getRole_Fourni_Alpha_SM();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Role_Fourni_Alpha_SM#getAttachment_alpha_sm <em>Attachment alpha sm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment alpha sm</em>'.
	 * @see client_serveur.Role_Fourni_Alpha_SM#getAttachment_alpha_sm()
	 * @see #getRole_Fourni_Alpha_SM()
	 * @generated
	 */
	EReference getRole_Fourni_Alpha_SM_Attachment_alpha_sm();

	/**
	 * Returns the meta object for class '{@link client_serveur.Role_Requis_CM_Alpha <em>Role Requis CM Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Requis CM Alpha</em>'.
	 * @see client_serveur.Role_Requis_CM_Alpha
	 * @generated
	 */
	EClass getRole_Requis_CM_Alpha();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Role_Requis_CM_Alpha#getAttachment_cm_alpha <em>Attachment cm alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment cm alpha</em>'.
	 * @see client_serveur.Role_Requis_CM_Alpha#getAttachment_cm_alpha()
	 * @see #getRole_Requis_CM_Alpha()
	 * @generated
	 */
	EReference getRole_Requis_CM_Alpha_Attachment_cm_alpha();

	/**
	 * Returns the meta object for class '{@link client_serveur.Role_Fourni_Alpha_CM <em>Role Fourni Alpha CM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Fourni Alpha CM</em>'.
	 * @see client_serveur.Role_Fourni_Alpha_CM
	 * @generated
	 */
	EClass getRole_Fourni_Alpha_CM();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Role_Fourni_Alpha_CM#getAttachment_alpha_cm <em>Attachment alpha cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment alpha cm</em>'.
	 * @see client_serveur.Role_Fourni_Alpha_CM#getAttachment_alpha_cm()
	 * @see #getRole_Fourni_Alpha_CM()
	 * @generated
	 */
	EReference getRole_Fourni_Alpha_CM_Attachment_alpha_cm();

	/**
	 * Returns the meta object for class '{@link client_serveur.Attachment_SM_Alpha <em>Attachment SM Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment SM Alpha</em>'.
	 * @see client_serveur.Attachment_SM_Alpha
	 * @generated
	 */
	EClass getAttachment_SM_Alpha();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_SM_Alpha#getPort_fourni_sm_alpha <em>Port fourni sm alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port fourni sm alpha</em>'.
	 * @see client_serveur.Attachment_SM_Alpha#getPort_fourni_sm_alpha()
	 * @see #getAttachment_SM_Alpha()
	 * @generated
	 */
	EReference getAttachment_SM_Alpha_Port_fourni_sm_alpha();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_SM_Alpha#getRole_requis_sm_alpha <em>Role requis sm alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role requis sm alpha</em>'.
	 * @see client_serveur.Attachment_SM_Alpha#getRole_requis_sm_alpha()
	 * @see #getAttachment_SM_Alpha()
	 * @generated
	 */
	EReference getAttachment_SM_Alpha_Role_requis_sm_alpha();

	/**
	 * Returns the meta object for class '{@link client_serveur.Attachment_Alpha_SM <em>Attachment Alpha SM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment Alpha SM</em>'.
	 * @see client_serveur.Attachment_Alpha_SM
	 * @generated
	 */
	EClass getAttachment_Alpha_SM();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_Alpha_SM#getPort_requis_alpha_sm <em>Port requis alpha sm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port requis alpha sm</em>'.
	 * @see client_serveur.Attachment_Alpha_SM#getPort_requis_alpha_sm()
	 * @see #getAttachment_Alpha_SM()
	 * @generated
	 */
	EReference getAttachment_Alpha_SM_Port_requis_alpha_sm();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_Alpha_SM#getRole_fourni_alpha_sm <em>Role fourni alpha sm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role fourni alpha sm</em>'.
	 * @see client_serveur.Attachment_Alpha_SM#getRole_fourni_alpha_sm()
	 * @see #getAttachment_Alpha_SM()
	 * @generated
	 */
	EReference getAttachment_Alpha_SM_Role_fourni_alpha_sm();

	/**
	 * Returns the meta object for class '{@link client_serveur.Attachment_CM_Alpha <em>Attachment CM Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment CM Alpha</em>'.
	 * @see client_serveur.Attachment_CM_Alpha
	 * @generated
	 */
	EClass getAttachment_CM_Alpha();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_CM_Alpha#getRole_requis_cm_alpha <em>Role requis cm alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role requis cm alpha</em>'.
	 * @see client_serveur.Attachment_CM_Alpha#getRole_requis_cm_alpha()
	 * @see #getAttachment_CM_Alpha()
	 * @generated
	 */
	EReference getAttachment_CM_Alpha_Role_requis_cm_alpha();

	/**
	 * Returns the meta object for class '{@link client_serveur.Attachment_Alpha_CM <em>Attachment Alpha CM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment Alpha CM</em>'.
	 * @see client_serveur.Attachment_Alpha_CM
	 * @generated
	 */
	EClass getAttachment_Alpha_CM();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_Alpha_CM#getPort_requis_alpha_cm <em>Port requis alpha cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port requis alpha cm</em>'.
	 * @see client_serveur.Attachment_Alpha_CM#getPort_requis_alpha_cm()
	 * @see #getAttachment_Alpha_CM()
	 * @generated
	 */
	EReference getAttachment_Alpha_CM_Port_requis_alpha_cm();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_Alpha_CM#getRole_fourni_alpha_cm <em>Role fourni alpha cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role fourni alpha cm</em>'.
	 * @see client_serveur.Attachment_Alpha_CM#getRole_fourni_alpha_cm()
	 * @see #getAttachment_Alpha_CM()
	 * @generated
	 */
	EReference getAttachment_Alpha_CM_Role_fourni_alpha_cm();

	/**
	 * Returns the meta object for class '{@link client_serveur.Attachment_SM_Beta <em>Attachment SM Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment SM Beta</em>'.
	 * @see client_serveur.Attachment_SM_Beta
	 * @generated
	 */
	EClass getAttachment_SM_Beta();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_SM_Beta#getPort_fourni_sm_beta <em>Port fourni sm beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port fourni sm beta</em>'.
	 * @see client_serveur.Attachment_SM_Beta#getPort_fourni_sm_beta()
	 * @see #getAttachment_SM_Beta()
	 * @generated
	 */
	EReference getAttachment_SM_Beta_Port_fourni_sm_beta();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_SM_Beta#getRole_requis_sm_beta <em>Role requis sm beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role requis sm beta</em>'.
	 * @see client_serveur.Attachment_SM_Beta#getRole_requis_sm_beta()
	 * @see #getAttachment_SM_Beta()
	 * @generated
	 */
	EReference getAttachment_SM_Beta_Role_requis_sm_beta();

	/**
	 * Returns the meta object for class '{@link client_serveur.Attachment_Beta_SM <em>Attachment Beta SM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment Beta SM</em>'.
	 * @see client_serveur.Attachment_Beta_SM
	 * @generated
	 */
	EClass getAttachment_Beta_SM();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_Beta_SM#getPort_requis_beta_sm <em>Port requis beta sm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port requis beta sm</em>'.
	 * @see client_serveur.Attachment_Beta_SM#getPort_requis_beta_sm()
	 * @see #getAttachment_Beta_SM()
	 * @generated
	 */
	EReference getAttachment_Beta_SM_Port_requis_beta_sm();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_Beta_SM#getRole_fourni_beta_sm <em>Role fourni beta sm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role fourni beta sm</em>'.
	 * @see client_serveur.Attachment_Beta_SM#getRole_fourni_beta_sm()
	 * @see #getAttachment_Beta_SM()
	 * @generated
	 */
	EReference getAttachment_Beta_SM_Role_fourni_beta_sm();

	/**
	 * Returns the meta object for class '{@link client_serveur.Attachment_DB_Beta <em>Attachment DB Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment DB Beta</em>'.
	 * @see client_serveur.Attachment_DB_Beta
	 * @generated
	 */
	EClass getAttachment_DB_Beta();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_DB_Beta#getPort_fourni_db_beta <em>Port fourni db beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port fourni db beta</em>'.
	 * @see client_serveur.Attachment_DB_Beta#getPort_fourni_db_beta()
	 * @see #getAttachment_DB_Beta()
	 * @generated
	 */
	EReference getAttachment_DB_Beta_Port_fourni_db_beta();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_DB_Beta#getRole_requis_db_beta <em>Role requis db beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role requis db beta</em>'.
	 * @see client_serveur.Attachment_DB_Beta#getRole_requis_db_beta()
	 * @see #getAttachment_DB_Beta()
	 * @generated
	 */
	EReference getAttachment_DB_Beta_Role_requis_db_beta();

	/**
	 * Returns the meta object for class '{@link client_serveur.Attachment_Beta_DB <em>Attachment Beta DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment Beta DB</em>'.
	 * @see client_serveur.Attachment_Beta_DB
	 * @generated
	 */
	EClass getAttachment_Beta_DB();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_Beta_DB#getPort_requis_beta_db <em>Port requis beta db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port requis beta db</em>'.
	 * @see client_serveur.Attachment_Beta_DB#getPort_requis_beta_db()
	 * @see #getAttachment_Beta_DB()
	 * @generated
	 */
	EReference getAttachment_Beta_DB_Port_requis_beta_db();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_Beta_DB#getRole_fourni_beta_db <em>Role fourni beta db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role fourni beta db</em>'.
	 * @see client_serveur.Attachment_Beta_DB#getRole_fourni_beta_db()
	 * @see #getAttachment_Beta_DB()
	 * @generated
	 */
	EReference getAttachment_Beta_DB_Role_fourni_beta_db();

	/**
	 * Returns the meta object for class '{@link client_serveur.Attachment_CM_Gamma <em>Attachment CM Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment CM Gamma</em>'.
	 * @see client_serveur.Attachment_CM_Gamma
	 * @generated
	 */
	EClass getAttachment_CM_Gamma();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_CM_Gamma#getRole_requis_cm_gamma <em>Role requis cm gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role requis cm gamma</em>'.
	 * @see client_serveur.Attachment_CM_Gamma#getRole_requis_cm_gamma()
	 * @see #getAttachment_CM_Gamma()
	 * @generated
	 */
	EReference getAttachment_CM_Gamma_Role_requis_cm_gamma();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_CM_Gamma#getPort_fourni_cm_gamma <em>Port fourni cm gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port fourni cm gamma</em>'.
	 * @see client_serveur.Attachment_CM_Gamma#getPort_fourni_cm_gamma()
	 * @see #getAttachment_CM_Gamma()
	 * @generated
	 */
	EReference getAttachment_CM_Gamma_Port_fourni_cm_gamma();

	/**
	 * Returns the meta object for class '{@link client_serveur.Attachment_Gamma_CM <em>Attachment Gamma CM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment Gamma CM</em>'.
	 * @see client_serveur.Attachment_Gamma_CM
	 * @generated
	 */
	EClass getAttachment_Gamma_CM();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_Gamma_CM#getRole_fourni_gamma_cm <em>Role fourni gamma cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role fourni gamma cm</em>'.
	 * @see client_serveur.Attachment_Gamma_CM#getRole_fourni_gamma_cm()
	 * @see #getAttachment_Gamma_CM()
	 * @generated
	 */
	EReference getAttachment_Gamma_CM_Role_fourni_gamma_cm();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_Gamma_CM#getPort_requis_gamma_cm <em>Port requis gamma cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port requis gamma cm</em>'.
	 * @see client_serveur.Attachment_Gamma_CM#getPort_requis_gamma_cm()
	 * @see #getAttachment_Gamma_CM()
	 * @generated
	 */
	EReference getAttachment_Gamma_CM_Port_requis_gamma_cm();

	/**
	 * Returns the meta object for class '{@link client_serveur.Attachment_DB_Gamma <em>Attachment DB Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment DB Gamma</em>'.
	 * @see client_serveur.Attachment_DB_Gamma
	 * @generated
	 */
	EClass getAttachment_DB_Gamma();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_DB_Gamma#getRole_requis_db_gamma <em>Role requis db gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role requis db gamma</em>'.
	 * @see client_serveur.Attachment_DB_Gamma#getRole_requis_db_gamma()
	 * @see #getAttachment_DB_Gamma()
	 * @generated
	 */
	EReference getAttachment_DB_Gamma_Role_requis_db_gamma();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_DB_Gamma#getPort_fourni_db_gamma <em>Port fourni db gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port fourni db gamma</em>'.
	 * @see client_serveur.Attachment_DB_Gamma#getPort_fourni_db_gamma()
	 * @see #getAttachment_DB_Gamma()
	 * @generated
	 */
	EReference getAttachment_DB_Gamma_Port_fourni_db_gamma();

	/**
	 * Returns the meta object for class '{@link client_serveur.Attachment_Gamma_DB <em>Attachment Gamma DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment Gamma DB</em>'.
	 * @see client_serveur.Attachment_Gamma_DB
	 * @generated
	 */
	EClass getAttachment_Gamma_DB();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_Gamma_DB#getRole_fourni_gamma_db <em>Role fourni gamma db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role fourni gamma db</em>'.
	 * @see client_serveur.Attachment_Gamma_DB#getRole_fourni_gamma_db()
	 * @see #getAttachment_Gamma_DB()
	 * @generated
	 */
	EReference getAttachment_Gamma_DB_Role_fourni_gamma_db();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Attachment_Gamma_DB#getPort_requis_gamma_db <em>Port requis gamma db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port requis gamma db</em>'.
	 * @see client_serveur.Attachment_Gamma_DB#getPort_requis_gamma_db()
	 * @see #getAttachment_Gamma_DB()
	 * @generated
	 */
	EReference getAttachment_Gamma_DB_Port_requis_gamma_db();

	/**
	 * Returns the meta object for class '{@link client_serveur.Port_Serveur_Comp_Serveur_Comf <em>Port Serveur Comp Serveur Comf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Serveur Comp Serveur Comf</em>'.
	 * @see client_serveur.Port_Serveur_Comp_Serveur_Comf
	 * @generated
	 */
	EClass getPort_Serveur_Comp_Serveur_Comf();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Port_Serveur_Comp_Serveur_Comf#getBinding_serveur_comp_serveur_conf <em>Binding serveur comp serveur conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding serveur comp serveur conf</em>'.
	 * @see client_serveur.Port_Serveur_Comp_Serveur_Comf#getBinding_serveur_comp_serveur_conf()
	 * @see #getPort_Serveur_Comp_Serveur_Comf()
	 * @generated
	 */
	EReference getPort_Serveur_Comp_Serveur_Comf_Binding_serveur_comp_serveur_conf();

	/**
	 * Returns the meta object for class '{@link client_serveur.Interface_Serveur_Conf <em>Interface Serveur Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Serveur Conf</em>'.
	 * @see client_serveur.Interface_Serveur_Conf
	 * @generated
	 */
	EClass getInterface_Serveur_Conf();

	/**
	 * Returns the meta object for the containment reference list '{@link client_serveur.Interface_Serveur_Conf#getPort_serveur_conf_serveur_comp <em>Port serveur conf serveur comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port serveur conf serveur comp</em>'.
	 * @see client_serveur.Interface_Serveur_Conf#getPort_serveur_conf_serveur_comp()
	 * @see #getInterface_Serveur_Conf()
	 * @generated
	 */
	EReference getInterface_Serveur_Conf_Port_serveur_conf_serveur_comp();

	/**
	 * Returns the meta object for class '{@link client_serveur.Port_Serveur_Conf_Serveur_Comp <em>Port Serveur Conf Serveur Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Serveur Conf Serveur Comp</em>'.
	 * @see client_serveur.Port_Serveur_Conf_Serveur_Comp
	 * @generated
	 */
	EClass getPort_Serveur_Conf_Serveur_Comp();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Port_Serveur_Conf_Serveur_Comp#getBinding_serveur_comp_serveur_conf <em>Binding serveur comp serveur conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding serveur comp serveur conf</em>'.
	 * @see client_serveur.Port_Serveur_Conf_Serveur_Comp#getBinding_serveur_comp_serveur_conf()
	 * @see #getPort_Serveur_Conf_Serveur_Comp()
	 * @generated
	 */
	EReference getPort_Serveur_Conf_Serveur_Comp_Binding_serveur_comp_serveur_conf();

	/**
	 * Returns the meta object for class '{@link client_serveur.Binding_Serveur_Comp_Serveur_Conf <em>Binding Serveur Comp Serveur Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Serveur Comp Serveur Conf</em>'.
	 * @see client_serveur.Binding_Serveur_Comp_Serveur_Conf
	 * @generated
	 */
	EClass getBinding_Serveur_Comp_Serveur_Conf();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Binding_Serveur_Comp_Serveur_Conf#getPort_serveur_conf_serveur_comp <em>Port serveur conf serveur comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port serveur conf serveur comp</em>'.
	 * @see client_serveur.Binding_Serveur_Comp_Serveur_Conf#getPort_serveur_conf_serveur_comp()
	 * @see #getBinding_Serveur_Comp_Serveur_Conf()
	 * @generated
	 */
	EReference getBinding_Serveur_Comp_Serveur_Conf_Port_serveur_conf_serveur_comp();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Binding_Serveur_Comp_Serveur_Conf#getPort_serveur_comp_serveur_comf <em>Port serveur comp serveur comf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port serveur comp serveur comf</em>'.
	 * @see client_serveur.Binding_Serveur_Comp_Serveur_Conf#getPort_serveur_comp_serveur_comf()
	 * @see #getBinding_Serveur_Comp_Serveur_Conf()
	 * @generated
	 */
	EReference getBinding_Serveur_Comp_Serveur_Conf_Port_serveur_comp_serveur_comf();

	/**
	 * Returns the meta object for class '{@link client_serveur.Port_CM_Serveur_Comp <em>Port CM Serveur Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port CM Serveur Comp</em>'.
	 * @see client_serveur.Port_CM_Serveur_Comp
	 * @generated
	 */
	EClass getPort_CM_Serveur_Comp();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Port_CM_Serveur_Comp#getBinding_serveur_comp_cm <em>Binding serveur comp cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding serveur comp cm</em>'.
	 * @see client_serveur.Port_CM_Serveur_Comp#getBinding_serveur_comp_cm()
	 * @see #getPort_CM_Serveur_Comp()
	 * @generated
	 */
	EReference getPort_CM_Serveur_Comp_Binding_serveur_comp_cm();

	/**
	 * Returns the meta object for class '{@link client_serveur.Port_Serveur_Comp_CM <em>Port Serveur Comp CM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Serveur Comp CM</em>'.
	 * @see client_serveur.Port_Serveur_Comp_CM
	 * @generated
	 */
	EClass getPort_Serveur_Comp_CM();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Port_Serveur_Comp_CM#getBinding_serveur_comp_cm <em>Binding serveur comp cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding serveur comp cm</em>'.
	 * @see client_serveur.Port_Serveur_Comp_CM#getBinding_serveur_comp_cm()
	 * @see #getPort_Serveur_Comp_CM()
	 * @generated
	 */
	EReference getPort_Serveur_Comp_CM_Binding_serveur_comp_cm();

	/**
	 * Returns the meta object for class '{@link client_serveur.Binding_Serveur_Comp_CM <em>Binding Serveur Comp CM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Serveur Comp CM</em>'.
	 * @see client_serveur.Binding_Serveur_Comp_CM
	 * @generated
	 */
	EClass getBinding_Serveur_Comp_CM();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Binding_Serveur_Comp_CM#getPort_cm_serveur_comp <em>Port cm serveur comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port cm serveur comp</em>'.
	 * @see client_serveur.Binding_Serveur_Comp_CM#getPort_cm_serveur_comp()
	 * @see #getBinding_Serveur_Comp_CM()
	 * @generated
	 */
	EReference getBinding_Serveur_Comp_CM_Port_cm_serveur_comp();

	/**
	 * Returns the meta object for the reference '{@link client_serveur.Binding_Serveur_Comp_CM#getPort_serveur_comp_cm <em>Port serveur comp cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port serveur comp cm</em>'.
	 * @see client_serveur.Binding_Serveur_Comp_CM#getPort_serveur_comp_cm()
	 * @see #getBinding_Serveur_Comp_CM()
	 * @generated
	 */
	EReference getBinding_Serveur_Comp_CM_Port_serveur_comp_cm();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Client_serveurFactory getClient_serveurFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link client_serveur.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.ClientImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Interface client</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__INTERFACE_CLIENT = eINSTANCE.getClient_Interface_client();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.RPCImpl <em>RPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.RPCImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getRPC()
		 * @generated
		 */
		EClass RPC = eINSTANCE.getRPC();

		/**
		 * The meta object literal for the '<em><b>Interface rpc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC__INTERFACE_RPC = eINSTANCE.getRPC_Interface_rpc();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Client_serveurImpl <em>Client serveur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Client_serveurImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getClient_serveur()
		 * @generated
		 */
		EClass CLIENT_SERVEUR = eINSTANCE.getClient_serveur();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT_SERVEUR__CLIENT = eINSTANCE.getClient_serveur_Client();

		/**
		 * The meta object literal for the '<em><b>Rpc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT_SERVEUR__RPC = eINSTANCE.getClient_serveur_Rpc();

		/**
		 * The meta object literal for the '<em><b>Serveur</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT_SERVEUR__SERVEUR = eINSTANCE.getClient_serveur_Serveur();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Interface_ClientImpl <em>Interface Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Interface_ClientImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getInterface_Client()
		 * @generated
		 */
		EClass INTERFACE_CLIENT = eINSTANCE.getInterface_Client();

		/**
		 * The meta object literal for the '<em><b>Port fourni client</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CLIENT__PORT_FOURNI_CLIENT = eINSTANCE.getInterface_Client_Port_fourni_client();

		/**
		 * The meta object literal for the '<em><b>Port requis client</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CLIENT__PORT_REQUIS_CLIENT = eINSTANCE.getInterface_Client_Port_requis_client();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Interface_RPCImpl <em>Interface RPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Interface_RPCImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getInterface_RPC()
		 * @generated
		 */
		EClass INTERFACE_RPC = eINSTANCE.getInterface_RPC();

		/**
		 * The meta object literal for the '<em><b>Role fourni rpc client</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_RPC__ROLE_FOURNI_RPC_CLIENT = eINSTANCE.getInterface_RPC_Role_fourni_rpc_client();

		/**
		 * The meta object literal for the '<em><b>Role requis rpc client</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_RPC__ROLE_REQUIS_RPC_CLIENT = eINSTANCE.getInterface_RPC_Role_requis_rpc_client();

		/**
		 * The meta object literal for the '<em><b>Role fourni rpc serveur</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_RPC__ROLE_FOURNI_RPC_SERVEUR = eINSTANCE.getInterface_RPC_Role_fourni_rpc_serveur();

		/**
		 * The meta object literal for the '<em><b>Role requis rpc serveur</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_RPC__ROLE_REQUIS_RPC_SERVEUR = eINSTANCE.getInterface_RPC_Role_requis_rpc_serveur();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.DataBaseImpl <em>Data Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.DataBaseImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getDataBase()
		 * @generated
		 */
		EClass DATA_BASE = eINSTANCE.getDataBase();

		/**
		 * The meta object literal for the '<em><b>Interface database</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BASE__INTERFACE_DATABASE = eINSTANCE.getDataBase_Interface_database();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Interface_DataBaseImpl <em>Interface Data Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Interface_DataBaseImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getInterface_DataBase()
		 * @generated
		 */
		EClass INTERFACE_DATA_BASE = eINSTANCE.getInterface_DataBase();

		/**
		 * The meta object literal for the '<em><b>Port fourni db gamma</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_DATA_BASE__PORT_FOURNI_DB_GAMMA = eINSTANCE.getInterface_DataBase_Port_fourni_db_gamma();

		/**
		 * The meta object literal for the '<em><b>Port requis gamma db</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_DATA_BASE__PORT_REQUIS_GAMMA_DB = eINSTANCE.getInterface_DataBase_Port_requis_gamma_db();

		/**
		 * The meta object literal for the '<em><b>Port fourni db beta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_DATA_BASE__PORT_FOURNI_DB_BETA = eINSTANCE.getInterface_DataBase_Port_fourni_db_beta();

		/**
		 * The meta object literal for the '<em><b>Port requis beta db</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_DATA_BASE__PORT_REQUIS_BETA_DB = eINSTANCE.getInterface_DataBase_Port_requis_beta_db();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Serveur_CompImpl <em>Serveur Comp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Serveur_CompImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getServeur_Comp()
		 * @generated
		 */
		EClass SERVEUR_COMP = eINSTANCE.getServeur_Comp();

		/**
		 * The meta object literal for the '<em><b>Interface serveur comp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_COMP__INTERFACE_SERVEUR_COMP = eINSTANCE.getServeur_Comp_Interface_serveur_comp();

		/**
		 * The meta object literal for the '<em><b>Serveur conf</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_COMP__SERVEUR_CONF = eINSTANCE.getServeur_Comp_Serveur_conf();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Interface_Serveur_CompImpl <em>Interface Serveur Comp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Interface_Serveur_CompImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getInterface_Serveur_Comp()
		 * @generated
		 */
		EClass INTERFACE_SERVEUR_COMP = eINSTANCE.getInterface_Serveur_Comp();

		/**
		 * The meta object literal for the '<em><b>Port requis serveur</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_SERVEUR_COMP__PORT_REQUIS_SERVEUR = eINSTANCE.getInterface_Serveur_Comp_Port_requis_serveur();

		/**
		 * The meta object literal for the '<em><b>Port fourni serveur</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_SERVEUR_COMP__PORT_FOURNI_SERVEUR = eINSTANCE.getInterface_Serveur_Comp_Port_fourni_serveur();

		/**
		 * The meta object literal for the '<em><b>Port serveur comp serveur comf</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_SERVEUR_COMP__PORT_SERVEUR_COMP_SERVEUR_COMF = eINSTANCE.getInterface_Serveur_Comp_Port_serveur_comp_serveur_comf();

		/**
		 * The meta object literal for the '<em><b>Port serveur comp cm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_SERVEUR_COMP__PORT_SERVEUR_COMP_CM = eINSTANCE.getInterface_Serveur_Comp_Port_serveur_comp_cm();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Serveur_ConfImpl <em>Serveur Conf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Serveur_ConfImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getServeur_Conf()
		 * @generated
		 */
		EClass SERVEUR_CONF = eINSTANCE.getServeur_Conf();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_CONF__DATABASE = eINSTANCE.getServeur_Conf_Database();

		/**
		 * The meta object literal for the '<em><b>Security manager</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_CONF__SECURITY_MANAGER = eINSTANCE.getServeur_Conf_Security_manager();

		/**
		 * The meta object literal for the '<em><b>Connection manager</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_CONF__CONNECTION_MANAGER = eINSTANCE.getServeur_Conf_Connection_manager();

		/**
		 * The meta object literal for the '<em><b>Gamma</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_CONF__GAMMA = eINSTANCE.getServeur_Conf_Gamma();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_CONF__ALPHA = eINSTANCE.getServeur_Conf_Alpha();

		/**
		 * The meta object literal for the '<em><b>Beta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_CONF__BETA = eINSTANCE.getServeur_Conf_Beta();

		/**
		 * The meta object literal for the '<em><b>Interface serveur conf</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_CONF__INTERFACE_SERVEUR_CONF = eINSTANCE.getServeur_Conf_Interface_serveur_conf();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Port_Requis_ServeurImpl <em>Port Requis Serveur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Port_Requis_ServeurImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Requis_Serveur()
		 * @generated
		 */
		EClass PORT_REQUIS_SERVEUR = eINSTANCE.getPort_Requis_Serveur();

		/**
		 * The meta object literal for the '<em><b>Attachment rpc serveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_REQUIS_SERVEUR__ATTACHMENT_RPC_SERVEUR = eINSTANCE.getPort_Requis_Serveur_Attachment_rpc_serveur();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Port_Fourni_ServeurImpl <em>Port Fourni Serveur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Port_Fourni_ServeurImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Fourni_Serveur()
		 * @generated
		 */
		EClass PORT_FOURNI_SERVEUR = eINSTANCE.getPort_Fourni_Serveur();

		/**
		 * The meta object literal for the '<em><b>Attachement serveur rpc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_FOURNI_SERVEUR__ATTACHEMENT_SERVEUR_RPC = eINSTANCE.getPort_Fourni_Serveur_Attachement_serveur_rpc();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Role_Requis_RPC_ClientImpl <em>Role Requis RPC Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Role_Requis_RPC_ClientImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Requis_RPC_Client()
		 * @generated
		 */
		EClass ROLE_REQUIS_RPC_CLIENT = eINSTANCE.getRole_Requis_RPC_Client();

		/**
		 * The meta object literal for the '<em><b>Attachment client rpc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_REQUIS_RPC_CLIENT__ATTACHMENT_CLIENT_RPC = eINSTANCE.getRole_Requis_RPC_Client_Attachment_client_rpc();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Role_Fourni_RPC_ClientImpl <em>Role Fourni RPC Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Role_Fourni_RPC_ClientImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Fourni_RPC_Client()
		 * @generated
		 */
		EClass ROLE_FOURNI_RPC_CLIENT = eINSTANCE.getRole_Fourni_RPC_Client();

		/**
		 * The meta object literal for the '<em><b>Attachment rpc client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_FOURNI_RPC_CLIENT__ATTACHMENT_RPC_CLIENT = eINSTANCE.getRole_Fourni_RPC_Client_Attachment_rpc_client();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Port_Requis_ClientImpl <em>Port Requis Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Port_Requis_ClientImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Requis_Client()
		 * @generated
		 */
		EClass PORT_REQUIS_CLIENT = eINSTANCE.getPort_Requis_Client();

		/**
		 * The meta object literal for the '<em><b>Attachment rpc client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_REQUIS_CLIENT__ATTACHMENT_RPC_CLIENT = eINSTANCE.getPort_Requis_Client_Attachment_rpc_client();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Port_Fourni_ClientImpl <em>Port Fourni Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Port_Fourni_ClientImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Fourni_Client()
		 * @generated
		 */
		EClass PORT_FOURNI_CLIENT = eINSTANCE.getPort_Fourni_Client();

		/**
		 * The meta object literal for the '<em><b>Attachment client rpc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_FOURNI_CLIENT__ATTACHMENT_CLIENT_RPC = eINSTANCE.getPort_Fourni_Client_Attachment_client_rpc();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Attachment_Client_RPCImpl <em>Attachment Client RPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Attachment_Client_RPCImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_Client_RPC()
		 * @generated
		 */
		EClass ATTACHMENT_CLIENT_RPC = eINSTANCE.getAttachment_Client_RPC();

		/**
		 * The meta object literal for the '<em><b>Port fourni client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_CLIENT_RPC__PORT_FOURNI_CLIENT = eINSTANCE.getAttachment_Client_RPC_Port_fourni_client();

		/**
		 * The meta object literal for the '<em><b>Role requis rpc client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_CLIENT_RPC__ROLE_REQUIS_RPC_CLIENT = eINSTANCE.getAttachment_Client_RPC_Role_requis_rpc_client();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Attachment_RPC_ClientImpl <em>Attachment RPC Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Attachment_RPC_ClientImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_RPC_Client()
		 * @generated
		 */
		EClass ATTACHMENT_RPC_CLIENT = eINSTANCE.getAttachment_RPC_Client();

		/**
		 * The meta object literal for the '<em><b>Port requis client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_RPC_CLIENT__PORT_REQUIS_CLIENT = eINSTANCE.getAttachment_RPC_Client_Port_requis_client();

		/**
		 * The meta object literal for the '<em><b>Role fourni rpc client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_RPC_CLIENT__ROLE_FOURNI_RPC_CLIENT = eINSTANCE.getAttachment_RPC_Client_Role_fourni_rpc_client();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Role_Requis_RPC_ServeurImpl <em>Role Requis RPC Serveur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Role_Requis_RPC_ServeurImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Requis_RPC_Serveur()
		 * @generated
		 */
		EClass ROLE_REQUIS_RPC_SERVEUR = eINSTANCE.getRole_Requis_RPC_Serveur();

		/**
		 * The meta object literal for the '<em><b>Attachement serveur rpc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_REQUIS_RPC_SERVEUR__ATTACHEMENT_SERVEUR_RPC = eINSTANCE.getRole_Requis_RPC_Serveur_Attachement_serveur_rpc();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Role_Fourni_RPC_ServeurImpl <em>Role Fourni RPC Serveur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Role_Fourni_RPC_ServeurImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Fourni_RPC_Serveur()
		 * @generated
		 */
		EClass ROLE_FOURNI_RPC_SERVEUR = eINSTANCE.getRole_Fourni_RPC_Serveur();

		/**
		 * The meta object literal for the '<em><b>Attachment rpc serveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_FOURNI_RPC_SERVEUR__ATTACHMENT_RPC_SERVEUR = eINSTANCE.getRole_Fourni_RPC_Serveur_Attachment_rpc_serveur();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Attachment_RPC_ServeurImpl <em>Attachment RPC Serveur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Attachment_RPC_ServeurImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_RPC_Serveur()
		 * @generated
		 */
		EClass ATTACHMENT_RPC_SERVEUR = eINSTANCE.getAttachment_RPC_Serveur();

		/**
		 * The meta object literal for the '<em><b>Role fourni rpc serveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_RPC_SERVEUR__ROLE_FOURNI_RPC_SERVEUR = eINSTANCE.getAttachment_RPC_Serveur_Role_fourni_rpc_serveur();

		/**
		 * The meta object literal for the '<em><b>Port requis serveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_RPC_SERVEUR__PORT_REQUIS_SERVEUR = eINSTANCE.getAttachment_RPC_Serveur_Port_requis_serveur();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Attachement_Serveur_RPCImpl <em>Attachement Serveur RPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Attachement_Serveur_RPCImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachement_Serveur_RPC()
		 * @generated
		 */
		EClass ATTACHEMENT_SERVEUR_RPC = eINSTANCE.getAttachement_Serveur_RPC();

		/**
		 * The meta object literal for the '<em><b>Role requis rpc serveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT_SERVEUR_RPC__ROLE_REQUIS_RPC_SERVEUR = eINSTANCE.getAttachement_Serveur_RPC_Role_requis_rpc_serveur();

		/**
		 * The meta object literal for the '<em><b>Port fourni serveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT_SERVEUR_RPC__PORT_FOURNI_SERVEUR = eINSTANCE.getAttachement_Serveur_RPC_Port_fourni_serveur();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Security_ManagerImpl <em>Security Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Security_ManagerImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getSecurity_Manager()
		 * @generated
		 */
		EClass SECURITY_MANAGER = eINSTANCE.getSecurity_Manager();

		/**
		 * The meta object literal for the '<em><b>Interface security manager</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MANAGER__INTERFACE_SECURITY_MANAGER = eINSTANCE.getSecurity_Manager_Interface_security_manager();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Connection_ManagerImpl <em>Connection Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Connection_ManagerImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getConnection_Manager()
		 * @generated
		 */
		EClass CONNECTION_MANAGER = eINSTANCE.getConnection_Manager();

		/**
		 * The meta object literal for the '<em><b>Interface connection manager</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_MANAGER__INTERFACE_CONNECTION_MANAGER = eINSTANCE.getConnection_Manager_Interface_connection_manager();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Interface_Connection_ManagerImpl <em>Interface Connection Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Interface_Connection_ManagerImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getInterface_Connection_Manager()
		 * @generated
		 */
		EClass INTERFACE_CONNECTION_MANAGER = eINSTANCE.getInterface_Connection_Manager();

		/**
		 * The meta object literal for the '<em><b>Port fourni cm gamma</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONNECTION_MANAGER__PORT_FOURNI_CM_GAMMA = eINSTANCE.getInterface_Connection_Manager_Port_fourni_cm_gamma();

		/**
		 * The meta object literal for the '<em><b>Port requis gamma cm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONNECTION_MANAGER__PORT_REQUIS_GAMMA_CM = eINSTANCE.getInterface_Connection_Manager_Port_requis_gamma_cm();

		/**
		 * The meta object literal for the '<em><b>Port fourni cm alpha</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONNECTION_MANAGER__PORT_FOURNI_CM_ALPHA = eINSTANCE.getInterface_Connection_Manager_Port_fourni_cm_alpha();

		/**
		 * The meta object literal for the '<em><b>Port requis alpha cm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONNECTION_MANAGER__PORT_REQUIS_ALPHA_CM = eINSTANCE.getInterface_Connection_Manager_Port_requis_alpha_cm();

		/**
		 * The meta object literal for the '<em><b>Port cm serveur comp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONNECTION_MANAGER__PORT_CM_SERVEUR_COMP = eINSTANCE.getInterface_Connection_Manager_Port_cm_serveur_comp();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Interface_Security_ManagerImpl <em>Interface Security Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Interface_Security_ManagerImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getInterface_Security_Manager()
		 * @generated
		 */
		EClass INTERFACE_SECURITY_MANAGER = eINSTANCE.getInterface_Security_Manager();

		/**
		 * The meta object literal for the '<em><b>Port fourni sm beta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_SECURITY_MANAGER__PORT_FOURNI_SM_BETA = eINSTANCE.getInterface_Security_Manager_Port_fourni_sm_beta();

		/**
		 * The meta object literal for the '<em><b>Port requis beta sm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_SECURITY_MANAGER__PORT_REQUIS_BETA_SM = eINSTANCE.getInterface_Security_Manager_Port_requis_beta_sm();

		/**
		 * The meta object literal for the '<em><b>Port fourni sm alpha</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_SECURITY_MANAGER__PORT_FOURNI_SM_ALPHA = eINSTANCE.getInterface_Security_Manager_Port_fourni_sm_alpha();

		/**
		 * The meta object literal for the '<em><b>Port requis alpha sm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_SECURITY_MANAGER__PORT_REQUIS_ALPHA_SM = eINSTANCE.getInterface_Security_Manager_Port_requis_alpha_sm();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Port_Requis_Alpha_CMImpl <em>Port Requis Alpha CM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Port_Requis_Alpha_CMImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Requis_Alpha_CM()
		 * @generated
		 */
		EClass PORT_REQUIS_ALPHA_CM = eINSTANCE.getPort_Requis_Alpha_CM();

		/**
		 * The meta object literal for the '<em><b>Attachment alpha cm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_REQUIS_ALPHA_CM__ATTACHMENT_ALPHA_CM = eINSTANCE.getPort_Requis_Alpha_CM_Attachment_alpha_cm();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Port_Fourni_CM_AlphaImpl <em>Port Fourni CM Alpha</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Port_Fourni_CM_AlphaImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Fourni_CM_Alpha()
		 * @generated
		 */
		EClass PORT_FOURNI_CM_ALPHA = eINSTANCE.getPort_Fourni_CM_Alpha();

		/**
		 * The meta object literal for the '<em><b>Attachment cm alpha</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_FOURNI_CM_ALPHA__ATTACHMENT_CM_ALPHA = eINSTANCE.getPort_Fourni_CM_Alpha_Attachment_cm_alpha();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Port_Fourni_CM_GammaImpl <em>Port Fourni CM Gamma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Port_Fourni_CM_GammaImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Fourni_CM_Gamma()
		 * @generated
		 */
		EClass PORT_FOURNI_CM_GAMMA = eINSTANCE.getPort_Fourni_CM_Gamma();

		/**
		 * The meta object literal for the '<em><b>Attachment cm gamma</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_FOURNI_CM_GAMMA__ATTACHMENT_CM_GAMMA = eINSTANCE.getPort_Fourni_CM_Gamma_Attachment_cm_gamma();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Port_Requis_Gamma_CMImpl <em>Port Requis Gamma CM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Port_Requis_Gamma_CMImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Requis_Gamma_CM()
		 * @generated
		 */
		EClass PORT_REQUIS_GAMMA_CM = eINSTANCE.getPort_Requis_Gamma_CM();

		/**
		 * The meta object literal for the '<em><b>Attachment gamma cm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_REQUIS_GAMMA_CM__ATTACHMENT_GAMMA_CM = eINSTANCE.getPort_Requis_Gamma_CM_Attachment_gamma_cm();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Port_Fourni_DB_GammaImpl <em>Port Fourni DB Gamma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Port_Fourni_DB_GammaImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Fourni_DB_Gamma()
		 * @generated
		 */
		EClass PORT_FOURNI_DB_GAMMA = eINSTANCE.getPort_Fourni_DB_Gamma();

		/**
		 * The meta object literal for the '<em><b>Attachment db gamma</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_FOURNI_DB_GAMMA__ATTACHMENT_DB_GAMMA = eINSTANCE.getPort_Fourni_DB_Gamma_Attachment_db_gamma();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Port_Requis_Gamma_DBImpl <em>Port Requis Gamma DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Port_Requis_Gamma_DBImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Requis_Gamma_DB()
		 * @generated
		 */
		EClass PORT_REQUIS_GAMMA_DB = eINSTANCE.getPort_Requis_Gamma_DB();

		/**
		 * The meta object literal for the '<em><b>Attachment gamma db</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_REQUIS_GAMMA_DB__ATTACHMENT_GAMMA_DB = eINSTANCE.getPort_Requis_Gamma_DB_Attachment_gamma_db();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Port_Fourni_DB_BetaImpl <em>Port Fourni DB Beta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Port_Fourni_DB_BetaImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Fourni_DB_Beta()
		 * @generated
		 */
		EClass PORT_FOURNI_DB_BETA = eINSTANCE.getPort_Fourni_DB_Beta();

		/**
		 * The meta object literal for the '<em><b>Attachment db beta</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_FOURNI_DB_BETA__ATTACHMENT_DB_BETA = eINSTANCE.getPort_Fourni_DB_Beta_Attachment_db_beta();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Port_Requis_Beta_DBImpl <em>Port Requis Beta DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Port_Requis_Beta_DBImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Requis_Beta_DB()
		 * @generated
		 */
		EClass PORT_REQUIS_BETA_DB = eINSTANCE.getPort_Requis_Beta_DB();

		/**
		 * The meta object literal for the '<em><b>Attachment beta db</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_REQUIS_BETA_DB__ATTACHMENT_BETA_DB = eINSTANCE.getPort_Requis_Beta_DB_Attachment_beta_db();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Port_Fourni_SM_AlphaImpl <em>Port Fourni SM Alpha</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Port_Fourni_SM_AlphaImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Fourni_SM_Alpha()
		 * @generated
		 */
		EClass PORT_FOURNI_SM_ALPHA = eINSTANCE.getPort_Fourni_SM_Alpha();

		/**
		 * The meta object literal for the '<em><b>Attachment sm alpha</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_FOURNI_SM_ALPHA__ATTACHMENT_SM_ALPHA = eINSTANCE.getPort_Fourni_SM_Alpha_Attachment_sm_alpha();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Port_Requis_Alpha_SMImpl <em>Port Requis Alpha SM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Port_Requis_Alpha_SMImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Requis_Alpha_SM()
		 * @generated
		 */
		EClass PORT_REQUIS_ALPHA_SM = eINSTANCE.getPort_Requis_Alpha_SM();

		/**
		 * The meta object literal for the '<em><b>Attachment alpha sm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_REQUIS_ALPHA_SM__ATTACHMENT_ALPHA_SM = eINSTANCE.getPort_Requis_Alpha_SM_Attachment_alpha_sm();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Port_Fourni_SM_BetaImpl <em>Port Fourni SM Beta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Port_Fourni_SM_BetaImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Fourni_SM_Beta()
		 * @generated
		 */
		EClass PORT_FOURNI_SM_BETA = eINSTANCE.getPort_Fourni_SM_Beta();

		/**
		 * The meta object literal for the '<em><b>Attachment sm beta</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_FOURNI_SM_BETA__ATTACHMENT_SM_BETA = eINSTANCE.getPort_Fourni_SM_Beta_Attachment_sm_beta();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Port_Requis_Beta_SMImpl <em>Port Requis Beta SM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Port_Requis_Beta_SMImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Requis_Beta_SM()
		 * @generated
		 */
		EClass PORT_REQUIS_BETA_SM = eINSTANCE.getPort_Requis_Beta_SM();

		/**
		 * The meta object literal for the '<em><b>Attachment beta sm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_REQUIS_BETA_SM__ATTACHMENT_BETA_SM = eINSTANCE.getPort_Requis_Beta_SM_Attachment_beta_sm();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.BetaImpl <em>Beta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.BetaImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getBeta()
		 * @generated
		 */
		EClass BETA = eINSTANCE.getBeta();

		/**
		 * The meta object literal for the '<em><b>Interface beta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BETA__INTERFACE_BETA = eINSTANCE.getBeta_Interface_beta();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.AlphaImpl <em>Alpha</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.AlphaImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getAlpha()
		 * @generated
		 */
		EClass ALPHA = eINSTANCE.getAlpha();

		/**
		 * The meta object literal for the '<em><b>Interface alpha</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALPHA__INTERFACE_ALPHA = eINSTANCE.getAlpha_Interface_alpha();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.GammaImpl <em>Gamma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.GammaImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getGamma()
		 * @generated
		 */
		EClass GAMMA = eINSTANCE.getGamma();

		/**
		 * The meta object literal for the '<em><b>Interface gamma</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMMA__INTERFACE_GAMMA = eINSTANCE.getGamma_Interface_gamma();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Interface_BetaImpl <em>Interface Beta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Interface_BetaImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getInterface_Beta()
		 * @generated
		 */
		EClass INTERFACE_BETA = eINSTANCE.getInterface_Beta();

		/**
		 * The meta object literal for the '<em><b>Role fourni beta sm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_BETA__ROLE_FOURNI_BETA_SM = eINSTANCE.getInterface_Beta_Role_fourni_beta_sm();

		/**
		 * The meta object literal for the '<em><b>Role requis sm beta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_BETA__ROLE_REQUIS_SM_BETA = eINSTANCE.getInterface_Beta_Role_requis_sm_beta();

		/**
		 * The meta object literal for the '<em><b>Role requis db beta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_BETA__ROLE_REQUIS_DB_BETA = eINSTANCE.getInterface_Beta_Role_requis_db_beta();

		/**
		 * The meta object literal for the '<em><b>Role fourni beta db</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_BETA__ROLE_FOURNI_BETA_DB = eINSTANCE.getInterface_Beta_Role_fourni_beta_db();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Interface_AlphaImpl <em>Interface Alpha</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Interface_AlphaImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getInterface_Alpha()
		 * @generated
		 */
		EClass INTERFACE_ALPHA = eINSTANCE.getInterface_Alpha();

		/**
		 * The meta object literal for the '<em><b>Role fourni alpha sm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_ALPHA__ROLE_FOURNI_ALPHA_SM = eINSTANCE.getInterface_Alpha_Role_fourni_alpha_sm();

		/**
		 * The meta object literal for the '<em><b>Role requis sm alpha</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_ALPHA__ROLE_REQUIS_SM_ALPHA = eINSTANCE.getInterface_Alpha_Role_requis_sm_alpha();

		/**
		 * The meta object literal for the '<em><b>Role requis cm alpha</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_ALPHA__ROLE_REQUIS_CM_ALPHA = eINSTANCE.getInterface_Alpha_Role_requis_cm_alpha();

		/**
		 * The meta object literal for the '<em><b>Role fourni alpha cm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_ALPHA__ROLE_FOURNI_ALPHA_CM = eINSTANCE.getInterface_Alpha_Role_fourni_alpha_cm();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Interface_GammaImpl <em>Interface Gamma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Interface_GammaImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getInterface_Gamma()
		 * @generated
		 */
		EClass INTERFACE_GAMMA = eINSTANCE.getInterface_Gamma();

		/**
		 * The meta object literal for the '<em><b>Role requis cm gamma</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_GAMMA__ROLE_REQUIS_CM_GAMMA = eINSTANCE.getInterface_Gamma_Role_requis_cm_gamma();

		/**
		 * The meta object literal for the '<em><b>Role fourni gamma cm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_GAMMA__ROLE_FOURNI_GAMMA_CM = eINSTANCE.getInterface_Gamma_Role_fourni_gamma_cm();

		/**
		 * The meta object literal for the '<em><b>Role requis db gamma</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_GAMMA__ROLE_REQUIS_DB_GAMMA = eINSTANCE.getInterface_Gamma_Role_requis_db_gamma();

		/**
		 * The meta object literal for the '<em><b>Role fourni gamma db</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_GAMMA__ROLE_FOURNI_GAMMA_DB = eINSTANCE.getInterface_Gamma_Role_fourni_gamma_db();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Role_Requis_SM_BetaImpl <em>Role Requis SM Beta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Role_Requis_SM_BetaImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Requis_SM_Beta()
		 * @generated
		 */
		EClass ROLE_REQUIS_SM_BETA = eINSTANCE.getRole_Requis_SM_Beta();

		/**
		 * The meta object literal for the '<em><b>Attachment sm beta</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_REQUIS_SM_BETA__ATTACHMENT_SM_BETA = eINSTANCE.getRole_Requis_SM_Beta_Attachment_sm_beta();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Role_Fourni_Beta_SMImpl <em>Role Fourni Beta SM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Role_Fourni_Beta_SMImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Fourni_Beta_SM()
		 * @generated
		 */
		EClass ROLE_FOURNI_BETA_SM = eINSTANCE.getRole_Fourni_Beta_SM();

		/**
		 * The meta object literal for the '<em><b>Attachment beta sm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_FOURNI_BETA_SM__ATTACHMENT_BETA_SM = eINSTANCE.getRole_Fourni_Beta_SM_Attachment_beta_sm();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Role_Requis_DB_BetaImpl <em>Role Requis DB Beta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Role_Requis_DB_BetaImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Requis_DB_Beta()
		 * @generated
		 */
		EClass ROLE_REQUIS_DB_BETA = eINSTANCE.getRole_Requis_DB_Beta();

		/**
		 * The meta object literal for the '<em><b>Attachment db beta</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_REQUIS_DB_BETA__ATTACHMENT_DB_BETA = eINSTANCE.getRole_Requis_DB_Beta_Attachment_db_beta();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Role_Fourni_Beta_DBImpl <em>Role Fourni Beta DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Role_Fourni_Beta_DBImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Fourni_Beta_DB()
		 * @generated
		 */
		EClass ROLE_FOURNI_BETA_DB = eINSTANCE.getRole_Fourni_Beta_DB();

		/**
		 * The meta object literal for the '<em><b>Attachment beta db</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_FOURNI_BETA_DB__ATTACHMENT_BETA_DB = eINSTANCE.getRole_Fourni_Beta_DB_Attachment_beta_db();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Role_Fourni_Gamma_CMImpl <em>Role Fourni Gamma CM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Role_Fourni_Gamma_CMImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Fourni_Gamma_CM()
		 * @generated
		 */
		EClass ROLE_FOURNI_GAMMA_CM = eINSTANCE.getRole_Fourni_Gamma_CM();

		/**
		 * The meta object literal for the '<em><b>Attachment gamma cm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_FOURNI_GAMMA_CM__ATTACHMENT_GAMMA_CM = eINSTANCE.getRole_Fourni_Gamma_CM_Attachment_gamma_cm();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Role_Requis_CM_GammaImpl <em>Role Requis CM Gamma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Role_Requis_CM_GammaImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Requis_CM_Gamma()
		 * @generated
		 */
		EClass ROLE_REQUIS_CM_GAMMA = eINSTANCE.getRole_Requis_CM_Gamma();

		/**
		 * The meta object literal for the '<em><b>Attachment cm gamma</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_REQUIS_CM_GAMMA__ATTACHMENT_CM_GAMMA = eINSTANCE.getRole_Requis_CM_Gamma_Attachment_cm_gamma();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Role_Requis_DB_GammaImpl <em>Role Requis DB Gamma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Role_Requis_DB_GammaImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Requis_DB_Gamma()
		 * @generated
		 */
		EClass ROLE_REQUIS_DB_GAMMA = eINSTANCE.getRole_Requis_DB_Gamma();

		/**
		 * The meta object literal for the '<em><b>Attachment db gamma</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_REQUIS_DB_GAMMA__ATTACHMENT_DB_GAMMA = eINSTANCE.getRole_Requis_DB_Gamma_Attachment_db_gamma();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Role_Fourni_Gamma_DBImpl <em>Role Fourni Gamma DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Role_Fourni_Gamma_DBImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Fourni_Gamma_DB()
		 * @generated
		 */
		EClass ROLE_FOURNI_GAMMA_DB = eINSTANCE.getRole_Fourni_Gamma_DB();

		/**
		 * The meta object literal for the '<em><b>Attachment gamma db</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_FOURNI_GAMMA_DB__ATTACHMENT_GAMMA_DB = eINSTANCE.getRole_Fourni_Gamma_DB_Attachment_gamma_db();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Role_Requis_SM_AlphaImpl <em>Role Requis SM Alpha</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Role_Requis_SM_AlphaImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Requis_SM_Alpha()
		 * @generated
		 */
		EClass ROLE_REQUIS_SM_ALPHA = eINSTANCE.getRole_Requis_SM_Alpha();

		/**
		 * The meta object literal for the '<em><b>Attachment sm alpha</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_REQUIS_SM_ALPHA__ATTACHMENT_SM_ALPHA = eINSTANCE.getRole_Requis_SM_Alpha_Attachment_sm_alpha();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Role_Fourni_Alpha_SMImpl <em>Role Fourni Alpha SM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Role_Fourni_Alpha_SMImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Fourni_Alpha_SM()
		 * @generated
		 */
		EClass ROLE_FOURNI_ALPHA_SM = eINSTANCE.getRole_Fourni_Alpha_SM();

		/**
		 * The meta object literal for the '<em><b>Attachment alpha sm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_FOURNI_ALPHA_SM__ATTACHMENT_ALPHA_SM = eINSTANCE.getRole_Fourni_Alpha_SM_Attachment_alpha_sm();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Role_Requis_CM_AlphaImpl <em>Role Requis CM Alpha</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Role_Requis_CM_AlphaImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Requis_CM_Alpha()
		 * @generated
		 */
		EClass ROLE_REQUIS_CM_ALPHA = eINSTANCE.getRole_Requis_CM_Alpha();

		/**
		 * The meta object literal for the '<em><b>Attachment cm alpha</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_REQUIS_CM_ALPHA__ATTACHMENT_CM_ALPHA = eINSTANCE.getRole_Requis_CM_Alpha_Attachment_cm_alpha();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Role_Fourni_Alpha_CMImpl <em>Role Fourni Alpha CM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Role_Fourni_Alpha_CMImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getRole_Fourni_Alpha_CM()
		 * @generated
		 */
		EClass ROLE_FOURNI_ALPHA_CM = eINSTANCE.getRole_Fourni_Alpha_CM();

		/**
		 * The meta object literal for the '<em><b>Attachment alpha cm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_FOURNI_ALPHA_CM__ATTACHMENT_ALPHA_CM = eINSTANCE.getRole_Fourni_Alpha_CM_Attachment_alpha_cm();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Attachment_SM_AlphaImpl <em>Attachment SM Alpha</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Attachment_SM_AlphaImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_SM_Alpha()
		 * @generated
		 */
		EClass ATTACHMENT_SM_ALPHA = eINSTANCE.getAttachment_SM_Alpha();

		/**
		 * The meta object literal for the '<em><b>Port fourni sm alpha</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SM_ALPHA__PORT_FOURNI_SM_ALPHA = eINSTANCE.getAttachment_SM_Alpha_Port_fourni_sm_alpha();

		/**
		 * The meta object literal for the '<em><b>Role requis sm alpha</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SM_ALPHA__ROLE_REQUIS_SM_ALPHA = eINSTANCE.getAttachment_SM_Alpha_Role_requis_sm_alpha();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Attachment_Alpha_SMImpl <em>Attachment Alpha SM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Attachment_Alpha_SMImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_Alpha_SM()
		 * @generated
		 */
		EClass ATTACHMENT_ALPHA_SM = eINSTANCE.getAttachment_Alpha_SM();

		/**
		 * The meta object literal for the '<em><b>Port requis alpha sm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_ALPHA_SM__PORT_REQUIS_ALPHA_SM = eINSTANCE.getAttachment_Alpha_SM_Port_requis_alpha_sm();

		/**
		 * The meta object literal for the '<em><b>Role fourni alpha sm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_ALPHA_SM__ROLE_FOURNI_ALPHA_SM = eINSTANCE.getAttachment_Alpha_SM_Role_fourni_alpha_sm();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Attachment_CM_AlphaImpl <em>Attachment CM Alpha</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Attachment_CM_AlphaImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_CM_Alpha()
		 * @generated
		 */
		EClass ATTACHMENT_CM_ALPHA = eINSTANCE.getAttachment_CM_Alpha();

		/**
		 * The meta object literal for the '<em><b>Role requis cm alpha</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_CM_ALPHA__ROLE_REQUIS_CM_ALPHA = eINSTANCE.getAttachment_CM_Alpha_Role_requis_cm_alpha();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Attachment_Alpha_CMImpl <em>Attachment Alpha CM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Attachment_Alpha_CMImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_Alpha_CM()
		 * @generated
		 */
		EClass ATTACHMENT_ALPHA_CM = eINSTANCE.getAttachment_Alpha_CM();

		/**
		 * The meta object literal for the '<em><b>Port requis alpha cm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_ALPHA_CM__PORT_REQUIS_ALPHA_CM = eINSTANCE.getAttachment_Alpha_CM_Port_requis_alpha_cm();

		/**
		 * The meta object literal for the '<em><b>Role fourni alpha cm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_ALPHA_CM__ROLE_FOURNI_ALPHA_CM = eINSTANCE.getAttachment_Alpha_CM_Role_fourni_alpha_cm();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Attachment_SM_BetaImpl <em>Attachment SM Beta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Attachment_SM_BetaImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_SM_Beta()
		 * @generated
		 */
		EClass ATTACHMENT_SM_BETA = eINSTANCE.getAttachment_SM_Beta();

		/**
		 * The meta object literal for the '<em><b>Port fourni sm beta</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SM_BETA__PORT_FOURNI_SM_BETA = eINSTANCE.getAttachment_SM_Beta_Port_fourni_sm_beta();

		/**
		 * The meta object literal for the '<em><b>Role requis sm beta</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SM_BETA__ROLE_REQUIS_SM_BETA = eINSTANCE.getAttachment_SM_Beta_Role_requis_sm_beta();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Attachment_Beta_SMImpl <em>Attachment Beta SM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Attachment_Beta_SMImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_Beta_SM()
		 * @generated
		 */
		EClass ATTACHMENT_BETA_SM = eINSTANCE.getAttachment_Beta_SM();

		/**
		 * The meta object literal for the '<em><b>Port requis beta sm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_BETA_SM__PORT_REQUIS_BETA_SM = eINSTANCE.getAttachment_Beta_SM_Port_requis_beta_sm();

		/**
		 * The meta object literal for the '<em><b>Role fourni beta sm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_BETA_SM__ROLE_FOURNI_BETA_SM = eINSTANCE.getAttachment_Beta_SM_Role_fourni_beta_sm();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Attachment_DB_BetaImpl <em>Attachment DB Beta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Attachment_DB_BetaImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_DB_Beta()
		 * @generated
		 */
		EClass ATTACHMENT_DB_BETA = eINSTANCE.getAttachment_DB_Beta();

		/**
		 * The meta object literal for the '<em><b>Port fourni db beta</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_DB_BETA__PORT_FOURNI_DB_BETA = eINSTANCE.getAttachment_DB_Beta_Port_fourni_db_beta();

		/**
		 * The meta object literal for the '<em><b>Role requis db beta</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_DB_BETA__ROLE_REQUIS_DB_BETA = eINSTANCE.getAttachment_DB_Beta_Role_requis_db_beta();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Attachment_Beta_DBImpl <em>Attachment Beta DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Attachment_Beta_DBImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_Beta_DB()
		 * @generated
		 */
		EClass ATTACHMENT_BETA_DB = eINSTANCE.getAttachment_Beta_DB();

		/**
		 * The meta object literal for the '<em><b>Port requis beta db</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_BETA_DB__PORT_REQUIS_BETA_DB = eINSTANCE.getAttachment_Beta_DB_Port_requis_beta_db();

		/**
		 * The meta object literal for the '<em><b>Role fourni beta db</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_BETA_DB__ROLE_FOURNI_BETA_DB = eINSTANCE.getAttachment_Beta_DB_Role_fourni_beta_db();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Attachment_CM_GammaImpl <em>Attachment CM Gamma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Attachment_CM_GammaImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_CM_Gamma()
		 * @generated
		 */
		EClass ATTACHMENT_CM_GAMMA = eINSTANCE.getAttachment_CM_Gamma();

		/**
		 * The meta object literal for the '<em><b>Role requis cm gamma</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_CM_GAMMA__ROLE_REQUIS_CM_GAMMA = eINSTANCE.getAttachment_CM_Gamma_Role_requis_cm_gamma();

		/**
		 * The meta object literal for the '<em><b>Port fourni cm gamma</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_CM_GAMMA__PORT_FOURNI_CM_GAMMA = eINSTANCE.getAttachment_CM_Gamma_Port_fourni_cm_gamma();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Attachment_Gamma_CMImpl <em>Attachment Gamma CM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Attachment_Gamma_CMImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_Gamma_CM()
		 * @generated
		 */
		EClass ATTACHMENT_GAMMA_CM = eINSTANCE.getAttachment_Gamma_CM();

		/**
		 * The meta object literal for the '<em><b>Role fourni gamma cm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_GAMMA_CM__ROLE_FOURNI_GAMMA_CM = eINSTANCE.getAttachment_Gamma_CM_Role_fourni_gamma_cm();

		/**
		 * The meta object literal for the '<em><b>Port requis gamma cm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_GAMMA_CM__PORT_REQUIS_GAMMA_CM = eINSTANCE.getAttachment_Gamma_CM_Port_requis_gamma_cm();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Attachment_DB_GammaImpl <em>Attachment DB Gamma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Attachment_DB_GammaImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_DB_Gamma()
		 * @generated
		 */
		EClass ATTACHMENT_DB_GAMMA = eINSTANCE.getAttachment_DB_Gamma();

		/**
		 * The meta object literal for the '<em><b>Role requis db gamma</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_DB_GAMMA__ROLE_REQUIS_DB_GAMMA = eINSTANCE.getAttachment_DB_Gamma_Role_requis_db_gamma();

		/**
		 * The meta object literal for the '<em><b>Port fourni db gamma</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_DB_GAMMA__PORT_FOURNI_DB_GAMMA = eINSTANCE.getAttachment_DB_Gamma_Port_fourni_db_gamma();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Attachment_Gamma_DBImpl <em>Attachment Gamma DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Attachment_Gamma_DBImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getAttachment_Gamma_DB()
		 * @generated
		 */
		EClass ATTACHMENT_GAMMA_DB = eINSTANCE.getAttachment_Gamma_DB();

		/**
		 * The meta object literal for the '<em><b>Role fourni gamma db</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_GAMMA_DB__ROLE_FOURNI_GAMMA_DB = eINSTANCE.getAttachment_Gamma_DB_Role_fourni_gamma_db();

		/**
		 * The meta object literal for the '<em><b>Port requis gamma db</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_GAMMA_DB__PORT_REQUIS_GAMMA_DB = eINSTANCE.getAttachment_Gamma_DB_Port_requis_gamma_db();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Port_Serveur_Comp_Serveur_ComfImpl <em>Port Serveur Comp Serveur Comf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Port_Serveur_Comp_Serveur_ComfImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Serveur_Comp_Serveur_Comf()
		 * @generated
		 */
		EClass PORT_SERVEUR_COMP_SERVEUR_COMF = eINSTANCE.getPort_Serveur_Comp_Serveur_Comf();

		/**
		 * The meta object literal for the '<em><b>Binding serveur comp serveur conf</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_SERVEUR_COMP_SERVEUR_COMF__BINDING_SERVEUR_COMP_SERVEUR_CONF = eINSTANCE.getPort_Serveur_Comp_Serveur_Comf_Binding_serveur_comp_serveur_conf();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Interface_Serveur_ConfImpl <em>Interface Serveur Conf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Interface_Serveur_ConfImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getInterface_Serveur_Conf()
		 * @generated
		 */
		EClass INTERFACE_SERVEUR_CONF = eINSTANCE.getInterface_Serveur_Conf();

		/**
		 * The meta object literal for the '<em><b>Port serveur conf serveur comp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_SERVEUR_CONF__PORT_SERVEUR_CONF_SERVEUR_COMP = eINSTANCE.getInterface_Serveur_Conf_Port_serveur_conf_serveur_comp();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Port_Serveur_Conf_Serveur_CompImpl <em>Port Serveur Conf Serveur Comp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Port_Serveur_Conf_Serveur_CompImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Serveur_Conf_Serveur_Comp()
		 * @generated
		 */
		EClass PORT_SERVEUR_CONF_SERVEUR_COMP = eINSTANCE.getPort_Serveur_Conf_Serveur_Comp();

		/**
		 * The meta object literal for the '<em><b>Binding serveur comp serveur conf</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_SERVEUR_CONF_SERVEUR_COMP__BINDING_SERVEUR_COMP_SERVEUR_CONF = eINSTANCE.getPort_Serveur_Conf_Serveur_Comp_Binding_serveur_comp_serveur_conf();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Binding_Serveur_Comp_Serveur_ConfImpl <em>Binding Serveur Comp Serveur Conf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Binding_Serveur_Comp_Serveur_ConfImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getBinding_Serveur_Comp_Serveur_Conf()
		 * @generated
		 */
		EClass BINDING_SERVEUR_COMP_SERVEUR_CONF = eINSTANCE.getBinding_Serveur_Comp_Serveur_Conf();

		/**
		 * The meta object literal for the '<em><b>Port serveur conf serveur comp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_SERVEUR_CONF_SERVEUR_COMP = eINSTANCE.getBinding_Serveur_Comp_Serveur_Conf_Port_serveur_conf_serveur_comp();

		/**
		 * The meta object literal for the '<em><b>Port serveur comp serveur comf</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_SERVEUR_COMP_SERVEUR_CONF__PORT_SERVEUR_COMP_SERVEUR_COMF = eINSTANCE.getBinding_Serveur_Comp_Serveur_Conf_Port_serveur_comp_serveur_comf();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Port_CM_Serveur_CompImpl <em>Port CM Serveur Comp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Port_CM_Serveur_CompImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_CM_Serveur_Comp()
		 * @generated
		 */
		EClass PORT_CM_SERVEUR_COMP = eINSTANCE.getPort_CM_Serveur_Comp();

		/**
		 * The meta object literal for the '<em><b>Binding serveur comp cm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_CM_SERVEUR_COMP__BINDING_SERVEUR_COMP_CM = eINSTANCE.getPort_CM_Serveur_Comp_Binding_serveur_comp_cm();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Port_Serveur_Comp_CMImpl <em>Port Serveur Comp CM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Port_Serveur_Comp_CMImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getPort_Serveur_Comp_CM()
		 * @generated
		 */
		EClass PORT_SERVEUR_COMP_CM = eINSTANCE.getPort_Serveur_Comp_CM();

		/**
		 * The meta object literal for the '<em><b>Binding serveur comp cm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_SERVEUR_COMP_CM__BINDING_SERVEUR_COMP_CM = eINSTANCE.getPort_Serveur_Comp_CM_Binding_serveur_comp_cm();

		/**
		 * The meta object literal for the '{@link client_serveur.impl.Binding_Serveur_Comp_CMImpl <em>Binding Serveur Comp CM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see client_serveur.impl.Binding_Serveur_Comp_CMImpl
		 * @see client_serveur.impl.Client_serveurPackageImpl#getBinding_Serveur_Comp_CM()
		 * @generated
		 */
		EClass BINDING_SERVEUR_COMP_CM = eINSTANCE.getBinding_Serveur_Comp_CM();

		/**
		 * The meta object literal for the '<em><b>Port cm serveur comp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_SERVEUR_COMP_CM__PORT_CM_SERVEUR_COMP = eINSTANCE.getBinding_Serveur_Comp_CM_Port_cm_serveur_comp();

		/**
		 * The meta object literal for the '<em><b>Port serveur comp cm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_SERVEUR_COMP_CM__PORT_SERVEUR_COMP_CM = eINSTANCE.getBinding_Serveur_Comp_CM_Port_serveur_comp_cm();

	}

} //Client_serveurPackage
