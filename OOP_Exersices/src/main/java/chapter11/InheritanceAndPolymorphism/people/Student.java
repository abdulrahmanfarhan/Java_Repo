package chapter11.InheritanceAndPolymorphism.people;

public class Student extends Person {

    public final int FRESHMAN = 0;
    public final int SOPHOMORE = 1;
    public final int JUNIOR = 2;
    public final int SENIOR = 3;

    private int calssStatus;

    public Student() {
    }

    public Student(int classStatus) {
        this.calssStatus = classStatus;
    }

    @Override
    public String toString() {
        String classStatus2;
        switch (calssStatus) {
            case 0:
                classStatus2 = "FRESHMAN";
                break;
            case 1:
                classStatus2 = "SOPHOMORE";
                break;
            case 2:
                classStatus2 = "JUNIOR";
                break;
            case 3:
                classStatus2 = "SENIOR";
                break;
            default:
                classStatus2 = "SENIOR";
                break;
        }
        return super.toString() + "- Student{" + "calssStatus=" + classStatus2 + '}';
    }

    public int getCalssStatus() {
        return calssStatus;
    }

    public void setCalssStatus(int calssStatus) {
        this.calssStatus = calssStatus;
    }

}
