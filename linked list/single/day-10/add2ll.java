public class add2ll{
    ListNode head;
    class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(int data){
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public ListNode addTwoLists(ListNode l1, ListNode l2){
        ListNode prev = new ListNode(0);
        ListNode curr = prev;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int x = (l1!=null)? l1.data:0;
            int y = (l2 != null)?l2.data:0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return prev.next;
    }

    public void display(){
        if (head == null) {
            System.out.println("the list is empty.");
            return;
        }
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        add2ll a = new add2ll();
        a.addLast(0);
        a.addLast(5);
        a.addLast(1);
        a.display();

        add2ll a2 = new add2ll();
        a2.addLast(1);
        a2.addLast(5);
        a2.addLast(10);
        a2.display();

        add2ll listx = new add2ll();
        listx.head = a.addTwoLists(a.head, a2.head);
        listx.display();
    }
}