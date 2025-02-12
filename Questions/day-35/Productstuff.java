import java.util.Arrays;

public class Productstuff {
    private int[] stuff(int[] nums){
        int n = nums.length;
        int[] res = new int[n];

        int left = 1;
        for (int i = 0; i < n; i++) {
            res[i] = left;
            left *= nums[i];
        }

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
    public static void main(String[] args){
        Productstuff ps = new Productstuff();
        int[] nums = {1,2,3,4};
        int[] lol = ps.stuff(nums);
        System.out.println(Arrays.toString(lol));
    }
}
