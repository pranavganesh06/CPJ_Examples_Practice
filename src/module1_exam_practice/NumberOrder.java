package module1_exam_practice;

import java.util.Scanner;

public class NumberOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three integers separated by spaces: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        String ordering = "not in order";
        if ((a <= b && b <= c) || (a >= b && b >= c)){
            ordering = "in order";
        }
        System.out.printf("%d %d %d %s", a ,b, c, ordering);
    }
}
