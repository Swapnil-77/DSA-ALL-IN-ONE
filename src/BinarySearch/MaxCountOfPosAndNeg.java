package BinarySearch;

public class MaxCountOfPosAndNeg {
    public static void main(String[] args) {
        int[] arr = {-3, -2, -1, 0, 1, 2, 3, 4};
        int ans = maxCount(arr);
        System.out.println("Maximum count of positive and negative numbers: " + ans);
    }

    static int maxCount(int[] arr) {
        int n = arr.length;
        int negCount = countNegatives(arr);
        int posCount = n - negCount;
        return Math.max(negCount, posCount);
    }

    static int countNegatives(int[] arr) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] < 0) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo; // 'lo' is the count of negative numbers
    }
}
