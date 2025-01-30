public class stuff{
    int[][] edges;
    int v;
    int e;

    public stuff(int node){
        this.v = node;
        this.edges = new int[node][node];
        this.e = 0;
    }

    public void addEdge(int u, int v){
        this.edges[u][v] = 1;
        this.edges[v][u] = 1;
    }

    public String toString(){
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
    public static void main(String[] args){
        stuff ug = new stuff(4);
        ug.addEdge(0, 1); 
        ug.addEdge(1, 2);
        ug.addEdge(2, 3);
        ug.addEdge(3, 0);
        System.out.println(ug);
    }
}