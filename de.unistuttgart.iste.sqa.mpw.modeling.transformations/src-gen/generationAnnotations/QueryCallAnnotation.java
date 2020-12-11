/**
 */
package generationAnnotations;

import org.eclipse.emf.ecore.EReference;

import queryBehavior.Query;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Call Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generationAnnotations.QueryCallAnnotation#getQuery <em>Query</em>}</li>
 *   <li>{@link generationAnnotations.QueryCallAnnotation#getInternalRoleField <em>Internal Role Field</em>}</li>
 * </ul>
 *
 * @see generationAnnotations.GenerationAnnotationsPackage#getQueryCallAnnotation()
 * @model
 * @generated
 */
public interface QueryCallAnnotation extends GenerationAnnotation {
	/**
	 * Returns the value of the '<em><b>Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' reference.
	 * @see #setQuery(Query)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getQueryCallAnnotation_Query()
	 * @model required="true"
	 * @generated
	 */
	Query getQuery();

	/**
	 * Sets the value of the '{@link generationAnnotations.QueryCallAnnotation#getQuery <em>Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(Query value);

	/**
	 * Returns the value of the '<em><b>Internal Role Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Role Field</em>' reference.
	 * @see #setInternalRoleField(EReference)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getQueryCallAnnotation_InternalRoleField()
	 * @model required="true"
	 * @generated
	 */
	EReference getInternalRoleField();

	/**
	 * Sets the value of the '{@link generationAnnotations.QueryCallAnnotation#getInternalRoleField <em>Internal Role Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Role Field</em>' reference.
	 * @see #getInternalRoleField()
	 * @generated
	 */
	void setInternalRoleField(EReference value);

} // QueryCallAnnotation
