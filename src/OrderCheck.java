import java.util.Scanner;

public class OrderCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Read three integers
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Check ascending or descending (allow equals)
        boolean ascending = (a <= b && b <= c);
        boolean descending = (a >= b && b >= c);

        if (ascending || descending) {
            System.out.println("in order");
        } else {
            System.out.println("not in order");
        }

        in.close();
    }
}
