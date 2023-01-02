package pl.coderslab.advanced.interfaces;

public class Person implements Movable {
    @Override
    public void start() {
        System.out.println("Człowiek idzie");
    }

    @Override
    public void stop() {

    }
}
