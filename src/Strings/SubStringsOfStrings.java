package Strings;

public class SubStringsOfStrings {
    public static void main(String[] args) {
        String s = "Jai Shree Ramm";
        // Jai
        String sub1 = s.substring(0,3);
        System.out.println(sub1);
        // Shree
        String sub2 = s.substring(4,9);
        System.out.println(sub2);
        // Ram
        String sub3 = s.substring(10);
        System.out.println(sub3);

        System.out.println(s.substring(3,s.length()-1));
    }
}
