package components;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.junit.jupiter.api.Test;

import components.generation.PropertyPathParseException;
import components.generation.PropertyPathParser;
import components.generation.PropertyPathParser.PropertyPath;
import components.generation.PropertyPathParser.PropertyPathSegment;
import mpw.MpwPackage;

public class PropertyPathParserTest {
	private static final EClass ACTOR_ECLASS = MpwPackage.eINSTANCE.getActor();
	private static final EClass STAGE_ECLASS = MpwPackage.eINSTANCE.getStage();
	private static final EClass TILE_ECLASS = MpwPackage.eINSTANCE.getTile();
	private static final EClass MPW_ECLASS = MpwPackage.eINSTANCE.getMiniProgrammingWorld();
	
	private PropertyPathParser sut;
	private PropertyPath actualParsedPropertyPath;
	private boolean actualParsable;
	
	@Test // Scenario: empty path
	public void givenActorClass_andEmptyString_whenParsePropertyPath_thenErrorIsThrown() {
		withInput(ACTOR_ECLASS);
		assertThrows(PropertyPathParseException.class, () -> {
			parse("");
		});
	}
	
	@Test // Scenario: simple type
	public void givenActorClass_andPropertyPathForDirection_whenParsePropertyPath_thenIsDirectionType() {
		withInput(ACTOR_ECLASS);
		parse("direction");
		assertParsedPath("direction:Direction");
	}
	
	@Test // Scenario: value type
	public void givenTileClass_andPropertyPathForLocation_whenParsePropertyPath_thenIsLocationType() {
		withInput(TILE_ECLASS);
		parse("location");
		assertParsedPath("location:Location");
	}
	
	@Test // Scenario: object reference
	public void givenActorClass_andPropertyPathForCurrentTile_whenParsePropertyPath_thenIsTileReference() {
		withInput(ACTOR_ECLASS);
		parse("currentTile");
		assertParsedPath("currentTile:Tile[ref]");
	}
	
	@Test // Scenario: reference list
	public void givenStageClass_andPropertyPathForTiles_whenParsePropertyPath_thenIsTileReferenceList() {
		withInput(STAGE_ECLASS);
		parse("tiles");
		assertParsedPath("tiles:Tile[ref-list]");
	}
	
	@Test // Scenario: value type nested property
	public void givenTileClass_andPropertyPathForLocationRow_whenParsePropertyPath_thenHasTwoSegments() {
		withInput(TILE_ECLASS);
		parse("location.row");
		assertParsedPath("location:Location|row:EInt");
	}
	
	@Test // Scenario: parameter reference nested property
	public void givenMiniWorldAsParameter_andPropertyPathForInputInterface_whenParsePropertyPath_thenHasTwoSegments_andBothAreReferences() {
		withInput(TILE_ECLASS);
		andParameter("game", MPW_ECLASS);
		parse("game.userInputInterface");
		assertParsedPath("game:MiniProgrammingWorld[ref]|userInputInterface:UserInputInterface[ref]");
	}

	@Test // Scenario: this
	public void givenActorClass_andPropertyPathForThis_whenParsePropertyPath_thenIsActorType() {
		withInput(ACTOR_ECLASS);
		parse("this");
		assertParsedPath("this:Actor[ref]");
	}

	@Test // Scenario: unknown name
	public void givenActorClass_andPropertyPathWithUnknownName_whenCheckIsParseablePropertyPath_thenIsFalse() {
		withInput(ACTOR_ECLASS);
		checkIsParsable("myVariable");
		assertParsable(false);
	}

	private void withInput(EClass contextClass) {
		sut = new PropertyPathParser(contextClass);
	}

	private void andParameter(String parameterName, EClassifier parameterType) {
		sut.addParameter(parameterName, parameterType);
	}
	
	private void parse(String propertyPath) {
		actualParsedPropertyPath = sut.parse(propertyPath);
	}

	private void checkIsParsable(String string) {
		actualParsable = sut.checkIsParsable(string);
	}
	
	private void assertParsedPath(String expected) {
		String actual = actualParsedPropertyPath.segments.stream()
		    .map(s -> toDebugString(s))
		    .collect(Collectors.joining("|"));
		assertEquals(expected, actual);
	}

	private void assertParsable(boolean expected) {
		assertEquals(expected, actualParsable);
	}
	
	private String toDebugString(PropertyPathSegment segment) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(segment.originalSegment);
		stringBuilder.append(":");
		stringBuilder.append(segment.segmentType.getName());
		if (segment.isObjectReference && segment.isCollection) {
			stringBuilder.append("[ref-list]");
		} else if (segment.isObjectReference) {
			stringBuilder.append("[ref]");
		} else if (segment.isCollection) {
			stringBuilder.append("[list]");
		}
		return stringBuilder.toString();
	}
}
