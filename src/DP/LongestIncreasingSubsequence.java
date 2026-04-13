package DP;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};
        System.out.println(lis(arr));
    }
    // TABULATION (BOTTOM-UP DP)
        static int lis(int arr[]) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int maxLen = 1;
        for(int i=1;i<n;i++){
            int max = 0;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){ // arr[i] % arr[j] == 0
                    max = Math.max(max,dp[j]);
                }
            }
            dp[i] += max;
            maxLen = Math.max(maxLen,dp[i]);
        }
        // return dp[n-1]; // 2 3 4 5 6 1
        return maxLen;
    }

    // MEMOIZATION (TOP-DOWN DP WITH RECURSION)
        /*
        static int lis(int arr[]) {
        int n = arr.length;
        int[][] dp = new int[n][n+1];
        for(int i=0;i<n;i++)
            for(int j=0;j<=n;j++)
                dp[i][j] = -1;
        return helper(0,-1,arr,dp);
    }
    // idx -> 0 to n-1   prev -> -1 to n-1  (0 to n)
    static int helper(int idx, int prev, int[] arr, int[][] dp) {
        if(idx==arr.length) return 0;
        if(dp[idx][prev+1]!=-1) return dp[idx][prev+1];
        int skip = helper(idx+1,prev,arr,dp);
        if(prev!=-1 && arr[idx]<=arr[prev]) return dp[idx][prev+1] = skip;
        int pick =  1 + helper(idx+1,idx,arr,dp);
        return dp[idx][prev+1] = Math.max(pick,skip);
    }*/
}
