package Arrays2D;

import java.util.ArrayList;

public class SnakePattern {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        ArrayList<Integer> result = snakePattern(matrix);
        System.out.println(result);
    }
    public static ArrayList<Integer> snakePattern(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // Traverse left to right
                for (int j = 0; j < cols; j++) {
                    result.add(matrix[i][j]);
                }
            } else {
                // Traverse right to left
                for (int j = cols - 1; j >= 0; j--) {
                    result.add(matrix[i][j]);
                }
            }
        }

        return result;
    }
}

