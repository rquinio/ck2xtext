/**
 * generated by Xtext 2.17.1
 */
package ck2xtext.generic.ck2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Clause Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ck2xtext.generic.ck2.BoolClauseProperty#isName <em>Name</em>}</li>
 *   <li>{@link ck2xtext.generic.ck2.BoolClauseProperty#getValue <em>Value</em>}</li>
 *   <li>{@link ck2xtext.generic.ck2.BoolClauseProperty#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see ck2xtext.generic.ck2.Ck2Package#getBoolClauseProperty()
 * @model
 * @generated
 */
public interface BoolClauseProperty extends Property
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(boolean)
   * @see ck2xtext.generic.ck2.Ck2Package#getBoolClauseProperty_Name()
   * @model
   * @generated
   */
  boolean isName();

  /**
   * Sets the value of the '{@link ck2xtext.generic.ck2.BoolClauseProperty#isName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #isName()
   * @generated
   */
  void setName(boolean value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see ck2xtext.generic.ck2.Ck2Package#getBoolClauseProperty_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link ck2xtext.generic.ck2.BoolClauseProperty#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link ck2xtext.generic.ck2.Property}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see ck2xtext.generic.ck2.Ck2Package#getBoolClauseProperty_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

} // BoolClauseProperty
