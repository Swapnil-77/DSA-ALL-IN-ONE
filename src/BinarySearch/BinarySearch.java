package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,16,18,20};
        int tar = 15;
        System.out.println(searchInSorted(arr, tar));
    }
    static boolean searchInSorted(int arr[], int tar) {
        int lo = 0, hi = arr.length - 1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>tar) hi = mid - 1;
            else if(arr[mid]<tar) lo = mid + 1;
            else return true;
        }
        return false;
    }
}
