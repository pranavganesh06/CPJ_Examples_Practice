import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter three numbers: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        // Find the largest
        double largest = a;

        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }

        System.out.println("The largest number is " + largest + ".");

        in.close();
    }
}
