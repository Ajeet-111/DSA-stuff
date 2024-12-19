public class TimeTaken{
    public static void main(String[] args){
        double currTime = System.currentTimeMillis();

        TimeTaken demo = new TimeTaken();
        System.out.println(demo.findSum(99999));

        System.out.println("time taken: " + (System.currentTimeMillis() - currTime) + " ms");
    }

    // public int findSum(int n){
    //     return n*(n-1)/2;
    // }

    public int findSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}