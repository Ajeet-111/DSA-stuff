//FLOYD's CYCLE DETECTION ALGORITHM

public class Cycle {
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

    public boolean loopPresent(){
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public ListNode loopPosition(){
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return loopStartedAt(slow);
            }
        }
        return null;
    }

    public ListNode loopStartedAt(ListNode slow){
        ListNode curr = head;
        while (curr != slow) {
            curr = curr.next;
            slow = slow.next;
        }
        return curr;
    }

    public void createLoop(){
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        head = one;
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = two;
        five.next = null;
    }

    public void display(){
        if (head == null) {
            System.out.println("empty");
            return;
        }
        ListNode curr = head;
        while (curr!= null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        Cycle c = new Cycle();
        c.addFirst(20);
        c.addFirst(15);
        c.addFirst(10);
        c.addFirst(5);
        c.addFirst(0);
        c.display();
        System.out.println(c.loopPresent());

        c.createLoop();
        //real loop LMAO    
        // c.display();
        System.out.println(c.loopPresent());
        System.out.println(c.loopPosition().data);
    }
}
