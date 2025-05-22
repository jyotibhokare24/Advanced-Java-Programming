/*Develop a java program for performing various string operations with different string
handling functions directed as follows:
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
startsWith() and endsWith() */




package stringhandlingfunc;

public class StringHandlingDemo {
	public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 2 in str1: " + str1.charAt(2));

        // 3. String Comparison
        System.out.println("str1 equals str2? " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase 'HELLO'? " + str1.equalsIgnoreCase("HELLO"));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

        // 4. String Searching
        String text = "Java is a powerful language. Java is popular.";
        System.out.println("Index of 'Java': " + text.indexOf("Java"));
        System.out.println("Last index of 'Java': " + text.lastIndexOf("Java"));
        System.out.println("Does it contain 'powerful'? " + text.contains("powerful"));

        // 5. Substring Operations
        System.out.println("Substring from index 5 to 14: " + text.substring(5, 14));

        // 6. String Modification
        String modified = text.replace("Java", "Python");
        System.out.println("After replacement: " + modified);

        // 7. Whitespace Handling
        String messy = "   Hello AIET!   ";
        System.out.println("Before trim: '" + messy + "'");
        System.out.println("After trim: '" + messy.trim() + "'");

        // 8. String Concatenation
        String joined = str1 + " " + str2;
        System.out.println("Concatenated string: " + joined);

        // 9. String Splitting
        String colors = "Red,Green,Blue,Yellow";
        String[] colorArray = colors.split(",");
        System.out.println("Split colors:");
        for (String color : colorArray) {
            System.out.println("- " + color);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Welcome");
        sb.append(" to ");
        sb.append("AIET");
        sb.insert(7, " Everyone");
        sb.replace(0, 7, "Hi");
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "John";
        int age = 21;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted string: " + formatted);

        // 12. Validate Email with contains(), startsWith(), endsWith()
        String email = "student@aiet.edu.in";
        boolean isValid = email.contains("@") && email.startsWith("student") && email.endsWith(".edu.in");
        System.out.println("Email: " + email);
        System.out.println("Is valid email? " + isValid);
    }
}

