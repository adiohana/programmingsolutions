package trees;

/**
 * Created by aohana
 */
public class BST {

    public static boolean validateBST(TreeNode root) {

        if (root == null) {
            return true;
        }

        if (root.left() == null && root.right() == null) {
            return true;
        }

        if (root.data() >= findMax(root.left()) && root.data() < findMin(root.right())) {
            return true;
        } else {
            return false;
        }

    }

    private static int findMax(TreeNode root) {

        if (root == null) {
            return -999;
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
            return -999;
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
