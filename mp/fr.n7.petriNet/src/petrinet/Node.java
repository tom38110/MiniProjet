/**
 */
package petrinet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Node#getName <em>Name</em>}</li>
 *   <li>{@link petrinet.Node#getPetri <em>Petri</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinet.PetrinetPackage#getNode_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinet.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Petri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petri</em>' reference.
	 * @see #setPetri(PetriNet)
	 * @see petrinet.PetrinetPackage#getNode_Petri()
	 * @model required="true"
	 * @generated
	 */
	PetriNet getPetri();

	/**
	 * Sets the value of the '{@link petrinet.Node#getPetri <em>Petri</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Petri</em>' reference.
	 * @see #getPetri()
	 * @generated
	 */
	void setPetri(PetriNet value);
} // Node
