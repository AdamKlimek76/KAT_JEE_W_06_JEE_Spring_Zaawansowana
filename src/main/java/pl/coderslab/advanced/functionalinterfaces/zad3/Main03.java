package pl.coderslab.advanced.functionalinterfaces.zad3;

import pl.coderslab.advanced.functionalinterfaces.zad1.Filter;
import pl.coderslab.advanced.functionalinterfaces.zad1.IntegerFilter;
import pl.coderslab.advanced.functionalinterfaces.zad2.IntegerTransform;
import pl.coderslab.advanced.functionalinterfaces.zad2.Transform;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main03 {

    public static void main(String[] args) {
        List<Integer> fibonaci = Arrays.asList(1, 2, 3, 5, 8, 13, 21, 34);
        IntegerFilter integerFilter = new IntegerFilter();
        IntegerTransform integerTransform = new IntegerTransform();
        List<Integer> list = create(fibonaci, integerFilter, integerTransform);
        System.out.println(list);
        List<Integer> anonymusFunctionList = create(fibonaci, integer -> integer < 20, integer -> integer - 10);
        System.out.println(anonymusFunctionList);

    }

    static <T, S> List<T> create(List<S> src, Filter<S> f, Transform<T, S> t) {
        List<T> createdList = new ArrayList<>();
        for (S s : src) {
            if (f.check(s)) {
                createdList.add(t.transform(s));
            }
        }

        return createdList;
    }
}
