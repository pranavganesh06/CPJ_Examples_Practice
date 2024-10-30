import java.util.Scanner;

public class WhilePractice1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 0;
        while (i * i < n){
            System.out.println(i * i);
            i++;
        }

        i = 1;
        while (i < n) {
            System.out.println(i);
            i *= 2;
        }
    }
}
