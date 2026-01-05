package Array;

public class MinElemOfArray {
    public static void main(String[] args) {
        int arr[] = {45, 23, 78, 5, 12, 90};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
    }
        }
        System.out.println("Minimum element in the array: " + min);
    }
}
