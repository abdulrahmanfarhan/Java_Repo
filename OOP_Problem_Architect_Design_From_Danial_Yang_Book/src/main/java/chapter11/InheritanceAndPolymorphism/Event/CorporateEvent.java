package chapter11.InheritanceAndPolymorphism.Event;

import java.util.ArrayList;
import java.util.Scanner;

public class CorporateEvent extends Event {

    private String companyName;
    private int noOfSession;
    private ArrayList<Planner> planners = new ArrayList<>();

    public CorporateEvent() {
        super();
        setCompanyName("default");
        setNoOfSession(3);
    }

    public CorporateEvent(String name, int id, String location, String companyName, int noOfSession) {
        super(name, id, location);
        setCompanyName(companyName);
        setNoOfSession(noOfSession);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if (companyName.length() >= 5) {
            this.companyName = companyName;
        } else {
            System.out.println("The company name must be at least 5 charachter!");
        }
    }

    public int getNoOfSession() {
        return noOfSession;
    }

    public void setNoOfSession(int noOfSession) {
        if (noOfSession >= 3 && noOfSession <= 10) {
            this.noOfSession = noOfSession;
        }
    }

    public ArrayList<Planner> getPlanners() {
        return planners;
    }

    public void addPlanner() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the ID:");
        int id = s.nextInt();
        System.out.println("Enter the Name:");
        String name = s.nextLine();
        System.out.println("Enter the Phone:");
        int phone = s.nextInt();
        Planner p = new Planner(id, name, phone);
    }

    public void addPlanner(int id, String name, int phone) {
        Planner p = new Planner(id, name, phone);
        planners.add(p);
    }

    @Override
    public double eventFee() {
        double fee = 0;
        switch (planners.size()) {
            case 3:
                fee = super.eventFee() + 150;
                break;
            case 6:
                fee = super.eventFee() + 300;
                break;
            case 10:
                fee = super.eventFee() + 500;
                break;
        }
        return fee;
    }

    @Override
    public String toString() {
        String s = super.toString();
        return s + "\nCorporateEvent{" + "companyName=" + companyName + ", noOfSession=" + noOfSession + ", planners=" + planners + '}';
    }

}
