public class singlePractice {
    ListNode head;
    private int size;

    class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int getSize() {
        return size;
    }

    public void addFirst(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        size++;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("empty list");
            return;
        }
        head = head.next;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        ListNode curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        size--;
    }

    public void display() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        singlePractice sp = new singlePractice();
        sp.addLast(10);
        sp.addLast(20);
        sp.addLast(30);
        sp.display();
    }
}
