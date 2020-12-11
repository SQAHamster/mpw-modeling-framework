package de.unistuttgart.hamster.hamsterviewmodel;

import java.util.List;
import javafx.beans.property.*;
import javafx.collections.FXCollections;

public class ViewModelRow {

	private final ReadOnlyListWrapper<ViewModelCell> cells = new ReadOnlyListWrapper<>(this, "cells",
			FXCollections.observableArrayList());

	public ViewModelRow() {

	}

	public ReadOnlyListProperty<ViewModelCell> cellsProperty() {
		return this.cells.getReadOnlyProperty();
	}

	public List<ViewModelCell> getCells() {
		return this.cells.get();
	}

}
