/**
 */
package behaviorInputs.impl;

import behaviorInputs.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputsFactoryImpl extends EFactoryImpl implements InputsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InputsFactory init() {
		try {
			InputsFactory theInputsFactory = (InputsFactory)EPackage.Registry.INSTANCE.getEFactory(InputsPackage.eNS_URI);
			if (theInputsFactory != null) {
				return theInputsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InputsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InputsPackage.HENSHIN_COMMAND_INPUTS: return createHenshinCommandInputs();
			case InputsPackage.QUERY_INPUTS: return createQueryInputs();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HenshinCommandInputs createHenshinCommandInputs() {
		HenshinCommandInputsImpl henshinCommandInputs = new HenshinCommandInputsImpl();
		return henshinCommandInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryInputs createQueryInputs() {
		QueryInputsImpl queryInputs = new QueryInputsImpl();
		return queryInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputsPackage getInputsPackage() {
		return (InputsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InputsPackage getPackage() {
		return InputsPackage.eINSTANCE;
	}

} //InputsFactoryImpl
