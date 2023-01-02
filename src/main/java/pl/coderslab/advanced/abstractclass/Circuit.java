package pl.coderslab.advanced.abstractclass;

public class Circuit extends Shape {

    private double r;

    public Circuit(double r) {
        this.r = r;
    }

    @Override
    double calculateArea() {
        this.area = r * r * 3.14;
        return this.area;
    }

    @Override
    double calculateCircuit() {
        this.circuit = 2 * 3.14 * r;
        return this.circuit;
    }

    public String toString(){
        return "Okrąg o promieniu równym " + this.r + " ma pole równe " + this.area + " i obwód równy = " + this.circuit;
    }
}
