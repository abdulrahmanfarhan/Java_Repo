package chapter9.objectsClasses.Location;

/**
 *
 * @author Abdulrahman
 */
public class Test {

    public static void main(String[] args) {
        double array[][] = Location.Creat2DArray();
        Location.fillArray(array);
        Location L = Location.locateLargest(array);
        System.out.println(L.toString());
    }
}
