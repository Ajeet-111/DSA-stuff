public class Strpal {
    public boolean checkPalindrome(String s){
        char[] string = s.toCharArray();
        int i = 0;
        int j = string.length - 1;
        while(i < j){
            if (string[i] != string[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        Strpal str = new Strpal();
        if (str.checkPalindrome("lol")) {
            System.out.println("the given string is a palindrome");
        }else{
            System.out.println("the given input is not a palindrome.");
        }
    }
}
