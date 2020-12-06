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
		var commandStack = game.getCommandStack();
		commandStack.getStack().clear(); // remove initial commands to test undoAll

		var hamster = game.getTerritory().getDefaultHamster();
		hamster.move();
		hamster.pickGrain();

		hamster.turnLeft();
		hamster.turnLeft();
		hamster.turnLeft();

		hamster.move();

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
