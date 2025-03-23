package chapter9.objects_classes.CircleSummary;

public class TotalAreaCalculator {

    public static void main(String[] args) {
        Circle a[] = CreatArrayOfObj.Creat(5);
        printArray(a);
    }

    public static void printArray(Circle a[]) {
        System.out.println("-----------------------");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Circle #" + (i + 1) + ":");
            System.out.println("Radius:" + a[i].getRadius());
            System.out.printf("Area  : %.2f%n", a[i].getArea());
            System.out.println("-----------------------");
        }
        System.out.printf("Total sum of areas: %.2f%n", getSumOfArray(a));

    }

    public static double getSumOfArray(Circle a[]) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i].getArea();
        }
        return sum;
    }
}
