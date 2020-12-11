/**
 */
package generationAnnotations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see generationAnnotations.GenerationAnnotationsFactory
 * @model kind="package"
 * @generated
 */
public interface GenerationAnnotationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "generationAnnotations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mpw.uni-stuttgart.de/generation/annotations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generationAnnotations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenerationAnnotationsPackage eINSTANCE = generationAnnotations.impl.GenerationAnnotationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link generationAnnotations.impl.GenerationAnnotationImpl <em>Generation Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generationAnnotations.impl.GenerationAnnotationImpl
	 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getGenerationAnnotation()
	 * @generated
	 */
	int GENERATION_ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_ANNOTATION__EANNOTATIONS = EcorePackage.EANNOTATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_ANNOTATION__SOURCE = EcorePackage.EANNOTATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_ANNOTATION__DETAILS = EcorePackage.EANNOTATION__DETAILS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_ANNOTATION__EMODEL_ELEMENT = EcorePackage.EANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_ANNOTATION__CONTENTS = EcorePackage.EANNOTATION__CONTENTS;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_ANNOTATION__REFERENCES = EcorePackage.EANNOTATION__REFERENCES;

	/**
	 * The number of structural features of the '<em>Generation Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_ANNOTATION_FEATURE_COUNT = EcorePackage.EANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_ANNOTATION___GET_EANNOTATION__STRING = EcorePackage.EANNOTATION___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Generation Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_ANNOTATION_OPERATION_COUNT = EcorePackage.EANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generationAnnotations.impl.ConstructorAnnotationImpl <em>Constructor Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generationAnnotations.impl.ConstructorAnnotationImpl
	 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getConstructorAnnotation()
	 * @generated
	 */
	int CONSTRUCTOR_ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ANNOTATION__EANNOTATIONS = GENERATION_ANNOTATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ANNOTATION__SOURCE = GENERATION_ANNOTATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ANNOTATION__DETAILS = GENERATION_ANNOTATION__DETAILS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ANNOTATION__EMODEL_ELEMENT = GENERATION_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ANNOTATION__CONTENTS = GENERATION_ANNOTATION__CONTENTS;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ANNOTATION__REFERENCES = GENERATION_ANNOTATION__REFERENCES;

	/**
	 * The number of structural features of the '<em>Constructor Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ANNOTATION_FEATURE_COUNT = GENERATION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ANNOTATION___GET_EANNOTATION__STRING = GENERATION_ANNOTATION___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Constructor Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ANNOTATION_OPERATION_COUNT = GENERATION_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generationAnnotations.impl.FieldAssignmentAnnotationImpl <em>Field Assignment Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generationAnnotations.impl.FieldAssignmentAnnotationImpl
	 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getFieldAssignmentAnnotation()
	 * @generated
	 */
	int FIELD_ASSIGNMENT_ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ASSIGNMENT_ANNOTATION__EANNOTATIONS = GENERATION_ANNOTATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ASSIGNMENT_ANNOTATION__SOURCE = GENERATION_ANNOTATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ASSIGNMENT_ANNOTATION__DETAILS = GENERATION_ANNOTATION__DETAILS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ASSIGNMENT_ANNOTATION__EMODEL_ELEMENT = GENERATION_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ASSIGNMENT_ANNOTATION__CONTENTS = GENERATION_ANNOTATION__CONTENTS;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ASSIGNMENT_ANNOTATION__REFERENCES = GENERATION_ANNOTATION__REFERENCES;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ASSIGNMENT_ANNOTATION__FIELD = GENERATION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field Assignment Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ASSIGNMENT_ANNOTATION_FEATURE_COUNT = GENERATION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ASSIGNMENT_ANNOTATION___GET_EANNOTATION__STRING = GENERATION_ANNOTATION___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Field Assignment Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ASSIGNMENT_ANNOTATION_OPERATION_COUNT = GENERATION_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generationAnnotations.impl.ParameterToFieldAssignmentAnnotationImpl <em>Parameter To Field Assignment Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generationAnnotations.impl.ParameterToFieldAssignmentAnnotationImpl
	 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getParameterToFieldAssignmentAnnotation()
	 * @generated
	 */
	int PARAMETER_TO_FIELD_ASSIGNMENT_ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO_FIELD_ASSIGNMENT_ANNOTATION__EANNOTATIONS = FIELD_ASSIGNMENT_ANNOTATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO_FIELD_ASSIGNMENT_ANNOTATION__SOURCE = FIELD_ASSIGNMENT_ANNOTATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO_FIELD_ASSIGNMENT_ANNOTATION__DETAILS = FIELD_ASSIGNMENT_ANNOTATION__DETAILS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO_FIELD_ASSIGNMENT_ANNOTATION__EMODEL_ELEMENT = FIELD_ASSIGNMENT_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO_FIELD_ASSIGNMENT_ANNOTATION__CONTENTS = FIELD_ASSIGNMENT_ANNOTATION__CONTENTS;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO_FIELD_ASSIGNMENT_ANNOTATION__REFERENCES = FIELD_ASSIGNMENT_ANNOTATION__REFERENCES;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO_FIELD_ASSIGNMENT_ANNOTATION__FIELD = FIELD_ASSIGNMENT_ANNOTATION__FIELD;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO_FIELD_ASSIGNMENT_ANNOTATION__PARAMETER = FIELD_ASSIGNMENT_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter To Field Assignment Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO_FIELD_ASSIGNMENT_ANNOTATION_FEATURE_COUNT = FIELD_ASSIGNMENT_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO_FIELD_ASSIGNMENT_ANNOTATION___GET_EANNOTATION__STRING = FIELD_ASSIGNMENT_ANNOTATION___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Parameter To Field Assignment Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO_FIELD_ASSIGNMENT_ANNOTATION_OPERATION_COUNT = FIELD_ASSIGNMENT_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generationAnnotations.impl.PropertyPathFieldAssignmentAnnotationImpl <em>Property Path Field Assignment Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generationAnnotations.impl.PropertyPathFieldAssignmentAnnotationImpl
	 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getPropertyPathFieldAssignmentAnnotation()
	 * @generated
	 */
	int PROPERTY_PATH_FIELD_ASSIGNMENT_ANNOTATION = 4;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_FIELD_ASSIGNMENT_ANNOTATION__EANNOTATIONS = FIELD_ASSIGNMENT_ANNOTATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_FIELD_ASSIGNMENT_ANNOTATION__SOURCE = FIELD_ASSIGNMENT_ANNOTATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_FIELD_ASSIGNMENT_ANNOTATION__DETAILS = FIELD_ASSIGNMENT_ANNOTATION__DETAILS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_FIELD_ASSIGNMENT_ANNOTATION__EMODEL_ELEMENT = FIELD_ASSIGNMENT_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_FIELD_ASSIGNMENT_ANNOTATION__CONTENTS = FIELD_ASSIGNMENT_ANNOTATION__CONTENTS;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_FIELD_ASSIGNMENT_ANNOTATION__REFERENCES = FIELD_ASSIGNMENT_ANNOTATION__REFERENCES;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_FIELD_ASSIGNMENT_ANNOTATION__FIELD = FIELD_ASSIGNMENT_ANNOTATION__FIELD;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_FIELD_ASSIGNMENT_ANNOTATION__PROPERTY_PATH = FIELD_ASSIGNMENT_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Path Field Assignment Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_FIELD_ASSIGNMENT_ANNOTATION_FEATURE_COUNT = FIELD_ASSIGNMENT_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_FIELD_ASSIGNMENT_ANNOTATION___GET_EANNOTATION__STRING = FIELD_ASSIGNMENT_ANNOTATION___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Property Path Field Assignment Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_FIELD_ASSIGNMENT_ANNOTATION_OPERATION_COUNT = FIELD_ASSIGNMENT_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generationAnnotations.impl.FieldInitializationAnnotationImpl <em>Field Initialization Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generationAnnotations.impl.FieldInitializationAnnotationImpl
	 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getFieldInitializationAnnotation()
	 * @generated
	 */
	int FIELD_INITIALIZATION_ANNOTATION = 5;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_INITIALIZATION_ANNOTATION__EANNOTATIONS = GENERATION_ANNOTATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_INITIALIZATION_ANNOTATION__SOURCE = GENERATION_ANNOTATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_INITIALIZATION_ANNOTATION__DETAILS = GENERATION_ANNOTATION__DETAILS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_INITIALIZATION_ANNOTATION__EMODEL_ELEMENT = GENERATION_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_INITIALIZATION_ANNOTATION__CONTENTS = GENERATION_ANNOTATION__CONTENTS;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_INITIALIZATION_ANNOTATION__REFERENCES = GENERATION_ANNOTATION__REFERENCES;

	/**
	 * The number of structural features of the '<em>Field Initialization Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_INITIALIZATION_ANNOTATION_FEATURE_COUNT = GENERATION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_INITIALIZATION_ANNOTATION___GET_EANNOTATION__STRING = GENERATION_ANNOTATION___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Field Initialization Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_INITIALIZATION_ANNOTATION_OPERATION_COUNT = GENERATION_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generationAnnotations.impl.InlineSimpleFieldInitializationAnnotationImpl <em>Inline Simple Field Initialization Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generationAnnotations.impl.InlineSimpleFieldInitializationAnnotationImpl
	 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getInlineSimpleFieldInitializationAnnotation()
	 * @generated
	 */
	int INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION = 6;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__EANNOTATIONS = FIELD_INITIALIZATION_ANNOTATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__SOURCE = FIELD_INITIALIZATION_ANNOTATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__DETAILS = FIELD_INITIALIZATION_ANNOTATION__DETAILS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__EMODEL_ELEMENT = FIELD_INITIALIZATION_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__CONTENTS = FIELD_INITIALIZATION_ANNOTATION__CONTENTS;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__REFERENCES = FIELD_INITIALIZATION_ANNOTATION__REFERENCES;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__FIELD = FIELD_INITIALIZATION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Input Variable Property Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__PARAMETER_INPUT_VARIABLE_PROPERTY_PATHS = FIELD_INITIALIZATION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inline Simple Field Initialization Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION_FEATURE_COUNT = FIELD_INITIALIZATION_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION___GET_EANNOTATION__STRING = FIELD_INITIALIZATION_ANNOTATION___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Inline Simple Field Initialization Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION_OPERATION_COUNT = FIELD_INITIALIZATION_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generationAnnotations.impl.ConstructorSimpleFieldInitializationAnnotationImpl <em>Constructor Simple Field Initialization Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generationAnnotations.impl.ConstructorSimpleFieldInitializationAnnotationImpl
	 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getConstructorSimpleFieldInitializationAnnotation()
	 * @generated
	 */
	int CONSTRUCTOR_SIMPLE_FIELD_INITIALIZATION_ANNOTATION = 7;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__EANNOTATIONS = FIELD_INITIALIZATION_ANNOTATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__SOURCE = FIELD_INITIALIZATION_ANNOTATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__DETAILS = FIELD_INITIALIZATION_ANNOTATION__DETAILS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__EMODEL_ELEMENT = FIELD_INITIALIZATION_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__CONTENTS = FIELD_INITIALIZATION_ANNOTATION__CONTENTS;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__REFERENCES = FIELD_INITIALIZATION_ANNOTATION__REFERENCES;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__FIELD = FIELD_INITIALIZATION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Input Variable Property Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__PARAMETER_INPUT_VARIABLE_PROPERTY_PATHS = FIELD_INITIALIZATION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constructor Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__CONSTRUCTOR_TYPE_NAME = FIELD_INITIALIZATION_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constructor Simple Field Initialization Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_SIMPLE_FIELD_INITIALIZATION_ANNOTATION_FEATURE_COUNT = FIELD_INITIALIZATION_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_SIMPLE_FIELD_INITIALIZATION_ANNOTATION___GET_EANNOTATION__STRING = FIELD_INITIALIZATION_ANNOTATION___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Constructor Simple Field Initialization Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_SIMPLE_FIELD_INITIALIZATION_ANNOTATION_OPERATION_COUNT = FIELD_INITIALIZATION_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generationAnnotations.impl.VisibilityAnnotationImpl <em>Visibility Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generationAnnotations.impl.VisibilityAnnotationImpl
	 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getVisibilityAnnotation()
	 * @generated
	 */
	int VISIBILITY_ANNOTATION = 8;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_ANNOTATION__EANNOTATIONS = GENERATION_ANNOTATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_ANNOTATION__SOURCE = GENERATION_ANNOTATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_ANNOTATION__DETAILS = GENERATION_ANNOTATION__DETAILS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_ANNOTATION__EMODEL_ELEMENT = GENERATION_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_ANNOTATION__CONTENTS = GENERATION_ANNOTATION__CONTENTS;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_ANNOTATION__REFERENCES = GENERATION_ANNOTATION__REFERENCES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_ANNOTATION__VISIBILITY = GENERATION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Visibility Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_ANNOTATION_FEATURE_COUNT = GENERATION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_ANNOTATION___GET_EANNOTATION__STRING = GENERATION_ANNOTATION___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Visibility Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_ANNOTATION_OPERATION_COUNT = GENERATION_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generationAnnotations.impl.CommandParameterCreationAnnotationImpl <em>Command Parameter Creation Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generationAnnotations.impl.CommandParameterCreationAnnotationImpl
	 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getCommandParameterCreationAnnotation()
	 * @generated
	 */
	int COMMAND_PARAMETER_CREATION_ANNOTATION = 9;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMETER_CREATION_ANNOTATION__EANNOTATIONS = GENERATION_ANNOTATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMETER_CREATION_ANNOTATION__SOURCE = GENERATION_ANNOTATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMETER_CREATION_ANNOTATION__DETAILS = GENERATION_ANNOTATION__DETAILS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMETER_CREATION_ANNOTATION__EMODEL_ELEMENT = GENERATION_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMETER_CREATION_ANNOTATION__CONTENTS = GENERATION_ANNOTATION__CONTENTS;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMETER_CREATION_ANNOTATION__REFERENCES = GENERATION_ANNOTATION__REFERENCES;

	/**
	 * The feature id for the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMETER_CREATION_ANNOTATION__COMMAND = GENERATION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Mappings</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMETER_CREATION_ANNOTATION__PARAMETER_MAPPINGS = GENERATION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMETER_CREATION_ANNOTATION__PARAMETERS_VARIABLE_NAME = GENERATION_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Command Parameter Creation Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMETER_CREATION_ANNOTATION_FEATURE_COUNT = GENERATION_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMETER_CREATION_ANNOTATION___GET_EANNOTATION__STRING = GENERATION_ANNOTATION___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Command Parameter Creation Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMETER_CREATION_ANNOTATION_OPERATION_COUNT = GENERATION_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generationAnnotations.impl.CommandCreationAnnotationImpl <em>Command Creation Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generationAnnotations.impl.CommandCreationAnnotationImpl
	 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getCommandCreationAnnotation()
	 * @generated
	 */
	int COMMAND_CREATION_ANNOTATION = 10;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CREATION_ANNOTATION__EANNOTATIONS = GENERATION_ANNOTATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CREATION_ANNOTATION__SOURCE = GENERATION_ANNOTATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CREATION_ANNOTATION__DETAILS = GENERATION_ANNOTATION__DETAILS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CREATION_ANNOTATION__EMODEL_ELEMENT = GENERATION_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CREATION_ANNOTATION__CONTENTS = GENERATION_ANNOTATION__CONTENTS;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CREATION_ANNOTATION__REFERENCES = GENERATION_ANNOTATION__REFERENCES;

	/**
	 * The feature id for the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CREATION_ANNOTATION__COMMAND = GENERATION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Command Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CREATION_ANNOTATION__COMMAND_VARIABLE_NAME = GENERATION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CREATION_ANNOTATION__PARAMETERS_VARIABLE_NAME = GENERATION_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Command Creation Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CREATION_ANNOTATION_FEATURE_COUNT = GENERATION_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CREATION_ANNOTATION___GET_EANNOTATION__STRING = GENERATION_ANNOTATION___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Command Creation Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CREATION_ANNOTATION_OPERATION_COUNT = GENERATION_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generationAnnotations.impl.CommandCallAnnotationImpl <em>Command Call Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generationAnnotations.impl.CommandCallAnnotationImpl
	 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getCommandCallAnnotation()
	 * @generated
	 */
	int COMMAND_CALL_ANNOTATION = 11;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CALL_ANNOTATION__EANNOTATIONS = GENERATION_ANNOTATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CALL_ANNOTATION__SOURCE = GENERATION_ANNOTATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CALL_ANNOTATION__DETAILS = GENERATION_ANNOTATION__DETAILS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CALL_ANNOTATION__EMODEL_ELEMENT = GENERATION_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CALL_ANNOTATION__CONTENTS = GENERATION_ANNOTATION__CONTENTS;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CALL_ANNOTATION__REFERENCES = GENERATION_ANNOTATION__REFERENCES;

	/**
	 * The feature id for the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CALL_ANNOTATION__COMMAND = GENERATION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Role Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CALL_ANNOTATION__TARGET_ROLE_VARIABLE_NAME = GENERATION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CALL_ANNOTATION__PARAMETERS_VARIABLE_NAME = GENERATION_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Command Call Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CALL_ANNOTATION_FEATURE_COUNT = GENERATION_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CALL_ANNOTATION___GET_EANNOTATION__STRING = GENERATION_ANNOTATION___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Command Call Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CALL_ANNOTATION_OPERATION_COUNT = GENERATION_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generationAnnotations.impl.QueryCallAnnotationImpl <em>Query Call Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generationAnnotations.impl.QueryCallAnnotationImpl
	 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getQueryCallAnnotation()
	 * @generated
	 */
	int QUERY_CALL_ANNOTATION = 12;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CALL_ANNOTATION__EANNOTATIONS = GENERATION_ANNOTATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CALL_ANNOTATION__SOURCE = GENERATION_ANNOTATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CALL_ANNOTATION__DETAILS = GENERATION_ANNOTATION__DETAILS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CALL_ANNOTATION__EMODEL_ELEMENT = GENERATION_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CALL_ANNOTATION__CONTENTS = GENERATION_ANNOTATION__CONTENTS;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CALL_ANNOTATION__REFERENCES = GENERATION_ANNOTATION__REFERENCES;

	/**
	 * The feature id for the '<em><b>Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CALL_ANNOTATION__QUERY = GENERATION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Internal Role Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CALL_ANNOTATION__INTERNAL_ROLE_FIELD = GENERATION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Query Call Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CALL_ANNOTATION_FEATURE_COUNT = GENERATION_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CALL_ANNOTATION___GET_EANNOTATION__STRING = GENERATION_ANNOTATION___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Query Call Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CALL_ANNOTATION_OPERATION_COUNT = GENERATION_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generationAnnotations.impl.GetPropertyAnnotationImpl <em>Get Property Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generationAnnotations.impl.GetPropertyAnnotationImpl
	 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getGetPropertyAnnotation()
	 * @generated
	 */
	int GET_PROPERTY_ANNOTATION = 13;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_ANNOTATION__EANNOTATIONS = GENERATION_ANNOTATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_ANNOTATION__SOURCE = GENERATION_ANNOTATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_ANNOTATION__DETAILS = GENERATION_ANNOTATION__DETAILS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_ANNOTATION__EMODEL_ELEMENT = GENERATION_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_ANNOTATION__CONTENTS = GENERATION_ANNOTATION__CONTENTS;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_ANNOTATION__REFERENCES = GENERATION_ANNOTATION__REFERENCES;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_ANNOTATION__FIELD = GENERATION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Getter Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_ANNOTATION__GETTER_TYPE_NAME = GENERATION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Getter Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_ANNOTATION__GETTER_OPERATION_NAME = GENERATION_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Get Property Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_ANNOTATION_FEATURE_COUNT = GENERATION_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_ANNOTATION___GET_EANNOTATION__STRING = GENERATION_ANNOTATION___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Get Property Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_ANNOTATION_OPERATION_COUNT = GENERATION_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generationAnnotations.impl.GetPropertyDeclarationAnnotationImpl <em>Get Property Declaration Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generationAnnotations.impl.GetPropertyDeclarationAnnotationImpl
	 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getGetPropertyDeclarationAnnotation()
	 * @generated
	 */
	int GET_PROPERTY_DECLARATION_ANNOTATION = 14;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_DECLARATION_ANNOTATION__EANNOTATIONS = GENERATION_ANNOTATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_DECLARATION_ANNOTATION__SOURCE = GENERATION_ANNOTATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_DECLARATION_ANNOTATION__DETAILS = GENERATION_ANNOTATION__DETAILS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_DECLARATION_ANNOTATION__EMODEL_ELEMENT = GENERATION_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_DECLARATION_ANNOTATION__CONTENTS = GENERATION_ANNOTATION__CONTENTS;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_DECLARATION_ANNOTATION__REFERENCES = GENERATION_ANNOTATION__REFERENCES;

	/**
	 * The feature id for the '<em><b>Field Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_DECLARATION_ANNOTATION__FIELD_TYPE_NAME = GENERATION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Getter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_DECLARATION_ANNOTATION__GETTER_NAME = GENERATION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Get Property Declaration Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_DECLARATION_ANNOTATION_FEATURE_COUNT = GENERATION_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_DECLARATION_ANNOTATION___GET_EANNOTATION__STRING = GENERATION_ANNOTATION___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Get Property Declaration Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_DECLARATION_ANNOTATION_OPERATION_COUNT = GENERATION_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generationAnnotations.impl.MethodCallAnnotationImpl <em>Method Call Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generationAnnotations.impl.MethodCallAnnotationImpl
	 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getMethodCallAnnotation()
	 * @generated
	 */
	int METHOD_CALL_ANNOTATION = 15;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_ANNOTATION__EANNOTATIONS = GENERATION_ANNOTATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_ANNOTATION__SOURCE = GENERATION_ANNOTATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_ANNOTATION__DETAILS = GENERATION_ANNOTATION__DETAILS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_ANNOTATION__EMODEL_ELEMENT = GENERATION_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_ANNOTATION__CONTENTS = GENERATION_ANNOTATION__CONTENTS;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_ANNOTATION__REFERENCES = GENERATION_ANNOTATION__REFERENCES;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_ANNOTATION__VARIABLE_NAME = GENERATION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_ANNOTATION__METHOD_NAME = GENERATION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter Input Variable Property Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_ANNOTATION__PARAMETER_INPUT_VARIABLE_PROPERTY_PATHS = GENERATION_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Method Call Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_ANNOTATION_FEATURE_COUNT = GENERATION_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_ANNOTATION___GET_EANNOTATION__STRING = GENERATION_ANNOTATION___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Method Call Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_ANNOTATION_OPERATION_COUNT = GENERATION_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generationAnnotations.impl.PropertyPathAnnotationImpl <em>Property Path Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generationAnnotations.impl.PropertyPathAnnotationImpl
	 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getPropertyPathAnnotation()
	 * @generated
	 */
	int PROPERTY_PATH_ANNOTATION = 16;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_ANNOTATION__EANNOTATIONS = GENERATION_ANNOTATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_ANNOTATION__SOURCE = GENERATION_ANNOTATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_ANNOTATION__DETAILS = GENERATION_ANNOTATION__DETAILS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_ANNOTATION__EMODEL_ELEMENT = GENERATION_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_ANNOTATION__CONTENTS = GENERATION_ANNOTATION__CONTENTS;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_ANNOTATION__REFERENCES = GENERATION_ANNOTATION__REFERENCES;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_ANNOTATION__PROPERTY_PATH = GENERATION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Path Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_ANNOTATION_FEATURE_COUNT = GENERATION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_ANNOTATION___GET_EANNOTATION__STRING = GENERATION_ANNOTATION___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Property Path Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_ANNOTATION_OPERATION_COUNT = GENERATION_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generationAnnotations.impl.PropertyPathReturnAnnotationImpl <em>Property Path Return Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generationAnnotations.impl.PropertyPathReturnAnnotationImpl
	 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getPropertyPathReturnAnnotation()
	 * @generated
	 */
	int PROPERTY_PATH_RETURN_ANNOTATION = 17;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_RETURN_ANNOTATION__EANNOTATIONS = GENERATION_ANNOTATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_RETURN_ANNOTATION__SOURCE = GENERATION_ANNOTATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_RETURN_ANNOTATION__DETAILS = GENERATION_ANNOTATION__DETAILS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_RETURN_ANNOTATION__EMODEL_ELEMENT = GENERATION_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_RETURN_ANNOTATION__CONTENTS = GENERATION_ANNOTATION__CONTENTS;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_RETURN_ANNOTATION__REFERENCES = GENERATION_ANNOTATION__REFERENCES;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_RETURN_ANNOTATION__PROPERTY_PATH = GENERATION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Path Return Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_RETURN_ANNOTATION_FEATURE_COUNT = GENERATION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_RETURN_ANNOTATION___GET_EANNOTATION__STRING = GENERATION_ANNOTATION___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Property Path Return Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATH_RETURN_ANNOTATION_OPERATION_COUNT = GENERATION_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generationAnnotations.impl.ImportTypeAnnotationImpl <em>Import Type Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generationAnnotations.impl.ImportTypeAnnotationImpl
	 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getImportTypeAnnotation()
	 * @generated
	 */
	int IMPORT_TYPE_ANNOTATION = 18;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE_ANNOTATION__EANNOTATIONS = GENERATION_ANNOTATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE_ANNOTATION__SOURCE = GENERATION_ANNOTATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE_ANNOTATION__DETAILS = GENERATION_ANNOTATION__DETAILS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE_ANNOTATION__EMODEL_ELEMENT = GENERATION_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE_ANNOTATION__CONTENTS = GENERATION_ANNOTATION__CONTENTS;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE_ANNOTATION__REFERENCES = GENERATION_ANNOTATION__REFERENCES;

	/**
	 * The feature id for the '<em><b>Relative Qualified Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE_ANNOTATION__RELATIVE_QUALIFIED_TYPE_NAME = GENERATION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Import Type Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE_ANNOTATION_FEATURE_COUNT = GENERATION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE_ANNOTATION___GET_EANNOTATION__STRING = GENERATION_ANNOTATION___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Import Type Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE_ANNOTATION_OPERATION_COUNT = GENERATION_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generationAnnotations.impl.AddVariableToCollectionAnnotationImpl <em>Add Variable To Collection Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generationAnnotations.impl.AddVariableToCollectionAnnotationImpl
	 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getAddVariableToCollectionAnnotation()
	 * @generated
	 */
	int ADD_VARIABLE_TO_COLLECTION_ANNOTATION = 19;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_TO_COLLECTION_ANNOTATION__EANNOTATIONS = GENERATION_ANNOTATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_TO_COLLECTION_ANNOTATION__SOURCE = GENERATION_ANNOTATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_TO_COLLECTION_ANNOTATION__DETAILS = GENERATION_ANNOTATION__DETAILS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_TO_COLLECTION_ANNOTATION__EMODEL_ELEMENT = GENERATION_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_TO_COLLECTION_ANNOTATION__CONTENTS = GENERATION_ANNOTATION__CONTENTS;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_TO_COLLECTION_ANNOTATION__REFERENCES = GENERATION_ANNOTATION__REFERENCES;

	/**
	 * The feature id for the '<em><b>Collection Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_TO_COLLECTION_ANNOTATION__COLLECTION_PROPERTY_PATH = GENERATION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_TO_COLLECTION_ANNOTATION__PARAMETER_PROPERTY_PATH = GENERATION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Variable To Collection Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_TO_COLLECTION_ANNOTATION_FEATURE_COUNT = GENERATION_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_TO_COLLECTION_ANNOTATION___GET_EANNOTATION__STRING = GENERATION_ANNOTATION___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Add Variable To Collection Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_TO_COLLECTION_ANNOTATION_OPERATION_COUNT = GENERATION_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generationAnnotations.impl.VariableObjectConstructionAnnotationImpl <em>Variable Object Construction Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generationAnnotations.impl.VariableObjectConstructionAnnotationImpl
	 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getVariableObjectConstructionAnnotation()
	 * @generated
	 */
	int VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION = 20;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__EANNOTATIONS = FIELD_INITIALIZATION_ANNOTATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__SOURCE = FIELD_INITIALIZATION_ANNOTATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__DETAILS = FIELD_INITIALIZATION_ANNOTATION__DETAILS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__EMODEL_ELEMENT = FIELD_INITIALIZATION_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__CONTENTS = FIELD_INITIALIZATION_ANNOTATION__CONTENTS;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__REFERENCES = FIELD_INITIALIZATION_ANNOTATION__REFERENCES;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__VARIABLE_NAME = FIELD_INITIALIZATION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constructor Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__CONSTRUCTOR_TYPE_NAME = FIELD_INITIALIZATION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter Input Variable Property Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__PARAMETER_INPUT_VARIABLE_PROPERTY_PATHS = FIELD_INITIALIZATION_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable Object Construction Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION_FEATURE_COUNT = FIELD_INITIALIZATION_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION___GET_EANNOTATION__STRING = FIELD_INITIALIZATION_ANNOTATION___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Variable Object Construction Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION_OPERATION_COUNT = FIELD_INITIALIZATION_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generationAnnotations.impl.VariableDefinitionAnnotationImpl <em>Variable Definition Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generationAnnotations.impl.VariableDefinitionAnnotationImpl
	 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getVariableDefinitionAnnotation()
	 * @generated
	 */
	int VARIABLE_DEFINITION_ANNOTATION = 21;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION_ANNOTATION__EANNOTATIONS = GENERATION_ANNOTATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION_ANNOTATION__SOURCE = GENERATION_ANNOTATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION_ANNOTATION__DETAILS = GENERATION_ANNOTATION__DETAILS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION_ANNOTATION__EMODEL_ELEMENT = GENERATION_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION_ANNOTATION__CONTENTS = GENERATION_ANNOTATION__CONTENTS;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION_ANNOTATION__REFERENCES = GENERATION_ANNOTATION__REFERENCES;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION_ANNOTATION__VARIABLE_NAME = GENERATION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION_ANNOTATION__VARIABLE_TYPE_NAME = GENERATION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION_ANNOTATION__RHS = GENERATION_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable Definition Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION_ANNOTATION_FEATURE_COUNT = GENERATION_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION_ANNOTATION___GET_EANNOTATION__STRING = GENERATION_ANNOTATION___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Variable Definition Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION_ANNOTATION_OPERATION_COUNT = GENERATION_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link generationAnnotations.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generationAnnotations.Visibility
	 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 22;


	/**
	 * Returns the meta object for class '{@link generationAnnotations.GenerationAnnotation <em>Generation Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generation Annotation</em>'.
	 * @see generationAnnotations.GenerationAnnotation
	 * @generated
	 */
	EClass getGenerationAnnotation();

	/**
	 * Returns the meta object for class '{@link generationAnnotations.ConstructorAnnotation <em>Constructor Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Annotation</em>'.
	 * @see generationAnnotations.ConstructorAnnotation
	 * @generated
	 */
	EClass getConstructorAnnotation();

	/**
	 * Returns the meta object for class '{@link generationAnnotations.FieldAssignmentAnnotation <em>Field Assignment Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Assignment Annotation</em>'.
	 * @see generationAnnotations.FieldAssignmentAnnotation
	 * @generated
	 */
	EClass getFieldAssignmentAnnotation();

	/**
	 * Returns the meta object for the reference '{@link generationAnnotations.FieldAssignmentAnnotation#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see generationAnnotations.FieldAssignmentAnnotation#getField()
	 * @see #getFieldAssignmentAnnotation()
	 * @generated
	 */
	EReference getFieldAssignmentAnnotation_Field();

	/**
	 * Returns the meta object for class '{@link generationAnnotations.ParameterToFieldAssignmentAnnotation <em>Parameter To Field Assignment Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter To Field Assignment Annotation</em>'.
	 * @see generationAnnotations.ParameterToFieldAssignmentAnnotation
	 * @generated
	 */
	EClass getParameterToFieldAssignmentAnnotation();

	/**
	 * Returns the meta object for the reference '{@link generationAnnotations.ParameterToFieldAssignmentAnnotation#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see generationAnnotations.ParameterToFieldAssignmentAnnotation#getParameter()
	 * @see #getParameterToFieldAssignmentAnnotation()
	 * @generated
	 */
	EReference getParameterToFieldAssignmentAnnotation_Parameter();

	/**
	 * Returns the meta object for class '{@link generationAnnotations.PropertyPathFieldAssignmentAnnotation <em>Property Path Field Assignment Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Path Field Assignment Annotation</em>'.
	 * @see generationAnnotations.PropertyPathFieldAssignmentAnnotation
	 * @generated
	 */
	EClass getPropertyPathFieldAssignmentAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link generationAnnotations.PropertyPathFieldAssignmentAnnotation#getPropertyPath <em>Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Path</em>'.
	 * @see generationAnnotations.PropertyPathFieldAssignmentAnnotation#getPropertyPath()
	 * @see #getPropertyPathFieldAssignmentAnnotation()
	 * @generated
	 */
	EAttribute getPropertyPathFieldAssignmentAnnotation_PropertyPath();

	/**
	 * Returns the meta object for class '{@link generationAnnotations.FieldInitializationAnnotation <em>Field Initialization Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Initialization Annotation</em>'.
	 * @see generationAnnotations.FieldInitializationAnnotation
	 * @generated
	 */
	EClass getFieldInitializationAnnotation();

	/**
	 * Returns the meta object for class '{@link generationAnnotations.InlineSimpleFieldInitializationAnnotation <em>Inline Simple Field Initialization Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Simple Field Initialization Annotation</em>'.
	 * @see generationAnnotations.InlineSimpleFieldInitializationAnnotation
	 * @generated
	 */
	EClass getInlineSimpleFieldInitializationAnnotation();

	/**
	 * Returns the meta object for the reference '{@link generationAnnotations.InlineSimpleFieldInitializationAnnotation#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see generationAnnotations.InlineSimpleFieldInitializationAnnotation#getField()
	 * @see #getInlineSimpleFieldInitializationAnnotation()
	 * @generated
	 */
	EReference getInlineSimpleFieldInitializationAnnotation_Field();

	/**
	 * Returns the meta object for the attribute list '{@link generationAnnotations.InlineSimpleFieldInitializationAnnotation#getParameterInputVariablePropertyPaths <em>Parameter Input Variable Property Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameter Input Variable Property Paths</em>'.
	 * @see generationAnnotations.InlineSimpleFieldInitializationAnnotation#getParameterInputVariablePropertyPaths()
	 * @see #getInlineSimpleFieldInitializationAnnotation()
	 * @generated
	 */
	EAttribute getInlineSimpleFieldInitializationAnnotation_ParameterInputVariablePropertyPaths();

	/**
	 * Returns the meta object for class '{@link generationAnnotations.ConstructorSimpleFieldInitializationAnnotation <em>Constructor Simple Field Initialization Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Simple Field Initialization Annotation</em>'.
	 * @see generationAnnotations.ConstructorSimpleFieldInitializationAnnotation
	 * @generated
	 */
	EClass getConstructorSimpleFieldInitializationAnnotation();

	/**
	 * Returns the meta object for the reference '{@link generationAnnotations.ConstructorSimpleFieldInitializationAnnotation#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see generationAnnotations.ConstructorSimpleFieldInitializationAnnotation#getField()
	 * @see #getConstructorSimpleFieldInitializationAnnotation()
	 * @generated
	 */
	EReference getConstructorSimpleFieldInitializationAnnotation_Field();

	/**
	 * Returns the meta object for the attribute list '{@link generationAnnotations.ConstructorSimpleFieldInitializationAnnotation#getParameterInputVariablePropertyPaths <em>Parameter Input Variable Property Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameter Input Variable Property Paths</em>'.
	 * @see generationAnnotations.ConstructorSimpleFieldInitializationAnnotation#getParameterInputVariablePropertyPaths()
	 * @see #getConstructorSimpleFieldInitializationAnnotation()
	 * @generated
	 */
	EAttribute getConstructorSimpleFieldInitializationAnnotation_ParameterInputVariablePropertyPaths();

	/**
	 * Returns the meta object for the attribute '{@link generationAnnotations.ConstructorSimpleFieldInitializationAnnotation#getConstructorTypeName <em>Constructor Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constructor Type Name</em>'.
	 * @see generationAnnotations.ConstructorSimpleFieldInitializationAnnotation#getConstructorTypeName()
	 * @see #getConstructorSimpleFieldInitializationAnnotation()
	 * @generated
	 */
	EAttribute getConstructorSimpleFieldInitializationAnnotation_ConstructorTypeName();

	/**
	 * Returns the meta object for class '{@link generationAnnotations.VisibilityAnnotation <em>Visibility Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visibility Annotation</em>'.
	 * @see generationAnnotations.VisibilityAnnotation
	 * @generated
	 */
	EClass getVisibilityAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link generationAnnotations.VisibilityAnnotation#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see generationAnnotations.VisibilityAnnotation#getVisibility()
	 * @see #getVisibilityAnnotation()
	 * @generated
	 */
	EAttribute getVisibilityAnnotation_Visibility();

	/**
	 * Returns the meta object for class '{@link generationAnnotations.CommandParameterCreationAnnotation <em>Command Parameter Creation Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Parameter Creation Annotation</em>'.
	 * @see generationAnnotations.CommandParameterCreationAnnotation
	 * @generated
	 */
	EClass getCommandParameterCreationAnnotation();

	/**
	 * Returns the meta object for the reference '{@link generationAnnotations.CommandParameterCreationAnnotation#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Command</em>'.
	 * @see generationAnnotations.CommandParameterCreationAnnotation#getCommand()
	 * @see #getCommandParameterCreationAnnotation()
	 * @generated
	 */
	EReference getCommandParameterCreationAnnotation_Command();

	/**
	 * Returns the meta object for the map '{@link generationAnnotations.CommandParameterCreationAnnotation#getParameterMappings <em>Parameter Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Parameter Mappings</em>'.
	 * @see generationAnnotations.CommandParameterCreationAnnotation#getParameterMappings()
	 * @see #getCommandParameterCreationAnnotation()
	 * @generated
	 */
	EReference getCommandParameterCreationAnnotation_ParameterMappings();

	/**
	 * Returns the meta object for the attribute '{@link generationAnnotations.CommandParameterCreationAnnotation#getParametersVariableName <em>Parameters Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters Variable Name</em>'.
	 * @see generationAnnotations.CommandParameterCreationAnnotation#getParametersVariableName()
	 * @see #getCommandParameterCreationAnnotation()
	 * @generated
	 */
	EAttribute getCommandParameterCreationAnnotation_ParametersVariableName();

	/**
	 * Returns the meta object for class '{@link generationAnnotations.CommandCreationAnnotation <em>Command Creation Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Creation Annotation</em>'.
	 * @see generationAnnotations.CommandCreationAnnotation
	 * @generated
	 */
	EClass getCommandCreationAnnotation();

	/**
	 * Returns the meta object for the reference '{@link generationAnnotations.CommandCreationAnnotation#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Command</em>'.
	 * @see generationAnnotations.CommandCreationAnnotation#getCommand()
	 * @see #getCommandCreationAnnotation()
	 * @generated
	 */
	EReference getCommandCreationAnnotation_Command();

	/**
	 * Returns the meta object for the attribute '{@link generationAnnotations.CommandCreationAnnotation#getCommandVariableName <em>Command Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command Variable Name</em>'.
	 * @see generationAnnotations.CommandCreationAnnotation#getCommandVariableName()
	 * @see #getCommandCreationAnnotation()
	 * @generated
	 */
	EAttribute getCommandCreationAnnotation_CommandVariableName();

	/**
	 * Returns the meta object for the attribute '{@link generationAnnotations.CommandCreationAnnotation#getParametersVariableName <em>Parameters Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters Variable Name</em>'.
	 * @see generationAnnotations.CommandCreationAnnotation#getParametersVariableName()
	 * @see #getCommandCreationAnnotation()
	 * @generated
	 */
	EAttribute getCommandCreationAnnotation_ParametersVariableName();

	/**
	 * Returns the meta object for class '{@link generationAnnotations.CommandCallAnnotation <em>Command Call Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Call Annotation</em>'.
	 * @see generationAnnotations.CommandCallAnnotation
	 * @generated
	 */
	EClass getCommandCallAnnotation();

	/**
	 * Returns the meta object for the reference '{@link generationAnnotations.CommandCallAnnotation#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Command</em>'.
	 * @see generationAnnotations.CommandCallAnnotation#getCommand()
	 * @see #getCommandCallAnnotation()
	 * @generated
	 */
	EReference getCommandCallAnnotation_Command();

	/**
	 * Returns the meta object for the attribute '{@link generationAnnotations.CommandCallAnnotation#getTargetRoleVariableName <em>Target Role Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Role Variable Name</em>'.
	 * @see generationAnnotations.CommandCallAnnotation#getTargetRoleVariableName()
	 * @see #getCommandCallAnnotation()
	 * @generated
	 */
	EAttribute getCommandCallAnnotation_TargetRoleVariableName();

	/**
	 * Returns the meta object for the attribute '{@link generationAnnotations.CommandCallAnnotation#getParametersVariableName <em>Parameters Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters Variable Name</em>'.
	 * @see generationAnnotations.CommandCallAnnotation#getParametersVariableName()
	 * @see #getCommandCallAnnotation()
	 * @generated
	 */
	EAttribute getCommandCallAnnotation_ParametersVariableName();

	/**
	 * Returns the meta object for class '{@link generationAnnotations.QueryCallAnnotation <em>Query Call Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Call Annotation</em>'.
	 * @see generationAnnotations.QueryCallAnnotation
	 * @generated
	 */
	EClass getQueryCallAnnotation();

	/**
	 * Returns the meta object for the reference '{@link generationAnnotations.QueryCallAnnotation#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Query</em>'.
	 * @see generationAnnotations.QueryCallAnnotation#getQuery()
	 * @see #getQueryCallAnnotation()
	 * @generated
	 */
	EReference getQueryCallAnnotation_Query();

	/**
	 * Returns the meta object for the reference '{@link generationAnnotations.QueryCallAnnotation#getInternalRoleField <em>Internal Role Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Role Field</em>'.
	 * @see generationAnnotations.QueryCallAnnotation#getInternalRoleField()
	 * @see #getQueryCallAnnotation()
	 * @generated
	 */
	EReference getQueryCallAnnotation_InternalRoleField();

	/**
	 * Returns the meta object for class '{@link generationAnnotations.GetPropertyAnnotation <em>Get Property Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Property Annotation</em>'.
	 * @see generationAnnotations.GetPropertyAnnotation
	 * @generated
	 */
	EClass getGetPropertyAnnotation();

	/**
	 * Returns the meta object for the reference '{@link generationAnnotations.GetPropertyAnnotation#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see generationAnnotations.GetPropertyAnnotation#getField()
	 * @see #getGetPropertyAnnotation()
	 * @generated
	 */
	EReference getGetPropertyAnnotation_Field();

	/**
	 * Returns the meta object for the attribute '{@link generationAnnotations.GetPropertyAnnotation#getGetterTypeName <em>Getter Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Getter Type Name</em>'.
	 * @see generationAnnotations.GetPropertyAnnotation#getGetterTypeName()
	 * @see #getGetPropertyAnnotation()
	 * @generated
	 */
	EAttribute getGetPropertyAnnotation_GetterTypeName();

	/**
	 * Returns the meta object for the attribute '{@link generationAnnotations.GetPropertyAnnotation#getGetterOperationName <em>Getter Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Getter Operation Name</em>'.
	 * @see generationAnnotations.GetPropertyAnnotation#getGetterOperationName()
	 * @see #getGetPropertyAnnotation()
	 * @generated
	 */
	EAttribute getGetPropertyAnnotation_GetterOperationName();

	/**
	 * Returns the meta object for class '{@link generationAnnotations.GetPropertyDeclarationAnnotation <em>Get Property Declaration Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Property Declaration Annotation</em>'.
	 * @see generationAnnotations.GetPropertyDeclarationAnnotation
	 * @generated
	 */
	EClass getGetPropertyDeclarationAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link generationAnnotations.GetPropertyDeclarationAnnotation#getFieldTypeName <em>Field Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Type Name</em>'.
	 * @see generationAnnotations.GetPropertyDeclarationAnnotation#getFieldTypeName()
	 * @see #getGetPropertyDeclarationAnnotation()
	 * @generated
	 */
	EAttribute getGetPropertyDeclarationAnnotation_FieldTypeName();

	/**
	 * Returns the meta object for the attribute '{@link generationAnnotations.GetPropertyDeclarationAnnotation#getGetterName <em>Getter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Getter Name</em>'.
	 * @see generationAnnotations.GetPropertyDeclarationAnnotation#getGetterName()
	 * @see #getGetPropertyDeclarationAnnotation()
	 * @generated
	 */
	EAttribute getGetPropertyDeclarationAnnotation_GetterName();

	/**
	 * Returns the meta object for class '{@link generationAnnotations.MethodCallAnnotation <em>Method Call Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Call Annotation</em>'.
	 * @see generationAnnotations.MethodCallAnnotation
	 * @generated
	 */
	EClass getMethodCallAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link generationAnnotations.MethodCallAnnotation#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see generationAnnotations.MethodCallAnnotation#getVariableName()
	 * @see #getMethodCallAnnotation()
	 * @generated
	 */
	EAttribute getMethodCallAnnotation_VariableName();

	/**
	 * Returns the meta object for the attribute '{@link generationAnnotations.MethodCallAnnotation#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see generationAnnotations.MethodCallAnnotation#getMethodName()
	 * @see #getMethodCallAnnotation()
	 * @generated
	 */
	EAttribute getMethodCallAnnotation_MethodName();

	/**
	 * Returns the meta object for the attribute list '{@link generationAnnotations.MethodCallAnnotation#getParameterInputVariablePropertyPaths <em>Parameter Input Variable Property Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameter Input Variable Property Paths</em>'.
	 * @see generationAnnotations.MethodCallAnnotation#getParameterInputVariablePropertyPaths()
	 * @see #getMethodCallAnnotation()
	 * @generated
	 */
	EAttribute getMethodCallAnnotation_ParameterInputVariablePropertyPaths();

	/**
	 * Returns the meta object for class '{@link generationAnnotations.PropertyPathAnnotation <em>Property Path Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Path Annotation</em>'.
	 * @see generationAnnotations.PropertyPathAnnotation
	 * @generated
	 */
	EClass getPropertyPathAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link generationAnnotations.PropertyPathAnnotation#getPropertyPath <em>Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Path</em>'.
	 * @see generationAnnotations.PropertyPathAnnotation#getPropertyPath()
	 * @see #getPropertyPathAnnotation()
	 * @generated
	 */
	EAttribute getPropertyPathAnnotation_PropertyPath();

	/**
	 * Returns the meta object for class '{@link generationAnnotations.PropertyPathReturnAnnotation <em>Property Path Return Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Path Return Annotation</em>'.
	 * @see generationAnnotations.PropertyPathReturnAnnotation
	 * @generated
	 */
	EClass getPropertyPathReturnAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link generationAnnotations.PropertyPathReturnAnnotation#getPropertyPath <em>Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Path</em>'.
	 * @see generationAnnotations.PropertyPathReturnAnnotation#getPropertyPath()
	 * @see #getPropertyPathReturnAnnotation()
	 * @generated
	 */
	EAttribute getPropertyPathReturnAnnotation_PropertyPath();

	/**
	 * Returns the meta object for class '{@link generationAnnotations.ImportTypeAnnotation <em>Import Type Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Type Annotation</em>'.
	 * @see generationAnnotations.ImportTypeAnnotation
	 * @generated
	 */
	EClass getImportTypeAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link generationAnnotations.ImportTypeAnnotation#getRelativeQualifiedTypeName <em>Relative Qualified Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Qualified Type Name</em>'.
	 * @see generationAnnotations.ImportTypeAnnotation#getRelativeQualifiedTypeName()
	 * @see #getImportTypeAnnotation()
	 * @generated
	 */
	EAttribute getImportTypeAnnotation_RelativeQualifiedTypeName();

	/**
	 * Returns the meta object for class '{@link generationAnnotations.AddVariableToCollectionAnnotation <em>Add Variable To Collection Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Variable To Collection Annotation</em>'.
	 * @see generationAnnotations.AddVariableToCollectionAnnotation
	 * @generated
	 */
	EClass getAddVariableToCollectionAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link generationAnnotations.AddVariableToCollectionAnnotation#getCollectionPropertyPath <em>Collection Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Property Path</em>'.
	 * @see generationAnnotations.AddVariableToCollectionAnnotation#getCollectionPropertyPath()
	 * @see #getAddVariableToCollectionAnnotation()
	 * @generated
	 */
	EAttribute getAddVariableToCollectionAnnotation_CollectionPropertyPath();

	/**
	 * Returns the meta object for the attribute '{@link generationAnnotations.AddVariableToCollectionAnnotation#getParameterPropertyPath <em>Parameter Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Property Path</em>'.
	 * @see generationAnnotations.AddVariableToCollectionAnnotation#getParameterPropertyPath()
	 * @see #getAddVariableToCollectionAnnotation()
	 * @generated
	 */
	EAttribute getAddVariableToCollectionAnnotation_ParameterPropertyPath();

	/**
	 * Returns the meta object for class '{@link generationAnnotations.VariableObjectConstructionAnnotation <em>Variable Object Construction Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Object Construction Annotation</em>'.
	 * @see generationAnnotations.VariableObjectConstructionAnnotation
	 * @generated
	 */
	EClass getVariableObjectConstructionAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link generationAnnotations.VariableObjectConstructionAnnotation#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see generationAnnotations.VariableObjectConstructionAnnotation#getVariableName()
	 * @see #getVariableObjectConstructionAnnotation()
	 * @generated
	 */
	EAttribute getVariableObjectConstructionAnnotation_VariableName();

	/**
	 * Returns the meta object for the attribute '{@link generationAnnotations.VariableObjectConstructionAnnotation#getConstructorTypeName <em>Constructor Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constructor Type Name</em>'.
	 * @see generationAnnotations.VariableObjectConstructionAnnotation#getConstructorTypeName()
	 * @see #getVariableObjectConstructionAnnotation()
	 * @generated
	 */
	EAttribute getVariableObjectConstructionAnnotation_ConstructorTypeName();

	/**
	 * Returns the meta object for the attribute list '{@link generationAnnotations.VariableObjectConstructionAnnotation#getParameterInputVariablePropertyPaths <em>Parameter Input Variable Property Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameter Input Variable Property Paths</em>'.
	 * @see generationAnnotations.VariableObjectConstructionAnnotation#getParameterInputVariablePropertyPaths()
	 * @see #getVariableObjectConstructionAnnotation()
	 * @generated
	 */
	EAttribute getVariableObjectConstructionAnnotation_ParameterInputVariablePropertyPaths();

	/**
	 * Returns the meta object for class '{@link generationAnnotations.VariableDefinitionAnnotation <em>Variable Definition Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Definition Annotation</em>'.
	 * @see generationAnnotations.VariableDefinitionAnnotation
	 * @generated
	 */
	EClass getVariableDefinitionAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link generationAnnotations.VariableDefinitionAnnotation#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see generationAnnotations.VariableDefinitionAnnotation#getVariableName()
	 * @see #getVariableDefinitionAnnotation()
	 * @generated
	 */
	EAttribute getVariableDefinitionAnnotation_VariableName();

	/**
	 * Returns the meta object for the attribute '{@link generationAnnotations.VariableDefinitionAnnotation#getVariableTypeName <em>Variable Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Type Name</em>'.
	 * @see generationAnnotations.VariableDefinitionAnnotation#getVariableTypeName()
	 * @see #getVariableDefinitionAnnotation()
	 * @generated
	 */
	EAttribute getVariableDefinitionAnnotation_VariableTypeName();

	/**
	 * Returns the meta object for the containment reference '{@link generationAnnotations.VariableDefinitionAnnotation#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see generationAnnotations.VariableDefinitionAnnotation#getRhs()
	 * @see #getVariableDefinitionAnnotation()
	 * @generated
	 */
	EReference getVariableDefinitionAnnotation_Rhs();

	/**
	 * Returns the meta object for enum '{@link generationAnnotations.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see generationAnnotations.Visibility
	 * @generated
	 */
	EEnum getVisibility();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GenerationAnnotationsFactory getGenerationAnnotationsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link generationAnnotations.impl.GenerationAnnotationImpl <em>Generation Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generationAnnotations.impl.GenerationAnnotationImpl
		 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getGenerationAnnotation()
		 * @generated
		 */
		EClass GENERATION_ANNOTATION = eINSTANCE.getGenerationAnnotation();

		/**
		 * The meta object literal for the '{@link generationAnnotations.impl.ConstructorAnnotationImpl <em>Constructor Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generationAnnotations.impl.ConstructorAnnotationImpl
		 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getConstructorAnnotation()
		 * @generated
		 */
		EClass CONSTRUCTOR_ANNOTATION = eINSTANCE.getConstructorAnnotation();

		/**
		 * The meta object literal for the '{@link generationAnnotations.impl.FieldAssignmentAnnotationImpl <em>Field Assignment Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generationAnnotations.impl.FieldAssignmentAnnotationImpl
		 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getFieldAssignmentAnnotation()
		 * @generated
		 */
		EClass FIELD_ASSIGNMENT_ANNOTATION = eINSTANCE.getFieldAssignmentAnnotation();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_ASSIGNMENT_ANNOTATION__FIELD = eINSTANCE.getFieldAssignmentAnnotation_Field();

		/**
		 * The meta object literal for the '{@link generationAnnotations.impl.ParameterToFieldAssignmentAnnotationImpl <em>Parameter To Field Assignment Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generationAnnotations.impl.ParameterToFieldAssignmentAnnotationImpl
		 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getParameterToFieldAssignmentAnnotation()
		 * @generated
		 */
		EClass PARAMETER_TO_FIELD_ASSIGNMENT_ANNOTATION = eINSTANCE.getParameterToFieldAssignmentAnnotation();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_TO_FIELD_ASSIGNMENT_ANNOTATION__PARAMETER = eINSTANCE.getParameterToFieldAssignmentAnnotation_Parameter();

		/**
		 * The meta object literal for the '{@link generationAnnotations.impl.PropertyPathFieldAssignmentAnnotationImpl <em>Property Path Field Assignment Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generationAnnotations.impl.PropertyPathFieldAssignmentAnnotationImpl
		 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getPropertyPathFieldAssignmentAnnotation()
		 * @generated
		 */
		EClass PROPERTY_PATH_FIELD_ASSIGNMENT_ANNOTATION = eINSTANCE.getPropertyPathFieldAssignmentAnnotation();

		/**
		 * The meta object literal for the '<em><b>Property Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_PATH_FIELD_ASSIGNMENT_ANNOTATION__PROPERTY_PATH = eINSTANCE.getPropertyPathFieldAssignmentAnnotation_PropertyPath();

		/**
		 * The meta object literal for the '{@link generationAnnotations.impl.FieldInitializationAnnotationImpl <em>Field Initialization Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generationAnnotations.impl.FieldInitializationAnnotationImpl
		 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getFieldInitializationAnnotation()
		 * @generated
		 */
		EClass FIELD_INITIALIZATION_ANNOTATION = eINSTANCE.getFieldInitializationAnnotation();

		/**
		 * The meta object literal for the '{@link generationAnnotations.impl.InlineSimpleFieldInitializationAnnotationImpl <em>Inline Simple Field Initialization Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generationAnnotations.impl.InlineSimpleFieldInitializationAnnotationImpl
		 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getInlineSimpleFieldInitializationAnnotation()
		 * @generated
		 */
		EClass INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION = eINSTANCE.getInlineSimpleFieldInitializationAnnotation();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__FIELD = eINSTANCE.getInlineSimpleFieldInitializationAnnotation_Field();

		/**
		 * The meta object literal for the '<em><b>Parameter Input Variable Property Paths</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__PARAMETER_INPUT_VARIABLE_PROPERTY_PATHS = eINSTANCE.getInlineSimpleFieldInitializationAnnotation_ParameterInputVariablePropertyPaths();

		/**
		 * The meta object literal for the '{@link generationAnnotations.impl.ConstructorSimpleFieldInitializationAnnotationImpl <em>Constructor Simple Field Initialization Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generationAnnotations.impl.ConstructorSimpleFieldInitializationAnnotationImpl
		 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getConstructorSimpleFieldInitializationAnnotation()
		 * @generated
		 */
		EClass CONSTRUCTOR_SIMPLE_FIELD_INITIALIZATION_ANNOTATION = eINSTANCE.getConstructorSimpleFieldInitializationAnnotation();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__FIELD = eINSTANCE.getConstructorSimpleFieldInitializationAnnotation_Field();

		/**
		 * The meta object literal for the '<em><b>Parameter Input Variable Property Paths</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRUCTOR_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__PARAMETER_INPUT_VARIABLE_PROPERTY_PATHS = eINSTANCE.getConstructorSimpleFieldInitializationAnnotation_ParameterInputVariablePropertyPaths();

		/**
		 * The meta object literal for the '<em><b>Constructor Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRUCTOR_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__CONSTRUCTOR_TYPE_NAME = eINSTANCE.getConstructorSimpleFieldInitializationAnnotation_ConstructorTypeName();

		/**
		 * The meta object literal for the '{@link generationAnnotations.impl.VisibilityAnnotationImpl <em>Visibility Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generationAnnotations.impl.VisibilityAnnotationImpl
		 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getVisibilityAnnotation()
		 * @generated
		 */
		EClass VISIBILITY_ANNOTATION = eINSTANCE.getVisibilityAnnotation();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBILITY_ANNOTATION__VISIBILITY = eINSTANCE.getVisibilityAnnotation_Visibility();

		/**
		 * The meta object literal for the '{@link generationAnnotations.impl.CommandParameterCreationAnnotationImpl <em>Command Parameter Creation Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generationAnnotations.impl.CommandParameterCreationAnnotationImpl
		 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getCommandParameterCreationAnnotation()
		 * @generated
		 */
		EClass COMMAND_PARAMETER_CREATION_ANNOTATION = eINSTANCE.getCommandParameterCreationAnnotation();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_PARAMETER_CREATION_ANNOTATION__COMMAND = eINSTANCE.getCommandParameterCreationAnnotation_Command();

		/**
		 * The meta object literal for the '<em><b>Parameter Mappings</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_PARAMETER_CREATION_ANNOTATION__PARAMETER_MAPPINGS = eINSTANCE.getCommandParameterCreationAnnotation_ParameterMappings();

		/**
		 * The meta object literal for the '<em><b>Parameters Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PARAMETER_CREATION_ANNOTATION__PARAMETERS_VARIABLE_NAME = eINSTANCE.getCommandParameterCreationAnnotation_ParametersVariableName();

		/**
		 * The meta object literal for the '{@link generationAnnotations.impl.CommandCreationAnnotationImpl <em>Command Creation Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generationAnnotations.impl.CommandCreationAnnotationImpl
		 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getCommandCreationAnnotation()
		 * @generated
		 */
		EClass COMMAND_CREATION_ANNOTATION = eINSTANCE.getCommandCreationAnnotation();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_CREATION_ANNOTATION__COMMAND = eINSTANCE.getCommandCreationAnnotation_Command();

		/**
		 * The meta object literal for the '<em><b>Command Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_CREATION_ANNOTATION__COMMAND_VARIABLE_NAME = eINSTANCE.getCommandCreationAnnotation_CommandVariableName();

		/**
		 * The meta object literal for the '<em><b>Parameters Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_CREATION_ANNOTATION__PARAMETERS_VARIABLE_NAME = eINSTANCE.getCommandCreationAnnotation_ParametersVariableName();

		/**
		 * The meta object literal for the '{@link generationAnnotations.impl.CommandCallAnnotationImpl <em>Command Call Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generationAnnotations.impl.CommandCallAnnotationImpl
		 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getCommandCallAnnotation()
		 * @generated
		 */
		EClass COMMAND_CALL_ANNOTATION = eINSTANCE.getCommandCallAnnotation();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_CALL_ANNOTATION__COMMAND = eINSTANCE.getCommandCallAnnotation_Command();

		/**
		 * The meta object literal for the '<em><b>Target Role Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_CALL_ANNOTATION__TARGET_ROLE_VARIABLE_NAME = eINSTANCE.getCommandCallAnnotation_TargetRoleVariableName();

		/**
		 * The meta object literal for the '<em><b>Parameters Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_CALL_ANNOTATION__PARAMETERS_VARIABLE_NAME = eINSTANCE.getCommandCallAnnotation_ParametersVariableName();

		/**
		 * The meta object literal for the '{@link generationAnnotations.impl.QueryCallAnnotationImpl <em>Query Call Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generationAnnotations.impl.QueryCallAnnotationImpl
		 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getQueryCallAnnotation()
		 * @generated
		 */
		EClass QUERY_CALL_ANNOTATION = eINSTANCE.getQueryCallAnnotation();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_CALL_ANNOTATION__QUERY = eINSTANCE.getQueryCallAnnotation_Query();

		/**
		 * The meta object literal for the '<em><b>Internal Role Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_CALL_ANNOTATION__INTERNAL_ROLE_FIELD = eINSTANCE.getQueryCallAnnotation_InternalRoleField();

		/**
		 * The meta object literal for the '{@link generationAnnotations.impl.GetPropertyAnnotationImpl <em>Get Property Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generationAnnotations.impl.GetPropertyAnnotationImpl
		 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getGetPropertyAnnotation()
		 * @generated
		 */
		EClass GET_PROPERTY_ANNOTATION = eINSTANCE.getGetPropertyAnnotation();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_PROPERTY_ANNOTATION__FIELD = eINSTANCE.getGetPropertyAnnotation_Field();

		/**
		 * The meta object literal for the '<em><b>Getter Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_PROPERTY_ANNOTATION__GETTER_TYPE_NAME = eINSTANCE.getGetPropertyAnnotation_GetterTypeName();

		/**
		 * The meta object literal for the '<em><b>Getter Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_PROPERTY_ANNOTATION__GETTER_OPERATION_NAME = eINSTANCE.getGetPropertyAnnotation_GetterOperationName();

		/**
		 * The meta object literal for the '{@link generationAnnotations.impl.GetPropertyDeclarationAnnotationImpl <em>Get Property Declaration Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generationAnnotations.impl.GetPropertyDeclarationAnnotationImpl
		 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getGetPropertyDeclarationAnnotation()
		 * @generated
		 */
		EClass GET_PROPERTY_DECLARATION_ANNOTATION = eINSTANCE.getGetPropertyDeclarationAnnotation();

		/**
		 * The meta object literal for the '<em><b>Field Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_PROPERTY_DECLARATION_ANNOTATION__FIELD_TYPE_NAME = eINSTANCE.getGetPropertyDeclarationAnnotation_FieldTypeName();

		/**
		 * The meta object literal for the '<em><b>Getter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_PROPERTY_DECLARATION_ANNOTATION__GETTER_NAME = eINSTANCE.getGetPropertyDeclarationAnnotation_GetterName();

		/**
		 * The meta object literal for the '{@link generationAnnotations.impl.MethodCallAnnotationImpl <em>Method Call Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generationAnnotations.impl.MethodCallAnnotationImpl
		 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getMethodCallAnnotation()
		 * @generated
		 */
		EClass METHOD_CALL_ANNOTATION = eINSTANCE.getMethodCallAnnotation();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_CALL_ANNOTATION__VARIABLE_NAME = eINSTANCE.getMethodCallAnnotation_VariableName();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_CALL_ANNOTATION__METHOD_NAME = eINSTANCE.getMethodCallAnnotation_MethodName();

		/**
		 * The meta object literal for the '<em><b>Parameter Input Variable Property Paths</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_CALL_ANNOTATION__PARAMETER_INPUT_VARIABLE_PROPERTY_PATHS = eINSTANCE.getMethodCallAnnotation_ParameterInputVariablePropertyPaths();

		/**
		 * The meta object literal for the '{@link generationAnnotations.impl.PropertyPathAnnotationImpl <em>Property Path Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generationAnnotations.impl.PropertyPathAnnotationImpl
		 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getPropertyPathAnnotation()
		 * @generated
		 */
		EClass PROPERTY_PATH_ANNOTATION = eINSTANCE.getPropertyPathAnnotation();

		/**
		 * The meta object literal for the '<em><b>Property Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_PATH_ANNOTATION__PROPERTY_PATH = eINSTANCE.getPropertyPathAnnotation_PropertyPath();

		/**
		 * The meta object literal for the '{@link generationAnnotations.impl.PropertyPathReturnAnnotationImpl <em>Property Path Return Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generationAnnotations.impl.PropertyPathReturnAnnotationImpl
		 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getPropertyPathReturnAnnotation()
		 * @generated
		 */
		EClass PROPERTY_PATH_RETURN_ANNOTATION = eINSTANCE.getPropertyPathReturnAnnotation();

		/**
		 * The meta object literal for the '<em><b>Property Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_PATH_RETURN_ANNOTATION__PROPERTY_PATH = eINSTANCE.getPropertyPathReturnAnnotation_PropertyPath();

		/**
		 * The meta object literal for the '{@link generationAnnotations.impl.ImportTypeAnnotationImpl <em>Import Type Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generationAnnotations.impl.ImportTypeAnnotationImpl
		 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getImportTypeAnnotation()
		 * @generated
		 */
		EClass IMPORT_TYPE_ANNOTATION = eINSTANCE.getImportTypeAnnotation();

		/**
		 * The meta object literal for the '<em><b>Relative Qualified Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_TYPE_ANNOTATION__RELATIVE_QUALIFIED_TYPE_NAME = eINSTANCE.getImportTypeAnnotation_RelativeQualifiedTypeName();

		/**
		 * The meta object literal for the '{@link generationAnnotations.impl.AddVariableToCollectionAnnotationImpl <em>Add Variable To Collection Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generationAnnotations.impl.AddVariableToCollectionAnnotationImpl
		 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getAddVariableToCollectionAnnotation()
		 * @generated
		 */
		EClass ADD_VARIABLE_TO_COLLECTION_ANNOTATION = eINSTANCE.getAddVariableToCollectionAnnotation();

		/**
		 * The meta object literal for the '<em><b>Collection Property Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_VARIABLE_TO_COLLECTION_ANNOTATION__COLLECTION_PROPERTY_PATH = eINSTANCE.getAddVariableToCollectionAnnotation_CollectionPropertyPath();

		/**
		 * The meta object literal for the '<em><b>Parameter Property Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_VARIABLE_TO_COLLECTION_ANNOTATION__PARAMETER_PROPERTY_PATH = eINSTANCE.getAddVariableToCollectionAnnotation_ParameterPropertyPath();

		/**
		 * The meta object literal for the '{@link generationAnnotations.impl.VariableObjectConstructionAnnotationImpl <em>Variable Object Construction Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generationAnnotations.impl.VariableObjectConstructionAnnotationImpl
		 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getVariableObjectConstructionAnnotation()
		 * @generated
		 */
		EClass VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION = eINSTANCE.getVariableObjectConstructionAnnotation();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__VARIABLE_NAME = eINSTANCE.getVariableObjectConstructionAnnotation_VariableName();

		/**
		 * The meta object literal for the '<em><b>Constructor Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__CONSTRUCTOR_TYPE_NAME = eINSTANCE.getVariableObjectConstructionAnnotation_ConstructorTypeName();

		/**
		 * The meta object literal for the '<em><b>Parameter Input Variable Property Paths</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__PARAMETER_INPUT_VARIABLE_PROPERTY_PATHS = eINSTANCE.getVariableObjectConstructionAnnotation_ParameterInputVariablePropertyPaths();

		/**
		 * The meta object literal for the '{@link generationAnnotations.impl.VariableDefinitionAnnotationImpl <em>Variable Definition Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generationAnnotations.impl.VariableDefinitionAnnotationImpl
		 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getVariableDefinitionAnnotation()
		 * @generated
		 */
		EClass VARIABLE_DEFINITION_ANNOTATION = eINSTANCE.getVariableDefinitionAnnotation();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DEFINITION_ANNOTATION__VARIABLE_NAME = eINSTANCE.getVariableDefinitionAnnotation_VariableName();

		/**
		 * The meta object literal for the '<em><b>Variable Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DEFINITION_ANNOTATION__VARIABLE_TYPE_NAME = eINSTANCE.getVariableDefinitionAnnotation_VariableTypeName();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DEFINITION_ANNOTATION__RHS = eINSTANCE.getVariableDefinitionAnnotation_Rhs();

		/**
		 * The meta object literal for the '{@link generationAnnotations.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generationAnnotations.Visibility
		 * @see generationAnnotations.impl.GenerationAnnotationsPackageImpl#getVisibility()
		 * @generated
		 */
		EEnum VISIBILITY = eINSTANCE.getVisibility();

	}

} //GenerationAnnotationsPackage
