public class CircularLL{
    ListNode last;
    // ListNode head;
    int size;

    class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
            // this.next = head;
        }
    }

    public CircularLL(){
        this.last = null;
        this.size = 0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void CircularExample(){
        ListNode first = new ListNode(0);
        ListNode two = new ListNode(1);
        ListNode three = new ListNode(2);
        ListNode four = new ListNode(3);

        // head = first;
        first.next = two;
        two.next = three;
        three.next = four;
        four.next = first;

        last = four;
        // last.next = head;
    }

    public void addFirst(int data){
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            last = newNode;
        }else{
        newNode.next = last.next;
        }
        last.next = newNode;
        size++;
    }

    public void diplay(){
        if (last == null) {
            System.out.println("empty list");
            return;
        }
        ListNode curr = last.next;
        while (curr != last) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        // System.out.println("null");
    }
    public static void main(String[] args){
        CircularLL cl = new CircularLL();
        cl.CircularExample();
        cl.diplay();
    }
}