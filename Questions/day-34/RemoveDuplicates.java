public class RemoveDuplicates {
    public int remove(int[] nums){
        int n = nums.length, unique = 1;
        
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[unique]) {
                unique++;
                nums[unique] = nums[i];
            }
        }

        return unique;
    }
    public static void main(String[] args){
        RemoveDuplicates rd = new RemoveDuplicates();
        System.out.println(rd.remove(new int[] {1,1,2}));
    }
}
