public class validity {
    private TreeNode root;

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


    public void insert(int value){
        root = insert(root, value);
    }

    public TreeNode insert(TreeNode root, int value){
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (root.data > value) {
            root.left = insert(root.left, value);
        }
        else{
            root.right = insert(root.right, value);
        }

        return root;
    }

    public void inOrder(){
        inOrder(root);
    }

    public void inOrder(TreeNode root){
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args){
        validity vb = new validity();

        vb.insert(10);
        vb.insert(11);
        vb.insert(7);
        vb.insert(9);
        vb.insert(21);
        vb.insert(30);

        vb.inOrder(vb.root);
    }
}
