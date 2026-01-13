package Arrays2D;

import java.util.Scanner;

public class OutputIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int [][ ] arr = new int[3][4]; // 3 rows and 4 columns
//        int[][] arr = {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9}
//        };

        // input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
