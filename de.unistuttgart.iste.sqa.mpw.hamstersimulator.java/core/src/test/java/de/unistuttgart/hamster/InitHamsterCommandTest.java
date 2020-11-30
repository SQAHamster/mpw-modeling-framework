package de.unistuttgart.hamster;

import de.unistuttgart.hamster.hamster.HamsterGame;
import de.unistuttgart.hamster.mpw.Direction;
import de.unistuttgart.hamster.mpw.Location;
import de.unistuttgart.hamster.util.GameStringifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InitHamsterCommandTest {
	
	@Test
	public void testInitHamsterOn1x1_and4Grains() {
		HamsterGame game = GameStringifier.createFromString("   ;" +
															"   ;");

		var sut = game.getDefaultHamster();
		sut.initHamster(game.getCommandStack(), game.getTerritory(), locationOf(1, 1), Direction.SOUTH, 4);

		String actual = GameStringifier.toString(game);
		assertEquals("   ;" +
				     " v ;", actual);
		assertEquals(4, sut.getGrains().size());
	}

	private Location locationOf(int column, int row) {
		var location = new Location();
		location.setColumn(column);
		location.setRow(row);
		return location;
	}


}
