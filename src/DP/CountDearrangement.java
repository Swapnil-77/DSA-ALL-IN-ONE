package DP;

public class CountDearrangement {

    public static void main(String[] args) {
        CountDearrangement obj = new CountDearrangement();
        int n = 5;
        System.out.println(obj.countDer(n));
    }
    // 🔹 Memoization (Top-Down DP, O(n) space) 🔹
    /*
    static int[] dp;
    static int countDer(int n) {
        if(n<=3) return n-1;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = (n-1)*(countDer(n-1)+countDer(n-2));
    }*/

    // 🔹 Tabulation (Bottom-Up DP, O(n) space) 🔹
    static int countDer(int n) {
        if(n<=3) return n-1;
        return (n-1)*(countDer(n-1)+countDer(n-2));
    }

    // 🔥 Space Optimized Tabulation (Bottom-Up DP, O(1) space) 🔥
    /*
    static int countDer(int n) {
        if(n<=3) return n-1;
        int prev2 = 1; // countDer(2)
        int prev1 = 2; // countDer(3)
        for(int i=4;i<=n;i++){
            int curr = (i-1)*(prev1+prev2);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
     }
     */
}
