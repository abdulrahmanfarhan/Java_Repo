package chapter11.InheritanceAndPolymorphism.people;

public class Staff extends Employee {

    private String title;

    public Staff() {
    }

    @Override
    public String toString() {
        return super.toString() + " - Staff{" + "title=" + title + '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
