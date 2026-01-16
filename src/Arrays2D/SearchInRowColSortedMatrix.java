package Arrays2D;

public class SearchInRowColSortedMatrix {
    public static void main(String[] args) {
        int arr[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int x = 29;
        System.out.println(matSearch(arr, x));
    }
    public static boolean matSearch(int arr[][], int x) {
        int m = arr.length, n = arr[0].length;
        int i=0, j=n-1;
        while(i<m && j>=0){
            if(arr[i][j]==x) return true;
            else if(arr[i][j]<x) i++;
            else j--;
        }
        return false;
    }
}
