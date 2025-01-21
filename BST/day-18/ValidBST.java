public class ValidBST {
    TreeNode root;

    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public boolean isValid(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.data <= min || root.data >= max) {
            return false;
        }
        boolean left = isValid(root.left, min, root.data);
        if (left) {
            boolean right = isValid(root.right, root.data, max);
            return right;
        }
        return false;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        inOrder(root.left);
        inOrder(root.right);
    }

    public static void main(String[] args) {
        ValidBST vb = new ValidBST();
        vb.insert(5);
        vb.insert(2);
        vb.insert(6);
        vb.insert(1);
        vb.insert(7);

        vb.inOrder(vb.root);
        boolean stuff = vb.isValid(vb.root, Long.MIN_VALUE, Long.MAX_VALUE);
        if (stuff) {
            System.out.println("valid");
        } else {
            System.out.print("inavlid");
        }
    }
}