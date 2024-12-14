import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 1000000; i++) {
            if (rand.nextInt(2) == 0) {
                System.out.print("\u001B[32m" + rand.nextInt(2));
            } else {
                System.out.print(" ");
            }
        }
    }
}
