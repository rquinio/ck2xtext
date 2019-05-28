/**
 * generated by Xtext 2.17.1
 */
package ck2xtext.gfx.ck2gfx.impl;

import ck2xtext.gfx.ck2gfx.Ck2gfxPackage;
import ck2xtext.gfx.ck2gfx.Pdxmesh;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pdxmesh</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.PdxmeshImpl#getName <em>Name</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.PdxmeshImpl#getActorFile <em>Actor File</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.PdxmeshImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.PdxmeshImpl#getCullDistance <em>Cull Distance</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.PdxmeshImpl#isScaleOnCullDistance <em>Scale On Cull Distance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PdxmeshImpl extends MinimalEObjectImpl.Container implements Pdxmesh
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
   * The default value of the '{@link #getActorFile() <em>Actor File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActorFile()
   * @generated
   * @ordered
   */
  protected static final String ACTOR_FILE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getActorFile() <em>Actor File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActorFile()
   * @generated
   * @ordered
   */
  protected String actorFile = ACTOR_FILE_EDEFAULT;

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
   * The default value of the '{@link #getCullDistance() <em>Cull Distance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCullDistance()
   * @generated
   * @ordered
   */
  protected static final double CULL_DISTANCE_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getCullDistance() <em>Cull Distance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCullDistance()
   * @generated
   * @ordered
   */
  protected double cullDistance = CULL_DISTANCE_EDEFAULT;

  /**
   * The default value of the '{@link #isScaleOnCullDistance() <em>Scale On Cull Distance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isScaleOnCullDistance()
   * @generated
   * @ordered
   */
  protected static final boolean SCALE_ON_CULL_DISTANCE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isScaleOnCullDistance() <em>Scale On Cull Distance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isScaleOnCullDistance()
   * @generated
   * @ordered
   */
  protected boolean scaleOnCullDistance = SCALE_ON_CULL_DISTANCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PdxmeshImpl()
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
    return Ck2gfxPackage.Literals.PDXMESH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.PDXMESH__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getActorFile()
  {
    return actorFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setActorFile(String newActorFile)
  {
    String oldActorFile = actorFile;
    actorFile = newActorFile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.PDXMESH__ACTOR_FILE, oldActorFile, actorFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public double getScale()
  {
    return scale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setScale(double newScale)
  {
    double oldScale = scale;
    scale = newScale;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.PDXMESH__SCALE, oldScale, scale));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public double getCullDistance()
  {
    return cullDistance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCullDistance(double newCullDistance)
  {
    double oldCullDistance = cullDistance;
    cullDistance = newCullDistance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.PDXMESH__CULL_DISTANCE, oldCullDistance, cullDistance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isScaleOnCullDistance()
  {
    return scaleOnCullDistance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setScaleOnCullDistance(boolean newScaleOnCullDistance)
  {
    boolean oldScaleOnCullDistance = scaleOnCullDistance;
    scaleOnCullDistance = newScaleOnCullDistance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.PDXMESH__SCALE_ON_CULL_DISTANCE, oldScaleOnCullDistance, scaleOnCullDistance));
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
      case Ck2gfxPackage.PDXMESH__NAME:
        return getName();
      case Ck2gfxPackage.PDXMESH__ACTOR_FILE:
        return getActorFile();
      case Ck2gfxPackage.PDXMESH__SCALE:
        return getScale();
      case Ck2gfxPackage.PDXMESH__CULL_DISTANCE:
        return getCullDistance();
      case Ck2gfxPackage.PDXMESH__SCALE_ON_CULL_DISTANCE:
        return isScaleOnCullDistance();
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
      case Ck2gfxPackage.PDXMESH__NAME:
        setName((String)newValue);
        return;
      case Ck2gfxPackage.PDXMESH__ACTOR_FILE:
        setActorFile((String)newValue);
        return;
      case Ck2gfxPackage.PDXMESH__SCALE:
        setScale((Double)newValue);
        return;
      case Ck2gfxPackage.PDXMESH__CULL_DISTANCE:
        setCullDistance((Double)newValue);
        return;
      case Ck2gfxPackage.PDXMESH__SCALE_ON_CULL_DISTANCE:
        setScaleOnCullDistance((Boolean)newValue);
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
      case Ck2gfxPackage.PDXMESH__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Ck2gfxPackage.PDXMESH__ACTOR_FILE:
        setActorFile(ACTOR_FILE_EDEFAULT);
        return;
      case Ck2gfxPackage.PDXMESH__SCALE:
        setScale(SCALE_EDEFAULT);
        return;
      case Ck2gfxPackage.PDXMESH__CULL_DISTANCE:
        setCullDistance(CULL_DISTANCE_EDEFAULT);
        return;
      case Ck2gfxPackage.PDXMESH__SCALE_ON_CULL_DISTANCE:
        setScaleOnCullDistance(SCALE_ON_CULL_DISTANCE_EDEFAULT);
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
      case Ck2gfxPackage.PDXMESH__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Ck2gfxPackage.PDXMESH__ACTOR_FILE:
        return ACTOR_FILE_EDEFAULT == null ? actorFile != null : !ACTOR_FILE_EDEFAULT.equals(actorFile);
      case Ck2gfxPackage.PDXMESH__SCALE:
        return scale != SCALE_EDEFAULT;
      case Ck2gfxPackage.PDXMESH__CULL_DISTANCE:
        return cullDistance != CULL_DISTANCE_EDEFAULT;
      case Ck2gfxPackage.PDXMESH__SCALE_ON_CULL_DISTANCE:
        return scaleOnCullDistance != SCALE_ON_CULL_DISTANCE_EDEFAULT;
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
    result.append(", actorFile: ");
    result.append(actorFile);
    result.append(", scale: ");
    result.append(scale);
    result.append(", cullDistance: ");
    result.append(cullDistance);
    result.append(", scaleOnCullDistance: ");
    result.append(scaleOnCullDistance);
    result.append(')');
    return result.toString();
  }

} //PdxmeshImpl
