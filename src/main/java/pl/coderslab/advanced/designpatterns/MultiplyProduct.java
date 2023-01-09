package pl.coderslab.advanced.designpatterns;

public class MultiplyProduct implements ProductNew{
    @Override
    public Integer operate(int a, int b) {
        return a*b;
    }
}
