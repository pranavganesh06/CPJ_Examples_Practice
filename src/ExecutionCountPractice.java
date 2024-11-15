public class ExecutionCountPractice {
    public static void main(String[] args) {
        System.out.println(countMultiples(5, 100));
        multiplicationTablePrinter(5, 12);
    }


    public static int countMultiples(int divisor, int upperBound){
        int divisibleCounter = 0;
        for (int i = 0; i < upperBound; i++) {
            if (i % divisor == 0) {
                divisibleCounter++;
            }
        }
        return divisibleCounter;
    }

    public static void multiplicationTablePrinter(int boundOne, int boundTwo){
        int largestNumber = boundOne * boundTwo;
        int fieldWidth = String.valueOf(largestNumber).length();
        for (int i = 1; i <= boundOne; i++) {
            for (int j = 1; j <= boundTwo; j++) {
                System.out.printf("%" + fieldWidth + "d ", i * j);
            }
            System.out.println();
        }
    }
}
