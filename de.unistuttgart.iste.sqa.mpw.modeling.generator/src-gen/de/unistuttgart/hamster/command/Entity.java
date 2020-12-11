package de.unistuttgart.hamster.command;

public abstract class Entity {

	public Entity() {

	}

	@SuppressWarnings("unchecked")
	public void setProperty(String propertyName, Object value) {

		try {
			var field = getClass().getField(propertyName);
			@SuppressWarnings("rawtypes")
			var property = (javafx.beans.property.Property) field.get(this);
			property.setValue(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	public void addReference(String propertyName, Entity entity) {

		try {
			var field = getClass().getField(propertyName);
			@SuppressWarnings("rawtypes")
			var property = (javafx.beans.property.ListProperty) field.get(this);
			property.add(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void removeReference(String propertyName, Entity entity) {

		try {
			var field = getClass().getField(propertyName);
			@SuppressWarnings("rawtypes")
			var property = (javafx.beans.property.ListProperty) field.get(this);
			property.remove(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
