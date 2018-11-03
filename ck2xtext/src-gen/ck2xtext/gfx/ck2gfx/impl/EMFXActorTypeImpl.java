/**
 * generated by Xtext 2.15.0
 */
package ck2xtext.gfx.ck2gfx.impl;

import ck2xtext.gfx.ck2gfx.Animation;
import ck2xtext.gfx.ck2gfx.Ck2gfxPackage;
import ck2xtext.gfx.ck2gfx.EMFXActorType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMFX Actor Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.EMFXActorTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.EMFXActorTypeImpl#getActorFile <em>Actor File</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.EMFXActorTypeImpl#getAnimation <em>Animation</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.EMFXActorTypeImpl#getIdle <em>Idle</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.EMFXActorTypeImpl#getMove <em>Move</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.EMFXActorTypeImpl#getAttack <em>Attack</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.EMFXActorTypeImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.EMFXActorTypeImpl#isUseAnimation <em>Use Animation</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.EMFXActorTypeImpl#getCullDistance <em>Cull Distance</em>}</li>
 *   <li>{@link ck2xtext.gfx.ck2gfx.impl.EMFXActorTypeImpl#isScaleOnCullDistance <em>Scale On Cull Distance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EMFXActorTypeImpl extends MinimalEObjectImpl.Container implements EMFXActorType
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
   * The cached value of the '{@link #getAnimation() <em>Animation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnimation()
   * @generated
   * @ordered
   */
  protected Animation animation;

  /**
   * The default value of the '{@link #getIdle() <em>Idle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdle()
   * @generated
   * @ordered
   */
  protected static final String IDLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdle() <em>Idle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdle()
   * @generated
   * @ordered
   */
  protected String idle = IDLE_EDEFAULT;

  /**
   * The default value of the '{@link #getMove() <em>Move</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMove()
   * @generated
   * @ordered
   */
  protected static final String MOVE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMove() <em>Move</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMove()
   * @generated
   * @ordered
   */
  protected String move = MOVE_EDEFAULT;

  /**
   * The default value of the '{@link #getAttack() <em>Attack</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttack()
   * @generated
   * @ordered
   */
  protected static final String ATTACK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttack() <em>Attack</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttack()
   * @generated
   * @ordered
   */
  protected String attack = ATTACK_EDEFAULT;

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
   * The default value of the '{@link #isUseAnimation() <em>Use Animation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUseAnimation()
   * @generated
   * @ordered
   */
  protected static final boolean USE_ANIMATION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUseAnimation() <em>Use Animation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUseAnimation()
   * @generated
   * @ordered
   */
  protected boolean useAnimation = USE_ANIMATION_EDEFAULT;

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
  protected EMFXActorTypeImpl()
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
    return Ck2gfxPackage.Literals.EMFX_ACTOR_TYPE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.EMFX_ACTOR_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getActorFile()
  {
    return actorFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActorFile(String newActorFile)
  {
    String oldActorFile = actorFile;
    actorFile = newActorFile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.EMFX_ACTOR_TYPE__ACTOR_FILE, oldActorFile, actorFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Animation getAnimation()
  {
    return animation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnimation(Animation newAnimation, NotificationChain msgs)
  {
    Animation oldAnimation = animation;
    animation = newAnimation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.EMFX_ACTOR_TYPE__ANIMATION, oldAnimation, newAnimation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnimation(Animation newAnimation)
  {
    if (newAnimation != animation)
    {
      NotificationChain msgs = null;
      if (animation != null)
        msgs = ((InternalEObject)animation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ck2gfxPackage.EMFX_ACTOR_TYPE__ANIMATION, null, msgs);
      if (newAnimation != null)
        msgs = ((InternalEObject)newAnimation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ck2gfxPackage.EMFX_ACTOR_TYPE__ANIMATION, null, msgs);
      msgs = basicSetAnimation(newAnimation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.EMFX_ACTOR_TYPE__ANIMATION, newAnimation, newAnimation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdle()
  {
    return idle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdle(String newIdle)
  {
    String oldIdle = idle;
    idle = newIdle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.EMFX_ACTOR_TYPE__IDLE, oldIdle, idle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMove()
  {
    return move;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMove(String newMove)
  {
    String oldMove = move;
    move = newMove;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.EMFX_ACTOR_TYPE__MOVE, oldMove, move));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAttack()
  {
    return attack;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttack(String newAttack)
  {
    String oldAttack = attack;
    attack = newAttack;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.EMFX_ACTOR_TYPE__ATTACK, oldAttack, attack));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.EMFX_ACTOR_TYPE__SCALE, oldScale, scale));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUseAnimation()
  {
    return useAnimation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUseAnimation(boolean newUseAnimation)
  {
    boolean oldUseAnimation = useAnimation;
    useAnimation = newUseAnimation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.EMFX_ACTOR_TYPE__USE_ANIMATION, oldUseAnimation, useAnimation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getCullDistance()
  {
    return cullDistance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCullDistance(double newCullDistance)
  {
    double oldCullDistance = cullDistance;
    cullDistance = newCullDistance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.EMFX_ACTOR_TYPE__CULL_DISTANCE, oldCullDistance, cullDistance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isScaleOnCullDistance()
  {
    return scaleOnCullDistance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScaleOnCullDistance(boolean newScaleOnCullDistance)
  {
    boolean oldScaleOnCullDistance = scaleOnCullDistance;
    scaleOnCullDistance = newScaleOnCullDistance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Ck2gfxPackage.EMFX_ACTOR_TYPE__SCALE_ON_CULL_DISTANCE, oldScaleOnCullDistance, scaleOnCullDistance));
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
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__ANIMATION:
        return basicSetAnimation(null, msgs);
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
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__NAME:
        return getName();
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__ACTOR_FILE:
        return getActorFile();
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__ANIMATION:
        return getAnimation();
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__IDLE:
        return getIdle();
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__MOVE:
        return getMove();
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__ATTACK:
        return getAttack();
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__SCALE:
        return getScale();
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__USE_ANIMATION:
        return isUseAnimation();
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__CULL_DISTANCE:
        return getCullDistance();
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__SCALE_ON_CULL_DISTANCE:
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
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__NAME:
        setName((String)newValue);
        return;
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__ACTOR_FILE:
        setActorFile((String)newValue);
        return;
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__ANIMATION:
        setAnimation((Animation)newValue);
        return;
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__IDLE:
        setIdle((String)newValue);
        return;
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__MOVE:
        setMove((String)newValue);
        return;
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__ATTACK:
        setAttack((String)newValue);
        return;
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__SCALE:
        setScale((Double)newValue);
        return;
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__USE_ANIMATION:
        setUseAnimation((Boolean)newValue);
        return;
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__CULL_DISTANCE:
        setCullDistance((Double)newValue);
        return;
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__SCALE_ON_CULL_DISTANCE:
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
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__ACTOR_FILE:
        setActorFile(ACTOR_FILE_EDEFAULT);
        return;
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__ANIMATION:
        setAnimation((Animation)null);
        return;
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__IDLE:
        setIdle(IDLE_EDEFAULT);
        return;
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__MOVE:
        setMove(MOVE_EDEFAULT);
        return;
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__ATTACK:
        setAttack(ATTACK_EDEFAULT);
        return;
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__SCALE:
        setScale(SCALE_EDEFAULT);
        return;
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__USE_ANIMATION:
        setUseAnimation(USE_ANIMATION_EDEFAULT);
        return;
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__CULL_DISTANCE:
        setCullDistance(CULL_DISTANCE_EDEFAULT);
        return;
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__SCALE_ON_CULL_DISTANCE:
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
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__ACTOR_FILE:
        return ACTOR_FILE_EDEFAULT == null ? actorFile != null : !ACTOR_FILE_EDEFAULT.equals(actorFile);
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__ANIMATION:
        return animation != null;
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__IDLE:
        return IDLE_EDEFAULT == null ? idle != null : !IDLE_EDEFAULT.equals(idle);
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__MOVE:
        return MOVE_EDEFAULT == null ? move != null : !MOVE_EDEFAULT.equals(move);
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__ATTACK:
        return ATTACK_EDEFAULT == null ? attack != null : !ATTACK_EDEFAULT.equals(attack);
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__SCALE:
        return scale != SCALE_EDEFAULT;
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__USE_ANIMATION:
        return useAnimation != USE_ANIMATION_EDEFAULT;
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__CULL_DISTANCE:
        return cullDistance != CULL_DISTANCE_EDEFAULT;
      case Ck2gfxPackage.EMFX_ACTOR_TYPE__SCALE_ON_CULL_DISTANCE:
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
    result.append(", idle: ");
    result.append(idle);
    result.append(", move: ");
    result.append(move);
    result.append(", attack: ");
    result.append(attack);
    result.append(", scale: ");
    result.append(scale);
    result.append(", useAnimation: ");
    result.append(useAnimation);
    result.append(", cullDistance: ");
    result.append(cullDistance);
    result.append(", scaleOnCullDistance: ");
    result.append(scaleOnCullDistance);
    result.append(')');
    return result.toString();
  }

} //EMFXActorTypeImpl
