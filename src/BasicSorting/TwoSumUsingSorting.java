package BasicSorting;

import java.util.Arrays;

public class TwoSumUsingSorting {
    boolean twoSum(int arr[], int target) {
        Arrays.sort(arr); // time = nlogn , space = n
        int i = 0, j = arr.length - 1;
        while (i < j) { // time = n
            if (arr[i] + arr[j] == target) return true;
            else if (arr[i] + arr[j] > target) j--;
            else if (arr[i] + arr[j] < target) i++;
        }
        return false;
    }

    public static void main(String[] args) {
        TwoSumUsingSorting obj = new TwoSumUsingSorting();
        int[] arr = {2, 4, 6, 3, 5, 7, 9};
        int target = 10;

        System.out.println(obj.twoSum(arr, target));
    }
}
