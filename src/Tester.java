import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        double[][] something =
                { {2.5, 6.8, 8.3, 2.3, 0.0},
                        {6.1, 10.2, 1.3, -2.5, -9.9},
                        {1.1, 2.3, 5.8, 13.21, 34.55} };
        something[1][0] = 3.1;
        something[1][1] = 4.1;
        something[1][2] = 5.9;
        something[1][3] = 2.6;
        something[1][4] = 8.4;

        for (int i = 0; i < something.length; i++) {
            for (int j = 0; j < something[i].length; j++){
                System.out.print(something[i][j] + " ");
            }
            System.out.println();
        }

//        ArrayList<String> pets = new ArrayList<String> ( );
//
//        pets.add("cat");
//
//        pets.add("dog");
//
//        pets.add("pig");
//
//        pets.add("fish");
//
//        pets.add("rat");
//
//        pets.add("bunny");
//
//        int i = 0;
//
//        while(pets.get(i).length() < 4) {
//
//            pets.remove(i);
//
//            i++;
//
//        }
//        System.out.println(pets);
    }
}
