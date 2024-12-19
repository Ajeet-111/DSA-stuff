public class reverse {
    // private int size = 0;
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

    public void add(int data, int pos){
        ListNode newNode = new ListNode(data);
        if(pos == 1){
            newNode.next = head;
            head = newNode;
        }
        else{
            ListNode prev = head;
            int count = 1;
            while(count < pos - 1){
                prev = prev.next;
                count++;
            }
            // ListNode curr = prev.next;
            newNode.next = prev.next;
            prev.next = newNode;
        }
    }

    public void rev(){
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
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
        reverse r = new reverse();
        r.add(10, 1);
        r.add(20, 2);
        r.add(30, 2);
        r.display();

        r.rev();
        r.display();
    }
}
