package de.unistuttgart.hamster.hamster;

public interface EditorTerritory extends ReadOnlyTerritory {

	void addGrainsToTile();

	void addWallToTile();

	void clearTile();

	void initTerritory();

}
