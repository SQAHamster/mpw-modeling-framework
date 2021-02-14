package de.unistuttgart.iste.sqa.mpw.framework;

public class FrameworkAssert {

	private FrameworkAssert() {}

	public static void assertCondition(final boolean condition, final String message) {
		if (!condition) {
			throw new RuntimeException(message);
		}
	}

	public static void assertAttributeCondition(final String condition, final boolean valid) {
		if (!valid) {
			throw new RuntimeException("Attribute condition is not valid: " + condition);
		}
	}
	
	public static void assertInstanceNotNull(final String instanceName, final Object instance) {
		if (instance == null) {
			throw new RuntimeException("Instance must not be null: " + instanceName);
		}
	}
	
	public static void assertObjectFound(final String referenceName, final String objectTypeName, final Object instance) {
		if (instance == null) {
			throw new RuntimeException("Object of type '" + objectTypeName + "' for reference '" + referenceName + "' not found");	
		}
	}

}
