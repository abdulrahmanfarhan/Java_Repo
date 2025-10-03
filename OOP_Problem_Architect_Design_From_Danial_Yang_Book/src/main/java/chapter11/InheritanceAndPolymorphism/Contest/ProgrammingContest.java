package chapter11.InheritanceAndPolymorphism.Contest;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgrammingContest extends Contest {

    private String language;
    private int numberOfProblems;
    private ArrayList<Team> Teams = new ArrayList<>();
    private static Scanner s = new Scanner(System.in);

    public ProgrammingContest() {
        setLanguage("java");
        setNumberOfProblems(3);
    }

    public ProgrammingContest(String language, int numberOfProblems, String name, char level, String location, int id, String Name, int member) {
        super(name, level, location);
        setLanguage(language);
        setNumberOfProblems(numberOfProblems);
        Team t = new Team(id, Name, member);
        this.Teams.add(t);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        switch (language.toLowerCase()) {
            case "c++":;
            case "java":;
            case "python":
                this.language = language;
                break;
            default:
                System.out.println("The language must be (c++, java, python)");
        }
    }

    public int getNumberOfProblems() {
        return numberOfProblems;
    }

    public void setNumberOfProblems(int numberOfProblems) {
        this.numberOfProblems = numberOfProblems;
    }

    public ArrayList<Team> getTeams() {
        return Teams;
    }

    public void addTeam() {
        System.out.print("Enter the ID :");
        int id = s.nextInt();
        s.nextLine(); //to catch the enter click after nextInt()
        System.out.print("Enter the name:");
        String name = s.nextLine();
        System.out.print("Enter the member");
        int member = s.nextInt();
        Team t = new Team(id, name, member);
        Teams.add(t);
    }

    public void addTeam(int id, String name, int member) {
        Team t = new Team(id, name, member);
        Teams.add(t);
    }

    @Override
    public double regFee() {
        System.out.print("If the team contain the students? (Y/N):");
        char ch = s.next().charAt(0);
        double fee = 0;
        switch (Character.toUpperCase(ch)) {
            case 'Y':
                fee = super.regFee() - 10;
                break;
            case 'N':
                fee = 100;
                break;
            default:
                System.out.println("Error input!");
        }
        return fee;
    }

    @Override
    public String toString() {
        String r = super.toString();
        return r + "\nProgrammingContest{" + "language=" + language + ", numberOfProblems=" + numberOfProblems + ", Teams=" + Teams + '}';
    }

}
