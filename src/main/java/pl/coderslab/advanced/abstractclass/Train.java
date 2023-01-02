package pl.coderslab.advanced.abstractclass;

public class Train extends Vehicle {

    private final int trackWidth;

    public Train(Integer maxSpeed, String model, int trackWidth) {
        super(maxSpeed, model);
        this.trackWidth = trackWidth;
    }

    public int getTrackWidth() {
        return trackWidth;
    }

}
