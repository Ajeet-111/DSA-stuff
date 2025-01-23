public class ExampleOfBS {
    public int binarySearch(int[] arr, int target){
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (arr[mid] < target) {
                left = mid + 1;
            }
            else if (arr[mid] > target) {
                right = mid - 1;
            }
            else{
                return mid;
            }
        }

        return left;
    }

    public static void main(String[] args){
        int[] lol = {1, 3, 5, 7};
        ExampleOfBS bs = new ExampleOfBS();
        System.out.println(bs.binarySearch(lol, 10));
    }
}
