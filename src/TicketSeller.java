import java.util.Scanner;

public class TicketSeller {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int remaining = 100;
        int buyers = 0;

        while (remaining > 0) {
            System.out.println("Tickets remaining: " + remaining);
            System.out.print("Enter number of tickets to buy (1–4): ");
            int requested = in.nextInt();

            // Check input
            if (requested < 1 || requested > 4) {
                System.out.println("You can only buy between 1 and 4 tickets.\n");
                continue;  // ask again
            }

            // Check if enough tickets are left
            if (requested > remaining) {
                System.out.println("Not enough tickets left. Try a smaller amount.\n");
                continue;
            }

            // Process sale
            remaining -= requested;
            buyers++;
            System.out.println("Purchase successful. " + remaining + " tickets remain.\n");
        }

        // All tickets sold
        System.out.println("All tickets sold!");
        System.out.println("Total number of buyers: " + buyers);

        in.close();
    }
}
