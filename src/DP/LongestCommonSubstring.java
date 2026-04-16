package DP;

public class LongestCommonSubstring {
    // 🔹 Memoization (Top-Down DP) 🔹
    static int maxLen;
    public int longCommSubstr(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        maxLen = 0;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        solve(m - 1, n - 1, s1, s2, dp);
        return maxLen;
    }

    private int solve(int i, int j, String s1, String s2, int[][] dp) {
        if (i < 0 || j < 0) return 0;
        if (dp[i][j] != -1) return dp[i][j];

        // Always explore neighbors to ensure all paths are visited
        solve(i - 1, j, s1, s2, dp);
        solve(i, j - 1, s1, s2, dp);
        if (s1.charAt(i) == s2.charAt(j)) {
            int res = 1 + solve(i - 1, j - 1, s1, s2, dp);
            maxLen = Math.max(maxLen, res);
            return dp[i][j] = res;
        } else {
            return dp[i][j] = 0; // Reset suffix length to 0
        }
    }
}
    // 🔹 Recursive (Brute Force) 🔹
   /*
   static int maxLen;
    public int longCommSubstr(String s1, String s2) {
        // code here
        int m = s1.length(), n = s2.length();
        maxLen = 0;
        LCS(m - 1, n - 1, new StringBuilder(s1), new StringBuilder(s2));
        return maxLen;
    }

    private int LCS(int i, int j, StringBuilder a, StringBuilder b) {
        if (i < 0 || j < 0) return 0; // there is nothing in common

        if (a.charAt(i) == b.charAt(j)) {
            int len = 1 + LCS(i - 1, j - 1, a, b);
            maxLen = Math.max(maxLen, len);
            return len;
        } else {
            // Explore other possibilities but reset current substring length to 0
            LCS(i - 1, j, a, b);
            LCS(i, j - 1, a, b);
            return 0;
        }
    }
*/


