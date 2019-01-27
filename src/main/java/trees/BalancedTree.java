package trees;

/**
 * Created by aohana
 */
public class BalancedTree {

    public static boolean checkBalanced(TreeNode root) {

        return root == null || Math.abs(height(root.left()) - height(root.right())) <= 1;

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
