package chapter10.ObjectOrientedThinking.Course;

public class Test {

    public static void main(String[] args) {
        Course pop = new Course("POP");
        Course oop = new Course("OOP");
        pop.addStudents("Abdulrahman");
        pop.addStudents("Omar");
        pop.addStudents("mohamad");
        pop.addStudents("Ahmad");
        pop.addStudents("Amjad");
        pop.addStudents("hamza");

        oop.addStudents("Abdulrahman");
        oop.addStudents("mazen");
        oop.addStudents("maher");
        oop.addStudents("osamo");
        oop.addStudents("memo");
        oop.addStudents("ata");

        pop.dropStudent("mohamad");
        oop.dropStudent("memo");

        int numberOfPOPStudents = pop.getNumberOfStudents();
        int numberOfOOPStudents = oop.getNumberOfStudents();
        System.out.println("The course \'" + pop.getCourseName() + "\' has a \'" + pop.getNumberOfStudents() + "\' students!");
        printStudents(pop);
        System.out.println("The course \'" + oop.getCourseName() + "\' has a \'" + oop.getNumberOfStudents() + "\' students!");
        printStudents(oop);
    }

    public static void printStudents(Course c) {
        String students[] = c.getStudents();
        System.out.println("------------------------");
        for (int i = 0; i < c.getNumberOfStudents(); i++) {
            System.out.println("The Students no\'" + (i + 1) + "\' :- " + students[i] + ".");
        }
        System.out.println("------------------------");
    }
}
