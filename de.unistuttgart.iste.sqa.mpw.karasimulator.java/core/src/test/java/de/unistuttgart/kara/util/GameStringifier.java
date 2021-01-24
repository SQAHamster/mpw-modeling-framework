package de.unistuttgart.kara.util;

import de.unistuttgart.kara.kara.*;
import de.unistuttgart.kara.mpw.Tile;

import java.util.function.Consumer;

public class GameStringifier {
	
	public static KaraGame createFromString(String map) {
		var game = new KaraGame();

		String[] parts = map.split(";");
		int height = parts.length;
		int width = height > 0 ? parts[0].length() : 0;

		var worldBuilder = new WorldBuilder(game);
		worldBuilder.initWorld(width, height);

		for (int y = 0; y < height; y++) {
			handleLine(worldBuilder, y, parts[y]);
		}

		game.getGameCommandStack().disableDelay();
		game.startGame();

		return game;
	}

	private static void handleLine(WorldBuilder worldBuilder, int y, String part) {
		char[] chars = part.toCharArray();
		for (int x = 0; x < part.length(); x++) {
			handleCell(worldBuilder, x, y, chars[x]);
		}
	}

	private static void handleCell(WorldBuilder worldBuilder, int x, int y, char cell) {
		switch (cell) {
			case '>', '<', '^', 'v' -> worldBuilder.initKara(x, y, DirectionTestHelper.toDirection(cell));
			case '*' -> worldBuilder.addLeafToTile(x, y);
			case '#' -> worldBuilder.addTreeToTile(x, y);
			case '@' -> worldBuilder.addMushroomToTile(x, y);
		}
	}

	public static String toString(KaraGame game) {
		var actual = new StringBuilder();

		var kara = game.getWorld().getKara().getInternalKara();
		iterateTiles(game, currentTile -> {
			if (kara.getCurrentTile() == currentTile) {
				actual.append(DirectionTestHelper.toDirection(kara.getDirection()));
			} else if (currentTile.getContents().stream().anyMatch(Leaf.class::isInstance)) {
				actual.append('*');
			} else if (currentTile.getContents().stream().anyMatch(Tree.class::isInstance)) {
				actual.append('#');
			} else if (currentTile.getContents().stream().anyMatch(Mushroom.class::isInstance)) {
				actual.append('@');
			} else {
				actual.append(' ');
			}

			if (currentTile.getEast() == null) {
				actual.append(';');
			}
		});

		return actual.toString();
	}

	private static void iterateTiles(KaraGame game, Consumer<Tile> lambda) {
		var tiles = game.getWorld().getInternalWorld().getTiles();
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
