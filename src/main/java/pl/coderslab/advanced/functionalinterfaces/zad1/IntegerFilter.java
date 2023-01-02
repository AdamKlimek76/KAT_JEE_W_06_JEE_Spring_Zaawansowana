package pl.coderslab.advanced.functionalinterfaces.zad1;

import java.io.File;

public class IntegerFilter implements Filter<Integer> {
    @Override
    public boolean check(Integer integer) {
        return integer<20;
    }
}
