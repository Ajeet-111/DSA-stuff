public class SubSequence {
    public boolean isSS(String s, String sub){
        int i = 0;
        int j = 0;
        while (i < s.length() && j < sub.length()) {
            if(s.charAt(i) == sub.charAt(j)){
                j++;
            }
            i++;
        }
        return j == sub.length();
    }
    public static void main(String[] args){
        SubSequence ss = new SubSequence();
        boolean stuff = ss.isSS("abcde", "cde");
        System.out.println(stuff);
    }
}