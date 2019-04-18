package com.spencer;

public class Car extends Vehicle {

    private boolean hasPowerSteering;
    private int gears;

    public Car() {
        this(false, 5);
    }

    public Car(boolean hasPowerSteering, int gears) {
        super();
        this.hasPowerSteering = hasPowerSteering;
        this.gears = gears;
    }

    public boolean isHasPowerSteering() {
        return hasPowerSteering;
    }

    public void setHasPowerSteering(boolean hasPowerSteering) {
        this.hasPowerSteering = hasPowerSteering;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }
}
