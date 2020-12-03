import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @since 1.0
 */
public class SerializeAndDeserializeBinaryTree {


    //前序遍历，
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "null";
        }

        return root.val + "," + serialize(root.left) + "," + serialize(root.right);
    }

    //前序还原
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
        return handle(queue);
    }

    private TreeNode handle(Queue<String> queue) {
        String val = queue.poll();
        if (val.equals("null")) {
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(val));

        node.left = handle(queue);
        node.right = handle(queue);
        return node;
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
