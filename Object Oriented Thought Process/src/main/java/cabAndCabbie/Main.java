package cabAndCabbie;

import cabAndCabbie.models.Driver;
import cabAndCabbie.models.Taxi;
import cabAndCabbie.models.Truck;
import cabAndCabbie.models.Vehicle;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Abdulrahman");

        Taxi taxi = new Taxi(driver);
        Truck truck = new Truck(driver);

        driver.drive(taxi);
        driver.drive(truck);

    }
}
