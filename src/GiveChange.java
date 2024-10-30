import java.util.Scanner;

/**
 * Program that directs a cashier how to give change.
 * Possible solution to Business P4.8 on page 173.
 */
public class GiveChange
{
    public static void main(String[] args) {
        // Create a Scanner to collect user input
        Scanner in = new Scanner(System.in);

        /*
         * Collect amount due and amount received.
         * Note input is in pennies to avoid roundoff errors in using doubles.
         */
        System.out.print("Enter amount due in pennies: ");
        int amountDue = in.nextInt();
        System.out.print("Enter amount received in pennies: ");
        int amountReceived = in.nextInt();
        in.close(); // Close the Scanner

        // Calculate the change
        calculateChange(amountDue, amountReceived);
    }

    /**
     * Calculates and print the change.
     * @param due amount due in pennies
     * @param received amount received in pennies
     */
    public static void calculateChange(int due, int received){

        // Determine the amount of change
        int changeLeftInPennies = received - due;

        /*
         * Using integer division, divide the change left by
         * each money denomination to determine how much to give
         * of each denomination. Using modular division, divide
         * the change left by each money denomination to
         * determine how much change is left. Start with dollars
         * and repeat this process with smaller denominations
         * until left with pennies.
         */
        int dollars = changeLeftInPennies / 100;
        changeLeftInPennies = changeLeftInPennies % 100;
        int quarters = changeLeftInPennies / 25;
        changeLeftInPennies = changeLeftInPennies % 25;
        int dimes = changeLeftInPennies / 10;
        changeLeftInPennies = changeLeftInPennies % 10;
        int nickels = changeLeftInPennies / 5;
        changeLeftInPennies = changeLeftInPennies % 5;
        int pennies = changeLeftInPennies;

        /*
         * Display the dollars, quarters, dimes, nickels, and pennies
         * that the customer should receive in return.
         */
        System.out.println("Give the following change: ");
        System.out.printf("Dollars %d\n", dollars);
        System.out.printf("Quarters %d\n", quarters);
        System.out.printf("Dimes %d\n", dimes);
        System.out.printf("Nickels %d\n", nickels);
        System.out.printf("Pennies %d\n", pennies);
    }
}

