import java.util.Scanner;

public class GasCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ask for inputs
        System.out.print("Enter the number of gallons of gas in the tank: ");
        double gallonsInTank = in.nextDouble();

        System.out.print("Enter the fuel efficiency in miles per gallon: ");
        double milesPerGallon = in.nextDouble();

        System.out.print("Enter the price of gas per gallon: ");
        double pricePerGallon = in.nextDouble();

        // Cost per 100 miles:
        // 100 miles / (miles per gallon) = gallons needed
        // cost = gallons needed * price per gallon
        double gallonsFor100Miles = 100.0 / milesPerGallon;
        double costPer100Miles = gallonsFor100Miles * pricePerGallon;

        // How far the car can go with the gas in the tank
        double maxDistance = gallonsInTank * milesPerGallon;

        // Output
        System.out.printf("Cost per 100 miles: $%.2f%n", costPer100Miles);
        System.out.printf("Maximum distance with current gas: %.2f miles%n", maxDistance);

        in.close();
    }
}
