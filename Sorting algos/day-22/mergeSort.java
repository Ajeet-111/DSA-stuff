// divide and conquer.

public class mergeSort {
    public void sort(int[] arr, int[] temp, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            sort(arr, temp, low, mid); // left
            sort(arr, temp, mid + 1, high); // right
            merge(arr, temp, low, mid, high); // left + right
        }
    }

    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public void merge(int[] arr, int[] temp, int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }

        int i = low; // left sorted subarray
        int j = mid + 1; // right sorted subarray
        int k = low; // merging temp into arr

        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 3, 56, 4, 6 };
        mergeSort ms = new mergeSort();
        ms.sort(arr, new int[arr.length], 0, arr.length - 1);
        ms.printArray(arr);
    }
}