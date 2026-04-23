package Graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KeysAndRooms {
    public static void main(String[] args) {
        List<List<Integer>> adj = new LinkedList<>();
        adj.add(List.of(1));
        adj.add(List.of(2));
        adj.add(List.of(3));
        adj.add(List.of());
        KeysAndRooms obj = new KeysAndRooms();
        System.out.println(obj.canVisitAllRooms(adj));
    }
    //bfs solution
    public boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n = adj.size();
        boolean[] visited = new boolean[n];
        visited[0] = true;
        bfs(0, adj, visited);
        for (boolean ele : visited) {
            if (ele == false) return false;
        }
        return true;
    }

    private void bfs(int start, List<List<Integer>> adj, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while (q.size() > 0) {
            int front = q.remove();
            for (int ele : adj.get(front)) {
                if (!visited[ele]) {
                    visited[ele] = true;
                    q.add(ele);
                }
            }
        }
    }
}
