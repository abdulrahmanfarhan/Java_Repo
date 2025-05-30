package chapter11.InheritanceAndPolymorphism.Contest;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ProgrammingContest p = new ProgrammingContest();
        for (int i = 0; i < 4; i++) {
            System.out.println("fill the team --" + (i + 1) + "--");
            p.addTeam();
            System.out.println("---------------------");
        }
        printTeam4Member(p);
    }

    public static void printTeam4Member(ProgrammingContest p) {
        ArrayList<Team> teams = p.getTeams();
        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i).getMember() == 4) {
                System.out.println(teams.get(i).toString());
            }
        }
    }
}
