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
		sut.initTerritory(5, 3, game.getCommandStack());

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
		sut.addGrainsToTile(locationOf(2, 0), 1, game.getCommandStack());

		var actual = GameStringifier.grainsOnTerritoryToString(game);
		assertEquals("  1;" +
				     "   ;", actual.replace('0', ' '));
	}

	@Test
	public void testAddTwoGrain() {
		HamsterGame game = GameStringifier.createFromString("   ;" +
															"   ;");

		var sut = game.getTerritory();
		sut.addGrainsToTile(locationOf(1, 1), 2, game.getCommandStack());

		var actual = GameStringifier.grainsOnTerritoryToString(game);
		assertEquals("   ;" +
				     " 2 ;", actual.replace('0', ' '));
	}

	@Test
	public void testAddWall() {
		HamsterGame game = GameStringifier.createFromString("   ;" +
															"   ;");

		var sut = game.getTerritory();
		sut.addWallToTile(locationOf(2, 0), game.getCommandStack());

		var actual = GameStringifier.toString(game);
		assertEquals("  M;" +
				     "   ;", actual.replace('0', ' '));
	}

	private Location locationOf(int column, int row) {
		var location = new Location();
		location.setColumn(column);
		location.setRow(row);
		return location;
	}




}
