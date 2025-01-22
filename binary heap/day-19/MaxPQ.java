//binary heaps are usually implemented using arrays.
//the first entry is left empty for some reason.
//traversing the tree left to right;

//  LOL

// public class MaxBinHeap{
//     TreeNode root;
//     class TreeNode{
//         int data;
//         TreeNode left;
//         TreeNode right;

//         TreeNode(int data){
//             this.data = data;
//         }
//     }

//     public void maxHeap()

//     public void insert(int value){
//         addANode(root, value);
//     }

//     public TreeNode addANode(TreeNode root, int value){
//         if (root == null) {
//             root = new TreeNode(value);
//             return root;
//         }
//         if (root.data > value) {
//             if (root.left == null) {
//                 addANode(root.left, value);
//             } else{
//                 addANode(root.right, value);
//             }
//         }
//         else{
//             addANode(root, value);
//         }

//         return root;
//     }
//     public static void main(String[] args){
//         MaxBinHeap mbh = new MaxBinHeap();
//         mbh.insert(10);
//     }
// }

public class MaxPQ {
    Integer[] heap;
    private int n;

    public MaxPQ(int capacity){
        heap = new Integer[capacity + 1];
        n = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void resize(int capacity){
        Integer[] temp = new Integer[capacity];
        for (int i = 0; i < heap.length; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
     }

    public void insert(int x){
        if (n == heap.length - 1) {
            resize(heap.length*2);
        }
        n++;
        heap[n] = x;
        swim(n);
    }

    private void swim(int k){
        while (k > 1 && heap[k/2] < heap[k]) {
            int temp = heap[k/2];
            heap[k/2] = heap[k];
            heap[k] = temp;
            k = k / 2;
        }
    }

    public void printHeap(){
        for (int i = 0; i <= n; i++) {
            System.out.print(heap[i] + " ");
        }
    }

    public static void main(String[] args) {
        MaxPQ pq = new MaxPQ(4);
        // System.out.println(pq.size());
        // System.out.println(pq.isEmpty());

        pq.insert(4);
        pq.insert(5);
        pq.insert(2);
        pq.insert(6);
        pq.insert(1);
        pq.insert(3);
        System.out.println(pq.size());
        pq.printHeap();
    }
}