package module1_exam_practice;

import java.util.Scanner;

public class DigitPrinter {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a positive integer no longer than five digits: ");
        int number = in.nextInt();

        int digit5 = number % 10;
        number /= 10;  // number = number / 10
        int digit4 = number % 10;
        number /= 10;
        int digit3 = number % 10;
        number /= 10;
        int digit2 = number % 10;
        number /= 10;
        int digit1 = number % 10;
        number /= 10;

        System.out.printf("%d %d %d %d %d\n", digit1, digit2, digit3, digit4,
                digit5);
    }

        // Another possible solution
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        in.useDelimiter("");
//        System.out.print("Enter a non-negative integer no more than five digits: ");
//        String output = "";
//        output += in.next() + " ";
//        output += in.next() + " ";
//        output += in.next() + " ";
//        output += in.next() + " ";
//        output += in.next();
//        System.out.println(output);
//    }
}
