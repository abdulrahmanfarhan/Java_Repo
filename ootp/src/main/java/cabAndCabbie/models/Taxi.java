package cabAndCabbie.models;

public class Taxi implements Vehicle{
    private final String driverName;

    public Taxi(Driver driver) {
        this.driverName = driver.getName();
    }

    @Override
    public void startEngine() {
        System.out.println("The Taxi is turned on");
    }

    @Override
    public void stopEngine() {
        System.out.println("The Taxi is turned off");

    }
}
