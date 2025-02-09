public class maxSumSubarray{
    public int maxSum(int[] nums){
        int currmax = nums[0];
        int maxsum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currmax += nums[i];
            if(currmax < nums[i]){
                currmax = nums[i];
            }
            maxsum = Math.max(maxsum, currmax);
        }

        return maxsum;
    }
    public static void main(String[] args){
        int[] nums = {4, 3, -2, 6, -12, 7, -1, 6};
        maxSumSubarray msa = new maxSumSubarray();
        int sum = msa.maxSum(nums);
        System.out.println(sum);
    }
}