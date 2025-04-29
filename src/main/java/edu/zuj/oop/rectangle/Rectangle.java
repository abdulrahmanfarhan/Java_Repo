package edu.zuj.oop.rectangle;

public class Rectangle {

    private double length;
    private double width;
    public String color;
    public boolean border;

    public Rectangle() {
        this(0.1, 0.1, "Not defined", false);
    }

    public Rectangle(double length, double width, String color, boolean border) {
        setAllData(length, width, color, border);
    }

    public void setAllData(double length, double width, String color, boolean border) {
        setDimention(length, width);
        this.color = color;
        this.border = border;
    }

    public void setDimention(double length, double width) {
        if (length >= 0.1) {
            this.length = length;
        } else {
            System.out.println("Error in length");
        }
        if (width >= 0.1) {
            this.width = width;
        } else {
            System.out.println("Error in width");
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return (this.length) * (this.width);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + ", color=" + color + ", border=" + border + '}';
    }

}
