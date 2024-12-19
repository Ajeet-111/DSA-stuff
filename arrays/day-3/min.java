public class min {
    public int minimumValue(int[] nums){
        //edge case for arr.isEmpty() - optional
        if (nums.length == 0) {
            throw new IllegalArgumentException("invalid input");
        }
        int min = nums[0];
        for (int num: nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    public static void main(String[] args){
        int[] nums = {1,2, 3, 4,5, 0};
        min m = new min();
        System.out.println(m.minimumValue(nums));
    }
}
