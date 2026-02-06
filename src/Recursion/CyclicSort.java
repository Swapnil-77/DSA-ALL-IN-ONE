package Recursion;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        cyclicSort(arr);
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
    public static void cyclicSort(int[] arr){
        int i = 0;

        while (i < arr.length) {
            if (arr[i] == i) {
                i++;
            } else {
                int idx = arr[i];
                swap(arr, i, idx);
            }
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
