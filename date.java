import java.time.DayOfWeek;
import java.time.LocalDate;

public class date {
    public static String getDayOfWeek(int year, int month, int day) {
        // Create a LocalDate object representing the given date
        LocalDate date = LocalDate.of(year, month, day);
        
        // Get the DayOfWeek enum value corresponding to the day of the week
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        
        // Convert the DayOfWeek enum value to a string representation
        String dayOfWeekString = dayOfWeek.toString();
        
        // Capitalize the first letter of the day of the week
        dayOfWeekString = dayOfWeekString.substring(0, 1).toUpperCase() + dayOfWeekString.substring(1).toLowerCase();
        
        return dayOfWeekString;
    }

    public static void main(String[] args) {
        // Example usage:
        int year = 2024;
        int month = 4;
        int day = 5;
        String dayOfWeek = getDayOfWeek(year, month, day);
        System.out.println("Day of the week: " + dayOfWeek);
    }
}
