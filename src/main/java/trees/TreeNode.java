package trees;

/**
 * Created by aohana
 */
public class TreeNode {

    private int data;
    private TreeNode[] children;
    private TreeNode parent;

    TreeNode(int data) {
        this.data = data;
        children = new TreeNode[2];
        parent = null;
    }

    public void addLeft(TreeNode leftChild) {
        children[0] = leftChild;
    }

    public void addRight(TreeNode rightChild) {
      children[1] = rightChild;
    }

    public TreeNode left() {
        return children[0];
    }

    public TreeNode right() {
        return children[1];
    }

    public int data() {
        return data;
    }

    public TreeNode parent() {
        return parent;
    }

    public void addParent(TreeNode parent) {
        this.parent = parent;
    }
}
