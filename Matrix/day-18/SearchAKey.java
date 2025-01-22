//The n x n Matrix is has sorted rows and columns.

public class SearchAKey {
    public void search(int[][] matrix, int key) {
        int n = matrix.length;
        int i = 0, j = n - 1;
        //in case of m x n matrix, j = matrix[0].length - 1;
        while (i < n && j >= 0) {
            if (matrix[i][j] == key) {
                System.out.println("the key is found at: " + i + " , " + j);
                return;
            }
            if (matrix[i][j] > key) {
                j--;
            } else {
                i++;
            }
        }

        System.out.println("value not found");
    }

    public static void main(String[] args) {
        int[][] matrix = { { 10, 20, 30 }, { 15, 25, 35 }, { 27, 29, 37, 48 } };
        SearchAKey sk = new SearchAKey();
        sk.search(matrix, 69);
    }
}