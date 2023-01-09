package pl.coderslab.advanced.abstractclass;

public class CarNew implements VehicleNew{

    public String carName;

    public CarNew(String carName){
        this.carName=carName;
    }

    @Override
    public String name() {
        return this.carName;
    }
}
