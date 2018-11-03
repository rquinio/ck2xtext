/**
 * generated by Xtext 2.15.0
 */
package ck2xtext.gfx.ck2gfx.impl;

import ck2xtext.gfx.ck2gfx.Ck2gfxPackage;
import ck2xtext.gfx.ck2gfx.Color;
import ck2xtext.gfx.ck2gfx.PortraitType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Portrait Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.PortraitTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.PortraitTypeImpl#getEffectFile <em>Effect File</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.PortraitTypeImpl#getLayers <em>Layers</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.PortraitTypeImpl#getHairColorIndex <em>Hair Color Index</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.PortraitTypeImpl#getHairColor <em>Hair Color</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.PortraitTypeImpl#getEyeColorIndex <em>Eye Color Index</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.PortraitTypeImpl#getEyeColor <em>Eye Color</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.PortraitTypeImpl#getHeadgearThatHidesHair <em>Headgear That Hides Hair</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortraitTypeImpl extends MinimalEObjectImpl.Container implements PortraitType
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
   * The cached value of the '{@link #getLayers() <em>Layers</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayers()
   * @generated
   * @ordered
   */
  protected EList<String> layers;

  /**
   * The default value of the '{@link #getHairColorIndex() <em>Hair Color Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHairColorIndex()
   * @generated
   * @ordered
   */
  protected static final int HAIR_COLOR_INDEX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHairColorIndex() <em>Hair Color Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHairColorIndex()
   * @generated
   * @ordered
   */
  protected int hairColorIndex = HAIR_COLOR_INDEX_EDEFAULT;

  /**
   * The cached value of the '{@link #getHairColor() <em>Hair Color</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHairColor()
   * @generated
   * @ordered
   */
  protected EList<Color> hairColor;

  /**
   * The default value of the '{@link #getEyeColorIndex() <em>Eye Color Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEyeColorIndex()
   * @generated
   * @ordered
   */
  protected static final int EYE_COLOR_INDEX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getEyeColorIndex() <em>Eye Color Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEyeColorIndex()
   * @generated
   * @ordered
   */
  protected int eyeColorIndex = EYE_COLOR_INDEX_EDEFAULT;

  /**
   * The cached value of the '{@link #getEyeColor() <em>Eye Color</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEyeColor()
   * @generated
   * @ordered
   */
  protected EList<Color> eyeColor;

  /**
   * The cached value of the '{@link #getHeadgearThatHidesHair() <em>Headgear That Hides Hair</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeadgearThatHidesHair()
   * @generated
   * @ordered
   */
  protected EList<Integer> headgearThatHidesHair;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PortraitTypeImpl()
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
    return Ck2gfxPackage.Literals.PORTRAIT_TYPE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.PORTRAIT_TYPE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.PORTRAIT_TYPE__EFFECT_FILE, oldEffectFile, effectFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getLayers()
  {
    if (layers == null)
    {
      layers = new EDataTypeEList<String>(String.class, this, Ck2gfxPackage.PORTRAIT_TYPE__LAYERS);
    }
    return layers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHairColorIndex()
  {
    return hairColorIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHairColorIndex(int newHairColorIndex)
  {
    int oldHairColorIndex = hairColorIndex;
    hairColorIndex = newHairColorIndex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.PORTRAIT_TYPE__HAIR_COLOR_INDEX, oldHairColorIndex, hairColorIndex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Color> getHairColor()
  {
    if (hairColor == null)
    {
      hairColor = new EObjectContainmentEList<Color>(Color.class, this, Ck2gfxPackage.PORTRAIT_TYPE__HAIR_COLOR);
    }
    return hairColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getEyeColorIndex()
  {
    return eyeColorIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEyeColorIndex(int newEyeColorIndex)
  {
    int oldEyeColorIndex = eyeColorIndex;
    eyeColorIndex = newEyeColorIndex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.PORTRAIT_TYPE__EYE_COLOR_INDEX, oldEyeColorIndex, eyeColorIndex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Color> getEyeColor()
  {
    if (eyeColor == null)
    {
      eyeColor = new EObjectContainmentEList<Color>(Color.class, this, Ck2gfxPackage.PORTRAIT_TYPE__EYE_COLOR);
    }
    return eyeColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getHeadgearThatHidesHair()
  {
    if (headgearThatHidesHair == null)
    {
      headgearThatHidesHair = new EDataTypeEList<Integer>(Integer.class, this, Ck2gfxPackage.PORTRAIT_TYPE__HEADGEAR_THAT_HIDES_HAIR);
    }
    return headgearThatHidesHair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Ck2gfxPackage.PORTRAIT_TYPE__HAIR_COLOR:
        return ((InternalEList<?>)getHairColor()).basicRemove(otherEnd, msgs);
      case Ck2gfxPackage.PORTRAIT_TYPE__EYE_COLOR:
        return ((InternalEList<?>)getEyeColor()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case Ck2gfxPackage.PORTRAIT_TYPE__NAME:
        return getName();
      case Ck2gfxPackage.PORTRAIT_TYPE__EFFECT_FILE:
        return getEffectFile();
      case Ck2gfxPackage.PORTRAIT_TYPE__LAYERS:
        return getLayers();
      case Ck2gfxPackage.PORTRAIT_TYPE__HAIR_COLOR_INDEX:
        return getHairColorIndex();
      case Ck2gfxPackage.PORTRAIT_TYPE__HAIR_COLOR:
        return getHairColor();
      case Ck2gfxPackage.PORTRAIT_TYPE__EYE_COLOR_INDEX:
        return getEyeColorIndex();
      case Ck2gfxPackage.PORTRAIT_TYPE__EYE_COLOR:
        return getEyeColor();
      case Ck2gfxPackage.PORTRAIT_TYPE__HEADGEAR_THAT_HIDES_HAIR:
        return getHeadgearThatHidesHair();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Ck2gfxPackage.PORTRAIT_TYPE__NAME:
        setName((String)newValue);
        return;
      case Ck2gfxPackage.PORTRAIT_TYPE__EFFECT_FILE:
        setEffectFile((String)newValue);
        return;
      case Ck2gfxPackage.PORTRAIT_TYPE__LAYERS:
        getLayers().clear();
        getLayers().addAll((Collection<? extends String>)newValue);
        return;
      case Ck2gfxPackage.PORTRAIT_TYPE__HAIR_COLOR_INDEX:
        setHairColorIndex((Integer)newValue);
        return;
      case Ck2gfxPackage.PORTRAIT_TYPE__HAIR_COLOR:
        getHairColor().clear();
        getHairColor().addAll((Collection<? extends Color>)newValue);
        return;
      case Ck2gfxPackage.PORTRAIT_TYPE__EYE_COLOR_INDEX:
        setEyeColorIndex((Integer)newValue);
        return;
      case Ck2gfxPackage.PORTRAIT_TYPE__EYE_COLOR:
        getEyeColor().clear();
        getEyeColor().addAll((Collection<? extends Color>)newValue);
        return;
      case Ck2gfxPackage.PORTRAIT_TYPE__HEADGEAR_THAT_HIDES_HAIR:
        getHeadgearThatHidesHair().clear();
        getHeadgearThatHidesHair().addAll((Collection<? extends Integer>)newValue);
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
      case Ck2gfxPackage.PORTRAIT_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Ck2gfxPackage.PORTRAIT_TYPE__EFFECT_FILE:
        setEffectFile(EFFECT_FILE_EDEFAULT);
        return;
      case Ck2gfxPackage.PORTRAIT_TYPE__LAYERS:
        getLayers().clear();
        return;
      case Ck2gfxPackage.PORTRAIT_TYPE__HAIR_COLOR_INDEX:
        setHairColorIndex(HAIR_COLOR_INDEX_EDEFAULT);
        return;
      case Ck2gfxPackage.PORTRAIT_TYPE__HAIR_COLOR:
        getHairColor().clear();
        return;
      case Ck2gfxPackage.PORTRAIT_TYPE__EYE_COLOR_INDEX:
        setEyeColorIndex(EYE_COLOR_INDEX_EDEFAULT);
        return;
      case Ck2gfxPackage.PORTRAIT_TYPE__EYE_COLOR:
        getEyeColor().clear();
        return;
      case Ck2gfxPackage.PORTRAIT_TYPE__HEADGEAR_THAT_HIDES_HAIR:
        getHeadgearThatHidesHair().clear();
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
      case Ck2gfxPackage.PORTRAIT_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Ck2gfxPackage.PORTRAIT_TYPE__EFFECT_FILE:
        return EFFECT_FILE_EDEFAULT == null ? effectFile != null : !EFFECT_FILE_EDEFAULT.equals(effectFile);
      case Ck2gfxPackage.PORTRAIT_TYPE__LAYERS:
        return layers != null && !layers.isEmpty();
      case Ck2gfxPackage.PORTRAIT_TYPE__HAIR_COLOR_INDEX:
        return hairColorIndex != HAIR_COLOR_INDEX_EDEFAULT;
      case Ck2gfxPackage.PORTRAIT_TYPE__HAIR_COLOR:
        return hairColor != null && !hairColor.isEmpty();
      case Ck2gfxPackage.PORTRAIT_TYPE__EYE_COLOR_INDEX:
        return eyeColorIndex != EYE_COLOR_INDEX_EDEFAULT;
      case Ck2gfxPackage.PORTRAIT_TYPE__EYE_COLOR:
        return eyeColor != null && !eyeColor.isEmpty();
      case Ck2gfxPackage.PORTRAIT_TYPE__HEADGEAR_THAT_HIDES_HAIR:
        return headgearThatHidesHair != null && !headgearThatHidesHair.isEmpty();
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
    result.append(", effectFile: ");
    result.append(effectFile);
    result.append(", layers: ");
    result.append(layers);
    result.append(", hairColorIndex: ");
    result.append(hairColorIndex);
    result.append(", eyeColorIndex: ");
    result.append(eyeColorIndex);
    result.append(", headgearThatHidesHair: ");
    result.append(headgearThatHidesHair);
    result.append(')');
    return result.toString();
  }

} //PortraitTypeImpl
