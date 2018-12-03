/**
 */
package cosa;

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
 * @see cosa.CosaFactory
 * @model kind="package"
 * @generated
 */
public interface CosaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cosa";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/cosa";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cosa";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CosaPackage eINSTANCE = cosa.impl.CosaPackageImpl.init();

	/**
	 * The meta object id for the '{@link cosa.impl.Element_ArchitecturalImpl <em>Element Architectural</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.Element_ArchitecturalImpl
	 * @see cosa.impl.CosaPackageImpl#getElement_Architectural()
	 * @generated
	 */
	int ELEMENT_ARCHITECTURAL = 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_ARCHITECTURAL__INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Proprietes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_ARCHITECTURAL__PROPRIETES = 1;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_ARCHITECTURAL__CONTRAINTES = 2;

	/**
	 * The feature id for the '<em><b>Element architectural</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_ARCHITECTURAL__ELEMENT_ARCHITECTURAL = 3;

	/**
	 * The number of structural features of the '<em>Element Architectural</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_ARCHITECTURAL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Element Architectural</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_ARCHITECTURAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cosa.impl.ContraintesImpl <em>Contraintes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.ContraintesImpl
	 * @see cosa.impl.CosaPackageImpl#getContraintes()
	 * @generated
	 */
	int CONTRAINTES = 1;

	/**
	 * The number of structural features of the '<em>Contraintes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Contraintes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cosa.impl.ProprietesImpl <em>Proprietes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.ProprietesImpl
	 * @see cosa.impl.CosaPackageImpl#getProprietes()
	 * @generated
	 */
	int PROPRIETES = 2;

	/**
	 * The number of structural features of the '<em>Proprietes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Proprietes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cosa.impl.Proprietes_Non_FonctionnellesImpl <em>Proprietes Non Fonctionnelles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.Proprietes_Non_FonctionnellesImpl
	 * @see cosa.impl.CosaPackageImpl#getProprietes_Non_Fonctionnelles()
	 * @generated
	 */
	int PROPRIETES_NON_FONCTIONNELLES = 3;

	/**
	 * The number of structural features of the '<em>Proprietes Non Fonctionnelles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETES_NON_FONCTIONNELLES_FEATURE_COUNT = PROPRIETES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Proprietes Non Fonctionnelles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETES_NON_FONCTIONNELLES_OPERATION_COUNT = PROPRIETES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.ConfigurationImpl
	 * @see cosa.impl.CosaPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__INTERFACE = ELEMENT_ARCHITECTURAL__INTERFACE;

	/**
	 * The feature id for the '<em><b>Proprietes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__PROPRIETES = ELEMENT_ARCHITECTURAL__PROPRIETES;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONTRAINTES = ELEMENT_ARCHITECTURAL__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Element architectural</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ELEMENT_ARCHITECTURAL = ELEMENT_ARCHITECTURAL__ELEMENT_ARCHITECTURAL;

	/**
	 * The feature id for the '<em><b>Interface composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__INTERFACE_COMPOSANT = ELEMENT_ARCHITECTURAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONNECTEUR = ELEMENT_ARCHITECTURAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__COMPOSANT = ELEMENT_ARCHITECTURAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__BINDING = ELEMENT_ARCHITECTURAL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ATTACHMENT = ELEMENT_ARCHITECTURAL_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = ELEMENT_ARCHITECTURAL_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = ELEMENT_ARCHITECTURAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.ComposantImpl <em>Composant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.ComposantImpl
	 * @see cosa.impl.CosaPackageImpl#getComposant()
	 * @generated
	 */
	int COMPOSANT = 5;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__INTERFACE = ELEMENT_ARCHITECTURAL__INTERFACE;

	/**
	 * The feature id for the '<em><b>Proprietes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__PROPRIETES = ELEMENT_ARCHITECTURAL__PROPRIETES;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__CONTRAINTES = ELEMENT_ARCHITECTURAL__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Element architectural</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__ELEMENT_ARCHITECTURAL = ELEMENT_ARCHITECTURAL__ELEMENT_ARCHITECTURAL;

	/**
	 * The feature id for the '<em><b>Interface composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__INTERFACE_COMPOSANT = ELEMENT_ARCHITECTURAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_FEATURE_COUNT = ELEMENT_ARCHITECTURAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_OPERATION_COUNT = ELEMENT_ARCHITECTURAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.ConnecteurImpl <em>Connecteur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.ConnecteurImpl
	 * @see cosa.impl.CosaPackageImpl#getConnecteur()
	 * @generated
	 */
	int CONNECTEUR = 6;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR__INTERFACE = ELEMENT_ARCHITECTURAL__INTERFACE;

	/**
	 * The feature id for the '<em><b>Proprietes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR__PROPRIETES = ELEMENT_ARCHITECTURAL__PROPRIETES;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR__CONTRAINTES = ELEMENT_ARCHITECTURAL__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Element architectural</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR__ELEMENT_ARCHITECTURAL = ELEMENT_ARCHITECTURAL__ELEMENT_ARCHITECTURAL;

	/**
	 * The feature id for the '<em><b>Glu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR__GLU = ELEMENT_ARCHITECTURAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface connecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR__INTERFACE_CONNECTEUR = ELEMENT_ARCHITECTURAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connecteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_FEATURE_COUNT = ELEMENT_ARCHITECTURAL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connecteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_OPERATION_COUNT = ELEMENT_ARCHITECTURAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.InterfaceImpl
	 * @see cosa.impl.CosaPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 7;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cosa.impl.Proprietes_FonctionnellesImpl <em>Proprietes Fonctionnelles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.Proprietes_FonctionnellesImpl
	 * @see cosa.impl.CosaPackageImpl#getProprietes_Fonctionnelles()
	 * @generated
	 */
	int PROPRIETES_FONCTIONNELLES = 8;

	/**
	 * The number of structural features of the '<em>Proprietes Fonctionnelles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETES_FONCTIONNELLES_FEATURE_COUNT = PROPRIETES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Proprietes Fonctionnelles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETES_FONCTIONNELLES_OPERATION_COUNT = PROPRIETES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.Interface_ComposantImpl <em>Interface Composant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.Interface_ComposantImpl
	 * @see cosa.impl.CosaPackageImpl#getInterface_Composant()
	 * @generated
	 */
	int INTERFACE_COMPOSANT = 15;

	/**
	 * The number of structural features of the '<em>Interface Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPOSANT_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPOSANT_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.ServiceImpl
	 * @see cosa.impl.CosaPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 9;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PORT = INTERFACE_COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = INTERFACE_COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = INTERFACE_COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.AttachmentImpl <em>Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.AttachmentImpl
	 * @see cosa.impl.CosaPackageImpl#getAttachment()
	 * @generated
	 */
	int ATTACHMENT = 10;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__ROLE = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__PORT = 1;

	/**
	 * The number of structural features of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cosa.impl.Interface_ConnecteurImpl <em>Interface Connecteur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.Interface_ConnecteurImpl
	 * @see cosa.impl.CosaPackageImpl#getInterface_Connecteur()
	 * @generated
	 */
	int INTERFACE_CONNECTEUR = 16;

	/**
	 * The number of structural features of the '<em>Interface Connecteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTEUR_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface Connecteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTEUR_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.RoleImpl
	 * @see cosa.impl.CosaPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 11;

	/**
	 * The feature id for the '<em><b>Attachment conn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ATTACHMENT_CONN = INTERFACE_CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = INTERFACE_CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = INTERFACE_CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.BindingImpl
	 * @see cosa.impl.CosaPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 12;

	/**
	 * The feature id for the '<em><b>Port conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__PORT_CONF = 0;

	/**
	 * The feature id for the '<em><b>Port comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__PORT_COMP = 1;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cosa.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.PortImpl
	 * @see cosa.impl.CosaPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 13;

	/**
	 * The feature id for the '<em><b>Attachment comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ATTACHMENT_COMP = INTERFACE_COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__BINDING_CONF = INTERFACE_COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Binding comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__BINDING_COMP = INTERFACE_COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = INTERFACE_COMPOSANT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = INTERFACE_COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.GluImpl <em>Glu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.GluImpl
	 * @see cosa.impl.CosaPackageImpl#getGlu()
	 * @generated
	 */
	int GLU = 14;

	/**
	 * The number of structural features of the '<em>Glu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLU_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Glu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cosa.impl.Service_FourniImpl <em>Service Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.Service_FourniImpl
	 * @see cosa.impl.CosaPackageImpl#getService_Fourni()
	 * @generated
	 */
	int SERVICE_FOURNI = 17;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI__PORT = SERVICE__PORT;

	/**
	 * The number of structural features of the '<em>Service Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.Service_RequisImpl <em>Service Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.Service_RequisImpl
	 * @see cosa.impl.CosaPackageImpl#getService_Requis()
	 * @generated
	 */
	int SERVICE_REQUIS = 18;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS__PORT = SERVICE__PORT;

	/**
	 * The number of structural features of the '<em>Service Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.Role_FourniImpl <em>Role Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.Role_FourniImpl
	 * @see cosa.impl.CosaPackageImpl#getRole_Fourni()
	 * @generated
	 */
	int ROLE_FOURNI = 19;

	/**
	 * The feature id for the '<em><b>Attachment conn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI__ATTACHMENT_CONN = ROLE__ATTACHMENT_CONN;

	/**
	 * The number of structural features of the '<em>Role Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.Role_RequisImpl <em>Role Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.Role_RequisImpl
	 * @see cosa.impl.CosaPackageImpl#getRole_Requis()
	 * @generated
	 */
	int ROLE_REQUIS = 20;

	/**
	 * The feature id for the '<em><b>Attachment conn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS__ATTACHMENT_CONN = ROLE__ATTACHMENT_CONN;

	/**
	 * The number of structural features of the '<em>Role Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.Port_RequisImpl <em>Port Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.Port_RequisImpl
	 * @see cosa.impl.CosaPackageImpl#getPort_Requis()
	 * @generated
	 */
	int PORT_REQUIS = 21;

	/**
	 * The feature id for the '<em><b>Attachment comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS__ATTACHMENT_COMP = PORT__ATTACHMENT_COMP;

	/**
	 * The feature id for the '<em><b>Binding conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS__BINDING_CONF = PORT__BINDING_CONF;

	/**
	 * The feature id for the '<em><b>Binding comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS__BINDING_COMP = PORT__BINDING_COMP;

	/**
	 * The number of structural features of the '<em>Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.Port_FourniImpl <em>Port Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.Port_FourniImpl
	 * @see cosa.impl.CosaPackageImpl#getPort_Fourni()
	 * @generated
	 */
	int PORT_FOURNI = 22;

	/**
	 * The feature id for the '<em><b>Attachment comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI__ATTACHMENT_COMP = PORT__ATTACHMENT_COMP;

	/**
	 * The feature id for the '<em><b>Binding conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI__BINDING_CONF = PORT__BINDING_CONF;

	/**
	 * The feature id for the '<em><b>Binding comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI__BINDING_COMP = PORT__BINDING_COMP;

	/**
	 * The number of structural features of the '<em>Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.Service_ConnecteurImpl <em>Service Connecteur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.Service_ConnecteurImpl
	 * @see cosa.impl.CosaPackageImpl#getService_Connecteur()
	 * @generated
	 */
	int SERVICE_CONNECTEUR = 23;

	/**
	 * The feature id for the '<em><b>Interface connecteur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTEUR__INTERFACE_CONNECTEUR = INTERFACE_CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTEUR__ROLE = INTERFACE_CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Connecteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTEUR_FEATURE_COUNT = INTERFACE_CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Service Connecteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTEUR_OPERATION_COUNT = INTERFACE_CONNECTEUR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link cosa.Element_Architectural <em>Element Architectural</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Architectural</em>'.
	 * @see cosa.Element_Architectural
	 * @generated
	 */
	EClass getElement_Architectural();

	/**
	 * Returns the meta object for the containment reference list '{@link cosa.Element_Architectural#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see cosa.Element_Architectural#getInterface()
	 * @see #getElement_Architectural()
	 * @generated
	 */
	EReference getElement_Architectural_Interface();

	/**
	 * Returns the meta object for the containment reference list '{@link cosa.Element_Architectural#getProprietes <em>Proprietes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proprietes</em>'.
	 * @see cosa.Element_Architectural#getProprietes()
	 * @see #getElement_Architectural()
	 * @generated
	 */
	EReference getElement_Architectural_Proprietes();

	/**
	 * Returns the meta object for the containment reference list '{@link cosa.Element_Architectural#getContraintes <em>Contraintes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contraintes</em>'.
	 * @see cosa.Element_Architectural#getContraintes()
	 * @see #getElement_Architectural()
	 * @generated
	 */
	EReference getElement_Architectural_Contraintes();

	/**
	 * Returns the meta object for the containment reference list '{@link cosa.Element_Architectural#getElement_architectural <em>Element architectural</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element architectural</em>'.
	 * @see cosa.Element_Architectural#getElement_architectural()
	 * @see #getElement_Architectural()
	 * @generated
	 */
	EReference getElement_Architectural_Element_architectural();

	/**
	 * Returns the meta object for class '{@link cosa.Contraintes <em>Contraintes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contraintes</em>'.
	 * @see cosa.Contraintes
	 * @generated
	 */
	EClass getContraintes();

	/**
	 * Returns the meta object for class '{@link cosa.Proprietes <em>Proprietes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proprietes</em>'.
	 * @see cosa.Proprietes
	 * @generated
	 */
	EClass getProprietes();

	/**
	 * Returns the meta object for class '{@link cosa.Proprietes_Non_Fonctionnelles <em>Proprietes Non Fonctionnelles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proprietes Non Fonctionnelles</em>'.
	 * @see cosa.Proprietes_Non_Fonctionnelles
	 * @generated
	 */
	EClass getProprietes_Non_Fonctionnelles();

	/**
	 * Returns the meta object for class '{@link cosa.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see cosa.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link cosa.Configuration#getInterface_composant <em>Interface composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface composant</em>'.
	 * @see cosa.Configuration#getInterface_composant()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Interface_composant();

	/**
	 * Returns the meta object for the containment reference list '{@link cosa.Configuration#getConnecteur <em>Connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connecteur</em>'.
	 * @see cosa.Configuration#getConnecteur()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Connecteur();

	/**
	 * Returns the meta object for the containment reference list '{@link cosa.Configuration#getComposant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composant</em>'.
	 * @see cosa.Configuration#getComposant()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Composant();

	/**
	 * Returns the meta object for the containment reference list '{@link cosa.Configuration#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding</em>'.
	 * @see cosa.Configuration#getBinding()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Binding();

	/**
	 * Returns the meta object for the containment reference list '{@link cosa.Configuration#getAttachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attachment</em>'.
	 * @see cosa.Configuration#getAttachment()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Attachment();

	/**
	 * Returns the meta object for class '{@link cosa.Composant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composant</em>'.
	 * @see cosa.Composant
	 * @generated
	 */
	EClass getComposant();

	/**
	 * Returns the meta object for the containment reference list '{@link cosa.Composant#getInterface_composant <em>Interface composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface composant</em>'.
	 * @see cosa.Composant#getInterface_composant()
	 * @see #getComposant()
	 * @generated
	 */
	EReference getComposant_Interface_composant();

	/**
	 * Returns the meta object for class '{@link cosa.Connecteur <em>Connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connecteur</em>'.
	 * @see cosa.Connecteur
	 * @generated
	 */
	EClass getConnecteur();

	/**
	 * Returns the meta object for the containment reference '{@link cosa.Connecteur#getGlu <em>Glu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Glu</em>'.
	 * @see cosa.Connecteur#getGlu()
	 * @see #getConnecteur()
	 * @generated
	 */
	EReference getConnecteur_Glu();

	/**
	 * Returns the meta object for the containment reference list '{@link cosa.Connecteur#getInterface_connecteur <em>Interface connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface connecteur</em>'.
	 * @see cosa.Connecteur#getInterface_connecteur()
	 * @see #getConnecteur()
	 * @generated
	 */
	EReference getConnecteur_Interface_connecteur();

	/**
	 * Returns the meta object for class '{@link cosa.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see cosa.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for class '{@link cosa.Proprietes_Fonctionnelles <em>Proprietes Fonctionnelles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proprietes Fonctionnelles</em>'.
	 * @see cosa.Proprietes_Fonctionnelles
	 * @generated
	 */
	EClass getProprietes_Fonctionnelles();

	/**
	 * Returns the meta object for class '{@link cosa.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see cosa.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference list '{@link cosa.Service#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port</em>'.
	 * @see cosa.Service#getPort()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Port();

	/**
	 * Returns the meta object for class '{@link cosa.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment</em>'.
	 * @see cosa.Attachment
	 * @generated
	 */
	EClass getAttachment();

	/**
	 * Returns the meta object for the reference '{@link cosa.Attachment#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see cosa.Attachment#getRole()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Role();

	/**
	 * Returns the meta object for the reference '{@link cosa.Attachment#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see cosa.Attachment#getPort()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Port();

	/**
	 * Returns the meta object for class '{@link cosa.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see cosa.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference '{@link cosa.Role#getAttachment_conn <em>Attachment conn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment conn</em>'.
	 * @see cosa.Role#getAttachment_conn()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Attachment_conn();

	/**
	 * Returns the meta object for class '{@link cosa.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see cosa.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the reference '{@link cosa.Binding#getPort_conf <em>Port conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port conf</em>'.
	 * @see cosa.Binding#getPort_conf()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Port_conf();

	/**
	 * Returns the meta object for the reference '{@link cosa.Binding#getPort_comp <em>Port comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port comp</em>'.
	 * @see cosa.Binding#getPort_comp()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Port_comp();

	/**
	 * Returns the meta object for class '{@link cosa.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see cosa.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the reference '{@link cosa.Port#getAttachment_comp <em>Attachment comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment comp</em>'.
	 * @see cosa.Port#getAttachment_comp()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Attachment_comp();

	/**
	 * Returns the meta object for the reference '{@link cosa.Port#getBinding_conf <em>Binding conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding conf</em>'.
	 * @see cosa.Port#getBinding_conf()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Binding_conf();

	/**
	 * Returns the meta object for the reference '{@link cosa.Port#getBinding_comp <em>Binding comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding comp</em>'.
	 * @see cosa.Port#getBinding_comp()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Binding_comp();

	/**
	 * Returns the meta object for class '{@link cosa.Glu <em>Glu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glu</em>'.
	 * @see cosa.Glu
	 * @generated
	 */
	EClass getGlu();

	/**
	 * Returns the meta object for class '{@link cosa.Interface_Composant <em>Interface Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Composant</em>'.
	 * @see cosa.Interface_Composant
	 * @generated
	 */
	EClass getInterface_Composant();

	/**
	 * Returns the meta object for class '{@link cosa.Interface_Connecteur <em>Interface Connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Connecteur</em>'.
	 * @see cosa.Interface_Connecteur
	 * @generated
	 */
	EClass getInterface_Connecteur();

	/**
	 * Returns the meta object for class '{@link cosa.Service_Fourni <em>Service Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Fourni</em>'.
	 * @see cosa.Service_Fourni
	 * @generated
	 */
	EClass getService_Fourni();

	/**
	 * Returns the meta object for class '{@link cosa.Service_Requis <em>Service Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Requis</em>'.
	 * @see cosa.Service_Requis
	 * @generated
	 */
	EClass getService_Requis();

	/**
	 * Returns the meta object for class '{@link cosa.Role_Fourni <em>Role Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Fourni</em>'.
	 * @see cosa.Role_Fourni
	 * @generated
	 */
	EClass getRole_Fourni();

	/**
	 * Returns the meta object for class '{@link cosa.Role_Requis <em>Role Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Requis</em>'.
	 * @see cosa.Role_Requis
	 * @generated
	 */
	EClass getRole_Requis();

	/**
	 * Returns the meta object for class '{@link cosa.Port_Requis <em>Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Requis</em>'.
	 * @see cosa.Port_Requis
	 * @generated
	 */
	EClass getPort_Requis();

	/**
	 * Returns the meta object for class '{@link cosa.Port_Fourni <em>Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Fourni</em>'.
	 * @see cosa.Port_Fourni
	 * @generated
	 */
	EClass getPort_Fourni();

	/**
	 * Returns the meta object for class '{@link cosa.Service_Connecteur <em>Service Connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Connecteur</em>'.
	 * @see cosa.Service_Connecteur
	 * @generated
	 */
	EClass getService_Connecteur();

	/**
	 * Returns the meta object for the reference '{@link cosa.Service_Connecteur#getInterface_connecteur <em>Interface connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface connecteur</em>'.
	 * @see cosa.Service_Connecteur#getInterface_connecteur()
	 * @see #getService_Connecteur()
	 * @generated
	 */
	EReference getService_Connecteur_Interface_connecteur();

	/**
	 * Returns the meta object for the reference list '{@link cosa.Service_Connecteur#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role</em>'.
	 * @see cosa.Service_Connecteur#getRole()
	 * @see #getService_Connecteur()
	 * @generated
	 */
	EReference getService_Connecteur_Role();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CosaFactory getCosaFactory();

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
		 * The meta object literal for the '{@link cosa.impl.Element_ArchitecturalImpl <em>Element Architectural</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.Element_ArchitecturalImpl
		 * @see cosa.impl.CosaPackageImpl#getElement_Architectural()
		 * @generated
		 */
		EClass ELEMENT_ARCHITECTURAL = eINSTANCE.getElement_Architectural();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_ARCHITECTURAL__INTERFACE = eINSTANCE.getElement_Architectural_Interface();

		/**
		 * The meta object literal for the '<em><b>Proprietes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_ARCHITECTURAL__PROPRIETES = eINSTANCE.getElement_Architectural_Proprietes();

		/**
		 * The meta object literal for the '<em><b>Contraintes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_ARCHITECTURAL__CONTRAINTES = eINSTANCE.getElement_Architectural_Contraintes();

		/**
		 * The meta object literal for the '<em><b>Element architectural</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_ARCHITECTURAL__ELEMENT_ARCHITECTURAL = eINSTANCE.getElement_Architectural_Element_architectural();

		/**
		 * The meta object literal for the '{@link cosa.impl.ContraintesImpl <em>Contraintes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.ContraintesImpl
		 * @see cosa.impl.CosaPackageImpl#getContraintes()
		 * @generated
		 */
		EClass CONTRAINTES = eINSTANCE.getContraintes();

		/**
		 * The meta object literal for the '{@link cosa.impl.ProprietesImpl <em>Proprietes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.ProprietesImpl
		 * @see cosa.impl.CosaPackageImpl#getProprietes()
		 * @generated
		 */
		EClass PROPRIETES = eINSTANCE.getProprietes();

		/**
		 * The meta object literal for the '{@link cosa.impl.Proprietes_Non_FonctionnellesImpl <em>Proprietes Non Fonctionnelles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.Proprietes_Non_FonctionnellesImpl
		 * @see cosa.impl.CosaPackageImpl#getProprietes_Non_Fonctionnelles()
		 * @generated
		 */
		EClass PROPRIETES_NON_FONCTIONNELLES = eINSTANCE.getProprietes_Non_Fonctionnelles();

		/**
		 * The meta object literal for the '{@link cosa.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.ConfigurationImpl
		 * @see cosa.impl.CosaPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Interface composant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__INTERFACE_COMPOSANT = eINSTANCE.getConfiguration_Interface_composant();

		/**
		 * The meta object literal for the '<em><b>Connecteur</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__CONNECTEUR = eINSTANCE.getConfiguration_Connecteur();

		/**
		 * The meta object literal for the '<em><b>Composant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__COMPOSANT = eINSTANCE.getConfiguration_Composant();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__BINDING = eINSTANCE.getConfiguration_Binding();

		/**
		 * The meta object literal for the '<em><b>Attachment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__ATTACHMENT = eINSTANCE.getConfiguration_Attachment();

		/**
		 * The meta object literal for the '{@link cosa.impl.ComposantImpl <em>Composant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.ComposantImpl
		 * @see cosa.impl.CosaPackageImpl#getComposant()
		 * @generated
		 */
		EClass COMPOSANT = eINSTANCE.getComposant();

		/**
		 * The meta object literal for the '<em><b>Interface composant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANT__INTERFACE_COMPOSANT = eINSTANCE.getComposant_Interface_composant();

		/**
		 * The meta object literal for the '{@link cosa.impl.ConnecteurImpl <em>Connecteur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.ConnecteurImpl
		 * @see cosa.impl.CosaPackageImpl#getConnecteur()
		 * @generated
		 */
		EClass CONNECTEUR = eINSTANCE.getConnecteur();

		/**
		 * The meta object literal for the '<em><b>Glu</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEUR__GLU = eINSTANCE.getConnecteur_Glu();

		/**
		 * The meta object literal for the '<em><b>Interface connecteur</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEUR__INTERFACE_CONNECTEUR = eINSTANCE.getConnecteur_Interface_connecteur();

		/**
		 * The meta object literal for the '{@link cosa.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.InterfaceImpl
		 * @see cosa.impl.CosaPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '{@link cosa.impl.Proprietes_FonctionnellesImpl <em>Proprietes Fonctionnelles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.Proprietes_FonctionnellesImpl
		 * @see cosa.impl.CosaPackageImpl#getProprietes_Fonctionnelles()
		 * @generated
		 */
		EClass PROPRIETES_FONCTIONNELLES = eINSTANCE.getProprietes_Fonctionnelles();

		/**
		 * The meta object literal for the '{@link cosa.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.ServiceImpl
		 * @see cosa.impl.CosaPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__PORT = eINSTANCE.getService_Port();

		/**
		 * The meta object literal for the '{@link cosa.impl.AttachmentImpl <em>Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.AttachmentImpl
		 * @see cosa.impl.CosaPackageImpl#getAttachment()
		 * @generated
		 */
		EClass ATTACHMENT = eINSTANCE.getAttachment();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__ROLE = eINSTANCE.getAttachment_Role();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__PORT = eINSTANCE.getAttachment_Port();

		/**
		 * The meta object literal for the '{@link cosa.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.RoleImpl
		 * @see cosa.impl.CosaPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Attachment conn</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ATTACHMENT_CONN = eINSTANCE.getRole_Attachment_conn();

		/**
		 * The meta object literal for the '{@link cosa.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.BindingImpl
		 * @see cosa.impl.CosaPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Port conf</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__PORT_CONF = eINSTANCE.getBinding_Port_conf();

		/**
		 * The meta object literal for the '<em><b>Port comp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__PORT_COMP = eINSTANCE.getBinding_Port_comp();

		/**
		 * The meta object literal for the '{@link cosa.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.PortImpl
		 * @see cosa.impl.CosaPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Attachment comp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__ATTACHMENT_COMP = eINSTANCE.getPort_Attachment_comp();

		/**
		 * The meta object literal for the '<em><b>Binding conf</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__BINDING_CONF = eINSTANCE.getPort_Binding_conf();

		/**
		 * The meta object literal for the '<em><b>Binding comp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__BINDING_COMP = eINSTANCE.getPort_Binding_comp();

		/**
		 * The meta object literal for the '{@link cosa.impl.GluImpl <em>Glu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.GluImpl
		 * @see cosa.impl.CosaPackageImpl#getGlu()
		 * @generated
		 */
		EClass GLU = eINSTANCE.getGlu();

		/**
		 * The meta object literal for the '{@link cosa.impl.Interface_ComposantImpl <em>Interface Composant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.Interface_ComposantImpl
		 * @see cosa.impl.CosaPackageImpl#getInterface_Composant()
		 * @generated
		 */
		EClass INTERFACE_COMPOSANT = eINSTANCE.getInterface_Composant();

		/**
		 * The meta object literal for the '{@link cosa.impl.Interface_ConnecteurImpl <em>Interface Connecteur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.Interface_ConnecteurImpl
		 * @see cosa.impl.CosaPackageImpl#getInterface_Connecteur()
		 * @generated
		 */
		EClass INTERFACE_CONNECTEUR = eINSTANCE.getInterface_Connecteur();

		/**
		 * The meta object literal for the '{@link cosa.impl.Service_FourniImpl <em>Service Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.Service_FourniImpl
		 * @see cosa.impl.CosaPackageImpl#getService_Fourni()
		 * @generated
		 */
		EClass SERVICE_FOURNI = eINSTANCE.getService_Fourni();

		/**
		 * The meta object literal for the '{@link cosa.impl.Service_RequisImpl <em>Service Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.Service_RequisImpl
		 * @see cosa.impl.CosaPackageImpl#getService_Requis()
		 * @generated
		 */
		EClass SERVICE_REQUIS = eINSTANCE.getService_Requis();

		/**
		 * The meta object literal for the '{@link cosa.impl.Role_FourniImpl <em>Role Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.Role_FourniImpl
		 * @see cosa.impl.CosaPackageImpl#getRole_Fourni()
		 * @generated
		 */
		EClass ROLE_FOURNI = eINSTANCE.getRole_Fourni();

		/**
		 * The meta object literal for the '{@link cosa.impl.Role_RequisImpl <em>Role Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.Role_RequisImpl
		 * @see cosa.impl.CosaPackageImpl#getRole_Requis()
		 * @generated
		 */
		EClass ROLE_REQUIS = eINSTANCE.getRole_Requis();

		/**
		 * The meta object literal for the '{@link cosa.impl.Port_RequisImpl <em>Port Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.Port_RequisImpl
		 * @see cosa.impl.CosaPackageImpl#getPort_Requis()
		 * @generated
		 */
		EClass PORT_REQUIS = eINSTANCE.getPort_Requis();

		/**
		 * The meta object literal for the '{@link cosa.impl.Port_FourniImpl <em>Port Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.Port_FourniImpl
		 * @see cosa.impl.CosaPackageImpl#getPort_Fourni()
		 * @generated
		 */
		EClass PORT_FOURNI = eINSTANCE.getPort_Fourni();

		/**
		 * The meta object literal for the '{@link cosa.impl.Service_ConnecteurImpl <em>Service Connecteur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.Service_ConnecteurImpl
		 * @see cosa.impl.CosaPackageImpl#getService_Connecteur()
		 * @generated
		 */
		EClass SERVICE_CONNECTEUR = eINSTANCE.getService_Connecteur();

		/**
		 * The meta object literal for the '<em><b>Interface connecteur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONNECTEUR__INTERFACE_CONNECTEUR = eINSTANCE.getService_Connecteur_Interface_connecteur();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONNECTEUR__ROLE = eINSTANCE.getService_Connecteur_Role();

	}

} //CosaPackage
