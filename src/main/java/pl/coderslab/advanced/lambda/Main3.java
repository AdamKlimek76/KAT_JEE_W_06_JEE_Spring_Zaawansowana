package pl.coderslab.advanced.lambda;

import java.util.List;
import java.util.function.Predicate;

public class Main3 {

    public static void main(String[] args) {
        displayIfInteger("str", (Predicate<Object>) object -> object instanceof Integer);
        displayIfInteger(5, (Predicate<Object>) object -> object instanceof Integer);

    }

    static <T> void  displayIfInteger(T param, Predicate<T> filter){
            if(filter.test(param)){
                System.out.println(param);
            }
        }
}
