// Seperate chaining

public class HashTable {
    private HashNode[] buckets;
    private int numOfBuckets; // capacity
    private int size; // no. of pairs

    // default capacity
    public HashTable() {
        this(10);
    }

    // custom capacity
    public HashTable(int capacity) {
        this.numOfBuckets = capacity;
        buckets = new HashNode[capacity];
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void put(Integer key, String value) {
        if (key == null || value == null) {
            return;
        }
        int bucketIndex = key % buckets.length;
        HashNode head = buckets[bucketIndex];

        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        // after the while loop, the head must have travelled quite a lot so we again start it from the first index
        head = buckets[bucketIndex];
        HashNode node = new HashNode(key, value);
        node.next = head; // before head as the list is empty!
        buckets[bucketIndex] = node;
    }

    public String get(Integer key) {
        return null;
    }

    // A node
    private class HashNode {
        private Integer key;
        private String value;
        private HashNode next;

        public HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args){
        HashTable table = new HashTable();
        table.put(105, "Tom");
        table.put(21, "Sana");
        table.put(21, "Sam");
        table.put(31, "romi");
        System.out.println(table.size);
    }
}