/**
 * generated by Xtext 2.14.0
 */
package ck2xtext.gfx.ck2gfx.impl;

import ck2xtext.gfx.ck2gfx.Ck2gfxPackage;
import ck2xtext.gfx.ck2gfx.MaskedShieldType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Masked Shield Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.MaskedShieldTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.MaskedShieldTypeImpl#getTextureFile1 <em>Texture File1</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.MaskedShieldTypeImpl#getTextureFile2 <em>Texture File2</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.MaskedShieldTypeImpl#getEffectFile <em>Effect File</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.MaskedShieldTypeImpl#isAllwaysTransparent <em>Allways Transparent</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.MaskedShieldTypeImpl#getClickSound <em>Click Sound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaskedShieldTypeImpl extends MinimalEObjectImpl.Container implements MaskedShieldType
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTextureFile1() <em>Texture File1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextureFile1()
   * @generated
   * @ordered
   */
  protected static final String TEXTURE_FILE1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTextureFile1() <em>Texture File1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextureFile1()
   * @generated
   * @ordered
   */
  protected String textureFile1 = TEXTURE_FILE1_EDEFAULT;

  /**
   * The default value of the '{@link #getTextureFile2() <em>Texture File2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextureFile2()
   * @generated
   * @ordered
   */
  protected static final String TEXTURE_FILE2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTextureFile2() <em>Texture File2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextureFile2()
   * @generated
   * @ordered
   */
  protected String textureFile2 = TEXTURE_FILE2_EDEFAULT;

  /**
   * The default value of the '{@link #getEffectFile() <em>Effect File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEffectFile()
   * @generated
   * @ordered
   */
  protected static final String EFFECT_FILE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEffectFile() <em>Effect File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEffectFile()
   * @generated
   * @ordered
   */
  protected String effectFile = EFFECT_FILE_EDEFAULT;

  /**
   * The default value of the '{@link #isAllwaysTransparent() <em>Allways Transparent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAllwaysTransparent()
   * @generated
   * @ordered
   */
  protected static final boolean ALLWAYS_TRANSPARENT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAllwaysTransparent() <em>Allways Transparent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAllwaysTransparent()
   * @generated
   * @ordered
   */
  protected boolean allwaysTransparent = ALLWAYS_TRANSPARENT_EDEFAULT;

  /**
   * The default value of the '{@link #getClickSound() <em>Click Sound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClickSound()
   * @generated
   * @ordered
   */
  protected static final String CLICK_SOUND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClickSound() <em>Click Sound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClickSound()
   * @generated
   * @ordered
   */
  protected String clickSound = CLICK_SOUND_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MaskedShieldTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return Ck2gfxPackage.Literals.MASKED_SHIELD_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.MASKED_SHIELD_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTextureFile1()
  {
    return textureFile1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTextureFile1(String newTextureFile1)
  {
    String oldTextureFile1 = textureFile1;
    textureFile1 = newTextureFile1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.MASKED_SHIELD_TYPE__TEXTURE_FILE1, oldTextureFile1, textureFile1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTextureFile2()
  {
    return textureFile2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTextureFile2(String newTextureFile2)
  {
    String oldTextureFile2 = textureFile2;
    textureFile2 = newTextureFile2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.MASKED_SHIELD_TYPE__TEXTURE_FILE2, oldTextureFile2, textureFile2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEffectFile()
  {
    return effectFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEffectFile(String newEffectFile)
  {
    String oldEffectFile = effectFile;
    effectFile = newEffectFile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.MASKED_SHIELD_TYPE__EFFECT_FILE, oldEffectFile, effectFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAllwaysTransparent()
  {
    return allwaysTransparent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAllwaysTransparent(boolean newAllwaysTransparent)
  {
    boolean oldAllwaysTransparent = allwaysTransparent;
    allwaysTransparent = newAllwaysTransparent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.MASKED_SHIELD_TYPE__ALLWAYS_TRANSPARENT, oldAllwaysTransparent, allwaysTransparent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClickSound()
  {
    return clickSound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClickSound(String newClickSound)
  {
    String oldClickSound = clickSound;
    clickSound = newClickSound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.MASKED_SHIELD_TYPE__CLICK_SOUND, oldClickSound, clickSound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Ck2gfxPackage.MASKED_SHIELD_TYPE__NAME:
        return getName();
      case Ck2gfxPackage.MASKED_SHIELD_TYPE__TEXTURE_FILE1:
        return getTextureFile1();
      case Ck2gfxPackage.MASKED_SHIELD_TYPE__TEXTURE_FILE2:
        return getTextureFile2();
      case Ck2gfxPackage.MASKED_SHIELD_TYPE__EFFECT_FILE:
        return getEffectFile();
      case Ck2gfxPackage.MASKED_SHIELD_TYPE__ALLWAYS_TRANSPARENT:
        return isAllwaysTransparent();
      case Ck2gfxPackage.MASKED_SHIELD_TYPE__CLICK_SOUND:
        return getClickSound();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Ck2gfxPackage.MASKED_SHIELD_TYPE__NAME:
        setName((String)newValue);
        return;
      case Ck2gfxPackage.MASKED_SHIELD_TYPE__TEXTURE_FILE1:
        setTextureFile1((String)newValue);
        return;
      case Ck2gfxPackage.MASKED_SHIELD_TYPE__TEXTURE_FILE2:
        setTextureFile2((String)newValue);
        return;
      case Ck2gfxPackage.MASKED_SHIELD_TYPE__EFFECT_FILE:
        setEffectFile((String)newValue);
        return;
      case Ck2gfxPackage.MASKED_SHIELD_TYPE__ALLWAYS_TRANSPARENT:
        setAllwaysTransparent((Boolean)newValue);
        return;
      case Ck2gfxPackage.MASKED_SHIELD_TYPE__CLICK_SOUND:
        setClickSound((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case Ck2gfxPackage.MASKED_SHIELD_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Ck2gfxPackage.MASKED_SHIELD_TYPE__TEXTURE_FILE1:
        setTextureFile1(TEXTURE_FILE1_EDEFAULT);
        return;
      case Ck2gfxPackage.MASKED_SHIELD_TYPE__TEXTURE_FILE2:
        setTextureFile2(TEXTURE_FILE2_EDEFAULT);
        return;
      case Ck2gfxPackage.MASKED_SHIELD_TYPE__EFFECT_FILE:
        setEffectFile(EFFECT_FILE_EDEFAULT);
        return;
      case Ck2gfxPackage.MASKED_SHIELD_TYPE__ALLWAYS_TRANSPARENT:
        setAllwaysTransparent(ALLWAYS_TRANSPARENT_EDEFAULT);
        return;
      case Ck2gfxPackage.MASKED_SHIELD_TYPE__CLICK_SOUND:
        setClickSound(CLICK_SOUND_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case Ck2gfxPackage.MASKED_SHIELD_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Ck2gfxPackage.MASKED_SHIELD_TYPE__TEXTURE_FILE1:
        return TEXTURE_FILE1_EDEFAULT == null ? textureFile1 != null : !TEXTURE_FILE1_EDEFAULT.equals(textureFile1);
      case Ck2gfxPackage.MASKED_SHIELD_TYPE__TEXTURE_FILE2:
        return TEXTURE_FILE2_EDEFAULT == null ? textureFile2 != null : !TEXTURE_FILE2_EDEFAULT.equals(textureFile2);
      case Ck2gfxPackage.MASKED_SHIELD_TYPE__EFFECT_FILE:
        return EFFECT_FILE_EDEFAULT == null ? effectFile != null : !EFFECT_FILE_EDEFAULT.equals(effectFile);
      case Ck2gfxPackage.MASKED_SHIELD_TYPE__ALLWAYS_TRANSPARENT:
        return allwaysTransparent != ALLWAYS_TRANSPARENT_EDEFAULT;
      case Ck2gfxPackage.MASKED_SHIELD_TYPE__CLICK_SOUND:
        return CLICK_SOUND_EDEFAULT == null ? clickSound != null : !CLICK_SOUND_EDEFAULT.equals(clickSound);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", textureFile1: ");
    result.append(textureFile1);
    result.append(", textureFile2: ");
    result.append(textureFile2);
    result.append(", effectFile: ");
    result.append(effectFile);
    result.append(", allwaysTransparent: ");
    result.append(allwaysTransparent);
    result.append(", clickSound: ");
    result.append(clickSound);
    result.append(')');
    return result.toString();
  }

} //MaskedShieldTypeImpl
