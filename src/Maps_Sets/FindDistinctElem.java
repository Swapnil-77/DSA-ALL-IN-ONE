package Maps_Sets;

import java.util.HashSet;

public class FindDistinctElem {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,4,5};
        System.out.println(distinct(arr));
    }
    static int distinct(int arr[]) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr) set.add(ele);
        return set.size();
    }
}
