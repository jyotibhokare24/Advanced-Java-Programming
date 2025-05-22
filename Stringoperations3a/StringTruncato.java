/*Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/




package stringhandlingfunc;
import java.util.Scanner;
public class StringTruncator {
	// User-defined function to truncate a string and add ellipsis
    public static String truncate(String str, int maxLength) {
        if (str.length() <= maxLength) {
            return str; // No truncation needed
        } else if (maxLength <= 3) {
            // If maxLength is too short, return just dots up to maxLength
            return "...".substring(0, maxLength);
        } else {
            // Truncate and add ellipsis
            return str.substring(0, maxLength - 3) + "...";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the maximum length: ");
        int maxLength = scanner.nextInt();

        // Call the function
        String result = truncate(input, maxLength);

        // Output the result
        System.out.println("Truncated string: " + result);

        scanner.close();
    }
}

