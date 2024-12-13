package module2_exam_practice;

import java.util.Scanner;

public class TicketSeller {
    public static void main(String[] args) {
        final int MAX_TICKETS = 100;
        final int MAX_TICKETS_PER_BUYER = 4;
        int ticketsSold = 0;
        int buyers = 0;

        Scanner input = new Scanner(System.in);
        while (ticketsSold < MAX_TICKETS) {
            System.out.print("Enter number of tickets needed: ");
            int tickets = input.nextInt();
            if (tickets > MAX_TICKETS_PER_BUYER){
                System.out.printf("Customers may not purchase more than %d tickets.\n",
                        MAX_TICKETS_PER_BUYER);
            }
            else if (tickets + ticketsSold > MAX_TICKETS) {
                System.out.println("Regrettably, you want to purchase more tickets than are available.");
            }
            else{
                System.out.printf("Processing payment for %d tickets.\n", tickets);
                ticketsSold += tickets;
                buyers++;
                System.out.printf("Thank you for your purchase!\n" +
                        "Let your friends know there are %d tickets left!\n\n", MAX_TICKETS - ticketsSold);
            }
        }
        System.out.printf("There were %d buyers.", buyers);
    }
}