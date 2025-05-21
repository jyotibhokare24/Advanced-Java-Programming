/*Write a java program for getting different colors through ArrayList interface and remove the
*2nd element and color "Blue" from the ArrayList 
*/

package arryalist;
import java.util.ArrayList;
import java.util.List;
public class RemoveColors {
	 public static void main(String[] args) {
	        // Creating an ArrayList to store color names
	        List<String> colors = new ArrayList<>();

	        // Adding colors to the list
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Black");

	        // Display the original list
	        System.out.println("Original list of colors: " + colors);

	        // Remove the 2nd element (index 1)
	        if (colors.size() > 1) {
	            String removedElement = colors.remove(1);
	            System.out.println("Removed 2nd element: " + removedElement);
	        } else {
	            System.out.println("List does not have a 2nd element to remove.");
	        }

	        // Remove the color "Blue" by value
	        boolean isBlueRemoved = colors.remove("Blue");
	        if (isBlueRemoved) {
	            System.out.println("Color 'Blue' removed successfully.");
	        } else {
	            System.out.println("Color 'Blue' was not found in the list.");
	        }

	        // Display the final list
	        System.out.println("Final list of colors: " + colors);
	    }
	}


