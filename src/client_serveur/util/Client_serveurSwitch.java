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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see client_serveur.Client_serveurPackage
 * @generated
 */
public class Client_serveurSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Client_serveurPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client_serveurSwitch() {
		if (modelPackage == null) {
			modelPackage = Client_serveurPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Client_serveurPackage.CLIENT: {
				Client client = (Client)theEObject;
				T result = caseClient(client);
				if (result == null) result = caseComposant(client);
				if (result == null) result = caseElement_Architectural(client);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.RPC: {
				RPC rpc = (RPC)theEObject;
				T result = caseRPC(rpc);
				if (result == null) result = caseConnecteur(rpc);
				if (result == null) result = caseElement_Architectural(rpc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.CLIENT_SERVEUR: {
				Client_serveur client_serveur = (Client_serveur)theEObject;
				T result = caseClient_serveur(client_serveur);
				if (result == null) result = caseConfiguration(client_serveur);
				if (result == null) result = caseElement_Architectural(client_serveur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.INTERFACE_CLIENT: {
				Interface_Client interface_Client = (Interface_Client)theEObject;
				T result = caseInterface_Client(interface_Client);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.INTERFACE_RPC: {
				Interface_RPC interface_RPC = (Interface_RPC)theEObject;
				T result = caseInterface_RPC(interface_RPC);
				if (result == null) result = caseInterface_Connecteur(interface_RPC);
				if (result == null) result = caseInterface(interface_RPC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.DATA_BASE: {
				DataBase dataBase = (DataBase)theEObject;
				T result = caseDataBase(dataBase);
				if (result == null) result = caseComposant(dataBase);
				if (result == null) result = caseElement_Architectural(dataBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.INTERFACE_DATA_BASE: {
				Interface_DataBase interface_DataBase = (Interface_DataBase)theEObject;
				T result = caseInterface_DataBase(interface_DataBase);
				if (result == null) result = caseInterface_Composant(interface_DataBase);
				if (result == null) result = caseInterface(interface_DataBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.SERVEUR_COMP: {
				Serveur_Comp serveur_Comp = (Serveur_Comp)theEObject;
				T result = caseServeur_Comp(serveur_Comp);
				if (result == null) result = caseComposant(serveur_Comp);
				if (result == null) result = caseElement_Architectural(serveur_Comp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.INTERFACE_SERVEUR_COMP: {
				Interface_Serveur_Comp interface_Serveur_Comp = (Interface_Serveur_Comp)theEObject;
				T result = caseInterface_Serveur_Comp(interface_Serveur_Comp);
				if (result == null) result = caseInterface_Composant(interface_Serveur_Comp);
				if (result == null) result = caseInterface(interface_Serveur_Comp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.SERVEUR_CONF: {
				Serveur_Conf serveur_Conf = (Serveur_Conf)theEObject;
				T result = caseServeur_Conf(serveur_Conf);
				if (result == null) result = caseConfiguration(serveur_Conf);
				if (result == null) result = caseElement_Architectural(serveur_Conf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.PORT_REQUIS_SERVEUR: {
				Port_Requis_Serveur port_Requis_Serveur = (Port_Requis_Serveur)theEObject;
				T result = casePort_Requis_Serveur(port_Requis_Serveur);
				if (result == null) result = casePort_Requis(port_Requis_Serveur);
				if (result == null) result = casePort(port_Requis_Serveur);
				if (result == null) result = caseInterface_Composant(port_Requis_Serveur);
				if (result == null) result = caseInterface(port_Requis_Serveur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.PORT_FOURNI_SERVEUR: {
				Port_Fourni_Serveur port_Fourni_Serveur = (Port_Fourni_Serveur)theEObject;
				T result = casePort_Fourni_Serveur(port_Fourni_Serveur);
				if (result == null) result = casePort_Fourni(port_Fourni_Serveur);
				if (result == null) result = casePort(port_Fourni_Serveur);
				if (result == null) result = caseInterface_Composant(port_Fourni_Serveur);
				if (result == null) result = caseInterface(port_Fourni_Serveur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ROLE_REQUIS_RPC_CLIENT: {
				Role_Requis_RPC_Client role_Requis_RPC_Client = (Role_Requis_RPC_Client)theEObject;
				T result = caseRole_Requis_RPC_Client(role_Requis_RPC_Client);
				if (result == null) result = caseRole_Requis(role_Requis_RPC_Client);
				if (result == null) result = caseRole(role_Requis_RPC_Client);
				if (result == null) result = caseInterface_Connecteur(role_Requis_RPC_Client);
				if (result == null) result = caseInterface(role_Requis_RPC_Client);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ROLE_FOURNI_RPC_CLIENT: {
				Role_Fourni_RPC_Client role_Fourni_RPC_Client = (Role_Fourni_RPC_Client)theEObject;
				T result = caseRole_Fourni_RPC_Client(role_Fourni_RPC_Client);
				if (result == null) result = caseRole_Fourni(role_Fourni_RPC_Client);
				if (result == null) result = caseRole(role_Fourni_RPC_Client);
				if (result == null) result = caseInterface_Connecteur(role_Fourni_RPC_Client);
				if (result == null) result = caseInterface(role_Fourni_RPC_Client);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.PORT_REQUIS_CLIENT: {
				Port_Requis_Client port_Requis_Client = (Port_Requis_Client)theEObject;
				T result = casePort_Requis_Client(port_Requis_Client);
				if (result == null) result = casePort_Requis(port_Requis_Client);
				if (result == null) result = casePort(port_Requis_Client);
				if (result == null) result = caseInterface_Composant(port_Requis_Client);
				if (result == null) result = caseInterface(port_Requis_Client);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.PORT_FOURNI_CLIENT: {
				Port_Fourni_Client port_Fourni_Client = (Port_Fourni_Client)theEObject;
				T result = casePort_Fourni_Client(port_Fourni_Client);
				if (result == null) result = casePort_Fourni(port_Fourni_Client);
				if (result == null) result = casePort(port_Fourni_Client);
				if (result == null) result = caseInterface_Composant(port_Fourni_Client);
				if (result == null) result = caseInterface(port_Fourni_Client);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ATTACHMENT_CLIENT_RPC: {
				Attachment_Client_RPC attachment_Client_RPC = (Attachment_Client_RPC)theEObject;
				T result = caseAttachment_Client_RPC(attachment_Client_RPC);
				if (result == null) result = caseAttachment(attachment_Client_RPC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ATTACHMENT_RPC_CLIENT: {
				Attachment_RPC_Client attachment_RPC_Client = (Attachment_RPC_Client)theEObject;
				T result = caseAttachment_RPC_Client(attachment_RPC_Client);
				if (result == null) result = caseAttachment(attachment_RPC_Client);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ROLE_REQUIS_RPC_SERVEUR: {
				Role_Requis_RPC_Serveur role_Requis_RPC_Serveur = (Role_Requis_RPC_Serveur)theEObject;
				T result = caseRole_Requis_RPC_Serveur(role_Requis_RPC_Serveur);
				if (result == null) result = caseRole_Requis(role_Requis_RPC_Serveur);
				if (result == null) result = caseRole(role_Requis_RPC_Serveur);
				if (result == null) result = caseInterface_Connecteur(role_Requis_RPC_Serveur);
				if (result == null) result = caseInterface(role_Requis_RPC_Serveur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ROLE_FOURNI_RPC_SERVEUR: {
				Role_Fourni_RPC_Serveur role_Fourni_RPC_Serveur = (Role_Fourni_RPC_Serveur)theEObject;
				T result = caseRole_Fourni_RPC_Serveur(role_Fourni_RPC_Serveur);
				if (result == null) result = caseRole_Fourni(role_Fourni_RPC_Serveur);
				if (result == null) result = caseRole(role_Fourni_RPC_Serveur);
				if (result == null) result = caseInterface_Connecteur(role_Fourni_RPC_Serveur);
				if (result == null) result = caseInterface(role_Fourni_RPC_Serveur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ATTACHMENT_RPC_SERVEUR: {
				Attachment_RPC_Serveur attachment_RPC_Serveur = (Attachment_RPC_Serveur)theEObject;
				T result = caseAttachment_RPC_Serveur(attachment_RPC_Serveur);
				if (result == null) result = caseAttachment(attachment_RPC_Serveur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ATTACHEMENT_SERVEUR_RPC: {
				Attachement_Serveur_RPC attachement_Serveur_RPC = (Attachement_Serveur_RPC)theEObject;
				T result = caseAttachement_Serveur_RPC(attachement_Serveur_RPC);
				if (result == null) result = caseAttachment(attachement_Serveur_RPC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.SECURITY_MANAGER: {
				Security_Manager security_Manager = (Security_Manager)theEObject;
				T result = caseSecurity_Manager(security_Manager);
				if (result == null) result = caseComposant(security_Manager);
				if (result == null) result = caseElement_Architectural(security_Manager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.CONNECTION_MANAGER: {
				Connection_Manager connection_Manager = (Connection_Manager)theEObject;
				T result = caseConnection_Manager(connection_Manager);
				if (result == null) result = caseComposant(connection_Manager);
				if (result == null) result = caseElement_Architectural(connection_Manager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.INTERFACE_CONNECTION_MANAGER: {
				Interface_Connection_Manager interface_Connection_Manager = (Interface_Connection_Manager)theEObject;
				T result = caseInterface_Connection_Manager(interface_Connection_Manager);
				if (result == null) result = caseInterface_Composant(interface_Connection_Manager);
				if (result == null) result = caseInterface(interface_Connection_Manager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.INTERFACE_SECURITY_MANAGER: {
				Interface_Security_Manager interface_Security_Manager = (Interface_Security_Manager)theEObject;
				T result = caseInterface_Security_Manager(interface_Security_Manager);
				if (result == null) result = caseInterface_Composant(interface_Security_Manager);
				if (result == null) result = caseInterface(interface_Security_Manager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.PORT_REQUIS_ALPHA_CM: {
				Port_Requis_Alpha_CM port_Requis_Alpha_CM = (Port_Requis_Alpha_CM)theEObject;
				T result = casePort_Requis_Alpha_CM(port_Requis_Alpha_CM);
				if (result == null) result = casePort_Requis(port_Requis_Alpha_CM);
				if (result == null) result = casePort(port_Requis_Alpha_CM);
				if (result == null) result = caseInterface_Composant(port_Requis_Alpha_CM);
				if (result == null) result = caseInterface(port_Requis_Alpha_CM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.PORT_FOURNI_CM_ALPHA: {
				Port_Fourni_CM_Alpha port_Fourni_CM_Alpha = (Port_Fourni_CM_Alpha)theEObject;
				T result = casePort_Fourni_CM_Alpha(port_Fourni_CM_Alpha);
				if (result == null) result = casePort_Fourni(port_Fourni_CM_Alpha);
				if (result == null) result = casePort(port_Fourni_CM_Alpha);
				if (result == null) result = caseInterface_Composant(port_Fourni_CM_Alpha);
				if (result == null) result = caseInterface(port_Fourni_CM_Alpha);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.PORT_FOURNI_CM_GAMMA: {
				Port_Fourni_CM_Gamma port_Fourni_CM_Gamma = (Port_Fourni_CM_Gamma)theEObject;
				T result = casePort_Fourni_CM_Gamma(port_Fourni_CM_Gamma);
				if (result == null) result = casePort_Fourni(port_Fourni_CM_Gamma);
				if (result == null) result = casePort(port_Fourni_CM_Gamma);
				if (result == null) result = caseInterface_Composant(port_Fourni_CM_Gamma);
				if (result == null) result = caseInterface(port_Fourni_CM_Gamma);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.PORT_REQUIS_GAMMA_CM: {
				Port_Requis_Gamma_CM port_Requis_Gamma_CM = (Port_Requis_Gamma_CM)theEObject;
				T result = casePort_Requis_Gamma_CM(port_Requis_Gamma_CM);
				if (result == null) result = casePort_Requis(port_Requis_Gamma_CM);
				if (result == null) result = casePort(port_Requis_Gamma_CM);
				if (result == null) result = caseInterface_Composant(port_Requis_Gamma_CM);
				if (result == null) result = caseInterface(port_Requis_Gamma_CM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.PORT_FOURNI_DB_GAMMA: {
				Port_Fourni_DB_Gamma port_Fourni_DB_Gamma = (Port_Fourni_DB_Gamma)theEObject;
				T result = casePort_Fourni_DB_Gamma(port_Fourni_DB_Gamma);
				if (result == null) result = casePort_Fourni(port_Fourni_DB_Gamma);
				if (result == null) result = casePort(port_Fourni_DB_Gamma);
				if (result == null) result = caseInterface_Composant(port_Fourni_DB_Gamma);
				if (result == null) result = caseInterface(port_Fourni_DB_Gamma);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.PORT_REQUIS_GAMMA_DB: {
				Port_Requis_Gamma_DB port_Requis_Gamma_DB = (Port_Requis_Gamma_DB)theEObject;
				T result = casePort_Requis_Gamma_DB(port_Requis_Gamma_DB);
				if (result == null) result = casePort_Requis(port_Requis_Gamma_DB);
				if (result == null) result = casePort(port_Requis_Gamma_DB);
				if (result == null) result = caseInterface_Composant(port_Requis_Gamma_DB);
				if (result == null) result = caseInterface(port_Requis_Gamma_DB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.PORT_FOURNI_DB_BETA: {
				Port_Fourni_DB_Beta port_Fourni_DB_Beta = (Port_Fourni_DB_Beta)theEObject;
				T result = casePort_Fourni_DB_Beta(port_Fourni_DB_Beta);
				if (result == null) result = casePort_Fourni(port_Fourni_DB_Beta);
				if (result == null) result = casePort(port_Fourni_DB_Beta);
				if (result == null) result = caseInterface_Composant(port_Fourni_DB_Beta);
				if (result == null) result = caseInterface(port_Fourni_DB_Beta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.PORT_REQUIS_BETA_DB: {
				Port_Requis_Beta_DB port_Requis_Beta_DB = (Port_Requis_Beta_DB)theEObject;
				T result = casePort_Requis_Beta_DB(port_Requis_Beta_DB);
				if (result == null) result = casePort_Requis(port_Requis_Beta_DB);
				if (result == null) result = casePort(port_Requis_Beta_DB);
				if (result == null) result = caseInterface_Composant(port_Requis_Beta_DB);
				if (result == null) result = caseInterface(port_Requis_Beta_DB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.PORT_FOURNI_SM_ALPHA: {
				Port_Fourni_SM_Alpha port_Fourni_SM_Alpha = (Port_Fourni_SM_Alpha)theEObject;
				T result = casePort_Fourni_SM_Alpha(port_Fourni_SM_Alpha);
				if (result == null) result = casePort_Fourni(port_Fourni_SM_Alpha);
				if (result == null) result = casePort(port_Fourni_SM_Alpha);
				if (result == null) result = caseInterface_Composant(port_Fourni_SM_Alpha);
				if (result == null) result = caseInterface(port_Fourni_SM_Alpha);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.PORT_REQUIS_ALPHA_SM: {
				Port_Requis_Alpha_SM port_Requis_Alpha_SM = (Port_Requis_Alpha_SM)theEObject;
				T result = casePort_Requis_Alpha_SM(port_Requis_Alpha_SM);
				if (result == null) result = casePort_Requis(port_Requis_Alpha_SM);
				if (result == null) result = casePort(port_Requis_Alpha_SM);
				if (result == null) result = caseInterface_Composant(port_Requis_Alpha_SM);
				if (result == null) result = caseInterface(port_Requis_Alpha_SM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.PORT_FOURNI_SM_BETA: {
				Port_Fourni_SM_Beta port_Fourni_SM_Beta = (Port_Fourni_SM_Beta)theEObject;
				T result = casePort_Fourni_SM_Beta(port_Fourni_SM_Beta);
				if (result == null) result = casePort_Fourni(port_Fourni_SM_Beta);
				if (result == null) result = casePort(port_Fourni_SM_Beta);
				if (result == null) result = caseInterface_Composant(port_Fourni_SM_Beta);
				if (result == null) result = caseInterface(port_Fourni_SM_Beta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.PORT_REQUIS_BETA_SM: {
				Port_Requis_Beta_SM port_Requis_Beta_SM = (Port_Requis_Beta_SM)theEObject;
				T result = casePort_Requis_Beta_SM(port_Requis_Beta_SM);
				if (result == null) result = casePort_Requis(port_Requis_Beta_SM);
				if (result == null) result = casePort(port_Requis_Beta_SM);
				if (result == null) result = caseInterface_Composant(port_Requis_Beta_SM);
				if (result == null) result = caseInterface(port_Requis_Beta_SM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.BETA: {
				Beta beta = (Beta)theEObject;
				T result = caseBeta(beta);
				if (result == null) result = caseConnecteur(beta);
				if (result == null) result = caseElement_Architectural(beta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ALPHA: {
				Alpha alpha = (Alpha)theEObject;
				T result = caseAlpha(alpha);
				if (result == null) result = caseConnecteur(alpha);
				if (result == null) result = caseElement_Architectural(alpha);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.GAMMA: {
				Gamma gamma = (Gamma)theEObject;
				T result = caseGamma(gamma);
				if (result == null) result = caseConnecteur(gamma);
				if (result == null) result = caseElement_Architectural(gamma);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.INTERFACE_BETA: {
				Interface_Beta interface_Beta = (Interface_Beta)theEObject;
				T result = caseInterface_Beta(interface_Beta);
				if (result == null) result = caseInterface_Connecteur(interface_Beta);
				if (result == null) result = caseInterface(interface_Beta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.INTERFACE_ALPHA: {
				Interface_Alpha interface_Alpha = (Interface_Alpha)theEObject;
				T result = caseInterface_Alpha(interface_Alpha);
				if (result == null) result = caseInterface_Connecteur(interface_Alpha);
				if (result == null) result = caseInterface(interface_Alpha);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.INTERFACE_GAMMA: {
				Interface_Gamma interface_Gamma = (Interface_Gamma)theEObject;
				T result = caseInterface_Gamma(interface_Gamma);
				if (result == null) result = caseInterface_Connecteur(interface_Gamma);
				if (result == null) result = caseInterface(interface_Gamma);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ROLE_REQUIS_SM_BETA: {
				Role_Requis_SM_Beta role_Requis_SM_Beta = (Role_Requis_SM_Beta)theEObject;
				T result = caseRole_Requis_SM_Beta(role_Requis_SM_Beta);
				if (result == null) result = caseRole_Requis(role_Requis_SM_Beta);
				if (result == null) result = caseRole(role_Requis_SM_Beta);
				if (result == null) result = caseInterface_Connecteur(role_Requis_SM_Beta);
				if (result == null) result = caseInterface(role_Requis_SM_Beta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ROLE_FOURNI_BETA_SM: {
				Role_Fourni_Beta_SM role_Fourni_Beta_SM = (Role_Fourni_Beta_SM)theEObject;
				T result = caseRole_Fourni_Beta_SM(role_Fourni_Beta_SM);
				if (result == null) result = caseRole_Fourni(role_Fourni_Beta_SM);
				if (result == null) result = caseRole(role_Fourni_Beta_SM);
				if (result == null) result = caseInterface_Connecteur(role_Fourni_Beta_SM);
				if (result == null) result = caseInterface(role_Fourni_Beta_SM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ROLE_REQUIS_DB_BETA: {
				Role_Requis_DB_Beta role_Requis_DB_Beta = (Role_Requis_DB_Beta)theEObject;
				T result = caseRole_Requis_DB_Beta(role_Requis_DB_Beta);
				if (result == null) result = caseRole_Requis(role_Requis_DB_Beta);
				if (result == null) result = caseRole(role_Requis_DB_Beta);
				if (result == null) result = caseInterface_Connecteur(role_Requis_DB_Beta);
				if (result == null) result = caseInterface(role_Requis_DB_Beta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ROLE_FOURNI_BETA_DB: {
				Role_Fourni_Beta_DB role_Fourni_Beta_DB = (Role_Fourni_Beta_DB)theEObject;
				T result = caseRole_Fourni_Beta_DB(role_Fourni_Beta_DB);
				if (result == null) result = caseRole_Fourni(role_Fourni_Beta_DB);
				if (result == null) result = caseRole(role_Fourni_Beta_DB);
				if (result == null) result = caseInterface_Connecteur(role_Fourni_Beta_DB);
				if (result == null) result = caseInterface(role_Fourni_Beta_DB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ROLE_FOURNI_GAMMA_CM: {
				Role_Fourni_Gamma_CM role_Fourni_Gamma_CM = (Role_Fourni_Gamma_CM)theEObject;
				T result = caseRole_Fourni_Gamma_CM(role_Fourni_Gamma_CM);
				if (result == null) result = caseRole_Fourni(role_Fourni_Gamma_CM);
				if (result == null) result = caseRole(role_Fourni_Gamma_CM);
				if (result == null) result = caseInterface_Connecteur(role_Fourni_Gamma_CM);
				if (result == null) result = caseInterface(role_Fourni_Gamma_CM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ROLE_REQUIS_CM_GAMMA: {
				Role_Requis_CM_Gamma role_Requis_CM_Gamma = (Role_Requis_CM_Gamma)theEObject;
				T result = caseRole_Requis_CM_Gamma(role_Requis_CM_Gamma);
				if (result == null) result = caseRole_Requis(role_Requis_CM_Gamma);
				if (result == null) result = caseRole(role_Requis_CM_Gamma);
				if (result == null) result = caseInterface_Connecteur(role_Requis_CM_Gamma);
				if (result == null) result = caseInterface(role_Requis_CM_Gamma);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ROLE_REQUIS_DB_GAMMA: {
				Role_Requis_DB_Gamma role_Requis_DB_Gamma = (Role_Requis_DB_Gamma)theEObject;
				T result = caseRole_Requis_DB_Gamma(role_Requis_DB_Gamma);
				if (result == null) result = caseRole_Requis(role_Requis_DB_Gamma);
				if (result == null) result = caseRole(role_Requis_DB_Gamma);
				if (result == null) result = caseInterface_Connecteur(role_Requis_DB_Gamma);
				if (result == null) result = caseInterface(role_Requis_DB_Gamma);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ROLE_FOURNI_GAMMA_DB: {
				Role_Fourni_Gamma_DB role_Fourni_Gamma_DB = (Role_Fourni_Gamma_DB)theEObject;
				T result = caseRole_Fourni_Gamma_DB(role_Fourni_Gamma_DB);
				if (result == null) result = caseRole_Fourni(role_Fourni_Gamma_DB);
				if (result == null) result = caseRole(role_Fourni_Gamma_DB);
				if (result == null) result = caseInterface_Connecteur(role_Fourni_Gamma_DB);
				if (result == null) result = caseInterface(role_Fourni_Gamma_DB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ROLE_REQUIS_SM_ALPHA: {
				Role_Requis_SM_Alpha role_Requis_SM_Alpha = (Role_Requis_SM_Alpha)theEObject;
				T result = caseRole_Requis_SM_Alpha(role_Requis_SM_Alpha);
				if (result == null) result = caseRole_Requis(role_Requis_SM_Alpha);
				if (result == null) result = caseRole(role_Requis_SM_Alpha);
				if (result == null) result = caseInterface_Connecteur(role_Requis_SM_Alpha);
				if (result == null) result = caseInterface(role_Requis_SM_Alpha);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ROLE_FOURNI_ALPHA_SM: {
				Role_Fourni_Alpha_SM role_Fourni_Alpha_SM = (Role_Fourni_Alpha_SM)theEObject;
				T result = caseRole_Fourni_Alpha_SM(role_Fourni_Alpha_SM);
				if (result == null) result = caseRole_Fourni(role_Fourni_Alpha_SM);
				if (result == null) result = caseRole(role_Fourni_Alpha_SM);
				if (result == null) result = caseInterface_Connecteur(role_Fourni_Alpha_SM);
				if (result == null) result = caseInterface(role_Fourni_Alpha_SM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ROLE_REQUIS_CM_ALPHA: {
				Role_Requis_CM_Alpha role_Requis_CM_Alpha = (Role_Requis_CM_Alpha)theEObject;
				T result = caseRole_Requis_CM_Alpha(role_Requis_CM_Alpha);
				if (result == null) result = caseRole_Requis(role_Requis_CM_Alpha);
				if (result == null) result = caseRole(role_Requis_CM_Alpha);
				if (result == null) result = caseInterface_Connecteur(role_Requis_CM_Alpha);
				if (result == null) result = caseInterface(role_Requis_CM_Alpha);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ROLE_FOURNI_ALPHA_CM: {
				Role_Fourni_Alpha_CM role_Fourni_Alpha_CM = (Role_Fourni_Alpha_CM)theEObject;
				T result = caseRole_Fourni_Alpha_CM(role_Fourni_Alpha_CM);
				if (result == null) result = caseRole_Fourni(role_Fourni_Alpha_CM);
				if (result == null) result = caseRole(role_Fourni_Alpha_CM);
				if (result == null) result = caseInterface_Connecteur(role_Fourni_Alpha_CM);
				if (result == null) result = caseInterface(role_Fourni_Alpha_CM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ATTACHMENT_SM_ALPHA: {
				Attachment_SM_Alpha attachment_SM_Alpha = (Attachment_SM_Alpha)theEObject;
				T result = caseAttachment_SM_Alpha(attachment_SM_Alpha);
				if (result == null) result = caseAttachment(attachment_SM_Alpha);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ATTACHMENT_ALPHA_SM: {
				Attachment_Alpha_SM attachment_Alpha_SM = (Attachment_Alpha_SM)theEObject;
				T result = caseAttachment_Alpha_SM(attachment_Alpha_SM);
				if (result == null) result = caseAttachment(attachment_Alpha_SM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ATTACHMENT_CM_ALPHA: {
				Attachment_CM_Alpha attachment_CM_Alpha = (Attachment_CM_Alpha)theEObject;
				T result = caseAttachment_CM_Alpha(attachment_CM_Alpha);
				if (result == null) result = caseAttachment(attachment_CM_Alpha);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ATTACHMENT_ALPHA_CM: {
				Attachment_Alpha_CM attachment_Alpha_CM = (Attachment_Alpha_CM)theEObject;
				T result = caseAttachment_Alpha_CM(attachment_Alpha_CM);
				if (result == null) result = caseAttachment(attachment_Alpha_CM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ATTACHMENT_SM_BETA: {
				Attachment_SM_Beta attachment_SM_Beta = (Attachment_SM_Beta)theEObject;
				T result = caseAttachment_SM_Beta(attachment_SM_Beta);
				if (result == null) result = caseAttachment(attachment_SM_Beta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ATTACHMENT_BETA_SM: {
				Attachment_Beta_SM attachment_Beta_SM = (Attachment_Beta_SM)theEObject;
				T result = caseAttachment_Beta_SM(attachment_Beta_SM);
				if (result == null) result = caseAttachment(attachment_Beta_SM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ATTACHMENT_DB_BETA: {
				Attachment_DB_Beta attachment_DB_Beta = (Attachment_DB_Beta)theEObject;
				T result = caseAttachment_DB_Beta(attachment_DB_Beta);
				if (result == null) result = caseAttachment(attachment_DB_Beta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ATTACHMENT_BETA_DB: {
				Attachment_Beta_DB attachment_Beta_DB = (Attachment_Beta_DB)theEObject;
				T result = caseAttachment_Beta_DB(attachment_Beta_DB);
				if (result == null) result = caseAttachment(attachment_Beta_DB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ATTACHMENT_CM_GAMMA: {
				Attachment_CM_Gamma attachment_CM_Gamma = (Attachment_CM_Gamma)theEObject;
				T result = caseAttachment_CM_Gamma(attachment_CM_Gamma);
				if (result == null) result = caseAttachment(attachment_CM_Gamma);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ATTACHMENT_GAMMA_CM: {
				Attachment_Gamma_CM attachment_Gamma_CM = (Attachment_Gamma_CM)theEObject;
				T result = caseAttachment_Gamma_CM(attachment_Gamma_CM);
				if (result == null) result = caseAttachment(attachment_Gamma_CM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ATTACHMENT_DB_GAMMA: {
				Attachment_DB_Gamma attachment_DB_Gamma = (Attachment_DB_Gamma)theEObject;
				T result = caseAttachment_DB_Gamma(attachment_DB_Gamma);
				if (result == null) result = caseAttachment(attachment_DB_Gamma);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.ATTACHMENT_GAMMA_DB: {
				Attachment_Gamma_DB attachment_Gamma_DB = (Attachment_Gamma_DB)theEObject;
				T result = caseAttachment_Gamma_DB(attachment_Gamma_DB);
				if (result == null) result = caseAttachment(attachment_Gamma_DB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.PORT_SERVEUR_COMP_SERVEUR_COMF: {
				Port_Serveur_Comp_Serveur_Comf port_Serveur_Comp_Serveur_Comf = (Port_Serveur_Comp_Serveur_Comf)theEObject;
				T result = casePort_Serveur_Comp_Serveur_Comf(port_Serveur_Comp_Serveur_Comf);
				if (result == null) result = casePort(port_Serveur_Comp_Serveur_Comf);
				if (result == null) result = caseInterface_Composant(port_Serveur_Comp_Serveur_Comf);
				if (result == null) result = caseInterface(port_Serveur_Comp_Serveur_Comf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.INTERFACE_SERVEUR_CONF: {
				Interface_Serveur_Conf interface_Serveur_Conf = (Interface_Serveur_Conf)theEObject;
				T result = caseInterface_Serveur_Conf(interface_Serveur_Conf);
				if (result == null) result = caseInterface_Composant(interface_Serveur_Conf);
				if (result == null) result = caseInterface(interface_Serveur_Conf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.PORT_SERVEUR_CONF_SERVEUR_COMP: {
				Port_Serveur_Conf_Serveur_Comp port_Serveur_Conf_Serveur_Comp = (Port_Serveur_Conf_Serveur_Comp)theEObject;
				T result = casePort_Serveur_Conf_Serveur_Comp(port_Serveur_Conf_Serveur_Comp);
				if (result == null) result = casePort(port_Serveur_Conf_Serveur_Comp);
				if (result == null) result = caseInterface_Composant(port_Serveur_Conf_Serveur_Comp);
				if (result == null) result = caseInterface(port_Serveur_Conf_Serveur_Comp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.BINDING_SERVEUR_COMP_SERVEUR_CONF: {
				Binding_Serveur_Comp_Serveur_Conf binding_Serveur_Comp_Serveur_Conf = (Binding_Serveur_Comp_Serveur_Conf)theEObject;
				T result = caseBinding_Serveur_Comp_Serveur_Conf(binding_Serveur_Comp_Serveur_Conf);
				if (result == null) result = caseBinding(binding_Serveur_Comp_Serveur_Conf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.PORT_CM_SERVEUR_COMP: {
				Port_CM_Serveur_Comp port_CM_Serveur_Comp = (Port_CM_Serveur_Comp)theEObject;
				T result = casePort_CM_Serveur_Comp(port_CM_Serveur_Comp);
				if (result == null) result = casePort(port_CM_Serveur_Comp);
				if (result == null) result = caseInterface_Composant(port_CM_Serveur_Comp);
				if (result == null) result = caseInterface(port_CM_Serveur_Comp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.PORT_SERVEUR_COMP_CM: {
				Port_Serveur_Comp_CM port_Serveur_Comp_CM = (Port_Serveur_Comp_CM)theEObject;
				T result = casePort_Serveur_Comp_CM(port_Serveur_Comp_CM);
				if (result == null) result = casePort(port_Serveur_Comp_CM);
				if (result == null) result = caseInterface_Composant(port_Serveur_Comp_CM);
				if (result == null) result = caseInterface(port_Serveur_Comp_CM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Client_serveurPackage.BINDING_SERVEUR_COMP_CM: {
				Binding_Serveur_Comp_CM binding_Serveur_Comp_CM = (Binding_Serveur_Comp_CM)theEObject;
				T result = caseBinding_Serveur_Comp_CM(binding_Serveur_Comp_CM);
				if (result == null) result = caseBinding(binding_Serveur_Comp_CM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClient(Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPC(RPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client serveur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client serveur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClient_serveur(Client_serveur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface_Client(Interface_Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface RPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface RPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface_RPC(Interface_RPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataBase(DataBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Data Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Data Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface_DataBase(Interface_DataBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serveur Comp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serveur Comp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServeur_Comp(Serveur_Comp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Serveur Comp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Serveur Comp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface_Serveur_Comp(Interface_Serveur_Comp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serveur Conf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serveur Conf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServeur_Conf(Serveur_Conf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Requis Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Requis Serveur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort_Requis_Serveur(Port_Requis_Serveur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Fourni Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Fourni Serveur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort_Fourni_Serveur(Port_Fourni_Serveur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Requis RPC Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Requis RPC Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole_Requis_RPC_Client(Role_Requis_RPC_Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Fourni RPC Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Fourni RPC Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole_Fourni_RPC_Client(Role_Fourni_RPC_Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Requis Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Requis Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort_Requis_Client(Port_Requis_Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Fourni Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Fourni Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort_Fourni_Client(Port_Fourni_Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment Client RPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment Client RPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment_Client_RPC(Attachment_Client_RPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment RPC Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment RPC Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment_RPC_Client(Attachment_RPC_Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Requis RPC Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Requis RPC Serveur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole_Requis_RPC_Serveur(Role_Requis_RPC_Serveur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Fourni RPC Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Fourni RPC Serveur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole_Fourni_RPC_Serveur(Role_Fourni_RPC_Serveur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment RPC Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment RPC Serveur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment_RPC_Serveur(Attachment_RPC_Serveur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachement Serveur RPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachement Serveur RPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachement_Serveur_RPC(Attachement_Serveur_RPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurity_Manager(Security_Manager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection_Manager(Connection_Manager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Connection Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Connection Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface_Connection_Manager(Interface_Connection_Manager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Security Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Security Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface_Security_Manager(Interface_Security_Manager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Requis Alpha CM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Requis Alpha CM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort_Requis_Alpha_CM(Port_Requis_Alpha_CM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Fourni CM Alpha</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Fourni CM Alpha</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort_Fourni_CM_Alpha(Port_Fourni_CM_Alpha object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Fourni CM Gamma</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Fourni CM Gamma</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort_Fourni_CM_Gamma(Port_Fourni_CM_Gamma object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Requis Gamma CM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Requis Gamma CM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort_Requis_Gamma_CM(Port_Requis_Gamma_CM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Fourni DB Gamma</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Fourni DB Gamma</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort_Fourni_DB_Gamma(Port_Fourni_DB_Gamma object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Requis Gamma DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Requis Gamma DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort_Requis_Gamma_DB(Port_Requis_Gamma_DB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Fourni DB Beta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Fourni DB Beta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort_Fourni_DB_Beta(Port_Fourni_DB_Beta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Requis Beta DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Requis Beta DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort_Requis_Beta_DB(Port_Requis_Beta_DB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Fourni SM Alpha</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Fourni SM Alpha</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort_Fourni_SM_Alpha(Port_Fourni_SM_Alpha object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Requis Alpha SM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Requis Alpha SM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort_Requis_Alpha_SM(Port_Requis_Alpha_SM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Fourni SM Beta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Fourni SM Beta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort_Fourni_SM_Beta(Port_Fourni_SM_Beta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Requis Beta SM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Requis Beta SM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort_Requis_Beta_SM(Port_Requis_Beta_SM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Beta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Beta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeta(Beta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alpha</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alpha</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlpha(Alpha object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gamma</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gamma</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGamma(Gamma object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Beta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Beta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface_Beta(Interface_Beta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Alpha</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Alpha</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface_Alpha(Interface_Alpha object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Gamma</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Gamma</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface_Gamma(Interface_Gamma object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Requis SM Beta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Requis SM Beta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole_Requis_SM_Beta(Role_Requis_SM_Beta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Fourni Beta SM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Fourni Beta SM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole_Fourni_Beta_SM(Role_Fourni_Beta_SM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Requis DB Beta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Requis DB Beta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole_Requis_DB_Beta(Role_Requis_DB_Beta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Fourni Beta DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Fourni Beta DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole_Fourni_Beta_DB(Role_Fourni_Beta_DB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Fourni Gamma CM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Fourni Gamma CM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole_Fourni_Gamma_CM(Role_Fourni_Gamma_CM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Requis CM Gamma</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Requis CM Gamma</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole_Requis_CM_Gamma(Role_Requis_CM_Gamma object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Requis DB Gamma</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Requis DB Gamma</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole_Requis_DB_Gamma(Role_Requis_DB_Gamma object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Fourni Gamma DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Fourni Gamma DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole_Fourni_Gamma_DB(Role_Fourni_Gamma_DB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Requis SM Alpha</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Requis SM Alpha</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole_Requis_SM_Alpha(Role_Requis_SM_Alpha object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Fourni Alpha SM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Fourni Alpha SM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole_Fourni_Alpha_SM(Role_Fourni_Alpha_SM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Requis CM Alpha</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Requis CM Alpha</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole_Requis_CM_Alpha(Role_Requis_CM_Alpha object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Fourni Alpha CM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Fourni Alpha CM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole_Fourni_Alpha_CM(Role_Fourni_Alpha_CM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment SM Alpha</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment SM Alpha</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment_SM_Alpha(Attachment_SM_Alpha object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment Alpha SM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment Alpha SM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment_Alpha_SM(Attachment_Alpha_SM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment CM Alpha</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment CM Alpha</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment_CM_Alpha(Attachment_CM_Alpha object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment Alpha CM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment Alpha CM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment_Alpha_CM(Attachment_Alpha_CM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment SM Beta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment SM Beta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment_SM_Beta(Attachment_SM_Beta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment Beta SM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment Beta SM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment_Beta_SM(Attachment_Beta_SM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment DB Beta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment DB Beta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment_DB_Beta(Attachment_DB_Beta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment Beta DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment Beta DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment_Beta_DB(Attachment_Beta_DB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment CM Gamma</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment CM Gamma</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment_CM_Gamma(Attachment_CM_Gamma object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment Gamma CM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment Gamma CM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment_Gamma_CM(Attachment_Gamma_CM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment DB Gamma</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment DB Gamma</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment_DB_Gamma(Attachment_DB_Gamma object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment Gamma DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment Gamma DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment_Gamma_DB(Attachment_Gamma_DB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Serveur Comp Serveur Comf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Serveur Comp Serveur Comf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort_Serveur_Comp_Serveur_Comf(Port_Serveur_Comp_Serveur_Comf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Serveur Conf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Serveur Conf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface_Serveur_Conf(Interface_Serveur_Conf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Serveur Conf Serveur Comp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Serveur Conf Serveur Comp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort_Serveur_Conf_Serveur_Comp(Port_Serveur_Conf_Serveur_Comp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Serveur Comp Serveur Conf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Serveur Comp Serveur Conf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding_Serveur_Comp_Serveur_Conf(Binding_Serveur_Comp_Serveur_Conf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port CM Serveur Comp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port CM Serveur Comp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort_CM_Serveur_Comp(Port_CM_Serveur_Comp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Serveur Comp CM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Serveur Comp CM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort_Serveur_Comp_CM(Port_Serveur_Comp_CM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Serveur Comp CM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Serveur Comp CM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding_Serveur_Comp_CM(Binding_Serveur_Comp_CM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Architectural</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Architectural</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement_Architectural(Element_Architectural object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposant(Composant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connecteur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connecteur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnecteur(Connecteur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Connecteur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Connecteur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface_Connecteur(Interface_Connecteur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Composant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Composant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface_Composant(Interface_Composant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort_Requis(Port_Requis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort_Fourni(Port_Fourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole_Requis(Role_Requis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole_Fourni(Role_Fourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding(Binding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Client_serveurSwitch
