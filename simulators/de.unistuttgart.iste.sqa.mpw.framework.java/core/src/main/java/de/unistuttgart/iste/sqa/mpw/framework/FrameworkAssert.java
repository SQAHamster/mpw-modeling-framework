package de.unistuttgart.iste.sqa.mpw.framework;

public class FrameworkAssert {

	private FrameworkAssert() {}

	public static void assertCondition(boolean condition, String message) {
		if (!condition) {
			throw new RuntimeException(message);
		}
	}

	public static void assertAttributeCondition(String condition, boolean valid) {
		if (!valid) {
			throw new RuntimeException("Attribute condition is not valid: " + condition);
		}
	}
	
	public static void assertInstanceNotNull(String instanceName, Object instance) {
		if (instance == null) {
			throw new RuntimeException("Instance must not be null: " + instanceName);
		}
	}
	
	public static void assertObjectFound(String referenceName, String objectTypeName, Object instance) {
		if (instance == null) {
			throw new RuntimeException("Object of type '" + objectTypeName + "' for reference '" + referenceName + "' not found");	
		}
	}

}
