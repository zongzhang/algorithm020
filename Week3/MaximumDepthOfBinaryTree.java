/**
 * @since 1.0
 */
public class MaximumDepthOfBinaryTree {


    //递归走起  max(l,r) + 1
    public int maxDepth(TreeNode root) {
        return handle(root) + 1;
    }


    private int handle(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = handle(node.left);
        int right = handle(node.right);

        return Math.max(left, right) + 1;
    }


    public class TreeNode {
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
