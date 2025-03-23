package chapter9.objects_classes.CircleSummary;

/**
 *
 * @author Abdulrahman
 */
public class Circle {
    private int radius;
    private  static int numberOfObjects;
    
    Circle(){
        radius = 1;
        numberOfObjects++;
    }
    Circle(int radius){
        this.radius = radius;
        numberOfObjects++;
    }
    public static int getNumOfObj(){
        return numberOfObjects;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}
