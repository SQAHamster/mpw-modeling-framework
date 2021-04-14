package de.unistuttgart.iste.sqa.mpw.framework.viewmodel.impl;

import de.unistuttgart.iste.sqa.mpw.framework.utils.Preconditions;
import de.unistuttgart.iste.sqa.mpw.framework.mpw.*;
import de.unistuttgart.iste.sqa.mpw.framework.datatypes.*;
import de.unistuttgart.iste.sqa.mpw.framework.facade.MiniProgrammingWorld;
import de.unistuttgart.iste.sqa.mpw.framework.viewmodel.GameViewPresenter;
import de.unistuttgart.iste.sqa.mpw.framework.viewmodel.ViewModelCell;
import de.unistuttgart.iste.sqa.mpw.framework.viewmodel.ViewModelLogEntry;
import javafx.beans.property.ReadOnlyListProperty;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;

public abstract class GameViewPresenterBase extends GameViewPresenter {
	private final MiniProgrammingWorld miniProgrammingWorld;

	private final Map<LogEntry, ViewModelLogEntry> logEntryMap = new HashMap<>();
	private final Map<Tile, ListChangeListener<TileContent>> tileContentsChangeListeners = new HashMap<>();

	public GameViewPresenterBase(final MiniProgrammingWorld miniProgrammingWorld) {
		super(new Semaphore(1, true));
		this.miniProgrammingWorld = miniProgrammingWorld;
	}

	@Override
	public void bind() {
		runLocked(() -> {
			bindSize();
			bindTiles();
			bindGameLog();
			bindButtons();
			onBind();
		});
	}

	// needs to be implemented by derived presenter classes, since here
	// no concrete Stage is available.
	protected abstract ReadOnlyObjectProperty<Size> getStageSizeFromConcreteStage();

	protected void onBind() {
		// can be overridden by subclasses
	}

	private void bindSize() {
		final ReadOnlyObjectProperty<Size> sizeProperty = getStageSizeFromConcreteStage();
		getViewModel().init(sizeProperty.get());
		sizeProperty.addListener((observableValue, oldSize, newSize) -> {
			runLocked(() -> {
				getViewModel().init(newSize);
			});
		});
	}

	private void bindTiles() {
		final var tilesProperty = getTilesPropertyFromConcreteStage();
		tilesProperty.addListener(tilesChangedListener);
		tilesProperty.forEach(this::addTileNode);
	}

	// needs to be implemented by derived presenter classes, since here
	// no concrete Stage is available.
	protected abstract ReadOnlyListProperty<Tile> getTilesPropertyFromConcreteStage();

	private void bindGameLog() {
		final var gameLog = miniProgrammingWorld.getGameLog();
		final var logEntriesProperty = gameLog.logEntriesProperty();
		logEntriesProperty.addListener(logChangedListener);
		logEntriesProperty.forEach(this::addLogEntry);
	}

	private void bindButtons() {
		final var viewModel = getViewModel();
		final var modeProperty = miniProgrammingWorld.getPerformance().modeProperty();
		final var gameCommandStack = miniProgrammingWorld.getPerformance().getGameCommandStack();
		final var anyExecutedCommandsBinding = gameCommandStack.executedCommandsProperty().emptyProperty().not();
		final var anyUndoneCommandsBinding = gameCommandStack.undoneCommandsProperty().emptyProperty().not();

		viewModel.playButtonEnabledProperty().bind(modeProperty.isEqualTo(Mode.PAUSED));
		viewModel.pauseButtonEnabledProperty().bind(modeProperty.isEqualTo(Mode.RUNNING));
		viewModel.undoButtonEnabledProperty().bind(anyExecutedCommandsBinding.and(modeProperty.isNotEqualTo(Mode.RUNNING)));
		viewModel.redoButtonEnabledProperty().bind(anyUndoneCommandsBinding.and(modeProperty.isNotEqualTo(Mode.RUNNING)));
	}

	/**
	 * Log Handling
	 */

	private final ListChangeListener<LogEntry> logChangedListener = new ListChangeListener<>() {
		@Override
		public void onChanged(final Change<? extends LogEntry> change) {
			runLocked(() -> {
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

	private void addLogEntry(final LogEntry entry) {
		final var viewModelLogEntry = new ViewModelLogEntry();
		viewModelLogEntry.setMessage(entry.getMessage());
		viewModelLogEntry.setColor(getColorForLogEntry(entry));
		getViewModel().addToLogEntries(viewModelLogEntry);
		logEntryMap.put(entry, viewModelLogEntry);
	}

	protected Color getColorForLogEntry(final LogEntry entry) {
		return Color.BLACK;
	}

	private void removeLogEntry(final LogEntry entry) {
		final var viewModelLogEntry = logEntryMap.remove(entry);
		getViewModel().removeFromLogEntries(viewModelLogEntry);
	}


	/**
	 * Tile Handling
	 */

	private final ListChangeListener<Tile> tilesChangedListener = new ListChangeListener<Tile>() {
		@Override
		public void onChanged(final Change<? extends Tile> change) {
			runLocked(() -> {
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
		final ListChangeListener<TileContent> contentChangeListener = change -> {
			runLocked(() -> {
				setTileNodeAt(tile.getLocation(), tile);
			});
		};
		tile.contentsProperty().addListener(contentChangeListener);
		tileContentsChangeListeners.put(tile, contentChangeListener);
		setTileNodeAt(location, tile);
	}

	private void removeTileNode(final Tile tile) {
		final var cell = getViewModel().getCellAt(tile.getLocation().getRow(), tile.getLocation().getColumn());
		cell.getLayers().clear();
		removeTileContentsListenerForTile(tile);
	}

	private void removeTileContentsListenerForTile(Tile tile) {
		final ListChangeListener<TileContent> contentChangeListener = tileContentsChangeListeners.remove(tile);
		if (contentChangeListener != null) {
			tile.contentsProperty().removeListener(contentChangeListener);
		}
	}

	private void setTileNodeAt(final Location location, final Tile tile) {
		final var cell = getViewModel().getCellAt(location.getRow(), location.getColumn());
		cell.getLayers().clear();
		onSetTileNodeAtForCell(cell, tile);
	}

	protected abstract void onSetTileNodeAtForCell(final ViewModelCell cell, final Tile tile);

	protected int getRotationForDirection(final Direction direction) {
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
		miniProgrammingWorld.getPerformance().resumeGame();
	}

	@Override
	public void pauseClicked() {
		miniProgrammingWorld.getPerformance().pauseGame();
	}

	@Override
	public void undoClicked() {
		miniProgrammingWorld.getPerformance().getGameCommandStack().undo();
	}

	@Override
	public void redoClicked() {
		miniProgrammingWorld.getPerformance().getGameCommandStack().redo();
	}

	@Override
	public void speedChanged(final double speedValue) {
		Preconditions.checkState(speedValue >= 0 && speedValue <= 10,
					"Provided speed is not in range [0, 10]");
		miniProgrammingWorld.getPerformance().setSpeed(speedValue);
	}

	@Override
	public void close() {
		miniProgrammingWorld.getPerformance().abortOrStopGame();
	}

	protected void runLocked(final Runnable runnable) {
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
