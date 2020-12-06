package de.unistuttgart.hamster.util;

import de.unistuttgart.hamster.hamster.*;
import de.unistuttgart.hamster.mpw.Tile;

import java.util.function.Consumer;

public class GameStringifier {
	
	public static HamsterGame createFromString(String map) {
		var game = new HamsterGame();

		String[] parts = map.split(";");
		int height = parts.length;
		int width = height > 0 ? parts[0].length() : 0;

		var territoryBuilder = new TerritoryBuilder(game);
		territoryBuilder.initTerritory(width, height);

		for (int y = 0; y < height; y++) {
			String string = parts[y];

			char[] chars = string.toCharArray();

			for (int x = 0; x < width; x++) {
				switch (chars[x]) {
					case '>':
					case '<':
					case '^':
					case 'v':
						territoryBuilder.initDefaultHamster(x, y, DirectionTestHelper.toDirection(chars[x]), 0);
						break;
					case '*':
						territoryBuilder.addGrainsToTile(x, y, 1);
						break;
					case 'M':
						territoryBuilder.addWallToTile(x, y);
						break;
				}
			}

		}

		return game;
	}
	
	
	public static String toString(HamsterGame game) {
		var actual = new StringBuilder();

		var hamster = game.getTerritory().getDefaultHamster().getInternalHamster();
		iterateTiles(game, currentTile -> {
			if (hamster.getCurrentTile() == currentTile) {
				actual.append(DirectionTestHelper.toDirection(hamster.getDirection()));
			} else if (currentTile.getContents().stream().anyMatch(Wall.class::isInstance)) {
				actual.append('M');
			} else if (currentTile.getContents().stream().anyMatch(Grain.class::isInstance)) {
				actual.append('*');
			} else {
				actual.append(' ');
			}

			if (currentTile.getEast() == null) {
				actual.append(';');
			}
		});

		return actual.toString();
	}

	public static String grainsOnTerritoryToString(HamsterGame game) {
		var actual = new StringBuilder();

		iterateTiles(game, currentTile -> {
			var grainsCount = currentTile.getContents().stream().filter(Grain.class::isInstance).count();
			actual.append(grainsCount);

			if (currentTile.getEast() == null) {
				actual.append(';');
			}
		});

		return actual.toString();
	}

	private static void iterateTiles(HamsterGame game, Consumer<Tile> lambda) {
		var tiles = game.getTerritory().getInternalTerritory().getTiles();
		final var upperLeftTile = tiles.get(0);
		var firstOfRowTile = upperLeftTile;

		var currentTile = upperLeftTile;

		while (currentTile != null) {
			lambda.accept(currentTile);

			if (currentTile.getEast() == null) {
				firstOfRowTile = firstOfRowTile.getSouth();
				currentTile = firstOfRowTile;
			} else {
				currentTile = currentTile.getEast();
			}
		}
	}

}
