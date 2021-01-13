package de.unistuttgart.hamster;

import de.unistuttgart.hamster.hamster.HamsterGame;
import de.unistuttgart.hamster.hamster.ReadOnlyHamster;
import de.unistuttgart.hamster.hamster.TerritoryBuilder;
import de.unistuttgart.hamster.mpw.Direction;
import de.unistuttgart.hamster.mpw.Location;
import de.unistuttgart.hamster.mpw.Stage;
import de.unistuttgart.hamster.mpw.Tile;
import de.unistuttgart.hamster.util.GameStringifier;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
 * Tests if the model is consistent after performing several commands.
 */
public class GameModelConsistencyTest {
	private HamsterGame game;
	private TerritoryBuilder sut;

	@Test
	public void given1x1Territory_whenAddGrainToTile_thenIsConsistent() {
		withTerritoryBuilder()
				.initTerritory(1, 1)
				.addGrainsToTile(0, 0, amountOf(1));
		assertIsConsistent();
	}

	@Test
	public void given1x1Territory_whenAddHamsterToTile_thenIsConsistent() {
		withTerritoryBuilder()
				.initTerritory(1, 1)
				.initDefaultHamster(0, 0, Direction.EAST, amountOf(0));
		assertIsConsistent();
	}

	@Test
	public void givenTerritoryWithHamster_andWithGrain_whenCheckConsistency_thenIsConsistent() {
		withTerritory(" >*;" +
				      "   ;");
		assertIsConsistent();
	}

	private TerritoryBuilder withTerritoryBuilder() {
		game = new HamsterGame();
		sut = new TerritoryBuilder(game);
		return sut;
	}

	/* used to create a already initialized territory */
	private TerritoryBuilder withTerritory(String map) {
		game = GameStringifier.createFromString(map);
		sut = new TerritoryBuilder(game);
		return sut;
	}

	private void assertIsConsistent() {
		var stage = game.getTerritory().getInternalTerritory();
		var tiles = stage.getTiles();
		for (var tile : tiles) {
			for (var content : tile.getContents()) {
				assertEquals(tile, content.getCurrentTile());
				assertTrue(stage.getTileContents().contains(content));
			}
		}
		for (var content : stage.getTileContents()) {
			assertTrue(content.getCurrentTile().getContents().contains(content));
		}
		var hamster = stage.getReadOnlyDefaultHamster();
		if (hamster.getCurrentTile() != null) {
			assertTrue(hamster.getCurrentTile().getContents().contains(hamster));
		}
	}

	private int amountOf(int amount) {
		return amount;
	}

	//</editor-fold>

}
