package pl.coderslab.advanced.abstractclass;

public class Rectangle extends Shape {
    private double a;
    private double b;
    private double c;
    private double h;

    public Rectangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    double calculateArea() {
        this.area  = a * h / 2;
        return this.area;
    }

    @Override
    double calculateCircuit() {
        this.circuit= a + b + c;
        return this.circuit;
    }

public String toString(){
        return "Trójkąt o bokach " + this.a + " " + this.b + " " + this.c + " " + this.h  +
                " ma pole równe = " + this.area + " i obwód równy = " + this.circuit;

}


}
