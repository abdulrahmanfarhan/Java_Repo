package Extra;
import java.util.Scanner;

public class PopulationForecast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();
        
        final int CURRENT_POPULATION = 312032486; // عدد السكان الحالي
        final int SECONDS_IN_A_YEAR = 31536000; // عدد الثواني في السنة
        
        int increaseFromBirths = SECONDS_IN_A_YEAR / 7; // عدد الولادات في السنة
        int increaseFromImmigrants = SECONDS_IN_A_YEAR / 45; // عدد المهاجرين في السنة
        int decreaseFromDeaths = SECONDS_IN_A_YEAR / 13; // عدد الوفيات في السنة
        
        int netPopulationChange = (increaseFromBirths + increaseFromImmigrants) - decreaseFromDeaths;
        
        int newPopulation = (netPopulationChange * years) + CURRENT_POPULATION;
        
        System.out.println("Population after " + years + " years: " + newPopulation);
        

    }
}
