public class DoublyList{
    ListNode head;
    ListNode tail;
    int size;
    class ListNode{
        int data;
        ListNode next;
        ListNode prev;

        ListNode(int data){
            this.data = data;
        }
    }

    public DoublyList(){
        this.head = null;
        this.tail = null;
        this.size = 0; 
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    public void addFirst(int data){
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            tail = newNode;
        }else{
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(int data){
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            tail = newNode;
        }else{
            tail.next = newNode;
        }
        newNode.prev = tail;
        tail = newNode;
        size++;
    }

    public ListNode removeFirst(){
        if (isEmpty()) {
            System.out.println("empty");
        }
        ListNode temp = head;
        if (head == tail) {
            tail = null;
        }else{
            head.next.prev = null;
        }
        size--;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode removeLast(){
        if (isEmpty()) {
            System.out.println("empty");
        }
        ListNode temp = tail;
        if (head == tail) {
            head = null;
        }else{
            tail.prev.next = null;
        }
        size--;
        tail = tail.prev;
        temp.prev = null;
        return temp;
    }

    public void displayForward(){
        if (head == null) {
            System.out.println("empty");
            return;
        }
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " <=> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        DoublyList dl = new DoublyList();
        dl.addFirst(0);
        dl.addFirst(1);
        dl.addFirst(2);
        dl.displayForward();
        dl.removeFirst();
        dl.displayForward();
    }
}