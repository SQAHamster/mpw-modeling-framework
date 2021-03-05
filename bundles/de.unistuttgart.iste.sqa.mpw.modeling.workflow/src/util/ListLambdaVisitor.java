package util;

import java.util.List;
import java.util.function.Consumer;

/**
 * A custom LambdaVisitor which only accepts a List, and visits its contained
 * elements.
 */
public final class ListLambdaVisitor<T> implements Consumer<List<T>> {
    private final LambdaVisitor<T> singleObjectLambdaVisitor = new LambdaVisitor<>();
    private Runnable emptyRunnable = () -> {
    };

    public <S extends T> Acceptor<T, S> on(final Class<S> matchingClass) {
        var nestedAcceptor = singleObjectLambdaVisitor.on(matchingClass);
        return new Acceptor<>(this, nestedAcceptor);
    }

    public ListLambdaVisitor<T> orElse(Runnable runnable) {
        singleObjectLambdaVisitor.orElse(runnable);
        return this;
    }

    public ListLambdaVisitor<T> orElse(Consumer<T> consumer) {
        singleObjectLambdaVisitor.orElse(consumer);
        return this;
    }

    public ListLambdaVisitor<T> orIfEmpty(Runnable runnable) {
        emptyRunnable = runnable;
        return this;
    }

    @Override
    public void accept(final List<T> list) {
        if (list == null || list.isEmpty()) {
            emptyRunnable.run();
        } else {
            for (T currentObject : list) {
                singleObjectLambdaVisitor.accept(currentObject);
            }
        }

    }

    public static final class Acceptor<T, S extends T> {
        private final ListLambdaVisitor<T> visitor;
        private final LambdaVisitor.Acceptor<T, S> nestedAcceptor;

        Acceptor(final ListLambdaVisitor<T> visitor, LambdaVisitor.Acceptor<T, S> nestedAcceptor) {
            this.visitor = visitor;
            this.nestedAcceptor = nestedAcceptor;
        }

        public ListLambdaVisitor<T> then(final Consumer<S> f) {
            nestedAcceptor.then(f);
            return visitor;
        }
    }

}
