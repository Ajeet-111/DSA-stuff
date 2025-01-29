public class UndirectedGraph{
    int v; // numbner of vertices
    int e; // number of edges

    int[][] matrix;

    public UndirectedGraph(int nodes){
        this.v = nodes;
        this.e = 0;
        this.matrix = new int[nodes][nodes];
    }

    public void addEdge(int i, int j){
        this.matrix[i][j] = 1;
        this.matrix[j][i] = 1; //one node is two cells of matrix.
        // because it is an undirected graph.
        e++;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(v + " vertices, " + e + " edges " + "\n");
        for (int i = 0; i < v; i++) {
            sb.append(i + ": ");
            for (int w : matrix[i]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args){
        UndirectedGraph ug = new UndirectedGraph(4);
        ug.addEdge(0, 1); 
        ug.addEdge(1, 2);
        ug.addEdge(2, 3);
        ug.addEdge(3, 0);
        System.out.println(ug);
    }
}