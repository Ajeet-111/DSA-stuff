import java.util.NoSuchElementException;

public class practice {
    ListNode front;
    ListNode rear;
    int size = 0;

    class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public practice() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("empty queue hai bhai!");
        }
        int result = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return result;
    }

    public int first() {  // Returns the first element
        if (isEmpty()) {
            throw new NoSuchElementException("empty queue hai bhai!");
        }
        return front.data;
    }

    public int last() {  // Returns the last element
        if (isEmpty()) {
            throw new NoSuchElementException("empty queue hai bhai!");
        }
        return rear.data;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return;
        }
        ListNode curr = front;
        while (curr != null) {
            System.out.print(curr.data + " -> ");  // Fixed the bug
            curr = curr.next;
        }
        System.out.println("null");
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        practice p = new practice();
        p.enqueue(10);
        p.enqueue(20);
        p.enqueue(30);
        p.enqueue(40);
        p.enqueue(50);
        p.printQueue();  // Output: 10 -> 20 -> 30 -> 40 -> 50 -> null
    }
}
