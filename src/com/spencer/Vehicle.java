package com.spencer;

public class Vehicle {

    private int speed;

    public Vehicle() {
        this(0);
    }

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void increaseSpeed() {
        this.speed += 1;
        System.out.println("Current Speed = " + (this.speed));
    }

    public void decreaseSpeed() {
        this.speed -= 1;
        System.out.println("Current Speed = " + this.speed);
    }
}
