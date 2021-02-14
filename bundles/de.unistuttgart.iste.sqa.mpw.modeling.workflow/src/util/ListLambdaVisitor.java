package util;

import java.util.List;
import java.util.function.Consumer;

/**
 * A custom LambdaVisitor which only accepts a List, and visits its contained elements.
 */
public final class ListLambdaVisitor<T> implements Consumer<List<T>> {
    private final LambdaVisitor<T> singleObjectLambdaVisitor = new LambdaVisitor<>();
    private Runnable emptyRunnable = () -> {};
    
    public <S extends T> LambdaVisitor.Acceptor<T, S> on(final Class<S> matchingClass) {
        return singleObjectLambdaVisitor.on(matchingClass);
    }

    public ListLambdaVisitor<T> orElse(Runnable runnable) {
    	singleObjectLambdaVisitor.orElse(runnable);
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
}
