package chapter10.ObjectOrientedThinking.Course;

public class Course {

    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        String[] enrolledStudents = new String[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            enrolledStudents[i] = students[i];
        }
        return enrolledStudents;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void addStudents(String student) {
        if (numberOfStudents == students.length) {
            String newStudents[] = new String[numberOfStudents * 2];
            for (int i = 0; i < students.length; i++) {
                newStudents[i] = students[i];
            }
            students = null;
            students = newStudents;

        }
        this.students[numberOfStudents] = student;
        numberOfStudents++;

    }

    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i] != null && students[i].equalsIgnoreCase(student)) {
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[numberOfStudents - 1] = null;
                numberOfStudents--;
                break;
            }
        }
    }

    public void clear() {
        numberOfStudents = 0;
        String newStudents[] = new String[100];
        students = null;
        students = newStudents;
    }

}
