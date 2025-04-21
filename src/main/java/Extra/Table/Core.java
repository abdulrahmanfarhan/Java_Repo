package Extra.Table;

/**
 *
 * @author Abdulrahman
 */
public class Core {

    private String name;
    private String name1;
    private String name2;
    private String name3;
    private int age;
    private double salary;
    public final static int pad = 16;

    public Core(String name, int age, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public Core(String name1, String name2, String name3) {
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
    }

    public void print() {
        System.out.printf("|%s|%s|%s|%n", center(name), center(age), center(salary));
    }

    public void print2() {
        System.out.printf("|%s|%s|%s|%n", center(name1), center(name2), center(name3));
    }

    private String center(String text) {
        int padding = pad - text.length();
        int padLeft = padding / 2;
        int padRight = padding - padLeft;
        return " ".repeat(Math.max(padLeft, 0)) + text + " ".repeat(Math.max(padRight, 0));
    }

    private String center(int number) {
        return center(Integer.toString(number));
    }

    private String center(double number) {
        return center(String.format("%.2f", number));
    }
}
