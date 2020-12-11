/**
 */
package behaviorInputs;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * <!-- begin-model-doc -->
 * This is a helper package to compose henshin and querydsl models.
 * <!-- end-model-doc -->
 * @see behaviorInputs.InputsFactory
 * @model kind="package"
 * @generated
 */
public interface InputsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behaviorInputs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mpw.uni-stuttgart.de/transformation/inputs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "behaviorInputs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InputsPackage eINSTANCE = behaviorInputs.impl.InputsPackageImpl.init();

	/**
	 * The meta object id for the '{@link behaviorInputs.impl.HenshinCommandInputsImpl <em>Henshin Command Inputs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorInputs.impl.HenshinCommandInputsImpl
	 * @see behaviorInputs.impl.InputsPackageImpl#getHenshinCommandInputs()
	 * @generated
	 */
	int HENSHIN_COMMAND_INPUTS = 0;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HENSHIN_COMMAND_INPUTS__MODULES = 0;

	/**
	 * The number of structural features of the '<em>Henshin Command Inputs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HENSHIN_COMMAND_INPUTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Henshin Command Inputs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HENSHIN_COMMAND_INPUTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviorInputs.impl.QueryInputsImpl <em>Query Inputs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviorInputs.impl.QueryInputsImpl
	 * @see behaviorInputs.impl.InputsPackageImpl#getQueryInputs()
	 * @generated
	 */
	int QUERY_INPUTS = 1;

	/**
	 * The feature id for the '<em><b>Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_INPUTS__MODELS = 0;

	/**
	 * The number of structural features of the '<em>Query Inputs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_INPUTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Query Inputs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_INPUTS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link behaviorInputs.HenshinCommandInputs <em>Henshin Command Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Henshin Command Inputs</em>'.
	 * @see behaviorInputs.HenshinCommandInputs
	 * @generated
	 */
	EClass getHenshinCommandInputs();

	/**
	 * Returns the meta object for the reference list '{@link behaviorInputs.HenshinCommandInputs#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modules</em>'.
	 * @see behaviorInputs.HenshinCommandInputs#getModules()
	 * @see #getHenshinCommandInputs()
	 * @generated
	 */
	EReference getHenshinCommandInputs_Modules();

	/**
	 * Returns the meta object for class '{@link behaviorInputs.QueryInputs <em>Query Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Inputs</em>'.
	 * @see behaviorInputs.QueryInputs
	 * @generated
	 */
	EClass getQueryInputs();

	/**
	 * Returns the meta object for the reference list '{@link behaviorInputs.QueryInputs#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Models</em>'.
	 * @see behaviorInputs.QueryInputs#getModels()
	 * @see #getQueryInputs()
	 * @generated
	 */
	EReference getQueryInputs_Models();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InputsFactory getInputsFactory();

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
		 * The meta object literal for the '{@link behaviorInputs.impl.HenshinCommandInputsImpl <em>Henshin Command Inputs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorInputs.impl.HenshinCommandInputsImpl
		 * @see behaviorInputs.impl.InputsPackageImpl#getHenshinCommandInputs()
		 * @generated
		 */
		EClass HENSHIN_COMMAND_INPUTS = eINSTANCE.getHenshinCommandInputs();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HENSHIN_COMMAND_INPUTS__MODULES = eINSTANCE.getHenshinCommandInputs_Modules();

		/**
		 * The meta object literal for the '{@link behaviorInputs.impl.QueryInputsImpl <em>Query Inputs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviorInputs.impl.QueryInputsImpl
		 * @see behaviorInputs.impl.InputsPackageImpl#getQueryInputs()
		 * @generated
		 */
		EClass QUERY_INPUTS = eINSTANCE.getQueryInputs();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_INPUTS__MODELS = eINSTANCE.getQueryInputs_Models();

	}

} //InputsPackage
