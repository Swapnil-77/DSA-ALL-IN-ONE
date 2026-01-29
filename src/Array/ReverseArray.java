package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverse(int[] array){
        int start = 0;
        int end = array.length - 1;
        while(start < end){
            // swap
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
