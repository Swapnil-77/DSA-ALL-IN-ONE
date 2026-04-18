package DP;

public class WaystoReachNthStair {
    public static void main(String[] args) {
        WaystoReachNthStair obj = new WaystoReachNthStair();
        int n = 5;
        System.out.println(obj.countWays(n));
    }
    // 🔥 Space Optimized Tabulation
    int countWays(int n) {
        if (n <= 2) return n;

        int prev2 = 1; // dp[1]
        int prev1 = 2; // dp[2]

        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
    // 🔹 Tabulation (Bottom-Up DP, O(m*n) space) 🔹
    /*
        int countWays(int n) {
        if (n <= 2) return n;

        int[] dp = new int[n + 1];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }*/

    // 🔹 Memoization (Top-Down DP with recursion) 🔹
   /*
        int countWays(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return helper(n, dp);
    }

    int helper(int n, int[] dp) {
        if (n <= 2) return n;

        if (dp[n] != -1) return dp[n];

        dp[n] = helper(n - 1, dp) + helper(n - 2, dp);
        return dp[n];
    }*/
}
