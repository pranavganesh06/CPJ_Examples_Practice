public class DataProcessor {

    public static boolean isValidData(String data) {
        // Null or empty -> treat as invalid character
        if (data == null || data.isEmpty()) {
            System.out.println("Invalid character.");
            return false;
        }

        // Must end with a number (i.e., not a comma)
        if (data.charAt(data.length() - 1) == ',') {
            System.out.println("Must end with a number.");
            return false;
        }

        for (int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);

            // First: any character that is not a digit and not a comma
            if (!Character.isDigit(c) && c != ',') {
                System.out.println("Invalid character.");
                return false;
            }

            // Even indices (0, 2, 4, ...) must be digits
            if (i % 2 == 0) {
                if (c == ',') {
                    // Comma at an even index is wrong
                    System.out.println("Only commas at odd indices.");
                    return false;
                }
                // otherwise it's a digit, which is fine
            } else {
                // Odd indices (1, 3, 5, ...) must be commas
                if (c != ',') {
                    // Digit (or other allowed char) at odd index is wrong
                    System.out.println("Only numbers at even indices.");
                    return false;
                }
            }
        }

        // If we made it through the loop, the data is valid
        return true;
    }
}
