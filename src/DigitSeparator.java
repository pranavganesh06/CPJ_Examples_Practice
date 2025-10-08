import java.util.Scanner;


public class DigitSeparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer no more than 5 digits: ");
        int number = input.nextInt();
        String numStr = Integer.toString(number);

        for (int i = 0; i < numStr.length(); i++) {
            System.out.print(numStr.charAt(i) + " ");

        }
    }
}
