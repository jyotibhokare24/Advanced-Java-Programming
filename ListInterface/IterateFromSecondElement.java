/*Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/

package linkedlist;
import java.util.LinkedList;
import java.util.ListIterator;
public class IterateFromSecondElement {
	public static void main(String[] args) {
        // Create a LinkedList and add some elements
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Original LinkedList: " + colors);

        // Create ListIterator starting at index 1 (2nd element)
        ListIterator<String> iterator = colors.listIterator(1);

        System.out.println("Iterating from the 2nd element:");
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
        }
    }
}

