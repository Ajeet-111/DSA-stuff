public class SquareSorted {

    public int[] squared(int[] arr) {
        int n = arr.length;
        int i = 0, j = n - 1;
        int[] res = new int[n];
        for (int k = n - 1; k >= 0; k--) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                res[k] = arr[i] * arr[i];
                i++;
            } else {
                res[k] = arr[j] * arr[j];
                j--;
            }
        }
        return res;
    }

    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { -4, -1, 0, 3, 10 };
        SquareSorted ss = new SquareSorted();
        ss.printArray(ss.squared(arr));
    }
}