// normal method

// public class fibonacci {
//     public int fibo(int n) {
//         if (n == 0)
//             return 0;
//         if (n == 1)
//             return 1;

//         int a = fibo(n - 1);
//         int b = fibo(n - 2);
//         return a + b;

//     }

//     public static void main(String[] args) {
//         fibonacci fb = new fibonacci();
//         System.out.print("10th fibonacci number is: " + fb.fibo(10) + " ");
//     }
// }


// public class fibonacci {
//     public void printFibo(int n) {
//         int a = 0;
//         int b = 1;

//         System.out.print(a + " " + b + " ");

//         for (int i = 2; i <= n; i++) {
//             int next = a + b;
//             System.out.print(next + " ");
//             a = b;
//             b = next;
//         }
//     }

//     public static void main(String[] args) {
//         fibonacci fb = new fibonacci();
//         System.out.print("10th fibonacci number is: ");
//         fb.printFibo(10);
//     }
// }


// USING DP (BO-UP approach)
// public class fibonacci{
//     public int fibo(int n){
//         // int[] table = new int[n + 1];
//         table[0] = 0;
//         table[1] = 1;

//         for (int i = 2; i <= n; i++) {
//             table[i] = table[i - 1] + table[i - 2];
//         }
//         return table[n];
//     }

//     public static void main(String[] args){
//         fibonacci fb = new fibonacci();
//         System.out.println(fb.fibo(10));
//     }
// }

//USING DP (TO-DO approach)
// public class fibonacci {
//     public int fibo(int[] memo, int n) {
//         if (memo[n] == 0) {
//             if (n < 2) {
//                 memo[n] = n;
//             } else {
//                 int left = fibo(memo, n - 1);
//                 int right = fibo(memo, n - 2);
//                 memo[n] = left + right;
//             }
//         }
//         return memo[n];
//     }

//     public static void main(String[] args) {
//         fibonacci fb = new fibonacci();
//         int[] memo = new int[11];
//         System.out.println(fb.fibo(memo, 10));
//     }
// }