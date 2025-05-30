package chapter11.InheritanceAndPolymorphism.Event;

public class Event {

    private String name;
    private int id;
    private String location;

    public Event() {
        setName("General");
        setId(000);
        setLocation("Not defined");
    }

    public Event(String name, int id, String location) {
        setName(name);
        setId(id);
        setLocation(location);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toLowerCase();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0 && id < 999) {
            this.id = id;
        }
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        switch (location.toLowerCase()) {
            case "amman":
            case "irbid":
            case "aqaba":
                this.location = location.toLowerCase();
                break;
            default:
                System.out.println("Error in location name!");
        }
    }

    public double eventFee() {
        double fee = 0;
        switch (getLocation()) {
            case "amman":
                fee = 1000;
                break;
            case "irbid":
                fee = 500;
                break;
            case "aqaba":
                fee = 700;
                break;
        }
        return fee;
    }

    @Override
    public String toString() {
        return "Event{" + "name=" + name + ", id=" + id + ", location=" + location + '}';
    }
}
