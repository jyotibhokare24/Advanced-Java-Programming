/*Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2))*/


package linkedlist;
import java.util.Collections;
import java.util.LinkedList;
public class SwapElementsInLinkedList {
	 public static void main(String[] args) {
	        // Create and initialize a LinkedList with elements
	        LinkedList<String> colors = new LinkedList<>();
	        colors.add("Red");     // index 0
	        colors.add("Green");   // index 1
	        colors.add("Blue");    // index 2
	        colors.add("Yellow");
	        colors.add("Orange");

	        System.out.println("Original LinkedList: " + colors);

	        // Swap first (index 0) and third (index 2) elements
	        Collections.swap(colors, 0, 2);

	        System.out.println("LinkedList after swapping first and third elements: " + colors);
	    }
	}


