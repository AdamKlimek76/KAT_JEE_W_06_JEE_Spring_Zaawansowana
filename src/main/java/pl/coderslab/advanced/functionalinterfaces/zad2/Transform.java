package pl.coderslab.advanced.functionalinterfaces.zad2;
@FunctionalInterface
public interface Transform<T, S> {
    T transform(S s);
}
