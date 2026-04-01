import java.util.Random;

public class ArrayPrinter {

    public static int[] generateRandomIntegerArray(int numberOfElements) {
        int[] arr = new int[10];
        Random rand = new Random();

        int limit = Math.min(numberOfElements, arr.length);
        for (int i = 0; i < limit; i++) {
            arr[i] = rand.nextInt(100) + 1; // 1..100
        }

        return arr;
    }

    public static void printEvenIndicies(int[] data) {
        for (int i = 0; i < data.length; i += 2) {
            System.out.print(data[i] + " ");
        }
    }

    public static void printEvenElements(int[] data) {
        for (int value : data) {
            if (value % 2 == 0) {
                System.out.print(value + " ");
            }
        }
    }

    public static void printElementsReversed(int[] data) {
        for (int i = data.length - 1; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
    }

    public static void printFirstLastElements(int[] data) {
        if (data.length == 0) return;
        System.out.print(data[0] + " " + data[data.length - 1]);
    }

    public static void main(String[] args) {
        int[] arr = generateRandomIntegerArray(10);

        printEvenIndicies(arr);
        System.out.println();

        printEvenElements(arr);
        System.out.println();

        printElementsReversed(arr);
        System.out.println();

        printFirstLastElements(arr);
        System.out.println();
    }
}