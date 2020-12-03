/**
 * @since 1.0
 */
public class ValidateBinarySearchTree {

    public static void main(String[] args) {
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(2, left, right);


        ValidateBinarySearchTree t = new ValidateBinarySearchTree();
        System.out.println(t.isValidBST(root));
    }

    //1。递归走起
    public boolean isValidBST(TreeNode root) {
        return handle(root, null, null);
    }


    private boolean handle(TreeNode node, Integer lower, Integer upper) {
        if (node == null) {
            return true;
        }

        int val = node.val;

        if (lower != null && val <= lower) {
            return false;
        }

        if (upper != null && val >= upper) {
            return false;
        }

        if (!handle(node.right, val, upper)) {
            return false;
        }

        if (!handle(node.left, lower, val)) {
            return false;
        }

        return true;
    }


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
