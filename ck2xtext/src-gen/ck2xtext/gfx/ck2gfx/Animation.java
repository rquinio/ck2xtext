/**
 * generated by Xtext 2.17.1
 */
package ck2xtext.gfx.ck2gfx;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Animation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ck2xtext.gfx.ck2gfx.Animation#getName <em>Name</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.Animation#getFile <em>File</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.Animation#getDefaultAnimationTime <em>Default Animation Time</em>}</li>
 * </ul>
 *
 * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getAnimation()
 * @model
 * @generated
 */
public interface Animation extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getAnimation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ck2xtext.gfx.ck2gfx.Animation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>File</em>' attribute.
   * @see #setFile(String)
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getAnimation_File()
   * @model
   * @generated
   */
  String getFile();

  /**
   * Sets the value of the '{@link ck2xtext.gfx.ck2gfx.Animation#getFile <em>File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File</em>' attribute.
   * @see #getFile()
   * @generated
   */
  void setFile(String value);

  /**
   * Returns the value of the '<em><b>Default Animation Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Animation Time</em>' attribute.
   * @see #setDefaultAnimationTime(double)
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getAnimation_DefaultAnimationTime()
   * @model
   * @generated
   */
  double getDefaultAnimationTime();

  /**
   * Sets the value of the '{@link ck2xtext.gfx.ck2gfx.Animation#getDefaultAnimationTime <em>Default Animation Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Animation Time</em>' attribute.
   * @see #getDefaultAnimationTime()
   * @generated
   */
  void setDefaultAnimationTime(double value);

} // Animation
