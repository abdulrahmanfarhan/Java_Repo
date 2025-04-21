package Extra.Table;

/**
 *
 * @author Abdulrahman
 */
public class Test {

    public static void main(String[] args) {
        Core rowy = new Core("Name", "Age", "Salary");
        Core row1 = new Core("Abood", 20, 0.0);
        Core rowx = new Core("----------------", "----------------", "----------------");
        Core row2 = new Core("Abdulrahman", 35, 1000);
        Core row3 = new Core("Farhan", 50, 10000);
        Core row4 = new Core("Mr.Farhan", 60, 70000);

        rowx.print2();
        rowy.print2();
        rowx.print2();
        row1.print();
        rowx.print2();
        row2.print();
        rowx.print2();
        row3.print();
        rowx.print2();
        row4.print();
        rowx.print2();
    }
}
