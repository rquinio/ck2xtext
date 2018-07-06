/**
 * generated by Xtext 2.14.0
 */
package ck2xtext.gfx.ck2gfx.impl;

import ck2xtext.gfx.ck2gfx.Ck2gfxPackage;
import ck2xtext.gfx.ck2gfx.CoatOfArmsLayer;
import ck2xtext.gfx.ck2gfx.Coordinates;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coat Of Arms Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.CoatOfArmsLayerImpl#getMask <em>Mask</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.CoatOfArmsLayerImpl#getCenter <em>Center</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.CoatOfArmsLayerImpl#getScale <em>Scale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoatOfArmsLayerImpl extends MinimalEObjectImpl.Container implements CoatOfArmsLayer
{
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
   * The cached value of the '{@link #getCenter() <em>Center</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCenter()
   * @generated
   * @ordered
   */
  protected Coordinates center;

  /**
   * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScale()
   * @generated
   * @ordered
   */
  protected static final double SCALE_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScale()
   * @generated
   * @ordered
   */
  protected double scale = SCALE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CoatOfArmsLayerImpl()
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
    return Ck2gfxPackage.Literals.COAT_OF_ARMS_LAYER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.COAT_OF_ARMS_LAYER__MASK, oldMask, mask));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Coordinates getCenter()
  {
    return center;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCenter(Coordinates newCenter, NotificationChain msgs)
  {
    Coordinates oldCenter = center;
    center = newCenter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.COAT_OF_ARMS_LAYER__CENTER, oldCenter, newCenter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCenter(Coordinates newCenter)
  {
    if (newCenter != center)
    {
      NotificationChain msgs = null;
      if (center != null)
        msgs = ((InternalEObject)center).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ck2gfxPackage.COAT_OF_ARMS_LAYER__CENTER, null, msgs);
      if (newCenter != null)
        msgs = ((InternalEObject)newCenter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ck2gfxPackage.COAT_OF_ARMS_LAYER__CENTER, null, msgs);
      msgs = basicSetCenter(newCenter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.COAT_OF_ARMS_LAYER__CENTER, newCenter, newCenter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getScale()
  {
    return scale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScale(double newScale)
  {
    double oldScale = scale;
    scale = newScale;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.COAT_OF_ARMS_LAYER__SCALE, oldScale, scale));
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
      case Ck2gfxPackage.COAT_OF_ARMS_LAYER__CENTER:
        return basicSetCenter(null, msgs);
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
      case Ck2gfxPackage.COAT_OF_ARMS_LAYER__MASK:
        return getMask();
      case Ck2gfxPackage.COAT_OF_ARMS_LAYER__CENTER:
        return getCenter();
      case Ck2gfxPackage.COAT_OF_ARMS_LAYER__SCALE:
        return getScale();
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
      case Ck2gfxPackage.COAT_OF_ARMS_LAYER__MASK:
        setMask((String)newValue);
        return;
      case Ck2gfxPackage.COAT_OF_ARMS_LAYER__CENTER:
        setCenter((Coordinates)newValue);
        return;
      case Ck2gfxPackage.COAT_OF_ARMS_LAYER__SCALE:
        setScale((Double)newValue);
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
      case Ck2gfxPackage.COAT_OF_ARMS_LAYER__MASK:
        setMask(MASK_EDEFAULT);
        return;
      case Ck2gfxPackage.COAT_OF_ARMS_LAYER__CENTER:
        setCenter((Coordinates)null);
        return;
      case Ck2gfxPackage.COAT_OF_ARMS_LAYER__SCALE:
        setScale(SCALE_EDEFAULT);
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
      case Ck2gfxPackage.COAT_OF_ARMS_LAYER__MASK:
        return MASK_EDEFAULT == null ? mask != null : !MASK_EDEFAULT.equals(mask);
      case Ck2gfxPackage.COAT_OF_ARMS_LAYER__CENTER:
        return center != null;
      case Ck2gfxPackage.COAT_OF_ARMS_LAYER__SCALE:
        return scale != SCALE_EDEFAULT;
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
    result.append(" (mask: ");
    result.append(mask);
    result.append(", scale: ");
    result.append(scale);
    result.append(')');
    return result.toString();
  }

} //CoatOfArmsLayerImpl
