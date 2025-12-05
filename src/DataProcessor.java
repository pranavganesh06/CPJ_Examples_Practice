public class DataProcessor {

    public static boolean isValidData(String data) {
        // Null or empty → invalid character
        if (data == null || data.isEmpty()) {
            System.out.println("Invalid character.");
            return false;
        }

        // Must end with a number (not a comma)
        if (data.charAt(data.length() - 1) == ',') {
            System.out.println("Must end with a number.");
            return false;
        }

        try {
            for (int i = 0; i < data.length(); i++) {
                char c = data.charAt(i);

                switch (c) {
                    case ',':
                        // Comma must be at odd indices
                        if (i % 2 == 0) {
                            System.out.println("Only commas at odd indices.");
                            return false;
                        }
                        break;

                    default:
                        // Must be a digit
                        if (!Character.isDigit(c)) {
                            System.out.println("Invalid character.");
                            return false;
                        }

                        // Digits must appear at even indices
                        if (i % 2 == 1) {
                            System.out.println("Only numbers at even indices.");
                            return false;
                        }
                        break;
                }
            }
        } catch (Exception e) {
            // ANY unexpected exception → treat as invalid character
            System.out.println("Invalid character.");
            return false;
        }

        return true; // Passed all checks
    }
}
