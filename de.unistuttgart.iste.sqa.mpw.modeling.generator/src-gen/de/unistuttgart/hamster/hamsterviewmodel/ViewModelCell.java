package de.unistuttgart.hamster.hamsterviewmodel;

import java.util.List;
import javafx.beans.property.*;
import javafx.collections.FXCollections;

public class ViewModelCell {

	private final ReadOnlyListWrapper<ViewModelCellLayer> layers = new ReadOnlyListWrapper<>(this, "layers",
			FXCollections.observableArrayList());

	public ViewModelCell() {

	}

	public ReadOnlyListProperty<ViewModelCellLayer> layersProperty() {
		return this.layers.getReadOnlyProperty();
	}

	public List<ViewModelCellLayer> getLayers() {
		return this.layers.get();
	}

}
