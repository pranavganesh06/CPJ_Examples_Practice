import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContentsCount {

    public static void printContentsCounts(String filename) {
        int characterCount = 0;
        int lineCount = 0;
        int wordCount = 0;

        try {
            Scanner input = new Scanner(new File(filename));

            while (input.hasNextLine()) {
                String line = input.nextLine();
                lineCount++;

                // Count characters (do NOT count newline characters)
                characterCount += line.length();

                // Count words (ignore blank lines)
                if (!line.trim().isEmpty()) {
                    String[] words = line.trim().split("\\s+");
                    wordCount += words.length;
                }
            }

            input.close();

            // Print EXACTLY as the test expects
            System.out.println("Characters: " + characterCount);
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
