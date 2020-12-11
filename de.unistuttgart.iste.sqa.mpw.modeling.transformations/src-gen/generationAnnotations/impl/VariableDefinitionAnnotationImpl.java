/**
 */
package generationAnnotations.impl;

import generationAnnotations.GenerationAnnotation;
import generationAnnotations.GenerationAnnotationsPackage;
import generationAnnotations.VariableDefinitionAnnotation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Definition Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generationAnnotations.impl.VariableDefinitionAnnotationImpl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link generationAnnotations.impl.VariableDefinitionAnnotationImpl#getVariableTypeName <em>Variable Type Name</em>}</li>
 *   <li>{@link generationAnnotations.impl.VariableDefinitionAnnotationImpl#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDefinitionAnnotationImpl extends GenerationAnnotationImpl implements VariableDefinitionAnnotation {
	/**
	 * The default value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected String variableName = VARIABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariableTypeName() <em>Variable Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariableTypeName() <em>Variable Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableTypeName()
	 * @generated
	 * @ordered
	 */
	protected String variableTypeName = VARIABLE_TYPE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRhs() <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhs()
	 * @generated
	 * @ordered
	 */
	protected GenerationAnnotation rhs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDefinitionAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationAnnotationsPackage.Literals.VARIABLE_DEFINITION_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariableName() {
		return variableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableName(String newVariableName) {
		String oldVariableName = variableName;
		variableName = newVariableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationAnnotationsPackage.VARIABLE_DEFINITION_ANNOTATION__VARIABLE_NAME, oldVariableName, variableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariableTypeName() {
		return variableTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableTypeName(String newVariableTypeName) {
		String oldVariableTypeName = variableTypeName;
		variableTypeName = newVariableTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationAnnotationsPackage.VARIABLE_DEFINITION_ANNOTATION__VARIABLE_TYPE_NAME, oldVariableTypeName, variableTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationAnnotation getRhs() {
		return rhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRhs(GenerationAnnotation newRhs, NotificationChain msgs) {
		GenerationAnnotation oldRhs = rhs;
		rhs = newRhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenerationAnnotationsPackage.VARIABLE_DEFINITION_ANNOTATION__RHS, oldRhs, newRhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhs(GenerationAnnotation newRhs) {
		if (newRhs != rhs) {
			NotificationChain msgs = null;
			if (rhs != null)
				msgs = ((InternalEObject)rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenerationAnnotationsPackage.VARIABLE_DEFINITION_ANNOTATION__RHS, null, msgs);
			if (newRhs != null)
				msgs = ((InternalEObject)newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenerationAnnotationsPackage.VARIABLE_DEFINITION_ANNOTATION__RHS, null, msgs);
			msgs = basicSetRhs(newRhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationAnnotationsPackage.VARIABLE_DEFINITION_ANNOTATION__RHS, newRhs, newRhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenerationAnnotationsPackage.VARIABLE_DEFINITION_ANNOTATION__RHS:
				return basicSetRhs(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenerationAnnotationsPackage.VARIABLE_DEFINITION_ANNOTATION__VARIABLE_NAME:
				return getVariableName();
			case GenerationAnnotationsPackage.VARIABLE_DEFINITION_ANNOTATION__VARIABLE_TYPE_NAME:
				return getVariableTypeName();
			case GenerationAnnotationsPackage.VARIABLE_DEFINITION_ANNOTATION__RHS:
				return getRhs();
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
			case GenerationAnnotationsPackage.VARIABLE_DEFINITION_ANNOTATION__VARIABLE_NAME:
				setVariableName((String)newValue);
				return;
			case GenerationAnnotationsPackage.VARIABLE_DEFINITION_ANNOTATION__VARIABLE_TYPE_NAME:
				setVariableTypeName((String)newValue);
				return;
			case GenerationAnnotationsPackage.VARIABLE_DEFINITION_ANNOTATION__RHS:
				setRhs((GenerationAnnotation)newValue);
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
			case GenerationAnnotationsPackage.VARIABLE_DEFINITION_ANNOTATION__VARIABLE_NAME:
				setVariableName(VARIABLE_NAME_EDEFAULT);
				return;
			case GenerationAnnotationsPackage.VARIABLE_DEFINITION_ANNOTATION__VARIABLE_TYPE_NAME:
				setVariableTypeName(VARIABLE_TYPE_NAME_EDEFAULT);
				return;
			case GenerationAnnotationsPackage.VARIABLE_DEFINITION_ANNOTATION__RHS:
				setRhs((GenerationAnnotation)null);
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
			case GenerationAnnotationsPackage.VARIABLE_DEFINITION_ANNOTATION__VARIABLE_NAME:
				return VARIABLE_NAME_EDEFAULT == null ? variableName != null : !VARIABLE_NAME_EDEFAULT.equals(variableName);
			case GenerationAnnotationsPackage.VARIABLE_DEFINITION_ANNOTATION__VARIABLE_TYPE_NAME:
				return VARIABLE_TYPE_NAME_EDEFAULT == null ? variableTypeName != null : !VARIABLE_TYPE_NAME_EDEFAULT.equals(variableTypeName);
			case GenerationAnnotationsPackage.VARIABLE_DEFINITION_ANNOTATION__RHS:
				return rhs != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (variableName: ");
		result.append(variableName);
		result.append(", variableTypeName: ");
		result.append(variableTypeName);
		result.append(')');
		return result.toString();
	}

} //VariableDefinitionAnnotationImpl
