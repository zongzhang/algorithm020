/**
 * @since 1.0
 */
public class MinimumDepthOfBinaryTree {


    //递归走起
    public int minDepth(TreeNode root) {
        return handle(root);
    }

    public int handle(TreeNode node) {
        return 0;
    }

    private class TreeNode {
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
