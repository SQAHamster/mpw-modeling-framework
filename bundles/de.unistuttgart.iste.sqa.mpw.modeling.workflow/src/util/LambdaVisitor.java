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
    private Consumer<T> elseRunnable = (T) -> {
    };

    public <S extends T> Acceptor<T, S> on(final Class<S> matchingClass) {
        return new Acceptor<>(this, matchingClass);
    }

    public LambdaVisitor<T> orElse(Runnable runnable) {
        elseRunnable = (o) -> {
            runnable.run();
        };
        return this;
    }

    public LambdaVisitor<T> orElse(Consumer<T> consumer) {
        elseRunnable = consumer;
        return this;
    }

    @Override
    public void accept(final T currentObject) {
        final Class<? extends Object> currentObjectClass = currentObject.getClass();
        Optional<Consumer<Object>> consumerOptional = Optional.ofNullable(consumerMap.get(currentObjectClass));
        if (consumerOptional.isEmpty()) {
            consumerOptional = findMatchingBaseClass(currentObject);
        }
        if (consumerOptional.isEmpty()) {
            consumerOptional = findMatchingInterface(currentObject.getClass());
        }
        consumerOptional.ifPresentOrElse(consumer -> consumer.accept(currentObject),
                () -> elseRunnable.accept(currentObject));
    }

    private Optional<Consumer<Object>> findMatchingInterface(final Class<?> objectClass) {
        for (final Class<?> interfaceClass : objectClass.getInterfaces()) {
            if (consumerMap.containsKey(interfaceClass)) {
                return Optional.of(consumerMap.get(interfaceClass));
            }
        }
        final Class<?> superClass = objectClass.getSuperclass();
        if (superClass != null) {
            return findMatchingInterface(superClass);
        }
        return Optional.empty();
    }

    private Optional<Consumer<Object>> findMatchingBaseClass(final T currentObject) {
        Class<?> superClass = currentObject.getClass().getSuperclass();
        while (superClass != null) {
            if (consumerMap.containsKey(superClass)) {
                return Optional.of(consumerMap.get(superClass));
            }
            superClass = superClass.getSuperclass();
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
