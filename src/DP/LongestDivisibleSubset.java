package DP;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestDivisibleSubset {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,8,12,24};
        LongestDivisibleSubset obj = new LongestDivisibleSubset();
        System.out.println(obj.largestSubset(arr));
    }
    // 🔹 Tabulation (Bottom-Up DP, O(n^2) time, O(n) space) 🔹
    public ArrayList<Integer> largestSubset(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        int[] dp = new int[n];
        int[] next = new int[n]; // 🔥 for reconstruction

        Arrays.fill(dp, 1);
        Arrays.fill(next, -1);

        int maxLen = 1;

        for (int i = n - 2; i >= 0; i--) {
            int max = 0;
            int bestIdx = -1;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] % arr[i] == 0) {
                    if (dp[j] > max || (dp[j] == max &&
                            arr[j] > arr[bestIdx])) {
                        max = dp[j];
                        bestIdx = j;
                    }
                }
            }

            dp[i] += max;
            next[i] = bestIdx; // 🔥 store next element

            maxLen = Math.max(maxLen, dp[i]);
        }

        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] == maxLen) {
                idx = i; // lexicographically greatest
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        // 🔥 reconstruction
        while (idx != -1) {
            ans.add(arr[idx]);
            idx = next[idx];
        }

        return ans;
    }
}
