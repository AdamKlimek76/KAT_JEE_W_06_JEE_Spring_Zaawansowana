package pl.coderslab.advanced.abstractclass;

public class Square extends Shape {

    private double a;
    private double b;

    public Square(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double calculateArea() {
        this.area = a * b;
        return this.area;
    }

    @Override
    double calculateCircuit() {
        this.circuit = a + b;
        return this.circuit;
    }

    public String toString (){
        return "Prostokąt o bokach " + this.a + " " + this.b + " ma pole równe = " + this.area +
                " i obwód równy = " + this.circuit;
    }
}
