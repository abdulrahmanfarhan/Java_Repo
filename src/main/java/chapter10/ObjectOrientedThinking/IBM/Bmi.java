package chapter10.ObjectOrientedThinking.IBM;

/**
 *
 * @author Abdulrahman
 */
public class Bmi {

    private String name;
    private int age;
    private double weight;
    private double height;
    public static final double kperb = 0.45359237;
    public static final double mperi = 0.0254;

    public Bmi(String name, int age, double weight, double height) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    public Bmi(String name, double weight, double height) {
        this(name, 20, weight, height);
    }

    public double getBMI() {
        double bmi = weight * kperb / ((height * mperi) * (height * mperi));
        return Math.round(bmi * 100) / 100.0;
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getHeight() {
        return this.height;
    }
}
