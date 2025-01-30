import java.util.Stack;

public class dfsExample {
    int[][] edges;
    int v;
    int e;

    public dfsExample(int node) {
        this.v = node;
        this.edges = new int[node][node];
        this.e = 0;
    }

    public void addEdge(int u, int v) {
        this.edges[u][v] = 1;
        this.edges[v][u] = 1;
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
                for (int v : edges[u]) {
                    if (!visited[v]) {
                        stack.push(v);
                    }
                }
            }
        }
    }

    // Recursive
    public void dfs() {
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                recursiveDFS(i, visited);
            }
        }
    }

    public void recursiveDFS(int s, boolean[] visited) {
        visited[s] = true;
        System.out.print(s + " ");
        for (int b : edges[s]) {
            if (!visited[b]) {
                recursiveDFS(b, visited);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(v + " vertices ," + e + " edges");
        for (int i = 0; i < v; i++) {
            sb.append(i + ": ");
            for (int w : edges[i]) {
                sb.append(w + " ");
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        dfsExample ug = new dfsExample(5);
        ug.addEdge(0, 1);
        ug.addEdge(1, 2);
        ug.addEdge(2, 3);
        ug.addEdge(3, 0);
        ug.addEdge(4, 4);
        // System.out.println(ug);
        ug.dfs();
    }
}