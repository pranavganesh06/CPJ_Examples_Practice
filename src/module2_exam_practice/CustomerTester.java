package module2_exam_practice;

import java.util.Scanner;

public class CustomerTester {
    public static void main(String[] args)
    {
        boolean more = true;
        Customer test = new Customer();

        do
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter a purchase amount, -1 to quit: ");
            double input = in.nextDouble();

            if (input == -1)
            {
                more = false;
            }
            else
            {
                test.makePurchase(input);
            }
        }
        while (more);

        System.out.println("Total sale, including discounts : " + test.getTotal());
    }
}
