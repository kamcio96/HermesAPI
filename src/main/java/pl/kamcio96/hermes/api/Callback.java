package pl.kamcio96.hermes.api;

public interface Callback<T> {

    void done(T t);

    void error(Throwable t);

}
