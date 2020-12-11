/**
 */
package queryBehavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Method Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link queryBehavior.CollectionMethodStatement#getParameters <em>Parameters</em>}</li>
 *   <li>{@link queryBehavior.CollectionMethodStatement#getMethodType <em>Method Type</em>}</li>
 *   <li>{@link queryBehavior.CollectionMethodStatement#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see queryBehavior.QueryPackage#getCollectionMethodStatement()
 * @model
 * @generated
 */
public interface CollectionMethodStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see queryBehavior.QueryPackage#getCollectionMethodStatement_Parameters()
	 * @model
	 * @generated
	 */
	EList<EObject> getParameters();

	/**
	 * Returns the value of the '<em><b>Method Type</b></em>' attribute.
	 * The literals are from the enumeration {@link queryBehavior.CollectionMethodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Type</em>' attribute.
	 * @see queryBehavior.CollectionMethodType
	 * @see #setMethodType(CollectionMethodType)
	 * @see queryBehavior.QueryPackage#getCollectionMethodStatement_MethodType()
	 * @model required="true"
	 * @generated
	 */
	CollectionMethodType getMethodType();

	/**
	 * Sets the value of the '{@link queryBehavior.CollectionMethodStatement#getMethodType <em>Method Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Type</em>' attribute.
	 * @see queryBehavior.CollectionMethodType
	 * @see #getMethodType()
	 * @generated
	 */
	void setMethodType(CollectionMethodType value);

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see queryBehavior.QueryPackage#getCollectionMethodStatement_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getContents();

} // CollectionMethodStatement
