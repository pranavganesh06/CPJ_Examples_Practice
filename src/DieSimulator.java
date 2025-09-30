import java.util.Random;

public class DieSimulator {
    public static void main(String[] args) {
        Random generator = new Random();
        int dieRoll = generator.nextInt(6) + 1;
        System.out.print("You rolled a: " + dieRoll);

    }
}
