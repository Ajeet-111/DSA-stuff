class isConnected{
    int[][] edges;
    int v;
    int e;

    public isConnected(int node) {
        this.v = node;
        this.edges = new int[node][node];
        this.e = 0;
    }

    public void addEdge(int u, int v) {
        this.edges[u][v] = 1;
        this.edges[v][u] = 1;
        this.e++;
    }

    public boolean connected() {
        boolean[] visited = new boolean[v];
        int count = 0;

        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                dfs(i, visited);
                count++;
            }
        }

        return count == 1;
    }

    private void dfs(int s, boolean[] visited) {
        visited[s] = true;
        for (int i = 0; i < v; i++) { 
            if (edges[s][i] == 1 && !visited[i]) {
                dfs(i, visited);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(v).append(" vertices, ").append(e).append(" edges\n");
        for (int i = 0; i < v; i++) {
            sb.append(i).append(": ");
            for (int j = 0; j < v; j++) {
                if (edges[i][j] == 1) sb.append(j).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        isConnected graph = new isConnected(5);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(3, 4);

        System.out.println(graph);
        System.out.println("Is graph connected? " + graph.connected());
    }
}
