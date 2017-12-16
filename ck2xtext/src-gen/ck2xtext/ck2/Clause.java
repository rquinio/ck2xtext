/**
 * generated by Xtext 2.13.0
 */
package ck2xtext.ck2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ck2xtext.ck2.Clause#getValue <em>Value</em>}</li>
 *   <li>{@link ck2xtext.ck2.Clause#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see ck2xtext.ck2.Ck2Package#getClause()
 * @model
 * @generated
 */
public interface Clause extends Property
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see ck2xtext.ck2.Ck2Package#getClause_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link ck2xtext.ck2.Clause#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link ck2xtext.ck2.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see ck2xtext.ck2.Ck2Package#getClause_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

} // Clause
