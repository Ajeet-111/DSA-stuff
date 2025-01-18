public class single{
    private ListNode head;
    private int size;
    public static class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void display(){
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " --> ");
            curr = curr.next;
            size++;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        single s = new single();
        //assigning values
        s.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        //now we link them
        s.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;

        s.display();
        System.out.println("the size of given list is: "+ s.size);
    }
}