/*Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords()*/



package stringhandlingfunc;
import java.util.Scanner;
public class CapitalizeWords {
	// User-defined function to capitalize the first letter of each word
    public static String capitalizeWords(String str) {
        String[] words = str.trim().split("\\s+"); // Split by whitespace
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize first letter and append the rest
                result.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    result.append(word.substring(1).toLowerCase());
                }
                result.append(" ");
            }
        }

        return result.toString().trim(); // Remove trailing space
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Call the function
        String capitalized = capitalizeWords(input);

        // Output the result
        System.out.println("Capitalized string: " + capitalized);

        scanner.close();
    }
}

