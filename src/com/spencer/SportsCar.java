package com.spencer;

public class SportsCar extends Car {

    private int zeroToSizty;
    private int topSpeed;

    public SportsCar() {
        this(true, 6, 3, 180);
    }

    public SportsCar(boolean hasPowerSteering, int gears, int zeroToSizty, int topSpeed) {
        super(hasPowerSteering, gears);
        this.zeroToSizty = zeroToSizty;
        this.topSpeed = topSpeed;
    }

    public int getZeroToSizty() {
        return zeroToSizty;
    }

    public void setZeroToSizty(int zeroToSizty) {
        this.zeroToSizty = zeroToSizty;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}
