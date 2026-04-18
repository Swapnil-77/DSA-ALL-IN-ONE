package BinarySearch;

public class SmallestDivisor {
    public static void main(String[] args) {
        SmallestDivisor obj = new SmallestDivisor();
        int[] arr = {1, 2, 5, 9};
        int k = 6;
        System.out.println(obj.smallestDivisor(arr, k)); // Output: 5
    }
    int smallestDivisor(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        for(int ele : arr){
            max = Math.max(max, ele);
        }

        int lo = 1, hi = max, ans = max;

        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;

            if(isValid(arr, mid, k)){
                ans = mid;
                hi = mid - 1;   // try smaller divisor
            } else {
                lo = mid + 1;   // need bigger divisor
            }
        }

        return ans;
    }

    private boolean isValid(int[] arr, int d, int k){
        int sum = 0;

        for(int ele : arr){
            sum += (ele + d - 1) / d;  // ceil division
        }

        return sum <= k;
    }
}
