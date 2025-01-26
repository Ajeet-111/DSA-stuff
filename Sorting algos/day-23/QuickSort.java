public class QuickSort {

    public int partition(int[] arr, int low, int high) {

        int pivot = arr[high], i = low, j = low;
        while (i <= high) {
            if (pivot >= arr[i]) {
                swap(arr, i, j);
                j++;
            } 
            i++;
        }

        return j - 1;
    }

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {12, 1, 33, 5, 667, 80};
        QuickSort qs = new QuickSort();
        qs.quickSort(arr, 0, arr.length - 1);
        qs.printArray(arr);
    }
}
