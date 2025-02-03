public class HashTable{
    private HashNode[] buckets;
    int num;
    int size;

    public HashTable(int capacity){
        buckets = new HashNode[capacity];
        this.num = capacity;
        this.size = 0;
    }

    public class HashNode{
        Integer key;
        String value;
        HashNode next;

        HashNode(Integer key, String value){
            this.key = key;
            this.value = value;
        }
    }

    public void put(Integer key, String value){
        if (key == null || value == null) {
            return;
        }
        int index = key % buckets.length;
        HashNode curr = buckets[index];
        while (curr != null) {
            if (curr.key.equals(key)) {
                curr.value = value;
                return;
            }
            curr = curr.next;
        }
        size++;
        curr = buckets[index];
        HashNode node = new HashNode(key, value);
        node.next = curr;
        buckets[index] = node;
    }

    public String get(Integer key){
        int index = key % buckets.length;
        HashNode curr = buckets[index];
        while (curr != null) {
            if (curr.key.equals(key)) {
                return curr.value;
            }
            curr = curr.next;
        }
        return null;
    }

    public String remove(Integer key){
        if (key == null) {
            return null;
        }
        int index = key % buckets.length;
        HashNode curr = buckets[index];
        HashNode prev = null;
        while (curr != null) {
            if (curr.key.equals(key)) {
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) {
            return null;
        }
        size--;
        if (prev != null) {
            prev.next = curr.next;
        } else{
            buckets[index] = curr.next;
        }
        return curr.value;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }
    
    public static void main(String[] args){
        HashTable ht = new HashTable(10);
        ht.put(105, "lmao");
        ht.put(21, "tom");
        ht.put(21, "sana");
        ht.put(31, "Dinesh");
        System.out.println("size of table: " + ht.getSize());
        System.out.println("element at the given key is: " + ht.get(21));
        System.out.println("the removed element is: " + ht.remove(31));
        System.out.println("the size after removing an element is: " + ht.getSize());
    }
}