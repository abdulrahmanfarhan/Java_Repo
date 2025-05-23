package Extra;
import java.util.Scanner;
public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight in pound then the height in inches : -");
        double weight = input.nextDouble();
        double height = input.nextDouble();
        
        weight = weight * 0.45359237 ;
        height = height * 0.0254 ;
        
        double bmi = weight / Math.pow(height, 2);
        
        System.out.println("BMI is : " + bmi);
        
    }
}
