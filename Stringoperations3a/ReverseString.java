/*Write a Java Program for Reversing the characters in a string using user defined function
reverseString().*/




package stringhandlingfunc;
import java.util.Scanner;
public class ReverseString {
	// User-defined function to reverse a string
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Calling the function
        String reversed = reverseString(input);

        // Output the result
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}


