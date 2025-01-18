public class InsaneStuff{
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

    public void removekey(int key){
        if(head == null) {
            return;
        }
        ListNode curr = head;
        ListNode temp = null;
        while (curr!= null && curr.data != key) {
            temp = curr;
            curr = curr.next;
        }
        temp.next = curr.next;
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
        InsaneStuff i = new InsaneStuff();
        i.addFirst(20);
        i.addFirst(15);
        i.addFirst(10);
        i.addFirst(5);
        i.addFirst(0);
        i.display();
        i.removekey(10);
        i.display();
    }
}