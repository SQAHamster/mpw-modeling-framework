package de.unistuttgart.hamster.hamster;

import de.unistuttgart.hamster.commands.*;
import de.unistuttgart.hamster.mpw.Stage;
import de.unistuttgart.hamster.command.CommandStack;

public class ConcreteTerritory extends Stage implements GameTerritory, EditorTerritory {

	public ConcreteTerritory(CommandStack commandStack) {
		super(commandStack);

	}

	@Override
	public void addGrainsToTile() {
		new AddGrainsToTileCommand(this).execute();
	}

	@Override
	public void addWallToTile() {
		new AddWallToTileCommand(this).execute();
	}

	@Override
	public void clearTile() {
		new ClearTileCommand(this).execute();
	}

	@Override
	public void initTerritory() {
		new InitTerritoryCommand(this).execute();
	}

}
