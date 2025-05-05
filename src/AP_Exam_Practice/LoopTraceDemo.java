package AP_Exam_Practice;

public class LoopTraceDemo {
    public static void main(String[] args) {

        for (int i = 7; i > -5; i-=3) {
            for (int j = -2; j < Math.abs(i); j+=2) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }

    }

}
