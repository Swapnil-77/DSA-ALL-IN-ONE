package DP;

public class FriendsPairingProblem {
    public static void main(String[] args) {
        int n = 4;
        FriendsPairingProblem obj = new FriendsPairingProblem();
        System.out.println(obj.countFriendsPairings(n));
    }
    // memoization
    public long countFriendsPairings(int n) {
        long[] dp = new long[n+1];
        return friends(n,dp);
    }
    public long friends(int n, long[] dp) {
        if(n<=2) return n;
        if(dp[n]!=0) return dp[n];
        return dp[n] = friends(n-1,dp) + (n-1)*friends(n-2,dp);
    }

    // tabulation
     /*
        public long countFriendsPairings(int n) {
         long[] dp = new long[n+1];
         dp[0] = 1; // Base case: 1 way to pair 0 friends (do nothing)
         dp[1] = 1; // Base case: 1 way to pair 1 friend (the friend remains single)
         for (int i = 2; i <= n; i++) {
             dp[i] = dp[i - 1] + (i - 1) * dp[i - 2];
         }
         return dp[n];
     } */

    // space optimized tabulation
    /*
    public long countFriendsPairings(int n) {
        if (n <= 2) return n;
        long prev2 = 1; // dp[0]
        long prev1 = 1; // dp[1]
        for (int i = 2; i <= n; i++) {
            long curr = prev1 + (i - 1) * prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
     */
}
