import java.util.LinkedList;
import java.util.Queue;

public class MaxVal {
    TreeNode root;

    class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void createAbinaryTree(){
        TreeNode first = new TreeNode(4);
        TreeNode two = new TreeNode(3);
        TreeNode three = new TreeNode(7);
        TreeNode four = new TreeNode(5);
        TreeNode five = new TreeNode(8);

        root = first;
        first.left = two;
        first.right = three;
        two.left = four;
        two.right = five;
    }

    //recursive
    public int maxNode(TreeNode root){
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left = maxNode(root.left);
        int right = maxNode(root.right);

        result = Math.max(Math.max(left, right), result);
        return result;
    }

    //non-recursive
    public int nodeMax(TreeNode root){
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int max = root.data;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            max = Math.max(max, temp.data);

            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }
        return max;
    }
    public static void main(String[] args){
        MaxVal mv = new MaxVal();
        mv.createAbinaryTree();
        // int maxNode = mv.maxNode(mv.root);
        int nodeMax = mv.nodeMax(mv.root);
        System.out.println(nodeMax);
    }
}
