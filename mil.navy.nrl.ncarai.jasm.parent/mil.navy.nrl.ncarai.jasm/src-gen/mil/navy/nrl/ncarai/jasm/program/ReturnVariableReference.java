/**
 * generated by Xtext 2.20.0
 */
package mil.navy.nrl.ncarai.jasm.program;

import org.eclipse.emf.ecore.EObject;

import org.jactr.io2.jactr.modelFragment.Buffer;
import org.jactr.io2.jactr.modelFragment.Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.navy.nrl.ncarai.jasm.program.ReturnVariableReference#getBuffer <em>Buffer</em>}</li>
 *   <li>{@link mil.navy.nrl.ncarai.jasm.program.ReturnVariableReference#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see mil.navy.nrl.ncarai.jasm.program.ProgramPackage#getReturnVariableReference()
 * @model
 * @generated
 */
public interface ReturnVariableReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Buffer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Buffer</em>' reference.
   * @see #setBuffer(Buffer)
   * @see mil.navy.nrl.ncarai.jasm.program.ProgramPackage#getReturnVariableReference_Buffer()
   * @model
   * @generated
   */
  Buffer getBuffer();

  /**
   * Sets the value of the '{@link mil.navy.nrl.ncarai.jasm.program.ReturnVariableReference#getBuffer <em>Buffer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Buffer</em>' reference.
   * @see #getBuffer()
   * @generated
   */
  void setBuffer(Buffer value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Value)
   * @see mil.navy.nrl.ncarai.jasm.program.ProgramPackage#getReturnVariableReference_Value()
   * @model containment="true"
   * @generated
   */
  Value getValue();

  /**
   * Sets the value of the '{@link mil.navy.nrl.ncarai.jasm.program.ReturnVariableReference#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Value value);

} // ReturnVariableReference