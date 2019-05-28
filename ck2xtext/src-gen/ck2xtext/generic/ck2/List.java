/**
 * generated by Xtext 2.17.1
 */
package ck2xtext.generic.ck2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ck2xtext.generic.ck2.List#getElems <em>Elems</em>}</li>
 * </ul>
 *
 * @see ck2xtext.generic.ck2.Ck2Package#getList()
 * @model
 * @generated
 */
public interface List extends EObject
{
  /**
   * Returns the value of the '<em><b>Elems</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elems</em>' attribute list.
   * @see ck2xtext.generic.ck2.Ck2Package#getList_Elems()
   * @model unique="false"
   * @generated
   */
  EList<String> getElems();

} // List
