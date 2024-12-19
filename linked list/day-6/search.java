public class search {
    private int size = 0;
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
        size++;
        head = newNode;
        newNode.next = head;
    }

    public void add(int data, int pos){
        ListNode newNode = new ListNode(data);
        if(pos == 1){
            newNode.next = head;
            head = newNode;
        }
        else{
            ListNode prev = null;
            int count = 0;
            while(count < pos - 1){
                prev = prev.next;
                count++;
            }
            ListNode curr = prev.next;
            newNode.next = curr;
            prev.next = newNode;
        }
    }

    public boolean searchIt(int target){
        ListNode curr = head;
        while (curr != null) {
            if (curr.data == target) {
                return true;
            }
            curr = curr.next;
        }
        return false;
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
}
