/*Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator())*/


package linkedlist;
import java.util.LinkedList;
import java.util.Iterator;
public class ReverseLinkedListIteration {
	public static void main(String[] args) {
        // Create a LinkedList and add some elements
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Original LinkedList: " + colors);

        // Get the descending iterator
        Iterator<String> descendingIterator = colors.descendingIterator();

        System.out.println("Iterating in reverse order:");
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }
    }
}

