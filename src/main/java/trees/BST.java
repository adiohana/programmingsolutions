package trees;

/**
 * Created by aohana
 */
public class BST {

    private static final int ERROR = -999;

    public static boolean validateBST(TreeNode root) {

        return root == null || root.left() == null && root.right() == null || root.data() >= findMax(root.left()) && root.data() < findMin(root.right());

    }

    private static int findMax(TreeNode root) {

        if (root == null) {
            return ERROR;
        } else if (root.left() == null && root.right() == null) {
            return root.data();
        } else if (root.left() != null && root.right() == null) {
            return Math.max(root.data(), findMax(root.left()));
        } else if (root.right() != null && root.left() == null) {
            return Math.max(root.data(), findMax(root.right()));
        } else {
            return Math.max(Math.max(root.data(), findMax(root.right())), findMax(root.left()));
        }

    }

    private static int findMin(TreeNode root) {

        if (root == null) {
            return ERROR;
        } else if (root.left() == null && root.right() == null) {
            return root.data();
        } else if (root.left() != null && root.right() == null) {
            return Math.min(root.data(), findMin(root.left()));
        } else if (root.right() != null && root.left() == null) {
            return Math.min(root.data(), findMin(root.right()));
        } else {
            return Math.min(Math.min(root.data(), findMin(root.right())), findMin(root.left()));
        }

    }
}
