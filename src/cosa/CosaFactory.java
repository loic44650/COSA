/**
 */
package cosa;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cosa.CosaPackage
 * @generated
 */
public interface CosaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CosaFactory eINSTANCE = cosa.impl.CosaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Element Architectural</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Architectural</em>'.
	 * @generated
	 */
	Element_Architectural createElement_Architectural();

	/**
	 * Returns a new object of class '<em>Contraintes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contraintes</em>'.
	 * @generated
	 */
	Contraintes createContraintes();

	/**
	 * Returns a new object of class '<em>Proprietes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proprietes</em>'.
	 * @generated
	 */
	Proprietes createProprietes();

	/**
	 * Returns a new object of class '<em>Proprietes Non Fonctionnelles</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proprietes Non Fonctionnelles</em>'.
	 * @generated
	 */
	Proprietes_Non_Fonctionnelles createProprietes_Non_Fonctionnelles();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>Composant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composant</em>'.
	 * @generated
	 */
	Composant createComposant();

	/**
	 * Returns a new object of class '<em>Connecteur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connecteur</em>'.
	 * @generated
	 */
	Connecteur createConnecteur();

	/**
	 * Returns a new object of class '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface</em>'.
	 * @generated
	 */
	Interface createInterface();

	/**
	 * Returns a new object of class '<em>Proprietes Fonctionnelles</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proprietes Fonctionnelles</em>'.
	 * @generated
	 */
	Proprietes_Fonctionnelles createProprietes_Fonctionnelles();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment</em>'.
	 * @generated
	 */
	Attachment createAttachment();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding</em>'.
	 * @generated
	 */
	Binding createBinding();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns a new object of class '<em>Glu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glu</em>'.
	 * @generated
	 */
	Glu createGlu();

	/**
	 * Returns a new object of class '<em>Interface Composant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Composant</em>'.
	 * @generated
	 */
	Interface_Composant createInterface_Composant();

	/**
	 * Returns a new object of class '<em>Interface Connecteur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Connecteur</em>'.
	 * @generated
	 */
	Interface_Connecteur createInterface_Connecteur();

	/**
	 * Returns a new object of class '<em>Service Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Fourni</em>'.
	 * @generated
	 */
	Service_Fourni createService_Fourni();

	/**
	 * Returns a new object of class '<em>Service Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Requis</em>'.
	 * @generated
	 */
	Service_Requis createService_Requis();

	/**
	 * Returns a new object of class '<em>Role Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Fourni</em>'.
	 * @generated
	 */
	Role_Fourni createRole_Fourni();

	/**
	 * Returns a new object of class '<em>Role Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requis</em>'.
	 * @generated
	 */
	Role_Requis createRole_Requis();

	/**
	 * Returns a new object of class '<em>Port Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Requis</em>'.
	 * @generated
	 */
	Port_Requis createPort_Requis();

	/**
	 * Returns a new object of class '<em>Port Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Fourni</em>'.
	 * @generated
	 */
	Port_Fourni createPort_Fourni();

	/**
	 * Returns a new object of class '<em>Service Connecteur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Connecteur</em>'.
	 * @generated
	 */
	Service_Connecteur createService_Connecteur();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CosaPackage getCosaPackage();

} //CosaFactory
