/*Develop a java program for performing various string operations with different string
handling functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String
Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
contains( ) and startsWith() and endsWith() */



package string;

public class StringOperationsDemo {
	public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 3. String Comparison
        System.out.println("str1 equals str2? " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase 'HELLO'? " + str1.equalsIgnoreCase("HELLO"));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

        // 4. String Searching
        String sentence = "Java is powerful and Java is fast";
        System.out.println("First index of 'Java': " + sentence.indexOf("Java"));
        System.out.println("Last index of 'Java': " + sentence.lastIndexOf("Java"));
        System.out.println("Does the sentence contain 'powerful'? " + sentence.contains("powerful"));

        // 5. Substring Operations
        System.out.println("Substring from index 5 to 14: " + sentence.substring(5, 14));

        // 6. String Modification
        System.out.println("Replace 'Java' with 'Python': " + sentence.replace("Java", "Python"));

        // 7. Whitespace Handling
        String messy = "   Trim this string!   ";
        System.out.println("Before trim: '" + messy + "'");
        System.out.println("After trim: '" + messy.trim() + "'");

        // 8. String Concatenation
        String joined = str1.concat(" ").concat(str2);
        System.out.println("Concatenated String: " + joined);

        // 9. String Splitting
        String csv = "Apple,Banana,Orange";
        String[] fruits = csv.split(",");
        System.out.println("Split string:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        // 10. StringBuilder Demo (for mutable strings)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(6, 11, " Java");
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        int age = 25;
        String name = "Alice";
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted string: " + formatted);

        // 12. Email Validation using contains(), startsWith(), endsWith()
        String email = "example@mail.com";
        boolean isValid = email.contains("@") && email.endsWith(".com") && !email.startsWith("@");
        System.out.println("Email: " + email);
        System.out.println("Is valid email? " + isValid);
    }
}


