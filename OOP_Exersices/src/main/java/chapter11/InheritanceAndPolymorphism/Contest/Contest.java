package chapter11.InheritanceAndPolymorphism.Contest;

import java.util.Scanner;

public class Contest {

    private String name;
    private char level;
    private String location;

    public Contest() {
        setName("General");
        setLocation("Not Defines");
    }

    public Contest(String name, char level, String location) {
        this.name = name;
        this.level = level;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public char getLevel() {
        return level;
    }

    public void setLevel(char level) {

        switch (Character.toUpperCase(level)) {
            case 'A':
            case 'B':
            case 'C':
                this.level = level;
                break;
            default:
                System.out.print("Error Input, Enter Valid Char(e.g A,B,C):-");
        }
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double regFee() {
        String location = this.getLocation().toLowerCase();
        int fee = 0;
        switch (this.getLevel()) {
            case 'A':
                if (location.equalsIgnoreCase("Amman")) {
                    fee = 40;
                } else if (location.equalsIgnoreCase("Irbid")) {
                    fee = 20;
                }
                break;
            case 'B':
                if (location.equalsIgnoreCase("Amman")) {
                    fee = 50;
                } else if (location.equalsIgnoreCase("Irbid")) {
                    fee = 25;
                }
                break;
            case 'C':
                if (location.equalsIgnoreCase("Amman")) {
                    fee = 70;
                } else if (location.equalsIgnoreCase("Irbid")) {
                    fee = 35;
                }
                break;
            //thats will better if i handel this with 2D array
        }
        return fee;
    }

    @Override
    public String toString() {
        return "Contest{" + "name=" + name + ", level=" + level + ", location=" + location + '}';
    }

}
