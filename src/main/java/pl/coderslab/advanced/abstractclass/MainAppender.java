package pl.coderslab.advanced.abstractclass;

public class MainAppender {

    public static void main(String[] args) {

        String[] values = {"a", "b", "c", "a"};
        BackAppender backAppender = new BackAppender();
        UniqueAppender uniqueAppender = new UniqueAppender();
        for (String value : values) {
            backAppender.append(value);
            uniqueAppender.append(value);
        }
        System.out.println(backAppender.getValue()); // wydrukuje: abca
        System.out.println(uniqueAppender.getValue()); // wydrukuje: abc

    }

}
