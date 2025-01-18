import java.util.EmptyStackException;

public class StackExample {
    private int size;
    ListNode top;

    class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
        }
    }

    public StackExample(){
        top = null;
        size = 0;
    }

    public void push(int data){
        ListNode newNode = new ListNode(data);
        if (top == null) {
            top = newNode;
        }
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop(){
        if (isEmpty()) {
            return -1;
        }
        int result = top.data;
        top = top.next;
        size--;
        return result;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int peek(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }
    public static void main(String[] args){
        StackExample se = new StackExample();
        se.push(10);
        se.push(20);
        se.push(30);
        System.out.println(se.peek());
        se.pop();
        System.out.println(se.peek());
    }
}