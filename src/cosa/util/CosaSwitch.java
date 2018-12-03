/**
 */
package cosa.util;

import cosa.*;

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
 * @see cosa.CosaPackage
 * @generated
 */
public class CosaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CosaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CosaSwitch() {
		if (modelPackage == null) {
			modelPackage = CosaPackage.eINSTANCE;
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
			case CosaPackage.ELEMENT_ARCHITECTURAL: {
				Element_Architectural element_Architectural = (Element_Architectural)theEObject;
				T result = caseElement_Architectural(element_Architectural);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.CONTRAINTES: {
				Contraintes contraintes = (Contraintes)theEObject;
				T result = caseContraintes(contraintes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.PROPRIETES: {
				Proprietes proprietes = (Proprietes)theEObject;
				T result = caseProprietes(proprietes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.PROPRIETES_NON_FONCTIONNELLES: {
				Proprietes_Non_Fonctionnelles proprietes_Non_Fonctionnelles = (Proprietes_Non_Fonctionnelles)theEObject;
				T result = caseProprietes_Non_Fonctionnelles(proprietes_Non_Fonctionnelles);
				if (result == null) result = caseProprietes(proprietes_Non_Fonctionnelles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = caseElement_Architectural(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.COMPOSANT: {
				Composant composant = (Composant)theEObject;
				T result = caseComposant(composant);
				if (result == null) result = caseElement_Architectural(composant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.CONNECTEUR: {
				Connecteur connecteur = (Connecteur)theEObject;
				T result = caseConnecteur(connecteur);
				if (result == null) result = caseElement_Architectural(connecteur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.PROPRIETES_FONCTIONNELLES: {
				Proprietes_Fonctionnelles proprietes_Fonctionnelles = (Proprietes_Fonctionnelles)theEObject;
				T result = caseProprietes_Fonctionnelles(proprietes_Fonctionnelles);
				if (result == null) result = caseProprietes(proprietes_Fonctionnelles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseInterface_Composant(service);
				if (result == null) result = caseInterface(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.ATTACHMENT: {
				Attachment attachment = (Attachment)theEObject;
				T result = caseAttachment(attachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = caseInterface_Connecteur(role);
				if (result == null) result = caseInterface(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.BINDING: {
				Binding binding = (Binding)theEObject;
				T result = caseBinding(binding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = caseInterface_Composant(port);
				if (result == null) result = caseInterface(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.GLU: {
				Glu glu = (Glu)theEObject;
				T result = caseGlu(glu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.INTERFACE_COMPOSANT: {
				Interface_Composant interface_Composant = (Interface_Composant)theEObject;
				T result = caseInterface_Composant(interface_Composant);
				if (result == null) result = caseInterface(interface_Composant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.INTERFACE_CONNECTEUR: {
				Interface_Connecteur interface_Connecteur = (Interface_Connecteur)theEObject;
				T result = caseInterface_Connecteur(interface_Connecteur);
				if (result == null) result = caseInterface(interface_Connecteur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.SERVICE_FOURNI: {
				Service_Fourni service_Fourni = (Service_Fourni)theEObject;
				T result = caseService_Fourni(service_Fourni);
				if (result == null) result = caseService(service_Fourni);
				if (result == null) result = caseInterface_Composant(service_Fourni);
				if (result == null) result = caseInterface(service_Fourni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.SERVICE_REQUIS: {
				Service_Requis service_Requis = (Service_Requis)theEObject;
				T result = caseService_Requis(service_Requis);
				if (result == null) result = caseService(service_Requis);
				if (result == null) result = caseInterface_Composant(service_Requis);
				if (result == null) result = caseInterface(service_Requis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.ROLE_FOURNI: {
				Role_Fourni role_Fourni = (Role_Fourni)theEObject;
				T result = caseRole_Fourni(role_Fourni);
				if (result == null) result = caseRole(role_Fourni);
				if (result == null) result = caseInterface_Connecteur(role_Fourni);
				if (result == null) result = caseInterface(role_Fourni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.ROLE_REQUIS: {
				Role_Requis role_Requis = (Role_Requis)theEObject;
				T result = caseRole_Requis(role_Requis);
				if (result == null) result = caseRole(role_Requis);
				if (result == null) result = caseInterface_Connecteur(role_Requis);
				if (result == null) result = caseInterface(role_Requis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.PORT_REQUIS: {
				Port_Requis port_Requis = (Port_Requis)theEObject;
				T result = casePort_Requis(port_Requis);
				if (result == null) result = casePort(port_Requis);
				if (result == null) result = caseInterface_Composant(port_Requis);
				if (result == null) result = caseInterface(port_Requis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.PORT_FOURNI: {
				Port_Fourni port_Fourni = (Port_Fourni)theEObject;
				T result = casePort_Fourni(port_Fourni);
				if (result == null) result = casePort(port_Fourni);
				if (result == null) result = caseInterface_Composant(port_Fourni);
				if (result == null) result = caseInterface(port_Fourni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.SERVICE_CONNECTEUR: {
				Service_Connecteur service_Connecteur = (Service_Connecteur)theEObject;
				T result = caseService_Connecteur(service_Connecteur);
				if (result == null) result = caseInterface_Connecteur(service_Connecteur);
				if (result == null) result = caseInterface(service_Connecteur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Contraintes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contraintes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContraintes(Contraintes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proprietes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proprietes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProprietes(Proprietes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proprietes Non Fonctionnelles</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proprietes Non Fonctionnelles</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProprietes_Non_Fonctionnelles(Proprietes_Non_Fonctionnelles object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Proprietes Fonctionnelles</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proprietes Fonctionnelles</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProprietes_Fonctionnelles(Proprietes_Fonctionnelles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Glu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlu(Glu object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Service Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService_Fourni(Service_Fourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService_Requis(Service_Requis object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Service Connecteur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Connecteur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService_Connecteur(Service_Connecteur object) {
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

} //CosaSwitch
