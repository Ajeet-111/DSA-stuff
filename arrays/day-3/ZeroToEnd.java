public class ZeroToEnd {
    public void moveZeroToEnd(int[] nums){
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[j] == 0 && nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if(nums[j] != 0){
                j++;
            }
        }
    }
    public static void main(String[] args){
        int nums[] = { 1, 0, 2,0, 4, 5};
        ZeroToEnd z = new ZeroToEnd();
        z.moveZeroToEnd(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
