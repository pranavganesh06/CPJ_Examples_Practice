import java.util.Scanner;
public class SearchContinueDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // ask for user input
        System.out.print("Enter text:");
        String text = input.nextLine();
        System.out.print("Enter character to match:");
        char lookFor = input.nextLine().charAt(0);
        int max = text.length();
        int matches = 0;
        for (int i = 0; i < max; i++) {
            // interested only in specified char
            if (text.charAt(i) != lookFor) continue;
            // process chars
            matches++;
        }

        input.close();
        System.out.println("Found " + matches + " " + "of" + lookFor + "'s in the string.");
    }
}