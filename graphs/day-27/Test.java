import java.util.*;

public class Test {
    int[][] edges;
    int v;
    int e;

    Test(int node) {
        this.v = node;
        this.edges = new int[node][node];
        this.e = 0;
    }

    public void addEdge(int i, int j) {
        edges[i][j] = 1;
        edges[j][i] = 1;
        e++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(v).append(" vertices, ").append(e).append(" edges\n");
        for (int i = 0; i < v; i++) {
            sb.append(i).append(": ");
            for (int j = 0; j < v; j++) {
                if (edges[i][j] == 1) {
                    sb.append(j).append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void bfs(int s) {
        boolean[] visited = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;  // Mark as visited when enqueued
        q.offer(s);

        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int j = 0; j < v; j++) {
                if (edges[u][j] == 1 && !visited[j]) {
                    q.offer(j);
                    visited[j] = true;
                }
            }
        }
        System.out.println();
    }

    public void dfs(int s) {
        boolean[] visited = new boolean[v];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);

        while (!stack.isEmpty()) {
            int u = stack.pop();
            if (!visited[u]) {
                visited[u] = true;
                System.out.print(u + " ");
                for (int j = v - 1; j >= 0; j--) { // Reverse order for correct DFS sequence
                    if (edges[u][j] == 1 && !visited[j]) {
                        stack.push(j);
                    }
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Test ug = new Test(5);
        ug.addEdge(0, 1);
        ug.addEdge(1, 2);
        ug.addEdge(2, 3);
        ug.addEdge(3, 0);
        ug.addEdge(3, 4);

        System.out.println("BFS Traversal:");
        ug.bfs(3);

        System.out.println("DFS Traversal:");
        ug.dfs(3);
    }
}
