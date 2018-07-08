/**
 * generated by Xtext 2.14.0
 */
package ck2xtext.gfx.ck2gfx;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Progressbar Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ck2xtext.gfx.ck2gfx.ProgressbarType#getName <em>Name</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.ProgressbarType#getColor <em>Color</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.ProgressbarType#getColor2 <em>Color2</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.ProgressbarType#getTextureFile1 <em>Texture File1</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.ProgressbarType#getTextureFile2 <em>Texture File2</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.ProgressbarType#getSize <em>Size</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.ProgressbarType#isHorizontal <em>Horizontal</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.ProgressbarType#getEffectFile <em>Effect File</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.ProgressbarType#isAllwaysTransparent <em>Allways Transparent</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.ProgressbarType#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.ProgressbarType#getLoadType <em>Load Type</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.ProgressbarType#isNoRefCount <em>No Ref Count</em>}</li>
 * </ul>
 *
 * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getProgressbarType()
 * @model
 * @generated
 */
public interface ProgressbarType extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getProgressbarType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ck2xtext.gfx.ck2gfx.ProgressbarType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' containment reference.
   * @see #setColor(ColorRatio)
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getProgressbarType_Color()
   * @model containment="true"
   * @generated
   */
  ColorRatio getColor();

  /**
   * Sets the value of the '{@link ck2xtext.gfx.ck2gfx.ProgressbarType#getColor <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' containment reference.
   * @see #getColor()
   * @generated
   */
  void setColor(ColorRatio value);

  /**
   * Returns the value of the '<em><b>Color2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color2</em>' containment reference.
   * @see #setColor2(ColorRatio)
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getProgressbarType_Color2()
   * @model containment="true"
   * @generated
   */
  ColorRatio getColor2();

  /**
   * Sets the value of the '{@link ck2xtext.gfx.ck2gfx.ProgressbarType#getColor2 <em>Color2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color2</em>' containment reference.
   * @see #getColor2()
   * @generated
   */
  void setColor2(ColorRatio value);

  /**
   * Returns the value of the '<em><b>Texture File1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Texture File1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Texture File1</em>' attribute.
   * @see #setTextureFile1(String)
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getProgressbarType_TextureFile1()
   * @model
   * @generated
   */
  String getTextureFile1();

  /**
   * Sets the value of the '{@link ck2xtext.gfx.ck2gfx.ProgressbarType#getTextureFile1 <em>Texture File1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Texture File1</em>' attribute.
   * @see #getTextureFile1()
   * @generated
   */
  void setTextureFile1(String value);

  /**
   * Returns the value of the '<em><b>Texture File2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Texture File2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Texture File2</em>' attribute.
   * @see #setTextureFile2(String)
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getProgressbarType_TextureFile2()
   * @model
   * @generated
   */
  String getTextureFile2();

  /**
   * Sets the value of the '{@link ck2xtext.gfx.ck2gfx.ProgressbarType#getTextureFile2 <em>Texture File2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Texture File2</em>' attribute.
   * @see #getTextureFile2()
   * @generated
   */
  void setTextureFile2(String value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' containment reference.
   * @see #setSize(Coordinates)
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getProgressbarType_Size()
   * @model containment="true"
   * @generated
   */
  Coordinates getSize();

  /**
   * Sets the value of the '{@link ck2xtext.gfx.ck2gfx.ProgressbarType#getSize <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' containment reference.
   * @see #getSize()
   * @generated
   */
  void setSize(Coordinates value);

  /**
   * Returns the value of the '<em><b>Horizontal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Horizontal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Horizontal</em>' attribute.
   * @see #setHorizontal(boolean)
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getProgressbarType_Horizontal()
   * @model
   * @generated
   */
  boolean isHorizontal();

  /**
   * Sets the value of the '{@link ck2xtext.gfx.ck2gfx.ProgressbarType#isHorizontal <em>Horizontal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Horizontal</em>' attribute.
   * @see #isHorizontal()
   * @generated
   */
  void setHorizontal(boolean value);

  /**
   * Returns the value of the '<em><b>Effect File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Effect File</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Effect File</em>' attribute.
   * @see #setEffectFile(String)
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getProgressbarType_EffectFile()
   * @model
   * @generated
   */
  String getEffectFile();

  /**
   * Sets the value of the '{@link ck2xtext.gfx.ck2gfx.ProgressbarType#getEffectFile <em>Effect File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Effect File</em>' attribute.
   * @see #getEffectFile()
   * @generated
   */
  void setEffectFile(String value);

  /**
   * Returns the value of the '<em><b>Allways Transparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Allways Transparent</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Allways Transparent</em>' attribute.
   * @see #setAllwaysTransparent(boolean)
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getProgressbarType_AllwaysTransparent()
   * @model
   * @generated
   */
  boolean isAllwaysTransparent();

  /**
   * Sets the value of the '{@link ck2xtext.gfx.ck2gfx.ProgressbarType#isAllwaysTransparent <em>Allways Transparent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Allways Transparent</em>' attribute.
   * @see #isAllwaysTransparent()
   * @generated
   */
  void setAllwaysTransparent(boolean value);

  /**
   * Returns the value of the '<em><b>Max Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Value</em>' attribute.
   * @see #setMaxValue(double)
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getProgressbarType_MaxValue()
   * @model
   * @generated
   */
  double getMaxValue();

  /**
   * Sets the value of the '{@link ck2xtext.gfx.ck2gfx.ProgressbarType#getMaxValue <em>Max Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Value</em>' attribute.
   * @see #getMaxValue()
   * @generated
   */
  void setMaxValue(double value);

  /**
   * Returns the value of the '<em><b>Load Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Load Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Load Type</em>' attribute.
   * @see #setLoadType(String)
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getProgressbarType_LoadType()
   * @model
   * @generated
   */
  String getLoadType();

  /**
   * Sets the value of the '{@link ck2xtext.gfx.ck2gfx.ProgressbarType#getLoadType <em>Load Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Load Type</em>' attribute.
   * @see #getLoadType()
   * @generated
   */
  void setLoadType(String value);

  /**
   * Returns the value of the '<em><b>No Ref Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>No Ref Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>No Ref Count</em>' attribute.
   * @see #setNoRefCount(boolean)
   * @see ck2xtext.gfx.ck2gfx.Ck2gfxPackage#getProgressbarType_NoRefCount()
   * @model
   * @generated
   */
  boolean isNoRefCount();

  /**
   * Sets the value of the '{@link ck2xtext.gfx.ck2gfx.ProgressbarType#isNoRefCount <em>No Ref Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>No Ref Count</em>' attribute.
   * @see #isNoRefCount()
   * @generated
   */
  void setNoRefCount(boolean value);

} // ProgressbarType
