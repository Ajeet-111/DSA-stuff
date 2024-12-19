// public class missing{
//     public void missngNumber(int[] arr){
//         int max = arr[arr.length - 1];
//         int min = arr[0];
//         int missingN = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//             if (arr[i] < min) {
//                 min = arr[i];
//             }
//         }
//         int i = 0;
//         while(min < max && i < arr.length){
//             if (arr[i] != min) {
//                 missingN = min;
//             }
//             i++;
//             min++;
//         }
//         System.out.println("missing number: " + missingN);
//     }
//     public static void main(String[] args){
//         missing m = new missing();
//         m.missngNumber(new int[] {2, 4, 1, 8, 3, 5, 7});
//     }
// }


// other solution
public class missing{
    public int missingNumber(int arr[]){
        int n = arr.length + 1;
        int sum = n * (n + 1)/2;
        for (int i : arr) {
            sum = sum - i;
        }
        return sum;
    }
    public static void main(String[] args){
        missing m = new missing();       
        System.out.println(m.missingNumber(new int[] {2, 4, 1, 8, 3, 7, 6}));
    }
}