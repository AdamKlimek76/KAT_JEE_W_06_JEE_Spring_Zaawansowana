package pl.coderslab.advanced.abstractclass;

public class SquareNew extends ShapeNew {

    public double firstSide;
    public double secondSide;

    public SquareNew(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double calculateArea() {
        this.area = firstSide * secondSide;
        return this.area;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public double calculateCircuit() {
        this.circuit=firstSide+secondSide;
        return this.circuit;
    }
}
