public class loopWoop{
    ListNode head;
    // int size;
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
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void display(){
        if (head == null) {
            System.out.println("the list is epmty.");
            return;
        }
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void createALoop(){
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);

        head = one;
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = two;
    }

    public void removeLoop(){
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                byebyeLoop(slow);
            }
        }
    }

    public void byebyeLoop(ListNode slow){
        ListNode curr = head;
        while (slow.next != curr.next) {
            curr = curr.next;
            slow = slow.next;
        }
        slow.next = null;
    }

    public static void main(String[] args){
        loopWoop lw = new loopWoop();
        lw.addFirst(20);
        lw.addFirst(15);
        lw.addFirst(10);
        lw.addFirst(5);
        lw.display();

        lw.createALoop();
        // lw.display();

        lw.removeLoop();
        lw.display();
    }
}