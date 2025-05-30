package chapter11.InheritanceAndPolymorphism.Contest;

public class Team {

    private int id;
    private String name;
    private int member;

    public Team() {
        setId(11);
        setMember(3);
        setName("Not defined");
    }

    public Team(int id, String Name, int member) {
        setId(id);
        setName(Name);
        setMember(member);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            int firstDigit = id;
            while (firstDigit >= 10) {
                firstDigit /= 10;
            }
            if (firstDigit == 1) {
                this.id = id;
            } else {
                System.out.println("The first digit must be 1");
            }
        } else {
            System.out.println("The id must not be 0 or negative");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            if (name.length() <= 10) {
                if (name.startsWith("@")) {
                    this.name = name;
                } else {
                    System.out.println("The name must start with '@'");
                }
            } else {
                System.out.println("The name must contain at most 10 characters");
            }
        } else {
            System.out.println("The name must not be null");
        }
    }

    public int getMember() {
        return member;
    }

    public void setMember(int member) {
        if (member >= 3 && member <= 5) {
            this.member = member;
        }
    }

    public String getTeamInfo() {
        String separator = "======================================================================";
        return "\n"
                + "Team ID     : " + id + "\n"
                + "Team Name   : " + name + "\n"
                + "Team Member : " + member + "\n"
                + separator;
    }

    @Override
    public String toString() {
        return getTeamInfo();
    }
}
