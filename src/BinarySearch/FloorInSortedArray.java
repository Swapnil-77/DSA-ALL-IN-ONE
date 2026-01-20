package BinarySearch;

public class FloorInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 10, 10, 12, 19};
        int tar = 5;

        int ans = findFloor(arr, tar);
        System.out.println("Floor of " + tar + " is at index: " + ans);
    }
    static int findFloor(int[] arr, int tar) {
        int lo = 0, hi = arr.length - 1, idx = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>tar) hi = mid - 1;
            else{ // arr[mid] <= x
                idx = mid;
                lo = mid + 1;
            }
        }
        return idx;
    }
}
