public class deleteMax {
    int[] heap;
    int n = 0;

    public deleteMax(int capacity){
        heap = new int[capacity + 1];
        n = 0;
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public int size(){
        return n;
    }

    public void resize(int capacity){
        int[] temp = new int[capacity];
        for (int i = 0; i < heap.length; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }

    public void insert(int x){
        if (n == heap.length - 1) {
            resize(2*heap.length);
        }
        n++;
        heap[n] = x;
        swim(n);
    }

    public void swim(int k){
        while (k > 1 && heap[k/2] < heap[k]) {
            int temp = heap[k/2];
            heap[k/2] = heap[k];
            heap[k] = temp;
            k = k / 2;
        }
    }

    public void delete(){
        int max = heap[1];
        swap(1, n);
        n--;
        sink(1);
        heap[n + 1] = 0;
        if (n > 0 && (n == (heap.length - 1)/4)) {
            resize(heap.length / 2);
        }
    }

    public void sink(int k){
        while (2*k <= n) {
            int j = 2*k;
            if (j < n && heap[j] < heap[j + 1]) {
                j++;
            }
            if (heap[k] >= heap[j]) {
                break;
            }
            swap(k, j);
            k = j;
        }
    }

    public void swap(int a, int b){
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    public void printHeap(){
        for (int i = 0; i <= n; i++) {
            System.out.print(heap[i] + " ");
        }
    }

    public static void main(String[] args){
        deleteMax mh = new deleteMax(10);

        mh.insert(4);
        mh.insert(5);
        mh.insert(2);
        mh.insert(6);
        mh.insert(1);
        mh.insert(3);
        mh.insert(9);
        System.out.println(mh.size());
        mh.printHeap();
    }
}
