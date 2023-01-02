package pl.coderslab.advanced.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main2 {

    public static void main(String[] args) {
        List<Object>objects= Arrays.asList(new Object(), 3, 2.3, "napis", 5, "str", 4.3);
        displayFiltered(objects, obj -> obj instanceof String);
        displayFiltered(objects, new Predicate<Object>() {
            @Override
            public boolean test(Object o) {
                return o instanceof String;
            }
        });
    }

    static <T> void  displayFiltered(List<T>src, Predicate<T>filter){
        for(T object : src){
            if(filter.test(object)){
                System.out.println(object);
            }
        }
    }

}
