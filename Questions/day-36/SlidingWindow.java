import java.util.*;

public class SlidingWindow {
    public List<Integer> window(int[] nums, int k) {
        int n = nums.length;
        int[] nga = nextGreaterElement(nums);

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= n - k; i++) {
            int j = i;
            while (nga[j] < i + k) {
                j = nga[j];
            }
            res.add(nums[j]);
        }
        return res;
    }

    public int[] nextGreaterElement(int nums[]) {
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                res[i] = nums.length;
            } else {
                res[i] = stack.peek();
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        SlidingWindow sw = new SlidingWindow();
        int[] nums = {44, 77, 33, 44, 88, 11};
        System.out.println(sw.window(nums, 3));
    }
}