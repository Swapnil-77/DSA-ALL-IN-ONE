package Graph;

import java.util.LinkedList;
import java.util.Queue;

class Pair {
    int row;
    int col;

    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        NumberOfIslands obj = new NumberOfIslands();
        System.out.println(obj.numIslands(grid));
    }

    //bfs approach
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        boolean[][] vis = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If we find unvisited land, it's a new island
                if (grid[i][j] == '1' && vis[i][j] == false) {
                    bfs(i, j, grid, vis);
                    count++;
                }
            }
        }
        return count;
    }

    private void bfs(int i, int j, char[][] grid, boolean[][] vis) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i, j));
        vis[i][j] = true; // Mark the starting point as visited

        while (q.size() > 0) {
            Pair front = q.remove();
            int row = front.row;
            int col = front.col;

            // top -> row-1, col
            if (row > 0) {
                if (vis[row - 1][col] == false && grid[row - 1][col] == '1') {
                    q.add(new Pair(row - 1, col));
                    vis[row - 1][col] = true;
                }
            }

            // bottom -> row+1, col
            if ((row + 1) < m) {
                if (vis[row + 1][col] == false && grid[row + 1][col] == '1') {
                    q.add(new Pair(row + 1, col));
                    vis[row + 1][col] = true;
                }
            }

            // left -> row, col-1
            if (col > 0) {
                if (vis[row][col - 1] == false && grid[row][col - 1] == '1') {
                    q.add(new Pair(row, col - 1));
                    vis[row][col - 1] = true;
                }
            }

            // right -> row, col+1
            if ((col + 1) < n) {
                if (vis[row][col + 1] == false && grid[row][col + 1] == '1') {
                    q.add(new Pair(row, col + 1));
                    vis[row][col + 1] = true;
                }
            }
        }
    }
}
