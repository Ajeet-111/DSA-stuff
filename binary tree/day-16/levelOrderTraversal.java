import java.util.*;

public class levelOrderTraversal{
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
        TreeNode first = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);

        root = first;
        first.left = two;
        first.right = three;
        two.left = four;
        two.right = five;
        three.left = six;
    }

    public void treeTraversal(TreeNode root){
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) {
                queue.offer(temp.left);
            } 
            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }
    }
    public static void main(String[] args){
        levelOrderTraversal lt = new levelOrderTraversal();
        lt.createAbinaryTree();
        lt.treeTraversal(lt.root);
    }
}