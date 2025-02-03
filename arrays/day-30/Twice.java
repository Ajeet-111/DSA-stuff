// public class Twice {
//     public boolean twice(int[] nums) {
//         int n = nums.length;
//         if (n == 0)
//             return false;
//         int[] freq = new int[n + 1];
//         for (int i = 0; i < n; i++) {
//             freq[nums[i]]++;
//         }
//         for (int num : freq) {
//             if (num > 1) {
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         Twice t = new Twice();
//         int[] nums = {0, 1, 2, 3, 4, 5};
//         System.out.println(t.twice(nums));
//     }
// }

//THE FISRT QUESTION I DID BY MYSELF!!



// public class Twice {
//     public boolean twice(int[] nums){
//         int n = nums.length;
//         int i = 0, j = n - 1;
//         while (i < j) {
//             if (nums[i] == nums[j]) {
//                 return true;
//             } else{
//                 j--;
//             }
//             i++;
//         }
//         return false;
//     }
//     public static void main(String[] args){
//         Twice t = new Twice();
//         int[] nums = {0, 1, 2, 2, 4, 5};
//         System.out.println(t.twice(nums));
//     }
// }

// THAT TO TWICE!!!!!!!!!!! apparently it is not efficient enough ugh


//using hash set

import java.util.HashSet;

public class Twice{
    public boolean twice(int[] nums){
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (set.contains(nums[i])) {
                return true;
            } 
            set.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args){
        Twice t = new Twice();
        int[] nums = {0, 1, 6, 2, 4, 5};
        System.out.println(t.twice(nums));
    }
}