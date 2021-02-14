package util;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

/**
 * LambdaVisitor adapted from the PSE Utils.
 */
public final class LambdaVisitor<T> implements Consumer<T> {
    private final Map<Class<? extends T>, Consumer<Object>> consumerMap = new HashMap<>();
    
    public <S extends T> Acceptor<T, S> on(final Class<S> matchingClass) {
        return new Acceptor<>(this, matchingClass);
    }
    
    @Override
    public void accept(final T currentObject) {
    	final Class<? extends Object> currentObjectClass = currentObject.getClass();
		Optional<Consumer<Object>> consumerOptional = Optional.ofNullable(consumerMap.get(currentObjectClass));
        if (consumerOptional.isEmpty()) {
            consumerOptional = findMatchingInterface(currentObject);
        }
        consumerOptional.ifPresent(consumer -> consumer.accept(currentObject));
    }

	private Optional<Consumer<Object>> findMatchingInterface(final T currentObject) {
		for (final Class<?> interfaceClass : currentObject.getClass().getInterfaces()) {
		    if (consumerMap.containsKey(interfaceClass)) {
		        return Optional.of(consumerMap.get(interfaceClass));
		    }
		}
		return Optional.empty();
	}

    public static final class Acceptor<T, S extends T> {
        private final LambdaVisitor<T> visitor;
        private final Class<S> matchingClassForThisAcceptor;

        Acceptor(final LambdaVisitor<T> visitor, final Class<S> matchingClass) {
            this.visitor = visitor;
            this.matchingClassForThisAcceptor = matchingClass;
        }

        @SuppressWarnings("unchecked")
        public LambdaVisitor<T> then(final Consumer<S> f) {
            visitor.consumerMap.put(matchingClassForThisAcceptor, (Consumer<Object>) f);
            return visitor;
        }
    }
}
