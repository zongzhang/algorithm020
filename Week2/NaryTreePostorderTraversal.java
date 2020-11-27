import java.util.ArrayList;
import java.util.List;

/**
 * @since 1.0
 */
public class NaryTreePostorderTraversal {


    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        handle(root, res);
        return res;

    }

    public void handle(Node root, List<Integer> res) {
        //第一个叉
        //第二个叉 。。。。
        //自己结点
        if (root == null) {
            return;
        }
        if (root.children != null && root.children.size() != 0) {
            for (Node node : root.children) {
                handle(node, res);
            }
        }
        res.add(root.val);
    }


    // Definition for a Node.
    private class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;
}
