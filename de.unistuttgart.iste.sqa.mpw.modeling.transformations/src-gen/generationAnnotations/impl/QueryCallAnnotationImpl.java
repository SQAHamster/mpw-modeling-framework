/**
 */
package generationAnnotations.impl;

import generationAnnotations.GenerationAnnotationsPackage;
import generationAnnotations.QueryCallAnnotation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import queryBehavior.Query;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Call Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generationAnnotations.impl.QueryCallAnnotationImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link generationAnnotations.impl.QueryCallAnnotationImpl#getInternalRoleField <em>Internal Role Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryCallAnnotationImpl extends GenerationAnnotationImpl implements QueryCallAnnotation {
	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected Query query;

	/**
	 * The cached value of the '{@link #getInternalRoleField() <em>Internal Role Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalRoleField()
	 * @generated
	 * @ordered
	 */
	protected EReference internalRoleField;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryCallAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationAnnotationsPackage.Literals.QUERY_CALL_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query getQuery() {
		if (query != null && query.eIsProxy()) {
			InternalEObject oldQuery = (InternalEObject)query;
			query = (Query)eResolveProxy(oldQuery);
			if (query != oldQuery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenerationAnnotationsPackage.QUERY_CALL_ANNOTATION__QUERY, oldQuery, query));
			}
		}
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query basicGetQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(Query newQuery) {
		Query oldQuery = query;
		query = newQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationAnnotationsPackage.QUERY_CALL_ANNOTATION__QUERY, oldQuery, query));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalRoleField() {
		if (internalRoleField != null && internalRoleField.eIsProxy()) {
			InternalEObject oldInternalRoleField = (InternalEObject)internalRoleField;
			internalRoleField = (EReference)eResolveProxy(oldInternalRoleField);
			if (internalRoleField != oldInternalRoleField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenerationAnnotationsPackage.QUERY_CALL_ANNOTATION__INTERNAL_ROLE_FIELD, oldInternalRoleField, internalRoleField));
			}
		}
		return internalRoleField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetInternalRoleField() {
		return internalRoleField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalRoleField(EReference newInternalRoleField) {
		EReference oldInternalRoleField = internalRoleField;
		internalRoleField = newInternalRoleField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationAnnotationsPackage.QUERY_CALL_ANNOTATION__INTERNAL_ROLE_FIELD, oldInternalRoleField, internalRoleField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenerationAnnotationsPackage.QUERY_CALL_ANNOTATION__QUERY:
				if (resolve) return getQuery();
				return basicGetQuery();
			case GenerationAnnotationsPackage.QUERY_CALL_ANNOTATION__INTERNAL_ROLE_FIELD:
				if (resolve) return getInternalRoleField();
				return basicGetInternalRoleField();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GenerationAnnotationsPackage.QUERY_CALL_ANNOTATION__QUERY:
				setQuery((Query)newValue);
				return;
			case GenerationAnnotationsPackage.QUERY_CALL_ANNOTATION__INTERNAL_ROLE_FIELD:
				setInternalRoleField((EReference)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case GenerationAnnotationsPackage.QUERY_CALL_ANNOTATION__QUERY:
				setQuery((Query)null);
				return;
			case GenerationAnnotationsPackage.QUERY_CALL_ANNOTATION__INTERNAL_ROLE_FIELD:
				setInternalRoleField((EReference)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GenerationAnnotationsPackage.QUERY_CALL_ANNOTATION__QUERY:
				return query != null;
			case GenerationAnnotationsPackage.QUERY_CALL_ANNOTATION__INTERNAL_ROLE_FIELD:
				return internalRoleField != null;
		}
		return super.eIsSet(featureID);
	}

} //QueryCallAnnotationImpl
