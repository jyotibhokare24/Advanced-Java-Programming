/*Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()*/




package stringhandlingfunc;
import java.util.Scanner;
public class NumericChecker {
	 // User-defined function to check if a string contains only numeric characters
    public static boolean isNumeric(String str) {
        return str.matches("\\d+"); // \d matches digits, + means one or more
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the function
        if (isNumeric(input)) {
            System.out.println("The string contains only numeric characters.");
        } else {
            System.out.println("The string does NOT contain only numeric characters.");
        }

        scanner.close();
    }
}

