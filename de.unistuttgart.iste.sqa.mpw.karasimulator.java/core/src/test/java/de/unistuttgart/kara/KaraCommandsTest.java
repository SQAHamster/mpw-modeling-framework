package de.unistuttgart.kara;

import de.unistuttgart.kara.framework.CommandConstraintException;
import de.unistuttgart.kara.kara.*;
import de.unistuttgart.kara.mpw.Location;
import de.unistuttgart.kara.mpw.Tile;
import de.unistuttgart.kara.util.GameStringifier;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KaraCommandsTest {
	private KaraGame game;
	private Kara sut;

	//<editor-fold desc="Feature: move">
	@Test
	public void givenKaraEast_whenMove_thenMovedToEast() {
		withWorld(
				  "  #;"
				+ "> #;"
				+ "  #;");

		move();

		assertWorld(
				  "  #;"
				+ " >#;"
				+ "  #;");
	}

	@Test
	public void givenKaraNorth_whenMove_thenMovedToNorth() {
		withWorld(
				  "  #;"
				+ "^ #;"
				+ "  #;");

		move();

		assertWorld(
				  "^ #;"
				+ "  #;"
				+ "  #;");
	}

	@Test
	public void givenKaraSouth_whenMove_thenMovedToSouth() {
		withWorld(
				  "  #;"
				+ "v #;"
				+ "  #;");

		move();

		assertWorld(
				  "  #;"
				+ "  #;"
				+ "v #;");
	}

	@Test
	public void givenKaraWest_whenMove_thenMovedToWest() {
		withWorld(
				  "  #;"
				+ " <#;"
				+ "  #;");

		move();

		assertWorld(
				  "  #;"
				+ "< #;"
				+ "  #;");
	}
	//</editor-fold>

	//<editor-fold desc="Feature: move mushroom">
	@Test
	public void givenKaraEast_andMushroomFront_whenMove_thenMovedToEast() {
		withWorld(">@ ;");
		move();
		assertWorld(" >@;");
	}

	@Test
	public void givenKaraNorth_andMushroomFront_whenMove_thenMovedToNorth() {
		withWorld(" ;"
				+ "@;"
				+ "^;");
		move();
		assertWorld("@;"
				  + "^;"
				  + " ;");
	}

	@Test
	public void givenKaraSouth_andMushroomFront_whenMove_thenMovedToSouth() {
		withWorld(
				  "v;"
				+ "@;"
				+ " ;");

		move();

		assertWorld(" ;"
				  + "v;"
				  + "@;");
	}

	@Test
	public void givenKaraWest_andMushroomFront_whenMove_thenMovedToWest() {
		withWorld(" @<;");

		move();

		assertWorld("@< ;");
	}
	//</editor-fold>

	//<editor-fold desc="Feature: move mushroom blocked">
	@Test
	public void givenKaraEast_andMushroomFront_andTreeBehind_whenMove_thenFailed() {
		withWorld(">@#;");
		assertThrows(CommandConstraintException.class, () -> {
			move();
		});
	}

	@Test
	public void givenKaraNorth_andMushroomFront_andTreeBehind_whenMove_thenFailed() {
		withWorld("#;"
				+ "@;"
				+ "^;");
		assertThrows(CommandConstraintException.class, () -> {
			move();
		});
	}

	@Test
	public void givenKaraSouth_andMushroomFront_andTreeBehind_whenMove_thenFailed() {
		withWorld(
				  "v;"
				+ "@;"
				+ "#;");
		assertThrows(CommandConstraintException.class, () -> {
			move();
		});
	}

	@Test
	public void givenKaraWest_andMushroomFront_andTreeBehind_whenMove_thenFailed() {
		withWorld("#@<;");
		assertThrows(CommandConstraintException.class, () -> {
			move();
		});
	}
	//</editor-fold>

	//<editor-fold desc="Feature: remove/put leafs">

	@Test
	public void givenKaraWithLeafAvailable_whenRemoveLeaf_thenRemovedLeaf() {
		withWorld(">;");
		andLeafOn(0, 0);

		removeLeaf();

		assertNotOnLeaf();
	}

	@Test
	public void givenKaraWithoutLeaf_whenPutLeaf_thenPutLeafOnTile() {
		withWorld(">;");

		putLeaf();

		assertOnLeaf();
	}

	@Test
	public void givenKaraNotOnLeaf_andLeafBesidesKara_whenPutLeaf_andRemoveLeaf_thenNoLeafIsOnTile() {
		withWorld(">;" +
				  "*;");

		putLeaf();
		removeLeaf();

		assertNotOnLeaf();
	}

	@Test
	public void givenKaraWithNoLeafAvailable_whenRemoveLeaf_ThenExceptionIsThrown() {
		withWorld(">;");

		assertThrows(CommandConstraintException.class, () -> {
			removeLeaf();
		});
	}

	@Test
	public void givenKaraWithLeafAvailable_whenRemoveLeafTwoTimes_ThenExceptionIsThrown() {
		withWorld(">;");
		putLeaf();

		removeLeaf();
		assertThrows(CommandConstraintException.class, () -> {
			removeLeaf();
		});
	}

	@Test
	public void givenKaraWithNoLeaf_whenPutLeafTwoTimes_ThenExceptionIsThrown() {
		withWorld(">;");

		putLeaf();
		assertThrows(CommandConstraintException.class, () -> {
			putLeaf();
		});
	}

	//</editor-fold>

	//<editor-fold desc="Feature: turnLeft">
	@Test
	public void givenKaraEast_whenTurnLeft_thenDirectionIsNorth() {
		withWorld(">;");
		turnLeft();
		assertWorld("^;");
	}
	@Test
	public void givenKaraNorth_whenTurnLeft_thenDirectionIsWest() {
		withWorld("^;");
		turnLeft();
		assertWorld("<;");
	}
	@Test
	public void givenKaraWest_whenTurnLeft_thenDirectionIsSouth() {
		withWorld("<;");
		turnLeft();
		assertWorld("v;");
	}
	@Test
	public void givenKaraSouth_whenTurnLeft_thenDirectionIsEast() {
		withWorld("v;");
		turnLeft();
		assertWorld(">;");
	}
	//</editor-fold>

	//<editor-fold desc="Feature: turnRight">
	@Test
	public void givenKaraEast_whenTurnRight_thenDirectionIsNorth() {
		withWorld(">;");
		turnRight();
		assertWorld("v;");
	}
	@Test
	public void givenKaraNorth_whenTurnRight_thenDirectionIsWest() {
		withWorld("^;");
		turnRight();
		assertWorld(">;");
	}
	@Test
	public void givenKaraWest_whenTurnRight_thenDirectionIsSouth() {
		withWorld("<;");
		turnRight();
		assertWorld("^;");
	}
	@Test
	public void givenKaraSouth_whenTurnRight_thenDirectionIsEast() {
		withWorld("v;");
		turnRight();
		assertWorld("<;");
	}
	//</editor-fold>

	//<editor-fold desc="Feature: front check">
	@Test
	public void givenKaraInAnyDirection_andFrontCellIsEmpty_whenCheckFrontIsClear_thenIsTrue() {
		withWorld(" <;");
		assertFrontIsClear();

		withWorld("> ;");
		assertFrontIsClear();

		withWorld(" ;^;");
		assertFrontIsClear();

		withWorld("v; ;");
		assertFrontIsClear();
	}

	@Test
	public void givenKaraInAnyDirection_andFrontCellIsTree_whenCheckTreeFront_thenIsTrue() {
		withWorld("#<;");
		assertTreeFront();

		withWorld(">#;");
		assertTreeFront();

		withWorld("#;^;");
		assertTreeFront();

		withWorld("v;#;");
		assertTreeFront();
	}

	@Test
	public void givenKaraInAnyDirection_andFrontCellIsMushroom_whenCheckMushroomFront_thenIsTrue() {
		withWorld("@<;");
		assertMushroomFront();

		withWorld(">@;");
		assertMushroomFront();

		withWorld("@;^;");
		assertMushroomFront();

		withWorld("v;@;");
		assertMushroomFront();
	}

	@Test
	public void givenKaraInAnyDirection_andFrontCellIsLeaf_whenCheckFrontIsClear_thenIsTrue() {
		withWorld("*<;");
		assertFrontIsClear();

		withWorld(">*;");
		assertFrontIsClear();

		withWorld("*;^;");
		assertFrontIsClear();

		withWorld("v;*;");
		assertFrontIsClear();
	}

	@Test
	public void givenKaraBeforeTree_whenMove_ThenExceptionIsThrown() {
		withWorld("#<;");

		assertThrows(CommandConstraintException.class, () -> {
			move();			
		});
	}

	@Test // test of invariant "isInitialized"
	@Disabled // TODO design precondition
	public void givenKaraWithCurrentTileIsNull_whenMove_ThenExceptionIsThrown() {
		withWorld(" <;");
		removeFromStage();

		assertThrows(CommandConstraintException.class, () -> {
			move();
		});
	}

	//</editor-fold>

	//<editor-fold desc="Feature: gameLog">
	@Test
	public void givenKara_whenExecuteAndCommand_thenGameLogIsAdded() {
		withWorld(">*;");

		move();
		removeLeaf();
		putLeaf();
		turnLeft();
		write("Custom Message");

		assertGameLog(
				"Move",
				"Remove Leaf",
				"Put Leaf",
				"Turn Left",
				"Custom Message");
	}

	//</editor-fold>


	//<editor-fold desc="helpers">

	private void withWorld(String map) {
		game = GameStringifier.createFromString(map);
		sut = game.getWorld().getKara();
	}

	private void removeFromStage() {
		// use internal class to be able to set an "invalid state" where the stage is not set
		var internalKara = (ConcreteKara) sut.getInternalKara();
		internalKara.setStage(null);
	}

	private static Location locationOf(int x, int y) {
		return new Location(x, y);
	}

	private void andLeafOn(int columnIndex, int rowIndex) {
		new WorldBuilder(game).addLeafToTile(columnIndex, rowIndex);
	}

	private void turnLeft() {
		 sut.turnLeft();
	}

	private void turnRight() {
		 sut.turnRight();
	}

	private void move() {
		 sut.move();
	}

	private void removeLeaf() {
		sut.removeLeaf();
	}

	private void putLeaf() {
		 sut.putLeaf();
	}

	private void write(String message) {
		 sut.write(message);
	}

	private void assertWorld(String expected) {
		String actual = GameStringifier.toString(game);
		assertEquals(expected, actual);
	}

	private void assertFrontIsClear() {
		assertFalse(sut.treeFront());
		assertFalse(sut.mushroomFront());
	}

	private void assertTreeFront() {
		assertTrue(sut.treeFront());
		assertFalse(sut.mushroomFront());
	}

	private void assertMushroomFront() {
		assertTrue(sut.mushroomFront());
		assertFalse(sut.treeFront());
	}

	private void assertOnLeaf() {
		assertTrue(sut.onLeaf());
	}

	private void assertNotOnLeaf() {
		assertFalse(sut.onLeaf());
	}

	private void assertGameLog(String...expectedStrings) {
		String actual = String.join("|", game.getGameLog().getLogEntries());
		String expected = String.join("|", expectedStrings);
		assertEquals(expected, actual);
	}

	private Tile getTileAt(int columnIndex, int rowIndex) {
		var internalWorld = game.getWorld().getInternalWorld();
		return internalWorld.getTileAt(Location.from(columnIndex, rowIndex));
	}

	//</editor-fold>
}
