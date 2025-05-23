package edu.zuj.oop.carPark;

public class CarPark {

    private String parkZone;
    private int time;
    private char type;

    public CarPark() {
        this("Zone B", 1, 'R');
    }

    public CarPark(String parkZone, int time, char type) {
        setParkZone(parkZone);
        setTime(time);
        setType(type);
    }

    public String getParkZone() {
        return parkZone;
    }

    public void setParkZone(String parkZone) {
        if (parkZone.equalsIgnoreCase("Zone A") || parkZone.equalsIgnoreCase("Zone B")) {
            this.parkZone = parkZone.toUpperCase();
        }
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        if (time > 0) {
            this.time = time;
        }
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        if (type == 'R' || type == 'r') {
            this.type = 'R';
        } else if (type == 'V' || type == 'v') {
            this.type = 'V';
        }
    }

    public double calculateFees() {
        double fees = 0;
        switch (this.parkZone) {
            case "Zone A":
                fees = getTime() * 3;
                break;
            case "Zone B":
                fees = getTime() * 2;
                break;
            case "Zone C":
                fees = getTime() * 1;
                break;
        }
        switch (this.getType()) {
            case 'R':
                fees += 1.5;
                break;
            case 'V':
                fees += 2.5;
                break;
        }
        return fees;
    }

    @Override
    public String toString() {
        return "CarPark{" + "parkZone=" + parkZone + ", time=" + time + ", type=" + type + '}';
    }

}
