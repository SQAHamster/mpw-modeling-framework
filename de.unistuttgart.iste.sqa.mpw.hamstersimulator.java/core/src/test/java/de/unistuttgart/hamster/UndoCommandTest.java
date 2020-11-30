package de.unistuttgart.hamster;

import de.unistuttgart.hamster.command.Command;
import de.unistuttgart.hamster.hamster.HamsterGame;
import de.unistuttgart.hamster.util.GameStringifier;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UndoCommandTest {
	
	@Test
	public void testInitHamsterOn1x1_and4Grains() {
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

		List<Command> stack = commandStack.getStack();
		for (int i = stack.size() - 1; i >= 0; i--) {
			Command command = stack.get(i);
			command.undo();
		}

		String actual = GameStringifier.toString(game);
		assertEquals(" >*;" +
				     "   ;", actual);
	}

}
