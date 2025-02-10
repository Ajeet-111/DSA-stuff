public class RemoveElement {
    public int remove(int nums[], int val){
        int n = nums.length, j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args){
        RemoveElement re = new RemoveElement();
        int res = re.remove(new int[]{3,2,2,3}, 3);
        System.out.println(res);
    }
}
