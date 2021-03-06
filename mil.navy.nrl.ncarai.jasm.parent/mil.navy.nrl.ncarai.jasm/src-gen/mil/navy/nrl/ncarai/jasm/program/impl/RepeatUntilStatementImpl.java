/**
 * generated by Xtext 2.20.0
 */
package mil.navy.nrl.ncarai.jasm.program.impl;

import mil.navy.nrl.ncarai.jasm.program.ProgramPackage;
import mil.navy.nrl.ncarai.jasm.program.Repeat;
import mil.navy.nrl.ncarai.jasm.program.RepeatUntilStatement;
import mil.navy.nrl.ncarai.jasm.program.Until;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeat Until Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.navy.nrl.ncarai.jasm.program.impl.RepeatUntilStatementImpl#getRepeat <em>Repeat</em>}</li>
 *   <li>{@link mil.navy.nrl.ncarai.jasm.program.impl.RepeatUntilStatementImpl#getUntil <em>Until</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepeatUntilStatementImpl extends InstructionImpl implements RepeatUntilStatement
{
  /**
   * The cached value of the '{@link #getRepeat() <em>Repeat</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepeat()
   * @generated
   * @ordered
   */
  protected Repeat repeat;

  /**
   * The cached value of the '{@link #getUntil() <em>Until</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUntil()
   * @generated
   * @ordered
   */
  protected Until until;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RepeatUntilStatementImpl()
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
    return ProgramPackage.Literals.REPEAT_UNTIL_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Repeat getRepeat()
  {
    return repeat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRepeat(Repeat newRepeat, NotificationChain msgs)
  {
    Repeat oldRepeat = repeat;
    repeat = newRepeat;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProgramPackage.REPEAT_UNTIL_STATEMENT__REPEAT, oldRepeat, newRepeat);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRepeat(Repeat newRepeat)
  {
    if (newRepeat != repeat)
    {
      NotificationChain msgs = null;
      if (repeat != null)
        msgs = ((InternalEObject)repeat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProgramPackage.REPEAT_UNTIL_STATEMENT__REPEAT, null, msgs);
      if (newRepeat != null)
        msgs = ((InternalEObject)newRepeat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProgramPackage.REPEAT_UNTIL_STATEMENT__REPEAT, null, msgs);
      msgs = basicSetRepeat(newRepeat, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProgramPackage.REPEAT_UNTIL_STATEMENT__REPEAT, newRepeat, newRepeat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Until getUntil()
  {
    return until;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUntil(Until newUntil, NotificationChain msgs)
  {
    Until oldUntil = until;
    until = newUntil;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProgramPackage.REPEAT_UNTIL_STATEMENT__UNTIL, oldUntil, newUntil);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUntil(Until newUntil)
  {
    if (newUntil != until)
    {
      NotificationChain msgs = null;
      if (until != null)
        msgs = ((InternalEObject)until).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProgramPackage.REPEAT_UNTIL_STATEMENT__UNTIL, null, msgs);
      if (newUntil != null)
        msgs = ((InternalEObject)newUntil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProgramPackage.REPEAT_UNTIL_STATEMENT__UNTIL, null, msgs);
      msgs = basicSetUntil(newUntil, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProgramPackage.REPEAT_UNTIL_STATEMENT__UNTIL, newUntil, newUntil));
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
      case ProgramPackage.REPEAT_UNTIL_STATEMENT__REPEAT:
        return basicSetRepeat(null, msgs);
      case ProgramPackage.REPEAT_UNTIL_STATEMENT__UNTIL:
        return basicSetUntil(null, msgs);
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
      case ProgramPackage.REPEAT_UNTIL_STATEMENT__REPEAT:
        return getRepeat();
      case ProgramPackage.REPEAT_UNTIL_STATEMENT__UNTIL:
        return getUntil();
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
      case ProgramPackage.REPEAT_UNTIL_STATEMENT__REPEAT:
        setRepeat((Repeat)newValue);
        return;
      case ProgramPackage.REPEAT_UNTIL_STATEMENT__UNTIL:
        setUntil((Until)newValue);
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
      case ProgramPackage.REPEAT_UNTIL_STATEMENT__REPEAT:
        setRepeat((Repeat)null);
        return;
      case ProgramPackage.REPEAT_UNTIL_STATEMENT__UNTIL:
        setUntil((Until)null);
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
      case ProgramPackage.REPEAT_UNTIL_STATEMENT__REPEAT:
        return repeat != null;
      case ProgramPackage.REPEAT_UNTIL_STATEMENT__UNTIL:
        return until != null;
    }
    return super.eIsSet(featureID);
  }

} //RepeatUntilStatementImpl
