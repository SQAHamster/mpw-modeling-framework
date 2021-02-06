package de.unistuttgart.iste.sqa.mpw.framework.viewmodel.impl;

import de.unistuttgart.iste.sqa.mpw.framework.utils.Preconditions;
import de.unistuttgart.iste.sqa.mpw.framework.mpw.*;
import de.unistuttgart.iste.sqa.mpw.framework.viewmodel.Color;
import de.unistuttgart.iste.sqa.mpw.framework.viewmodel.GameViewPresenter;
import de.unistuttgart.iste.sqa.mpw.framework.viewmodel.ViewModelCell;
import de.unistuttgart.iste.sqa.mpw.framework.viewmodel.ViewModelLogEntry;
import javafx.collections.ListChangeListener;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;

import static de.unistuttgart.iste.sqa.mpw.framework.utils.Preconditions.checkState;

public abstract class GameViewPresenterImpl extends GameViewPresenter {
	private final MiniProgrammingWorld miniProgrammingWorld;

	private final Map<LogEntry, ViewModelLogEntry> logEntryMap = new HashMap<>();

	public GameViewPresenterImpl(MiniProgrammingWorld miniProgrammingWorld) {
		super(new Semaphore(1, true));
		this.miniProgrammingWorld = miniProgrammingWorld;

		final Size size = this.miniProgrammingWorld.getStage().getStageSize();
		getViewModel().init(size);
	}

	@Override
	public void bind() {
		runLocked(() -> {
			bindTiles();
			bindGameLog();
			bindButtons();
			onBind();
		});
	}

	protected void onBind() {
		// can be overridden by subclasses
	}

	private void bindTiles() {
		var stage = miniProgrammingWorld.getStage();
		var tilesProperty = stage.tilesProperty();
		tilesProperty.addListener(tilesChangedListener);
		tilesProperty.forEach(this::addTileNode);
	}

	private void bindGameLog() {
		var gameLog = miniProgrammingWorld.getGameLog();
		var logEntriesProperty = gameLog.logEntriesProperty();
		logEntriesProperty.addListener(logChangedListener);
		logEntriesProperty.forEach(this::addLogEntry);
	}

	private void bindButtons() {
		var viewModel = getViewModel();
		var modeProperty = miniProgrammingWorld.getPerformance().modeProperty();
		var gameCommandStack = miniProgrammingWorld.getPerformance().getGameCommandStack();
		var anyExecutedCommandsBinding = gameCommandStack.executedCommandsProperty().emptyProperty().not();
		var anyUndoneCommandsBinding = gameCommandStack.undoneCommandsProperty().emptyProperty().not();

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

	private void addLogEntry(LogEntry entry) {
		var viewModelLogEntry = new ViewModelLogEntry();
		viewModelLogEntry.setMessage(entry.getMessage());
		viewModelLogEntry.setColor(getColorForLogEntry(entry));
		getViewModel().addToLogEntries(viewModelLogEntry);
		logEntryMap.put(entry, viewModelLogEntry);
	}

	protected Color getColorForLogEntry(LogEntry entry) {
		return Color.BLACK;
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
		tile.contentsProperty().addListener((v, c, l) -> {
			runLocked(() -> {
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
	public void speedChanged(double speedValue) {
		Preconditions.checkState(speedValue >= 0 && speedValue <= 10,
					"Provided speed is not in range [0, 10]");
		miniProgrammingWorld.getPerformance().setSpeed(speedValue);
	}

	@Override
	public void close() {
		miniProgrammingWorld.getPerformance().abortOrStopGame();
	}

	@Override
	public void textTyped(String text) {
		throw new RuntimeException("not implemented");
	}

	private void runLocked(Runnable runnable) {
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
