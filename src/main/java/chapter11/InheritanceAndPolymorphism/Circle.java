package chapter11.InheritanceAndPolymorphism;

/**
 *
 * @author Abdulrahman
 */
public class Circle extends GeometricObject {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public Circle(double radius, String color, boolean filled) {
        setColor(color);
        setFilled(filled);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (radius * radius * Math.PI);
    }

    public double getPerimeter() {
        return (2 * radius * Math.PI);
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }

}
