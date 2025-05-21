

package arryalist;
import java.util.ArrayList;
import java.util.List;
public class ColorSearch {
	 public static void main(String[] args) {
	        // Creating an ArrayList to store colors
	        List<String> colors = new ArrayList<>();

	        // Adding different colors
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Red");
	        colors.add("Black");

	        // Display the list of colors
	        System.out.println("Available colors: " + colors);

	        // Search for "Red" in the list
	        if (colors.contains("Red")) {
	            System.out.println("The color 'Red' is available in the list.");
	        } else {
	            System.out.println("The color 'Red' is NOT available in the list.");
	        }
	    }
	}


