package chapter10.ObjectOrientedThinking.people;

public class Faculty extends Employee {

    private String officeHour;
    private String rank;

    public Faculty() {
    }

    @Override
    public String toString() {
        return super.toString() + " - Faculty{" + "officeHour=" + officeHour + ", rank=" + rank + '}';
    }

    public String getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHours(String officeHour) {
        this.officeHour = officeHour;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

}
