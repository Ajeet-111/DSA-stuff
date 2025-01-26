public class DutchFlagProb {
    public void sort(int[] arr) {
        int i = 0, j = 0, k = arr.length - 1;
        while (i <= k) {
            if (arr[i] == 0) {
                // in case of zero, we will change the postion of i with j cuz we want 0 at the start.
                swap(arr, i, j);
                i++;
                j++; //  j moves ahead by one position only when it is swapped.
            } else if (arr[i] == 1) {
                // in case of 1, we will not change the position for arr[i].
                i++;
            } else if (arr[i] == 2) {
                // in case of 2, we will replace i with k cuz we want 2 at last.
                swap(arr, i, k);
                k--; // after swapping k moves backward by one step.
            }
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 1, 2, 0 };
        DutchFlagProb dfp = new DutchFlagProb();
        dfp.sort(arr);
        dfp.printArray(arr);
    }
}