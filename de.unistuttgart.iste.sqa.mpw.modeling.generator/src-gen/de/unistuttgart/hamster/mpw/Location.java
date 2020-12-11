package de.unistuttgart.hamster.mpw;

import javafx.beans.property.*;

public class Location {

	private final ReadOnlyIntegerWrapper column = new ReadOnlyIntegerWrapper(this, "column");

	private final ReadOnlyIntegerWrapper row = new ReadOnlyIntegerWrapper(this, "row");

	public Location() {

	}

	public ReadOnlyIntegerProperty columnProperty() {
		return this.column.getReadOnlyProperty();
	}

	public ReadOnlyIntegerProperty rowProperty() {
		return this.row.getReadOnlyProperty();
	}

	public int getColumn() {
		return this.column.get();
	}

	public int getRow() {
		return this.row.get();
	}

	public void setColumn(int column) {
		this.column.set(column);

	}

	public void setRow(int row) {
		this.row.set(row);

	}

}
