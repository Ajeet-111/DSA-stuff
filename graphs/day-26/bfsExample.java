import java.util.*;

public class bfsExample{
    int[][] edges;
    int v;
    int e;

    public bfsExample(int node){
        this.v = node;
        this.edges = new int[node][node];
        this.e = 0;
    }

    public void addEdge(int u, int v){
        this.edges[u][v] = 1;
        this.edges[v][u] = 1;
    }

    public void bfs(int s){
        boolean[] visited = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.offer(s);
        while(!q.isEmpty()){
            int u = q.poll();
            System.out.print(u + " ");

            for(int v : edges[u]){
                if(!visited[v]){
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
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
        bfsExample ug = new bfsExample(5);
        ug.addEdge(0, 1); 
        ug.addEdge(1, 2);
        ug.addEdge(2, 3);
        ug.addEdge(3, 0);
        ug.addEdge(2, 4);
        // System.out.println(ug);
        ug.bfs(4);
    }
}