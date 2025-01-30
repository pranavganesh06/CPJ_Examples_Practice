import java.util.Arrays;
public class SelectionSortPractice {

    /*
     * Trace through the algorithm step by step with a variety
     * of values in the arrays and test your knowledge of how
     * the algorithm works. Try removing the comments to
     * make it more difficult to follow along.
     */
    public static void main(String[] args)
    {
        int[] arr = {5, 3, 4, 1, 6, 2};
        System.out.println("Before:");
        System.out.println(Arrays.toString(arr));

        selectionSort(arr);

        System.out.println("After:");
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {6, 3, 2, 10, 15, 8, 1, 90, 7};

        System.out.println("===========");

        System.out.println("Before:");
        System.out.println(Arrays.toString(arr2));

        selectionSort(arr2);

        System.out.println("After:");
        System.out.println(Arrays.toString(arr2));
    }

    /*
     * Selection sort takes in an array of integers and
     * returns a sorted array of the same integers.
     */
    private static int[] selectionSort (int[] arr)
    {
        int currentMinIndex;
        for (int i = 0; i < arr.length - 1; i++)
        {
            System.out.println(Arrays.toString(arr));

            currentMinIndex = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[currentMinIndex])
                {
                    currentMinIndex = j;
                }
            }

            // swap numbers if needed
            if (i != currentMinIndex)
            {
                int temp = arr[currentMinIndex];
                arr[currentMinIndex] = arr[i];
                arr[i] = temp;
            }
        }

        return arr;
    }
}
