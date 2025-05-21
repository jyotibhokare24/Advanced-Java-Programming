/*Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()*/


package arryalist;
import java.util.ArrayList;
import java.util.List;
public class ExtractSubList {
	public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Original list: " + colors);

        // Extract 1st and 2nd elements using subList()
        // subList(fromIndex, toIndex) -> fromIndex inclusive, toIndex exclusive
        List<String> subList = colors.subList(0, 2);

        System.out.println("Sublist (1st and 2nd elements): " + subList);
    }
}


