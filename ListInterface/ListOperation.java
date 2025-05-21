/*Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
*and a LinkedList to perform the following operations with different functions directed as
*follows
*1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
*Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
*size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the lis
*/


package arryalist;

import java.util.*;

public class ListOperations {

    public static void main(String[] args) {
        // Step 1: Initialize both ArrayList and LinkedList
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        System.out.println("----- ArrayList Operations -----");
        performOperations(arrayList);

        System.out.println("\n----- LinkedList Operations -----");
        performOperations(linkedList);
    }

    public static void performOperations(List<String> list) {
        // 1. Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("After adding elements: " + list);

        // 2. Adding element at specific index
        list.add(1, "Grapes");
        System.out.println("After adding 'Grapes' at index 1: " + list);

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Mango", "Pineapple");
        list.addAll(moreFruits);
        System.out.println("After adding multiple elements: " + list);

        // 4. Accessing elements
        System.out.println("Element at index 2: " + list.get(2));

        // 5. Updating elements
        list.set(2, "Strawberry");
        System.out.println("After updating index 2 to 'Strawberry': " + list);

        // 6. Removing elements
        list.remove("Banana");
        list.remove(0); // remove by index
        System.out.println("After removing 'Banana' and element at index 0: " + list);

        // 7. Searching elements
        System.out.println("Contains 'Mango': " + list.contains("Mango"));
        System.out.println("Index of 'Mango': " + list.indexOf("Mango"));

        // 8. List size
        System.out.println("List size: " + list.size());

        // 9. Iterating over list using for-each
        System.out.print("Iterating with for-each: ");
        for (String fruit : list) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 10. Using Iterator
        System.out.print("Iterating with Iterator: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 11. Sorting
        Collections.sort(list);
        System.out.println("After sorting: " + list);

        // 12. Sublist
        if (list.size() >= 3) {
            List<String> sublist = list.subList(1, 3); // exclusive end index
            System.out.println("Sublist (index 1 to 2): " + sublist);
        }

        // 13. Clearing the list
        list.clear();
        System.out.println("After clearing: " + list);
    }
}
