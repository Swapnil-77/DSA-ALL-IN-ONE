package BinarySearch;

public class FirstOccurance {

    public static void main(String[] args) {
        FirstOccurance obj = new FirstOccurance();
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int tar = 2;

        int ans = obj.binarysearch(arr, tar);
        System.out.println("First Occurrence of " + tar + " is at index: " + ans);
    }

    public int binarysearch(int[] arr, int tar) {
        int lo = 0, hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] >= tar)
                hi = mid - 1;
            else
                lo = mid + 1;
        }

        if (lo < arr.length && arr[lo] == tar)
            return lo;

        return -1;
    }
}
