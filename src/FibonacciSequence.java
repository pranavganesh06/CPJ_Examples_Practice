public class FibonacciSequence {


    public static int fibIterative(int n) {
        if (n <= 2) return 1;

        int fold1 = 1;
        int fold2 = 1;
        int fnew = 0;

        for (int i = 3; i <= n; i++) {
            fnew = fold1 + fold2;


            fold2 = fold1;
            fold1 = fnew;
        }

        return fnew;
    }


    public static int fibRecursive(int n) {
        if (n <= 2) return 1;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }
}