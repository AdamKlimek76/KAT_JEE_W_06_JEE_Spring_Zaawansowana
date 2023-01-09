package pl.coderslab.advanced.abstractclass;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String [] args){

        Car sportCar = new Car(200, "porsche", "m3");
        System.out.println(sportCar);
        System.out.println(sportCar.getMaxSpeed());

        Train train = new Train(120, "Wolny", 100);
        System.out.println(train);

        Vehicle sportCar1 = new Car(200, "auto", "male");
        Vehicle train1=new Train(120, "pociag", 50);

        Vehicle[]vehicles={sportCar1, train1};
        for (int i = 0; i <vehicles.length ; i++) {
            System.out.println(vehicles[i]);
        }

        Shape rectangle = new Rectangle(1, 2, 3, 4);
        Shape square=new Square(2, 4);
        Shape circuit = new Circuit(5);


        List<Shape>shapeList=new ArrayList<>();
        shapeList.add(rectangle);
        shapeList.add(square);
        shapeList.add(circuit);

        for(Shape shape : shapeList){
            shape.calculateArea();
            shape.calculateCircuit();
            System.out.println(shape);
        }

        shapeList.stream().forEach(System.out::println);

        CarNew carNew1=new CarNew("auto 1");
        CarNew carNew2=new CarNew("auto 2");

        List<String>carNewList=new ArrayList<>();
        carNewList.add(carNew1.name());
        carNewList.add(carNew2.name());

        carNewList.forEach(System.out::println);

    }

}
