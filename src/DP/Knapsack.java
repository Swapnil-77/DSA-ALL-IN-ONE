package DP;

public class Knapsack {

    // 🔹 Tabulation (Bottom-Up DP, O(n*capacity) space) 🔹
    static int knapsack(int capacity, int val[], int wt[]) {
        int n = val.length;
        int[][] dp = new int[n][capacity + 1];
        return helper(0, capacity, val, wt, dp);
    }

    // i->0 to n-1    capacity -> capacity to 0
    static int helper(int i, int capacity, int[] val, int[] wt, int[][] dp) {
        if (i == val.length) return 0;
        if (dp[i][capacity] != 0) return dp[i][capacity];
        int skip = helper(i + 1, capacity, val, wt, dp);
        if (capacity < wt[i]) return dp[i][capacity] = skip;
        int pick = val[i] + helper(i + 1, capacity - wt[i], val, wt, dp);
        return dp[i][capacity] = Math.max(pick, skip);
    }

    // 🔹 Memoization (Top-Down DP with recursion) 🔹
    /*
    static int[] dp;
    static int knapsack(int capacity, int val[], int wt[]) {
        int n = val.length;
        dp = new int[capacity+1];
        return helper(0,capacity,val,wt);
    }
    // i->0 to n-1    capacity -> capacity to 0
    static int helper(int i, int capacity, int[] val, int[] wt) {
        if(i==val.length) return 0;
        if(dp[capacity]!=0) return dp[capacity];
        int skip = helper(i+1,capacity,val,wt);
        if(capacity<wt[i]) return dp[capacity] = skip;
        int pick = val[i] + helper(i+1,capacity-wt[i],val,wt);
        return dp[capacity] = Math.max(pick,skip);
     }
     */

    // 🔥 Space Optimized Tabulation (Bottom-Up DP, O(capacity) space) 🔥
    /*
    static int knapsack(int capacity, int val[], int wt[]) {
        int n = val.length;
        int[] dp = new int[capacity+1];
        for(int i=0;i<n;i++){
            for(int c=capacity;c>=0;c--){
                int skip = dp[c];
                if(c<wt[i]) continue;
                int pick = val[i] + dp[c-wt[i]];
                dp[c] = Math.max(pick,skip);
            }
        }
        return dp[capacity];
    }
     */
}
