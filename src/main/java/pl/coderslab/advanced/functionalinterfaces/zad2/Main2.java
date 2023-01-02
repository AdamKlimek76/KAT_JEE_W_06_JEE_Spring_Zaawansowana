package pl.coderslab.advanced.functionalinterfaces.zad2;

import pl.coderslab.advanced.functionalinterfaces.zad1.Filter;
import pl.coderslab.advanced.functionalinterfaces.zad1.IntegerFilter;

import java.util.Arrays;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        List<Integer> fibonaci = Arrays.asList(1, 2, 3, 5, 8, 13, 21, 34);
        IntegerFilter integerFilter = new IntegerFilter();
        IntegerTransform integerTransform = new IntegerTransform();
        printList(fibonaci, integerFilter, integerTransform);
        printList(fibonaci, integerFilter, new Transform<Integer, Integer>() {
            @Override
            public Integer transform(Integer integer) {
                return integer - 2;
            }
        });

        printList(fibonaci, new Filter<Integer>() {
            @Override
            public boolean check(Integer integer) {
                return integer > 5;
            }
        }, new Transform<Integer, Integer>() {
            @Override
            public Integer transform(Integer integer) {
                return integer - 1;
            }
        });

        printList(fibonaci, integer -> integer < 20, integer -> integer - 10);
    }


    static <T, S> void printList(List<S> src, Filter<S> f, Transform<T, S> t) {
        for (S s : src) {
            if (f.check(s)) {
                System.out.println(t.transform(s));
            }
        }
    }

}
