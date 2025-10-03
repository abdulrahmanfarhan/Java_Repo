package chapter11.InheritanceAndPolymorphism.Event;

public class Planner {

    private int ID;
    private String name;
    private int phone;

    public Planner() {
        setID(1);
        setName("Not Defined");
        setPhone(798888888);
    }

    public Planner(int ID, String name, int phone) {
        setID(ID);
        setName(name);
        setPhone(phone);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        if (ID > 0 && ID <= 111) {
            this.ID = ID;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("The name must not be empty!");
            return;
        }
        if (name.length() > 15) {
            System.out.println("The name length must not be longer than 15");
            return;
        }
        if (!name.startsWith("P.")) {
            System.out.println("the name must be started with \".P\" !");
        }
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        if (phone < 0) {
            System.out.println("Phone number must be positive.");
            return;
        }

        String str = String.valueOf(phone);

        if (str.length() != 9) {
            System.out.println("Phone number must be exactly 9 digits.");
            return;
        }

        if (str.startsWith("0")) {
            System.out.println("Phone number must not start with 0.");
            return;
        }

        this.phone = phone;
    }

    public String getPlannerInfo() {
        return "======================================================================\n"
                + "Planner ID: " + ID + ", Name: " + name + ", Phone: " + phone
                + "======================================================================\n";
    }

    @Override
    public String toString() {
        return getPlannerInfo();
    }
}
