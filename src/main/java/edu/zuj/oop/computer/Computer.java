package edu.zuj.oop.computer;

public class Computer {
    
    private String brand;
    private String processor;
    private int ram;
    
    public Computer() {
        this("Not Specified", "Intel", 8);
    }
    /*
    "The Parameterized constructors will set the class data according to (the user entry)."
    the user entry -> is the passing arguments
    */
    public Computer(int ram) {
        setRam(ram);
    }
    
    public Computer(String brand, String processor, int ram) {
        this.brand = brand;
        this.processor = processor;
        setRam(ram);
    }
    
    public int getRam() {
        return ram;
    }
    
    public void setRam(int ram) {
        if (ram >= 4) {
            this.ram = ram;
        }
    }
    
    public String getProcessor() {
        return processor;
    }
    
    @Override
    public String toString() {
        return "Computer{" + "brand=" + brand + ", processor=" + processor + ", ram=" + ram + '}';
    }
    
}
