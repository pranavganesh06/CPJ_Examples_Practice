package module2_exam_practice;

public class PrimeGenerator {

    public static int nextPrime(int n) {
        while (true){
            if(isPrime(++n)) return n;
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
