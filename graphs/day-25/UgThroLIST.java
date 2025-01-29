import java.util.LinkedList;

public class UgThroLIST {
    LinkedList<Integer>[] list;
    private int v;
    private int e;

    public UgThroLIST(int nodes) {
        this.v = nodes;
        this.e = 0;
        this.list = new LinkedList[nodes];
        for (int i = 0; i < v; i++) {
            list[i] = new LinkedList<>();
        }
    }

    public void addEdge(int i, int j) {
        list[i].add(j);
        list[j].add(i);
        e++;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(v + " vertices, " + e + " edges " + "\n");
        for (int i = 0; i < v; i++) {
            sb.append(i + ": ");
            for (int w : list[i]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        UgThroLIST ug = new UgThroLIST(4);
        ug.addEdge(0, 1);
        ug.addEdge(1, 2);
        ug.addEdge(2, 3);
        ug.addEdge(3, 0);
        System.out.println(ug);
    }
}
