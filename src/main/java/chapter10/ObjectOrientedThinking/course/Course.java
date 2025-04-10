package chapter10.ObjectOrientedThinking.course;

/**
 *
 * @author Abdulrahman
 */
public class Course {

    private String courseName;
    private String students[] = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCouseName() {
        return this.courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent() {
        /* ---------- */
    }

    public String[] getStudents() {
        return students;
    }
    
    public int getNumberOfObject(){
        return this.numberOfStudents;
    }
}
