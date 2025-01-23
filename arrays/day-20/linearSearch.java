public class linearSearch{
    public int search(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] lol = {5, 9, 11, 23, 67};
        linearSearch ls = new linearSearch();
        System.out.println(ls.search(lol, 10));
    }
}