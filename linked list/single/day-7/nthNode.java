public class nthNode {
    ListNode head;
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

    public ListNode nthFromLast(int n){
        if (head == null) {
            return null;
        }
        if (n < 0) {
            throw new IllegalArgumentException("invalid value of n: " + n);
        }
        //two pointer
        ListNode mainP = head;
        ListNode refP = head;
        //counting
        int count = 0;
        //incrementing ref until we reach n - 1
        while (count < n) {
            refP = refP.next;
            count++;
        }
        //incrementing both main and ref until ref goes null.
        while (refP != null) {
            refP = refP.next;
            mainP = mainP.next;
        }
        return mainP;
    }

    //works for sorted lists
    public void removeDuplticates(){
        if(head == null) return;
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
    }

    //works for sorted lists
    public void addInSorted(int data){
        ListNode newNode = new ListNode(data);

        if (head == null) {
            return;
        }
        ListNode curr = head;
        ListNode temp = null;

        //it will iterate until we reach a point where n.d > c.d
        while (curr != null && curr.data < newNode.data) {
            temp = curr;
            curr = curr.next;
        }
        //main insertion operation
        newNode.next = curr;
        temp.next = newNode;
        // return head;
    }

    public static void main(String[] args){
        nthNode n = new nthNode();
        n.addFirst(20);
        n.addFirst(15);
        n.addFirst(10);
        n.addFirst(5);
        // n.addFirst(5);
        n.display();
        // System.out.println(n.nthFromLast(2).data);
        // n.removeDuplticates();
        // n.display();
        n.addInSorted(18);
        n.display();
    }
}
