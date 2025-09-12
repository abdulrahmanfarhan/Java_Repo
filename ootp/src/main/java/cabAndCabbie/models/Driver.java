package cabAndCabbie.models;

public class Driver {
    private final String name;

    public Driver(String name) {
        this.name = name;
    }

    public void drive(Vehicle vehicle){
        vehicle.startEngine();
        System.out.println("Driver name: \"" + name + "\"");
        vehicle.stopEngine();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cabbie{name='" + name + "'}";
    }
}
