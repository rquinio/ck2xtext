/**
 * generated by Xtext 2.13.0
 */
package ck2xtext.ck2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ck2xtext.ck2.ListProperty#getKey <em>Key</em>}</li>
 *   <li>{@link ck2xtext.ck2.ListProperty#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ck2xtext.ck2.Ck2Package#getListProperty()
 * @model
 * @generated
 */
public interface ListProperty extends Property
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see #setKey(String)
   * @see ck2xtext.ck2.Ck2Package#getListProperty_Key()
   * @model
   * @generated
   */
  String getKey();

  /**
   * Sets the value of the '{@link ck2xtext.ck2.ListProperty#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #getKey()
   * @generated
   */
  void setKey(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(List)
   * @see ck2xtext.ck2.Ck2Package#getListProperty_Value()
   * @model containment="true"
   * @generated
   */
  List getValue();

  /**
   * Sets the value of the '{@link ck2xtext.ck2.ListProperty#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(List value);

} // ListProperty
