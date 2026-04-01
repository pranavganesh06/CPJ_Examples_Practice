import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LineNumbering {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Ask for file names
        System.out.print("Enter input file name: ");
        String inputFileName = console.nextLine().trim();

        System.out.print("Enter output file name: ");
        String outputFileName = console.nextLine().trim();

        try {
            File inputFile = new File(inputFileName);
            Scanner fileScanner = new Scanner(inputFile);
            PrintWriter output = new PrintWriter(outputFileName);

            int lineNumber = 1;

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                output.println("/* " + lineNumber + " */ " + line);
                lineNumber++;
            }

            fileScanner.close();
            output.close();

            System.out.println("File processed successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found.");
        }

        console.close();
    }
}
