/*Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index*/



package arryalist;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DeleteNthElement {
	 public static void main(String[] args) {
	        // Create an ArrayList and add colors
	        List<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");

	        System.out.println("Original colors list: " + colors);

	        // Take input from user for which element to delete
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the index (0-based) of the element to delete: ");
	        int n = scanner.nextInt();

	        // Remove the nth element by index if valid
	        if (n >= 0 && n < colors.size()) {
	            String removedColor = colors.remove(n);
	            System.out.println("Removed element: " + removedColor);
	        } else {
	            System.out.println("Invalid index! Please enter a number between 0 and " + (colors.size() - 1));
	        }

	        System.out.println("Updated colors list: " + colors);
	        scanner.close();
	    }
	}


