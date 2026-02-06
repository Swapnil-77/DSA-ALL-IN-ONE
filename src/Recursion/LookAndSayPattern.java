package Recursion;

public class LookAndSayPattern {
    public static void main(String[] args) {
        int n = 5;
        LookAndSayPattern obj = new LookAndSayPattern();
        System.out.println(obj.CountAndSay(n));
    }

    public String CountAndSay(int n) {
        if (n == 1) return "1";
        String s = CountAndSay(n - 1) + "@";
        String ans = ""; int i = 0, j = 0;
        while (j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) j++;
            else { int freq = j - i;
                ans += freq;
                ans += s.charAt(i);
                i = j;
            }
        }
        return ans;
    }
}
