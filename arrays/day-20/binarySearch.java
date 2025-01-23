//the array should be sorted.

public class binarySearch {
    public int search(int[] arr, int target){
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int mid = i + (j - i)/2;
            if (target < arr[mid]) {
                j = mid - 1;
            }
            else if (target > arr[mid]) {
                i = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] lol = {5, 9, 11, 23, 67};
        binarySearch bs = new binarySearch();
        System.out.println(bs.search(lol, 11));
    }
}
