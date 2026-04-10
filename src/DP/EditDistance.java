package DP;

public class EditDistance {
    public static void main(String[] args) {
        EditDistance obj = new EditDistance();
        String s1 = "horse", s2 = "ros";
        System.out.println(obj.editDistance(s1, s2));
    }

    // 🔹 Tabulation (Bottom-Up DP, O(m*n) space) 🔹
    public int editDistance(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                if(s1.charAt(i)==s2.charAt(j)) dp[i][j] = (i>=1 && j>=1) ? dp[i-1][j-1] : 0;
                else{
                    int replace = 1 + ((i>=1 && j>=1) ? dp[i-1][j-1] : (i==0 ? j+1 : i+1));
                    int remove = 1 + ((i>=1) ? dp[i-1][j] : j+1);
                    int insert = 1 + ((j>=1) ? dp[i][j-1] : i+1);
                    dp[i][j] = Math.min(replace,Math.min(remove,insert));
                }
            }
        }
        return dp[m-1][n-1]; // this is equivalent to edit(m-1,n-1)
    }


    // 🔹 Memoization (Top-Down DP with recursion) 🔹
        /*
        public int editDistance(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m][n];

        // initialize with -1
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        return edit(m - 1, n - 1, new StringBuilder(s1), new StringBuilder(s2), dp);
    }

    // i = m-1 to 0  j = n-1 to 0
    private int edit(int i, int j, StringBuilder s1, StringBuilder s2, int[][] dp) {

        // base cases
        if(i < 0) return j + 1; // insert remaining chars of s2
        if(j < 0) return i + 1; // remove extra chars of s1

        // dp check
        if(dp[i][j] != -1) return dp[i][j];

        // if match
        if(s1.charAt(i) == s2.charAt(j)) {
            return dp[i][j] = edit(i - 1, j - 1, s1, s2, dp);
        }

        // operations
        int replace = 1 + edit(i - 1, j - 1, s1, s2, dp);
        int remove  = 1 + edit(i - 1, j, s1, s2, dp);
        int insert  = 1 + edit(i, j - 1, s1, s2, dp);

        return dp[i][j] = Math.min(replace, Math.min(remove, insert));
    }*/

    // 🔹 Recursive (Brute Force) 🔹
    /*
    public int editDistance(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        return edit(m - 1, n - 1, new StringBuilder(s1), new StringBuilder(s2));
    }

    private int edit(int i, int j, StringBuilder s1, StringBuilder s2) {

        // base cases
        if (i < 0) return j + 1;   // insert remaining chars of s2
        if (j < 0) return i + 1;   // remove remaining chars of s1

        // if characters match
        if (s1.charAt(i) == s2.charAt(j)) {
            return edit(i - 1, j - 1, s1, s2);
        }

        // operations
        int replace = 1 + edit(i - 1, j - 1, s1, s2);
        int remove  = 1 + edit(i - 1, j, s1, s2);
        int insert  = 1 + edit(i, j - 1, s1, s2);

        return Math.min(replace, Math.min(remove, insert));
    }*/
}
