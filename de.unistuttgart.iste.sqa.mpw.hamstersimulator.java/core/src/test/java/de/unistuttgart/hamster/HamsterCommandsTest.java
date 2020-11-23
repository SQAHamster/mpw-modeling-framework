package de.unistuttgart.hamster;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import de.unistuttgart.hamster.hamster.GameHamster;
import de.unistuttgart.hamster.hamster.HamsterGame;
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

	//<editor-fold desc="Feature: frontIsFree">
	@Test
	public void givenHamsterInAnyDirection_andFrontCellIsEmpty_whenCheckFrontIsFree_thenIsTrue() {
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
	public void givenHamsterInAnyDirection_andFrontCellIsWall_whenCheckFrontIsNotFree_thenIsTrue() {
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
	public void givenHamsterInAnyDirection_andFrontCellIsEndOfMap_whenCheckFrontIsNotFree_thenIsTrue() {
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
		
		assertThrows(Exception.class, () -> {
			move();			
		});
	}
	//</editor-fold>


	//<editor-fold desc="helpers">

	private void withTerritorium(String map) {
		game = GameStringifier.createFromString(map);
		sut = game.getDefaultHamster();
	}

	private void turnLeft() {
		 sut.turnLeft(game.getCommandStack());
	}

	private void move() {
		 sut.move(game.getCommandStack());
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

	//</editor-fold>
}
