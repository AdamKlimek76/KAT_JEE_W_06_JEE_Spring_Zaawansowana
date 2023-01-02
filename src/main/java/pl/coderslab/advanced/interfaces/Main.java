package pl.coderslab.advanced.interfaces;

public class Main {
    public static void main(String[] args) {
        Movable[] moveableTab = new Movable[3];
        Car car = new Car();
        Cat cat = new Cat();
        Person person = new Person();
        //String [] strings={"a", "b", "c"};
        moveableTab[0] = car;
        moveableTab[1] = cat;
        moveableTab[2] = person;
        for (Movable movable : moveableTab) {
            movable.start();
        }
    }
}
