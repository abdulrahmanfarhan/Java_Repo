package edu.zuj.oop.elevator;

public class Elevator {

    private char speed;
    //F for fast, S for slow
    private int floors;
    //number of floors the elevator reaches, must be between 1 and 20

    public Elevator() {
        this('F', 4);
    }

    public Elevator(char speed, int floors) {
        setSpeed(speed);
        setFloors(floors);
    }

    public char getSpeed() {
        return speed;
    }

    public void setSpeed(char speed) {
        if (speed == 'S' || speed == 'F') {
            this.speed = speed;
        }
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        if (floors > 1 && floors < 20) {
            this.floors = floors;
        }
    }

    public double getSpeedCost() {
        double cost;
        switch (this.speed) {
            case 'F':
                cost = 3000;
                break;
            case 'S':
                cost = 1500;
                break;
            default:
                cost = 0;
                break;
        }
        return cost;
    }

    public double getFloorCost() {
        double cost;
        if (floors <= 5) {
            cost = floors * 2000;
        } else if (floors > 5 && floors <= 10) {
            cost = floors * 1500;
        } else {
            cost = floors * 1000;
        }
        return cost;
    }

    public double getTotalCost() {
        return getFloorCost() + getSpeedCost() + 100;
    }

    @Override
    public String toString() {
        return "Elevator{" + "speed=" + speed + ", floors=" + floors + '}';
    }

}
