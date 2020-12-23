package components;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.eclipse.emf.ecore.EClass;
import org.junit.jupiter.api.Test;

import components.generation.PropertyPathReplacer;
import mpw.MpwPackage;

public class PropertyPathReplacerTest {
	private static final EClass ACTOR_ECLASS = MpwPackage.eINSTANCE.getActor();
//	private static final EClass MPW_ECLASS = MpwPackage.eINSTANCE.getMiniProgrammingWorld();
	
	@Test
	public void givenPropertyPath_whenReplaceForJava_thenGettersWithDotsAreInserted() {
		String actual = PropertyPathReplacer.replaceWithEParameters("this.direction == NORTH", ACTOR_ECLASS, Arrays.asList());
		assertEquals("this.getDirection() == NORTH", actual);
	}
	
	// Scenario: y + 1
	// Scenario: 0
}
