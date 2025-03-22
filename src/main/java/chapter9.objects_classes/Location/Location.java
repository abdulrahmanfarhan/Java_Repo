package chapter9.objects_classes.Location;

import java.util.Scanner;

/**
 *
 * @author Abdulrahman
 */
public class Location {

    public int column;
    public int row;
    public double maxValue;

    private Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double a[][]) {
        int row = 0;
        int column = 0;
        double maxValue = Double.MIN_VALUE;
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    column = i;
                    row = j;
                }
            }
        }

        return new Location(row, column, maxValue);
    }

    public static double[][] Creat2DArray() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r = s.nextInt();
        System.out.println("Enter the number of columns:");
        int c = s.nextInt();

        return new double[r][c];
    }

    public static void fillArray(double array[][]) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter the value of [" + (i) + "] [" + (j) + "] :");
                array[i][j] = s.nextDouble();
            }
        }
    }

    @Override
    public String toString() {
        return "Location{" + "column=" + column + ", row=" + row + ", maxValue=" + maxValue + '}';
    }

    
    
}
