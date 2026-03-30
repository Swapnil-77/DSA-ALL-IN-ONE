package Maps_Sets;

import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int target = 9;
        TwoSum obj = new TwoSum();
        System.out.println(obj.twoSum(arr,target));
    }
    boolean twoSum(int arr[], int target) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            int rem = target - ele;
            if(set.contains(rem)) return true;
            set.add(ele);
        }
        return false;
    }
}
