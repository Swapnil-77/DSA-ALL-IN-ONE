package DP;

import java.util.Arrays;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost = {10,15,20,5};
        System.out.println(minCostClimbingStairs(cost));
    }

    // 🔥 Space Optimized Tabulation (Bottom-Up DP, O(1) space)
    static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        int prev2 = cost[0]; // dp[i-2]
        int prev1 = cost[1]; // dp[i-1]

        for(int i = 2; i < n; i++) {
            int curr = cost[i] + Math.min(prev1, prev2);

            prev2 = prev1;
            prev1 = curr;
        }

        return Math.min(prev1, prev2);
    }

    // 🔹 Tabulation (Bottom-Up DP, O(n) space) 🔹
/*
        static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n]; // 0 to n-1
        dp[0] = cost[0]; dp[1] = cost[1];
        for(int i=2;i<n;i++){
            dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[n-2],dp[n-1]);
    }*/

    // 🔹 Memoization (Top-Down DP with recursion) 🔹
   /*
        static int[] dp;
        static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        dp = new int[n]; // 0 to n-1
        Arrays.fill(dp,-1); // mark unvisited
        return Math.min(minCost(0,cost),minCost(1,cost));
    }

        .static int minCost(int i, int[] cost) { // i-> 0 n-1
        if(i>=cost.length) return 0;
        if(dp[i]!=-1) return dp[i];
        return dp[i] = cost[i] + Math.min(minCost(i+1,cost),minCost(i+2,cost));
    }*/
}
