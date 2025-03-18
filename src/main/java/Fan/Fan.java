package Fan;

/**
 *
 * @author Abdulrahman
 */
public class Fan {

    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "Blue";
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        if (speed == SLOW || speed == MEDIUM || speed == FAST) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed! Choose between SLOW (1), MEDIUM (2), or FAST (3).");
        }
    }
    
    public boolean getOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "The fan: color-" + color + ", radius-" + radius + (on ? ", Speed-" + speed : ", The fan is off");
    }

}
