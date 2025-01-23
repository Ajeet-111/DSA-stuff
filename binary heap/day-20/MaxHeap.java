public class MaxHeap {
    int[] heap;
    int n;

    public MaxHeap(int capacity) {
        heap = new int[capacity + 1];
        n = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void resize(int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < heap.length; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }

    public void insert(int key) {
        if (n == heap.length - 1) {
            resize(2 * heap.length);
        }
        n++;
        heap[n] = key;
        swim(n);
    }

    public void swim(int k) {
        while (k > 1 && heap[k / 2] < heap[k]) {
            int temp = heap[k / 2];
            heap[k / 2] = heap[k];
            heap[k] = temp;
            k = k / 2;
        }
    }

    
    public void printHeap() {
        for (int i = 0; i <= n; i++) {
            System.out.print(heap[i] + " ");
        }
    }

    public static void main(String[] args) {
        MaxHeap mh = new MaxHeap(10);

        mh.insert(4);
        mh.insert(5);
        mh.insert(2);
        mh.insert(6);
        mh.insert(1);
        mh.insert(3);
        System.out.println(mh.size());
        mh.printHeap();

    }
}