package de.unistuttgart.hamster.hamsterviewmodel;

import java.util.List;
import javafx.beans.property.*;
import javafx.collections.FXCollections;

public class GameViewModel {

	private final ReadOnlyListWrapper<String> logEntries = new ReadOnlyListWrapper<>(this, "logEntries",
			FXCollections.observableArrayList());

	private final ReadOnlyListWrapper<ViewModelRow> rows = new ReadOnlyListWrapper<>(this, "rows",
			FXCollections.observableArrayList());

	public GameViewModel() {

	}

	public ReadOnlyListProperty<String> logEntriesProperty() {
		return this.logEntries.getReadOnlyProperty();
	}

	public ReadOnlyListProperty<ViewModelRow> rowsProperty() {
		return this.rows.getReadOnlyProperty();
	}

	public List<String> getLogEntries() {
		return this.logEntries.get();
	}

	public List<ViewModelRow> getRows() {
		return this.rows.get();
	}

}
