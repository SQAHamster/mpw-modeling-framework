/**
 * generated by Xtext 2.23.0
 */
package de.unistuttgart.iste.sqa.mpw.modeling.querydsl.querydsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.iste.sqa.mpw.modeling.querydsl.querydsl.MethodCall#getTargetMethod <em>Target Method</em>}</li>
 *   <li>{@link de.unistuttgart.iste.sqa.mpw.modeling.querydsl.querydsl.MethodCall#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.iste.sqa.mpw.modeling.querydsl.querydsl.QuerydslPackage#getMethodCall()
 * @model
 * @generated
 */
public interface MethodCall extends EObject
{
  /**
   * Returns the value of the '<em><b>Target Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Method</em>' attribute.
   * @see #setTargetMethod(String)
   * @see de.unistuttgart.iste.sqa.mpw.modeling.querydsl.querydsl.QuerydslPackage#getMethodCall_TargetMethod()
   * @model
   * @generated
   */
  String getTargetMethod();

  /**
   * Sets the value of the '{@link de.unistuttgart.iste.sqa.mpw.modeling.querydsl.querydsl.MethodCall#getTargetMethod <em>Target Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Method</em>' attribute.
   * @see #getTargetMethod()
   * @generated
   */
  void setTargetMethod(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' attribute list.
   * @see de.unistuttgart.iste.sqa.mpw.modeling.querydsl.querydsl.QuerydslPackage#getMethodCall_Parameters()
   * @model unique="false"
   * @generated
   */
  EList<String> getParameters();

} // MethodCall