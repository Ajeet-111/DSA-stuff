import java.util.Stack;

public class ValidPara {
    public boolean isValid(String s){
        int n = s.length();
        char[] str = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length; i++) {
            if (str[i] == '(' || str[i] == '[' || str[i] == '{') {
                stack.push(str[i]);
            }
            else{
                if (stack.isEmpty()) {
                    return false;
                }
                if ((str[i] == ')' && stack.peek() == '(') ||
                    (str[i] == ']' && stack.peek() == '[') ||
                    (str[i] == '}' && stack.peek() == '{')) {
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        ValidPara vp = new ValidPara();
        boolean result = vp.isValid("(");
        if (result == true) {
            System.out.println("the given string is valid");
        }else{
            System.out.println("the given string is invalid");
        }
    }
}
