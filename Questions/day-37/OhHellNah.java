// max subArray without repeating a character or something.

import java.util.*;

public class OhHellNah {
    public int longest(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, max = 0;
        
        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            }
            map.put(s.charAt(right), right);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        OhHellNah ohn = new OhHellNah();
        System.out.println(ohn.longest("abcabcbb"));  
        System.out.println(ohn.longest("bbbbb"));   
        System.out.println(ohn.longest("pwwkew"));    
        System.out.println(ohn.longest("abcd"));     
    }
}
