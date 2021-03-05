package components.transformators;

public enum SourceTargetRelationship {
    /**
     * Indicates, that the QVTo transformation will create a new model (QVTo out)
     */
    NEW_TARGET,

    /**
     * Indicates, that the QVTo transformation will modify the given input model
     * (QVTo inout)
     */
    EXISTING_TARGET
}