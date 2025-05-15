package chapter11.InheritanceAndPolymorphism;

/**
 *
 * @author Abdulrahman
 */
public class Rectangle extends GeometricObject {

    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public Rectangle(double width, double heigth, String color, boolean filled) {
        setColor(color);
        setFilled(filled);
        setHeight(height);
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}
