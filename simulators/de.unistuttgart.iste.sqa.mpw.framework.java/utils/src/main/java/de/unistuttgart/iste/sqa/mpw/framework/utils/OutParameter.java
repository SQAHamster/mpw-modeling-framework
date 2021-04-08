package de.unistuttgart.iste.sqa.mpw.framework.utils;

/**
 * Simple wrapper to support out parameters in Java
 * @param <T> The inner type of the wrapper.
 */
public class OutParameter<T> {
    private T value;

    public OutParameter() {
        this.value = null;
    }

    public OutParameter(T value) {
        this.value = value;
    }
    
    public T get() {
        return this.value;
    }

    public void set(T value) {
        this.value = value;
    }
}
