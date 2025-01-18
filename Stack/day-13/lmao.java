import java.util.Stack;

public class lmao{
    int[] nextGreaterElement(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            }
            else{
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }
    public static void main(String[] args){
        lmao l = new lmao();
        int[] lol = l.nextGreaterElement(new int[] {4, 7, 8, 4, 3, 2});
        for (int i = 0; i < lol.length; i++) {
            System.out.print(lol[i] + " ");
        }
    }
}