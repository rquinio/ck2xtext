/**
 * generated by Xtext 2.15.0
 */
package ck2xtext.gfx.ck2gfx.impl;

import ck2xtext.gfx.ck2gfx.Ck2gfxPackage;
import ck2xtext.gfx.ck2gfx.CoatOfArmsLayer;
import ck2xtext.gfx.ck2gfx.CoatOfArmsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coat Of Arms Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.CoatOfArmsTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.CoatOfArmsTypeImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.CoatOfArmsTypeImpl#getMask <em>Mask</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.CoatOfArmsTypeImpl#getSealOverlay <em>Seal Overlay</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.CoatOfArmsTypeImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.CoatOfArmsTypeImpl#getLayers <em>Layers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoatOfArmsTypeImpl extends MinimalEObjectImpl.Container implements CoatOfArmsType
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
   * The default value of the '{@link #getFrame() <em>Frame</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrame()
   * @generated
   * @ordered
   */
  protected static final String FRAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFrame() <em>Frame</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrame()
   * @generated
   * @ordered
   */
  protected String frame = FRAME_EDEFAULT;

  /**
   * The default value of the '{@link #getMask() <em>Mask</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMask()
   * @generated
   * @ordered
   */
  protected static final String MASK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMask() <em>Mask</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMask()
   * @generated
   * @ordered
   */
  protected String mask = MASK_EDEFAULT;

  /**
   * The default value of the '{@link #getSealOverlay() <em>Seal Overlay</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSealOverlay()
   * @generated
   * @ordered
   */
  protected static final String SEAL_OVERLAY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSealOverlay() <em>Seal Overlay</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSealOverlay()
   * @generated
   * @ordered
   */
  protected String sealOverlay = SEAL_OVERLAY_EDEFAULT;

  /**
   * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEffect()
   * @generated
   * @ordered
   */
  protected static final String EFFECT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEffect() <em>Effect</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEffect()
   * @generated
   * @ordered
   */
  protected String effect = EFFECT_EDEFAULT;

  /**
   * The cached value of the '{@link #getLayers() <em>Layers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayers()
   * @generated
   * @ordered
   */
  protected EList<CoatOfArmsLayer> layers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CoatOfArmsTypeImpl()
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
    return Ck2gfxPackage.Literals.COAT_OF_ARMS_TYPE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.COAT_OF_ARMS_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFrame()
  {
    return frame;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrame(String newFrame)
  {
    String oldFrame = frame;
    frame = newFrame;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.COAT_OF_ARMS_TYPE__FRAME, oldFrame, frame));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMask()
  {
    return mask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMask(String newMask)
  {
    String oldMask = mask;
    mask = newMask;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.COAT_OF_ARMS_TYPE__MASK, oldMask, mask));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSealOverlay()
  {
    return sealOverlay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSealOverlay(String newSealOverlay)
  {
    String oldSealOverlay = sealOverlay;
    sealOverlay = newSealOverlay;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.COAT_OF_ARMS_TYPE__SEAL_OVERLAY, oldSealOverlay, sealOverlay));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEffect()
  {
    return effect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEffect(String newEffect)
  {
    String oldEffect = effect;
    effect = newEffect;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.COAT_OF_ARMS_TYPE__EFFECT, oldEffect, effect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CoatOfArmsLayer> getLayers()
  {
    if (layers == null)
    {
      layers = new EObjectContainmentEList<CoatOfArmsLayer>(CoatOfArmsLayer.class, this, Ck2gfxPackage.COAT_OF_ARMS_TYPE__LAYERS);
    }
    return layers;
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
      case Ck2gfxPackage.COAT_OF_ARMS_TYPE__LAYERS:
        return ((InternalEList<?>)getLayers()).basicRemove(otherEnd, msgs);
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
      case Ck2gfxPackage.COAT_OF_ARMS_TYPE__NAME:
        return getName();
      case Ck2gfxPackage.COAT_OF_ARMS_TYPE__FRAME:
        return getFrame();
      case Ck2gfxPackage.COAT_OF_ARMS_TYPE__MASK:
        return getMask();
      case Ck2gfxPackage.COAT_OF_ARMS_TYPE__SEAL_OVERLAY:
        return getSealOverlay();
      case Ck2gfxPackage.COAT_OF_ARMS_TYPE__EFFECT:
        return getEffect();
      case Ck2gfxPackage.COAT_OF_ARMS_TYPE__LAYERS:
        return getLayers();
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
      case Ck2gfxPackage.COAT_OF_ARMS_TYPE__NAME:
        setName((String)newValue);
        return;
      case Ck2gfxPackage.COAT_OF_ARMS_TYPE__FRAME:
        setFrame((String)newValue);
        return;
      case Ck2gfxPackage.COAT_OF_ARMS_TYPE__MASK:
        setMask((String)newValue);
        return;
      case Ck2gfxPackage.COAT_OF_ARMS_TYPE__SEAL_OVERLAY:
        setSealOverlay((String)newValue);
        return;
      case Ck2gfxPackage.COAT_OF_ARMS_TYPE__EFFECT:
        setEffect((String)newValue);
        return;
      case Ck2gfxPackage.COAT_OF_ARMS_TYPE__LAYERS:
        getLayers().clear();
        getLayers().addAll((Collection<? extends CoatOfArmsLayer>)newValue);
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
      case Ck2gfxPackage.COAT_OF_ARMS_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Ck2gfxPackage.COAT_OF_ARMS_TYPE__FRAME:
        setFrame(FRAME_EDEFAULT);
        return;
      case Ck2gfxPackage.COAT_OF_ARMS_TYPE__MASK:
        setMask(MASK_EDEFAULT);
        return;
      case Ck2gfxPackage.COAT_OF_ARMS_TYPE__SEAL_OVERLAY:
        setSealOverlay(SEAL_OVERLAY_EDEFAULT);
        return;
      case Ck2gfxPackage.COAT_OF_ARMS_TYPE__EFFECT:
        setEffect(EFFECT_EDEFAULT);
        return;
      case Ck2gfxPackage.COAT_OF_ARMS_TYPE__LAYERS:
        getLayers().clear();
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
      case Ck2gfxPackage.COAT_OF_ARMS_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Ck2gfxPackage.COAT_OF_ARMS_TYPE__FRAME:
        return FRAME_EDEFAULT == null ? frame != null : !FRAME_EDEFAULT.equals(frame);
      case Ck2gfxPackage.COAT_OF_ARMS_TYPE__MASK:
        return MASK_EDEFAULT == null ? mask != null : !MASK_EDEFAULT.equals(mask);
      case Ck2gfxPackage.COAT_OF_ARMS_TYPE__SEAL_OVERLAY:
        return SEAL_OVERLAY_EDEFAULT == null ? sealOverlay != null : !SEAL_OVERLAY_EDEFAULT.equals(sealOverlay);
      case Ck2gfxPackage.COAT_OF_ARMS_TYPE__EFFECT:
        return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
      case Ck2gfxPackage.COAT_OF_ARMS_TYPE__LAYERS:
        return layers != null && !layers.isEmpty();
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
    result.append(", frame: ");
    result.append(frame);
    result.append(", mask: ");
    result.append(mask);
    result.append(", sealOverlay: ");
    result.append(sealOverlay);
    result.append(", effect: ");
    result.append(effect);
    result.append(')');
    return result.toString();
  }

} //CoatOfArmsTypeImpl
