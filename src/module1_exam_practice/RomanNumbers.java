package module1_exam_practice;

import java.util.Scanner;

public class RomanNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = in.nextInt();

        if (integer >= 1000)
        {
            // Get the 1000th's digit
            int digit = integer / 1000;
            // Note the program is limited to 3999 so we need not
            // Calculate higher than 3
            if (digit == 1)
            {
                System.out.print("M");
            }
            if (digit == 2)
            {
                System.out.print("MM");
            }
            if (digit == 3)
            {
                System.out.print("MMM");
            }
        }
        if (integer >= 100)
        {
            // Get the 100th's digit
            int digit = (integer / 100) % 10;
            if (digit == 1)
            {
                System.out.print("C");
            }
            if (digit == 2)
            {
                System.out.print("CC");
            }
            if (digit == 3)
            {
                System.out.print("CCC");
            }
            if (digit == 4)
            {
                System.out.print("CD");
            }
            if (digit == 5)
            {
                System.out.print("D");
            }
            if (digit == 6)
            {
                System.out.print("DC");
            }
            if (digit == 7)
            {
                System.out.print("DCC");
            }
            if (digit == 8)
            {
                System.out.print("DCCC");
            }
            if (digit == 9)
            {
                System.out.print("CM");
            }
        }
        if (integer >= 10)
        {
            // Get the 10's digit
            int digit = (integer / 10) % 10;
            if (digit == 1)
            {
                System.out.print("X");
            }
            if (digit == 2)
            {
                System.out.print("XX");
            }
            if (digit == 3)
            {
                System.out.print("XXX");
            }
            if (digit == 4)
            {
                System.out.print("XL");
            }
            if (digit == 5)
            {
                System.out.print("L");
            }
            if (digit == 6)
            {
                System.out.print("LX");
            }
            if (digit == 7)
            {
                System.out.print("LXX");
            }
            if (digit == 8)
            {
                System.out.print("LXXX");
            }
            if (digit == 9)
            {
                System.out.print("XC");
            }
        }
        if (integer >= 0)
        {
            // Get the 1's digit
            int digit = integer % 10;
            if (digit == 1)
            {
                System.out.print("I");
            }
            if (digit == 2)
            {
                System.out.print("II");
            }
            if (digit == 3)
            {
                System.out.print("III");
            }
            if (digit == 4)
            {
                System.out.print("IV");
            }
            if (digit == 5)
            {
                System.out.print("V");
            }
            if (digit == 6)
            {
                System.out.print("VI");
            }
            if (digit == 7)
            {
                System.out.print("VII");
            }
            if (digit == 8)
            {
                System.out.print("VIII");
            }
            if (digit == 9)
            {
                System.out.print("IX");
            }
        }
    }
}

