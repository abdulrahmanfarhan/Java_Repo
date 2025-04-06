package chapter9.objectsClasses.Fan;

/**
 *
 * @author Abdulrahman
 */
public class TestFan {

    public static void main(String[] args) {
        Fan f1 = new Fan();
        f1.setOn(true);
        f1.setRadius(10);
        f1.setColor("Yello");
        Fan f2 = new Fan();
        f2.setOn(false);
        f2.setRadius(5);
        f2.setColor("blue");
        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}
