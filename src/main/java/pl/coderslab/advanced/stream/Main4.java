package pl.coderslab.advanced.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main4 {

    public static void main(String[] args) {
        List<String> string = Arrays.asList("Adam", "Franek", "Józef", "Antoni", "Ewa", "Krzysztof", "Cecylia");
///1
        string
                .stream()
                .mapToInt(String::length)
                .forEach(System.out::println);

///2
        List<String> sortedStrings = string
                .stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedStrings);

        ////3

        string
                .stream()
                .filter(str -> str.contains("c"))
                .forEach(System.out::println);


        int sum = string
                .stream()
                .mapToInt(str -> str.length())
                .sum();
        System.out.println(sum);

        ////Dokończenie zadań w przyszłą sobotę

    }
}
