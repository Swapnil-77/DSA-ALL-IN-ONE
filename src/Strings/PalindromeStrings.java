package Strings;

public class PalindromeStrings {
    public static void main(String[] args) {
        PalindromeStrings obj = new PalindromeStrings();
        String str = "racecar";
        boolean ans = obj.isPalindrome(str);
        System.out.println("Is the string a palindrome? " + ans);
    }
    boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
