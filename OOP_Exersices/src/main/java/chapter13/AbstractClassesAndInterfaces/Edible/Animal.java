package chapter13.AbstractClassesAndInterfaces.Edible;

public abstract class Animal {
    private double wight;

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        if (wight >= 0) {
            this.wight = wight;
        } else {
            System.out.println("Error Input!");
        }
    }

    public abstract String sound();
}
