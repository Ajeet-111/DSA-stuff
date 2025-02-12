import java.util.*;

public class Threesum {
    public List<List<Integer>> sum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1, k = n - 1;

            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];

                if (total > target) {
                    k--;
                } else if (total < target) {
                    j++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
          
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;

                    j++;
                    k--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Threesum ts = new Threesum();
        int[] nums = {2, 4, 3, 7, 1, 0};
        int target = 6;
         
        List<List<Integer>> result = ts.sum(nums, target);
        System.out.println(result);
    }
}
