package components;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.junit.jupiter.api.Test;

import components.generation.PropertyPathReplacer;
import mpw.MpwPackage;

public class PropertyPathReplacerTest {
	private static final EClass ACTOR_ECLASS = MpwPackage.eINSTANCE.getActor();
	private static final EDataType EINT_EDATATYPE = EcorePackage.eINSTANCE.getEInt();
	
	private List<ETypedElement> variablesInput;
	private String actual;
	
	@Test
	public void givenPropertyPathWithEquation_whenReplaceForJava_thenGettersWithDotsAreInserted() {
		withVariables(variableOf("this", ACTOR_ECLASS));
		replaceForJava("this.direction == NORTH");
		assertReplacedString("this.getDirection() == NORTH");
	}
	
	@Test
	public void givenPropertyPathUsingObjectReference_andUsingSimpleType_whenReplaceForCpp_thenGettersWithAppropriateAccessorsAreInserted() {
		withVariables(variableOf("this", ACTOR_ECLASS));
		replaceForCpp("this.currentTile.location.row");
		assertReplacedString("this->getCurrentTile()->getLocation().getRow()");
	}

	@Test
	public void givenSimpleVariablePropertyPath_whenReplaceForJava_thenIsUnchanged() {
		withVariables(variableOf("y", EINT_EDATATYPE));
		replaceForJava("y");
		assertReplacedString("y");
	}
	
	private void withVariables(ETypedElement...variables) {
		this.variablesInput = Arrays.asList(variables);
	}
	
	/*
	 * Use EParameter as representative type for variables
	 */
	private static ETypedElement variableOf(String name, EClassifier type) {
		EParameter parameter = EcorePackage.eINSTANCE.getEcoreFactory().createEParameter();
		parameter.setEType(type);
		parameter.setName(name);
		return parameter;
	}
	
	private void replaceForJava(String input) {
		actual = PropertyPathReplacer.replacePropertyPaths(input, variablesInput, PropertyPathReplacer.JAVA_CONFIG);
	}
	
	private void replaceForCpp(String input) {
		actual = PropertyPathReplacer.replacePropertyPaths(input, variablesInput, PropertyPathReplacer.CPP_CONFIG);
	}
	
	private void assertReplacedString(String expected) {
		assertEquals(expected, actual);
	}
	
}
