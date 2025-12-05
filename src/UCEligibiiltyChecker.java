import java.util.Scanner;

public class UCEligibiiltyChecker {

    public static void askAdmissionsQuestions() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your A-G GPA (unweighted): ");
            double gpa = scan.nextDouble();

            System.out.print("Have you completed all A-G courses? (true/false): ");
            boolean completedAG = scan.nextBoolean();

            try {
                // If GPA is valid, this will not throw
                String result = checkEligibility(gpa, completedAG);
                System.out.print(result);  // result already starts with "\n"
                break;                     // done, exit loop
            } catch (IllegalArgumentException e) {
                // GPA was out of range – match EXACT text + newlines in test
                System.out.print("GPA must be between 0 and 4.\n");
                System.out.print("Reenter with correct value.\n");
            }
        }
    }

    public static String checkEligibility(double gpa, boolean completedAG) {
        if (gpa < 0 || gpa > 4) {
            throw new IllegalArgumentException("GPA must be between 0 and 4.");
        }

        StringBuilder sb = new StringBuilder();

        sb.append("\n--- UC Eligibility Results ---\n");
        sb.append(String.format("GPA: %.2f\n", gpa));

        if (gpa >= 3.0) {
            sb.append("Meets GPA requirement\n");
        } else {
            sb.append("Does NOT meet GPA requirement\n");
        }

        if (completedAG) {
            sb.append("A-G requirements completed\n");
        } else {
            sb.append("A-G requirements NOT completed\n");
        }

        if (gpa >= 3.0 && completedAG) {
            sb.append("Final Verdict: Eligible for UC admission\n");
        } else {
            sb.append("Final Verdict: NOT eligible for UC admission\n");
        }

        return sb.toString();
    }
}
