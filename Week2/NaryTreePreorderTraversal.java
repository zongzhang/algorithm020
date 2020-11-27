import java.util.ArrayList;
import java.util.List;

/**
 * n叉前序遍历
 * @since 1.0
 */
public class NaryTreePreorderTraversal {

    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        order(root, res);
        return res;
    }

    public void order(Node root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        for (Node node : root.children) {
            order(node, res);
        }
    }

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
