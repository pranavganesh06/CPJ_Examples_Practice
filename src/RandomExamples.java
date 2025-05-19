import java.util.Random;

public class RandomExamples {
    public static void main(String[] args){
        Random rng = new Random();
        System.out.println(rng.nextInt(6) + 5);

        System.out.println((int) (Math.random()*6) + 5);
    }
}
