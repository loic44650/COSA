/**
 */
package client_serveur;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see client_serveur.Client_serveurPackage
 * @generated
 */
public interface Client_serveurFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Client_serveurFactory eINSTANCE = client_serveur.impl.Client_serveurFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client</em>'.
	 * @generated
	 */
	Client createClient();

	/**
	 * Returns a new object of class '<em>RPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RPC</em>'.
	 * @generated
	 */
	RPC createRPC();

	/**
	 * Returns a new object of class '<em>Client serveur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client serveur</em>'.
	 * @generated
	 */
	Client_serveur createClient_serveur();

	/**
	 * Returns a new object of class '<em>Interface Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Client</em>'.
	 * @generated
	 */
	Interface_Client createInterface_Client();

	/**
	 * Returns a new object of class '<em>Interface RPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface RPC</em>'.
	 * @generated
	 */
	Interface_RPC createInterface_RPC();

	/**
	 * Returns a new object of class '<em>Data Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Base</em>'.
	 * @generated
	 */
	DataBase createDataBase();

	/**
	 * Returns a new object of class '<em>Interface Data Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Data Base</em>'.
	 * @generated
	 */
	Interface_DataBase createInterface_DataBase();

	/**
	 * Returns a new object of class '<em>Serveur Comp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serveur Comp</em>'.
	 * @generated
	 */
	Serveur_Comp createServeur_Comp();

	/**
	 * Returns a new object of class '<em>Interface Serveur Comp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Serveur Comp</em>'.
	 * @generated
	 */
	Interface_Serveur_Comp createInterface_Serveur_Comp();

	/**
	 * Returns a new object of class '<em>Serveur Conf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serveur Conf</em>'.
	 * @generated
	 */
	Serveur_Conf createServeur_Conf();

	/**
	 * Returns a new object of class '<em>Port Requis Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Requis Serveur</em>'.
	 * @generated
	 */
	Port_Requis_Serveur createPort_Requis_Serveur();

	/**
	 * Returns a new object of class '<em>Port Fourni Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Fourni Serveur</em>'.
	 * @generated
	 */
	Port_Fourni_Serveur createPort_Fourni_Serveur();

	/**
	 * Returns a new object of class '<em>Role Requis RPC Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requis RPC Client</em>'.
	 * @generated
	 */
	Role_Requis_RPC_Client createRole_Requis_RPC_Client();

	/**
	 * Returns a new object of class '<em>Role Fourni RPC Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Fourni RPC Client</em>'.
	 * @generated
	 */
	Role_Fourni_RPC_Client createRole_Fourni_RPC_Client();

	/**
	 * Returns a new object of class '<em>Port Requis Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Requis Client</em>'.
	 * @generated
	 */
	Port_Requis_Client createPort_Requis_Client();

	/**
	 * Returns a new object of class '<em>Port Fourni Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Fourni Client</em>'.
	 * @generated
	 */
	Port_Fourni_Client createPort_Fourni_Client();

	/**
	 * Returns a new object of class '<em>Attachment Client RPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment Client RPC</em>'.
	 * @generated
	 */
	Attachment_Client_RPC createAttachment_Client_RPC();

	/**
	 * Returns a new object of class '<em>Attachment RPC Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment RPC Client</em>'.
	 * @generated
	 */
	Attachment_RPC_Client createAttachment_RPC_Client();

	/**
	 * Returns a new object of class '<em>Role Requis RPC Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requis RPC Serveur</em>'.
	 * @generated
	 */
	Role_Requis_RPC_Serveur createRole_Requis_RPC_Serveur();

	/**
	 * Returns a new object of class '<em>Role Fourni RPC Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Fourni RPC Serveur</em>'.
	 * @generated
	 */
	Role_Fourni_RPC_Serveur createRole_Fourni_RPC_Serveur();

	/**
	 * Returns a new object of class '<em>Attachment RPC Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment RPC Serveur</em>'.
	 * @generated
	 */
	Attachment_RPC_Serveur createAttachment_RPC_Serveur();

	/**
	 * Returns a new object of class '<em>Attachement Serveur RPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachement Serveur RPC</em>'.
	 * @generated
	 */
	Attachement_Serveur_RPC createAttachement_Serveur_RPC();

	/**
	 * Returns a new object of class '<em>Security Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Manager</em>'.
	 * @generated
	 */
	Security_Manager createSecurity_Manager();

	/**
	 * Returns a new object of class '<em>Connection Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Manager</em>'.
	 * @generated
	 */
	Connection_Manager createConnection_Manager();

	/**
	 * Returns a new object of class '<em>Interface Connection Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Connection Manager</em>'.
	 * @generated
	 */
	Interface_Connection_Manager createInterface_Connection_Manager();

	/**
	 * Returns a new object of class '<em>Interface Security Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Security Manager</em>'.
	 * @generated
	 */
	Interface_Security_Manager createInterface_Security_Manager();

	/**
	 * Returns a new object of class '<em>Port Requis Alpha CM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Requis Alpha CM</em>'.
	 * @generated
	 */
	Port_Requis_Alpha_CM createPort_Requis_Alpha_CM();

	/**
	 * Returns a new object of class '<em>Port Fourni CM Alpha</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Fourni CM Alpha</em>'.
	 * @generated
	 */
	Port_Fourni_CM_Alpha createPort_Fourni_CM_Alpha();

	/**
	 * Returns a new object of class '<em>Port Fourni CM Gamma</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Fourni CM Gamma</em>'.
	 * @generated
	 */
	Port_Fourni_CM_Gamma createPort_Fourni_CM_Gamma();

	/**
	 * Returns a new object of class '<em>Port Requis Gamma CM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Requis Gamma CM</em>'.
	 * @generated
	 */
	Port_Requis_Gamma_CM createPort_Requis_Gamma_CM();

	/**
	 * Returns a new object of class '<em>Port Fourni DB Gamma</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Fourni DB Gamma</em>'.
	 * @generated
	 */
	Port_Fourni_DB_Gamma createPort_Fourni_DB_Gamma();

	/**
	 * Returns a new object of class '<em>Port Requis Gamma DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Requis Gamma DB</em>'.
	 * @generated
	 */
	Port_Requis_Gamma_DB createPort_Requis_Gamma_DB();

	/**
	 * Returns a new object of class '<em>Port Fourni DB Beta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Fourni DB Beta</em>'.
	 * @generated
	 */
	Port_Fourni_DB_Beta createPort_Fourni_DB_Beta();

	/**
	 * Returns a new object of class '<em>Port Requis Beta DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Requis Beta DB</em>'.
	 * @generated
	 */
	Port_Requis_Beta_DB createPort_Requis_Beta_DB();

	/**
	 * Returns a new object of class '<em>Port Fourni SM Alpha</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Fourni SM Alpha</em>'.
	 * @generated
	 */
	Port_Fourni_SM_Alpha createPort_Fourni_SM_Alpha();

	/**
	 * Returns a new object of class '<em>Port Requis Alpha SM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Requis Alpha SM</em>'.
	 * @generated
	 */
	Port_Requis_Alpha_SM createPort_Requis_Alpha_SM();

	/**
	 * Returns a new object of class '<em>Port Fourni SM Beta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Fourni SM Beta</em>'.
	 * @generated
	 */
	Port_Fourni_SM_Beta createPort_Fourni_SM_Beta();

	/**
	 * Returns a new object of class '<em>Port Requis Beta SM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Requis Beta SM</em>'.
	 * @generated
	 */
	Port_Requis_Beta_SM createPort_Requis_Beta_SM();

	/**
	 * Returns a new object of class '<em>Beta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Beta</em>'.
	 * @generated
	 */
	Beta createBeta();

	/**
	 * Returns a new object of class '<em>Alpha</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alpha</em>'.
	 * @generated
	 */
	Alpha createAlpha();

	/**
	 * Returns a new object of class '<em>Gamma</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gamma</em>'.
	 * @generated
	 */
	Gamma createGamma();

	/**
	 * Returns a new object of class '<em>Interface Beta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Beta</em>'.
	 * @generated
	 */
	Interface_Beta createInterface_Beta();

	/**
	 * Returns a new object of class '<em>Interface Alpha</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Alpha</em>'.
	 * @generated
	 */
	Interface_Alpha createInterface_Alpha();

	/**
	 * Returns a new object of class '<em>Interface Gamma</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Gamma</em>'.
	 * @generated
	 */
	Interface_Gamma createInterface_Gamma();

	/**
	 * Returns a new object of class '<em>Role Requis SM Beta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requis SM Beta</em>'.
	 * @generated
	 */
	Role_Requis_SM_Beta createRole_Requis_SM_Beta();

	/**
	 * Returns a new object of class '<em>Role Fourni Beta SM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Fourni Beta SM</em>'.
	 * @generated
	 */
	Role_Fourni_Beta_SM createRole_Fourni_Beta_SM();

	/**
	 * Returns a new object of class '<em>Role Requis DB Beta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requis DB Beta</em>'.
	 * @generated
	 */
	Role_Requis_DB_Beta createRole_Requis_DB_Beta();

	/**
	 * Returns a new object of class '<em>Role Fourni Beta DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Fourni Beta DB</em>'.
	 * @generated
	 */
	Role_Fourni_Beta_DB createRole_Fourni_Beta_DB();

	/**
	 * Returns a new object of class '<em>Role Fourni Gamma CM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Fourni Gamma CM</em>'.
	 * @generated
	 */
	Role_Fourni_Gamma_CM createRole_Fourni_Gamma_CM();

	/**
	 * Returns a new object of class '<em>Role Requis CM Gamma</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requis CM Gamma</em>'.
	 * @generated
	 */
	Role_Requis_CM_Gamma createRole_Requis_CM_Gamma();

	/**
	 * Returns a new object of class '<em>Role Requis DB Gamma</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requis DB Gamma</em>'.
	 * @generated
	 */
	Role_Requis_DB_Gamma createRole_Requis_DB_Gamma();

	/**
	 * Returns a new object of class '<em>Role Fourni Gamma DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Fourni Gamma DB</em>'.
	 * @generated
	 */
	Role_Fourni_Gamma_DB createRole_Fourni_Gamma_DB();

	/**
	 * Returns a new object of class '<em>Role Requis SM Alpha</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requis SM Alpha</em>'.
	 * @generated
	 */
	Role_Requis_SM_Alpha createRole_Requis_SM_Alpha();

	/**
	 * Returns a new object of class '<em>Role Fourni Alpha SM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Fourni Alpha SM</em>'.
	 * @generated
	 */
	Role_Fourni_Alpha_SM createRole_Fourni_Alpha_SM();

	/**
	 * Returns a new object of class '<em>Role Requis CM Alpha</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requis CM Alpha</em>'.
	 * @generated
	 */
	Role_Requis_CM_Alpha createRole_Requis_CM_Alpha();

	/**
	 * Returns a new object of class '<em>Role Fourni Alpha CM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Fourni Alpha CM</em>'.
	 * @generated
	 */
	Role_Fourni_Alpha_CM createRole_Fourni_Alpha_CM();

	/**
	 * Returns a new object of class '<em>Attachment SM Alpha</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment SM Alpha</em>'.
	 * @generated
	 */
	Attachment_SM_Alpha createAttachment_SM_Alpha();

	/**
	 * Returns a new object of class '<em>Attachment Alpha SM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment Alpha SM</em>'.
	 * @generated
	 */
	Attachment_Alpha_SM createAttachment_Alpha_SM();

	/**
	 * Returns a new object of class '<em>Attachment CM Alpha</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment CM Alpha</em>'.
	 * @generated
	 */
	Attachment_CM_Alpha createAttachment_CM_Alpha();

	/**
	 * Returns a new object of class '<em>Attachment Alpha CM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment Alpha CM</em>'.
	 * @generated
	 */
	Attachment_Alpha_CM createAttachment_Alpha_CM();

	/**
	 * Returns a new object of class '<em>Attachment SM Beta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment SM Beta</em>'.
	 * @generated
	 */
	Attachment_SM_Beta createAttachment_SM_Beta();

	/**
	 * Returns a new object of class '<em>Attachment Beta SM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment Beta SM</em>'.
	 * @generated
	 */
	Attachment_Beta_SM createAttachment_Beta_SM();

	/**
	 * Returns a new object of class '<em>Attachment DB Beta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment DB Beta</em>'.
	 * @generated
	 */
	Attachment_DB_Beta createAttachment_DB_Beta();

	/**
	 * Returns a new object of class '<em>Attachment Beta DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment Beta DB</em>'.
	 * @generated
	 */
	Attachment_Beta_DB createAttachment_Beta_DB();

	/**
	 * Returns a new object of class '<em>Attachment CM Gamma</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment CM Gamma</em>'.
	 * @generated
	 */
	Attachment_CM_Gamma createAttachment_CM_Gamma();

	/**
	 * Returns a new object of class '<em>Attachment Gamma CM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment Gamma CM</em>'.
	 * @generated
	 */
	Attachment_Gamma_CM createAttachment_Gamma_CM();

	/**
	 * Returns a new object of class '<em>Attachment DB Gamma</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment DB Gamma</em>'.
	 * @generated
	 */
	Attachment_DB_Gamma createAttachment_DB_Gamma();

	/**
	 * Returns a new object of class '<em>Attachment Gamma DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment Gamma DB</em>'.
	 * @generated
	 */
	Attachment_Gamma_DB createAttachment_Gamma_DB();

	/**
	 * Returns a new object of class '<em>Port Serveur Comp Serveur Comf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Serveur Comp Serveur Comf</em>'.
	 * @generated
	 */
	Port_Serveur_Comp_Serveur_Comf createPort_Serveur_Comp_Serveur_Comf();

	/**
	 * Returns a new object of class '<em>Interface Serveur Conf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Serveur Conf</em>'.
	 * @generated
	 */
	Interface_Serveur_Conf createInterface_Serveur_Conf();

	/**
	 * Returns a new object of class '<em>Port Serveur Conf Serveur Comp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Serveur Conf Serveur Comp</em>'.
	 * @generated
	 */
	Port_Serveur_Conf_Serveur_Comp createPort_Serveur_Conf_Serveur_Comp();

	/**
	 * Returns a new object of class '<em>Binding Serveur Comp Serveur Conf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Serveur Comp Serveur Conf</em>'.
	 * @generated
	 */
	Binding_Serveur_Comp_Serveur_Conf createBinding_Serveur_Comp_Serveur_Conf();

	/**
	 * Returns a new object of class '<em>Port CM Serveur Comp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port CM Serveur Comp</em>'.
	 * @generated
	 */
	Port_CM_Serveur_Comp createPort_CM_Serveur_Comp();

	/**
	 * Returns a new object of class '<em>Port Serveur Comp CM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Serveur Comp CM</em>'.
	 * @generated
	 */
	Port_Serveur_Comp_CM createPort_Serveur_Comp_CM();

	/**
	 * Returns a new object of class '<em>Binding Serveur Comp CM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Serveur Comp CM</em>'.
	 * @generated
	 */
	Binding_Serveur_Comp_CM createBinding_Serveur_Comp_CM();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Client_serveurPackage getClient_serveurPackage();

} //Client_serveurFactory
