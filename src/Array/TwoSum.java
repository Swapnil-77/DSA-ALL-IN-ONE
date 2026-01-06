package Array;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 3, 5, 7, 9};
        int target = 10;

        System.out.println(twoSum(arr, target));
    }

    public static boolean twoSum(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target)
                    return true;
            }
        }
        return false;
    }
}
