/*Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)
*/


package arryalist;
import java.util.ArrayList;
import java.util.Collections;
public class SortColors {
	 public static void main(String[] args) {
	        // Create an ArrayList to store color names
	        ArrayList<String> colors = new ArrayList<>();

	        // Add different colors
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display the original list
	        System.out.println("Original list of colors: " + colors);

	        // Sort the list using Collections.sort()
	        Collections.sort(colors);

	        // Display the sorted list
	        System.out.println("Sorted list of colors: " + colors);
	    }
	}

