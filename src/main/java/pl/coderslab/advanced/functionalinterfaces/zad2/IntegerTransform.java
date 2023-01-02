package pl.coderslab.advanced.functionalinterfaces.zad2;

public class IntegerTransform implements Transform<Integer, Integer> {

    @Override
    public Integer transform(Integer integer) {
        return integer - 1;
    }
}
