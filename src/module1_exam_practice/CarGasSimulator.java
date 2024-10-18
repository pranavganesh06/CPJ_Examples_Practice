package module1_exam_practice;
import java.util.Scanner;

public class CarGasSimulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Gallons in tank: ");
        double gallons = in.nextDouble();
        System.out.print("Fuel efficiency (mpg): ");
        double fuelEfficiency = in.nextDouble();
        System.out.print("Gas price per gallon: $");
        double gasPricePerGallon = in.nextDouble();

        System.out.printf("Cost per 100 miles is $%.2f\n" +
                "and the car can go %.2f miles.",
                (1 / fuelEfficiency) * gasPricePerGallon * 100,
                gasPricePerGallon * gallons);
    }
}