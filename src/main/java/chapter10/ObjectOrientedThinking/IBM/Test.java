package chapter10.ObjectOrientedThinking.IBM;

/**
 *
 * @author Abdulrahman
 */
public class Test {

    public static void main(String[] args) {
        Bmi bmi1 = new Bmi("mo", 18, 145, 70);
        System.out.println("The Bmi of " + bmi1.getName() + " is " + bmi1.getBMI() + " and status is " + bmi1.getStatus() + " because the weight is " + bmi1.getWeight() + " and the height is " + bmi1.getHeight());
        Bmi bmi2 = new Bmi("Omar",215, 70);
        System.out.println("The Bmi of " + bmi2.getName() + " is " + bmi2.getBMI() + " and status is " + bmi2.getStatus() + " because the weight is " + bmi2.getWeight() + " and the height is " + bmi2.getHeight());

    }

}
