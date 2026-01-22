package Strings;

public class BuiltInMethods {
    public static void main(String[] args) {
        String str = "HelloWorld";

        // Length of the string
        int length = str.length();
        System.out.println("Length: " + length);

        // Character at a specific index
        char ch = str.charAt(4);
        System.out.println("Character at index 4: " + ch);

        // Substring from index 0 to 5
        String substr = str.substring(0, 5);
        System.out.println("Substring (0 to 5): " + substr);

        // Convert to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase: " + lowerStr);

        // Replace characters
        String replacedStr = str.replace('o', 'a');
        System.out.println("Replaced 'o' with 'a': " + replacedStr);

        // Check if string contains a substring
        boolean contains = str.contains("World");
        System.out.println("Contains 'World': " + contains);

        // check is s.contains character
        boolean containsChar = str.indexOf('H') != -1;
        System.out.println("Contains character 'H': " + containsChar);


    }
}
