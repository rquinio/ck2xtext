/**
 * generated by Xtext 2.14.0
 */
package ck2xtext.gfx.ck2gfx;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coat Of Arms Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ck2xtext.gfx.ck2gfx.CoatOfArmsLayer#getMask <em>Mask</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.CoatOfArmsLayer#getCenter <em>Center</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.CoatOfArmsLayer#getScale <em>Scale</em>}</li>
 * </ul>
 *
 * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getCoatOfArmsLayer()
 * @model
 * @generated
 */
public interface CoatOfArmsLayer extends EObject
{
  /**
   * Returns the value of the '<em><b>Mask</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mask</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mask</em>' attribute.
   * @see #setMask(String)
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getCoatOfArmsLayer_Mask()
   * @model
   * @generated
   */
  String getMask();

  /**
   * Sets the value of the '{@link ck2xtext.gfx.ck2gfx.CoatOfArmsLayer#getMask <em>Mask</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mask</em>' attribute.
   * @see #getMask()
   * @generated
   */
  void setMask(String value);

  /**
   * Returns the value of the '<em><b>Center</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Center</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Center</em>' containment reference.
   * @see #setCenter(Coordinates)
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getCoatOfArmsLayer_Center()
   * @model containment="true"
   * @generated
   */
  Coordinates getCenter();

  /**
   * Sets the value of the '{@link ck2xtext.gfx.ck2gfx.CoatOfArmsLayer#getCenter <em>Center</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Center</em>' containment reference.
   * @see #getCenter()
   * @generated
   */
  void setCenter(Coordinates value);

  /**
   * Returns the value of the '<em><b>Scale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scale</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scale</em>' attribute.
   * @see #setScale(double)
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getCoatOfArmsLayer_Scale()
   * @model
   * @generated
   */
  double getScale();

  /**
   * Sets the value of the '{@link ck2xtext.gfx.ck2gfx.CoatOfArmsLayer#getScale <em>Scale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scale</em>' attribute.
   * @see #getScale()
   * @generated
   */
  void setScale(double value);

} // CoatOfArmsLayer
