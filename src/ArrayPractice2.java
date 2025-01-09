import java.util.Scanner;

/**
 * Demonstrates two different ways to handle input for a findMax method.
 * @author Mr. Turner
 */
public class ArrayPractice2 {
    public static void main(String[] args){
        // Create variables
        Scanner in = new Scanner(System.in);
        String stringNumbers = "";
        int[] arrayNumbers = new int[100];
        int index = 0;

        // Collect numbers
        System.out.println("Enter up to 100 integers to find the max of. Enter Q to stop.");
        while (in.hasNextInt()){
            int number = in.nextInt();
            stringNumbers += (" " + number);
            arrayNumbers[index] = number;
            index++;
        }
        // Cleanup
        stringNumbers = stringNumbers.substring((1)); // Removes the first space
        index--; // Removes the last index increase that was never assigned a corresponding value.
        in.close();

        // Print results of methods
        System.out.printf("Largest numbers found in:\nstored string %d\nint array %d\n",
                findMax(stringNumbers), findMax(arrayNumbers, index));
    }

    /**
     * Find the maximum integer in a String separated by spaces.
     * @param numbers values to search through
     * @return the maximum
     */
    public static int findMax(String numbers){
        // TODO 1: Write an algorithm to complete this method.
        return Integer.MIN_VALUE;
    }

    /**
     * Find the maximum integer in an int array.
     * @param numbers values to search through
     * @param index current size of the array
     * @return the maximum
     */
    public static int findMax(int[] numbers, int index){
        // TODO 2: Write an algorithm to complete this method.
        return Integer.MIN_VALUE;
    }
}