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
		withTerritorium(
				  "  M;"
				+ "> M;"
				+ "  M;");

		move();

		assertTerritorium(
				  "  M;"
				+ " >M;"
				+ "  M;");
	}

	@Test
	public void givenHamsterNorth_whenMove_thenMovedToNorth() {
		withTerritorium(
				  "  M;"
				+ "^ M;"
				+ "  M;");

		move();

		assertTerritorium(
				  "^ M;"
				+ "  M;"
				+ "  M;");
	}

	@Test
	public void givenHamsterSouth_whenMove_thenMovedToSouth() {
		withTerritorium(
				  "  M;"
				+ "v M;"
				+ "  M;");

		move();

		assertTerritorium(
				  "  M;"
				+ "  M;"
				+ "v M;");
	}

	@Test
	public void givenHamsterWest_whenMove_thenMovedToWest() {
		withTerritorium(
				  "  M;"
				+ " <M;"
				+ "  M;");

		move();

		assertTerritorium(
				  "  M;"
				+ "< M;"
				+ "  M;");
	}
	//</editor-fold>

	//<editor-fold desc="Feature: pick/put grains">

	@Test
	public void givenHamsterWithGrainAvailable_whenPickGrain_thenPickedGrain() {
		withTerritorium(">;");
		andGrainOn(0, 0);

		pickGrain();

		assertGrainsInMouth(1);
		assertGrainsOnTerritory("0;");
	}

	@Test
	public void givenHamsterWithGrainInMouth_whenPutGrain_thenPutGrainOnTile() {
		withTerritorium(">;");
		andGrainsInMouth(1);

		putGrain();

		assertGrainsInMouth(0);
		assertGrainsOnTerritory("1;");
	}

	@Test
	public void givenHamsterWithNoGrainAvailable_whenPickGrain_ThenExceptionIsThrown() {
		withTerritorium(">;");

		assertThrows(CommandConstraintException.class, () -> {
			pickGrain();
		});
	}

	@Test
	public void givenHamsterWithEmptyMouth_whenPutGrain_ThenExceptionIsThrown() {
		withTerritorium(">;");

		assertThrows(CommandConstraintException.class, () -> {
			putGrain();
		});
	}

	//</editor-fold>

	//<editor-fold desc="Feature: turnLeft">
	@Test
	public void givenHamsterEast_whenTurnLeft_thenDirectionIsNorth() {
		withTerritorium(">;");
		turnLeft();
		assertTerritorium("^;");
	}
	@Test
	public void givenHamsterNorth_whenTurnLeft_thenDirectionIsWest() {
		withTerritorium("^;");
		turnLeft();
		assertTerritorium("<;");
	}
	@Test
	public void givenHamsterWest_whenTurnLeft_thenDirectionIsSouth() {
		withTerritorium("<;");
		turnLeft();
		assertTerritorium("v;");
	}
	@Test
	public void givenHamsterSouth_whenTurnLeft_thenDirectionIsEast() {
		withTerritorium("v;");
		turnLeft();
		assertTerritorium(">;");
	}
	//</editor-fold>

	//<editor-fold desc="Feature: frontIsClear">
	@Test
	public void givenHamsterInAnyDirection_andFrontCellIsEmpty_whenCheckFrontIsClear_thenIsTrue() {
		withTerritorium(" <;");
		assertFrontIsClear();

		withTerritorium("> ;");
		assertFrontIsClear();

		withTerritorium(" ;^;");
		assertFrontIsClear();

		withTerritorium("v; ;");
		assertFrontIsClear();
	}

	@Test
	public void givenHamsterInAnyDirection_andFrontCellIsWall_whenCheckFrontIsNotClear_thenIsTrue() {
		withTerritorium("M<;");
		assertFrontIsNotClear();

		withTerritorium(">M;");
		assertFrontIsNotClear();

		withTerritorium("M;^;");
		assertFrontIsNotClear();

		withTerritorium("v;M;");
		assertFrontIsNotClear();
	}

	@Test
	public void givenHamsterInAnyDirection_andFrontCellIsGrain_whenCheckFrontIsClear_thenIsTrue() {
		withTerritorium("*<;");
		assertFrontIsClear();

		withTerritorium(">*;");
		assertFrontIsClear();

		withTerritorium("*;^;");
		assertFrontIsClear();

		withTerritorium("v;*;");
		assertFrontIsClear();
	}

	@Test
	public void givenHamsterInAnyDirection_andFrontCellIsEndOfMap_whenCheckFrontIsNotClear_thenIsTrue() {
		withTerritorium("<;");
		assertFrontIsNotClear();

		withTerritorium(">;");
		assertFrontIsNotClear();

		withTerritorium("^;");
		assertFrontIsNotClear();

		withTerritorium("v;");
		assertFrontIsNotClear();
	}
	
	@Test
	public void givenHamsterBeforeWall_whenMove_ThenExceptionIsThrown() {
		withTerritorium("M<;");
		
		assertThrows(CommandConstraintException.class, () -> {
			move();			
		});
	}

	//</editor-fold>


	//<editor-fold desc="helpers">

	private void withTerritorium(String map) {
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

	private void assertTerritorium(String expected) {
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
