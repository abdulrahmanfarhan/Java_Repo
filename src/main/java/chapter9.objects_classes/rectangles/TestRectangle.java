package chapter9.objects_classes.rectangles;

/**
 *
 * @author Abdulrahman
 */
public class TestRectangle {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);
        
        System.out.println("The width of rectangle r1 is " + r1.getWidth());
        System.out.println("The height of rectangle r1 is " + r1.getHeight());
        System.out.println("The area of rectangle r1 is: " + r1.getArea());
        System.out.println("The perimeter of rectangle r1 is: " + r1.getPerimeter());
        System.out.println("--------------------------------");
        System.out.println("The width of rectangle r2 is " + r2.getWidth());
        System.out.println("The height of rectangle r2 is " + r2.getHeight());
        System.out.println("The area of rectangle r2 is: " + r2.getArea());
        System.out.println("The perimeter of rectangle r2 is: " + r2.getPerimeter());
        System.out.println("Abdulrahman farhan");
    }
}
