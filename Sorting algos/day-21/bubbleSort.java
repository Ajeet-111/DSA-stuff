// also known as sinkign sort.

public class bubbleSort {
    public void bubble(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = { 39, 12, 3, 6, 44 };
        bubbleSort bs = new bubbleSort();
        bs.bubble(nums);
        bs.printArray(nums);
    }
}