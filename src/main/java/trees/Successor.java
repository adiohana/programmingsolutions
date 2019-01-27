package trees;

/**
 * Created by aohana
 */
public class Successor {

    public static TreeNode successor(TreeNode node) {

        if (node == null) {
            return null;
        }

        if(node.parent() == null) {
            return null;
        }

        if(node.parent().right() == node && node.data() <= findRoot(node).data()) {
            return findFirstBiggerParent(node);
        } else if (node.parent().right() == node && node.data() > findRoot(node).data()) {
           return findFirstBiggerRight((node));
        }

        if(node.parent().left() == node) {

            TreeNode firstBiggerRight = findFirstBiggerRight(node);
            TreeNode firstBiggerLeft = findFirstBiggerLeft(node);

            if(firstBiggerLeft == null && firstBiggerRight == null) {
                return findFirstBiggerParent(node);
            }

            if(firstBiggerLeft == null) {
                return firstBiggerRight;
            }

            if(firstBiggerRight == null) {
                return firstBiggerLeft;
            }

            if(firstBiggerLeft.data() > firstBiggerRight.data()) {
                return firstBiggerLeft;
            } else {
                return firstBiggerRight;
            }

        }

        return null;

    }

    private static TreeNode findRoot(TreeNode node) {

        TreeNode currentNode = node;

        while(currentNode.parent() != null) {
            currentNode = currentNode.parent();
        }

        return currentNode;

    }

    private static TreeNode findFirstBiggerLeft(TreeNode node) {

        TreeNode currentNode = node;

        while(currentNode != null && currentNode.left() != null) {
            if(currentNode.left().data() <= node.data()) {
                return currentNode.left();
            }
            currentNode = currentNode.left();
        }

        return null;
    }

    private static TreeNode findFirstBiggerRight(TreeNode node) {

        TreeNode currentNode = node;

        while(currentNode != null && currentNode.right() != null) {
            if(currentNode.right().data() > node.data()) {
                return currentNode.right();
            }
            currentNode = currentNode.right();
        }

        return null;
    }

    private static TreeNode findFirstBiggerParent(TreeNode node) {

        TreeNode currentNode = node;

        while(currentNode != null) {
            if(currentNode.data() > node.data()) {
                return currentNode;
            }
            currentNode = currentNode.parent();
        }

        return null;
    }


}
