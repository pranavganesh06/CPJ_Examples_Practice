import java.util.Scanner;

public class MathAlgorithms {

    public static int findGreatestCommonDivisor(int a, int b){
        if (a > b) {
            return findGreatestCommonDivisor (a-b, b); }
        else if (b > a) {
            return findGreatestCommonDivisor (a, b-a); }
        else{ //(a == b)
            return a; }
    }

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int a = input.nextInt();
    System.out.println("Enter the second number: ");
    int b = input.nextInt();
    System.out.println(findGreatestCommonDivisor(a,b));
    input.close();
    }
}

