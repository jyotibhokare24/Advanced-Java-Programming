/*Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) )*/



package linkedlist;
import java.util.LinkedList;
public class DisplayElementsWithPositions {
	public static void main(String[] args) {
        // Create and initialize a LinkedList with some elements
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Elements and their positions in the LinkedList:");

        // Loop through the list and use get(index) to access elements
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Position " + i + ": " + colors.get(i));
        }
    }
}



