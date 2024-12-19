public class ReSize {
    public int[] reSize(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    public void printArray(int arr[]){
        for(int num: arr){
            System.out.print(num+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int nums[] = { 1, 0, 2,0, 4, 5};
        ReSize rs = new ReSize();
        rs.printArray(nums);
        System.out.println("length before Re-sizing: " + nums.length);
        nums = rs.reSize(nums, 8);
        System.out.println("length after Re-sizing: "+ nums.length);
        nums[6] = 9;
        nums[7] = 1;
        rs.printArray(nums);
    }
}
