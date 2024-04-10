import java.util.Scanner;

public class WeekdayGenerator {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number between 1 and 7
        System.out.print("Enter a number between 1 and 7: ");

        // Read the input as an integer
        int userNumber = scanner.nextInt();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Display the corresponding weekday name
        String weekdayName = getWeekdayName(userNumber);
        System.out.println("Weekday: " + weekdayName);
    }

    // Function to get the weekday name based on the number
    public static String getWeekdayName(int number) {
        switch (number) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "Invalid input. Please enter a number between 1 and 7.";
        }
    }
}
