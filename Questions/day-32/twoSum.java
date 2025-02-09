//normal method

public class twoSum{
    public int[] targetSum(int[] nums, int target){
        int n = nums.length;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             return new int[]{i, j};
        //         }
        //     }
        // }

        int i = 0, j = nums.length-1;
        while (i < j) {
            if (nums[i] + nums[j] == target) {
                return new int[] {i, j};
            } else if(nums[i] + nums[j] < target){
                i++;
            } else{
                j--;
            }
            
        }
        return new int[] {-1, -1};
    }
    public static void main(String[] args){
        int nums[] = {2, 11, 5, 10, 7, 8};
        twoSum ts = new twoSum();
        int[] res = ts.targetSum(nums, 10);
        System.out.println(res[0] + ", " + res[1]);
    }
}

//Hash map

// import java.util.HashMap;

// public class twoSum{
//     public int[] targetSum(int nums[], int target){
//         int n = nums.length;
//         int[] res = new int[2];
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for (int i = 0; i < n; i++) {
//             if (!map.containsKey(target - nums[i])) {
//                 map.put(nums[i], i);
//             } else{
//                 res[0] = i;
//                 res[1] = map.get(target - nums[i]);
//                 return res;
//             }
//         }
//         return res;
//     }
//     public static void main(String[] args){
//         int nums[] = {2, 11, 5, 10, 7, 8};
//         twoSum ts = new twoSum();
//         int[] res = ts.targetSum(nums, 10);
//         System.out.println(res[0] + ", " + res[1]);
//     }
// }