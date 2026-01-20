package BinarySearch;

import java.util.ArrayList;

public class FirstAndLastOccurance {
    public static void main(String[] args) {
        FirstAndLastOccurance fl = new FirstAndLastOccurance();
        int arr[] = {5,7,7,8,8,10};
        int tar = 8;
        ArrayList<Integer> ans = fl.find(arr, tar);
        System.out.println(ans);
    }
    ArrayList<Integer> find(int arr[], int tar) {
        ArrayList<Integer> ans = new ArrayList<>();
        // first occurence
        int lo = 0, hi = arr.length - 1, idx = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]<tar) lo = mid + 1;
            else if(arr[mid]>tar) hi = mid - 1;
            else{ // arr[mid] = tar
                idx = mid;
                hi = mid - 1;
            }
        }
        ans.add(idx);
        // last occurence
        lo = 0;
        hi = arr.length - 1;
        idx = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]<tar) lo = mid + 1;
            else if(arr[mid]>tar) hi = mid - 1;
            else{ // arr[mid] = tar
                idx = mid;
                lo = mid + 1;
            }
        }
        ans.add(idx);
        return ans;
    }
}
