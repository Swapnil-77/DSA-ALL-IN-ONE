package DP;

public class NthFibonacci {
    public static void main(String[] args) {
        int n = 6;
        NthFibonacci obj = new NthFibonacci();
        System.out.println(obj.nthFibonacci(n));
    }

    // 🔥 Space Optimized Tabulation (Bottom-Up DP, O(1) space)
    public int nthFibonacci(int n) {
        if(n<=1) return n;
        int[] dp = new int[3];
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[2] = dp[1] + dp[0];
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        return dp[2];
    }

    // 🔹 Tabulation (Bottom-Up DP, O(n) space) 🔹
/*
        public int nthFibonacci(int n) {
        int[] dp = new int[n+1]; // idx from 0 to n
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }*/

    // 🔹 Memoization (Top-Down DP with recursion) 🔹

/*
    static int[] dp;
    public int fibo(int n) {
        if(n<=1) return n;
        if(dp[n]!=0) return dp[n]; // memo check
        int ans = fibo(n-1) + fibo(n-2);
        dp[n] = ans; // store result
        return ans;
    }
    public int nthFibonacci(int n) {
        dp = new int[n+1]; // idx from 0 to n
        return fibo(n);
    }*/
}