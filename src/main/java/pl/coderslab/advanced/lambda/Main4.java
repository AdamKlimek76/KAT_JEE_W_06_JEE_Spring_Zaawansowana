package pl.coderslab.advanced.lambda;

import java.util.function.Predicate;

public class Main4 {

    public static void main(String[] args) {
        Operation<Integer> square = x -> x * x;
        System.out.println(square.compute(4));
        Operation<Double> squareRoot = x -> Math.sqrt(x);
        System.out.println(squareRoot.compute(16.0));

        Operation<Double> squareRootMethodreference = Math::sqrt;
        System.out.println(squareRootMethodreference.compute(16.0));

        Operation<Integer> factorial = x -> {
            int result=1;

            for (int i = 1; i < x + 1; i++) {
                result*=i;
            }
            return result;
        };
        System.out.println(factorial.compute(4));

    }

}
