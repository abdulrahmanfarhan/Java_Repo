package chapter11.InheritanceAndPolymorphism.Event;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CorporateEvent c = makeEvent();
        System.out.println("===========================");
        System.out.println("We are fill 5 planners now");
        System.out.println("===========================");
        for (int i = 0; i < 5; i++) {
            fillPlanner(c);
        }
        printEvent(c);
    }

    public static CorporateEvent makeEvent() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = s.nextLine();
        System.out.println("Enter the id:");
        int id = s.nextInt();
        s.nextLine();
        System.out.println("Enter the location:");
        String location = s.nextLine();
        System.out.println("Enter the company name:");
        String compannyName = s.nextLine();
        System.out.println("Enter the number Of Sessions:");
        int noOfSession = s.nextInt();
        return new CorporateEvent(name, id, location, compannyName, noOfSession);
    }

    public static void fillPlanner(CorporateEvent c) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the ID:");
        int id = s.nextInt();
        s.nextLine(); //to catch the enter click agter type int
        System.out.println("Enter the Name:");
        String name = s.nextLine();
        System.out.println("Enter the Phone:");
        int phone = s.nextInt();
        c.addPlanner(id, name, phone);
    }

    public static void printEvent(CorporateEvent c) {
        ArrayList<Planner> planners = c.getPlanners();
        System.out.println(c.toString());
        System.out.println("=====================");
        for (int i = 0; i < planners.size(); i++) {
            System.out.println(planners.get(i).toString());
        }
    }
}
