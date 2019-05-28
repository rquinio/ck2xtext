/**
 * generated by Xtext 2.17.1
 */
package ck2xtext.generic.ck2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ck2xtext.generic.ck2.Model#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see ck2xtext.generic.ck2.Ck2Package#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link ck2xtext.generic.ck2.Property}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see ck2xtext.generic.ck2.Ck2Package#getModel_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

} // Model
