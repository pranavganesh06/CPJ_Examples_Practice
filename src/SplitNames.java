import java.io.*;
import java.util.Scanner;

public class SplitNames {

    public static void splitBabyNames(String filename) throws IOException {
        Scanner input = new Scanner(new File(filename));

        PrintWriter boyWriter = new PrintWriter(new File("boynames.txt"));
        PrintWriter girlWriter = new PrintWriter(new File("girlnames.txt"));

        while (input.hasNextLine()) {
            String line = input.nextLine().trim();
            if (line.isEmpty()) continue;

            String[] parts = line.split("\\s+");

            // rank boyName boyCount boyPercent girlName girlCount girlPercent
            boyWriter.println(parts[1]);
            girlWriter.println(parts[4]);
        }

        input.close();
        boyWriter.close();
        girlWriter.close();
    }
}