package de.unistuttgart.kara.viewmodel.impl;

import de.unistuttgart.kara.viewmodel.*;
import de.unistuttgart.kara.kara.*;
import de.unistuttgart.kara.mpw.*;
import javafx.collections.ListChangeListener;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.Semaphore;

public class GameViewPresenterImpl extends GameViewPresenter {
	private final KaraGame game;

	private final Map<LogEntry, ViewModelLogEntry> logEntryMap = new HashMap<>();

	public GameViewPresenterImpl(KaraGame game) {
		super(new Semaphore(1, true));
		this.game = game;

		final Size size = this.game.getWorld().getWorldSize();
		getViewModel().init(size);
	}

	@Override
	public void bind() {
		runBlocking(() -> {
			var world = game.getWorld().getInternalWorld();
			world.tilesProperty().addListener(tilesChangedListener);
			world.tilesProperty().forEach(tile -> addTileNode(tile));

			var gameLog = game.getGameLog();
			gameLog.logEntriesProperty().addListener(logChangedListener);
			gameLog.logEntriesProperty().forEach(entry -> addLogEntry(entry));
		});
	}

	/**
	 * Log Handling
	 */

	private final ListChangeListener<LogEntry> logChangedListener = new ListChangeListener<>() {
		@Override
		public void onChanged(final Change<? extends LogEntry> change) {
			runBlocking(() -> {
				while (change.next()) {
					if (change.wasAdded()) {
						change.getAddedSubList().forEach(entry -> addLogEntry(entry));
					}
					if (change.wasRemoved()) {
						change.getRemoved().forEach(entry -> removeLogEntry(entry));
					}
				}
			});
		}
	};

	private void addLogEntry(LogEntry entry) {
		var viewModelLogEntry = new ViewModelLogEntry();
		viewModelLogEntry.setMessage(entry.getMessage());
		viewModelLogEntry.setColor(Color.BLACK);
		getViewModel().addToLogEntries(viewModelLogEntry);
		logEntryMap.put(entry, viewModelLogEntry);
	}

	private void removeLogEntry(LogEntry entry) {
		var viewModelLogEntry = logEntryMap.remove(entry);
		getViewModel().removeFromLogEntries(viewModelLogEntry);
	}

	/**
	 * Tile Handling
	 */

	private final ListChangeListener<Tile> tilesChangedListener = new ListChangeListener<Tile>() {
		@Override
		public void onChanged(final Change<? extends Tile> change) {
			runBlocking(() -> {
				while (change.next()) {
					if (change.wasAdded()) {
						change.getAddedSubList().forEach(tile -> addTileNode(tile));
					}
					if (change.wasRemoved()) {
						change.getRemoved().forEach(tile -> removeTileNode(tile));
					}
				}
			});
		}
	};

	private void addTileNode(final Tile tile) {
		final Location location = tile.getLocation();
		tile.contentsProperty().addListener((v, c, l) -> {
			runBlocking(() -> {
				setTileNodeAt(tile.getLocation(), tile);
			});
		});
		setTileNodeAt(location, tile);
	}

	private void removeTileNode(final Tile tile) {
		var cell = getViewModel().getCellAt(tile.getLocation().getRow(), tile.getLocation().getColumn());
		cell.getLayers().clear();
	}

	private void setTileNodeAt(final Location location, final Tile tile) {
		var cell = getViewModel().getCellAt(location.getRow(), location.getColumn());
		cell.getLayers().clear();

		configureTreeImageView(cell, tile);
		configureLeafImageView(cell, tile);
		configureMushroomImageView(cell, tile);

		Optional<ReadOnlyKara> karaOptional = findKaraOnTile(tile);
		karaOptional.ifPresent(readOnlyKara -> configureKaraImageView(cell, readOnlyKara));
	}

	private Optional<ReadOnlyKara> findKaraOnTile(Tile tile) {
		return tile.getContents().stream()
				.filter(ReadOnlyKara.class::isInstance)
				.map(ReadOnlyKara.class::cast).findFirst();
	}

	private void configureTreeImageView(ViewModelCell cell, Tile tile) {
		var layer = new ViewModelCellLayer();
		layer.setImageName("Tree");
		refreshTreeLayer(layer, tile);
		cell.getLayers().add(layer);
	}

	private void refreshTreeLayer(ViewModelCellLayer layer, Tile tile) {
		layer.setVisible(tile.getContents().stream().anyMatch(Tree.class::isInstance));
	}

	private void configureLeafImageView(ViewModelCell cell, Tile tile) {
		var layer = new ViewModelCellLayer();
		layer.setImageName("Leaf");
		refreshLeafLayer(layer, tile);
		cell.getLayers().add(layer);
	}

	private void refreshLeafLayer(ViewModelCellLayer layer, Tile tile) {
		layer.setVisible(tile.getContents().stream().anyMatch(Leaf.class::isInstance));
	}

	private void configureMushroomImageView(ViewModelCell cell, Tile tile) {
		var layer = new ViewModelCellLayer();
		layer.setImageName("Mushroom");
		refreshMushroomLayer(layer, tile);
		cell.getLayers().add(layer);
	}

	private void refreshMushroomLayer(ViewModelCellLayer layer, Tile tile) {
		layer.setVisible(tile.getContents().stream().anyMatch(Mushroom.class::isInstance));
	}

	private void configureKaraImageView(ViewModelCell cell, ReadOnlyKara kara) {
		var layer = new ViewModelCellLayer();
		layer.setImageName("Kara");

		kara.directionProperty().addListener((v, c, l) -> {
			runBlocking(() -> {
				refreshKaraLayer(layer, kara);
			});
		});

		refreshKaraLayer(layer, kara);
		cell.getLayers().add(layer);
	}

	private void refreshKaraLayer(ViewModelCellLayer layer, ReadOnlyKara kara) {
		layer.setVisible(kara.getCurrentTile() != null);
		layer.setRotation(getRotationForDirection(kara.getDirection()));
	}

	private int getRotationForDirection(final Direction direction) {
		assert direction != null;

		switch (direction) {
			case EAST:
				return 0;
			case SOUTH:
				return 90;
			case WEST:
				return 180;
			case NORTH:
				return 270;
		}
		throw new RuntimeException("Invalid direction!");
	}

	@Override
	public void playClicked() {
		game.getGameCommandStack().resumeGame();
	}

	@Override
	public void pauseClicked() {
		game.getGameCommandStack().pauseGame();
	}

	@Override
	public void undoClicked() {
		game.getGameCommandStack().undo();
	}

	@Override
	public void redoClicked() {
		game.getGameCommandStack().redo();
	}

	@Override
	public void close() {
		game.getGameCommandStack().abortOrStopGame();
	}

	@Override
	public void textTyped(String text) {
		throw new RuntimeException("not implemented");
	}

	private void runBlocking(Runnable runnable) {
		try {
			getSemaphore().acquire();
			runnable.run();
		} catch (final Exception e) {
			throw new RuntimeException(e);
		} finally {
			getSemaphore().release();
		}
	}

}
