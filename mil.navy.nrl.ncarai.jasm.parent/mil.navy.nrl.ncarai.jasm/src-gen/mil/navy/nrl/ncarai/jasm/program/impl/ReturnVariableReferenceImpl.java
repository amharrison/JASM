/**
 * generated by Xtext 2.20.0
 */
package mil.navy.nrl.ncarai.jasm.program.impl;

import mil.navy.nrl.ncarai.jasm.program.ProgramPackage;
import mil.navy.nrl.ncarai.jasm.program.ReturnVariableReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.jactr.io2.jactr.modelFragment.Buffer;
import org.jactr.io2.jactr.modelFragment.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.navy.nrl.ncarai.jasm.program.impl.ReturnVariableReferenceImpl#getBuffer <em>Buffer</em>}</li>
 *   <li>{@link mil.navy.nrl.ncarai.jasm.program.impl.ReturnVariableReferenceImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnVariableReferenceImpl extends MinimalEObjectImpl.Container implements ReturnVariableReference
{
  /**
   * The cached value of the '{@link #getBuffer() <em>Buffer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuffer()
   * @generated
   * @ordered
   */
  protected Buffer buffer;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Value value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReturnVariableReferenceImpl()
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
    return ProgramPackage.Literals.RETURN_VARIABLE_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Buffer getBuffer()
  {
    if (buffer != null && buffer.eIsProxy())
    {
      InternalEObject oldBuffer = (InternalEObject)buffer;
      buffer = (Buffer)eResolveProxy(oldBuffer);
      if (buffer != oldBuffer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProgramPackage.RETURN_VARIABLE_REFERENCE__BUFFER, oldBuffer, buffer));
      }
    }
    return buffer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Buffer basicGetBuffer()
  {
    return buffer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBuffer(Buffer newBuffer)
  {
    Buffer oldBuffer = buffer;
    buffer = newBuffer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProgramPackage.RETURN_VARIABLE_REFERENCE__BUFFER, oldBuffer, buffer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Value getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Value newValue, NotificationChain msgs)
  {
    Value oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProgramPackage.RETURN_VARIABLE_REFERENCE__VALUE, oldValue, newValue);
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
  public void setValue(Value newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProgramPackage.RETURN_VARIABLE_REFERENCE__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProgramPackage.RETURN_VARIABLE_REFERENCE__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProgramPackage.RETURN_VARIABLE_REFERENCE__VALUE, newValue, newValue));
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
      case ProgramPackage.RETURN_VARIABLE_REFERENCE__VALUE:
        return basicSetValue(null, msgs);
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
      case ProgramPackage.RETURN_VARIABLE_REFERENCE__BUFFER:
        if (resolve) return getBuffer();
        return basicGetBuffer();
      case ProgramPackage.RETURN_VARIABLE_REFERENCE__VALUE:
        return getValue();
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
      case ProgramPackage.RETURN_VARIABLE_REFERENCE__BUFFER:
        setBuffer((Buffer)newValue);
        return;
      case ProgramPackage.RETURN_VARIABLE_REFERENCE__VALUE:
        setValue((Value)newValue);
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
      case ProgramPackage.RETURN_VARIABLE_REFERENCE__BUFFER:
        setBuffer((Buffer)null);
        return;
      case ProgramPackage.RETURN_VARIABLE_REFERENCE__VALUE:
        setValue((Value)null);
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
      case ProgramPackage.RETURN_VARIABLE_REFERENCE__BUFFER:
        return buffer != null;
      case ProgramPackage.RETURN_VARIABLE_REFERENCE__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //ReturnVariableReferenceImpl