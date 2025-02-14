import java.util.Stack;

public class SymmetricTree {
    TreeNode root;
    public class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    SymmetricTree(){
        this.root = null;
    }

    boolean isSymmetric(TreeNode root){
        if(root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);
        while (!stack.isEmpty()) {
            TreeNode n1 = stack.pop();
            TreeNode n2 = stack.pop();
            if (n1 == null && n2 == null) {
                continue;
            } 
            if (n1 == null || n2 == null || n1.data != n2.data) {
                return false;
            }
            stack.push(n1.left);
            stack.push(n2.right);
            stack.push(n1.right);
            stack.push(n2.left);
        }
        return true;
    }

    public static void main(String[] args){
        SymmetricTree tree = new SymmetricTree();
        tree.root = tree.new TreeNode(1);
        tree.root.left = tree.new TreeNode(2);
        tree.root.right = tree.new TreeNode(2);
        tree.root.left.left = tree.new TreeNode(3);
        tree.root.left.right = tree.new TreeNode(4);
        tree.root.right.left = tree.new TreeNode(4);
        tree.root.right.right = tree.new TreeNode(3);

        System.out.println(tree.isSymmetric(tree.root));
    }
}


//OWARI DA 14-02-2025