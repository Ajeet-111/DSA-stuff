import java.util.Stack;

public class ReverseIt {
    public String reverse(String s){
        Stack<Character> lol = new Stack<>();
        char[] str = s.toCharArray();
        for(char c: str){
            lol.push(c);
        } 
        for (int i = 0; i < str.length; i++) {
            str[i] = lol.pop();
        }
        return new String(str);
    }
    public static void main(String[] args){
        ReverseIt rt = new ReverseIt();
        System.out.println(rt.reverse("bhai"));
    }
}
