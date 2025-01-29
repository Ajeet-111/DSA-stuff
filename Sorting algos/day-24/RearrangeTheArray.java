import java.util.Arrays;

//this works like an alternate placing of the array elements, we sort the array first then we 
//isMAx to true, if its true the element gets on the last of the resultant array and if its not 
//max then the elemet gets stored at intilial position.

public class RearrangeTheArray {
    public int[] rearrange(int[] arr){
        Arrays.sort(arr);

        int n = arr.length;
        int[] res = new int[n];
        int i = 0, j = n - 1;
        boolean isMax = true;
        for(int k = 0; k < n; k++){
            if (isMax) {
                res[k] = arr[j];
                j--;
            } else{
                res[k] = arr[i];
                i++;
            }
            isMax = !isMax;
        }
        return res;
    }

    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args){
        RearrangeTheArray rta = new RearrangeTheArray();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rta.printArray(rta.rearrange(arr));
    }
}
