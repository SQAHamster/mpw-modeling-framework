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

		var hamster = game.getDefaultHamster();
		hamster.move(commandStack);
		hamster.pickGrain(commandStack);

		hamster.turnLeft(commandStack);
		hamster.turnLeft(commandStack);
		hamster.turnLeft(commandStack);

		hamster.move(commandStack);

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
