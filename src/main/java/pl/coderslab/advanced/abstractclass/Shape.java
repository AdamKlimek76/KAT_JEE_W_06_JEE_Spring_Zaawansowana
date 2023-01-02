package pl.coderslab.advanced.abstractclass;

public abstract class Shape {
    protected double area;
    protected double circuit;

    public Shape() {
    }

    abstract double calculateArea();
    abstract double calculateCircuit();

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCircuit() {
        return circuit;
    }

    public void setCircuit(double circuit) {
        this.circuit = circuit;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "area=" + area +
                ", circuit=" + circuit +
                '}';
    }
}
