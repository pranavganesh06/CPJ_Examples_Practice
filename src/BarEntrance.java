import java.util.Scanner;

public class BarEntrance {
    public static void main(String[] args) {
        final int MAX = 100;
        int peopleInBar = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("People entering or leaving: ");
            int change = scanner.nextInt();

            // Departures are always allowed
            if (change < 0) {
                peopleInBar += change;
                if (peopleInBar < 0) {
                    peopleInBar = 0; // prevent negative occupants
                }
            } else {
                // Arrivals only allowed if they do NOT exceed MAX
                if (peopleInBar + change <= MAX) {
                    peopleInBar += change;
                }
            }

            System.out.println("People in bar: " + peopleInBar);

            if (peopleInBar == MAX) {
                System.out.print("Bar is full");
                break;
            }
        }

        scanner.close();
    }
}
