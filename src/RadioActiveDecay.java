public class RadioActiveDecay {

    public static void calculateRelativeAmount(double halfLife, int hours) {
        for (int t = 0; t <= hours; t++) {
            double relativeAmount = Math.exp(-t * (Math.log(2) / halfLife));
            System.out.printf("%.3f \n", relativeAmount);
        }
    }
}
