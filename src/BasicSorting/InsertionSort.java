package BasicSorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
       // Insertion sort algorithm
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j > 0 && arr[j] < arr[j - 1]) {
              int temp = arr[j];
              arr[j] = arr[j - 1];
              arr[j - 1] = temp;
              j--;
        }
    }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
