package DP;

public class NumberOfPaths {
    public static void main(String[] args) {
        int m = 3, n = 7;
        NumberOfPaths obj = new NumberOfPaths();
        System.out.println(obj.numberOfPaths(m,n));
    }

    // 🔥 Space Optimized Tabulation (Bottom-Up DP, O(n) space using 2 rows)
    public int numberOfPaths(int m, int n) {
        if(m==1 || n==1) return 1;
        int[][] dp = new int[2][n];
        for(int j=0;j<n;j++){ // filling 0th row with 1
            dp[0][j] = 1;
        }
        dp[1][0] = 1;
        for(int a=1;a<=m-1;a++){
            // filling 1st row
            for(int j=1;j<n;j++){
                dp[1][j] = dp[0][j] + dp[1][j-1];
            }
            // copying 1st row to 0th row
            for(int j=1;j<n;j++){
                dp[0][j] = dp[1][j];
            }
        }
        return dp[1][n-1];
    }

    // 🔹 Tabulation (Bottom-Up DP, O(m*n) space) 🔹
/*
        public int numberOfPaths(int m, int n) {
        int[][] dp = new int[m][n]; // rows-> 0 to m, cols-> 0 to n
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0) dp[i][j] = 1;
                else dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }*/

    // 🔹 Memoization (Top-Down DP with recursion) 🔹
/*
    static int[][] dp;
    public int numberOfPaths(int m, int n) {
        dp = new int[m+1][n+1]; // rows-> 0 to m, cols-> 0 to n
        return paths(m,n);
    }
    public int paths(int m, int n) { // m to 1, n to 1
        if(m==1 || n==1) return 1;
        if(dp[m][n]!=0) return dp[m][n];
        return dp[m][n] = paths(m-1,n) + paths(m,n-1);
    }*/
}

