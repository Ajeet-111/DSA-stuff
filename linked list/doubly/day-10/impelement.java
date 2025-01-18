public class impelement{
    ListNode head;
    ListNode tail;
    int size;
    class ListNode{
        int data;
        ListNode prev;
        ListNode next;

        ListNode(int data){
            this.data = data;
        }
    }
    public impelement(){
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
        if (isEmpty()){
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

    public void displayBackward(){
        if (head == null) {
            System.out.println("empty");
            return;
        }
        ListNode curr = tail;
        while (curr != null) {
            System.out.print(curr.data + " <=> ");
            curr = curr.prev;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        impelement i = new impelement();
        i.addFirst(10);
        i.addFirst(5);
        i.displayForward();
    }
}