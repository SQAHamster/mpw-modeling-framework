package de.unistuttgart.hamster;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import de.unistuttgart.hamster.framework.CommandConstraintException;
import de.unistuttgart.hamster.hamster.ConcreteHamster;
import de.unistuttgart.hamster.hamster.GameHamster;
import de.unistuttgart.hamster.hamster.Grain;
import de.unistuttgart.hamster.hamster.HamsterGame;
import de.unistuttgart.hamster.mpw.Tile;
import de.unistuttgart.hamster.util.GameStringifier;
import org.junit.jupiter.api.Test;

public class HamsterCommandsTest {
	private HamsterGame game;
	private GameHamster sut;

	//<editor-fold desc="Feature: move">
	@Test
	public void givenHamsterEast_whenMove_thenMovedToRight() {
		withTerritory(
				  "  M;"
				+ "> M;"
				+ "  M;");

		move();

		assertTerritory(
				  "  M;"
				+ " >M;"
				+ "  M;");
	}

	@Test
	public void givenHamsterNorth_whenMove_thenMovedToNorth() {
		withTerritory(
				  "  M;"
				+ "^ M;"
				+ "  M;");

		move();

		assertTerritory(
				  "^ M;"
				+ "  M;"
				+ "  M;");
	}

	@Test
	public void givenHamsterSouth_whenMove_thenMovedToSouth() {
		withTerritory(
				  "  M;"
				+ "v M;"
				+ "  M;");

		move();

		assertTerritory(
				  "  M;"
				+ "  M;"
				+ "v M;");
	}

	@Test
	public void givenHamsterWest_whenMove_thenMovedToWest() {
		withTerritory(
				  "  M;"
				+ " <M;"
				+ "  M;");

		move();

		assertTerritory(
				  "  M;"
				+ "< M;"
				+ "  M;");
	}
	//</editor-fold>

	//<editor-fold desc="Feature: pick/put grains">

	@Test
	public void givenHamsterWithGrainAvailable_whenPickGrain_thenPickedGrain() {
		withTerritory(">;");
		andGrainOn(0, 0);

		pickGrain();

		assertGrainsInMouth(1);
		assertGrainsOnTerritory("0;");
	}

	@Test
	public void givenHamsterWithGrainInMouth_whenPutGrain_thenPutGrainOnTile() {
		withTerritory(">;");
		andGrainsInMouth(1);

		putGrain();

		assertGrainsInMouth(0);
		assertGrainsOnTerritory("1;");
	}

	@Test
	public void givenHamsterWithNoGrainAvailable_whenPickGrain_ThenExceptionIsThrown() {
		withTerritory(">;");

		assertThrows(CommandConstraintException.class, () -> {
			pickGrain();
		});
	}

	@Test
	public void givenHamsterWithEmptyMouth_whenPutGrain_ThenExceptionIsThrown() {
		withTerritory(">;");

		assertThrows(CommandConstraintException.class, () -> {
			putGrain();
		});
	}

	//</editor-fold>

	//<editor-fold desc="Feature: turnLeft">
	@Test
	public void givenHamsterEast_whenTurnLeft_thenDirectionIsNorth() {
		withTerritory(">;");
		turnLeft();
		assertTerritory("^;");
	}
	@Test
	public void givenHamsterNorth_whenTurnLeft_thenDirectionIsWest() {
		withTerritory("^;");
		turnLeft();
		assertTerritory("<;");
	}
	@Test
	public void givenHamsterWest_whenTurnLeft_thenDirectionIsSouth() {
		withTerritory("<;");
		turnLeft();
		assertTerritory("v;");
	}
	@Test
	public void givenHamsterSouth_whenTurnLeft_thenDirectionIsEast() {
		withTerritory("v;");
		turnLeft();
		assertTerritory(">;");
	}
	//</editor-fold>

	//<editor-fold desc="Feature: frontIsClear">
	@Test
	public void givenHamsterInAnyDirection_andFrontCellIsEmpty_whenCheckFrontIsClear_thenIsTrue() {
		withTerritory(" <;");
		assertFrontIsClear();

		withTerritory("> ;");
		assertFrontIsClear();

		withTerritory(" ;^;");
		assertFrontIsClear();

		withTerritory("v; ;");
		assertFrontIsClear();
	}

	@Test
	public void givenHamsterInAnyDirection_andFrontCellIsWall_whenCheckFrontIsNotClear_thenIsTrue() {
		withTerritory("M<;");
		assertFrontIsNotClear();

		withTerritory(">M;");
		assertFrontIsNotClear();

		withTerritory("M;^;");
		assertFrontIsNotClear();

		withTerritory("v;M;");
		assertFrontIsNotClear();
	}

	@Test
	public void givenHamsterInAnyDirection_andFrontCellIsGrain_whenCheckFrontIsClear_thenIsTrue() {
		withTerritory("*<;");
		assertFrontIsClear();

		withTerritory(">*;");
		assertFrontIsClear();

		withTerritory("*;^;");
		assertFrontIsClear();

		withTerritory("v;*;");
		assertFrontIsClear();
	}

	@Test
	public void givenHamsterInAnyDirection_andFrontCellIsEndOfMap_whenCheckFrontIsNotClear_thenIsTrue() {
		withTerritory("<;");
		assertFrontIsNotClear();

		withTerritory(">;");
		assertFrontIsNotClear();

		withTerritory("^;");
		assertFrontIsNotClear();

		withTerritory("v;");
		assertFrontIsNotClear();
	}
	
	@Test
	public void givenHamsterBeforeWall_whenMove_ThenExceptionIsThrown() {
		withTerritory("M<;");
		
		assertThrows(CommandConstraintException.class, () -> {
			move();			
		});
	}

	//</editor-fold>


	//<editor-fold desc="helpers">

	private void withTerritory(String map) {
		game = GameStringifier.createFromString(map);
		sut = game.getDefaultHamster();
	}

	private void andGrainOn(int columnIndex, int rowIndex) {
		var tile = getTileAt(columnIndex, rowIndex);
		tile.addToContents(new Grain());
	}

	private void andGrainsInMouth(int count) {
		var concreteHamster = (ConcreteHamster) this.sut;
		for (int i = 0; i < count; i++) {
			concreteHamster.addToGrains(new Grain());
		}
	}

	private void turnLeft() {
		 sut.turnLeft(game.getCommandStack());
	}

	private void move() {
		 sut.move(game.getCommandStack());
	}

	private void pickGrain() {
		sut.pickGrain(game.getCommandStack());
	}

	private void putGrain() {
		 sut.putGrain(game.getCommandStack());
	}

	private void assertTerritory(String expected) {
		String actual = GameStringifier.toString(game);
		assertEquals(expected, actual);
	}

	private void assertFrontIsClear() {
		assertTrue(sut.frontIsClear());
	}

	private void assertFrontIsNotClear() {
		assertFalse(sut.frontIsClear());
	}

	private void assertGrainsInMouth(int expected) {
		var actual = sut.getGrains().size();
		assertEquals(expected, actual);
	}

	private void assertGrainsOnTerritory(String expected) {
		String actual = GameStringifier.grainsOnTerritoryToString(game);
		assertEquals(expected, actual);
	}

	private Tile getTileAt(int columnIndex, int rowIndex) {
		var tileOptional = game.getTerritory().getTiles().stream()
				.filter(t -> t.getLocation().getColumn() == columnIndex &&
						t.getLocation().getRow() == rowIndex)
				.findFirst();
		assert(tileOptional.isPresent());
		return tileOptional.get();
	}

	//</editor-fold>
}
