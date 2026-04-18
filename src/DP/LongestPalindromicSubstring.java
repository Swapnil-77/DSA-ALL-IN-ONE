package DP;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        LongestPalindromicSubstring obj = new LongestPalindromicSubstring();
        System.out.println(obj.getLongestPal(s));
    }
    // 🔹 Tabulation (Bottom-Up DP, O(n^2) space) 🔹
    public String getLongestPal(String s) {
        int n = s.length();
        if (n == 0) return "";

        int[][] dp = new int[n][n];
        int maxLen = 1;

        // Phase 1: Fill the DP table diagonally
        for (int i = 0; i < n; i++) {
            int row = 0;
            for (int col = i; col < n; col++, row++) {
                // Base Case: Single character palindromes
                if (row == col) {
                    dp[row][col] = 1;
                }
                // Check if the characters at the boundaries match
                else if (s.charAt(row) == s.charAt(col)) {
                    // Case for 2-character strings (e.g., "aa")
                    if (col - row == 1) {
                        dp[row][col] = 2;
                    }
                    // Case for strings longer than 2: check if the inner part is a palindrome
                    else if (dp[row + 1][col - 1] != 0) {
                        dp[row][col] = dp[row + 1][col - 1] + 2;
                    }
                }

                // Track the maximum length found
                maxLen = Math.max(maxLen, dp[row][col]);
            }
        }

        // Phase 2: Retrieve the substring with the maxLen
        String ans = "";
        for (int i = 0; i < n; i++) {
            int row = 0;
            for (int col = i; col < n; col++, row++) {
                if (dp[row][col] == maxLen) {
                    ans = s.substring(row, col + 1);
                    return ans;
                }
            }
        }

        return ans;
    }
}
