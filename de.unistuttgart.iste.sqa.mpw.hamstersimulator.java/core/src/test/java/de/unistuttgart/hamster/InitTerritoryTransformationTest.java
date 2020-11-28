package de.unistuttgart.hamster;

import static org.junit.jupiter.api.Assertions.assertEquals;

import de.unistuttgart.hamster.hamster.HamsterGame;
import de.unistuttgart.hamster.util.GameStringifier;
import org.junit.jupiter.api.Test;

public class InitTerritoryTransformationTest {
	
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


}
