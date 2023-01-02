package pl.coderslab.advanced.lambda;
@FunctionalInterface
public interface Operation<T> {
    T compute (T t);
}
