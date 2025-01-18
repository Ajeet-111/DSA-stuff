public class StackExample2 {
    private int top;
    int[] arr;

    //constructors
    public StackExample2(int capacity){
        top = -1;
        arr = new int[capacity];
    }

    //static
    public StackExample2(){
        this(10);
    }

    //operations
    public void push(int data){
        if (isFull()) {
            throw new RuntimeException("stack is full!");
        }
        top++;
        arr[top] = data;
    }

    public int pop(){
        if (isEmpty()) {
            throw new RuntimeException("underflow");
        }
        top--;
        int result = arr[top];
        return result;
    }

    public int peek(){
        if (isEmpty()) {
            throw new RuntimeException("underflow");
        }
        return arr[top];
    }

    public boolean isFull(){
        return size() == arr.length;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int size(){
        return top + 1;
    }
    public static void main(String[] args){
        StackExample2 st = new StackExample2();
        st.push(10);
        st.push(20);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
    }
}
