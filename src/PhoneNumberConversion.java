/**
 * Converts a 10-digit phone number string into standard phone number format.
 * Example: "4088675309" → "(408) 867-5309"
 * @author Pranav Ganesh
 */
public class PhoneNumberConversion {

    /**
     * Converts a plain 10-digit phone number string into the format (XXX) XXX-XXXX.
     * @param number the phone number as a string of digits
     * @return the formatted phone number
     */
    public static String convertPhoneNumber(String number) {
        // Ensure input has exactly 10 digits
        if (number == null || number.length() != 10) {
            return "Invalid input";
        }


        String areaCode = number.substring(0, 3);
        String firstThree = number.substring(3, 6);
        String lastFour = number.substring(6, 10);

        // Format into (XXX) XXX-XXXX
        return "(" + areaCode + ") " + firstThree + "-" + lastFour;
    }
}
