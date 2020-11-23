package template.types;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import command.CommandPackage;
import hamster.HamsterPackage;
import mpw.MpwPackage;

public class MpwTypesUtils {

	public static List<EObject> getAllSubtypesOf(Class<?> cls) {
		var classifierToFind = getEClass(cls);
		var eClasses = getRelevantClasses();
		return eClasses.stream().filter(c -> classifierToFind.isSuperTypeOf(c)).filter(c -> c != classifierToFind)
				.collect(Collectors.toList());
	}
	
	public static Class<?> getGenModelClassByName(String className) {
		EClass eClass = getEClassByName(className);
		try {
			return Class.forName(eClass.getEPackage().getName() + "." + eClass.getName());
		} catch (Exception e) {
			throw new IllegalArgumentException(
					"cannot find class with name " + eClass.getName() + " in packages: " + getRelevantPackages());
		}
	}
	
	public static EClass getEClass(Class<?> cls) {
		return getEClassByName(cls.getSimpleName());
	}
	
	public static EClass getEClassByName(String className) {
		for (var ePackage : getRelevantPackages()) {
			var classifier = ePackage.getEClassifier(className);
			if (classifier != null && classifier instanceof EClass) {
				return (EClass) classifier;
			}
		}
		throw new IllegalArgumentException(
				"cannot find class " + className + " in packages: " + getRelevantPackages());
	}

	public static List<EClass> getRelevantClasses() {
		return getRelevantPackages().stream().map(p -> p.getEClassifiers()).flatMap(Collection::stream)
				.filter(c -> c instanceof EClass).map(EClass.class::cast).collect(Collectors.toList());
	}

	private static List<EPackage> getRelevantPackages() {
		return Arrays.asList(CommandPackage.eINSTANCE, MpwPackage.eINSTANCE, HamsterPackage.eINSTANCE);
	}
}
