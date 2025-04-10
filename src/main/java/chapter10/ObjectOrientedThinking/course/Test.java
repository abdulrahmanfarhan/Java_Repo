package chapter10.ObjectOrientedThinking.course;

/**
 *
 * @author Abdulrahman
 */
public class Test {

    public static void main(String[] args) {
        Course Java = new Course("Java");
        Java.addStudent("Abdulrahmn");
        Java.addStudent("Mohamad");
        Java.addStudent("omar");
        Java.addStudent("Osama");
        Java.addStudent("Ahmad");

        Course Spring = new Course("JavaFX");
        Spring.addStudent("a");
        Spring.addStudent("b");
        Spring.addStudent("c");
        Spring.addStudent("d");
        Spring.addStudent("e");
        Spring.addStudent("f");
        Spring.addStudent("g");
        Spring.addStudent("h");

        String studentA[] = Java.getStudents();
        System.out.println("The students of thes course:");
        for (int i = 0; i < Java.getNumberOfObject(); i++) {
            System.out.println((i + 1) + " : " + studentA[i]);
        }

    }
}
