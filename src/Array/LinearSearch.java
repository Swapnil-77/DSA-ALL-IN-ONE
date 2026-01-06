package Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 3, 27, 53, 18, 62, 88, 6, 53};
        int target = 53;
        int targetIndex = -1; // Standard "not found" value

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                targetIndex = i;
                break; // Stop at the first 53 found
            }
        }

        if (targetIndex != -1) {
            System.out.println("Target found at index: " + targetIndex);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
