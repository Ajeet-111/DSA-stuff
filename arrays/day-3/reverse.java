public class reverse{
    public void rev(int[] nums){
        int n = nums.length;
        int i = 0, j = n - 1;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        reverse r = new reverse();
        r.rev(nums);
        for(int num: nums){
            System.out.print(num + " ");
        }
    }
}