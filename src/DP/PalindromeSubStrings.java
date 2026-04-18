package DP;

public class PalindromeSubStrings {
    public static void main(String[] args) {
        String s = "ababa";
        PalindromeSubStrings obj = new PalindromeSubStrings();
        System.out.println(obj.countPS(s));
    }
    public int countPS(String s) {
        // code here
        int n = s.length();

        boolean[][] dp = new boolean[n][n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int row = 0, col = i; col < n; row++, col++) {

                if (row == col) dp[row][col] = true;

                else if (s.charAt(row) == s.charAt(col)) {
                    if (col == row + 1) dp[row][col] = true;
                    else dp[row][col] = dp[row + 1][col - 1];
                }

                if (dp[row][col] && row != col) count++; // length >= 2
            }
        }

        return count;
    }
}
