/**
 * @since 1.0
 */
public class MinimumDepthOfBinaryTree {


    //递归走起 广度优先？深度优先？
    public int minDepth(TreeNode root) {
        return handle(root);
    }

    public int handle(TreeNode node) {
        if (node == null) {
            return 1;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }

        int min_depth = Integer.MAX_VALUE;
        if (node.left != null) {
            min_depth = Math.min(minDepth(node.left), min_depth);
        }
        if (node.right != null) {
            min_depth = Math.min(minDepth(node.right), min_depth);
        }
        return min_depth + 1;
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
