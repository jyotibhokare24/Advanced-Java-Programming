/*Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()*/


package stringhandlingfunc;
import java.util.Scanner;
public class WhitespaceRemover {
	// User-defined function to remove all whitespace characters from a string
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", ""); // \s matches any whitespace character
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string with whitespace: ");
        String input = scanner.nextLine();

        // Call the function
        String result = removeWhitespace(input);

        // Output result
        System.out.println("String without whitespace: " + result);

        scanner.close();
    }
}


