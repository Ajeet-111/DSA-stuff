public class add{
    ListNode head;
    private int size = 0;
    class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
            return;
        }
        size++;
        newNode.next = head;
        head = newNode;
    }

    public void addThere(int data, int pos){
        ListNode newNode = new ListNode(data);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
        }else{
            ListNode prev = null;
            int count = 1;
            while (count < pos - 1) {
                prev = prev.next;
                count++;
            }
            ListNode curr = prev.next;
            newNode.next = curr;
            prev.next = newNode;
        }
    }

    public void addLast(int data){
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        size++;
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void removeFirst(){
        if (head == null) {
            System.out.println("the array is empty.");
            return;
        }
        head = head.next;
        size--;
    }

    public void removeN(int pos){
        if(pos == 1){
            head = head.next;
        }
        else{
            ListNode prev = head;
            int count = 0;
            while(count < pos - 1){
                prev = prev.next;
                count++;
            }
            ListNode curr = prev.next;
            prev.next = curr.next;
        }
    }

    public void removeLast(){
        if (head == null) {
            System.out.println("the array is empty.");
            return;
        }
        ListNode curr = head;
        ListNode prev = null;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        // curr.next = null;
    }

    public void display(){
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
            // size++;
        }
        System.out.println("null");
        
    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args){
        add a = new add();
        a.addFirst(10);
        a.addFirst(5);
        a.addFirst(0);
        a.display();
        
        a.addLast(15);
        a.display();
        System.out.println(a.getSize());

        a.removeFirst();
        a.display();
        System.out.println(a.getSize());
        a.removeLast();
        a.display();
    }
}