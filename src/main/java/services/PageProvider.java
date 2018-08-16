package services;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class PageProvider<T> {

    @Inject
    private Provider<T> provider;

    public T getPage() {
        return provider.get();
    }
}
