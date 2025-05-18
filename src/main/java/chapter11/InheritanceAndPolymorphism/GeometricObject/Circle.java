package chapter11.InheritanceAndPolymorphism.GeometricObject;

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
        super(color, filled);
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
        System.out.println("The circle is created " + super.getDateCreated() + " and the radius is " + radius);
    }

}
