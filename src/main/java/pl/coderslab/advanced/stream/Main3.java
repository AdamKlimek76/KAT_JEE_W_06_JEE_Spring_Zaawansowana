package pl.coderslab.advanced.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> otherNumber = numbers
                .stream()
                .filter(n -> n * n - 5 < 20)
                .collect(Collectors.toList());
        System.out.println(otherNumber);
    }


}
