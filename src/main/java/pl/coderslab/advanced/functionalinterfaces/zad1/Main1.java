package pl.coderslab.advanced.functionalinterfaces.zad1;

import java.util.Arrays;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {
        List<Integer> fibonaci = Arrays.asList(1, 2, 3, 5, 8, 13, 21, 34);
        IntegerFilter integerFilter = new IntegerFilter();
        printList(fibonaci, integerFilter);
        printList(fibonaci, new Filter<Integer>() {
            @Override
            public boolean check(Integer integer) {
                return integer > 20;
            }
        });

        printList(fibonaci, integer -> integer == 21);
    }

    static <T> void printList(List<T> src, Filter<T> f) {
        for (T s : src) {
            if (f.check(s)) {
                System.out.println(s);
            }
        }
    }


}
