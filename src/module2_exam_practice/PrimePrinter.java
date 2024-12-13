package module2_exam_practice;

import java.util.Scanner;

public class PrimePrinter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();

        for (int i = 1; i < num; i++) {
            int current = PrimeGenerator.nextPrime(i);
            i = current;
            System.out.println(current + " ");
        }
        in.close();
    }
}
