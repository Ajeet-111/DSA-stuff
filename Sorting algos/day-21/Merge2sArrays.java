public class Merge2sArrays {
    public int[] merge(int[] nums1, int[] nums2){
        int n1 = nums1.length, n2 = nums2.length;
        int i = 0, j = 0, k = 0;
        int[] res = new int[n1 + n2];

        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                res[k] = nums1[i];
                i++;
            } else{
                res[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            res[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n2) {
            res[k] = nums2[j];
            j++;
            k++;
        }
        return res;
    }

    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        Merge2sArrays m2sa = new Merge2sArrays();
        int[] nums1 = {3, 11, 18, 24};
        int[] nums2 = {6, 1, 12, 25};
        m2sa.sort(nums2);
        m2sa.sort(nums1);

        int[] res = m2sa.merge(nums1, nums2);
        m2sa.printArray(res);
    }
}
