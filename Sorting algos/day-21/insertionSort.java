public class insertionSort {
    public void sort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > curr) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;
        }
    }

    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args){
        int[] nums = { 39, 12, 3, 6, 44 };
        insertionSort is = new insertionSort();
        is.sort(nums);
        is.printArray(nums);
    }
}
