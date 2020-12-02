/**
 * 翻转二叉树
 *
 * @since 1.0
 */
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);


        root.right = left;
        root.left = right;

        return root;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
