/*Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink"))*/

package linkedlist;
import java.util.LinkedList;
public class InsertAtEnd {
	public static void main(String[] args) {
        // Create a LinkedList and add some initial elements
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Original LinkedList: " + colors);

        // Insert "Pink" at the end using offerLast()
        colors.offerLast("Pink");

        System.out.println("Updated LinkedList after inserting 'Pink' at the end: " + colors);
    }
}

