import java.util.*;

public class bin1ton {
    String[] generateBinaryNumbers(int n){
        String[] result = new String[n];
        LinkedList<String> q = new LinkedList<>();
        q.offer("1");

        for (int i = 0; i < n; i++) {
            result[i] = q.poll();

            q.offer(result[i] + "0");
            q.offer(result[i] + "1");
        }

        return result;
    }
    public static void main(String[] args){
        bin1ton b = new bin1ton();
        String[] binaryNumbers = b.generateBinaryNumbers(10);

        for (int i = 0; i < binaryNumbers.length; i++) {
            System.out.println(binaryNumbers[i]);
        }
    }
}