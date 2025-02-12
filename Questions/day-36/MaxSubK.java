public class MaxSubK {
    public int sum(int[] nums, int k){
        int n = nums.length;
        int currsum = 0;
        int maxsum = 0;
        int startofWindow = 0;

        for (int i = 0; i < n; i++) {
            currsum += nums[i];
            if (i >= k - 1) { // i is the end of the window.
                maxsum = Math.max(maxsum, currsum);
                currsum -= nums[startofWindow];
                startofWindow++;
            }
        }

        return maxsum;
    }
    public static void main(String[] args){
        MaxSubK msk = new MaxSubK();
        int[] nums = {2, 7, 3, 5, 8, 1};
        System.out.println(msk.sum(nums, 3));
    }
}
