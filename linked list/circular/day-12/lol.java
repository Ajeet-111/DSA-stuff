public class lol{
    ListNode last;
    int size;
    class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
        }
    }

    public lol(){
        this.last = null;
        this.size = 0;
    }

    public void display(){
        if (last == null) {
            // System.out.println("empty");
            return;
        } 
        ListNode curr = last.next;
        while (curr != last) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data){
        ListNode newNode = new ListNode(data);
        if (last == null) {
            last = newNode;
        }else{
            newNode.next = last.next;
        }
        last.next = newNode;
        size++;
    }

    public void addLast(int data){
        ListNode newNode = new ListNode(data);
        if (last == null) {
            last = newNode;
            last.next = last;
        }else{
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public ListNode deleteFirst(){
        if (isEmpty()) {
            System.out.println("empty");
        }
        ListNode curr = last.next;
        if (last.next == last) {
            last = null;
        }else{
            last.next = curr.next;
        }
        curr.next = null;
        size--;
        return curr;
    }

    

    public boolean isEmpty(){
        return last == null;
    }
    public static void main(String[] args){
        lol l = new lol();
        l.addFirst(10);
        l.addFirst(5);
        l.display();
    }
}