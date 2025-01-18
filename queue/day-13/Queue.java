import java.util.NoSuchElementException;

public class Queue{
    private ListNode front;
    private ListNode rear;
    private int size;

    class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Queue(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(int data){
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            front = newNode;
        }
        else{
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }

    public int dequeue(){
        if (isEmpty()) {
            throw new NoSuchElementException("the queue is empty.");
        }
        int result = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return result;
    }

    public int first(){
        if (isEmpty()) {
            throw new NoSuchElementException("the queue is empty.");
        }
        return front.data;
    }

    public int last(){
        if (isEmpty()) {
            throw new NoSuchElementException("the queue is empty.");
        }
        return rear.data;
    }

    public void print(){
        if (isEmpty()) {
            System.out.println("the queue is empty.");
            return;
        }
        ListNode lol = front;
        while (lol != null) {
            System.out.print(lol.data + " -> ");
            lol = lol.next;
        }
        System.out.println("null");
    }
    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    public static void main(String[] args){
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.print();
        q.dequeue();
        q.print();
        System.out.println(q.getSize());
    }
}