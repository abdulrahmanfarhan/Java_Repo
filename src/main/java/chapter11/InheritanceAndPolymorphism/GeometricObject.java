package chapter11.InheritanceAndPolymorphism;

import java.util.Date;

/**
 *
 * @author Abdulrahman
 */
public class GeometricObject {

    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject() {
        this.color = "white";
        dateCreated = new java.util.Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "GeometricObject{" + "color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + '}';
    }

}
