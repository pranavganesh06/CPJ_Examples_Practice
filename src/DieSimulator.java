import java.util.Random;

// Textbook E2.11
public class DieSimulator {
    public static void main(String[] args){
        Random generator = new Random();
        System.out.println(generator.nextInt(6) + 1);
    }
}
