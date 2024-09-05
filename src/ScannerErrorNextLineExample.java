import java.util.Scanner;
public class ScannerErrorNextLineExample {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner in = new Scanner(System.in);

        //Collect name and print output
        System.out.print("Enter name: ");
        String name = in.nextLine();
        System.out.printf("Name entered: %s\n", name);

        //Collect age and print output
        System.out.print("Enter age: ");
        int age = in.nextInt(); //Excludes the return character
        //The Fix: Clear out the Scanner before asking for more info
        in.nextLine();
        System.out.printf("Age entered: %d\n", age);

        //Collect hobby and print output
        System.out.print("Enter hobby: ");
        String hobby = in.nextLine();
        System.out.printf("Hobby entered: %s\n", hobby);
    }
}
