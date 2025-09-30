import java.util.Scanner;

// Textbook E4.15
public class DigitSeparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer no greater than 5 digits: ");
        int num = input.nextInt();
        String result = "";
        int num1 = num % 10;
        num /= 10;
        int num2 = num % 10;
        num /= 10;
        int num3 = num % 10;
        num /= 10;
        int num4 = num % 10;
        num /= 10;
        int num5 = num % 10;
        System.out.println(num5 + " " + num4 + " " + num3 + " " + num2 + " " + num1);

    }
}
