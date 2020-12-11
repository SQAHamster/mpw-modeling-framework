package de.unistuttgart.hamster.hamsterviewmodel;

import javafx.beans.property.*;

public class ViewModelCellLayer {

	private final ReadOnlyStringWrapper imageName = new ReadOnlyStringWrapper(this, "imageName");

	private final ReadOnlyIntegerWrapper rotation = new ReadOnlyIntegerWrapper(this, "rotation");

	private final ReadOnlyBooleanWrapper visible = new ReadOnlyBooleanWrapper(this, "visible");

	public ViewModelCellLayer() {

	}

	public ReadOnlyStringProperty imageNameProperty() {
		return this.imageName.getReadOnlyProperty();
	}

	public ReadOnlyIntegerProperty rotationProperty() {
		return this.rotation.getReadOnlyProperty();
	}

	public ReadOnlyBooleanProperty visibleProperty() {
		return this.visible.getReadOnlyProperty();
	}

	public String getImageName() {
		return this.imageName.get();
	}

	public int getRotation() {
		return this.rotation.get();
	}

	public boolean getVisible() {
		return this.visible.get();
	}

	public void setImageName(String imageName) {
		this.imageName.set(imageName);

	}

	public void setRotation(int rotation) {
		this.rotation.set(rotation);

	}

	public void setVisible(boolean visible) {
		this.visible.set(visible);

	}

}
