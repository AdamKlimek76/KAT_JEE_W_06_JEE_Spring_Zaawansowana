package pl.coderslab.advanced.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Main1 {

    public static void main(String[] args) {
        //lista niemodyfikowalna
        List<String> names = List.of("ala", "arek", "julia", "marek", "marek", "sebastian", "ala", "franek", "julia");

        names
                .stream()
                .filter(name -> name.startsWith("a") || name.startsWith("s"))
                .sorted()
                .forEach(System.out::println);

        List<String> unique5Strings = names
                .stream()
                .filter(name -> name.length() == 5)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(unique5Strings);

        String string = names
                .stream()
                .map(str -> str.substring(0, 3))
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(string);

    }


}
