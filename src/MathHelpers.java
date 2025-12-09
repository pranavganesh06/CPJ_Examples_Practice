public class MathHelpers {
    public static int countDecimalPlaces(double value) {
        String text = Double.toString(Math.abs(value));
        int integerPlaces = text.indexOf('.');
        if (integerPlaces == -1) {
            return 0; // No decimal point found
        }
        // Length of the string minus the index of the decimal point minus 1 (for the point itself)
        return text.length() - integerPlaces - 1;
    }
    public static boolean hasMoreThanTwoDecimalPlaces(double value) {
        return countDecimalPlaces(value) > 2;
    }
}