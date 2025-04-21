package Time;

public class Test {

    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(231099965);
        Time t3 = new Time(22, 42, 55);
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
    }
}
