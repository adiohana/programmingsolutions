package trees;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by aohana
 */
public class TreesTest {

    @Test
    public void testNullTree() {
        assertEquals(true, BalancedTree.checkBalanced(null));
        assertEquals(true, BST.validateBST(null));
    }

    @Test
    public void testRootOnlyTree() {
        assertEquals(true, BalancedTree.checkBalanced(createRootOnlyTree()));
        assertEquals(true, BST.validateBST(createRootOnlyTree()));
    }

    @Test
    public void testLeftOnlyTree() {
        assertEquals(false, BalancedTree.checkBalanced(createLeftOnlyTree()));
    }

    @Test
    public void testRightOnlyTree() {
        assertEquals(false, BalancedTree.checkBalanced(createRightOnlyTree()));
    }

    @Test
    public void testBalancedTree() {
        assertEquals(true, BalancedTree.checkBalanced(createBalancedTree()));
    }

    @Test
    public void testBalancedTreeWithOneMoreLevel() {
        assertEquals(true, BalancedTree.checkBalanced(createBalancedTreeWithOneMoreLevel()));
    }

    @Test
    public void testBST() {
        assertEquals(true, BST.validateBST(createBST(true)));
    }

    @Test
    public void testNotBST() {
        assertEquals(false, BST.validateBST(createBST(false)));
    }

    @Test
    public void testSuccessor1() {

        TreeNode bstRoot = createBST(true);
        TreeNode toVerify = bstRoot.left().right();
        assertEquals(toVerify.data(), Successor.successor(bstRoot.left()).data());
    }

    @Test
    public void testSuccessor2() {

        TreeNode bstRoot = createBST(true);
        assertEquals(bstRoot.data(), Successor.successor(bstRoot.left().right()).data());
    }

    @Test
    public void testSuccessor3() {

        TreeNode bstRoot = createBST(true);
        TreeNode toVerify = bstRoot.left();
        assertEquals(toVerify.data(), Successor.successor(bstRoot.left().left()).data());
    }

    @Test
    public void testSuccessor4() {

        TreeNode bstRoot = createBST(true);
        TreeNode toVerify = bstRoot.right().right();
        assertEquals(toVerify.data(), Successor.successor(bstRoot.right()).data());
    }

    @Test
    public void testSuccessor5() {

        TreeNode bstRoot = createBST(true);
        assertEquals(null, Successor.successor(bstRoot.right().right()));
    }

    @Test
    public void testSuccessor6() {

        TreeNode bstRoot = createBST(true);
        assertEquals(null, Successor.successor(bstRoot));
    }

    private TreeNode createRootOnlyTree() {
        return new TreeNode(20);
    }

    private TreeNode createLeftOnlyTree() {

        TreeNode root = new TreeNode(20);
        TreeNode leftChild = new TreeNode(3);
        TreeNode leftLeftChild = new TreeNode(5);
        TreeNode leftRightChild = new TreeNode(6);
        TreeNode leftRightRightChild = new TreeNode(90);

        root.addLeft(leftChild);
        leftChild.addLeft(leftLeftChild);
        leftChild.addRight(leftRightChild);
        leftRightChild.addRight(leftRightRightChild);

        return root;

    }

    private TreeNode createRightOnlyTree() {

        TreeNode root = new TreeNode(20);
        TreeNode rightChild = new TreeNode(3);
        TreeNode rightRightChild = new TreeNode(5);
        TreeNode rightLeftChild = new TreeNode(6);
        TreeNode rightLeftLeftChild = new TreeNode(90);

        root.addRight(rightChild);
        rightChild.addLeft(rightLeftChild);
        rightChild.addRight(rightRightChild);
        rightLeftChild.addRight(rightLeftLeftChild);

        return root;

    }

    private TreeNode createBalancedTree() {

        TreeNode root = new TreeNode(20);
        TreeNode rightChild = new TreeNode(3);
        TreeNode leftChild = new TreeNode(5);
        TreeNode rightLeftChild = new TreeNode(6);
        TreeNode rightRightChild = new TreeNode(90);
        TreeNode leftLeftChild = new TreeNode(6);
        TreeNode leftRightChild = new TreeNode(90);

        root.addRight(rightChild);
        root.addLeft(leftChild);
        leftChild.addLeft(leftLeftChild);
        leftChild.addRight(leftRightChild);
        rightChild.addRight(rightRightChild);
        rightChild.addLeft(rightLeftChild);

        return root;

    }

    private TreeNode createBalancedTreeWithOneMoreLevel() {

        TreeNode root = createBalancedTree();

        root.left().left().addLeft(new TreeNode(3));

        return root;

    }

    private TreeNode createBST(boolean BST) {
        TreeNode root = new TreeNode(8);
        TreeNode leftChild = new TreeNode(4);
        TreeNode rightChild = new TreeNode(10);
        TreeNode leftLeftChild = new TreeNode(2);
        TreeNode leftRightChild;
        if (BST) {
            leftRightChild = new TreeNode(6);
        } else {
            leftRightChild = new TreeNode(12);
        }
        TreeNode rightRightChild = new TreeNode(20);

        root.addLeft(leftChild);
        root.addRight(rightChild);
        leftChild.addLeft(leftLeftChild);
        leftChild.addRight(leftRightChild);
        rightChild.addRight(rightRightChild);

        //add parents
        leftChild.addParent(root);
        rightChild.addParent(root);
        leftLeftChild.addParent(leftChild);
        leftRightChild.addParent(leftChild);
        rightRightChild.addParent(rightChild);

        return root;

    }

}
