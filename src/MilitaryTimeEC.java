/**
 * Calculates the difference between two military times.
 * Example: 1250 → 12:50, 1350 → 13:50 → difference = 1 hour 0 minutes.
 * @author Pranav
 */
public class MilitaryTimeEC {

    /**
     * Calculates the difference between two military times (start and end).
     * @param startTime Start time in 24-hour military format (e.g., 1250)
     * @param endTime End time in 24-hour military format (e.g., 1350)
     * @return A string showing the difference in "X hours Y minutes"
     */
    public static String calculateTimeDifference(int startTime, int endTime) {
        // Extract hours and minutes from input times
        int startHour = startTime / 100;
        int startMinute = startTime % 100;
        int endHour = endTime / 100;
        int endMinute = endTime % 100;

        // Convert to total minutes from midnight
        int startTotalMinutes = startHour * 60 + startMinute;
        int endTotalMinutes = endHour * 60 + endMinute;

        // Handle if end time is on the next day (e.g., 1941 → 0732)
        if (endTotalMinutes < startTotalMinutes) {
            endTotalMinutes += 24 * 60;
        }

        // Calculate difference
        int diffMinutes = endTotalMinutes - startTotalMinutes;
        int hours = diffMinutes / 60;
        int minutes = diffMinutes % 60;

        return hours + " hours " + minutes + " minutes";
    }
}
