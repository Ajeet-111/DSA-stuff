public class searchAKey {
    TreeNode root;

    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public TreeNode search(TreeNode root, int key){
        if (root == null || root.data == key) {
            return root;
        }
        if (key < root.data) {
            return search(root.left, key);
        } else{
            return search(root.right, key);
        }
    }

    public TreeNode search(int key){
        return search(root, key);
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (root.data > value) {
            root.left = insert(root.left, value);
        } else {
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

    public static void main(String[] args) {
        searchAKey sak = new searchAKey();

        sak.insert(10);
        sak.insert(11);
        sak.insert(7);
        sak.insert(9);
        sak.insert(21);
        sak.insert(30);

        // sak.inOrder(sak.root);

        if (null != sak.search(7)) {
            System.out.println("key is Found");
        } else{
            System.out.println("key is not found");
        }
    }
}
