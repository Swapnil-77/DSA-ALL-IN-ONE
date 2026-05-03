package BinarySearch;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] stalls = {1, 2, 4, 8, 9, 10};
        int k = 3;
        AggressiveCows ac = new AggressiveCows();
        System.out.println(ac.aggressiveCows(stalls, k));
    }
    public int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);

        int lo = 1;
        int hi = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;

        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;

            if(canPlace(stalls, k, mid)){
                ans = mid;
                lo = mid + 1;   // try bigger distance 🔥
            } else {
                hi = mid - 1;
            }
        }

        return ans;
    }

    private static boolean canPlace(int[] stalls, int k, int dist){
        int cows = 1; // first cow at first stall
        int last = stalls[0];

        for(int i = 1; i < stalls.length; i++){
            if(stalls[i] - last >= dist){
                cows++;
                last = stalls[i];
            }
        }

        return cows >= k;
    }
}
