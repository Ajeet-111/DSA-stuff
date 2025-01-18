public class MergingLists {
    ListNode head;
    class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public ListNode mergeLists(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode merged = dummy;
        while(l1 != null & l2 != null){
            if (l1.data < l2.data) {
                merged.next = l1;
                l1 = l1.next;
            }
            else{
                merged.next = l2;
                l2 = l2.next;
            }
            merged = merged.next;
        }
        merged.next = l1 == null? l2 : l1;

        return dummy.next;
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

    public static void main(String[] args){
        MergingLists ml1 = new MergingLists();
        ml1.addFirst(15);
        ml1.addFirst(5);

        MergingLists ml2 = new MergingLists();
        ml2.addFirst(20);
        ml2.addFirst(10);

        ml2.display();
        ml1.display();

        MergingLists lol = new MergingLists();
        lol.head = ml1.mergeLists(ml1.head, ml2.head);
        lol.display();
        
    }
}
