package AP_Exam_Practice;

public class RecursionDemo {
    public static void main(String[] args) {
        System.out.println(recursion(5));

    }

    public static int recursion(int n) {
        if (n == 0 || n == 1) return 1;
        else return recursion(n / 2) + recursion(n - 1);
    }
}
