/**
 */
package viewmodel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * In this package stereotypes are defined which are used in view models to classify roles like ViewModel datastructures or Presenter classes.
 * 
 * Note: the stereotypes are only relevant for transformation / generation and in the generated target simulator they are not present.
 * <!-- end-model-doc -->
 * @see viewmodel.ViewmodelFactory
 * @model kind="package"
 * @generated
 */
public interface ViewmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "viewmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mpw.uni-stuttgart.de/viewmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "viewmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewmodelPackage eINSTANCE = viewmodel.impl.ViewmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link viewmodel.ViewStereotype <em>View Stereotype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see viewmodel.ViewStereotype
	 * @see viewmodel.impl.ViewmodelPackageImpl#getViewStereotype()
	 * @generated
	 */
	int VIEW_STEREOTYPE = 2;

	/**
	 * The number of structural features of the '<em>View Stereotype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_STEREOTYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>View Stereotype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_STEREOTYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link viewmodel.Presenter <em>Presenter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see viewmodel.Presenter
	 * @see viewmodel.impl.ViewmodelPackageImpl#getPresenter()
	 * @generated
	 */
	int PRESENTER = 0;

	/**
	 * The number of structural features of the '<em>Presenter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTER_FEATURE_COUNT = VIEW_STEREOTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Presenter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTER_OPERATION_COUNT = VIEW_STEREOTYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link viewmodel.ViewModel <em>View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see viewmodel.ViewModel
	 * @see viewmodel.impl.ViewmodelPackageImpl#getViewModel()
	 * @generated
	 */
	int VIEW_MODEL = 1;

	/**
	 * The number of structural features of the '<em>View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_FEATURE_COUNT = VIEW_STEREOTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_OPERATION_COUNT = VIEW_STEREOTYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link viewmodel.Presenter <em>Presenter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presenter</em>'.
	 * @see viewmodel.Presenter
	 * @generated
	 */
	EClass getPresenter();

	/**
	 * Returns the meta object for class '{@link viewmodel.ViewModel <em>View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Model</em>'.
	 * @see viewmodel.ViewModel
	 * @generated
	 */
	EClass getViewModel();

	/**
	 * Returns the meta object for class '{@link viewmodel.ViewStereotype <em>View Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Stereotype</em>'.
	 * @see viewmodel.ViewStereotype
	 * @generated
	 */
	EClass getViewStereotype();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViewmodelFactory getViewmodelFactory();

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
		 * The meta object literal for the '{@link viewmodel.Presenter <em>Presenter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see viewmodel.Presenter
		 * @see viewmodel.impl.ViewmodelPackageImpl#getPresenter()
		 * @generated
		 */
		EClass PRESENTER = eINSTANCE.getPresenter();

		/**
		 * The meta object literal for the '{@link viewmodel.ViewModel <em>View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see viewmodel.ViewModel
		 * @see viewmodel.impl.ViewmodelPackageImpl#getViewModel()
		 * @generated
		 */
		EClass VIEW_MODEL = eINSTANCE.getViewModel();

		/**
		 * The meta object literal for the '{@link viewmodel.ViewStereotype <em>View Stereotype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see viewmodel.ViewStereotype
		 * @see viewmodel.impl.ViewmodelPackageImpl#getViewStereotype()
		 * @generated
		 */
		EClass VIEW_STEREOTYPE = eINSTANCE.getViewStereotype();

	}

} //ViewmodelPackage
