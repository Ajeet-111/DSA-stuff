// import java.util.*;

public class blahblah{
    public void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void printEvenArray(int[] arr){
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++; 
            }
        }
        int odd[] = new int[oddCount];
        int lol = 0;
        for (int i = 0; i < arr.length;i++) {
            if(arr[i]%2 != 0){
                odd[lol] = arr[i];
                lol++;
            }
        }
        for(int numL: odd){
            System.out.print(numL + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {3, 2, 4, 7, 10, 6, 5};
        blahblah b = new blahblah();
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] % 2 != 0) {
        //         System.out.print(arr[i] + " "); 
        //     }
        // }
        b.printEvenArray(arr);
        b.printArray(arr);
    }
}