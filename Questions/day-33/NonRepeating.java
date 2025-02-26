public class NonRepeating {
    private int findIndex(String s){
        int n = s.length();
        int[] freq = new int[26];
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < n; i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args){
        NonRepeating nr = new NonRepeating();
        int res = nr.findIndex("racecars");
        System.out.println(res);
    }
}



// import java.util.HashMap;

// public class NonRepeating {
//     private int findIndex(String s){
//         int n = s.length();
//         HashMap<Character, Integer> map = new HashMap<>();
//         for(char ch: s.toCharArray()){
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }

//         for (int i = 0; i < n; i++) {
//             char ch = s.charAt(i);
//             if (map.get(ch) == 1) {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args){
//         NonRepeating nr = new NonRepeating();
//         int res = nr.findIndex("racecars");
//         System.out.println(res);
//     }
// }
