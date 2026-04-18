package DP;

import java.util.Arrays;

public class MinimumCostToCutStick {
    public static void main(String[] args) {
        int n = 8;
        int[] cuts = {1, 6, 3, 5};
        System.out.println(minCutCost(n,cuts));
    }
    // 🔹 Tabulation (Bottom-Up DP, O(n^2) space) 🔹
    public static int minCutCost(int n, int[] cuts) {
        int[] arr = new int[cuts.length+2];
        for(int i=0;i<cuts.length;i++){
            arr[i] = cuts[i];
        }
        arr[arr.length-1] = 0;
        arr[arr.length-2] = n;
        Arrays.sort(arr);
        int[][] dp = new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                dp[i][j] = -1;
            }
        }
        return stick(0,arr.length-1,arr,dp);
    }
    // i: 0 to n-1   j: n-1 to 0
    private static int stick(int i, int j, int[] arr, int[][] dp) {
        if(j==i+1) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int mincost = Integer.MAX_VALUE;
        for(int k=i+1;k<=j-1;k++){
            int cost = (arr[j]-arr[i]) + stick(i,k,arr,dp) + stick(k,j,arr,dp);
            mincost = Math.min(mincost,cost);
        }
        return dp[i][j] = mincost;
    }
}
