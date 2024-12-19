//Second maximum value

public class secMax {
    public int secondMax(int[] nums){
        int max = nums[0];
        int secondMax = nums[1];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max; //this
                max = nums[i];
            }
            //this
            else if (nums[i] > secondMax && nums[i] != max) {
                secondMax = nums[i];
            }
        }
        //or that
        // for (int num : nums) {
        //     if (num > secondMax && num != max) {
        //         secondMax = num;
        //     }
        // }
        return secondMax;
    }
    public static void main(String[] args){
        int[] nums = {1,2, 3, 4,5, 0};
        secMax s = new secMax();
        System.out.println(s.secondMax(nums));
    }
}
