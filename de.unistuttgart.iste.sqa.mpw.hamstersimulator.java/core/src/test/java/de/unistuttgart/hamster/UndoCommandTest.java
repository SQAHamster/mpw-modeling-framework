package de.unistuttgart.hamster;

import de.unistuttgart.hamster.hamster.HamsterGame;
import de.unistuttgart.hamster.util.GameStringifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UndoCommandTest {
	
	@Test
	public void testUndo() {
		HamsterGame game = GameStringifier.createFromString(" >*;" +
															"   ;");
		game.hardReset();
		game.startGame();

		var hamster = game.getTerritory().getDefaultHamster();
		hamster.move();
		hamster.pickGrain();

		hamster.turnLeft();
		hamster.turnLeft();
		hamster.turnLeft();

		hamster.move();

		var commandStack = game.getGameCommandStack();
		commandStack.undo();
		String actual = GameStringifier.toString(game);
		assertEquals("  v;" +
				     "   ;", actual);

		commandStack.undoAll();

		actual = GameStringifier.toString(game);
		assertEquals(" >*;" +
				     "   ;", actual);
	}

}
