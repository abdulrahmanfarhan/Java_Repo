package cabAndCabbie.models;

public class Truck implements Vehicle{
    private final String driverName;

    public Truck(Driver driver) {
        this.driverName = driver.getName();
    }

    @Override
    public void startEngine() {
        System.out.println("The truck is turned on");
    }

    @Override
    public void stopEngine() {
        System.out.println("The truck is turned off");

    }
}
