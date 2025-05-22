/*Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()*/




package stringhandlingfunc;
import java.util.Scanner;
public class SubstringCounter {
	 // User-defined function to count how many times a substring appears in a main string
    public static int countOccurrences(String mainString, String subString) {
        int count = 0;
        int index = 0;

        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length(); // Move past the last found substring
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the substring: ");
        String subString = scanner.nextLine();

        // Calling the function
        int result = countOccurrences(mainString, subString);

        // Output the result
        System.out.println("The substring \"" + subString + "\" appears " + result + " times in the main string.");

        scanner.close();
    }
}


