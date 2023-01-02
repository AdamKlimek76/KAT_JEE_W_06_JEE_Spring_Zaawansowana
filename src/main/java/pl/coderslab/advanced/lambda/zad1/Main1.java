package pl.coderslab.advanced.lambda.zad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputs = new ArrayList<>();
        for (; ; ) {
            String input = scanner.next();
            if ("break".equalsIgnoreCase(input)) {
                break;
            }
            inputs.add(input);
        }

        System.out.println(inputs);

        Collections.sort(inputs, (o1, o2) -> o1.compareToIgnoreCase(o2));

        System.out.println("sorted");
        inputs.forEach(input -> System.out.println(input));


    }
}
