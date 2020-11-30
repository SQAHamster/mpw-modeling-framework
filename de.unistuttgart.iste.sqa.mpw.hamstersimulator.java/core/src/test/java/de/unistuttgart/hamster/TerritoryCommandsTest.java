package de.unistuttgart.hamster;

import static org.junit.jupiter.api.Assertions.assertEquals;

import de.unistuttgart.hamster.hamster.HamsterGame;
import de.unistuttgart.hamster.mpw.Location;
import de.unistuttgart.hamster.util.GameStringifier;
import org.junit.jupiter.api.Test;

public class TerritoryCommandsTest {
	
	@Test
	public void testInit3x5() {
		HamsterGame game = GameStringifier.createFromString("");

		var sut = game.getTerritory();
		sut.initTerritory(game.getCommandStack(), 5, 3);

		assertEquals(15, sut.getTiles().size());

		String actual = GameStringifier.toString(game);
		assertEquals("     ;"
				   + "     ;"
				   + "     ;", actual);
	}

	@Test
	public void testAddGrain() {
		HamsterGame game = GameStringifier.createFromString("   ;" +
															"   ;");

		var sut = game.getTerritory();
		sut.addGrainsToTile(game.getCommandStack(), locationOf(2, 0), 1);

		var actual = GameStringifier.grainsOnTerritoryToString(game);
		assertEquals("  1;" +
				     "   ;", actual.replace('0', ' '));
	}

	@Test
	public void testAddTwoGrain() {
		HamsterGame game = GameStringifier.createFromString("   ;" +
															"   ;");

		var sut = game.getTerritory();
		sut.addGrainsToTile(game.getCommandStack(), locationOf(1, 1), 2);

		var actual = GameStringifier.grainsOnTerritoryToString(game);
		assertEquals("   ;" +
				     " 2 ;", actual.replace('0', ' '));
	}

	@Test
	public void testAddWall() {
		HamsterGame game = GameStringifier.createFromString("   ;" +
															"   ;");

		var sut = game.getTerritory();
		sut.addWallToTile(game.getCommandStack(), locationOf(2, 0));

		var actual = GameStringifier.toString(game);
		assertEquals("  M;" +
				     "   ;", actual);
	}

	@Test
	public void givenOneGrainOnTile_whenClearTile_thenTileIsEmpty() {
		HamsterGame game = GameStringifier.createFromString("v *;" +
															" M ;");

		var sut = game.getTerritory();
		sut.clearTile(game.getCommandStack(), locationOf(2, 0));

		var actual = GameStringifier.toString(game);
		assertEquals("v  ;" +
				     " M ;", actual);
	}

	@Test
	public void givenFiveGrainsOnTile_whenClearTile_thenTileIsEmpty() {
		HamsterGame game = GameStringifier.createFromString(" ;");

		var sut = game.getTerritory();
		sut.addGrainsToTile(game.getCommandStack(), locationOf(0, 0), 5);
		sut.clearTile(game.getCommandStack(), locationOf(0, 0));

		var actual = GameStringifier.toString(game);
		assertEquals(" ;", actual);
	}

	@Test
	public void givenWallOnTile_whenClearTile_thenTileIsEmpty() {
		HamsterGame game = GameStringifier.createFromString("v *;" +
															" M ;");

		var sut = game.getTerritory();
		sut.clearTile(game.getCommandStack(), locationOf(1, 1));

		var actual = GameStringifier.toString(game);
		assertEquals("v *;" +
				     "   ;", actual);
	}

	private Location locationOf(int column, int row) {
		var location = new Location();
		location.setColumn(column);
		location.setRow(row);
		return location;
	}




}
