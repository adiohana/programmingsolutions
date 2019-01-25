package trees;

/**
 * Created by aohana
 */
public class BalancedTree {

    public static boolean checkBalanced(TreeNode root) {

        if(root == null) {
            return true;
        }

        if(Math.abs(height(root.left()) - height(root.right())) <= 1) {
            return true;
        } else {
            return false;
        }

    }

    private static int height(TreeNode root) {

        if(root == null) {
            return 0;
        }

        if(root.left() == null && root.right() == null) {
            return 1;
        }

        return Math.max(height(root.left()), height(root.right())) + 1;

    }
}
