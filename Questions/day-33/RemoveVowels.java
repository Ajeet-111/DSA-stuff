// public class RemoveVowels {
//     public String vowel(String s){
//         int n = s.length(), k = 0;
//         char[] str = new char[n];
//         for (int i = 0; i < n; i++) {
//             if (!isVowel(s.charAt(i))) {
//                 str[k] = s.charAt(i);
//                 k++;
//             }
//         }
//         return new String(str);
//     }

//     public boolean isVowel(char c){
//         return c == 'a' || c == 'e' || c == 'i' || c == 'u' || c == 'o';
//     }
//     public static void main(String[] args){
//         RemoveVowels rv = new RemoveVowels();
//         System.out.println(rv.vowel("what is your name"));
//     }
// }

import java.util.Set;

public class RemoveVowels {
    public String vowel(String s){
        int n = s.length();
        Set<Character> set = Set.of('a','e','i','o','u');
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (!set.contains(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        // return new String(sb);
        return sb.toString();
    }
    public static void main(String[] args){
        RemoveVowels rv = new RemoveVowels();
        System.out.println(rv.vowel("what is your name"));
    }
}
